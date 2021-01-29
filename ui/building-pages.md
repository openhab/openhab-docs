# Building Pages: Components & Widgets

## UI Components: introduction and structure

**UI components** are the basic building blocks for many UIs in openHAB 3.
The Main UI Pages and Personal Widgets are notable UI components, but Sitemaps that were created in the UI and HABPanel dashboards are as well.

These structures make up hierarchies that notably define the pages in their entirety are relatively simple:

Each component has:
* A **type**;
* Most of the time, a set of **configuration properties**;
* Optionally, a set of **named slots** which hold collections of more components. By putting components into slots, we therefore define a hierarchy.
Slots are optional, and have a name; usually when there’s slots involved there’s a `default` slot but not always.

The semantics of both the config properties and the slots depend on the component type, as well as the allowed sub-component types in the slots.
The Component Reference provide details on what you can put in a certain component's config & slots.

Sometimes, the slots can be seen as different placeholders within a component where new components may be added. For instance, cell widgets have a `header` slot which represents the part of the cell when not expanded.
The `default` slot is the space in the cell which becomes visible when the cell is expanded.

In various parts of the UI page designers you can "focus" on a particular component usually by selecting the "Edit YAML" item in a black context menu.

Below is a typical component as represented in YAML:

```yaml
component: oh-type
config:
  prop1: value1
  prop2: value2
  prop3: =expression
  ...
slots:
  default:
    - component: ...
      config: ...
      slots: ...
    - component: ...
  anotherSlot:
    - component: ...
      ...
  ...
```

## Root Components & Props

At the top of the component tree there’s we can find a **root component**.
Pages are examples of root components.
They have additional attributes:

```yaml
uid: component1
props:
  parameterGroups:
    - name: group1
      label: Property group
    ...
  parameters:
   - name: prop1
     label: Prop 1
     type: BOOLEAN
     groupName: group1
     description: What prop1 does
   - name: prop2
     label: Prop 2
     type: TEXT
     context: item
     description: Choose an item for this prop
   - name: prop3
     type: NUMBER
     advanced: true
     ...
tags: ["tag1", "tag2"]
component: ...
config: ...
slots: ...
```
- an **uid** (its Unique IDentifier);
- a **props** structure describing its own properties; props define parameters and parameter groups following a subset of the configuration description schema found in bindings, services and throughout openHAB: see [Configuration Descriptions](/docs/developer/bindings/config-xml.html).
- a set of **tags**

## Widgets: Definition & Usage

Widgets are nothing more than discrete components that can be added to a Page.

No matter which type of page you’re editing, the designer will feature black buttons beside most widgets, that open a contextual menu for the widget in question.

These menus will in most cases allow you to:

- configure the documented parameters with a config sheet (“Configure Widget” or similar);
- open the part of the page’s YAML representation pertaining to the widget (“Edit YAML”), that is, a subgraph of the page’s component tree with that widget as its root component;
- perform cut/copy/paste operations, if supported (you can only do that in the same page currently, to copy or move widgets between pages, you may use the YAML view);
- reorder the widget within its parent slot (these options are usually named “Move Up” and “Move Down” although you may occasionally encounter other labels, like “Move Left”/“Move Right”);
- remove the widget

### Types of Widgets

To help you define usable pages, there are a number of built-in widgets that you can use - most of which will be in layout pages. Those built-in widgets revolve around several libraries:

- the **System** library includes "crude" controls that you cannot add with the designers - for instance `oh-button`, `oh-slider`, `oh-colorpicker`. Instead, you're more likely use them within some container (card, list item...) provided by a widget of the Standard library; but when designing a personal widget with a complex layout you may want to use one or several of them directly. You may also use them in a slot of another widget, for those which define some, in order to add additional controls to that widget.
- the **Standard** library, which has several classes of widgets:
  * **layout widgets**, examples: `oh-block`, `oh-masonry`, `oh-grid-row`, `oh-grid-col` that you usually add with the designer to a layout page;
  * **standalone widgets**, examples: `oh-label-card`, `oh-slider-card`, `oh-player-card` - usually not much more than widgets from the System library wrapped in a card;
  * **list item widgets**, examples: `oh-list-item`, `oh-stepper-item`, `oh-toggle-item` - widgets that are thinner than the standalone ones, which you can only add a part of a list (`oh-list` or `oh-list-card`);
  * **cell widgets**, examples: `oh-cell`, `oh-knob-cell`, `oh-colorpicker-cell`: these widgets are fixed-size cells that you can only add to a `oh-cells` container widget immediately below a `oh-block` in a layout page - they will either perform an action - switching a light on & off - or expanding to reveal additional controls;
  * **page-specific widgets**, for instance map pages have `oh-map-marker` or `oh-map-circle-marker`, charts have different types of widgets than the rest to represent axes, series etc.

See the [Component Reference](./components/) for details about the different classes of components.

