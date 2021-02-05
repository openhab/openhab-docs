# oh-stepper-item - Stepper List Item

<!-- GENERATED componentDescription -->
Display a stepper control in a list
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

### Stepper


- `item` <small>TEXT</small> _Item_

  Item to control

- `min` <small>DECIMAL</small> _Min_

  Minimum value

- `max` <small>DECIMAL</small> _Max_

  Maximum value

- `step` <small>DECIMAL</small> _Step_

  Minimum interval between values

- `buttonsOnly` <small>BOOLEAN</small> _Buttons Only_

  Display the buttons without the value in the middle

- `small` <small>BOOLEAN</small> _Small_

  Smaller size

- `large` <small>BOOLEAN</small> _Large_

  Larger size

- `fill` <small>BOOLEAN</small> _Fill_

  Fill the buttons with the primary color

- `raised` <small>BOOLEAN</small> _Raised_

  Display the buttons with a raised style

- `round` <small>BOOLEAN</small> _Round_

  Display the buttons with a rounded style

- `autorepeat` <small>BOOLEAN</small> _Auto-repeat_

  Continue to increase/decrease the value while the buttons keep being pressed

- `autorepeatDynamic` <small>BOOLEAN</small> _Dynamic Auto-repeat_

  Speed up the increase/decrease over time while the buttons keep being pressed

<!-- GENERATED /props -->
