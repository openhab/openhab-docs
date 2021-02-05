# oh-knob-card - Knob Card

<!-- GENERATED componentDescription -->
Display a knob in a card to visualize and control a quantifiable item
<!-- GENERATED /componentDescription -->

## Configuration

<!-- GENERATED props -->

### Card

Parameters of the card


- `title` <small>TEXT</small> _Title_

  Title of the card

- `footer` <small>TEXT</small> _Footer text_

  Footer of the card

- `noBorder` <small>BOOLEAN</small> _No Border_

  Do not render the card border

- `noShadow` <small>BOOLEAN</small> _No Shadow_

  Do not render a shadow effect to the card

- `outline` <small>BOOLEAN</small> _Outline_

  Show the card outline

### Knob

Parameters are passed to the underlying <a target="_blank" class="external text-color-blue" href="https://github.com/kramer99/vue-knob-control#properties">Knob control</a>


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

<!-- GENERATED /props -->
