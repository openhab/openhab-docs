---
title: oh-input-item - Input List Item
component: oh-input-item
label: Input List Item
description: Display an input field in a list
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-input-item.md
---

# oh-input-item - Input List Item

<!-- GENERATED componentDescription -->
Display an input field in a list
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

### Input


- `name` <small>TEXT</small> _Name_

  Input name

- `type` <small>TEXT</small> _Type_

  Type of input (see f7-input docs)

- `inputmode` <small>TEXT</small> _Input Mode_

  Type of data that might be entered: see <a class="external text-color-blue" target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/inputmode">MDN docs</a>

- `placeholder` <small>TEXT</small> _Placeholder_

  Placeholder text

- `sendButton` <small>BOOLEAN</small> _Send button_

  Display Send button to update the state with a command (needs a configured item)

- `clearButton` <small>BOOLEAN</small> _Clear button_

  Display input clear button when applicable

- `outline` <small>BOOLEAN</small> _Outline_

  Makes input outline

- `required` <small>BOOLEAN</small> _Required_

  Display an error message if left empty

- `validate` <small>BOOLEAN</small> _Validate_

  When enabled, input value will be validated based on input type

- `validate-on-blur` <small>BOOLEAN</small> _Validate on blur_

  Only validate when focus moves away from input field

- `item` <small>TEXT</small> _Item_

  Link the input value to the state of this item

- `defaultValue` <small>TEXT</small> _Default value_

  Default value when not found in item state or variable

- `variable` <small>TEXT</small> _Variable_

  Name of the variable to set when the input changes

<!-- GENERATED /props -->
