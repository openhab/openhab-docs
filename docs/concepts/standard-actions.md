---
title: Standard Actions
source: https://github.com/openhab/openhab-docs/blob/main/src/concepts/standard-actions.md
meta:
  - property: og:title
    content: "Standard Actions"
  - property: og:description
    content: a vendor and technology agnostic open source automation software for your home
---

# Standard Actions

This page describes the standard actions for [rules](./rules.md).

openHAB comes with a set of standard actions.
These are built-in mechanisms that perform actions on behalf of rules.

## Actions Structure

The standard actions are fundamentally Java classes that implement the required logic.
We identify these actions using a code called the action type.
These codes are used as titles for the sections below.
To tell the action implementation what to do, actions can have configuration parameters with predefined names.
These configuration parameters and a brief description of what values they expect are listed in the following sections.

### `core.RuleEnablementAction`

This action enables or disables one or more specified `Rule`s.

| Parameter  | Description                                                                  |
|------------|------------------------------------------------------------------------------|
| `ruleUIDs` | The `List` of rule UIDs of the `Rule`s to enable or disable.                 |
| `enable`   | The boolean value that decides if the rule(s) should be enabled or disabled. |

### `core.RunRuleAction`

This action runs one or more specified `Rule`s.

| Parameter              | Description                                                                                |
|------------------------|--------------------------------------------------------------------------------------------|
| `ruleUIDs`             | The `List` of rule UIDs of the `Rule`s to run.                                             |
| `[considerConditions]` | A boolean value that determines if `Condition`s should be considered. Defaults to `false`. |

### `core.ItemCommandAction`

This action sends a `Command` to an `Item`.

| Parameter  | Description             |
|------------|-------------------------|
| `itemName` | The name of the `Item`. |
| `command`  | The `Command` to send.  |

### `core.ItemStateUpdateAction`

This action updates the `State` of an `Item`.

| Parameter  | Description             |
|------------|-------------------------|
| `itemName` | The name of the `Item`. |
| `state`    | The `State` to set.     |

### `media.PlayAction`

This action plays an audio file.

| Parameter  | Description                                                    |
|------------|----------------------------------------------------------------|
| `sound`    | The filename of the file from the `sounds` folder.             |
| `[sink]`   | The ID of the audio sink to use. Leave out to use the default. |
| `[volume]` | The volume to be used. Leave out to use the default.           |

### `media.SayAction`

This action uses the voice system to say the specified text.

| Parameter  | Description                                                    |
|------------|----------------------------------------------------------------|
| `text`     | The text to say.                                               |
| `[sink]`   | The ID of the audio sink to use. Leave out to use the default. |
| `[volume]` | The volume to be used. Leave out to use the default.           |

### `script.ScriptAction`

This action executes the provided script.

| Parameter | Description                                    |
|-----------|------------------------------------------------|
| `type`    | The code/MIME-type for the scripting language. |
| `script`  | The script content to execute.                 |

<EditPageLink/>