## Dynamically Configuring Components with Expressions

Virtually everywhere - with the notable exception of chart pages - every time you need a config prop to be dynamically updated, you can use an expression to configure it.
Expressions are string literals beginning with the symbol `=` and everything after it is evaluated using a syntax very similar to JavaScript, you can use arithmetic or string operations etc., the [conditional (ternary) operator](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Conditional_Operator), as well as the following objects (subject to evolutions):

* `items` is a dynamic key/value dictionary allowing you to retrieve the state of items; the result of `items.Item1` will be an object like `{ state: '23', displayState: '23 °C' }` (`displayState` may be omitted). You can therefore use `items.Item1.state` to use the current state of Item1 in your expression, if it changes, it will be reevaluated;
* `props` is a dictionary of the key/values of self-defined props for the current personal widget, or page (pages, like any root UI components, may indeed have props). It is indispensable to use props in expressions when developing a personal widget;
* `vars` is a dictionary of 
* `loop` to access iteration information when in the context of a `oh-repeater` component;
* the JavaScript `Math` object (so your can use _Math.floor(...), Math.round(...) and the like;
* the JavaScript `JSON` object to parse or produce JSON;
* `theme` which holds the current theme: `ios`, `md` or `aurora`;
* `themeOptions` and `device` allow to use the relevant objects that you can see in the About page, Technical information, View details, under `clientInfo`

Expressions are particularly useful in cases where one wants to combine the states of more than one Item, or use the state of more than one Item in a single widget element.
For example, the icon of an Item can be based on the state of a different Item.

### Examples of expressions:

```
=(items.Color1.state.split(',')[2] !== '0') ? 'On ' + '(' + items.Color1.state.split(',')[2] + '%)' : 'Off'
```
Translates the third part of the HSB state (brightness) of the Color1 item to On or Off.

```
icon: =(items[props.item].state === 'ON') ? 'f7:lightbulb_fill' : 'f7:lightbulb'
```
Use a filled icon of a lightbulb but only if the state of the items passed in the prop `item` is ON.

```
= (items.xxx.state === '0') ? 'Off' : (items.xxx.state === '1') ? 'Heat' : (items.xxx.state === '11') ? 'Economy Heat' : (items.xxx.state === '15') ? 'Full Power': (items.xxx.state === '31') ? 'Manual' : 'Not Set'
```
Stacked ternary statements to translate a value to a description.

Expressions can be tested in the Widgets Expression Tester found in the Developer Sidebar
(<kbd>Shift+Alt+D</kbd>).

## Variables

Varibles are a way to allow more complex scenarios in pages & personal widget development.

Variables can be used using several methods:

- the `variable` config parameter of `oh-gauge` (read-only),
  `oh-input`, `oh-knob`, `oh-slider`, `oh-stepper`, `oh-toggle`
  will accept a variable name and control it instead of
  sending commands to items if set. The "item" parameter can
  still be set to set the widget to the item's state, when
  the variable has no value.
- the `vars`object available in expressions (for example
  `=vars.var1` will evaluate to the value of the variable `var1`.
- the `variable` action allows to set a fixed or computed
  (using an expression) value to a variable.

`oh-button` & `oh-link` have a special parameter `clearVariable`
which allows to unset a version when clicked, after performing
the action. This is useful when "validating" a variable e.g.
send a command to an item with the variable value then reset it.

## Personal Widgets

You can extend the library of widgets you have at your disposal by creating personal ones, either by yourself, or copy-pasting from examples by the community; then you can reuse them on pages, multiple times if need be, simply configuring their props to your needs.
To add a new personal widget, as an admin, click on Developer Tools then Widgets. Use the '+' button to create a new one.

The view features a code (YAML) editor and a live preview, you can change the orientation with the button in the center of the bottom toolbar.
Don't forget to change the `uid` right away because you won't be able to alter it afterwards.
Sometimes the live preview will fail to update, you may want to hit the Redraw button or <kbd>Ctrl-R</kbd>/<kbd>Cmd-R</kbd> regularly when designing your widget.

To actually see how the config sheet would look like, and specify props for your widget for the live preview, click on Set props (<kbd>Ctrl-P</kbd>) and configure them as needed.

After saving the widget, you will have it as an option (under "Personal widgets") to add it to a layout page, or display in a modal like a popover, or use it as the default representation of an item.

Note the special `widget:<uid>` syntax for the component type to specify "use this personal widget here", the `config` being the value to wish to assign to the widget props:
```yaml
component: widget:widget_0a26c10a4d
config:
  prop1: Test
  item: Color1
```

To efficiently build widgets, you will have to rely often on the `style` and `class` properties, in conjunction with Framework7 [typography classes](https://framework7.io/docs/typography.html), [CSS variables](https://framework7.io/docs/css-variables.html), and Vue components, notably the [layout grid](https://framework7.io/vue/grid.html), and others.
