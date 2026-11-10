"""Interface checks use a controlled backend and do not download DistilBART."""
import unittest
from pathlib import Path
from unittest.mock import patch


DOCUMENT = " ".join(["This is a sufficiently long document for the interface test."] * 5)


class DemoSummarizer:
    def summarize(self, text, min_length, max_length):
        return {
            "summary": "A concise interface test summary.",
            "input_word_count": 50,
            "summary_word_count": 5,
            "compression_ratio": 0.1,
            "model": "interface-test-double",
        }


class InterfaceTests(unittest.TestCase):
    def setUp(self):
        import streamlit as st

        st.cache_resource.clear()

    def test_form_result_and_download(self):
        from streamlit.testing.v1 import AppTest

        with patch("summarizer.TextSummarizer", DemoSummarizer):
            app = AppTest.from_file(str(Path(__file__).parents[1] / "app.py")).run()
            app.text_area[0].set_value(DOCUMENT)
            app.button[0].click().run()
            self.assertFalse(app.exception)
            self.assertEqual(app.subheader[0].value, "Summary")
            self.assertEqual(len(app.metric), 3)
            self.assertEqual(len(app.download_button), 1)

    def test_short_document_shows_error(self):
        from streamlit.testing.v1 import AppTest

        app = AppTest.from_file(str(Path(__file__).parents[1] / "app.py")).run()
        app.text_area[0].set_value("This is too short.")
        app.button[0].click().run()
        self.assertFalse(app.exception)
        self.assertIn("at least", app.error[0].value)


if __name__ == "__main__":
    unittest.main()
