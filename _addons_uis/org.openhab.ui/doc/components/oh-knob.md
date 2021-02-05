---
title: oh-knob - Knob
component: oh-knob
label: Knob
description: Knob control, allow to change a number value on a circular track
source: https://github.com/openhab/openhab-webui/edit/main/bundles/org.openhab.ui/doc/components/oh-knob.md
---

# oh-knob - Knob

<!-- GENERATED componentDescription -->
Knob control, allow to change a number value on a circular track
<!-- GENERATED /componentDescription -->

## Configuration

<!-- GENERATED props -->

- `item` <small>TEXT</small> _Item_

  Item to control

- `min` <small>INTEGER</small> _Min_

  Minimum value (default 0)

- `max` <small>INTEGER</small> _Max_

  Maximum value (default 100)

- `stepSize` <small>DECIMAL</small> _Step_

  Minimum interval between values (default 1)

- `disabled` <small>BOOLEAN</small> _Disabled_

  Disable the slider (usually set via an expression since the value will not be displayed when disabled)

- `size` <small>INTEGER</small> _Size_

  Visual size of the control in px (or % if responsive is true)

- `primaryColor` <small>TEXT</small> _Primary Color_

  Color of the value arc (HTML value, default #409eff)

- `secondaryColor` <small>TEXT</small> _Secondary Color_

  Color of the rest of the control (HTML value, default #dcdfe6)

- `textColor` <small>TEXT</small> _Text Color_

  Color of the value text (HTML value, default #000000)

- `strokeWidth` <small>TEXT</small> _Stroke Width_

  Thickness of the arcs, default 17

- `responsive` <small>BOOLEAN</small> _Responsive_

  Size the control using percentages instead of pixels

- `variable` <small>TEXT</small> _Variable_

  Name of the variable to set on input change

<!-- GENERATED /props -->
