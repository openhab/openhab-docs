---
layout: documentation
title: YAML Configuration - Anchors & Aliases
---

# Anchors & Aliases

Anchors and aliases provide efficient, in-file content reuse to reduce repetition without the overhead of external include files or packages.

## Core Concepts

YAML utilizes two primary symbols to manage reusable content:

- **Anchor (`&name`):** Marks a **YAML node** (a map, list, or scalar) to be stored for reuse.
- **Alias (`*name`):** References a previously anchored node and injects its content at the current location.

::: tip Scope Note:

Anchors and aliases are **file-local**. An anchor defined in an include file cannot be referenced in the main file, and vice versa.

:::

> For a comparison of all reuse mechanisms, see
> **[Choosing a Reuse Mechanism](reuse-mechanisms.html)**.

## Hidden Keys

To store anchored nodes without cluttering your final configuration, use **Hidden Keys**.

- **Definition:** Any top-level YAML key beginning with a dot (`.`).
- **Behavior:** These keys are parsed during preprocessing but are **stripped from the final output** sent to openHAB.
- **Purpose:** They serve as internal storage containers. This allows you to anchor a node for later use without that node being processed as a live entity in your system.

### Implementation Example

The following example demonstrates how to anchor a node within a hidden key and merge it into active items.

```yaml
version: 1

# 1. Store a node in a hidden key and anchor it (&)
.light-base: &LIGHT_BASE
  type: Switch
  label: "Light"
  tags: [Lighting]

items:
  Light1:
    # 2. Reference and merge the anchored node using an alias (*)
    <<: *LIGHT_BASE
    name: Light1

  Light2:
    <<: *LIGHT_BASE
    name: Light2
```

You can also create an anchor for a scalar value.

```yaml
.hidden:
  bar: &BAR value # create an anchor for `value`

foo: *BAR # insert `value` here
```

## Merge Behavior & Overrides

When using the merge key (`<<:`), YAML follows specific logic to combine the anchored node with the local block:

- **Maps:** Merged key-by-key.
- **Scalars:** Local values **override** the values in the anchor.
- **Lists:** Typically concatenated.

## Strategic Usage

| Feature             | Best For...                                                       |
|:--------------------|:------------------------------------------------------------------|
| **Anchors/Aliases** | Reusing structural nodes multiple times within a **single file**. |
| **Include Files**   | Configurations or logic shared across **multiple files**.         |
| **Variables**       | Dynamic text replacement (scalars) rather than structural blocks. |

### Best Practices

- **Naming:** Use `UPPER_CASE` for anchors to distinguish them from standard keys.
- **Organization:** Group all anchored nodes at the top of your file under hidden keys.
- **Standardization:** Use them to enforce consistent metadata or channel structures across many Items within one file.
