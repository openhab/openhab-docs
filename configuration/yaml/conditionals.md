---
layout: documentation
title: YAML Configuration - Conditionals
---

# Conditionals (!if)

The `!if` tag allows you to make your configuration dynamic by evaluating conditions during the preprocessing phase.
The engine resolves these conditions before the final configuration is passed to the main loader.
It can be used to toggle settings, choose configuration snippets, or decide which files to include.

[[toc]]

## When to Use `!if`

Use the `!if` tag when you need to:

- enable or disable parts of a configuration,
- choose between multiple configuration variants,
- conditionally include files or templates,
- or construct dynamic values based on variables.

It is especially useful when a single package or file needs to adapt to different environments or device capabilities.

## Basic Syntax

The `!if` tag supports two forms: a **Mapping Form** for simple logic, and a **Sequence Form** for multiple branches.

### Mapping Form (Simple)

The mapping form is best for binary choices.

```yaml
# Simple boolean check using a substitution
example: !if
  if: !sub ${is_production}
  then: "secure-server-url"
  else: "localhost"
```

| Key    | Description                                                           | Required |
|:-------|:----------------------------------------------------------------------|:---------|
| `if`   | The condition to evaluate. Can be a boolean, a string, or a variable. | Yes      |
| `then` | The value to return if the condition is **truthy**.                   | Yes      |
| `else` | The value to return if the condition is **falsy**.                    | No       |

### Sequence Form (Multiple Branches)

The sequence form allows you to evaluate multiple conditions in order.
The engine stops at the first condition that evaluates to "truthy."

```yaml
environment_type: !if
  - if: !sub ${is_prod}
    then: "production"
  - elseif: !sub ${is_test}
    then: "testing"
  - else: "development"
```

In the sequence form, each item is evaluated top-to-bottom.
If no condition matches and no `else` is provided, the tag resolves to `null`.
A `null` result may cause the key to be omitted entirely depending on the context.

## Truthiness Rules

The `!if` tag evaluates conditions using the following logic:

- **Booleans**: `true` is truthy, `false` is falsy.
- **Strings**: Non-empty strings are truthy, unless the value is exactly `"false"`.
- **Numbers**: Non-zero numbers are truthy; `0` and `0.0` are falsy.
- **Collections**: Lists and Maps are truthy only if they contain at least one item.
- **Null**: Always falsy.

These rules match the substitution engine’s semantics, ensuring consistent behavior across preprocessing features.

## Advanced Integration

The `!if` tag is fully composposable — tags such as `!sub`, `!include`, `!insert`, YAML anchors, and merge keys can be used both in the condition and in the value returned by a branch.
Nested tags inside the chosen branch are then resolved recursively after the condition is met.

### Conditional Merging (Mixins)

The `!if` tag can be used with the YAML merge key (`<<`).
This allows you to conditionally mix in sets of properties.

If the `!if` branch resolves to `null`, the merge key acts as a no-op.

```yaml
# Mix in production-only settings using a merge key
server_config:
  port: 8080
  <<: !if
    if: !sub ${is_prod}
    then:
      ssl_enabled: true
      strict_security: true
    # No 'else' needed; if false, no extra keys are merged
```

> **Note on Context Inheritance**:
> If the parent node is already using a `!sub` tag, nested `!if` blocks inherit that substitution context.
> This allows you to use variables in the `if` condition directly without needing an explicit `!sub` tag inside the conditional.

```yaml
# Inheriting parent !sub context
target: !sub
  <<: !if
    if: ${is_active}
    then: ${feature_data}
```

### Conditional Includes and Inserts

You can include or insert different snippets using the [!include](include.md) or [!insert](insert.md) tags.
Only the tag in the active branch is processed.

```yaml
# Only loads the specific file needed for the environment
network_settings: !if
  if: !sub ${wifi_enabled}
  then: !include wifi-config.inc.yaml
  else: !insert ethernet-template
```

### Dynamic Substitutions

You can use the `!sub` tag within a branch to inject values or return the entire contents of a variable.
Since substitutions are type‑aware, the result can be a simple scalar or a complex structure like a map or list.

```yaml
# The !sub tag can return a string or a whole object/list
database_settings: !if
  if: !sub ${use_external_db}
  then: !sub ${external_db_config_map}
  else:
    driver: "h2"
    url: "jdbc:h2:mem:testdb"
```

### Short-Circuiting and Lazy Evaluation

The `!if` tag uses lazy evaluation for its branches.
It does not process tags found inside inactive branches.
An `!include` for a missing file in an inactive branch will not trigger a warning.

_Note on Syntax_:
All branches must still contain syntactically valid YAML and correctly formatted tags.
The initial YAML engine still parses these blocks even if they are not executed.

## Common Pitfalls

- Omitting `else` in a multi‑branch `!if` may result in `null` if no condition matches.
- Inactive branches must still contain valid YAML, even though they are not evaluated.
