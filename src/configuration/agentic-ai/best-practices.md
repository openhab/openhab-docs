---
layout: documentation
title: Agentic AI Best Practices for openHAB
---

# Agentic AI Best Practices for openHAB

An agentic harness can read your openHAB configuration, reason about it, call the REST API, read logs, and check its own work.
Used well, it is a fast and thorough assistant.
Used carelessly, it can change your home faster than you can notice.

## Tell the agent what you want, not what to do

The single most useful habit: describe the **outcome** and the **constraints**, and let the agent work out the steps.

| Instead of this (steps)                                                                              | Say this (outcome)                                                                                       |
|------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|
| "Create a Switch Item called `Porch_Light` and link it to `zwave:device:ctrl:node12:switch_binary`." | "I want the porch light controllable from openHAB and grouped with the other outdoor lights."            |
| "Write a rule that triggers at 22:00 and sends OFF to `gLights`."                                    | "Lights left on downstairs should turn off at bedtime, except when someone is still in the living room." |
| "Look at line 40 of `openhab.log`."                                                                  | "The garage door Thing keeps going offline overnight. Find out why and tell me what you would change."   |

Why this works better:

- The agent inspects your actual Things, Items, naming, and semantic model, and fits the change to what is already there.
- It can find a better approach than the one you had in mind, or tell you that what you asked for already exists.
- You avoid baking your own mistakes (a wrong channel UID, a wrong Item type) into the instructions.
- It makes the result easy to check: you know what "done" looks like.

Include what matters to you: what must not change, what "done" means, and when to stop and ask.
For example: "Don't touch anything in the Security group, and show me the plan before you change anything."

## Then review

The agent's work is a proposal until you have checked it.

- **Ask for a plan first** for anything non-trivial ("Tell me what you intend to change before you change it").
- **Review the diff**: Items, rules, and Things added, changed, or removed. Ask for a summary listing each one.
- **Ask how it verified the result**: did it read the state back, watch the log, or run the rule? "It should work" is not verification.
- **Check it yourself** in the Main UI or the real device for anything that matters.

## Protect the house

- **Back up first**: `openhab-cli backup` (or the backup option in your installation) before a session that changes configuration.
- **Use a test instance** for experiments, new bindings, and bulk changes. A Docker container with a copy of your configuration is cheap.
- **Use a dedicated user and token** for the agent, with the least role it needs (see [Creating an API Token for an Agent](api-token.md)).
- **Require confirmation for physical-world actions**: locks, garage doors, alarms, heating, pumps, and anything else that is unsafe, expensive, or annoying if triggered at the wrong time. Say so explicitly in your instructions, and configure your harness to ask before such commands.
- **Avoid running the agent unattended** against your production instance until you trust a workflow.

## Treat openHAB data as data

Item labels, Thing names, rule descriptions, and log lines can contain arbitrary text, including text that was set by a device or a cloud service.
An agent should treat that content as information, never as instructions.
If the agent reports that something it read "told it" to take an action, stop and check.

## Keep configuration reviewable

- If you use file-based configuration (`.items`, `.things`, `.rules`), keep it in Git so every agent change is a reviewable diff you can revert.
- If you use the Main UI (JSON database), ask the agent to export what it changed (for example `GET /rest/items/{name}`), or use the backup to compare before and after.
- Ask the agent to follow your existing naming conventions and semantic model; tell it where they are documented.

## Give the agent context once

Put stable facts in the harness's instruction file (`CLAUDE.md`, `AGENTS.md`, and so on) instead of repeating them each session:

- The openHAB URL, version, and how to obtain the token (never the token itself).
- Naming conventions, the semantic model layout, and where configuration files live.
- What the agent may do on its own, and what always needs your approval.
- Where the logs are (for example `/var/log/openhab/openhab.log`, or `userdata/logs/openhab.log`).

## Know when to stop

If the agent starts guessing, repeating the same failed step, or changing more than you asked for, interrupt it, restate the outcome you want, and narrow the scope.
