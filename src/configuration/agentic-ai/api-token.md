---
layout: documentation
title: Creating an API Token for an Agent
---

# Creating an API Token for an Agent

An [API token](../apitokens.md) lets a script or an AI agent call the [REST API](../restdocs.md) without knowing a username and password.
A token acts with the permissions of the user it belongs to, so an administrator's token can change Things, Items, rules, and add-ons.

## Recommended: use a dedicated user

Create a separate openHAB user for the agent rather than issuing a token on your personal administrator account.
That way you can tell agent activity apart, and you can revoke or delete the agent's access without touching your own login.

Open the [openHAB console](../../administration/console.md) and run:

```text
openhab> openhab:users add agent <a-strong-password> administrator
```

Use the `user` role instead of `administrator` if the agent only needs to read states and send commands, and does not need to change configuration.

## Option 1: create the token in the Main UI

1. Sign in to the Main UI as the user who will own the token (for example `agent`).
1. Click the user name at the bottom of the left sidebar to open the **Profile** page.
1. Click **Create new API token**.
1. Re-enter the username and password, give the token a descriptive name (for example `claude-code-laptop`), and leave the scope empty unless you have a reason to set one.
1. Click **Create API Token** and copy the token, which starts with `oh.`.

[API Token Generation](../apitokens.md) shows each of these screens.

The token is shown **only once**.
Store it immediately, as described in [Storing the openHAB API Token Securely](secure-storage.md).

## Option 2: create the token in the console

```text
openhab> openhab:users addApiToken agent claude-code-laptop ""
```

The command prints the token once.
Other useful commands (see [Runtime Commands](../../administration/runtime.md) for the full list):

```text
openhab> openhab:users list
openhab> openhab:users listApiTokens
openhab> openhab:users rmApiToken agent claude-code-laptop
```

## Testing the token

Send the token as a bearer token in the `Authorization` header:

```bash
curl -s -H "Authorization: Bearer $OPENHAB_API_TOKEN" http://openhab.local:8080/rest/systeminfo
```

A JSON response with system information means the token works.
A `401 Unauthorized` means the token is wrong, revoked, or was not sent.

## Good habits

- Use **one token per machine or harness**, named after where it is used, so you can revoke one without breaking the others.
- **Revoke** tokens you no longer use (Profile page, or `openhab:users rmApiToken`).
- If a token ever appears in a log, a chat transcript, a screenshot, or a commit, **revoke it and create a new one**.
