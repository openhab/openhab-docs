---
layout: documentation
title: Agentic AI and openHAB
---

# Agentic AI and openHAB

This set of pages explains how to let an agentic AI harness (Claude Code, Codex, Cursor, Gemini CLI, an MCP client, and similar tools) work with an openHAB instance through its REST API, safely and productively.

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
