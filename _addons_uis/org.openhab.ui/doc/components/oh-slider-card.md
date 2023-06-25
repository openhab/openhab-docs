---
title: oh-slider-card - Slider Card
component: oh-slider-card
label: Slider Card
description: Display a slider in a card to control an item
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-slider-card.md
prev: /docs/ui/components/
---

# oh-slider-card - Slider Card

<!-- Put a screenshot here if relevant:
![](./images/oh-slider-card/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Display a slider in a card to control an item
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

### Slider
<div class="props">
<PropGroup name="slider" label="Slider">
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
<PropBlock type="DECIMAL" name="vertical" label="Vertical">
  <PropDescription>
    Display the slider vertically
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="label" label="Display Label">
  <PropDescription>
    Display a label above the slider knob while sliding
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="scale" label="Display Scale">
  <PropDescription>
    Display a scale on the slider
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="scaleSteps" label="Scale steps">
  <PropDescription>
    Number of (major) scale markers
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="scaleSubSteps" label="Scale sub-steps">
  <PropDescription>
    Number of scale minor markers between each major marker
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="unit" label="Unit">
  <PropDescription>
    Unit for the command sent and also append to the label while dragging the cursor, leave empty to use Item's unit
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="ignoreDisplayState" label="Ignore Display State">
  <PropDescription>
    Ignore the display state if available and always use the raw state.
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="releaseOnly" label="Send command only on release">
  <PropDescription>
    If enabled, no commands are sent during sliding
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="commandInterval" label="Command Interval">
  <PropDescription>
    Time to wait between subsequent commands in ms (default 200)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="delayStateDisplay" label="Delay State Display">
  <PropDescription>
    Time to wait before switching from displaying user input to displaying item state in ms (default 2000)
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

The contents of the oh-slider-card.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-slider-card/example1.jpg)

```yaml
component: oh-slider-card
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-slider-card/example2.jpg)

::: details YAML
```yaml
component: oh-slider-card
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
