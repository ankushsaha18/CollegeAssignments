"""Text validation and transformer-backed abstractive summarization."""
from __future__ import annotations

import re
from time import perf_counter
from typing import Any

MODEL_ID = "sshleifer/distilbart-cnn-12-6"
MIN_INPUT_WORDS = 30


def word_count(text: str) -> int:
    """Count word-like tokens consistently for validation and results."""
    return len(re.findall(r"\b[\w'-]+\b", text))


def validate_input(text: str, min_length: int, max_length: int) -> str:
    """Normalize and validate a document plus requested summary bounds."""
    if not isinstance(text, str) or not text.strip():
        raise ValueError("Enter a document to summarize.")
    if type(min_length) is not int or type(max_length) is not int:
        raise ValueError("Summary lengths must be whole numbers.")
    if not 10 <= min_length <= 150:
        raise ValueError("Minimum length must be from 10 to 150 tokens.")
    if not 20 <= max_length <= 300:
        raise ValueError("Maximum length must be from 20 to 300 tokens.")
    if min_length >= max_length:
        raise ValueError("Maximum length must be greater than minimum length.")

    text = " ".join(text.split())
    if word_count(text) < MIN_INPUT_WORDS:
        raise ValueError(f"Enter at least {MIN_INPUT_WORDS} words for a useful summary.")
    return text


class TextSummarizer:
    """Load a Hugging Face summarization pipeline only when it is first needed."""

    def __init__(self, *, device: int = -1, revision: str | None = None):
        self.device = device
        self.revision = revision
        self._pipeline: Any = None

    def load(self) -> None:
        if self._pipeline is None:
            from transformers import pipeline

            kwargs = {"revision": self.revision} if self.revision else {}
            self._pipeline = pipeline(
                "summarization", model=MODEL_ID, tokenizer=MODEL_ID, device=self.device, **kwargs
            )

    def summarize(self, text: str, min_length: int = 40, max_length: int = 120) -> dict:
        text = validate_input(text, min_length, max_length)
        self.load()
        tokenizer = self._pipeline.tokenizer
        token_count = len(tokenizer(text, truncation=False)["input_ids"])
        if token_count > tokenizer.model_max_length:
            raise ValueError(
                f"The document has {token_count} tokens, exceeding this model's {tokenizer.model_max_length}-token limit."
            )

        started = perf_counter()
        output = self._pipeline(text, min_length=min_length, max_length=max_length, do_sample=False)
        summary = output[0]["summary_text"].strip()
        summary_words = word_count(summary)
        return {
            "input": text,
            "summary": summary,
            "input_word_count": word_count(text),
            "summary_word_count": summary_words,
            "compression_ratio": round(summary_words / word_count(text), 3),
            "min_length": min_length,
            "max_length": max_length,
            "model": MODEL_ID,
            "revision": self.revision or getattr(self._pipeline.model.config, "_commit_hash", None),
            "inference_seconds": round(perf_counter() - started, 4),
        }
