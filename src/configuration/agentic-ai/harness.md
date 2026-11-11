---
layout: documentation
title: Injecting the openHAB API Token into an Agent Harness
---

# Injecting the openHAB API Token into an Agent Harness

The goal is for the agent to be able to _use_ the token without ever _seeing_ it.
The token is read from secure storage at run time, placed in an environment variable, and referenced by name (`$OPENHAB_API_TOKEN`) in the commands the agent runs.

See [Storing the openHAB API Token Securely](secure-storage.md) for the commands that read the token on each platform.

## Pattern 1: export it from your shell profile

Add a line to `~/.zshrc` or `~/.bashrc` that reads the token from secure storage (macOS shown):

```bash
export OPENHAB_API_TOKEN="$(security find-generic-password -a "$USER" -s openhab-api-token -w 2>/dev/null)"
export OPENHAB_URL="http://openhab.local:8080"
```

Any harness started from that terminal (`claude`, `codex`, `gemini`, and so on) inherits both variables.

Apps launched from the Dock, Start menu, or a desktop launcher usually do **not** read your shell profile, so they will not see the variable.
For those, use Pattern 3 or Pattern 4.

## Pattern 2: a launcher script

Inject the token only into the harness process instead of every shell:

```bash
#!/usr/bin/env bash
OPENHAB_API_TOKEN="$(security find-generic-password -a "$USER" -s openhab-api-token -w)" \
OPENHAB_URL="http://openhab.local:8080" \
exec claude "$@"
```

With 1Password, `op run --env-file=openhab.env -- claude` does the same, where `openhab.env` contains only a secret reference such as `OPENHAB_API_TOKEN=op://Private/openHAB API token/credential`.

## Pattern 3: tell the agent how to fetch it

Put retrieval instructions, not the token, in the harness's instruction file (`~/.claude/CLAUDE.md`, `AGENTS.md`, `GEMINI.md`, and so on):

```markdown
# openHAB API token

The openHAB API token is stored in the macOS Keychain (generic password, service `openhab-api-token`, account `$USER`).
Read it inline when calling the API, for example
`curl -H "Authorization: Bearer $(security find-generic-password -a "$USER" -s openhab-api-token -w)" "$OPENHAB_URL/rest/items"`.
Never print, echo, log, or write the token to a file, and never ask the user to paste it.
```

This works even when the harness was launched from a GUI and has no environment variable, because the command substitution runs inside each shell command.

## Pattern 4: an MCP server

If you use an openHAB MCP server, pass the token through the environment rather than hard-coding it in the configuration.
Claude Code expands `${VAR}` references in `.mcp.json`, so the file can be committed safely:

```json
{
  "mcpServers": {
    "openhab": {
      "command": "<your-openhab-mcp-server>",
      "env": {
        "OPENHAB_URL": "${OPENHAB_URL}",
        "OPENHAB_API_TOKEN": "${OPENHAB_API_TOKEN}"
      }
    }
  }
}
```

Other MCP clients have similar mechanisms; check that yours expands variables instead of treating `${OPENHAB_API_TOKEN}` as a literal string.

## Keep the token out of the transcript

- Refer to the variable by name in commands; do not run `echo $OPENHAB_API_TOKEN` or `env` in an agent session.
- Avoid `curl -v`, which prints request headers including `Authorization`.
- If the token does appear in a transcript or log, revoke it and create a new one (see [Creating an API Token for an Agent](api-token.md)).

## Limit what the harness can do

Most harnesses let you allow or deny commands.
A reasonable starting point is to allow read-only calls (`curl` `GET` requests to your openHAB host) without prompting, and to require approval for anything that sends a command, changes configuration, or restarts a service.
