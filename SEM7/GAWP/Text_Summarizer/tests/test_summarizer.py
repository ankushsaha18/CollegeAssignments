import unittest
from types import SimpleNamespace

from summarizer import TextSummarizer, validate_input


DOCUMENT = " ".join(["This is a sufficiently long document for testing the summarization interface."] * 5)


class Tokenizer:
    model_max_length = 1024

    def __call__(self, text, truncation=False):
        return {"input_ids": list(range(len(text.split())))}


class Pipeline:
    def __init__(self):
        self.tokenizer = Tokenizer()
        self.model = SimpleNamespace(config=SimpleNamespace(_commit_hash="test-revision"))

    def __call__(self, text, min_length, max_length, do_sample):
        return [{"summary_text": "A concise generated test summary."}]


class InputTests(unittest.TestCase):
    def test_normalization(self):
        self.assertEqual(validate_input(" " + DOCUMENT + " ", 40, 120), DOCUMENT)

    def test_invalid_input(self):
        invalid = [("", 40, 120), ("too short", 40, 120), (DOCUMENT, 120, 40), (DOCUMENT, True, 120)]
        for text, minimum, maximum in invalid:
            with self.subTest(text=text, minimum=minimum, maximum=maximum):
                with self.assertRaises(ValueError):
                    validate_input(text, minimum, maximum)


class SummarizationContractTests(unittest.TestCase):
    def setUp(self):
        self.summarizer = TextSummarizer()
        self.summarizer._pipeline = Pipeline()

    def test_output_contract(self):
        result = self.summarizer.summarize(DOCUMENT, 40, 120)
        self.assertEqual(result["summary"], "A concise generated test summary.")
        self.assertEqual(result["revision"], "test-revision")
        self.assertLess(result["compression_ratio"], 1)

    def test_long_input_rejected(self):
        self.summarizer._pipeline.tokenizer.model_max_length = 20
        with self.assertRaises(ValueError):
            self.summarizer.summarize(DOCUMENT, 40, 120)


if __name__ == "__main__":
    unittest.main()
