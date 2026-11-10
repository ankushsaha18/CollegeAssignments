"""Command-line entry point: python cli.py --help."""
import argparse
import json
import sys
from pathlib import Path

from summarizer import TextSummarizer


def main() -> int:
    parser = argparse.ArgumentParser(description="Generate an abstractive summary of an English document.")
    parser.add_argument("text", help="Document to summarize, enclosed in quotes")
    parser.add_argument("--min-length", type=int, default=40)
    parser.add_argument("--max-length", type=int, default=120)
    parser.add_argument("--device", type=int, default=-1, help="-1 for CPU; 0 for the first CUDA GPU")
    parser.add_argument("--revision", help="Optional Hugging Face model commit SHA")
    parser.add_argument("--output", type=Path, help="Optional JSON output path")
    args = parser.parse_args()
    try:
        result = TextSummarizer(device=args.device, revision=args.revision).summarize(
            args.text, args.min_length, args.max_length
        )
    except (ValueError, OSError, RuntimeError) as error:
        print(f"Error: {error}", file=sys.stderr)
        return 1

    output = json.dumps(result, indent=2)
    print(output)
    if args.output:
        args.output.write_text(output + "\n", encoding="utf-8")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
