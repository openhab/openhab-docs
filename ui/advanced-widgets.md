---
title: Advanced Custom Widgets
---

# Custom Widgets - Advanced Topics

[[toc]]

This page expands of some of the topics initially introduced in [Building Pages](building-pages.html). 

## Advanced Components
In the custom widget system there are many options for different components to include beyond the standard OH set.  Where each component comes from determines many of the options available for configuration and styling.

### F7 components
The MainUI is built primarily using the [Framework7](https://framework7.io/) library.  Because most of the OH specific components are built on top of these f7 components, [the documentation of the f7 components](https://framework7.io/vue/) is useful for users wishing to understand more about the OH components as well.  In addition, however, the f7 components themselves are available as options in the widget editor.

As a general rule, the f7 components will have more configuration and style flexibility than the OH counterparts.  So, their use is recommended when there is something about the component that needs to be configured in a way different than what is set in the OH version.  Of course, the f7 components do not have the OH specific functions available, so while they can have values based on items using the epxression system, they cannot easily be used to trigger rules, update items or variables, etc.

The most commonly used f7 components will likely be the `f7-block`, `f7-row`, and `f7-col`.  These all generate a simple `<div>` element with one base f7 class (`block`, `row`, and `col` respectively).  These components are therefore useful as fundamental building-blocks of widget or page. The list components `f7-list-item` and `f7-list-item-row` can often be useful as well given the flexibility they provide for complex structure inside a list.

Any of the OH components that allow for [wiget actions](building-pages.html#actions), include easy configuration for using some other widget as a popup or popover.  If, however, there is need for the popup or popover to be built-in with a single widget (e.g., to add a widget to the [marketplace](https://community.openhab.org/c/marketplace/ui-widgets/75) that includes a popup or popover), the `f7-popup` and `f7-popover` component can be used and the open or closed status of that modal object controled by the `popupOpen`, `popupClose`, `popoverOpen`, and `popoverClose` properties available in many of the other f7 components and their OH derivaties.
#### Popup example
```yaml
- component: f7-card
  config:
    title: Popup Card
  slots:
    default:
      - component: oh-link
        config:
          text: Open the popup
          popupOpen: .demo-pop
      - component: f7-popup
        config:
          class: demo-pop
        slots:
          default:
            - component: oh-button
              config:
                text: Close it again
                popupClose: .demo-pop
```

### Label and Content
There are two special components that are not derived from any other specific library, the `Label` and the `Content` component.  These two are similar in their simplicity of configuration, primarily taking only a `text` property (which can be an expression).

The `Label` component renders the value given by the `text` property inside it's own `<div>` element.  For example:
```yaml
- component: f7-row
  config:
    class: fancy-row
  slots:
    default:
      - component: Label
        config:
          text: Label text here
```
renders in the page html as:
```html
<div class="row fancy-row">
  <div>Label text here</div>
</div>  
```
Because of this the `Label` component also accepts `class` and `style` configurations which are applied to the `<div>`.  `Label` components are often used extensively in compound widgets with several other components to place informative text.  However, because of the `<div>` container, there are times and situations where the `Label` component can cause placement/alignment issues or even configuration issues if the parent element is not compatible with having a `<div>` container as a child.

In contrast, the `Content` component renders the value given by the `text` property *without* any additional container.  For example:
```yaml
- component: f7-row
  config:
    class: fancy-row
  slots:
    default:
      - component: Content
        config:
          text: Content text here
```
renders in the page html as:
```html
<div class="row fancy-row">Content text here</div>
```
With no container, there is no possibility to add `class` or `style` configuration to the `Content` component.

### HTML Components
The custom widget system can also be used to build html more directly.  The `component` property can also be set to any recognized html tag.  When used like this the component accepts any configuration paramaters that can be passed to the tag as html attributes (inlcuding, of course, `class` and `style`).  There is an additional configuration parameter, `content` which allows for content text to be inlcuded in the tag.

Html components also accept a `default` slot which will render a child component inside the tag.

#### HTML component examples
The widget yaml:
```yaml
- component: div
  config:
    content: Make this text bold
    style:
        font-weight: bold
```
Becomes the html:
```html
<div style="font-weight: bold;">Make this text bold</div>
```
To put more complex html heirarchies, use the components `default` slot:
```yaml
- component: div
  config:
    style:
      font-style: italic
  slots:
    default:
      - component: Content
        config:
          text: "This text starts with italics "
      - component: span
        config:
          content: but then becomes BOLD!
          style:
            font-weight: bold
```
Becomes the html:
```html
<div style="font-style: italic;">
  This text starts with italics <span style="font-weight: bold;">but then becomes BOLD!</span>
</div>
```

## The Expression Syntax
The widget expression system uses a javascript-like expression parser, [jse-eval](https://github.com/6utt3rfly/jse-eval).  In order to remain light-weight and responsive, this is not a complete javascript library, but nearly all of the basic function is provided along with some more advanced features.

### Extra expression features

#### Arrow functions
Many standard javascript methods take a function as a parameter.  The expression parser can parse arrow functions as the paramters of these methods.

Here an arrow function is used in conjunction with the `.find()` method to locate the item object in an array of items (such as is returned by a `oh-repeater`) with a particular name.  The label of the found item is then used as the title of a component.
```yaml
title: =someItemList.find( (x) => x.name=="KitchenSwitch" ).label
```
#### String templates
String templates are a much more human-readable way of creating strings with incorporated dynamic values.  String templates are surrounded by backticks (``` `string template` ```) instead of single- or double-quotes.  Inside string templates variable values can be insterted with `${variable}` syntax.

Here the value of the widget property `props.page` is included in the text of a component by a string template.
```yaml
text: =`This button opens the ${props.page} page`
```
#### Regular expressions
Regular expressions (regex) allow for complex search or replace string operations.  Many of the javascript string methods accept regex parameters expressed as the regex string between two forward slashes (`/regex here/`).

Here a widget proptery containing an item name is searched using regex and the first capture (in this case all characters between two underscores) is returned as a component label.
```yaml
label: =props.item.match(/_(.*)_/)[1]
```
#### Objects
The variable action allows components in widgets to pass information back and forth when there is user interaction.  Often this informtation is simple, such as a single string or input value.  Sometimes, however, it is helpul to add more information to a variable and for these instances javascript opjects are useful.  The widget system can create widgets in two different ways.

Objects can be defined withthin the expression system using the standard javascript syntax: `{'key1':'value1','key2':'value2'}`.

::: tip

Due to the special meaning of `:[space]` in yaml, it is best to have no spaces between the `:` and the value.  If you have `:[space]` anywhere in your expression it will raise a yaml error unless you enclose the entire expression (= included) in another layer of quotes.

:::

Here a variable is set to an object with `name` and `selected` keys using the object expression.
```yaml
actionVariable: myObject
actionVariableValue: ={'name':props.item,'selected':true}
```

The other way to create objects is to take advantage of the relationship between yaml and JSON and place the key:value pairs as yaml keys under the initial key.

Here is a variable definition with the same results as the one above using the yaml syntax.
```yaml
actionVariable: myObject
actionVariableValue:
  name: =props.item
  selected: =true
```

In both cases, the variable can now be referenced by other components as `vars.myObject` with keys `vars.myObject.name` and `vars.myObject.selected`.

The object expression can also be used to simulate a `switch` control statement.  The most common flow control statement in the expressions is the [conditional (ternary) operator](building-pages.html#dynamically-configuring-components-with-expressions) which is very efficient for selecting from two options based on a single boolean criterion.  If you have a list of possible options, you can string multiple ternary operators together, but this grows cumbersome very quickly.  For example, if there is an HVAC with a mode item that can be set to `heat`, `cool`, `auto`, and `off` modes, it requires 4 nested ternary operators to set a component's background color to match the current HVAC mode (with a fall back option if the item has some other state, e.g. `null`).

```yaml
background: =(@@hvacModeItem == 'heat')?'orange':(@@hvacModeItem == 'cool')?'blue':(@@hvacModeItem == 'auto')?'green':(@@hvacModeItem == 'off')?'white':'red'
```

To use an object instead, simply create an object with keys for each of the item's expected states, and give each key the desired output value.  Referencing that object using the item's state will return the desired value and following that with a simple `OR` statement will provide the valueback condition is the object reference is undefined.

```yaml
background: =({'heat':'orange','cool':'blue','auto':'green','off':'white'})[@@hvacModeItem] || 'red'
```