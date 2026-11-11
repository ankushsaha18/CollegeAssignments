# OpenAI Models

An educational Streamlit project about OpenAI language models. It introduces the basic generation flow, compares GPT-3.5, GPT-4, and GPT-4o at a high level, provides a prompt builder, and includes an optional live chat using the OpenAI Responses API.

## Features

- Topic guide covering tokens, context, inference, and model limitations.
- Conceptual comparison of GPT generations, with legacy/API availability caveats.
- Prompt lab assembles a prompt and can send it to the selected API model for an answer.
- Optional API chat with editable model ID and system instructions.
- API key read from `OPENAI_API_KEY` or Streamlit secrets; no key is stored in source.

## Setup

Python 3.10 or newer is recommended.

```bash
python -m venv .venv
source .venv/bin/activate       # Windows: .venv\Scripts\activate
python -m pip install -r requirements.txt
streamlit run app.py
```

Open the local URL printed by Streamlit. The learning pages and prompt assembly work without an API key; generating a model answer requires the API key and installed dependencies. If live chat reports `No module named 'openai'`, install dependencies with `python -m pip install -r requirements.txt` and restart Streamlit. For a hosted deployment, make sure the root `requirements.txt` is included in the deployed repository and trigger a rebuild after changing it.

## Enable live chat

Set an API key in your shell before starting Streamlit:

```bash
export OPENAI_API_KEY="your-api-key"       # macOS/Linux
# PowerShell: $env:OPENAI_API_KEY="your-api-key"
streamlit run app.py
```

Or create `.streamlit/secrets.toml` locally (ignored by Git). For Streamlit Community Cloud, add the same `OPENAI_API_KEY` under the app’s **Settings → Secrets** instead:

```toml
OPENAI_API_KEY = "your-api-key"
```

The API model field defaults to `gpt-6.1-terra`, currently listed in the model catalog. GPT-3.5 and GPT-4 remain in the learning comparison, but legacy IDs may be unavailable to your project. Change the ID to another model enabled for your account using the current [OpenAI model catalog](https://platform.openai.com/docs/models). Live chat calls the [Responses API](https://platform.openai.com/docs/guides/text?api-mode=responses); API usage may incur charges.

## Project structure

```text
app.py                 Streamlit guide, prompt lab, and optional API client
requirements.txt        Python dependencies
.streamlit/config.toml  App theme
examples/               Prompt examples
reports/                Project report
```

## Limitations

- The generation comparison is educational, not a benchmark or model ranking.
- Model names, access, capabilities, and API behavior may change; verify current documentation.
- Language models can produce plausible but incorrect output. Verify important information.
- The live chat sends entered prompts to the OpenAI API. Do not enter secrets or sensitive personal data.
- This project does not implement training, fine-tuning, or a local model.

## References

- [OpenAI API models](https://platform.openai.com/docs/models)
- [OpenAI text generation and Responses API](https://platform.openai.com/docs/guides/text?api-mode=responses)
- [OpenAI API pricing](https://openai.com/api/pricing/) (check current rates before use)
