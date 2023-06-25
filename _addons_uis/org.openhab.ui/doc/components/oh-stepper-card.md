---
title: oh-stepper-card - Stepper Card
component: oh-stepper-card
label: Stepper Card
description: Display a stepper in a card to control an item
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-stepper-card.md
prev: /docs/ui/components/
---

# oh-stepper-card - Stepper Card

<!-- Put a screenshot here if relevant:
![](./images/oh-stepper-card/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Display a stepper in a card to control an item
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

### Stepper
<div class="props">
<PropGroup name="stepper" label="Stepper">
<PropBlock type="TEXT" name="item" label="Item" context="item">
  <PropDescription>
    Item to control
  </PropDescription>
</PropBlock>
<PropBlock type="DECIMAL" name="min" label="Min">
  <PropDescription>
    Minimum value
  </PropDescription>
</PropBlock>
<PropBlock type="DECIMAL" name="max" label="Max">
  <PropDescription>
    Maximum value
  </PropDescription>
</PropBlock>
<PropBlock type="DECIMAL" name="step" label="Step">
  <PropDescription>
    Minimum interval between values
  </PropDescription>
</PropBlock>
<PropBlock type="DECIMAL" name="offset" label="Offset">
  <PropDescription>
    Offset to be applied to the Item's state (e.g. Item state = 2; offset = 20; stepper behaves as Item state would be 22)
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="buttonsOnly" label="Buttons Only">
  <PropDescription>
    Display the buttons without the value in the middle
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="enableInput" label="Enable Input Field">
  <PropDescription>
    Enables the input field between the buttons. Note that this might not work when min/max is set.
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="small" label="Small">
  <PropDescription>
    Smaller size
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="large" label="Large">
  <PropDescription>
    Larger size
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="fill" label="Fill">
  <PropDescription>
    Fill the buttons with the primary color
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="raised" label="Raised">
  <PropDescription>
    Display the buttons with a raised style
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="round" label="Round">
  <PropDescription>
    Display the buttons with a rounded style
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="autorepeat" label="Auto-repeat">
  <PropDescription>
    Continue to increase/decrease the value while the buttons keep being pressed
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="autorepeatDynamic" label="Dynamic Auto-repeat">
  <PropDescription>
    Speed up the increase/decrease over time while the buttons keep being pressed
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

The contents of the oh-stepper-card.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-stepper-card/example1.jpg)

```yaml
component: oh-stepper-card
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-stepper-card/example2.jpg)

::: details YAML
```yaml
component: oh-stepper-card
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
