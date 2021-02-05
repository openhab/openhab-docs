# oh-time-series - Time Series

<!-- GENERATED componentDescription -->

<!-- GENERATED /componentDescription -->

## Configuration

<!-- GENERATED props -->

- `name` <small>TEXT</small> _Name_

  A name which will appear on tooltips and labels

- `item` <small>TEXT</small> _Item_

  The item whose persisted data to display

- `service` <small>TEXT</small> _Persistence Service_

  The identifier of the persistence service to retrieve the data from. Leave blank to the use the default.

- `offsetAmount` <small>INTEGER</small> _Offset Amount_

  Offset to <em>subtract</em> from the displayed period, use if you want to do period comparisons (see also Offset Unit).

- `offsetUnit` <small>STRING</small> _Offset Unit_

  Offset to <em>subtract</em> from the displayed period, use if you want to do period comparisons (see also Offset Amount).

  | Option | Label |
  |--------|-------|
  | `hour` | Hour |
  | `minute` | Minute |
  | `day` | Day |
  | `week` | Week |
  | `month` | Month |
  | `year` | Year |


- `type` <small>TEXT</small> _Type_

  The type of the series.<br/><em>Note: heatmap needs a configured visual map and is not supported for time series</em>

  | Option | Label |
  |--------|-------|
  | `line` | Line |
  | `bar` | Bar |
  | `heatmap` | Heatmap |
  | `scatter` | Scatter |


### Axis and Coordinate System Assignments


- `xAxisIndex` <small>INTEGER</small> _X Axis Index_

  The index of the X axis for this series

- `yAxisIndex` <small>INTEGER</small> _Y Axis Index_

  The index of the Y axis for this series

<!-- GENERATED /props -->
