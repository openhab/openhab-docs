---
layout: documentation
title: YAML Configuration - Output & Debugging
---

# Output & Debugging

When working with YAML configuration, it's often helpful to see the final resolved output after all substitutions and merges have been applied.
openHAB processes your YAML files before loading them, and this page shows how to inspect that processed output and test changes without applying them.

The sections below describe the available debugging options and how to use them.

[[toc]]

These options let you:

- generate the fully resolved version of a file
- write it to the `_generated` directory
- optionally prevent openHAB from loading the file after it has been processed

All options are defined under the top‑level `preprocessor` key.

## `generate_resolved_file`

When enabled, the preprocessor writes the final, fully resolved YAML output to:

```sh
OPENHAB_CONF/_generated/<relative path of the original file>
```

This file shows exactly what openHAB "sees" after all substitutions, includes, merges, and package expansions have been applied.
Use this when you want to inspect the resolved structure or verify that expressions and includes behave as expected.

```yaml
preprocessor:
  generate_resolved_file: true
```

## `load_into_openhab`

When set to `false`, the file is still processed and (optionally) written to the `_generated` directory, but openHAB will **not** load it.
Instead, openHAB logs a warning explaining that `load_into_openhab: false` was set for this file.
This lets you inspect the resolved output without applying the configuration to your running system.

```yaml
preprocessor:
  load_into_openhab: false
```

## Using Both Options Together

```yaml
preprocessor:
  generate_resolved_file: true
  load_into_openhab: false
```

In this mode:

- The file is fully processed
- The resolved output is written to `_generated/…`
- openHAB does **not** load the resulting configuration

This setup is recommended when testing new YAML structures or debugging substitution behavior.
