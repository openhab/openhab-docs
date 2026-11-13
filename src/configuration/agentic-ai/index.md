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

## MCP Server add-on or REST API

An agent can reach openHAB in two ways, and both use the same API token.

- The [MCP Server add-on](/addons/integrations/mcp/) gives the agent a set of openHAB tools.
  It understands the semantic model, matches Items by fuzzy name, builds rules from typed triggers and actions, and keeps riskier capabilities (full REST access, scripting, log access) switched off until you enable them.
  It also works with chat apps that cannot run commands.
  It suits everyday control and configuration of your home.
- Calling the [REST API](../restdocs.md) directly, for example with `curl`, needs nothing installed on the server and reaches every endpoint.
  It combines with everything else the agent can do on your computer, such as building and deploying an add-on, reading log files, or editing configuration kept in Git.
  It suits development, testing, and bulk or scripted work.

Many people use both.
The pages below apply either way.

Some practical differences to keep in mind:

- An MCP client loads the description of every tool into each agent session, whether or not the session uses openHAB.
  If that matters, register the server only for the projects or sessions that need it.
- Fuzzy search finds Items from everyday names, but for an exact question it can return many loose matches.
  Lists from the MCP tools also arrive in pages, so ask the agent to make sure it has seen all of them.
- Unfiltered REST responses can be very large, for example `/rest/things` on an installation with many Things.
  Ask the agent to filter responses, for example with `jq`, before reading them.

## Pages

1. [Creating an API Token for an Agent](api-token.md)
1. [Storing the openHAB API Token Securely](secure-storage.md)
1. [Injecting the openHAB API Token into an Agent Harness](harness.md)
1. [Agentic AI Best Practices for openHAB](best-practices.md)
1. [Agentic AI Examples for openHAB](examples.md)

## The short version

- Create a **dedicated openHAB user** for the agent and issue an API token for that user, so you can revoke it without affecting anyone else.
- Keep the token in your **platform's secure storage** (macOS Keychain, Linux Secret Service, Windows SecretManagement, or a password manager CLI), never in a file in a repository.
- Let the harness **read the token at run time**, into an environment variable or the MCP connection's headers, and tell the agent never to print it.
- **Tell the agent what you want, not what to do**, and then **review** what it did before you trust it.
- Take a **backup first**, and prefer a test instance for anything risky.
