---
layout: documentation
title: YAML Configuration - Merge Keys
---

# Merge Keys

Merge keys (`<<`) let you combine mappings defined directly in a mapping with other mappings defined elsewhere, such as:

- [Anchors](anchors.md)
- [!include](include.md) (External files)
- [!insert](templates.md) (In-file Templates)
- [!if](conditionals.md) (Conditionals)
- [Variables](variables.md)

They promote reusability and avoid repetition by letting you define common mappings once and update them in a single place.

[[toc]]

## What Merge Keys Do

A merge key takes one or more source mappings — whether written inline, referenced through an anchor, or loaded from another file — and merges their key–value pairs into the current mapping.
The merged values behave exactly as if they were written inline, while still allowing local fields to add to or override the merged content.

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

## Limitations

- Merge keys only merge mappings, not lists.
- Merge keys cannot modify scalar values.
- Merge keys cannot be used inside sequences unless the sequence elements are mappings.

## Integrating with Other Features

### Anchors

[Anchors](anchors.md) define reusable structures whose content can be inserted into the current mapping via an alias.
Merge keys then combine that anchored content with any local fields in the mapping.
While anchors are a standard YAML feature for sharing data within a single file, [Variables](variables.md) or [Templates](templates.md) are often preferred for more complex needs.

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

### `!include`

The [!include](include.md) tag loads the contents of another file so it can be inserted into the current mapping.
Merge keys then combine the included content with any local fields in the mapping.

**Benefits over anchors:**

- Included files can be **parameterized**, allowing the same structure to be reused with different values.
- Included files can be **shared across many different YAML files**, whereas anchors are limited to a single file.

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

### Templates (`!insert`)

The [!insert](templates.md) tag inserts the contents of an in-file template into the current mapping.
Merge keys then combine the template’s fields with any local fields in that mapping.

**Benefits over anchors:**

- Unlike anchors, templates can be **parameterized** when used through a merge key.
- Unlike `!include`, templates are defined in the same file, making them easier to manage when the logic is specific to a single configuration.

```yaml
templates:
  common_channels:
    power:
      type: switch
      stateTopic: !sub ${id}/power
    availability:
      type: contact
      stateTopic: !sub ${id}/availability

  color_channel:
    color:
      type: color
      stateTopic: !sub ${id}/color

things:
  mqtt:topic:living-room-light:
    channels:
      <<: !insert { template: common_channels, vars: { id: living-room-light } }
      <<: !insert { template: color_channel, vars: { id: living-room-light } }
```

### Conditionals (`!if`)

The [!if](conditionals.md) tag is the most powerful way to conditionally merge content.
Because the engine resolves tags before the merge, you can choose between different mappings or return `null` to skip the merge entirely.

```yaml
# Merge extra settings only for production
server:
  port: 8080
  <<: !if
    if: !sub ${is_prod}
    value: { ssl: true, cache: true }
```

### Substitution (`!sub`)

Merge keys can also combine content produced dynamically by a `!sub` expression.
The key advantage is that `!sub` is type-aware: if a variable contains a map, `!sub` returns that map directly to the merge key.

This also allows for **inline conditional merging** using Python-style expressions:

```yaml
variables:
  has_color: true
  color_channel:
    color:
      type: color

things:
  mqtt:topic:light:
    channels:
      power:
        type: switch
      # Returns color_channel map if true
      <<: !sub ${color_channel if has_color}
```

::: tip Hints:

- Merge keys only merge mappings, so `!sub` must resolve to a map.
- Leave the pattern unquoted; quoting it causes `!sub` to return the value as a literal string.
- Avoid compound patterns (`${foo}${bar}`, `x${foo}`, etc.).
  These are interpreted as literal strings and cannot be merged.
- Merging `null` or an empty map is a no-op, effectively omitting the merge key.
- If you use `!sub` inside an array for a merge key, make sure the array uses block style.

:::

## Debugging Merge Behavior

Use **Output & Debugging** to inspect the fully resolved YAML.
The `_generated` output shows the fully resolved structure after merges, includes, substitutions, and packages.
See the [Output & Debugging](output-debugging.md) page for details on how to inspect the final YAML.

## Related Topics

For details on how variables are resolved and how substitution interacts with YAML structures, see
[Variables & Substitution — Interpolation and Inserted Content](variables.md#interpolation-and-inserted-content).

## Best Practices

- Use merge keys to define reusable base templates.
- Keep anchors inside hidden keys to avoid clutter.
- Use includes, `!include`, or packages to centralize shared structures.
- Use the `_generated` output to verify merge results.
- Prefer simple, predictable structures for reusable blocks.
