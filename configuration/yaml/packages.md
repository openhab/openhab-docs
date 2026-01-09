---
layout: documentation
title: YAML Configuration - Packages
---

# Packages

Packages provide a way to bundle multiple related YAML sections into a reusable, parameterized unit.
They build on `!include`, which inserts reusable YAML fragments, by letting you group entire top‑level sections (such as `things` and `items`) into one reusable file.

> For a comparison of all reuse mechanisms, see
> **[Choosing a Reuse Mechanism](reuse-mechanisms.html)**.

[[toc]]

## Purposes

- **Logical Grouping:**
  Packages allow a **Thing** and its related **Items**, channels, and metadata to be defined together in one file, representing a complete, self‑contained device definition.

- **Reusable with Different Parameters:**
  Through variable substitution, a single package can be instantiated multiple times with different values. This makes it easy to define many similar devices (e.g., multiple sensors, switches, or rooms) from one shared structure.

## Package Syntax and Structure

Packages are declared in the main YAML file under the top‑level `packages:` section:

```yaml
packages:
  <package1>: !include
    file: <path/to/package_file>
    vars:
      var1: value1
      var2: value2
```

### Key Components

- **Package ID:**
  A unique identifier for the package (e.g., `package1`).
  It may include spaces.
  The special variable `${package_id}` resolves to this key inside the included package file.

- **`!include` Directive:**
  Points to the reusable package file and configures its parameters:

  - **`file` File Path:**
    The path to the package file.
    It is recommended to use an extension like `.inc.yaml` to prevent fragments from being loaded as standalone main configurations.

  - **`vars` Variables:**
    An optional block used to parameterize the package.

## Package File Contents

- **Top‑Level Sections:**
  Package files can contain any combination of top-level keys such as `things:` and `items:`.

- **Restrictions:**
  Package files **must not** contain unique global top-level keys such as `version:`.

- **Uniqueness:**
  Because package files can be included multiple times, use variable substitutions (like `${package_id}`) for entity UIDs to avoid collisions.

- **Nesting:**
  A package file can include other files.

## Package Example

`main.yaml`

```yaml
version: 2

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
    label: My Bedroom Light Power   # => overwrites the package value
    tags: [Switch2]                 # => merged with package tags
    channels:                       # => merged with package channels
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

::: tip Strategic Use of Package IDs

Choose a **Package ID** that can also serve as a Thing UID fragment, Item name, or similar identifier.
This avoids defining extra variables in your `!include` call and lets you derive all related identifiers directly from `${package_id}` inside the package file.

**Example:**

```yaml
# main file
version: 2
packages:
  Living_Room_Light: !include light.inc.yaml
  Kitchen_Light: !include light.inc.yaml
```

```yaml
# light.inc.yaml package file
variables: !sub
  id: ${package_id|lower|replace('_', '-')}
  thing_uid: "mqtt:topic:${id}"
  item_name: ${package_id}
  label: ${package_id|replace('_', ' ')}
```

**Resulting variables:**

| Variable       | Living_Room_Light              | Kitchen_Light              |
|----------------|--------------------------------|----------------------------|
| `${id}`        | `living-room-light`            | `kitchen-light`            |
| `${thing_uid}` | `mqtt:topic:living-room-light` | `mqtt:topic:kitchen-light` |
| `${item_name}` | `Living_Room_Light`            | `Kitchen_Light`            |
| `${label}`     | `Living Room Light`            | `Kitchen Light`            |

You can override `${package_id}` in the `vars:` block of the `!include` statement if needed.

:::

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
Useful when you want to discard the package’s list/map and start fresh.

**Example:**

```yaml
items:
  MyDevice_Status:
    tags: !replace [Measurement]  # => tags becomes exactly [Measurement]
    metadata:
      stateDescription:
        config: !replace
          pattern: "%d"           # => config only contains pattern
```

#### 2. The `!remove` Tag

Removes the corresponding key from the final configuration.
Ideal for excluding specific entities or properties from a generic package.

**Example:**

```yaml
items:
  Outdoor_Temperature:
    label: !remove                # => removes the label key entirely

  Outdoor_Humidity: !remove       # => removes the entire item
```

::: tip Usage Notes

- `!replace` and `!remove` are only valid in the **main YAML file**.
- They are ignored if used inside a package file.
- `!remove` removes the entire key; it cannot remove individual list items.
- Use `!replace` to prune unwanted inherited map keys or list items.

:::
