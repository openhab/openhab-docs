---
layout: documentation
title: Storing the openHAB API Token Securely
---

# Storing the openHAB API Token Securely

Keep the token in your operating system's secure storage so it is encrypted at rest, unlocked with your login, and never sits in a dotfile, a `.env` file, or a repository.

All examples below use the service name `openhab-api-token` and your login name as the account.
Each "store" command **prompts** for the token so it does not end up in your shell history.

## macOS: Keychain

Store:

```bash
security add-generic-password -a "$USER" -s openhab-api-token -w
```

`-w` as the last option makes `security` prompt for the value.
Add `-U` to update an existing entry.

Read:

```bash
security find-generic-password -a "$USER" -s openhab-api-token -w
```

The first time a program reads the item, macOS may ask whether to allow access; choose **Always Allow** only for tools you trust.
You can also view or delete the item in **Keychain Access**.

## Linux: Secret Service (GNOME Keyring, KWallet)

Install `secret-tool` (package `libsecret-tools` on Debian and Ubuntu, `libsecret` on Fedora and Arch).

Store:

```bash
secret-tool store --label="openHAB API token" service openhab-api-token account "$USER"
```

Read:

```bash
secret-tool lookup service openhab-api-token account "$USER"
```

On a headless machine without a desktop keyring, use `pass` (GPG-encrypted) instead:

```bash
pass insert openhab/api-token
```

```bash
pass show openhab/api-token
```

## Windows: PowerShell SecretManagement

Install the modules and register a local vault once:

```powershell
Install-Module Microsoft.PowerShell.SecretManagement, Microsoft.PowerShell.SecretStore
Register-SecretVault -Name LocalStore -ModuleName Microsoft.PowerShell.SecretStore -DefaultVault
```

Store (prompts for the value):

```powershell
Set-Secret -Name openhab-api-token
```

Read:

```powershell
Get-Secret -Name openhab-api-token -AsPlainText
```

## Any platform: a password manager CLI

If you already use a password manager with a command-line tool, keep the token there.
For example, with the 1Password CLI:

```bash
op read "op://Private/openHAB API token/credential"
```

`op run` can also inject secrets into a child process's environment without writing them anywhere.

## What not to do

- Do not put the token in `~/.zshrc`, `~/.bashrc`, or a profile script as a literal value; read it from secure storage there instead.
- Do not put it in a `.env` file, `settings.json`, `.mcp.json`, `CLAUDE.md`, `AGENTS.md`, or any file in a Git repository.
- Do not paste it into an agent's chat; anything in the conversation can be logged, summarized, or sent to the model provider.
