# Text Summarizer

A college NLP project that generates concise abstractive summaries of longer English documents. It uses a pretrained DistilBART model through Hugging Face Transformers and offers both a Streamlit interface and command-line usage.

## Features

- Browser interface for pasting a document and selecting summary length.
- Transformer-based abstractive summaries, plus word-count and compression statistics.
- JSON download and a command-line interface.
- Input validation for document size and summary bounds.
- Unit tests using a controlled model backend, so tests do not download model weights.

## Setup

Python 3.11 or newer is recommended.

```bash
python -m venv .venv
source .venv/bin/activate
python -m pip install -r requirements.txt
```

The first summary downloads the pretrained model. Internet access, several GB of free disk space, and enough system memory are required. Model weights are not committed to this repository.

## Run the interface

```bash
streamlit run app.py
```

Open the local URL printed by Streamlit, paste a document with at least 30 words, choose minimum and maximum summary lengths, then select **Generate summary**.

## Command line

```bash
python cli.py "Paste a longer document here..." --min-length 40 --max-length 120
python cli.py "Paste a longer document here..." --output result.json
```

## Tests

```bash
python -m unittest discover -s tests -v
```

## Example evaluation

`examples/evaluation_set.json` contains fixed source documents and reference summaries for a small classroom demonstration. Run the following after the model has been downloaded:

```bash
python evaluate.py
```

The script writes generated summaries and simple word-count statistics to `results/evaluation_results.json`. This is a demonstration set rather than a benchmark: generated summaries can be correct even when their wording differs from the reference text.

## Method and limitations

The application uses `sshleifer/distilbart-cnn-12-6`, a DistilBART model trained for abstractive summarization. Rather than selecting only original sentences, it generates a new concise representation of the source document. Generated text can omit important details, introduce inaccuracies, or reflect bias in training data. Users should review summaries before relying on them for factual, academic, medical, legal, or high-stakes decisions.

## Project structure

```text
app.py                 Streamlit interface
summarizer.py          Validation and model inference
cli.py                 Command-line interface
tests/                 Dependency-free unit tests
examples/              Fixed input documents and reference summaries
results/               Locally generated evaluation output
evaluate.py            Demonstration evaluation script
requirements.txt       Application dependencies
```
