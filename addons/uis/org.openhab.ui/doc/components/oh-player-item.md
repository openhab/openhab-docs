---
title: oh-player-item - Player List Item
component: oh-player-item
label: Player List Item
description: Display player controls in a list
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-player-item.md
prev: /docs/ui/components/
---

# oh-player-item - Player List Item

<!-- Put a screenshot here if relevant:
![](./images/oh-player-item/header.jpg)
-->

[[toc]]

<!-- Note: you can overwrite the definition-provided description and add your own intro/additional sections instead -->
<!-- DO NOT REMOVE the following comments if you intend to keep the definition-provided description -->
<!-- GENERATED componentDescription -->
Display player controls in a list
<!-- GENERATED /componentDescription -->

## Configuration

<!-- DO NOT REMOVE the following comments -->
<!-- GENERATED props -->
### List Item
<div class="props">
<PropGroup name="listitem" label="List Item">
  General settings of the list item
<PropBlock type="TEXT" name="title" label="Title">
  <PropDescription>
    Title of the item
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="subtitle" label="Subtitle">
  <PropDescription>
    Subtitle of the item
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="after" label="After">
  <PropDescription>
    Text to display on the opposite side of the item (set either this or a badge)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="icon" label="Icon">
  <PropDescription>
    Use <code>oh:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://www.openhab.org/link/icons">openHAB icon</a>), <code>f7:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://framework7.io/icons/">Framework7 icon</a>), <code>material:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://jossef.github.io/material-design-icons-iconfont/">Material icon</a>) or <code>iconify:iconSet:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://icon-sets.iconify.design">Iconify icon</a>, requires being online if not in cache)
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="iconColor" label="Icon Color">
  <PropDescription>
    Not applicable to openHAB icons
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="iconUseState" label="Icon depends on state">
  <PropDescription>
    Use the state of the Item to get a dynamic icon (enabled by default for <code>Contact</code>, <code>Dimmer</code>, <code>Rollershutter</code> & <code>Switch</code> Item types) (for openHAB icons only)
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Player Controls
<div class="props">
<PropGroup name="player" label="Player Controls">
<PropBlock type="TEXT" name="item" label="Item" context="item">
  <PropDescription>
    Player item to control
  </PropDescription>
</PropBlock>
<PropBlock type="BOOLEAN" name="showRewindFFward" label="Rewind/Fast Forward">
  <PropDescription>
    Show Rewind and Fast Forward buttons
  </PropDescription>
</PropBlock>
</PropGroup>
</div>

### Currently playing track information
<div class="props">
<PropGroup name="Current Track Info" label="Currently playing track information">
<PropBlock type="TEXT" name="artistItem" label="Artist Item" context="item">
  <PropDescription>
    Item holding the artist name
  </PropDescription>
</PropBlock>
<PropBlock type="TEXT" name="trackItem" label="Track Item" context="item">
  <PropDescription>
    Item holding the track name
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

The contents of the oh-player-item.

-->

<!-- Add as many examples as desired - put the YAML in a details container when it becomes too long (~150/200+ lines):
## Examples

### Example 1

![](./images/oh-player-item/example1.jpg)

```yaml
component: oh-player-item
config:
  prop1: value1
  prop2: value2
```

### Example 2

![](./images/oh-player-item/example2.jpg)

::: details YAML
```yaml
component: oh-player-item
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
