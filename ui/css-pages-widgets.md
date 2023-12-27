---
layout: documentation
title: Styling pages & widgets using CSS
---

# Styling pages & widgets using CSS

## Predefined CSS Classes

As seen before, you can use CSS classes in the `class` property (as an array) or set CSS properties in the `style` property (as a dictionary) on your components.

You cannot define new CSS classes, but you can use classes from Framework7, for instance:

- [Typography](https://v5.framework7.io/docs/typography.html)
- [Color Themes](https://v5.framework7.io/docs/color-themes.html#apply-color-themes)
- [Hairlines](https://v5.framework7.io/docs/hairlines.html)
- [Elevation](https://v5.framework7.io/docs/elevation.html)

## CSS Variables

Another interesting technique is to override the many [CSS Variables](https://v5.framework7.io/docs/css-variables.html) defined by Framework7 to suit your particular component's needs.
The override will be applied to all descendants in the HTML DOM tree, in case of the Framework7 variables the underlying components which use them will use the new value.
It is recommended to use Framework7 CSS variables in your components too, when appropriate, so that way you'll be sure the properties change according to the current theme and dark mode setting.

To redefine a CSS variable for the component and its descendants, use this syntax:

```yaml
style:
  --f7-button-border-color: rgb(255, 0, 0)
```

To reuse a CSS variable, use:

```yaml
  border-color: var(--f7-button-border-color)
```

You can even define your own CSS variables and use them in your components:

```yaml
config:
  style:
    --my-color: =props.color
slots:
  ...
     ...
        ...
           config:
             style:
               background-color: var(--my-color)
```

## Applying CSS Properties Directly

Applying CSS properties like `border-color` directly on components is sometimes enough; but contrary to CSS variables like `--f7-button-border-color` which will be inherited to descendants in the tree, either by your own components or by f7 components (or their OH derivatives) that make use of these variables, they will only work on the element where you put the style configuration.

There are hundreds of [CSS properties](https://www.w3schools.com/cssref/) you can use to design your widgets.
Use the resources at [W3Schools](https://www.w3schools.com/css/default.asp) or the [CSS-Tricks Properties Almanac](https://css-tricks.com/almanac/properties/) to learn more about CSS properties and techniques - these resources will provide code in HTML and CSS class definitions but you can most of the time adapt them for usage in components' YAML definitions.

While openHAB's layout components (`oh-block`, `oh-grid-row`, `oh-grid-col`) can help you with the placement of your widgets, to layout sub-components _within_ a widget, you shouldn't use them because they include design mode controls that you don't need.
Though you can use their `f7-block`, `f7-row` and `f7-col` equivalents instead, in many cases this is still "overkill":
Consider directly applying the Flexbox or Grid properties to the components.

These resources will help you with Flexbox and Grid:

- [A Complete Guide to Flexbox](https://css-tricks.com/snippets/css/a-guide-to-flexbox/)
- [justify-content "Play it"](https://www.w3schools.com/cssref/playit.asp?filename=playcss_justify-content&preval=flex-start) and others found in the reference
- [A Complete Guide to Grid](https://css-tricks.com/snippets/css/complete-guide-grid/)
- [Grid Tutorial on W3Schools](https://www.w3schools.com/css/css_grid.asp)

## Dynamic Styling & Positioning using CSS `calc()`

You can dynamically style and position elements by calculating their CSS properties with the `calc()` function.
The `calc()` function is able to perform math (`+`, `-`, `*` & `/`) on multiple CSS values, which can even have different units.

For example, to set the height of a component to the current page's maximum content height (without scrolling), use the following `calc()` statement:

```css
calc(96vh - var(--f7-navbar-height) - var(--f7-toolbar-height))
```

This subtracts the height of the navbar and the toolbar, which are stored in CSS vars, from 96% of the viewport's height.

These resources will help you with `calc()`:

- [mdn web docs: calc()](https://developer.mozilla.org/en-US/docs/Web/CSS/calc)
- [CSS-Tricks: A Complete Guide to calc() in CSS](https://css-tricks.com/a-complete-guide-to-calc-in-css/)
