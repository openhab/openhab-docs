---
layout: documentation
title: YAML Configuration - Variables & Substitutions
---

# Variables & Substitution

Variables let you define reusable values and substitute them throughout your YAML configuration.
They make templates flexible, reduce hard‑coded values, and work across both the current file and any included files.

[[toc]]

## Variable Definition

Variables are defined in a top‑level `variables:` section.
It is recommended to place this section at the beginning of the file so it's easier to find.

**Example:**

```yaml
variables:
  # Scalar variables
  expire: 5m,command=OFF
  geolocation: -33.12345, 151.6789

  # Map variable
  mqtt:
    broker: mqtt:broker:mybroker
    server: 1.2.3.4
    username: mqttuser
    password: password

  # List variable
  rooms:
    - Kitchen
    - Bedroom
```

## Variable Substitution

Defining variables is only the first step.
To actually use them inside your YAML structures, you must enable substitution explicitly using the `!sub` tag.

Substitution is opt‑in and controlled, so values are only interpolated where you mark them.
This section explains how substitution works, how to customize it, and how it interacts with anchors, include files, and other reuse mechanisms.

### The `!sub` Tag

Variable substitutions can only occur inside YAML nodes tagged with `!sub`.

When applied to a scalar value, any `${...}` expression inside the string is replaced with the result of the expression.
Substitutions can appear anywhere within the value, so `"Location: ${floorName} – ${roomName}"` will expand to `"Location: Ground Floor – Kitchen"` when those variables are set accordingly.

The same behavior applies to YAML keys.

::: tip Note

The following YAML snippets are not full Thing or Item configurations. They're only meant to show how variable substitution works.

:::

**Example:**

```yaml
variables:
  geolocation: -33.12345, 151.6789
  mqtt:
    broker: mqtt:broker:mybroker
  rooms:
    - Kitchen

things:
  !sub ${mqtt.broker}:
    isBridge: true
    label: MQTT Broker

  astro:sun:home:
    label: Astro Sun
    config:
      geolocation: !sub ${geolocation}

items:
  !sub ${rooms[0]}_Light:
    label: !sub ${rooms[0]} Light
```

The resulting document will be:

```yaml
things:
  mqtt:broker:mybroker:
    isBridge: true
    label: MQTT Broker

  astro:sun:home:
    label: Astro Sun
    config:
      geolocation: -33.12345, 151.6789

items:
  Kitchen_Light:
    label: Kitchen Light
```

### The `!nosub` Tag

When a YAML map or list is tagged with `!sub`, substitutions apply recursively to that structure.

In some cases, you may want to prevent substitutions within part of a structure.
The `!nosub` tag provides this fine‑grained control to disable substitutions for a specific node without affecting the rest of the `!sub` structure.
Both tags apply recursively, and when they overlap, the innermost tag controls whether substitution occurs.

**Example:**

```yaml
top: !sub
  foo: ${substituted}
  bar: !nosub
    baz: ${this will be left alone}
    quux: !sub
      corge: ${substituted}
      garply: !nosub
        waldo: ${left alone}
    grault: ${left alone}
  qux: ${substituted}
  groot: !nosub ${left alone}
```

## Interpolation and Inserted Content

Interpolation (`!sub`) does **not** apply recursively to content that is inserted via [anchors](anchors.md) or [include](include.md) files.
This is because interpolation happens **before** merges and includes are applied.

### Example with an anchor

```yaml
variables:
  room: "Kitchen"

.base: &BASE
  label: "${room}"   # plain scalar, never interpolated

items: !sub
  Item1:
    <<: *BASE        # !sub does NOT re-run interpolation
```

**Result:**

```yaml
items:
  Item1:
    label: "${room}" # literal, not interpolated
```

### Example with an include file

`main.yaml`:

```yaml
variables:
  room: Kitchen
  file: child.inc.yaml

items: !sub
  Item1:
    <<: !include "${file}" # the pattern `${file}` here gets interpolated
                           # but the contents of the file aren't interpolated
                           # just because the !include is under a !sub here
  Item2:
    label: ${room}         # this gets interpolated as normal
```

`child.inc.yaml`

```yaml
label: ${room}             # plain scalar
```

**Result:**

```yaml
items:
  Item1:
    label: ${room}        # literal, not interpolated
  Item2:
    label: Kitchen
```

### Order of Operation

- Variable substitution runs once while a YAML file is processed.
- Included files and anchors are merged afterward, so external `!sub` does not re-run on their contents.
- `!sub` inside an included file will work for that file, but `!sub` outside it won’t change the included data.
- If you want an included file's scalars substituted, put `!sub` in that included file itself.

### Why this matters

