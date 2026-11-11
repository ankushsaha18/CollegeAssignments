"""OpenAI Models — an educational model explorer and prompt lab."""
from __future__ import annotations

import os
from typing import Any

import streamlit as st

st.set_page_config(page_title="OpenAI Models | Model Lab", page_icon="◉", layout="wide")

MODELS = {
    "GPT-3.5 (legacy generation)": {
        "id": "gpt-3.5-turbo",
        "summary": "A widely used conversational model family that made capable, low-latency chat applications accessible.",
        "best_for": "Learning the chat-completion pattern and understanding earlier API-era applications.",
        "caveat": "Legacy model family. Access and exact model aliases may change; check your API account before use.",
    },
    "GPT-4 (legacy generation)": {
        "id": "gpt-4",
        "summary": "A more capable generation designed for complex instructions, reasoning, and nuanced language tasks.",
        "best_for": "Studying how capability, instruction following, and cost/latency trade-offs changed across generations.",
        "caveat": "A family name, not a guarantee of a specific snapshot or current account access.",
    },
    "GPT-4o (multimodal generation)": {
        "id": "gpt-4o",
        "summary": "A model generation designed for text, image, and audio capabilities in a unified model family.",
        "best_for": "Exploring multimodal use cases where supported by the selected API endpoint.",
        "caveat": "Features depend on the exact model and endpoint. Verify current documentation.",
    },
}

st.markdown("""
<style>
@import url('https://fonts.googleapis.com/css2?family=DM+Mono:wght@400;500&family=Manrope:wght@400;500;600;700;800&display=swap');
:root { --ink:#18261f; --muted:#68756e; --paper:#f6f7f2; --line:#dce2da; --green:#b8f36b; }
html, body, [class*="css"] { font-family: 'Manrope', sans-serif; }
.stApp { background:var(--paper); color:var(--ink); }
.block-container { max-width:1180px; padding-top:2rem; padding-bottom:4rem; }
.eyebrow { font:500 11px 'DM Mono',monospace; letter-spacing:.16em; text-transform:uppercase; color:#506257; }
.hero { background:#17251e; color:#f5f7ef; border-radius:22px; padding:48px 52px; position:relative; overflow:hidden; }
.hero:after { content:'◉'; position:absolute; font-size:280px; right:4%; top:-88px; color:#b8f36b; opacity:.09; }
.hero h1 { font-size:clamp(42px,6vw,72px); line-height:1; letter-spacing:-.065em; margin:16px 0; max-width:720px; }
.hero p { color:#c3cec5; font-size:17px; max-width:620px; line-height:1.65; }
.pill { display:inline-block; border:1px solid #46584b; padding:7px 11px; border-radius:99px; color:#d8e6d7; font:11px 'DM Mono',monospace; margin-right:6px; }
.section-title { font-size:27px; letter-spacing:-.04em; margin:34px 0 6px; }
.note { border-left:3px solid #a7df5e; padding:9px 14px; color:#536057; background:#edf2e8; border-radius:0 8px 8px 0; }
[data-testid="stMetric"] { background:white; padding:16px 18px; border:1px solid var(--line); border-radius:14px; }
[data-testid="stMetricValue"] { letter-spacing:-.05em; }
.stTabs [data-baseweb="tab-list"] { gap:8px; }
.stTabs [data-baseweb="tab"] { border-radius:999px; padding:8px 16px; }
footer { visibility:hidden; }
</style>
""", unsafe_allow_html=True)

st.markdown('''<div class="hero">
<div class="eyebrow">A practical guide to language models</div>
<h1>OpenAI<br>Models</h1>
<p>Explore how GPT models turn context into useful language. Compare generations, shape a prompt, and try a live model when you have an API key.</p>
<span class="pill">GPT-3.5</span><span class="pill">GPT-4</span><span class="pill">PROMPT LAB</span>
</div>''', unsafe_allow_html=True)

st.markdown('<div class="section-title">The model, in one minute</div>', unsafe_allow_html=True)
st.write("A language model estimates what text should come next given the input it has received. GPT models are trained on large collections of data and then tuned to follow instructions and produce helpful responses. They can draft, explain, summarize, transform, and reason over text—but their fluency is not proof that a claim is true.")

cols = st.columns(3)
for col, (label, data) in zip(cols, MODELS.items()):
    with col:
        st.metric(label.split(" (")[0], data["id"])
        st.write(data["summary"])

