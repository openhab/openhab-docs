---
title: oh-plan-page - Floor plan
component: oh-plan-page
label: Floor plan
description: Displays markers on an image overlay
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-plan-page.md
prev: /docs/ui/components/
---

# oh-plan-page - Floor plan

<!-- Put a screenshot here if relevant:
![](./images/oh-plan-page/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Displays markers on an image overlay
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### General
<div class="props">
<PropGroup label="General">
<PropBlock type="TEXT" name="imageUrl" label="Image URL" context="url">
  <PropDescription>
    The URL of the image to display as background
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="imageWidth" label="Image Width">
  <PropDescription>
    The width of the image (by default 1000 pixels). Please specify if the image is not square to compute the aspect ratio
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="imageHeight" label="Image Height">
  <PropDescription>
    The height of the image (by default 1000 pixels). Please specify if the image is not square to compute the aspect ratio
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noZoomOrDrag" label="Disable Zooming & Dragging">
  <PropDescription>
    Disable the ability to zoom and drag
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noZoomAnimation" label="No Zoom Animation">
  <PropDescription>
    Change zoom levels without animation, can also avoid graphic glitches with persistent tooltips
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="noMarkerZoomAnimation" label="Hide Markers during Zoom Animation">
</PropBlock>
<PropBlock type="TEXT" name="backgroundColor" label="Background Color">
  <PropDescription>
    Color outside the bounds of the image. "Black or White" means it will be black in dark mode and white in light mode
  </PropDescription>
  <PropOptions>
    <PropOption value="(empty)" label="Default" />
    <PropOption value="white" label="Always White" />
    <PropOption value="black" label="Always Black" />
    <PropOption value="blackwhite" label="Black or White" />
  </PropOptions>
</PropBlock>
<PropBlock type="BOOLEAN" name="darkModeInvert" label="Invert Image in Dark Mode">
  <PropDescription>
    Apply an invert filter to the image in dark mode - use with images in black & white or grayscale for best results
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

The contents of the oh-plan-page.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-plan-page/example1.jpg)

```yaml
component: oh-plan-page
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-plan-page/example2.jpg)

::: details YAML
```yaml
component: oh-plan-page
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
