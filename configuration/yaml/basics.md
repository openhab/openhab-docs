---
layout: documentation
title: YAML Configuration - Basics
---

# Standard YAML Syntax

This page introduces the standard YAML syntax used throughout the openHAB documentation.
It is not a full YAML tutorial.
It provides the foundational YAML concepts needed to understand and work with the examples in the YAML Configuration section.

openHAB builds on top of standard YAML 1.1 and adds its own processing features such as custom tags and preprocessing behavior.
This page focuses on the core YAML syntax that those features extend.

For more detailed information on the YAML 1.1 syntax supported in openHAB configurations, see the [YAML 1.1 specification](https://yaml.org/spec/1.1/).

[[toc]]

## Indentation and Structure

YAML uses indentation to represent structure.

- Indentation defines the nesting level
- Only spaces are allowed
- Tabs are not permitted for indentation
- All items at the same level must use the same indentation

openHAB recommends using **two spaces** per indentation level for consistency.

```yaml
thing:
  id: myThing
  label: "Example Thing"
```

Misaligned indentation is one of the most common YAML errors.

## Block Style vs Flow Style

YAML supports two ways of expressing mappings and lists.

### Block Style (Recommended)

Block style is the most readable form.

```yaml
item:
  type: Switch
  label: "Lamp"
  tags:
    - Light
    - LivingRoom
```

### Flow Style

Flow style is more compact and resembles JSON.
It is functionally identical to block style.

```yaml
item: { type: Switch, label: "Lamp", tags: [Light, LivingRoom] }
```

YAML allows block and flow styles to be mixed freely.

## Comments

- Comments begin with `#`.
- Comments continue to the end of the line.
- Comments may appear on their own line or after a value.

```yaml
# This is a comment describing the thing
thing:
  id: myThing  # Inline comment
  label: "Example Thing"
```

## Data Types

YAML defines three fundamental data types: **scalars**, **lists** (sequences), and **mappings**.

### Scalars

Scalars represent simple values such as strings, numbers, booleans, and nulls.

#### Booleans

In openHAB YAML files, only unquoted `true` and `false` (case insensitive) are valid boolean values.
`ON`, `OFF`, `Yes`, `No`, `enable`, and `disable` are parsed as plain strings.
To specify `true` or `false` as a string, they must be enclosed in single or double quotes.

#### Strings

Strings may be written with or without quotes.

Unquoted strings are allowed only when the value **cannot** be interpreted as another YAML scalar type (such as a number, boolean, or null).
In practice, this means unquoted strings should contain letters or simple punctuation, but **not** values that look like numbers or booleans.

```yaml
name: KitchenLight
label: Kitchen Light
role: admin
```

If a value _could_ be parsed as a number, boolean, or null, it must be quoted to ensure it is treated as a string.

```yaml
string_number: "123"
string_boolean: "true"
string_null: "null"
```

Quotes are required when:

- The string contains characters that YAML may interpret as syntax.
- The string contains leading or trailing spaces.
- The string contains a colon followed by a space, which YAML interprets as a key/value separator.

```yaml
label: "Kitchen: Main Light"
note: "  This string preserves leading spaces"
```

Single‑quoted and double‑quoted strings behave differently.

- Single‑quoted strings treat the content literally.
- Single‑quoted strings do not process escape sequences.
- Single‑quoted strings are useful when you want the text to appear exactly as written.

```yaml
description: 'This string contains \n and it will not be interpreted as a newline'
```

- Double‑quoted strings support escape sequences.
- Double‑quoted strings allow characters such as `\n`, `\t`, and `\"` to be interpreted.

```yaml
message: "Line one\nLine two"
```

- Use single quotes when you want literal text or when the string contains double quotes.
- Use double quotes when you need escape sequences or when the string contains single quotes and requires escaping.

#### Multiline Strings

Multiline strings are used for longer descriptions or scripts.

Use `|` to preserve line breaks exactly as written.

```yaml
description: |
  This is a multi-line
  description.
  Line breaks are preserved.
```

Use `>` to fold lines into a single paragraph.

```yaml
notes: >
  This text will be folded
  into a single line,
  with spaces instead of line breaks.
```

- `|` preserves line breaks.
- `>` folds single line breaks into spaces.
- Blank lines are preserved when using `>`.
- Indentation under `|` or `>` must be consistent and becomes part of the string.

#### Numbers

YAML supports numeric scalar values without requiring quotes.
A number is interpreted as a numeric type when it contains only digits (with an optional sign, decimal point, or exponent).

##### Valid Examples

```yaml
positive_integer: 42
negative_integer: -7
decimal_number: 3.1415
negative_decimal: -0.25
scientific_notation: 1.2e6
```

##### When to Use Quotes

Numbers must be quoted if you want them treated as **strings**:

```yaml
string_number: "42"
leading_zero_string: "007"
```

#### Null

YAML supports a null value using any of the following forms:

```yaml
value1: null
value2: Null
value3: NULL
value4: ~
value5:
```

All of these are interpreted as `null`.

::: tip Null in openHAB
openHAB converts `null` values into empty strings (`""`).
Null cannot be used to remove or unset a value.
:::

### Lists (Sequences)

Lists are introduced with a dash (`-`) at the start of each item.

```yaml
tags:
  - Light
  - LivingRoom
```

Flow style is also supported:

```yaml
tags: [Light, LivingRoom]
```

### Mappings (Key/Value Pairs)

Mappings define key/value structures.

```yaml
stateDescription:
  config:
    pattern: "%.1f °C"
```

Flow style is also supported:

```yaml
stateDescription: { config: { pattern: "%.1f °C" } }
```

#### How YAML Identifies a Mapping Entry

A mapping entry uses the pattern:

```yaml
key: value
```

The space after the colon is required.

```yaml
text: "Alice: Hello"        # Must be quoted because the colon is followed by a space
url: http://example.com     # Safe unquoted because the colon is not followed by a space
```

## Anchors and Aliases

Anchors define reusable blocks.
Aliases reference those blocks.

```yaml
defaults: &defaultConfig
  refresh: 60
  geolocation: 1.23456, 7.890123

thing:
  label: "Lamp"
  config: *defaultConfig
```

For more details, see [Anchors and Aliases](anchors.md).

## Merge Keys

YAML merge keys use the `<<:` syntax to merge mappings.

```yaml
base: &base
  type: Switch
  category: Light

item:
  <<: *base
  label: "Desk Lamp"
```

Effective Structure:

```yaml
item:
  type: Switch
  category: Light
  label: "Desk Lamp"
```

For more details, see [Merge Keys](merge-keys.md).

## YAML Tags (brief introduction)

YAML supports _tags_, which change how a value is interpreted.
Some tags are built in (used for YAML’s standard data types), and openHAB adds a few **custom tags** such as `!sub`, `!nosub`, and `!include` to enable enhanced features.

A tag can be applied to a simple scalar:

```yaml
value: !sub ${room}
```

Here, `!sub` is applied to the scalar value.

A tag can also be applied to a mapping. In that case, the **entire mapping belongs to the tag**:

```yaml
thing: !sub
  label: ${room} Light
  id: ${room}_Light
```

You’ll see these custom tags throughout the enhanced YAML configuration.

## Common Pitfalls

- Using tab characters instead of spaces for indentation.
- Using inconsistent indentation.
- Misaligning list items.
- Omitting quotes around strings containing special characters.
- Incorrectly nesting mappings.
- Incorrect indentation under `|` or `>` for multiline strings.

If a YAML file fails to load, indentation, quoting, or multiline formatting issues are often the cause.

---

For openHAB‑specific YAML enhancements such as variables, includes, packages, and advanced merging behavior, see the [Advanced Features Overview](advanced-features-overview.md).