st.markdown('<div class="section-title">Explore the topic</div>', unsafe_allow_html=True)
tab_overview, tab_compare, tab_prompt, tab_chat = st.tabs(["How it works", "Compare generations", "Prompt lab", "Live chat"])

with tab_overview:
    left, right = st.columns([1.1, .9], gap="large")
    with left:
        st.subheader("From prompt to response")
        st.write("Your application sends instructions and conversation context to a model. The model processes that context as tokens, then generates an output token by token. The application decides what context to include, how to display the result, and whether to ask the model again.")
        st.code('''system: You are a concise study assistant.\nuser: Explain photosynthesis for a 10-year-old.\n\n        ↓ context + instructions\n        ↓ model inference\n\nassistant: Plants use sunlight to turn water and\nair into the food they need to grow.''', language="text")
    with right:
        st.subheader("Useful concepts")
        with st.expander("Tokens"):
            st.write("Tokens are chunks of text—whole words, word parts, punctuation, or spaces. Token counts affect context capacity and, depending on the model and service, usage costs.")
        with st.expander("Context window"):
            st.write("The context window is the amount of input and generated content a model can consider in one interaction. Limits vary by model and can change over time.")
        with st.expander("Training vs. inference"):
            st.write("Training adjusts model parameters using data. Inference is the act of using an already-trained model to generate an answer. A normal API prompt does not retrain the model.")
        with st.expander("Why can answers be wrong?"):
            st.write("A model generates likely continuations, not guaranteed facts. It can confidently produce unsupported details, reflect gaps or biases in data, or misunderstand ambiguous instructions. Verify important claims.")

with tab_compare:
    st.subheader("A generation-level comparison")
    st.caption("This is a conceptual overview, not a benchmark. Exact behavior depends on model snapshot, prompt, endpoint, and account access.")
    st.dataframe([
        {"Generation": "GPT-3.5", "What it represents": "Earlier general-purpose chat models", "Good study lens": "Accessible conversational applications", "Keep in mind": "Legacy family; availability may vary"},
        {"Generation": "GPT-4", "What it represents": "A more capable GPT generation", "Good study lens": "Complex instructions and nuanced tasks", "Keep in mind": "Model ID and capabilities depend on snapshot"},
        {"Generation": "GPT-4o", "What it represents": "A later multimodal GPT generation", "Good study lens": "Text and supported multimodal workflows", "Keep in mind": "Check endpoint-specific feature support"},
    ], hide_index=True, use_container_width=True)
    st.markdown('<div class="note">For a real project, choose a currently supported model from the official model catalog. Names in this learning comparison are not promises of API access.</div>', unsafe_allow_html=True)
    st.markdown("\n**A useful evaluation habit:** give each model the same prompt and examples, define what a good answer means before comparing, and record latency, cost, and errors alongside quality.")



def get_api_key() -> str | None:
    try:
        return st.secrets.get("OPENAI_API_KEY") or os.getenv("OPENAI_API_KEY")
    except Exception:
        return os.getenv("OPENAI_API_KEY")


def extract_text(response: Any) -> str:
    text = getattr(response, "output_text", None)
    if text:
        return text
    # Fallback for SDK response variants.
    fragments: list[str] = []
    for item in getattr(response, "output", []) or []:
        for part in getattr(item, "content", []) or []:
            if getattr(part, "type", "") == "output_text":
                fragments.append(getattr(part, "text", ""))
    return "\n".join(fragments).strip()

