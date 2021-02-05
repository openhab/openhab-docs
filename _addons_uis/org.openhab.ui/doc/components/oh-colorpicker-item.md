---
title: oh-colorpicker-item - Color Picker List Item
component: oh-colorpicker-item
label: Color Picker List Item
description: Display a color picker in a list
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-colorpicker-item.md
---

# oh-colorpicker-item - Color Picker List Item

<!-- GENERATED componentDescription -->
Display a color picker in a list
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

### Color picker


- `item` <small>TEXT</small> _Item_

  Item to control

- `modules` <small>TEXT</small> _Modules_

  Modules to display

  | Option | Label |
  |--------|-------|
  | `wheel` | Color wheel |
  | `sb-spectrum` | Saturation/brightness spectrum |
  | `hue-slider` | Hue slider |
  | `hs-spectrum` | Hue/saturation spectrum |
  | `brightness-slider` | Brightness spectrum |
  | `rgb-sliders` | RGB sliders |
  | `hsb-sliders` | HSB sliders |
  | `rgb-bars` | RGB bars |
  | `palette` | Palette |
  | `current-color` | Current color |
  | `initial-current-colors` | Initial current colors |

  Multiple options are allowed.


<!-- GENERATED /props -->
