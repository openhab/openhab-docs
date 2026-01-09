---
layout: documentation
title: Merge Keys
---

# Merge Keys

Merge keys (`<<:`) allow one mapping (a key–value object) to inherit the contents of another.
They reduce duplication, make configuration more maintainable, and work anywhere a mapping is defined.
Merge keys integrate cleanly with anchors.

[[toc]]

## What Merge Keys Do

A merge key inserts the contents of one mapping into another.

```yaml
.base: &BASE
  icon: default
  autoupdate: false

items:
  MyItem:
    <<: *BASE
    label: My Item
```

Result:

```yaml
items:
  MyItem:
    label: My Item
    icon: default
    autoupdate: false
```

## Merge Rules

- Only mappings can be merged.
- Local keys override merged keys.
- Merge order matters: keys from earlier mapping nodes override keys from later ones.
- Merges are shallow; nested mappings are replaced, not combined.
- Merge keys can appear multiple times or as a list.

### Example: Multiple Merges and Precedence

```yaml
.defaults: &DEFAULTS
  icon: default
  autoupdate: false

.metadata: &METADATA
  tags: [Light]
  icon: metadata-icon

items:
  Lamp:
    <<: [*DEFAULTS, *METADATA]
    label: Desk Lamp
```

Result:

```yaml
items:
  Lamp:
    label: Desk Lamp
    icon: default        # from DEFAULTS (earlier mapping wins)
    autoupdate: false
    tags: [Light]
```

## Using Merge Keys with Anchors

Anchors define reusable structures that merge keys can insert.

```yaml
.hidden:
  light-base: &LIGHT_BASE
    type: Switch
    icon: light
    autoupdate: false

items:
  Light1:
    <<: *LIGHT_BASE
    label: Light One

  Light2:
    <<: *LIGHT_BASE
    label: Light Two
```

## Debugging Merge Behavior

Use **Output & Debugging** to inspect the fully resolved YAML.
The `_generated` output shows the final structure after merges, includes, and packages.
See the [Output & Debugging](output-debugging.md) page for details on how to inspect the fully resolved YAML.

## Related Topics

For details on how variables are resolved and how substitution interacts with YAML structures, see
[Variables & Substitution — Interpolation and Inserted Content](variables.md#interpolation-and-inserted-content).

## Limitations

- Merge keys only merge mappings, not lists.
- Merge keys cannot modify scalar values.
- Merge keys cannot be used inside sequences unless the sequence elements are mappings.

## Best Practices

- Use merge keys to define reusable base templates.
- Keep anchors inside hidden keys to avoid clutter.
- Use includes or packages to centralize shared structures.
- Use `_generated` output to verify merge results.
- Prefer simple, predictable structures for reusable blocks.

---

Merge keys are a practical, widely supported YAML feature that integrates naturally with openHAB’s configuration system.
They provide a clean way to reuse and extend mappings without duplication.
