---
title: oh-gauge-card - Gauge Card
component: oh-gauge-card
label: Gauge Card
description: Display a read-only gauge in a card to visualize a quantifiable item
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-gauge-card.md
prev: /docs/ui/components/
---

# oh-gauge-card - Gauge Card

<!-- Put a screenshot here if relevant:
![](./images/oh-gauge-card/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Display a read-only gauge in a card to visualize a quantifiable item
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### Card
<div class="props">
<PropGroup name="card" label="Card">
  Parameters of the card
<PropBlock type="TEXT" name="title" label="Title">
  <PropDescription>
    Title of the card
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="footer" label="Footer text">
  <PropDescription>
    Footer of the card
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noBorder" label="No Border">
  <PropDescription>
    Do not render the card border
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noShadow" label="No Shadow">
  <PropDescription>
    Do not render a shadow effect to the card
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="outline" label="Outline">
  <PropDescription>
    Show the card outline
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Gauge
<div class="props">
<PropGroup name="gauge" label="Gauge">
  Parameters are passed to the underlying <a target="_blank" class="external text-color-blue" href="https://framework7.io/vue/gauge.html#gauge-properties">Gauge control</a>
<PropBlock type="TEXT" name="item" label="Item" context="item">
  <PropDescription>
    Item to control
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="min" label="Min">
  <PropDescription>
    Minimum value (default 0)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="max" label="Max">
  <PropDescription>
    Maximum value (default 100)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="type" label="Type">
  <PropDescription>
    Type of the gauge
  </PropDescription>
  <PropOptions>
    <PropOption value="circle" label="Circle" />
    <PropOption value="semicircle" label="Semicircle" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="value" label="Value">
  <PropDescription>
    Value, if the item is not set - between min & max (for instance, defined with an expression)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="size" label="Size">
  <PropDescription>
    Visual size of the control in px (default 200)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="bgColor" label="Background Color">
  <PropDescription>
    Gauge background color. Can be any valid color string, e.g. #ff00ff, rgb(0,0,255), etc.
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="borderBgColor" label="Border Background Color">
  <PropDescription>
    Main border/stroke background color
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="borderColor" label="Border Color">
  <PropDescription>
    Main border/stroke color
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="borderWidth" label="Border Width">
  <PropDescription>
    Main border/stroke width
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="valueText" label="Value Text">
  <PropDescription>
    Value text, if the item is not set (for instance, defined with an expression)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="valueTextColor" label="Value Text Color">
  <PropDescription>
    Value text color
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="valueFontSize" label="Value Font Size">
  <PropDescription>
    Value text font size
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="valueFontWeight" label="Value Font Weight">
  <PropDescription>
    Value text font weight
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="labelText" label="Label Text">
  <PropDescription>
    Label text, displayed below the value (optional)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="labelTextColor" label="Label Text Color">
  <PropDescription>
    Label text color
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="labelFontSize" label="Label Font Size">
  <PropDescription>
    Label text font size
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="labelFontWeight" label="Label Font Weight">
  <PropDescription>
    Label text font weight
  </PropDescription>
</PropBlock>
</PropGroup>
</div>


<!-- GENERATED /props -->

<!-- If applicable describe how properties are forwarded to a underlying component from Framework7, ECharts, etc.:
### Inherited Properties

-->

<!-- If applicable describe the slots recognized by the component and what they represent:
### Slots

#### `default`

The contents of the oh-gauge-card.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-gauge-card/example1.jpg)

```yaml
component: oh-gauge-card
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-gauge-card/example2.jpg)

::: details YAML
```yaml
component: oh-gauge-card
config:
  prop1: value1
  prop2: value2
slots
```
:::

-->

<!-- Try to clean up URLs to the forum (https://community.openhab.org/t/<threadID>[/<postID>] should suffice)
## Community Resources

- [Community Post 1](https://community.openhab.org/t/12345)
- [Community Post 2](https://community.openhab.org/t/23456)
-->
