---
layout: documentation
title: Logitech Harmony Hub - Actions
source: external
---
<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Logitech Harmony Hub Actions

## Actions

* `harmonyPressButton(<device>, <command>)`
* `harmonyPressButton(<qualifier>, <device>, <command>)`
* `harmonyStartActivity(<activity>)`
* `harmonyStartActivity(<qualifier>,<activity>)`


## Examples

```
harmonyPressButton("Lounge", "8-Track", "PowerOn")
harmonyStartActivity("PowerOff")
```
