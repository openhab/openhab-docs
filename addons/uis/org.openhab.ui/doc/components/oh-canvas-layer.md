---
title: oh-canvas-layer - Canvas Layer
component: oh-canvas-layer
label: Canvas Layer
description: Layer for grouping widgets in canvas
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-canvas-layer.md
prev: /docs/ui/components/
---

# oh-canvas-layer - Canvas Layer

<!-- Put a screenshot here if relevant:
![](./images/oh-canvas-layer/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Layer for grouping widgets in canvas
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="TEXT" name="layerName" label="Name">
  <PropDescription>
    Layer name (for editor)
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="preload" label="Pre-load">
  <PropDescription>
    Pre-load layer contents so that switching layer visibility is faster and dynamic widgets are immediately displayed in their current state. Initial page load might be longer (default false)
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Visibility Options
<div class="props">
<PropGroup name="visibility" label="Visibility Options">
<PropBlock type="TEXT" name="visible" label="Visible">
  <PropDescription>
    Enter an expression to hide the widget conditionally or false to never display it
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="visibleTo" label="Visible only to">
  <PropDescription>
    Role(s) this widget will be visible to (in the code view you can restrict to specific users with the <code>user:userid</code> syntax).<br/><strong>PLEASE NOTE: this should NOT be considered a security feature! Items can still be controlled by other means.</strong>
  </PropDescription>
  <PropOptions multiple="true">
    <PropOption value="role:administrator" label="Administrators" />
    <PropOption value="role:user" label="Users" />
  </PropOptions>
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

The contents of the oh-canvas-layer.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-canvas-layer/example1.jpg)

```yaml
component: oh-canvas-layer
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-canvas-layer/example2.jpg)

::: details YAML
```yaml
component: oh-canvas-layer
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
