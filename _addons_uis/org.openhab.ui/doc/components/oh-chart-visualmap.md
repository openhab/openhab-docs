# oh-chart-visualmap - Visual Map

<!-- GENERATED componentDescription -->

<!-- GENERATED /componentDescription -->

## Configuration

<!-- GENERATED props -->

- `show` <small>BOOLEAN</small> _Show_

  Whether to show or not this component

### Boundaries

Values considered in range for this visual map (by default [0, 200])<br/><strong>These cannot be determined from the series and have to be defined manually!</strong>


- `min` <small>TEXT</small> _Min_

  Minimum boundary

- `max` <small>TEXT</small> _Max_

  Maximum boundary

### Appearance


- `type` <small>TEXT</small> _Type_

  Type of visual map - continuous or piecewise

  | Option | Label |
  |--------|-------|
  | `continuous` | Continuous |
  | `piecewise` | Piecewise |


- `orient` <small>TEXT</small> _Orientation_

  | Option | Label |
  |--------|-------|
  | `horizontal` | Horizontal |
  | `vertical` | Vertical |


- `calculable` <small>BOOLEAN</small> _Show handles_

  Show handles to filter data in continuous mode

- `pieces` <small>INTEGER</small> _Number of pieces_

  Number of pieces in piecewise mode

- `presetPalette` <small>TEXT</small> _Preset color palette_

  Choose from a selection of preset color palettes for the values in range. The default is a yellow (low) to red (high) gradient

  | Option | Label |
  |--------|-------|
  | `greenred` | Green-Yellow-Red |
  | `whiteblue` | White-Blue |
  | `bluered` | Blue-red |


### Position

Each parameter accepts pixel values or percentages. Additionally, top accepts "top", "middle" and "bottom" to align the component vertically, and left accepts "left", "center" and "right" to align the component horizontally


- `top` <small>TEXT</small> _Top_

- `bottom` <small>TEXT</small> _Bottom_

- `left` <small>TEXT</small> _Left_

- `right` <small>TEXT</small> _Right_

- `width` <small>TEXT</small> _Width_

- `height` <small>TEXT</small> _Height_

<!-- GENERATED /props -->
