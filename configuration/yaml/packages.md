---
layout: documentation
title: YAML Configuration - Packages
---

# Packages

Packages provide a way to bundle multiple related YAML sections into a reusable, parameterized unit.
Where `!include` inserts a fragment at the point it appears, a package loads a complete file containing full top‑level sections and merges those sections into the top level of the main configuration.

[[toc]]

## Purposes

- **Logical Grouping:**
  Packages allow a **Thing** and its related **Items**, channels, and metadata to be defined together in one file, representing a complete, self‑contained device definition.

- **Reuse with Different Parameters:**
  Through variable substitution, a single package can be instantiated multiple times with different values.
  This makes it easy to define many similar devices (for example, multiple sensors, switches, or rooms) from one shared structure.

## Package Syntax and Structure

Packages are declared in the main YAML file under the top‑level `packages:` section:

```yaml
packages:
  <package_id>: !include
    file: <path/to/package_file>
    vars:
      var1: value1
      var2: value2
```

### Key Components

- **Package ID:**
  A unique identifier for the package (for example, `package1`).
  It may include spaces.
  The special variable `${package_id}` resolves to this key inside the included package file.

- **`!include` Directive**:
  Points to the reusable package file and configures its parameters.

  - **`file` Path:**
    The path to the package file.
    It is recommended to use an extension like `.inc.yaml` to prevent fragments from being loaded as standalone main configurations.

  - **`vars` Values:**
    An optional mapping used to parameterize the package.

  See [!include](include.md) for more details on how the include directive works.

## Package File Contents

- **Top‑Level Sections:**
  Package files can contain any combination of top‑level keys such as `things:` and `items:`.

- **Restrictions:**
  Package files **must not** contain unique global top‑level keys such as `version:`.

- **Uniqueness:**
  Because package files can be included multiple times, use variable substitutions such as `${package_id}` for entity UIDs to avoid collisions.

- **Nesting:**
  A package file can itself include other files.

## Package Example

`main.yaml`:

```yaml
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
```

`templates/mqtt-light.inc.yaml`:

```yaml
things: !sub
  mqtt:topic:${package_id}:
    bridge: ${broker}
    channels:
      power:
        type: switch
        config:
          stateTopic: ${package_id}/state
          commandTopic: ${package_id}/set/state
      # ... other channels (brightness, color)

items: !sub
  ${name}_Power:
    type: Switch
    label: ${label} Power
    channel: mqtt:topic:${package_id}:power
  # ... more items for the light, e.g. brightness, color, etc.
```

Resulting YAML structure:

```yaml
things:
  mqtt:topic:livingroom-light:
    bridge: mqtt:broker:main
    channels:
      power:
        type: switch
        config:
          stateTopic: livingroom-light/state
          commandTopic: livingroom-light/set/state
  mqtt:topic:bedroom-light:
    bridge: mqtt:broker:main
    channels:
      power:
        type: switch
        config:
          stateTopic: bedroom-light/state
          commandTopic: bedroom-light/set/state

items:
  Living_Room_Light_Power:
    type: Switch
    label: Living Room Light Power
    channel: mqtt:topic:livingroom-light:power
  Bed_Room_Light_Power:
    type: Switch
    label: Bed Room Light Power
    channel: mqtt:topic:bedroom-light:power
```

## Merge Behavior

When a package is included, its contents are merged into the main YAML structure.
You may optionally customize the resulting structure by overriding, adding, or removing elements defined in the package.
This is done by redefining the elements you want to customize in your main file.

### Default Merge Behavior

`main.yaml`:

```yaml
packages:
  Number: !include pkg/number.inc.yaml

# Custom overrides
items:
  Number_Item:        # Redefine an item from the package
    label: Power Draw # Scalar override
    dimension: Power  # Add a new key
    tags: [Power]     # List: merged by default
    metadata:         # Map: merged by default
      stateDescription:
        config:
          max: 10
```

`pkg/number.inc.yaml`:

```yaml
items: !sub
  ${package_id}_Item:
    type: Number
    label: Package Label
    tags: [Measurement]
    metadata:
      stateDescription:
        config:
          min: 1
          pattern: '%.3f'
      widget:
        value: oh-card
```

Result:

```yaml
items:
  Number_Item:
    type: Number
    label: Power Draw
    dimension: Power
    tags:
      - Measurement
      - Power
    metadata:
      stateDescription:
        config:
          min: 1
          max: 10
          pattern: '%.3f'
      widget:
        value: oh-card
```

