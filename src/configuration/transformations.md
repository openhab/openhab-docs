---
layout: documentation
title: Transformations
---

# Transformations

Transformations are used to translate data from a cluttered or technical raw value to a processed or human-readable representation.
They are often useful, to **interpret received Item values**, like sensor readings or state variables, and to translate them into a human-readable or better processable format.

**Examples:**

- Translation of a technical Binding output, e.g., "CLOSED" can be translated to the Spanish translation "cerrado"
- Processing of a raw Item value, e.g., Parsing a number from a JSON string, like `{ "temperature": 23.2 }`
- Conversion of sensor readings, e.g., temperature in degree Celsius can be converted to degree Fahrenheit

## Installation

Transformations are performed by Transformation services which are available as [transformation add-ons](/addons/#transform).
The relevant add-on needs to be installed via the Main UI or `addons.cfg` before use.

## Usage

Transformations are applicable in Item and Sitemap element labels and inside DSL rules.
Some Transformation services rely on transformation files, while others work by directly providing the transformation logic.
Transformation files need to be placed in the directory `$OPENHAB_CONF/transform`.

1. Item and Sitemap Labels

    Transformations used in the [state/value part]({{base}}/configuration/items.html#state-transformation) of labels are applied **on the fly**.
    While the **transformed value** will (for example) be visible on a Sitemap, the **original value** is stored in the Item.

    The following example shows various Transformation services used in the state part of an Item's label.

    ```java
    Contact Livingroom_Window        "Window [MAP(window_esp.map):%s]"             {/*Some Binding*/}
    Number  Kitchen_Temperature_C    "Temperature [JSONPATH($.temperature):%s °C]" {/*Some Binding*/}
    Number  Livingroom_Temperature_F "Temperature [JS(convert-C-to-F.js):%s °F]"   {/*Some Binding*/}
    ```

    Usage of Transformations in the [label parameter of Sitemap elements]({{base}}/ui/sitemaps.html#element-type-text) works the same way.

    When creating an Item through the UI, the content of the `[]` brackets has to be put into the `pattern` field of the State Description Item metadata.

1. Rules

    Transformations can also be [used in rules]({{base}}/configuration/rules-dsl.html#transformations) to transform/translate/convert data.
    The following shows three Rules DSL examples:

    ```java
    var condition = transform("MAP", "window_esp.map", "CLOSED")
    var temperature = transform("JSONPATH", "$.temperature", jsonstring)
    var fahrenheit = transform("JS", "convert-C-to-F.js", temperature)
    ```

1. Profiles

    Profiles can be used to control the data that is passed between channels of a Thing and Items.
    Transformations can be used in profiles to transform data, both from channel to Item and from Item to channel.
    The distinction from using transformations on Item labels is, that with profiles data is transformed **as it passes through the channel** rather than **on the fly** and the transformed value will be stored in the Item.
    See [profile documentation]({{base}}/configuration/items.html#profiles) for more details.

1. Channels

    Transformations can sometimes be used directly in [binding add-ons](/addons/#binding).
    For example, transforming an openHAB ON command into "action=powerup" for sending to a device.
    Bindings can either implement their own way of handling transformations or use the Channel Transformation provided by the framework.
    If, and how, transformation can be used will be described the individual binding documentation.

## Script Transformation

The script transformation is provided by the framework and allows transforming values using any of the available scripting languages in openHAB (Rules DSL and those provided by [automation add-ons](/addons/#automation)).
openHAB ensures that one and the same script transformation is not executed in parallel, there is no need to program protections against race conditions.

The script needs to be placed in the `$OPENHAB_CONF/transform` folder with the native extension for the chosen language, for example `stringlength.js` for a transformation using [JavaScript Scripting](/addons/automation/jsscripting/).
The script file name here acts as the _script identifier_ for the script transformation.
A script identifier can also refer to a transformation script created in the UI.

The input value is injected into the script context as a _string_ variable `input`.
Additional parameters can be injected into the script by adding them to the script identifier in URL style (`scale.js?correctionFactor=1.1&divider=10` would also inject `correctionFactor` and `divider`).
These additional parameters are also injected into the script context as _string_ variables.
The result of the transformation is provided by the script as its return value.
It can be `null`, a _string_, or a value of a type that properly implements `.toString()`.

The examples show a simple transformation with the same functionality for some languages.
It takes the length of the input string and e.g. returns `String has 5 characters`.

:::: tabs

::: tab DSL

The script file name is `stringlength.dsl` and the transformation is `DSL(stringlength.dsl)`.

```java
var returnValue = "String has " + input.length + " characters"

returnValue
```

:::

::: tab JS

For the modern [JavaScript Scripting](/addons/automation/jsscripting/), the script file name is `stringlength.js` and the transformation is `JS(stringlength.js)`.
For the legacy [JavaScript Scripting Nashorn](/addons/automation/jsscriptingnashorn/), the script file name is `stringlength.nashornjs` and the transformation is `NASHORNJS(stringlength.nashornjs)`.

Note the overall syntax is the same.

```javascript
(function(data) {
  var returnValue = "String has " + data.length + " characters"
  return returnValue
})(input)
```

:::

::: tab Python

The script file name is `stringlength.py` and the transformation is `PY(stringlength.py)`.

```python
"String has " + str(len(input)) + " characters"
```

:::

::: tab JRuby

The script file name is `stringlength.rb` and the transformation is `RB(stringlength.rb)`.

```ruby
"String has #{input.length} characters"
```

:::

::: tab Groovy

The script file name is `stringlength.groovy` and the transformation is `GROOVY(stringlength.groovy)`.

```groovy
"String has ${input.length()} characters"
```

:::

::::

### Inline Script Transformation

A simple transformation rule can also be given as an inline script.
The inline script should start with the `|` character.
Quotes within the script may need to be escaped with a `\` when used within another quoted string such as in sitemaps or text configurations.

Examples for Item and Sitemap Labels:

:::: tabs

::: tab DSL

```java
DSL(|"String has " + input.length + " characters")
```

:::

::: tab JS

For the modern JS Scripting, the transformation is `JS(|...)`.
For the legacy JS Scripting, the transformation is `NASHORNJS(|...)`.

```javascript
JS(|"String has " + input.length + " characters")
```

:::

::: tab Python

```python
PY(|"String has " + str(len(input)) + "characters")
```

:::

::: tab JRuby

```ruby
RB(|"String has #{input.length} characters")
```

:::

::: tab Groovy

```groovy
GROOVY(|"String has ${input.length()} characters")
```

:::

::::

Examples for inline transformations in profiles can be found below.

### Script Transformation Profile

The script transformation is also available as profile. When acting as transformation profile:

- A _string_ return value of `"UNDEF"` or `"NULL"` will be translated to `UnDefType.UNDEF` or `UnDefType.NULL` correspondingly.
- A `null` return value will cause the input to be discarded and not propagated to the destination.

#### Script Transformation Profile Configurations

| Parameter Name          | Description                                                                                                     |
|-------------------------|-----------------------------------------------------------------------------------------------------------------|
| `toItemScript`          | The _script identifier_ for performing transformations from the Thing handler to the item.                      |
| `commandFromItemScript` | The _script identifier_ for performing transformations of **commands** from the item to the Thing handler.      |
| `stateFromItemScript`   | The _script identifier_ for performing transformations of **state updates** from the item to the Thing handler. |

When a script is not provided, the input for that parameter's action will be discarded, similar to when a script returned a `null` value.
So be sure to provide a pass-through script for the relevant parameter as necessary.
A simple inline script would work fine, e.g. `|input` would work for `JS`, `RB` and `GROOVY` scripting.
However, beware that `stateFromItemScript` _should_ be left blank, because normally state updates aren't sent to the Thing, unless there is a specific reason otherwise.

Example usage in an `.items` file:

```java
Number <itemName> { channel="<channelUID>"[profile="transform:JS", toItemScript="decode_json.js", commandFromItemScript="encode_json.js" ] }
```

Here, additional parameters can also be injected into the script using the URL style syntax, e.g.:

```java
Number <itemName> { channel="<channelUID>"[profile="transform:RB", toItemScript="multiply.rb?factor=10", commandFromItemScript="multiply.rb?factor=0.1" ] }
```

Inline script is also supported in the profile syntax:

```java
Number <itemName> { channel="<channelUID>"[profile="transform:RB", toItemScript="| input.to_f * 10", commandFromItemScript="| input.to_f * 0.1" ] }
```

::: tip

You can find the available transformation services [here](/addons/#transform).

:::
