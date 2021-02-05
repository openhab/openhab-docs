---
title: oh-rollershutter-item - Rollershutter List Item
component: oh-rollershutter-item
label: Rollershutter List Item
description: Display rollershutter controls in a list
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-rollershutter-item.md
---

# oh-rollershutter-item - Rollershutter List Item

<!-- GENERATED componentDescription -->
Display rollershutter controls in a list
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

### Orientation


- `vertical` <small>BOOLEAN</small> _Vertical_

  Vertical orientation

### Rollershutter Controls


- `item` <small>TEXT</small> _Item_

  Rollershutter item to control

- `dirIconsStyle` <small>TEXT</small> _Direction Icons Style_

  Icons to use for the UP/DOWN buttons

  | Option | Label |
  |--------|-------|
  | `arrowtriangle_{dir}` | arrowtriangle_{dir} |
  | `arrowtriangle_{dir}_fill` | arrowtriangle_{dir}_fill |
  | `arrowtriangle_{dir}_circle` | arrowtriangle_{dir}_circle |
  | `arrowtriangle_{dir}_circle_fill` | arrowtriangle_{dir}_circle_fill |
  | `arrowtriangle_{dir}_square` | arrowtriangle_{dir}_square |
  | `arrowtriangle_{dir}_square_fill` | arrowtriangle_{dir}_square_fill |
  | `chevron_{dir}` | chevron_{dir} |
  | `chevron_{dir}_2` | chevron_{dir}_2 |
  | `chevron_compact_{dir}_2` | chevron_compact_{dir}_2 |
  | `chevron_{dir}_fill` | chevron_{dir}_fill |
  | `chevron_{dir}_circle` | chevron_{dir}_circle |
  | `chevron_{dir}_circle_fill` | chevron_{dir}_circle_fill |
  | `chevron_{dir}_square` | chevron_{dir}_square |
  | `chevron_{dir}_square_fill` | chevron_{dir}_square_fill |
  | `arrow_{dir}` | arrow_{dir} |
  | `arrow_{dir}_2` | arrow_{dir}_2 |
  | `arrow_{dir}_fill` | arrow_{dir}_fill |
  | `arrow_{dir}_circle` | arrow_{dir}_circle |
  | `arrow_{dir}_circle_fill` | arrow_{dir}_circle_fill |
  | `arrow_{dir}_square` | arrow_{dir}_square |
  | `arrow_{dir}_square_fill` | arrow_{dir}_square_fill |
  | `arrow_{dir}_to_line` | arrow_{dir}_to_line |
  | `arrow_{dir}_to_line_alt` | arrow_{dir}_to_line_alt |


- `stopIconStyle` <small>TEXT</small> _Stop Icon Style_

  Icons to use for the STOP button

  | Option | Label |
  |--------|-------|
  | `stop` | stop |
  | `stop_fill` | stop_fill |
  | `stop_circle` | stop_circle |
  | `stop_circle_fill` | stop_circle_fill |
  | `multiply` | multiply |
  | `multiply_fill` | multiply_fill |
  | `multiply_circle` | multiply_circle |
  | `multiply_circle_fill` | multiply_circle_fill |


- `stateInCenter` <small>BOOLEAN</small> _State in Center_

  Display state value inside the STOP button instead of icon

<!-- GENERATED /props -->
