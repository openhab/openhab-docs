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

Transform a given input by matching it between limits of ranges.
The input string must be in numerical format.

The file is expected to exist in the `transform` directory, and should follow the format given in the table below.

| scale expression | returns XYZ when the given value is |
|--------------------|--------|
| `[12..23]=XYZ` | `between (or equal to) 12 and 23` |
| `]12..23[=XYZ` | `between 12 and 23 (12 and 23 are excluded in this case.)` |
| `..23]=XYZ` | `lower than or equal to 23` |
| `]12..=XYZ` | `greater than 12` |

## Example

The following example shows how to break down numeric UV values into fixed UV index categories.
We have an example UV sensor that sends us numeric values from `0` to `100`, which we then want to scale into the *UV Index* range.
For further Information on the UV Index take a look at [Wikipedia](https://en.wikipedia.org/wiki/Ultraviolet_index).

Example item:

```java
Number Uv_Sensor_Level "UV Level [SCALE(uvindex.scale):%s]"
```

Uvindex.scale in transform folder:

```python
..3]=1
]3..6]=2
]6..8]=3
]8..10]=4
[10..100]=5
```

Each value the item receives, will be categorized to one of the five given ranges.
Values **lower than or equal to 3** are catched with `..3]=1`.
Greater values are catched in ranges with 2 values as criteria.
The only condition here is that the received value has to be lower than or equal to `100` in our example, since we haven't defined other cases yet.
If **none** of the configured conditions matches the given value, the response will be empty.

Please note that all ranges for values above **3** are opened with a `]`.
So the border values (3, 6, 8 and 10) are always transformed to the lower range, since the `]`excludes the given critera.

With the different expression formats you could add an additional range to our example from above and catch sensor values above 100 with `]100..=6` for example.