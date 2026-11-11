---
layout: documentation
title: Agentic AI and openHAB
---

# Agentic AI and openHAB

This set of pages explains how to let an agentic AI harness (Claude Code, Codex, Cursor, Gemini CLI, an MCP client, and similar tools) work with an openHAB instance through its REST API, safely and productively.

## How this differs from the built-in Chat

openHAB can also use an AI model itself: an [LLM-based interpreter](../multimedia.md#llm-based-interpreters) answers natural-language requests, for example in the Main UI [Chat](../../mainui/chat.md), and can only read and command Items allowed by the Item permission model.
These pages cover the other direction: an external agent, running on your own computer, that uses the REST API to inspect and change openHAB's configuration as well as its Items.
That makes it much more capable, and it needs the safeguards described here.

## Pages

1. [Creating an API Token for an Agent](api-token.md)
1. [Storing the openHAB API Token Securely](secure-storage.md)
1. [Injecting the openHAB API Token into an Agent Harness](harness.md)
1. [Agentic AI Best Practices for openHAB](best-practices.md)
1. [Agentic AI Examples for openHAB](examples.md)

## The short version

- Create a **dedicated openHAB user** for the agent and issue an API token for that user, so you can revoke it without affecting anyone else.
- Keep the token in your **platform's secure storage** (macOS Keychain, Linux Secret Service, Windows SecretManagement, or a password manager CLI), never in a file in a repository.
- Let the harness **read the token at run time** into an environment variable, and tell the agent never to print it.
- **Tell the agent what you want, not what to do**, and then **review** what it did before you trust it.
- Take a **backup first**, and prefer a test instance for anything risky.
