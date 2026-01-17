---
layout: documentation
title: YAML Configuration - Anchors & Aliases
---

# Anchors & Aliases

Anchors and aliases provide efficient, in-file content reuse to reduce repetition without the overhead of external include files or packages.

[[toc]]

## Core Concepts

YAML utilizes two primary symbols to manage reusable content:

- **Anchor (`&name`):** Marks a **YAML node** (a map, list, or scalar) to be stored for reuse.
- **Alias (`*name`):** References a previously anchored node and injects its content at the current location.

::: tip Scope Note:
Anchors and aliases are **file‑local**. An anchor defined in an include file cannot be referenced in the main file, and vice versa.
:::

### Using Hidden Keys for Anchors

Hidden keys are a convenient place to store anchored nodes without exposing them in the final configuration.

For a full explanation of hidden keys, see [File Structure & Preprocessing](preprocessor.md#hidden-keys).

Anchors are often combined with the YAML **merge key** (`<<:`), which inserts the contents of an anchored map into the current map.
For full merge‑key semantics, see [Merge Keys](merge-keys.md).

```yaml
.base-switch: &BASE_SWITCH
  type: Switch
  autoupdate: false

items:
  Light1:
    <<: *BASE_SWITCH
    label: Light One
```

You can also create an anchor for a scalar value.
This works similarly to using a variable.

```yaml
.bar: &BAR value

foo: *BAR
```

## When to Use Anchors

Anchors and aliases are ideal when you want to reuse structural blocks **within a single file** without introducing external includes or packages. They work best for:

- repeating common fields across many entries
- sharing channel or configuration structures
- keeping templates close to where they are used

## Strategic Usage

| Feature             | Best For...                                                       |
|:--------------------|:------------------------------------------------------------------|
| **Anchors/Aliases** | Reusing structural nodes multiple times within a **single file**. |
| **Include Files**   | Configurations or logic shared across **multiple files**.         |
| **Variables**       | Dynamic text replacement (scalars) rather than structural blocks. |

### Best Practices

- **Naming:** Use `UPPER_CASE` for anchors to distinguish them from standard keys.
- **Standardization:** Use anchors to enforce consistent structure across any repeated YAML blocks within a file.
