---
layout: documentation
title: Chat
---

# Chat

<!-- START MAINUI SIDEBAR DOC - DO NOT REMOVE -->
The Chat feature allows you to control your smart home using natural language and interact with your devices conversationally.
It requires a [LLM-based human language interpreter](/configuration/multimedia.html#llm-based-interpreters) to be configured as the default interpreter.
<!-- END MAINUI SIDEBAR DOC - DO NOT REMOVE -->

Upon sending a message, it is processed by the LLM and the response is displayed in the chat feed.
When the LLM decides to interact with Items using LLM tools, the default card widget for the interacting Item is rendered in the chat feed, allowing to check the status or control the Item directly.

## Settings

The <f7-icon f7="gear_alt_fill" /> icon in the bottom right corner provides access to the following settings:

- **Tool Customization**: Allows you to select which LLM tools are provided to the LLM. Disabling tools prevents the LLM from executing any actions.
- **Tool Call Display**: Toggle whether all tool calls are displayed. If disabled, only the Item-related tool calls are rendered. If enabled, other tool calls (such as time/date queries) will be displayed in generic components.

## Requirements

To use the Chat interface, you must configure the following on your openHAB server:

1. **Compatible Interpreter**: You need a [LLM-based HLI service](/configuration/multimedia.html#llm-based-interpreters) service, such as [Google Gemini]({{base}}/addons/bindings/gemini/).
2. **Default Interpreter**: Configure this HLI service as your default interpreter in _System Settings_ → _Voice_.
