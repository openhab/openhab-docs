---
title: Creating Personal Widgets
---

# Creating Personal Widgets

[[toc]]

## Creating a Widget

You can extend the library of widgets you have at your disposal by creating personal ones, either by yourself, or copy-pasting from examples by the community; then you can reuse them on pages, multiple times if need be, simply configuring their props to your needs.
To add a new personal widget, as an admin, go to **Developer Tools > Widgets**, then use the '+' button to create a new one.

The view features a code (YAML) editor and a live preview, you can change the orientation with the button in the center of the bottom toolbar.

::: warning WARNING

Don't forget to change the `uid` right away because you won't be able to alter it afterwards.

:::

Sometimes the live preview will fail to update, you may want to hit the Redraw button or <kbd>Ctrl-R</kbd>/<kbd>Cmd-R</kbd> regularly when designing your widget.

To actually see how the config sheet would look like, and specify props for your widget for the live preview, click on Set props (<kbd>Ctrl-P</kbd>) and configure them as needed.

After saving the widget, you will have it as an option (under "Personal widgets") to add it to a layout page, or display in a modal like a popover, or use it as the default representation of an item.

Note that to add a personal widget to a page or other widget, use the special `widget:<uid>` syntax for the component type to specify "use this personal widget here".
The `config` options are the widget's props and the value you wish to assign to each:

```yaml
component: widget:widget_0a26c10a4d
config:
  prop1: Test
  item: Color1
```

## Widget Structure

