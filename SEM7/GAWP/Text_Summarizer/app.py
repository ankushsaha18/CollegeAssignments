"""Streamlit interface for generating concise document summaries."""
import json

import streamlit as st

from summarizer import TextSummarizer, validate_input

st.set_page_config(page_title="Text Summarizer", page_icon="TS", layout="centered")


@st.cache_resource
def get_summarizer() -> TextSummarizer:
    return TextSummarizer()


SAMPLE_TEXT = """Artificial intelligence is becoming increasingly important in modern society. It helps businesses automate repetitive tasks, analyze large datasets, and support better decision making. In healthcare, AI can assist doctors by identifying patterns in medical images and predicting possible risks. In education, adaptive systems can provide learning material suited to a student's progress. However, AI systems must be developed responsibly. Training data can contain bias, and automated decisions may affect people unfairly when they are not carefully reviewed. Researchers, governments, and companies are therefore working on transparency, privacy, and accountability standards. Used thoughtfully, AI can complement human expertise and help solve complex problems."""

st.title("Text Summarizer")
st.write("Generate a concise abstractive summary from a longer English document.")

with st.form("summarization"):
    text = st.text_area("Document", SAMPLE_TEXT, height=260, placeholder="Paste a document with at least 30 words.")
    left, right = st.columns(2)
    min_length = left.slider("Minimum summary length", 10, 150, 40)
    max_length = right.slider("Maximum summary length", 20, 300, 120)
    submitted = st.form_submit_button("Generate summary", type="primary")

if submitted:
    try:
        validate_input(text, min_length, max_length)
        with st.spinner("Writing summary. The first run downloads the model."):
            st.session_state["result"] = get_summarizer().summarize(text, min_length, max_length)
    except (ValueError, OSError, RuntimeError) as error:
        st.session_state.pop("result", None)
        st.error(str(error))

if "result" in st.session_state:
    result = st.session_state["result"]
    st.subheader("Summary")
    st.write(result["summary"])
    first, second, third = st.columns(3)
    first.metric("Original words", result["input_word_count"])
    second.metric("Summary words", result["summary_word_count"])
    third.metric("Compression", f"{result['compression_ratio']:.1%}")
    st.download_button(
        "Download result as JSON",
        json.dumps(result, indent=2),
        "summary_result.json",
        "application/json",
    )
    with st.expander("Model details"):
        st.write("The model generates new wording based on the document. Review its output before using it as a factual source.")
        st.code(result["model"])
