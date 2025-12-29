---
layout: documentation
title: Widget Expressions & Variables
---

# Widget Expressions & Variables

When designing pages and widgets, you might want a config property of a widget (on pages) or of components (inside widgets) to be dynamically updated. - Expressions allow you to that.

Variables are a way to allow more complex scenarios in pages & personal widget development.

The widget expression system uses a JavaScript-like expression parser, [jse-eval](https://github.com/6utt3rfly/jse-eval).
In order to remain light-weight and responsive, this is not a complete JavaScript library, but nearly all the basic functionality is provided along with some more advanced features.

## Expressions Overview

Expressions are string literals beginning with the symbol `=` and everything after it is evaluated using a syntax very similar to JavaScript.
You can use arithmetic or string operations etc., the [conditional (ternary) operator](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Conditional_Operator), as well as the following objects (subject to evolutions):

- `items` is a dynamic key/value dictionary allowing you to retrieve the state of any Item:
  The result of `items.Item1` will be an object like `{ state: '23', displayState: '23 °C', numericState: 23, unit: '°C', type: 'Decimal' }` (`displayState`, `numericState` and `unit` may be omitted).
  You can therefore use `items.Item1.state` to use the current state of `Item1` in your expression, and if the state changes, the expression will be reevaluated.
- `props` is a dictionary of the key/values of self-defined props for the current personal widget, or page (pages, like any root UI components, may indeed have props).
  It is indispensable to use props in expressions when developing a personal widget to pass configuration from the page to the widget.
- `config` is a dictionary of the key/values of the configuration of the current component/widget.
- `vars` is a dictionary of [variables](#variables) that are available in the component's context
- `loop` is a dictionary containing iteration information when you're repeating components from a source collection.
  It is defined only when in the context of an `oh-repeater` component.
- The JavaScript `Math` object (so you can use `Math.floor(...)`, `Math.round(...)` and the like) (see [mdn web docs: Math](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math))
- The JavaScript `Number` object (see [mdn web docs: Number](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number))
- The JavaScript `JSON` object to parse or produce JSON (see [mdn web docs: JSON](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON))
- `dayjs` to build instances of the [day.js library](https://day.js.org/docs/en/parse/now) that you can use to parse or manipulate date & time
- `theme` which holds the current theme: `ios`, `md` or `aurora`
- `themeOptions` and `device` allow to use the relevant objects that you can see in the About page, Technical information, View details, under `clientInfo`
- `screen` returns the [`Screen`](https://developer.mozilla.org/en-US/docs/Web/API/Screen) object.
  This allows you to access various information about the current screen, e.g. the available width and height.
  The two properties `viewAreaWidth` and `viewAreaHeight` are added on top.
  It's recommended to use CSS [`calc()`](css-pages-widgets.html) for dynamic positioning and styling.
- `user` returns an object with information about the logged-in user:
  The name (`user.name`) and an array of the assigned roles for the user (`user.roles`).
- `translation` is method that provides access to the I18n translation system. All translations from the [`common` module](https://github.com/openhab/openhab-webui/blob/main/bundles/org.openhab.ui/web/src/assets/i18n/common/en.json),
  [`about` module](https://github.com/openhab/openhab-webui/blob/main/bundles/org.openhab.ui/web/src/assets/i18n/about/en.json) and translation for all [semantic tags]({{base}}/tutorial/model.html#introduction-to-the-ontology-and-relationships)
  are available. For example: `translation('home.locations.title')`, `translation('Floor')`. `t` is available as a shortcut: `t('home.locations.title')`.

## Variables

Variables can be used in several ways:

- The `variable` config parameter of an `oh-gauge` (read-only), `oh-input`, `oh-knob`, `oh-slider`, `oh-stepper`, `oh-toggle` will accept a variable name and control it instead of sending commands to an Item if set.
  The `item` parameter can still be set to set the widget to the Item state if the variable has no value.
- The `vars` object available in expressions (as mentioned above).
  For example `=vars.var1` will evaluate to the value of the variable `var1`.
- The `variable` action allows to set a fixed or computed (using an expression) value to a variable.

`oh-button` & `oh-link` have a special parameter `clearVariable`, which allows to unset a variable when clicked, after performing the action.
This is useful when "validating" a variable, e.g. send the variable value as command to an Item and then reset the variable.

### Default Variable Values

The standard variables defined using interactive components do not exist until the first time they are given a value by a component.
This means that it is not possible to set a default value for a variable.
To provide a default value when a variable does not exist a simple OR construction can be used in expressions that require the variable:

```javascript
text: =(vars.selectedNumber || '0')
```

Expressions such as the example above will return the value of the variable if it exists and if not will return the second value instead.

If a variable is used extensively in a widget, instead of using OR statements in many different expressions, an `oh-context` component can be used to define variables that have default value at widget creation.

```yaml
- component: oh-context
  config:
    variables:
      setBrightness: 75
  slots:
    default:
      - component: oh-slider
        config:
          variable: setBrightness
      - component: Label
        config:
          text: =vars.setBrightness
```

The `oh-context` can also create more complex default variable values such as arrays or objects:

```yaml
- component: oh-context
  config:
    variables:
      lightArray:
        - ON
        - OFF
        - OFF
        - OFF
      userObject:
        user: Guest
        color: red
        timeout: 5
```

### Variable Scope

Standard variables are also global in scope with one exception:

> Changes to the variable's value made by the child components do not affect the parent component that defines the variable.

The scope of variables created using an `oh-context` component is restricted to only the children of that component.
The value of an `oh-context` variable will never pass to the parent of the `oh-context`.
Within the scope of an `oh-context`, however, variables are fully accessible even passing values from a custom widget to parent components.

Variables defined in an `oh-context` will take precedence over standard variables of the same name.

## Item Expression Shortcuts

The `@` symbol can be used in front of an Item name string as a shortcut to the `displayState` from the `items` dictionary with a fallback to the raw state:

```javascript
footer: =@'Switch1'
```

is the same as

```javascript
footer: =items['Switch1'].displayState || items['Switch1'].state
```

Similarly, `@@` can be used as a shortcut for just the Item state.

The hashtag `#` symbol is a shortcut to the `numericState` with no fallback:

```javascript
footer: =#'Temperature1'
```

is the same as

```javascript
footer: =items['Temperature1'].numericState
```

These shortcuts have two major benefits over directly accessing `displayState`, `state` and `numericState`:
Expressions become shorter when they are used, and if the Item name is a prop which is undefined, **these shortcuts avoid that a request with Item name `undefined` is sent to the server**, which would cause this log message:

```text
[WARN ] [se.internal.SseItemStatesEventBuilder] - Attempting to send a state update of an item which doesn't exist: undefined
```

Expressions are particularly useful in cases where one wants to combine the states of more than one Item, or use the state of more than one Item in a single widget element.
For example, the icon of an Item can be based on the state of a different Item.

## Advanced Expression Features

### Arrow functions

Many standard JavaScript methods take a function as a parameter.
The expression parser can parse arrow functions as the parameters of these methods.

Example:

```javascript
title: =someItemList.find((x) => x.name === 'KitchenSwitch').label
```

In this example, an arrow function is used in conjunction with the `.find()` method to get the Item object from an array of Items (such as is returned by a `oh-repeater`) with a particular Item name.
The label of the found Item is then used as the title of a component.

### String templates

String templates are a much more human-readable way of creating strings with incorporated dynamic values.
String templates are surrounded by backticks (<code>\`string template\`</code>) instead of single- or double-quotes.
Inside string templates, variable values can be inserted with the `${variable}` syntax.

Example:

```javascript
text: =`This button opens the ${props.page} page`
```

This example includes the value of the widget property `props.page` in the text of a component.

### Regular expressions

Regular expressions (regex) allow for complex search or replace string operations.
Many of the JavaScript string methods accept regex parameters expressed as the regex string between two forward slashes (`/regex here/`).

Example:

```javascript
label: =props.item.match(/_(.*)_/)[1]
```

In this example, a widget property named `item` and containing an Item name is searched using regex and the first capture (in this case all characters between two underscores) is returned and used as the component label.

To learn more about regular expressions (regex), refer to [mdn web docs: Regular expressions](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_expressions).
When creating a regex, consider using tools like [regex101](https://regex101.com) to test your regex.

### Objects

The variable action allows components in widgets to pass information back and forth when there is user interaction.
Often this information is simple, such as a single string or input value.
Sometimes, however, it is helpful to add more information to a variable and for these instances JavaScript objects are useful.

The widget expression system can create objects in two different ways:

- JavaScript object syntax:

  Objects can be defined within the expression system using the standard JavaScript syntax: `{'key1':'value1','key2':'value2'}`.
  If a key doesn't contain special characters such as spaces, the quotes around keys can usually be omitted:  `{key1:'value1',key2:'value2'}`.

  ::: tip

  Due to the special meaning of `:[space]` in yaml, it is best to have no spaces between the `:` and the value.
  If you have `:[space]` anywhere in your expression it will raise a YAML error unless you enclose the entire expression (= included) in another layer of quotes.

  :::

  Example:

  ```yaml
  actionVariable: myObject
  actionVariableValue: ={'name':props.item,'selected':true}
  ```

  In this example, a variable is set to an object with keys `name` and `selected` using JavaScript object expression syntax.
- YAML object syntax:

  The other way to create objects is to take advantage of the relationship between YAML and JSON and place the key:value pairs as YAML keys under the initial key.

  Here is a variable definition with the same results as the one above using the YAML syntax.

  ```yaml
  actionVariable: myObject
  actionVariableValue:
    name: =props.item
    selected: =true
  ```

In both cases, the variable can now be referenced by other components as `vars.myObject` with keys `vars.myObject.name` and `vars.myObject.selected`.

#### Using object expressions like a `switch` control statement

Object expression can also be used to simulate a `switch` control statement.

The most common flow control statement in expressions is the [conditional (ternary) operator](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Conditional_Operator), which is very efficient for selecting from two options based on a single boolean criterion.
If you have a list of possible options, you can combine multiple ternary operators together, but this grows cumbersome very quickly.
For example, if there is an HVAC with a mode Item that can be set to `heat`, `cool`, `auto`, and `off` modes, it requires 4 nested ternary operators to set a component's background color to match the current HVAC mode (with a fallback option if the Item has some other state, e.g. `null`).

```javascript
background: =(@@hvacModeItem == 'heat')?'orange':(@@hvacModeItem == 'cool')?'blue':(@@hvacModeItem == 'auto')?'green':(@@hvacModeItem == 'off')?'white':'red'
```

To use an object instead, simply create an object with keys for each of the Item's expected states, and give each key the desired output value.
Referencing that object using the Item's state will return the desired value.
Adding a simple `OR` statement to that expression will provide the fallback condition if the object reference is undefined.

```javascript
background: =({heat:'orange',cool:'blue',auto:'green',off:'white'})[@@hvacModeItem] || 'red'
```

### Constants

Named constants can be defined using an `oh-context` component in a similar way to defining variables.
The significant difference is that if a constant's value is defined using an expression, that expression is evaluated only at the time the widget is rendered and will not change.

The example above using an object as a switch statement can be written even more clearly with the addition of a constant object:

```yaml
- component: oh-context
  config:
    constants:
      modeColor:
        heat: orange
        cool: blue
        auto: green
        off: white
  slots:
    default:
      - component: Label
        config:
          text: =@@hvacModeItem
          style:
            background: =const.modeColor[@@hvacModeItem] || 'red'
```

### Custom Functions

There are times when a widget requires the same calculation in multiple locations and maintaining all the different locations can be a burden.
In these instances, an `oh-context` component can be used to define named functions that are available to all children of the `oh-context`.
Functions are defined using the arrow syntax and referenced with the `fn` object in expressions:

```yaml
- component: oh-context
  config:
    functions:
      num2usd: =(x) => '$' + Number.parseFloat(x).toFixed(2)
  slots:
    default:
      - component: Label
        config:
          text: =fn.num2usd(3.1)
```

## Examples

Translates the third part of the HSB state (brightness) of an `Color` Item to "On" or "Off":

```javascript
=(@@'Color1'.split(',')[2] !== '0') ? 'On ' + '(' + @@'Color1'.split(',')[2] + '%)' : 'Off'
```

Use a filled `lightbulb` icon but only if the state of the Item passed in the prop `item` is ON:

```javascript
icon: =(@@props.item === 'ON') ? 'f7:lightbulb_fill' : 'f7:lightbulb'
```

Stacked ternary statements to translate the state of Item `xxx` to a description:

```javascript
=(items.xxx.state === '0') ? 'Off' : (items.xxx.state === '1') ? 'Heat' : (items.xxx.state === '11') ? 'Economy Heat' : (items.xxx.state === '15') ? 'Full Power': (items.xxx.state === '31') ? 'Manual' : 'Not Set'
```

Do the same using an object and the Item state shortcut:

```javascript
={0:'Off',1:'Heat',11:'Economy Heat',15:'Full Power',31:'Manual'}[@@xxx] || 'Not Set'
```

Subtract one week from the state of `DateTime` and return a relative time representation in the current locale ("3 weeks ago"):

```javascript
=dayjs(items.DateItem.state).subtract(1, 'week').fromNow()
```

## Debugging Expressions

Expressions can be tested in the Widgets Expression Tester found in the [Developer Sidebar]({{base}}/mainui/developer/sidebar.html#developer-sidebar)
(<kbd>Shift</kbd><kbd>Alt</kbd><kbd>D</kbd>).
