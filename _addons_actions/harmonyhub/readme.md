---
id: harmonyhub
label: Logitech Harmony Hub
title: Logitech Harmony Hub - Actions
type: action
description: "*   `harmonyPressButton(<device>, <command>)`"
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/action/org.openhab.action.harmonyhub/README.md
since: 1x
install: manual
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# Logitech Harmony Hub Actions

## Actions

*   `harmonyPressButton(<device>, <command>)`
*   `harmonyPressButton(<qualifier>, <device>, <command>)`
*   `harmonyStartActivity(<activity>)`
*   `harmonyStartActivity(<qualifier>,<activity>)`

## Examples

```
harmonyPressButton("Lounge", "8-Track", "PowerOn")
harmonyStartActivity("PowerOff")
```
