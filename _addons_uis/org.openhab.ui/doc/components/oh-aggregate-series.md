# oh-aggregate-series - Aggregate Series

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


- `dimension1` <small>TEXT</small> _First Dimension_

  The largest data point cluster size.<br />It should be consistent with the chart type, and match the type of a category axis where this series will appear.

  | Option | Label |
  |--------|-------|
  | `minute` | Minute of Hour |
  | `hour` | Hour of Day |
  | `isoWeekday` | Day of Week (starting on Monday) |
  | `weekday` | Day of Week (starting on Sunday) |
  | `date` | Day of Month |
  | `month` | Month of Year |


- `dimension2` <small>TEXT</small> _Second Dimension_

  The smallest data point cluster size.<br />Set only when you have 2 category axes (for instance day of the week and hour of the day), and make sure to match the type of the 2nd axis.

  | Option | Label |
  |--------|-------|
  | `minute` | Minute of Hour |
  | `hour` | Hour of Day |
  | `isoWeekday` | Day of Week (starting on Monday) |
  | `weekday` | Day of Week (starting on Sunday) |
  | `date` | Day of Month |
  | `month` | Month of Year |


- `transpose` <small>BOOLEAN</small> _Transpose_

  Enable when the first dimension should be mapped to the Y axis instead of the X axis

- `aggregationFunction` <small>TEXT</small> _Aggregation Function_

  How to reduce the data points in a same aggregation cluster to a single value. If not specified, the average function will be used.

  | Option | Label |
  |--------|-------|
  | `average` | Average |
  | `sum` | Sum |
  | `min` | Minimum |
  | `max` | Maximum |
  | `first` | First (earliest) |
  | `last` | Last (latest) |
  | `diff_first` | Difference of firsts |
  | `diff_last` | Difference of lasts |


### Axis and Coordinate System Assignments


- `xAxisIndex` <small>INTEGER</small> _X Axis Index_

  The index of the X axis for this series

- `yAxisIndex` <small>INTEGER</small> _Y Axis Index_

  The index of the Y axis for this series

<!-- GENERATED /props -->
