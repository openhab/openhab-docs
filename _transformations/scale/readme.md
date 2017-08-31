---
id: scale
label: Scale
title: Scale - Transformations
type: transform
description: "Transform the input by matching it between limits of ranges in a scale file.  The input string must be in numerical format."
since: 2x
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Scale Transformation Service

Transform a given input by matching it between limits of ranges in a scale file.
The input string must be in numerical format.

The file is expected to exist in the `transform` directory, and should follow the format given in the example below.

## Example

The following example shows how to break down numeric UV values into fixed UV index categories.

example item:

```java
Number Uv_Sensor_Level "UV Level [SCALE(uvindex.scale):%s]"
```

uvindex.scale in transform folder:

```
[0,3]=1
[3,6]=2
[6,8]=3
[8,10]=4
[10,100]=5
```

Each value the item receives, will be categorized to one of the five given ranges.
The only condition here is that the received value has to be between `0` and `100` in our example, since we haven't defined other cases yet.

## Allowed formats

This table shows the 4 allowed formats for creating scale expressions.

| scale expression | result |
|--------------------|--------|
| `[12..23]=XYZ` | `Returns XYZ when the given value is between (or equal to) 12 and 23` |
| `]12..23[=XYZ` | `Returns XYZ when the given value is between 12 and 23. 12 and 23 are excluded in this case.` |
| `..23]=XYZ` | `Returns XYZ until the given value is lower than or equal to 23` |
| `]12..=XYZ` | `Returns XYZ until the given value is greater than 12` |

With those different expression formats you could add some edge cases to our example from above and catch sensor values above 100 with `]100..=Out of UV index range` for example.