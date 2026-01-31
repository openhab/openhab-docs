---
layout: documentation
title: YAML Configuration - Advanced Features Overview
---

# Advanced Features Overview

openHAB extends standard YAML with additional capabilities that support modular, reusable, and maintainable configuration files.
These capabilities work together during a preprocessing stage that assembles the final YAML document that openHAB loads.

[[toc]]

## Feature Summary

openHAB adds several enhancements on top of standard YAML.
Each feature solves a different kind of reuse or composition problem.

| Feature                                  | Purpose                                                   | Typical Use                                                                                                    |
|------------------------------------------|-----------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| **Variables & Substitution (`!sub`)**    | Insert dynamic values or evaluate expressions             | Build labels, topics, IDs, or computed values                                                                  |
| **Conditionals (`!if`)**                 | Conditionally include or exclude YAML blocks              | Selective feature inclusion when using packages or templates flags                                             |
| **Include (`!include`)**                 | Insert the contents of another file                       | Reuse YAML across files; parameterize reusable blocks                                                          |
| **Templates (`!insert`)**                | Reuse YAML defined within the same file                   | Parameterized blocks local to a file; reusable channel/item fragments                                          |
| **Packages**                             | Bundle multiple top‑level sections into one reusable unit | Define reusable device structures containing things, items, metadata; sourced from external files or templates |
| **Anchors & Aliases (`&name`, `*name`)** | Define small, reusable YAML fragments                     | Static defaults, shared fields                                                                                 |
| **Merge Keys (`<<:`)**                   | Combine mappings from multiple sources                    | Layer defaults, override fields, compose structures                                                            |

You can learn more about each feature on its dedicated page:

- [Variables & Substitution](variables.md)
- [Conditionals](conditionals.md)
- [Include](include.md)
- [Templates](templates.md)
- [Packages](packages.md)
- [Anchors](anchors.md)
- [Merge Keys](merge-keys.md)

These features are independent, but they become especially powerful when used together.

## Preprocessing Overview

Before openHAB loads your YAML configuration, it performs a **preprocessing pass** that expands all advanced features into a single, fully resolved document.

During preprocessing, openHAB performs these steps:

1. **YAML Parsing**: The initial file is read and parsed into a memory structure.
1. **Variable Substitution (`!sub`)**: Expressions are evaluated and injected.
1. **Conditionals (`!if`)**: Logic is evaluated to determine which blocks of YAML to keep or discard based on the current context.
1. **Template & Include Expansion**: `!insert` and `!include` pull in content, often using the resolved variables.
1. **Package Expansion**: External or local packages are loaded and their internal structures are expanded.
1. **Recursive Merging**: The preprocessor merges the expanded packages into the main document’s top-level sections.
1. **Hidden Key Removal**: Keys starting with `.` are stripped from the final output.

The result is a complete YAML structure with:

- all variables and logic resolved
- all templates and includes expanded
- all anchors and merges applied
- all packages integrated
- all hidden keys removed

This final expanded document is what openHAB interprets as Things, Items, Tags, and other configuration elements as defined by the [Core Structure](index.md).

## Output & Debugging

When working with YAML configuration, it is often helpful to inspect the **final resolved output** after all substitutions, includes, merges, and package expansions have been applied.
openHAB provides debugging tools that let you see exactly what the preprocessor produces before the configuration is loaded.

These tools are configured through the top‑level `preprocessor:` section:

```yaml
preprocessor:
  generate_resolved_file: [true | false]
  load_into_openhab: [true | false]
```

### `generate_resolved_file`

When enabled, the preprocessor writes the final, fully expanded YAML to:

```xml
$OPENHAB_CONF/yaml/_generated/<PATH_TO_ORIGINAL_FILE>
```

This output shows exactly what openHAB "sees" after preprocessing and is the most effective way to debug advanced YAML features.

### `load_into_openhab`

When set to `false`, the file is still processed and (optionally) written to `_generated/`, but openHAB will **not** load it.
A warning is logged to indicate that loading was intentionally disabled.

This is ideal when experimenting with new YAML structures or verifying preprocessing behavior without affecting your running system.

## Hidden Keys

YAML keys beginning with a dot (`.`) are treated as **hidden**.
Hidden keys:

- are only available during preprocessing
- are ideal for storing anchors, templates, or shared structures
- help keep the visible configuration clean and readable
- are stripped away before the preprocessor produces the final output for openHAB's runtime

**Example:**

```yaml
.base-switch: &BASE_SWITCH
  type: Switch
  autoupdate: false

items:
  Light1:
    <<: *BASE_SWITCH
    label: Light One
```

## File Structure and Conventions

Although YAML files can be structured flexibly, the following conventions improve readability and maintainability:

- Place `variables:` and `templates:` at the top of the file.
- Group reusable structures under hidden keys.
- Use anchors for static templates and includes for parameterized ones.
- Use `_generated` output to verify the final structure.

These conventions are not required, but they help keep complex configurations predictable.