The custom widget feature has been designed to be very accessible and users do not require a detailed understanding of webdesign to get started.
It may be useful even to beginning users, however, to have a basic understanding of the logical flow of the system.
Custom widgets are defined using YAML which is a human readable data format that easily converts back and forth from JSON, a text-based data format widely-used in web applications.
MainUI uses the JSON data to populate templates built using Vue, a language for dynamically building HTML, taking advantage of the pre-made components available from the [Framework7 (F7)](https://framework7.io/) library.
The complete flow looks like this:

> YAML → Vue (Framework7) → HTML

For basic widgets this information is only sometimes relevant, but when creating more advanced, complex widgets it is often critical to understand this for successful structuring and debugging.

### Component config

Nearly every component will have some aspect that needs to be specified or modified to suit a specific need.
This is accomplished by adding a `config` section to the component's YAML.

```yaml
- component: oh-toggle
  config:
    item: mySwitchItem
```

Some of the available configuration parameters are specific to a certain component while others, such as `visible` or `class` are available in most components.
[Expressions](widget-expressions-variables.html) can be used to dynamically set configuration parameters depending on dynamic, changing data, e.g. Item states.

### Component slots

HTML pages are hierarchically nested.
In order to reflect this structure in the YAML most components will have `slots`.
To define a component that must be a child (nested inside) of another component you indent the YAML of the child component within one of the defined slots of the first one.

```yaml
- component: oh-list
  slots:
    default:
      - component: oh-list-item
```

In most cases a component will have a `default` slot that is the most appropriate slot to use for simple construction.
Some of the components will have more specific slots such as `header` or `content` which are rarely used.

## Components

In the custom widget system there are many options for different components to include.
Where each component comes from determines many of the options available for configuration and styling.

### openHAB components

The most common type of component in most widgets will be the openHAB (OH) family of widgets.
These are modified versions of the F7 library of components.
The modifications include themeing to match the MainUI color and style themes and functionality that provides direct interaction with OH features such as Items.
A basic description of each of these components and the their capabilities (with examples) can be found on the [Component Reference](components/) page.
Because most of the OH specific components are built on top of the F7 components, [the documentation of the F7 components](https://framework7.io/vue/) is often useful for users wishing to understand more about the OH components as well.

There are several subsets of OH components, each with different uses and strengths:

- **Basic**: a component which can be placed within other components (e.g., `oh-slider`)
- **Standalone Card**: a component placed inside a container styled to look like a separate visual element (e.g., `oh-slider-card`)
- **Cell**: a container styled to look like a separate visual element which will expand to show the component when clicked (e.g., `oh-slider-cell`)
- **List Item**: a component placed inside a list type container meant only to be displayed as part of a list and which will not display properly on its own (e.g., `oh-slider-item`)
- **Specialized components**: many of the available page types in the MainUI (e.g., chart pages) have their own series of specialized components

### F7 components

In addition to being the basis for the OH components, the F7 components themselves are available as options in the widget editor.
As a general rule, the F7 components will have more configuration and style flexibility than their OH counterparts.
So, their use is recommended when there is something about the component that needs to be configured in a way different than what is set in the OH version.
Of course, the F7 components do not have the OH specific functions available, so while they can have values based on Items using the [widget expression system](widget-expressions-variables.html), they cannot easily be used to trigger rules, update Items or variables, etc.

The most commonly used F7 components will likely be `f7-block`, `f7-row`, and `f7-col`.
These all generate a simple `<div>` element with one base F7 class (`block`, `row`, and `col` respectively).
These components are therefore useful as fundamental building-blocks of widget or page.
The list components `f7-list-item` and `f7-list-item-row` can often be useful as well given the flexibility they provide for complex structure inside a list.

Any of the OH components that allow [widget actions](building-pages.html#actions) include easy configuration for using some other widget as a popup or popover.
If, however, there is need for the popup or popover to be built-in with a single widget (e.g., to add a widget to the [marketplace](https://community.openhab.org/c/marketplace/ui-widgets/75) that includes a popup or popover), the `f7-popup` and `f7-popover` component can be used and the open or closed status of that modal object controlled by the `popupOpen`, `popupClose`, `popoverOpen`, and `popoverClose` properties available in many of the other f7 components and their OH derivates.

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

There are two special components that are not derived from any other specific library, the `Label` and the `Content` component.
These two are similar in their simplicity of configuration, primarily taking only a `text` property (which can be a [widget expression](widget-expressions-variables.html)).

The `Label` component renders the value given by the `text` property inside it's own `<div>` element.
For example:

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

renders in the page HTML as:

```html
<div class="row fancy-row">
  <div>Label text here</div>
</div>
```

Because of this, the `Label` component also accepts `class` and `style` configurations which are applied to the `<div>`.
`Label` components are often used extensively in compound widgets with several other components to place informative text.
However, because of the `<div>` container, there are times and situations where the `Label` component can cause placement/alignment issues or even configuration issues if the parent element is not compatible with having a `<div>` container as a child.

In contrast, the `Content` component renders the value given by the `text` property _without_ any additional container.
For example:

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

renders in the page HTML as:

```html
<div class="row fancy-row">Content text here</div>
```

With no container, there is no possibility to add `class` or `style` configuration to the `Content` component.

### HTML components

The custom widget system can also be used to build HTML more directly.
The `component` property can also be set to any recognized HTML tag.
When used in this manner, the component accepts any configuration paramaters that can be passed to the tag as HTML attributes (including, of course, `class` and `style`).
There is an additional configuration parameter, `content` which allows for content text to be included in the tag.

HTML components also accept a `default` slot which will render a child component inside the tag.

#### HTML component examples

The widget YAML:

```yaml
- component: div
  config:
    content: Make this text bold
    style:
        font-weight: bold
```

Renders to the HTML:

```html
<div style="font-weight: bold;">Make this text bold</div>
```

To put more complex HTML hierarchies, use the component's `default` slot:

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

Renders to the HTML:

```html
<div style="font-style: italic;">
  This text starts with italics <span style="font-weight: bold;">but then becomes BOLD!</span>
</div>
```

## Styling

Personal widgets very likely require some customized styling using CSS.

Please read [CSS for Pages & Widgets](css-pages-widgets.html) to learn more about using CSS.
