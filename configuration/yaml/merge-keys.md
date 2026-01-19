---
layout: documentation
title: YAML Configuration - Merge Keys
---

# Merge Keys

Merge keys (`<<:`) let you combine mappings defined directly in a mapping with other mappings defined elsewhere, such as:

- anchors
- `!include`
- [variables](variables.md)

They promote reusability and avoid repetition by letting you define common mappings once and update them in a single place, with changes applied everywhere they are merged.

[[toc]]

## What Merge Keys Do

A merge key takes one or more source mappings — whether written inline, referenced through an anchor, or loaded from another file — and merges their key–value pairs into the current mapping.
The merged values behave exactly as if they were written inline, while still allowing local fields to add to or override the merged content.

## Using Merge Keys with Anchors

[Anchors](anchors.md) define reusable structures whose content can be inserted into the current mapping via an alias.
Merge keys then combine that anchored content with any local fields in the mapping.
This is the most common pattern for sharing defaults across multiple items.

```yaml
items:
  Light1: &LIGHT_BASE
    type: Switch
    icon: light
    autoupdate: false
    label: Light One

  Light2:
    <<: *LIGHT_BASE
    label: Light Two
```

See also: [Using Hidden Keys for Anchors](anchors.md#using-hidden-keys-for-anchors)

## Using Merge Keys with `!include`

[`!include`](include.md) loads the contents of another file so it can be inserted into the current mapping.
Merge keys then combine the included content with any local fields in the mapping.

Benefits over anchors:

- Included files can be parameterized, allowing the same structure to be reused with different values.
- Included files can be shared across many different YAML files, not just within a single one.

```yaml
# light-common.inc.yaml - all types of lights share this
power:
  type: switch
  stateTopic: !sub ${id}/power
availability:
  type: contact
  stateTopic: !sub ${id}/availability
```

```yaml
# light-color.inc.yaml - only for RGB lights
color:
  type: color
  stateTopic: !sub ${id}/color
```

```yaml
# main.yaml
things:
  mqtt:topic:living-room-light:
    channels:
      <<: !include { file: light-common.inc.yaml, vars: { id: living-room-light } }
      <<: !include { file: light-color.inc.yaml, vars: { id: living-room-light } }
```

## Using Merge Keys with `!sub`

In addition to anchors and included files, merge keys can also combine content produced dynamically by a `!sub` expression.
The key advantage is that, when used with a [conditional expression](variables.md#conditional-expressions), a `!sub` expression can resolve to **either a mapping or an empty map**.
This lets you conditionally merge a block — or skip it entirely — based on variables or expressions.

Simple example:

```yaml
variables:
  color_channel:
    color:
      type: color

things:
  mqtt:topic:light:
    channels:
      power:
        type: switch
      <<: !sub ${color_channel}
```

Example with conditional expression:

```yaml
variables:
  has_color: true # Set to false to skip merging color_channel

  color_channel:
    color:
      type: color

  empty_map: {}

things:
  mqtt:topic:light:
    channels:
      power:
        type: switch
      <<: !sub ${color_channel if has_color else empty_map}
```

This is especially useful in package files, where you can parameterize which channels a Thing includes and which Items are created.

::: tip Hints:

- Place the pattern directly after `!sub` without quotes.
- The result of the substitution has to be a map, since it gets merged into the parent map.
- If you use `!sub` inside an array for a merge key, make sure the array uses block style.

:::

## Merge Rules

- Only mappings can be merged.
- Merge keys may appear multiple times or as a list.
- Merge order matters: keys from earlier mappings override keys from later ones.
- Local keys always override merged keys, even when defined after a merge key.
- Merges are shallow: nested mappings are replaced, not combined.

### Example: Multiple Merges and Precedence

```yaml
.defaults: &DEFAULTS
  icon: default
  autoupdate: false

.metadata: &LIGHTS
  tags: [Light]
  icon: light

items:
  Lamp:
    <<: [*LIGHTS, *DEFAULTS]
    label: Desk Lamp
```

Result:

```yaml
items:
  Lamp:
    label: Desk Lamp
    icon: light        # from LIGHTS (earlier mapping wins)
    autoupdate: false
    tags: [Light]
```

## Debugging Merge Behavior

Use **Output & Debugging** to inspect the fully resolved YAML.
The `_generated` output shows the fully resolved structure after merges, includes, substitutions, and packages.
See the [Output & Debugging](output-debugging.md) page for details on how to inspect the final YAML.

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
- Use includes, `!include`, or packages to centralize shared structures.
- Use the `_generated` output to verify merge results.
- Prefer simple, predictable structures for reusable blocks.

---

Merge keys are a practical, widely supported YAML feature that integrates naturally with openHAB's configuration system.
They offer a clean, predictable way to reuse and extend mappings without duplication.
