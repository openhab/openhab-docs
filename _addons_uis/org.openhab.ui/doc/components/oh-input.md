---
title: oh-input - Input
component: oh-input
label: Input
description: Displays an input field, used to set a variable
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-input.md
---

# oh-input - Input

<!-- GENERATED componentDescription -->
Displays an input field, used to set a variable
<!-- GENERATED /componentDescription -->

## Configuration

<!-- GENERATED props -->

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
