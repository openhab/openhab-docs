---
title: oh-canvas-layout - Canvas Layout
component: oh-canvas-layout
label: Canvas Layout
description: Position widgets on a canvas layout with arbitrary position and size down to pixel resolution
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-canvas-layout.md
prev: /docs/ui/components/
---

# oh-canvas-layout - Canvas Layout

<!-- Put a screenshot here if relevant:
![](./images/oh-canvas-layout/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Position widgets on a canvas layout with arbitrary position and size down to pixel resolution
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### Layout Settings
<div class="props">
<PropGroup name="layout" label="Layout Settings">
<PropBlock type="INTEGER" name="grid" label="Grid size">
  <PropDescription>
    Grid size in pixels used to snap content (default 20)
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Screen Settings
<div class="props">
<PropGroup name="screenSettings" label="Screen Settings">
<PropBlock type="INTEGER" name="screenWidth" label="Screen Width">
  <PropDescription>
    Screen width in pixels (default 1280)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="screenHeight" label="Screen Height">
  <PropDescription>
    Screen height in pixels (default 720)
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="scale" label="Scaling">
  <PropDescription>
    Scale content to screen width (can lead to unexpected styling issues) (default false)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="imageUrl" label="Image URL" context="url">
  <PropDescription>
    The URL of the image to display as background
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="imageSrcSet" label="Image Source Set">
  <PropDescription>
    The src-set attribute of background image element to take into account multiple device resolutions. For example: "/static/floorplans/floor-0.jpg, /static/floorplans/floor-0@2x.jpg 2x"
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Appearance
<div class="props">
<PropGroup name="appearance" label="Appearance">
<PropBlock type="BOOLEAN" name="hideNavbar" label="Hide Navigation bar">
  <PropDescription>
    Hide navigation bar on top when page is displayed (You can additionally hide the sidebar using its pin icon) (default false)
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="hideSidebarIcon" label="Hide Sidebar Icon">
  <PropDescription>
    Don't show a menu icon in the top left corner when the sidebar is closed (default false)
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="showFullscreenIcon" label="Show Fullscreen Icon">
  <PropDescription>
    Show a fullscreen icon on the top right corner (default false)
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Canvas items shadow
<div class="props">
<PropGroup name="shadow" label="Canvas items shadow">
<PropBlock type="TEXT" name="boxShadow" label="Box shadow">
  <PropDescription>
    Shadow applied to box elements (box-shadow CSS syntax).
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="textShadow" label="Text shadow">
  <PropDescription>
    Shadow applied to text elements or font icons (text-shadow CSS syntax)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="filterShadow" label="Filter Shadow">
  <PropDescription>
    Shadow applied to raster or SVG image elements (filter: drop-shadow() CSS syntax)
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

The contents of the oh-canvas-layout.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-canvas-layout/example1.jpg)

```yaml
component: oh-canvas-layout
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-canvas-layout/example2.jpg)

::: details YAML
```yaml
component: oh-canvas-layout
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