The way keys interact depends on their data type:

| Data Type | Behavior  | Description                                                                                                                                                                                |
|:----------|:----------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Scalar    | Overwrite | If the main file defines a scalar value (string, number, or boolean) at a specific path in the YAML structure, that value replaces the scalar defined at the same path inside the package. |
| Map       | Merge     | Key‑value objects are merged key by key, recursively.                                                                                                                                      |
| List      | Merge     | Arrays are concatenated together.                                                                                                                                                          |

#### How Package Merging Differs from YAML Merge Keys

Mappings from packages are merged **recursively** with the corresponding mappings in the main file.
This constrasts with standard YAML [Merge Keys](merge-keys.md), which perform only **shallow** merges.

**Merge Key (shallow merge):**

Normally, merge keys are used together with an alias.
In this example, the merge key is shown directly with a mapping to make the merge behavior easier to see.

```yaml
# merge key:
targetkey:
  foo:
    bar:
      boo: baz
  <<: # merge `foo` into `targetkey`
    foo:
      bar:
        boo: waldo
        goo: fy
      qux: quux
```

```yaml
# result — the merge key's foo mapping
# is ignored because foo already exists in main
targetkey:
  foo:
    bar:
      boo: baz
```

**Package Merging (recursive merge):**

```yaml
# main file
targetkey:
  foo:
    bar:
      boo: baz

packages:
  anyid: !include packagefile.inc.yaml
```

```yaml
# packagefile.inc.yaml
targetkey:
  foo:
    bar:
      boo: waldo
      goo: fy
    qux: quux
```

```yaml
# result:
targetkey:
  foo:
    bar:
      boo: baz  # main file overrides matching keys
      goo: fy   # but includes additional keys...
    qux: quux   # from the package
```

Because the merge is recursive, you can customize keys at any depth in the mapping.

### Controlling Package Merge Behavior with Tags

Use these special YAML tags in the **main file** to override the default merge behavior:

#### 1. The `!replace` Tag

Forces a replacement for maps or lists that would otherwise merge.
Useful when you want to discard the package's list or map and start fresh.

#### 2. The `!remove` Tag

Removes the corresponding key from the final configuration.
Ideal for excluding specific entities or properties from a generic package.

**Example:**

`main.yaml`:

```yaml
packages:
  Number: !include pkg/number.inc.yaml

# Custom overrides
items:
  Number_Item:             # Matches the resulting item name
    tags: !replace [Power] # Force overwrite, not merge
    metadata:
      stateDescription:
        config: !replace   # Force overwrite of this map
          format: "%.1f"
      widget: !remove      # Remove this key from the result
```

`pkg/number.inc.yaml`:

```yaml
items: !sub
  ${package_id}_Item:
    type: Number
    label: Package Label
    tags: [Measurement]
    metadata:
      stateDescription:
        config:
          min: 1
          pattern: '%.3f'
      widget:
        value: oh-card
```

Result:

```yaml
items:
  Number_Item:
    type: Number
    label: Package Label
    tags:                # tags from the package was !replaced, not merged
      - Power
    metadata:
      stateDescription:
        config:          # config from the package was !replaced, not merged
          format: '%.1f'
```

::: tip Usage Notes

- `!replace` and `!remove` are only valid in the **main YAML file**.
- They are ignored if used inside a package file.
- `!remove` removes the entire key; it cannot remove individual list items.
- Use `!replace` to prune unwanted inherited map keys or list items.

:::

## Strategic Use of Package IDs

Choose a **Package ID** that can also serve as a Thing UID fragment, Item name, or similar identifier.
This avoids defining extra variables in your `!include` call and lets you derive some or all related identifiers directly from `${package_id}` inside the package file.

You can override `${package_id}` in the `vars:` block of the `!include` statement if needed.

**Example:**

```yaml
# main file
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

| Variable        | Living_Room_Light              | Kitchen_Light              |
|-----------------|--------------------------------|----------------------------|
| `${package_id}` | `Living_Room_Light`            | `Kitchen_Light`            |
| `${id}`         | `living-room-light`            | `kitchen-light`            |
| `${thing_uid}`  | `mqtt:topic:living-room-light` | `mqtt:topic:kitchen-light` |
| `${item_name}`  | `Living_Room_Light`            | `Kitchen_Light`            |
| `${label}`      | `Living Room Light`            | `Kitchen Light`            |
