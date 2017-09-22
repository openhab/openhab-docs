angular-dialgauge
=================

AngularJS directive for a dial gauge. This uses SVG and will automatically size to the parent. Therefore the parent should
have a size.

The following options are possible. These can either be set as separate configuration items, or a configuration object
called ```options``` can be set to provide a single configuration object.

Option              | Description
--------------------| -----------
rotate              | Sets the rotation of the gauge
angle               | Sets the total angle of the active part of the gauge
scaleMin            | Sets the minimum value
scaleMax            | Sets the maximum value
lineCap             | Sets the endcap for the bar line (round, butt, square)
barWidth            | Sets the width of the bar
barColor            | Sets the color of the bar
barColorEnd         | Along with _barColor_ will produce a dynamic color for the bar. Must be used with ```#rrggbb``` color format.
barAngle            | Sets the angle of the indicator if a knob style is desired
trackColor          | Sets the color of the track behind the bar
scaleOffset         |
scaleMajorColor     | Sets the color to be used for the minor ticks in the scale
scaleMajorWidth     | Sets the width of the line for the minor ticks in the scale
scaleMajorLength    | Sets the length of the line for the minor ticks in the scale
scaleMajorSteps     | Sets the number of major steps
scaleMinorColor     | Sets the color to be used for the minor ticks in the scale
scaleMinorWidth     | Sets the width of the line for the minor ticks in the scale
scaleMinorLength    | Sets the length of the line for the minor ticks in the scale
scaleMinorSteps     | Sets the number of minor steps
dialWidth           |
borderWidth         | Sets the width of the border
borderOffset        | Sets the number of pixels between the border and the scale
borderColor         | Sets the border color used to create a circle around the outside of the gauge
title               | Sets the title string
units               | Sets the text to be used for the units


The following CSS classes can be used for the text -:

Class               | Description
--------------------| -----------
dialgauge-title     | Styles the title caption
dialgauge-value     | Styles the value (number)
dialgauge-unit      | Styles the unit


For example -:
```
.dialgauge-unit {
  font-size:14px;
  font-weight:100;
  fill: grey;
  stroke: grey;
}

.dialgauge-value {
  font-size:20px;
  font-weight:200;
  fill: white;
  stroke: white;
}
```

Installation
============
Use bower
```
bower install angular-dialgauge --save
```

Add the ```angular-dialgauge.js``` file to your application and ensure you register the directive by adding 
```ngDialGauge``` to your app.


License
=======
Licensed under MIT license.
