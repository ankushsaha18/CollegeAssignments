
import json
from pathlib import Path

from summarizer import TextSummarizer

ROOT = Path(__file__).parent
INPUT_FILE = ROOT / "examples" / "evaluation_set.json"
OUTPUT_FILE = ROOT / "results" / "evaluation_results.json"


def main() -> None:
    examples = json.loads(INPUT_FILE.read_text(encoding="utf-8"))
    summarizer = TextSummarizer()
    results = []
    for item in examples:
        result = summarizer.summarize(item["document"])
        results.append(
            {
                "id": item["id"],
                "reference_summary": item["reference_summary"],
                "generated_summary": result["summary"],
                "input_word_count": result["input_word_count"],
                "summary_word_count": result["summary_word_count"],
                "compression_ratio": result["compression_ratio"],
                "inference_seconds": result["inference_seconds"],
            }
        )

    OUTPUT_FILE.parent.mkdir(exist_ok=True)
    OUTPUT_FILE.write_text(json.dumps(results, indent=2) + "\n", encoding="utf-8")
    print(f"Wrote {len(results)} results to {OUTPUT_FILE.relative_to(ROOT)}")


if __name__ == "__main__":
    main()
