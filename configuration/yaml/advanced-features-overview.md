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

| Feature                                  | Purpose                                                   | Typical Use                                                            |
|------------------------------------------|-----------------------------------------------------------|------------------------------------------------------------------------|
| **Variables & Substitution (`!sub`)**    | Insert dynamic values or evaluate expressions             | Build labels, topics, IDs, or computed values                          |
| **Include (`!include`)**                 | Insert the contents of another file                       | Reuse templates across files; parameterize blocks                      |
| **Packages**                             | Bundle multiple top‑level sections into one reusable unit | Create a device template which contains its thing(s) and related items |
| **Anchors & Aliases (`&name`, `*name`)** | Define small, reusable snippets                           | Static templates, defaults                                             |
| **Merge Keys (`<<:`)**                   | Combine mappings from multiple sources                    | Layer defaults, override fields, compose structures                    |

You can learn more about each feature on its dedicated page:

- [Variables & Substitution](variables.md)
- [Include](include.md)
- [Packages](packages.md)
- [Anchors & Aliases](anchors.md)
- [Merge Keys](merge-keys.md)

These features are independent, but they become especially powerful when used together.

## Preprocessing Overview

Before openHAB loads your YAML configuration, it performs a **preprocessing pass** that expands all advanced features into a single, fully resolved document.

During preprocessing, openHAB performs these steps:

- substitutes variables (`!sub`)
- loads and integrates includes (`!include`)
- loads anchors and resolves aliases
- applies merge keys (`<<:`)
- loads and integrates packages

The result is a complete YAML structure with:

- all variables resolved
- all includes inserted
- all anchors and merges applied
- all packages integrated
- all hidden keys removed

This final expanded document is what openHAB interprets as Things, Items, Tags, and other configuration elements as defined by the [Core Structure](index.md).

Understanding preprocessing is essential when designing reusable templates or debugging unexpected behavior.

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

```text
$OPENHAB_CONF/yaml/_generated/PATH_TO_ORIGINAL_FILE
```

This output shows exactly what openHAB "sees" after preprocessing and is the most effective way to debug advanced YAML features.

**Example:**

```yaml
preprocessor:
  generate_resolved_file: true
```

### `load_into_openhab`

When set to `false`, the file is still processed and (optionally) written to `_generated/`, but openHAB will **not** load it.
A warning is logged to indicate that loading was intentionally disabled.

This is ideal when experimenting with new YAML structures or verifying preprocessing behavior without affecting your running system.

**Example:**

```yaml
preprocessor:
  load_into_openhab: false
```

### Using Both Options Together

```yaml
preprocessor:
  generate_resolved_file: true
  load_into_openhab: false
```

In this mode:

- the file is fully preprocessed
- the resolved output is written to `_generated/…`
- openHAB does **not** load the resulting configuration

This is the recommended setup when testing new templates, debugging substitution issues, or validating include/merge behavior.

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

Hidden keys are a convenient place to define reusable blocks without cluttering the main configuration.

## File Structure and Conventions

Although YAML files can be structured flexibly, the following conventions improve readability and maintainability:

- Place `variables:` at the top of the file.
- Group reusable structures under hidden keys.
- Keep includes and packages near the top‑level sections they affect.
- Use anchors for static templates and includes for parameterized ones.
- Use `_generated` output to verify the final structure.

These conventions are not required, but they help keep complex configurations predictable.
