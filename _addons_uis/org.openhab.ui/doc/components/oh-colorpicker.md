---
title: oh-colorpicker - Colorpicker
component: oh-colorpicker
label: Colorpicker
description: Control to pick a color
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-colorpicker.md
prev: /docs/ui/components/
---

# oh-colorpicker - Colorpicker

<!-- Put a screenshot here if relevant:
![](./images/oh-colorpicker/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Control to pick a color
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="TEXT" name="item" label="Item" context="item">
  <PropDescription>
    Item to control
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="modules" label="Modules">
  <PropDescription>
    Modules to display
  </PropDescription>
  <PropOptions multiple="true">
    <PropOption value="wheel" label="Color wheel" />
    <PropOption value="sb-spectrum" label="Saturation/brightness spectrum" />
    <PropOption value="hue-slider" label="Hue slider" />
    <PropOption value="hs-spectrum" label="Hue/saturation spectrum" />
    <PropOption value="brightness-slider" label="Brightness spectrum" />
    <PropOption value="rgb-sliders" label="RGB sliders" />
    <PropOption value="hsb-sliders" label="HSB sliders" />
    <PropOption value="rgb-bars" label="RGB bars" />
    <PropOption value="palette" label="Palette" />
    <PropOption value="current-color" label="Current color" />
    <PropOption value="initial-current-colors" label="Initial current colors" />
  </PropOptions>
</PropBlock>
<PropBlock type="TEXT" name="defaultColor" label="Default Color">
  <PropDescription>
    Color (e.g. <code>[0,0,0]</code> for black) to use for the color picker if state does not contain a color (e.g. because it is <code>NULL</code>)
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

The contents of the oh-colorpicker.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-colorpicker/example1.jpg)

```yaml
component: oh-colorpicker
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-colorpicker/example2.jpg)

::: details YAML
```yaml
component: oh-colorpicker
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
