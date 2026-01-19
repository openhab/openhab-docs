---
layout: documentation
title: YAML Configuration - Templates
---

# Templates

Templates let you define reusable blocks of YAML directly within the same file.
They are stored under the top‑level `templates:` section and can be expanded using the `!insert` tag.

Templates behave similarly to `!include`, with the main difference that they are defined locally rather than in external files.
Everything else about how they are evaluated — including variable scoping and per‑invocation isolation — works the same way as `!include`.

[[toc]]

## What Templates Are

A template is a named YAML node stored under the top-level `templates:` section.
A template may contain **any YAML value**:

- a mapping
- a sequence
- a scalar

The keys under `templates:` (`simple_greeting`, `greeting`, `channel_block`, `color_list`) are **template names**.
They identify each template and are not part of the template’s content.

Example:

```yaml
templates:
  simple_greeting: Hello!
  greeting: !sub Hello, ${name}!
  channel_block:
    power:
      type: switch
      stateTopic: !sub ${id}/power
  color_list:
    - red
    - green
    - blue
```

::: tip Important!

Templates are not evaluated when defined.
They are evaluated **each time** they are expanded with `!insert`.
Therefore, a template may contain references to variables that do not yet exist; those variables are supplied later during the `!insert` invocation.

:::

## Syntax Options

`!insert` expands a template at the point where it appears.
It supports two forms:

### Short Form

```yaml
message: !insert simple_greeting
```

Use this when you don’t need to explicitly pass any variables.

### Long Form (supports variables)

```yaml
# Block style (multi-line)
message: !insert
  template: greeting
  vars:
    name: "Jimmy"

# Or flow style (single-line)
message: !insert { template: greeting, vars: { name: "Jimmy" } }
```

The `vars:` mapping is layered on top of the file’s current variables to form the evaluation context.
In the long form, the `vars:` section is optional.

## How Template Evaluation Works

Each `!insert` call is evaluated in its **own isolated context**:

- It begins with all variables defined in the current file.
- If this file was loaded via `!include`, it also inherits variables from parent files.
- Variables provided through `vars:` override or extend this context.
- The template body is evaluated using this combined set of variables.
- The resulting value — scalar, list, or mapping — replaces the `!insert` node.

This makes templates flexible and reusable.

### Example: Scalar Template

```yaml
templates:
  greeting: !sub Hello, ${name}!

message: !insert { template: greeting, vars: { name: "Alice" } }
```

Result:

```yaml
message: Hello, Alice!
```

### Example: Template Producing a Mapping

```yaml
templates:
  channel_block:
    power:
      type: switch
      stateTopic: !sub ${id}/power

thing:
  channels: !insert { template: channel_block, vars: { id: living-room-light } }
```

### Example: Template as a List Item

```yaml
templates:
  color_entry: !sub ${color}

colors:
  - !insert { template: color_entry, vars: { color: red } }
  - !insert { template: color_entry, vars: { color: green } }
  - !insert { template: color_entry, vars: { color: blue } }
```

### Example: Template Producing a Sequence

```yaml
templates:
  rgb:
    - red
    - green
    - blue

palette: !insert rgb
```

## Similarities with `!include`

Templates and includes share the same evaluation model:

- Each invocation is evaluated in its own isolated context.
- The context includes:
  - variables defined in the current file
  - variables inherited from parent files (if this file was loaded via `!include`)
  - variables provided through `vars:` for this specific invocation
- Variable resolution inside the template uses this combined context.

This makes template behavior predictable and consistent with `!include`.

## Template Scope and Variable Resolution

Inside a template:

- The `!sub` tag marks nodes for interpolation, but interpolation happens only when the template is inserted.
- `${var}` resolves using the combined variable context described above.
- Each `!insert` call is isolated — variables from one invocation do not leak into another.

## Limitations

- Templates must be defined under the top‑level `templates:` section.
- Templates cannot be shared across files (use `!include` for that).
- Template names must be unique within the file.
- A template may produce any YAML value, but the resulting value must be valid for the location where it is inserted (scalar, list item, or mapping field).

## Best Practices

- Use templates for reusable blocks that belong logically to a single file.
- Use `!include` for shared structures reused across multiple files.
- Keep template names descriptive and consistent.
- Prefer the long form when passing variables for clarity.
- Use the `_generated` output to verify template expansion.

---

In‑file templates provide a flexible, parameterizable way to structure reusable YAML within a single file.
They complement `!include` and anchors, offering a clean mechanism for building consistent configurations.
