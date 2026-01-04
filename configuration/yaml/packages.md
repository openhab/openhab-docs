---
layout: documentation
title: YAML Configuration - Packages
---

# Packages

`!include` helps reduce repetition by inserting reusable YAML fragments into specific keys like `things` or `items`.
**Packages** extend this idea by allowing multiple top‑level sections (such as `things` and `items`) to be grouped together into a single reusable file.

> For a comparison of all reuse mechanisms, see
> **[Choosing a Reuse Mechanism](reuse-mechanisms.html)**.

[[toc]]

## Purposes

- **Logical Grouping:**
  Packages allow a **Thing** and its related **Items**, channels, and metadata to be defined together in one file, representing a complete, self‑contained device definition.

- **Reusable with Different Parameters:**
  Through variable substitution, a single package can be instantiated multiple times with different values. This makes it easy to define many similar devices (e.g., multiple sensors, switches, or rooms) from one shared structure.

## Package Syntax and Structure

Packages are defined under the top-level `packages:` section:

```yaml
packages:
  <package1>: !include
    file: <path/to/package_file>
    vars:
      var1: value1
      var2: value2
```

### Key Components:

- **Package Key:**
(e.g., `package1`) A unique identifier for the entry.
It can include spaces.
The special variable `${package_id}` automatically resolves to this key within the included file.
- **`!include` Directive:**
Points to the reusable package file and configures its parameters:
  - **`file` File Path:**
The path to the package file.
It is recommended to use an extension like `.inc.yaml` to prevent fragments from being loaded as standalone main configurations.
  - **`vars` Variables:**
An optional block used to parameterize the package.

::: tip Variable Overrides

While `${package_id}` is automatic, it can be explicitly overridden in the `vars` block if necessary.

:::

## Package File Contents

- **Top-Level Sections:**
Package files can contain any combination of top-level keys such as `things:` and `items:`.
- **Uniqueness:**
Because package files can be included multiple times, use [variable substitutions](variables.html#the-sub-tag) (like `${package_id}`) for entity UIDs to avoid collisions.
- **Restrictions:**
Package files **must not** contain unique global top-level keys such as `version:`.
- **Nesting:**
A package file can include other files.

## Package Example

`main.yaml`

```yaml
version: 1

variables:
  broker: mqtt:broker:main

packages:
  livingroom-light: !include
    file: templates/mqtt-light.inc.yaml
    vars:
      name: Living_Room_Light
      label: Living Room Light

  bedroom-light: !include
    file: templates/mqtt-light.inc.yaml
    vars:
      name: Bed_Room_Light
      label: Bed Room Light

# Custom override: items here interact with the package definitions
items:
  Bed_Room_Light_Power:
    label: My Bedroom Light Power # Scalar: Overwrites the package value
    tags: [Switch2] # List: Merged with package tags
    channels: # Map: Merged with package channels
      mqtt:topic:bedroom-light:switch2: {}
```

`templates/mqtt-light.inc.yaml`

```yaml
things:
  mqtt:topic:${package_id}:
    bridge: ${broker}
    label: ${label}
    channels:
      power:
        type: switch
        config:
          stateTopic: zigbee2mqtt/${package_id}/state
          commandTopic: zigbee2mqtt/${package_id}/set/state
      # ... other channels (brightness, color_temp)
items:
  ${name}_Power:
    type: Switch
    label: ${label} Power
    tags: [Switch]
    channels:
      mqtt:topic:${package_id}:power: {}
```

## Merge Behavior

When a package is included, its contents are merged into the main YAML structure.
The way keys interact depends on their data type:

| Data Type  | Behavior      | Description                                                             |
|:-----------|:--------------|:------------------------------------------------------------------------|
| **Scalar** | **Overwrite** | Strings, numbers, and booleans in the main file replace package values. |
| **Map**    | **Merge**     | Key-value objects are merged key-by-key.                                |
| **List**   | **Merge**     | Arrays are concatenated together.                                       |

### Controlling Merges with Tags

Use these special YAML tags in the **main file** to override the default behavior:

#### 1. The `!replace` Tag

Forces a replacement for maps or lists that would otherwise merge.
This is useful when you want to completely discard the package's list/map and start fresh.

**Example:**

```yaml
items:
  MyDevice_Status:
    tags: !replace [Measurement]  # Result: [Measurement] (Package tags discarded)
    metadata:
      stateDescription:
        config: !replace
          pattern: "%d"  # Result: config only contains pattern
```

#### 2. The `!remove` Tag

Removes the corresponding key from the final configuration.
This is ideal for excluding specific entities or properties from a generic package.

**Example:**

```yaml
items:
  Outdoor_Temperature:
    label: !remove # Removes the label key entirely
  Outdoor_Humidity: !remove # Removes the entire item defined in the package
```

::: tip Usage Notes

- `!replace` and `!remove` are only valid in the **main YAML file**.
- They are ignored if used inside a package file.
- Use `!replace` to prune unwanted inherited map keys or list items.

:::
