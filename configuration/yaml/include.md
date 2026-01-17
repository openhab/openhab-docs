---
layout: documentation
title: YAML Configuration - Include Files
---

# Including Other Files

`!include` inserts the referenced file or structure exactly at the position where the include appears.

openHAB supports including external YAML files to facilitate modular, reusable, and maintainable configurations.
This is especially useful for templating, creating device [packages](packages.md), or separating concerns across multiple files.

[[toc]]

## Syntax Options

### Simple Syntax

```yaml
keyname: !include filename.inc.yaml
```

Use this when no variable overrides are needed.

### Full Syntax

```yaml
# Block style (multi-line)
keyname: !include
  file: filename.inc.yaml
  vars:
    var1: value1
    var2: value2

# Or inline style (single-line)
keyname: !include { file: filename.inc.yaml, vars: { var1: value1, var2: value2 } }
```

In the full syntax, the `vars` section is optional.

::: tip Passing Existing Variables to Included Files

The `vars` section of an `!include` directive can contain literal values or references to **existing variables**.

Example:

```yaml
keyname: !include
  file: xx.inc.yaml
  vars:
    var1: !sub ${mainvar}
```

The include file can now refer to `var1` without relying on the variable names used in the main file.
This is especially useful when the same include file is shared across multiple configurations that may use different variable names.

:::

The contents of the include file will be inserted as the value for the given key.
This means that the top-level keys in the include file will become sub-keys of the key in the main file.

## Variable Resolution Order

Understanding how variables interact across files is important when using includes, especially when templates define their own defaults.

When include files are involved, variables can originate from multiple sources.
Their values are resolved according to the following order (highest priority first):

1. Inline `vars` in `!include` directives
1. Global `variables` defined in the main file
1. Local `variables` defined inside the include file

Variables provided in the `vars` section of an `!include` directive are visible only within the included file, but they override both global and local variables.

Local variables, defined inside an include file, can act as default values when they are not provided in the `!include` directive.
This enables included files to act as parameterized templates that can be reused with different values.

The following example demonstrates how the variable resolution order works in practice.

Example

`main.yaml`:

```yaml
variables:
  broker: mqtt:broker:main

things:
  mqtt:topic:livingroom-window: !include
    file: mqtt_contact.inc.yaml
    vars:
      label: Living Room Window
      id: livingroom-window

  mqtt:topic:bedroom-window: !include
    file: mqtt_contact.inc.yaml
    vars:
      label: Bedroom Window
      id: bedroom-window
      broker: mqtt:broker:external # override the global broker variable
```

`mqtt_contact.inc.yaml`:

```yaml
bridge: !sub ${broker}
label: !sub ${label}
config:
  availabilityTopic: !sub ${id}/availability
  payloadAvailable: online
  payloadNotAvailable: offline
```

Resulting configuration:

```yaml
things:
  mqtt:topic:livingroom-window:
    bridge: mqtt:broker:main
    label: Living Room Window
    config:
      availabilityTopic: livingroom-window/availability
      payloadAvailable: online
      payloadNotAvailable: offline

  mqtt:topic:bedroom-window:
    bridge: mqtt:broker:external
    label: Bedroom Window
    config:
      availabilityTopic: bedroom-window/availability
      payloadAvailable: online
      payloadNotAvailable: offline
```

## File Naming & Reload Behavior

- The file can be specified as an absolute path or as a path relative to the current file.
  It may be helpful to store all include files in a subdirectory and refer to them with a relative path.
    ::: tip Using Predefined Path Variables
    You can use [predefined variables](variables.md#predefined-variables) such as `OPENHAB_CONF`, `OPENHAB_USERDATA`, `__DIRECTORY__`, or `__FILE_NAME__` when constructing the `file:` path.
    These can be interpolated with `${...}` and are especially useful for building portable or relative include paths.
    Example:

    ```yaml
    keyname: !include
      file: !sub ${OPENHAB_CONF}/packages/hue-light.pkg.yaml
    ```

    :::
- Use the `.inc.yaml` or `.inc.yml` extension for included files so they aren't loaded as primary configuration files.
- Changes to included files automatically trigger a reload of the primary file.
- File inclusions can be nested.
  For example:
  `main.yaml` → includes `a.inc.yaml` → includes `b.inc.yaml` → etc.