This behavior preserves the substitution intent of each piece of data.
If a value is defined as a plain scalar, it remains plain, even when inserted into a `!sub` structure.
If a value is defined with `!sub`, it is interpolated exactly once, using the variables available during the initial processing pass.
This prevents external `!sub` tags from implicitly changing the meaning of data defined elsewhere, and ensures that anchors and include files behave predictably even when they are parameterized through variables or the `vars:` option.

### What “inserted" means

In this context, _inserted_ refers to content brought into the YAML structure through an alias referencing an [anchor](anchors.md) (e.g., `<<: *anchor`) or an `!include` directive.
It does **not** refer to manually pasting or writing the text in that location.
Only structural insertion happens after interpolation, which is why plain values inside anchors or include files are not re‑interpolated when they appear under a `!sub` node.

## Expression Syntax

Expression syntax in openHAB is based on the [Jinja expression](https://jinja.palletsprojects.com/en/stable/templates/#expressions) language (via Jinjava).
Only expressions inside `${...}` are supported — template blocks and macros such as `{% if %}` or `{% for %}` are not available.

The simplest expression contains a variable name.
The expression will be substituted with the content of the variable.

The syntax of variable references:

- `geolocation` — refers to the scalar variable named `geolocation`
- `rooms[0]` — refers to the first element of the list named `rooms`
- `mqtt.username` — refers to the `username` subkey of the `mqtt` map
- `mqtt['username']` — refers to the same `username` subkey
- `mqtt[key]` — refers to the same value as `mqtt.username` when the variable `key` has the value `username`

An expression can also include string, arithmetic, and boolean operations.

**Examples:**

- `"Hello " ~ mqtt.username` — concatenates strings using Jinja's `~` operator
- `rooms[0] ~ " sensor"` — uses a list element and appends text
- `temperature + 5` — adds 5 to the value of the `temperature` variable
- `(width * height) / 100` — performs arithmetic using multiple variables
- `count > 10` — evaluates to `true` if `count` is greater than 10
- `enabled and (mode == "auto")` — combines boolean and comparison operators
- `"Room " ~ (index + 1)` — mixes arithmetic and string concatenation

::: tip String Concatenation

You can concatenate strings inside an expression using the `~` operator:

```yaml
value: !sub "${'Hello ' ~ username}"
```

The `~` operator is the preferred and safer way to concatenate strings because it **automatically converts non‑string operands into strings** before joining them.
By contrast, the `+` operator only works when **both** operands are already strings.

For simple cases, you don't need an expression at all.
Adjacent literal text and substitution patterns are automatically joined:

```yaml
value: !sub "Hello ${username}"
```

This is often clearer and avoids unnecessary use of operators.

:::

### Inline if expressions

Expressions also support Jinja's inline `if` expression form, which selects between values based on a condition.

**Syntax:**

```python
<value_if_true> if <condition> else <value_if_false>
```

The `else` part is **not** optional.

**Examples:**

```yaml
label: !sub "${'Hot' if temperature > 25 else 'Cool'}"
state: !sub "${'ON' if enabled else 'OFF'}"
topic: !sub "${rooms[0] if rooms|length > 0 else 'no-room'}"
```

### Filters

Jinja offers a number of built‑in filters that are useful when building YAML structures.
Filters are applied to a variable or value using the syntax `variable|filter`, and they can be chained, e.g. `variable|filter1|filter2`.

Some commonly used filters are listed below.
For a complete list, see the Jinja documentation: [Jinja Filters](https://jinja.palletsprojects.com/en/stable/templates/#builtin-filters).

| Filter     | Description                                             |
|:-----------|:--------------------------------------------------------|
| capitalize | Capitalize a value.                                     |
| default    | Return a default value if the variable is empty.        |
| first      | Return the first item of a list.                        |
| format     | Apply the given values to a printf-style format string. |
| length     | Return the length of a list or string.                  |
| lower      | Convert a value to lowercase.                           |
| replace    | Replace a substring.                                    |
| title      | Return a titlecased version of the value.               |
| upper      | Convert a value to uppercase.                           |

Expressions and filters can be combined freely, allowing you to compute values, transform text, or derive new strings dynamically.

**Examples:**

- `mqtt.username|upper` — uppercases the username
- `rooms|first|capitalize` — takes the first room and capitalizes it
- `"%s/%s"|format(city, country)` — formats a string with two variables
- `rooms|length` — returns the number of rooms
- `device_name|replace(" ", "_")|lower` — replaces spaces and lowercases the result
- `value|default("unknown")` — uses `"unknown"` if `value` is empty

## Common Pitfalls

When working with expressions and filters, a few patterns can lead to confusing results.
These are the most common issues to watch out for:

::: warning Pitfalls

1. **Forgetting the `!sub` tag**

    Substitution only happens inside nodes tagged with `!sub`.
    If the tag is missing, expressions like `${...}` are left untouched.

    ```yaml
    label: "Room ${index}"       # no substitution happens
    label: !sub "Room ${index}"  # substitution works
    ```

1. **Substitution in keys requires tagging the key or the map**

    Substitution in keys only happens when the key itself — or the map containing it — is tagged with `!sub`.

    ```yaml
    # Tagging the map enables substitution for everything
    # in the map, including all keys and values
    items: !sub
      ${room}_Light:
        label: "Static label"
    ```

    You can also tag just the key if you don't want substitution applied to the whole map:

    ```yaml
    items:
      !sub ${room}_Light:
        label: "Static label"
    ```

1. **Unquoted expressions containing operators**

    Expressions that include operators (`~`, `+`, `-`, `*`, `/`, `==`, etc.) must be quoted, or YAML may misinterpret them.

    ```yaml
    value: !sub "${'Hello ' ~ name}" # Note the "" around the pattern
    ```

1. **Using `+` when you intended string concatenation**

    The `+` operator only works when both operands already have the same type.

    - Two numbers → numeric addition
    - Two strings → string concatenation
    - Mixed types → error

    If your goal is to build strings, use `~`, which always coerces values to text and never fails due to type mismatch.

    ```yaml
    value1: !sub "${1 + 2}"          # → 3    (numeric addition)
    value2: !sub "${'a' + 'b'}"      # → "ab" (string concatenation)
    value3: !sub "${'a' + 1}"        # error  (mixed types)
    value4: !sub "${'a' ~ 1}"        # → "a1" (string coercion + concatenation)
    ```

1. **Confusing string and numeric types in expressions**

    Jinjava respects the types defined in YAML.
    A variable defined as a number behaves numerically; a variable defined as a string behaves textually.
    This affects how operators behave and can lead to surprising results.

    ```yaml
    variables:
      count: 1
      label: "1"

    value1: !sub "${count + 1}"     # → 2    (numeric addition)
    value2: !sub "${label + 1}"     # error  (string + number)
    value3: !sub "${label ~ 1}"     # → "11" (string coercion)
    value4: !sub "${count ~ 1}"     # → "11" (number coerced to string)
    ```

    Use `~` when you want to treat values as text, regardless of how they were defined in YAML.

1. **Mixing filters and strings without `~`**

    When combining filtered values with text, use `~` to ensure proper string conversion.

    ```yaml
    value: !sub "${rooms|length ~ ' rooms'}"
    ```

1. **Whitespace sensitivity**

    Quoted strings preserve all spaces exactly as written.
    But spaces outside quotes — including spaces around expressions inside `${ ... }` — are not preserved.

    ```yaml
    label1: "  padded  "              # spaces preserved
    label2:   padded                  # spaces trimmed by YAML

    label3: !sub "${' x '}"           # → " x " (spaces inside quotes preserved)
    label4: !sub "${   ' x '   }"     # → " x " (outer spaces ignored)
    label5: !sub "${   x   }"         # → value of x only (outer spaces ignored)
    ```

1. **Expecting full Jinja template features**

    Jinjava itself supports statements and macros, but openHAB's YAML substitution layer does **not**.
    openHAB only evaluates `${ ... }` expressions — template blocks such as `{% for %}`, `{% if %}`, and macros are not available.

    ```yaml
    # Supported
    label: !sub "Room ${ index }"

    # Not supported in openHAB
    {% for room in rooms %}
      {{ room }}
    {% endfor %}
    ```

:::

## Advanced Usage

### Custom Pattern Delimiters

Most users never need to change the default `${...}` delimiters.
However, if your content already contains `${...}` patterns or you prefer clearer separation, you can define custom delimiters using the `pattern=` syntax.

```yaml
foo: !sub:pattern=@[..] "Hello @[mqtt.username]!"
bar: !sub:pattern=%(..) "Hello %(mqtt.username)!"
```

The syntax is `!sub:pattern=begin..end`, where `begin` is the opening delimiter and `end` is the closing delimiter.

In the example above, `@[` is the opening delimiter and `]` is the closing delimiter.
The two delimiters are separated by the literal `..` sequence.

Choose delimiters that are unlikely to appear in your content to avoid unintentional substitutions.

::: tip URL‑Encoding Note

Some characters cannot appear directly in a `!sub` tag and must be URL‑encoded.

You can generate URL‑encoded text using your browser's built‑in JavaScript function: `encodeURIComponent("your text here")`.
This works in all modern browsers and doesn't rely on any external tools.

Here are the most common ones:

:::

| Literal | URL-Encoded | Comments                                                                                                        |
|:-------:|:-----------:|-----------------------------------------------------------------------------------------------------------------|
|   `!`   |    `%21`    | Example: `!sub:pattern=%21[..]` -> `![ expression ]`                                                            |
|   `#`   |    `%23`    | Since `#` is a YAML Comment symbol, make sure your value is quoted.                                             |
|   `^`   |    `%5E`    |                                                                                                                 |
|   `&`   |    `%26`    |                                                                                                                 |
|   `{`   |    `%7B`    | This uses the standard Jinja delimiters: `!sub:pattern=%7B%7B..%7D%7D` -> <span v-pre>`{{ expression }}`</span> |
|   `}`   |    `%7D`    |                                                                                                                 |
|   `<`   |    `%3C`    |                                                                                                                 |
|   `>`   |    `%3E`    |                                                                                                                 |

`[`, `]`, `(`, and `)` are safe and can be used literally without encoding them.

### `VARS` and Reserved Keywords

Some variable names cannot be referenced normally because Jinja reserves them as expression keywords.

For instance, if you have a variable `and: green`, it cannot be accessed directly, because `and` is the logical‑AND operator in Jinja expressions.
Writing `${"red " + and + " blue"}` will not evaluate to `red green blue` — Jinja will treat `and` as the operator and produce a syntax error.

::: tip How to Reference Variables That Use Reserved Keywords

When a variable name collides with a Jinja reserved keyword, you can access it through the `VARS` dictionary:

```yaml
foo: !sub ${VARS['and']}
```

:::

This form is also useful when a variable name contains characters that are normally invalid in expressions, such as `living-room` or even `living room`.
It is likewise useful when the variable name itself is stored in another variable.
However, for simplicity and readability, such naming patterns should generally be avoided.

### Predefined Variables

openHAB injects a set of predefined variables that are automatically available during YAML preprocessing.

Available Predefined Variables:

| Variable           | Description                                                                                                                                            |
|:-------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------|
| `OPENHAB_CONF`     | Absolute path to openHAB's main configuration directory. Typically `/etc/openhab` (apt) or `/openhab/conf` (Docker).                                   |
| `OPENHAB_USERDATA` | Absolute path to openHAB's userdata directory. Typically `/var/lib/openhab` (apt) or `/openhab/userdata` (Docker).                                     |
| `__FILE__`         | Absolute path to the current file, e.g. `/path/to/file.inc.yaml`.                                                                                      |
| `__FILE_NAME__`    | Filename portion without the extension or leading path, e.g. `file.inc`.                                                                               |
| `__FILE_EXT__`     | File extension portion of the current file name, e.g. `yaml`.                                                                                          |
| `__DIRECTORY__`    | Directory portion of the current file, e.g. `/path/to`.                                                                                                |
| `__DIR__`          | Alias for `__DIRECTORY__`.                                                                                                                             |
| `package_id`       | In a package file, automatically resolved to the [Package ID](packages.md#package-syntax-and-structure). Available only within included package files. |

These variables can be interpolated just like regular ones using `${...}` syntax.
They may be helpful when constructing paths for the [!include](include.md) directive.

### Referencing Other Variables During Definition

Variables may reference **other variables**, including those defined earlier in the **same** `variables:` block.
The only requirement is that the referenced variable is defined before it is used.

**Example:**

```yaml
variables:
  foo: bar
  baz: !sub ${foo|upper}   # => foo is defined before baz
```

Variables can also reference [inherited variables](include.md#variable-resolution-order) when used inside included files or packages:

`main.yaml`:

```yaml
variables:
  room: "Kitchen"

items:
  !include child.inc.yaml
```

`child.inc.yaml`:

```yaml
variables:
  label: !sub ${room} Light   # => "Kitchen Light"

ExampleItem:
  label: !sub ${label}
```

### Calling Java Methods

Inside an expression, variables keep their actual Java types, so you can call methods on them just as you would in Java.

Common types you may encounter include:

- [`String`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html)
- [`Integer`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html)
- [`Double`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Double.html)
- [`Boolean`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Boolean.html)
- [`Map`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Map.html)
- [`List`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html)

This is especially useful when you need functionality beyond the built‑in filters — for example, using `String.replaceAll()` with regular expressions.

**Example:**

```yaml
# This file is included from a packages section.
# ${package_id} is provided by the main file; here it is "LivingRoom_Light".
variables:
  # Convert "LivingRoom_Light" -> "Living Room Light"
  label: '${package_id.replaceAll("([a-z])([A-Z])", "$1 $2") | replace("_", " ")}'

items: !sub
  ${package_id}:
    type: Group
    label: ${label}
```
