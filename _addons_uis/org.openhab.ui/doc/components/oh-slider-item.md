---
title: oh-slider-item - Slider List Item
component: oh-slider-item
label: Slider List Item
description: Display a slider control in a list
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-slider-item.md
---

# oh-slider-item - Slider List Item

<!-- GENERATED componentDescription -->
Display a slider control in a list
<!-- GENERATED /componentDescription -->

## Configuration

<!-- GENERATED props -->

### List Item

General settings of the list item


- `title` <small>TEXT</small> _Title_

  Title of the item

- `subtitle` <small>TEXT</small> _Subtitle_

  Subtitle of the item

- `after` <small>TEXT</small> _After_

  Text to display on the opposite side of the item (set either this or a badge)

- `icon` <small>TEXT</small> _Icon_

  Use <code>oh:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://www.openhab.org/link/icons">openHAB icon</a>) or <code>f7:iconName</code> (<a class="external text-color-blue" target="_blank" href="https://framework7.io/icons/">Framework7 icon</a>)

- `iconColor` <small>TEXT</small> _Icon Color_

  Not applicable to openHAB icons

- `iconUseState` <small>BOOLEAN</small> _Icon depends on state_

  Use the state of the item to get a dynamic icon (for openHAB icons only)

### Slider


- `item` <small>TEXT</small> _Item_

  Item to control

- `min` <small>DECIMAL</small> _Min_

  Minimum value

- `max` <small>DECIMAL</small> _Max_

  Maximum value

- `step` <small>DECIMAL</small> _Step_

  Minimum interval between values

- `vertical` <small>DECIMAL</small> _Vertical_

  Display the slider vertically

- `label` <small>BOOLEAN</small> _Display Label_

  Display a label above the slider knob

- `scale` <small>BOOLEAN</small> _Display Scale_

  Display a scale on the slider

- `scaleSteps` <small>INTEGER</small> _Scale steps_

  Number of (major) scale markers

- `scaleSubSteps` <small>INTEGER</small> _Scale sub-steps_

  Number of scale minor markers between each major marker

- `unit` <small>TEXT</small> _Unit_

  Text to append to the label while dragging the cursor

<!-- GENERATED /props -->