with tab_prompt:
    st.subheader("Build a clearer prompt")
    st.write("A useful prompt states the task, gives necessary context, and describes the desired output. Add examples or constraints when they help.")
    task = st.text_input("Task", "Explain a difficult idea")
    context = st.text_area("Context", "The reader is new to neural networks.")
    format_choice = st.selectbox("Output format", ["A short explanation", "A numbered list", "A table", "A worked example"])
    tone = st.selectbox("Tone", ["Clear and friendly", "Formal", "For a curious beginner", "Concise and direct"])
    assembled = f"Task: {task.strip() or '[describe the task]'}\nContext: {context.strip() or '[add relevant context]'}\nTone: {tone}\nOutput format: {format_choice}\nIf information is missing, state your assumptions."
    prompt_model = st.text_input("API model ID", "gpt-6.1-terra", key="prompt_model_id")
    build_col, run_col = st.columns([1, 1])
    with build_col:
        assemble_clicked = st.button("Assemble prompt", type="secondary", key="assemble_prompt")
    with run_col:
        generate_clicked = st.button("Generate answer", type="primary", key="run_prompt")
    if assemble_clicked:
        st.code(assembled, language="text")
    st.caption("The assembled prompt is sent to the model when you choose Generate answer. Never include secrets or sensitive personal data.")
    if generate_clicked:
        if not get_api_key():
            st.error("API key not found. Add OPENAI_API_KEY to your environment or Streamlit secrets.")
        elif not prompt_model.strip():
            st.warning("Enter an API model ID.")
        else:
            try:
                from openai import OpenAI
                client = OpenAI(api_key=get_api_key())
                with st.spinner(f"Asking {prompt_model.strip()}…"):
                    response = client.responses.create(
                        model=prompt_model.strip(),
                        instructions="You are a helpful assistant. Follow the requested tone and output format.",
                        input=assembled,
                    )
                st.markdown("**Model response**")
                st.write(extract_text(response) or "The API returned no text output.")
            except ImportError as exc:
                if exc.name == "openai":
                    st.error("The OpenAI Python package is not installed in this app environment.")
                    st.info("Install dependencies with `python -m pip install -r requirements.txt`, then restart or redeploy Streamlit.")
                else:
                    st.error(f"A required Python package is missing: {exc.name or exc}")
            except Exception as exc:
                error_text = str(exc)
                if "model_not_found" in error_text or "does not exist or you do not have access" in error_text:
                    st.error(f"Model '{prompt_model.strip()}' is unavailable to this API project. Choose a model enabled for the project.")
                else:
                    st.error(f"Request failed: {error_text}")

with tab_chat:
    st.subheader("Try a model")
    st.caption("Sends your prompt to the OpenAI API. Your key stays in the local environment or Streamlit secrets.")
    live_models = {
        "GPT-6.1 Terra (current general-purpose default)": "gpt-6.1-terra",
        **{name: details["id"] for name, details in MODELS.items()},
    }
    model_label = st.selectbox("Model family", list(live_models.keys()), key="chat_model")
    model_id = st.text_input(
        "API model ID",
        value=live_models[model_label],
        key=f"api_model_id_{model_label}",
        help="The default is a currently listed model. Change it to any model ID enabled for your API account.",
    )
    system_prompt = st.text_area("Instructions", "You are a helpful assistant. Be clear, accurate, and concise.")
    user_prompt = st.text_area("Your message", placeholder="Ask a question or give the model a task…", height=120)
    if st.button("Generate response", type="primary", key="generate"):
        if not user_prompt.strip():
            st.warning("Enter a message first.")
        elif not model_id.strip():
            st.warning("Enter an API model ID.")
        elif not get_api_key():
            st.error("API key not found. Add OPENAI_API_KEY to your environment or .streamlit/secrets.toml. See README for setup.")
        else:
            try:
                from openai import OpenAI
                client = OpenAI(api_key=get_api_key())
                with st.spinner(f"Asking {model_id.strip()}…"):
                    response = client.responses.create(
                        model=model_id.strip(),
                        instructions=system_prompt.strip() or "You are a helpful assistant.",
                        input=user_prompt.strip(),
                    )
                answer = extract_text(response)
                st.markdown("**Response**")
                st.write(answer or "The API returned no text output.")
                st.caption(f"Model: {getattr(response, 'model', model_id)} · Response ID: {getattr(response, 'id', 'not provided')}")
            except ImportError as exc:
                if exc.name == "openai":
                    st.error("The OpenAI Python package is not installed in this app environment.")
                    st.info("Install the project dependencies with `python -m pip install -r requirements.txt`, then restart or redeploy the Streamlit app.")
                else:
                    st.error(f"A required Python package is missing: {exc.name or exc}")
            except Exception as exc:
                error_text = str(exc)
                if "model_not_found" in error_text or "does not exist or you do not have access" in error_text:
                    st.error(f"Model '{model_id.strip()}' is unavailable to this API project.")
                    st.info("Use the default GPT-6.1 Terra model or choose a model enabled for your project. Confirm the model ID in the OpenAI model catalog and check that the API key belongs to the intended project.")
                else:
                    st.error(f"Request failed: {error_text}")
                    st.caption("Check the API key, project access, usage limits, and current OpenAI API documentation.")

st.divider()
st.markdown("**OpenAI Models · Learning project**  \\\nModel availability and API details can change; see the [OpenAI model guide](https://platform.openai.com/docs/models) and [Responses API guide](https://platform.openai.com/docs/guides/text?api-mode=responses).")
