# OpenAI Models: Language Models from OpenAI

## Abstract

This project introduces OpenAI language models through an interactive learning application. It covers the basic idea of next-token generation, prompt construction, model generations including GPT-3.5 and GPT-4, and practical limitations. A Streamlit interface provides conceptual material and an optional live chat using the OpenAI Responses API. The chat model ID is editable because API availability changes over time and differs across accounts.

## 1. Introduction

Large language models (LLMs) learn statistical patterns from text and generate responses conditioned on supplied context. OpenAI's GPT model families are used for tasks such as drafting, explanation, summarization, coding assistance, and structured transformations. This project presents the topic at an introductory level and gives learners a small prompt experiment they can run.

## 2. Objectives

- Explain tokens, context, prompting, training, and inference in accessible language.
- Present GPT-3.5 and GPT-4 as model generations, while recognizing that product aliases and API access evolve.
- Demonstrate how prompt instructions can specify a task, audience, tone, and output structure.
- Offer an optional, small API client that learners can use with their own authorized API key.
- Encourage evaluation and verification instead of treating fluency as evidence of correctness.

## 3. Background

A language model processes tokenized input and estimates a distribution over possible next tokens. Text generation repeatedly selects or samples tokens and appends them to the context until it reaches a stopping condition. In a chat application, messages and instructions establish context and intended behavior. The API application supplies that context and receives generated output.

GPT-3.5 and GPT-4 are useful examples of successive OpenAI model generations. A family label is not a complete technical specification: capabilities, context limits, supported modalities, latency, pricing, and access are tied to the exact model and service interface. Therefore the project avoids fixed performance rankings and directs users to the maintained model catalog for current model IDs.

## 4. Design and implementation

The application has four learning areas:

1. **How it works** explains inference and key terms.
2. **Compare generations** gives a qualitative, non-benchmark comparison of GPT-3.5, GPT-4, and GPT-4o.
3. **Prompt lab** assembles a prompt from task, context, tone, and output format fields.
4. **Live chat** optionally sends a user message and instruction to the Responses API.

Streamlit provides the interface. The OpenAI Python SDK is imported only when a live request is made, so the educational pages do not require a configured API key. The key is read from the environment or Streamlit secrets and is not embedded in the project. The model ID can be edited in the UI to match the user's current account access.

## 5. Example prompt design

A prompt can be made more actionable by specifying:

- the task: what the model should do;
- the audience or background: what the reader already knows;
- the desired format: prose, list, table, or structured data;
- constraints: length, tone, scope, or what to do when information is missing.

Prompting improves clarity but does not guarantee truth. For factual work, use trusted sources and independent checks.

## 6. Evaluation approach

This is an instructional application, not a model benchmark. A classroom comparison can hold the prompt constant, run it against two model IDs that are available to the account, and assess outputs against a rubric. A useful rubric can include instruction adherence, factual support, completeness, readability, and format validity. Record model ID, date, prompt, response, latency, and usage metadata when available. Small hand-selected examples should not be reported as general model accuracy.

## 7. Limitations and responsible use

- Model families and API aliases change; access is account-dependent.
- Generated text may be incorrect, incomplete, biased, or overconfident.
- A qualitative generation comparison does not establish a universal best model.
- API requests may have financial costs and are subject to provider policies.
- Avoid sending passwords, API keys, or sensitive personal information in prompts.
- This application does not train or fine-tune a model, and it does not provide a local inference mode.

## 8. Conclusion

The project provides a small, runnable introduction to OpenAI language models and practical prompt design. Its separation between conceptual material and optional live inference allows it to be used without credentials, while the editable model field accommodates changing API availability. Learners should treat model output as a draft to inspect and verify.

## References

- OpenAI, [Models](https://platform.openai.com/docs/models).
- OpenAI, [Text generation and Responses API](https://platform.openai.com/docs/guides/text?api-mode=responses).
- OpenAI, [API pricing](https://openai.com/api/pricing/).
