---
layout: documentation
title: YAML Configuration - Include Files
---

# Including Other Files

`!include` inserts the referenced file or structure exactly at the position where the include appears.

openHAB supports including external YAML files to facilitate modular, reusable, and maintainable configurations.
This is especially useful for modular reuse, creating device [packages](packages.md), or separating concerns across multiple files.

[[toc]]

## Syntax Options

### Short Form

```yaml
keyname: !include filename.inc.yaml
```

```yaml
keyname: !include filename.inc.yaml?arg1=value1&flag
```

The short form allows you to reference another file directly after the `!include` tag.
Optional arguments may be appended using URL‑style query syntax:

- `arg1=value1` assigns a specific value
- `flag` (a value‑less argument) is interpreted as `true`
- Multiple arguments are separated with `&`
- The file name, argument names, and argument values are URL‑decoded.
  If any of them contain characters such as `+`, `%`, or other reserved symbols, make sure to URL‑encode them.

This form is ideal when you only need to include a file and pass a small number of simple parameters.

### Long Form (supports variables)

```yaml
# Block style (multi-line)
keyname: !include
  file: filename.inc.yaml
  vars:
    var1: value1
    var2: value2

# Or flow style (single-line)
keyname: !include { file: filename.inc.yaml, vars: { var1: value1, var2: value2 } }
```

The `vars:` mapping is layered on top of the file’s current variables to form the evaluation context.
In the long form, the `vars:` section is optional.

::: tip Passing Existing Variables to Included Files

The `vars:` section of an `!include` directive can contain literal values or references to **existing variables**.

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

Understanding how variables interact across files is important when using includes, especially when include files define their own defaults.

When include files are involved, variables can originate from multiple sources.
Their values are resolved according to the following order (highest priority first):

1. Inline `vars` in `!include` directives
1. Global `variables` defined in the main file
1. Local `variables` defined inside the include file

Variables provided in the `vars` section of an `!include` directive are visible only within the included file, but they override both global and local variables.

Local variables defined inside an include file can act as default values when they are not provided in the `!include` directive.
This allows include files to be reused with different parameters while keeping sensible defaults inside the file itself.

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

### Path Resolution

Include file paths may be written as absolute paths or as paths relative to the current file.

openHAB also supports a special path prefix that simplifies referencing files inside the YAML configuration directory.

#### `@/path` → `${OPENHAB_CONF}/yaml/path`

A leading `@` resolves to the `yaml` directory inside the openHAB configuration root.

**Note:** Paths beginning with `@` **must be quoted** (e.g., `"@/path"`).
YAML plain scalars cannot begin with `@`, so quoting ensures the value is parsed as a normal string.

```yaml
key: !include "@/includes/device.inc.yaml"
# Resolves to: ${OPENHAB_CONF}/yaml/includes/device.inc.yaml
```

This is a convenient shorthand for the most common case: including files stored within the YAML configuration domain.

#### Relative Paths

If the path does not begin with `/` or `@`, it is interpreted as a path **relative to the directory of the including file**.

**Example directory layout:**

```sh
yaml/
  main.yaml
  shared.inc.yaml
  common/
    defaults.inc.yaml
```

**Same directory:**

```yaml
key: !include "shared.inc.yaml"
# Resolves to: yaml/shared.inc.yaml
```

**Navigate downward (into a subdirectory):**

```yaml
key: !include "common/defaults.inc.yaml"
# Resolves to: yaml/common/defaults.inc.yaml
```

Relative paths always resolve from the directory containing the including file.

#### Using Variable Substitutions

You can use variable substitution patterns in the file name to construct paths dynamically.
This includes normal variables, [predefined variables](variables.md#predefined-variables) such as `OPENHAB_CONF`, `OPENHAB_USERDATA`, `__DIRECTORY__`, or `__FILE_NAME__`, and environment variables exposed through `ENV`.

These can be interpolated using `!sub ${...}` and are especially useful for building portable or relative include paths.

**Example:**

```yaml
keyname: !include
  file: !sub ${OPENHAB_CONF}/packages/hue-light.pkg.yaml
```

### File Organization

It may be helpful to store include files in a dedicated subdirectory and reference them using relative paths.
Using consistent naming (e.g., `*.inc.yaml`) makes it clear which files are intended for inclusion rather than direct loading.

### Nested Includes

Include files may themselves contain `!include` directives.
This allows configurations to be composed from multiple layers:

main.yaml → a.inc.yaml → b.inc.yaml → …

### Reload Behavior

- Include files should use the `.inc.yaml` or `.inc.yml` extension so they are not treated as primary configuration files.
- Changes to included files automatically trigger a reload of the primary file but only if they are located within a monitored directory such as `${OPENHAB_CONF}/yaml`.
