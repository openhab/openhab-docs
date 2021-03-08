---
title: oh-grid-layout - Fixed Grid Layout
component: oh-grid-layout
label: Fixed Grid Layout
description: Arranges widgets on a grid of squares with user-defined sizes
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-grid-layout.md
prev: /docs/ui/components/
---

# oh-grid-layout - Fixed Grid Layout

<!-- Put a screenshot here if relevant:
![](./images/oh-grid-layout/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Arranges widgets on a grid of squares with user-defined sizes
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### Layout Settings
<div class="props">
<PropGroup name="layout" label="Layout Settings">
<PropBlock type="INTEGER" name="colNum" label="Number of Columns">
  <PropDescription>
    Number of columns across the page (default 16, limited to a minimum widget width of 50px)
  </PropDescription>
</PropBlock>
<PropBlock type="INTEGER" name="margin" label="Margin">
  <PropDescription>
    Margin between items and to screen (default 10)
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="verticalCompact" label="Vertical Compact">
  <PropDescription>
    Automatically align items from top to bottom (default false)
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
    Screen width in pixels (default 720)
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="scale" label="Scaling">
  <PropDescription>
    Scale content to other screen widths (can lead to unexpected styling issues) (default false)
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


<!-- GENERATED /props -->

<!-- If applicable describe how properties are forwarded to a underlying component from Framework7, ECharts, etc.:
### Inherited Properties

-->

<!-- If applicable describe the slots recognized by the component and what they represent:
### Slots

#### `default`

The contents of the oh-grid-layout.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-grid-layout/example1.jpg)

```yaml
component: oh-grid-layout
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-grid-layout/example2.jpg)

::: details YAML
```yaml
component: oh-grid-layout
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
