---
id: xpl
label: xPL
title: xPL - Actions
type: action
description: "This add-on provides xPL message sending on the network."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/action/org.openhab.action.xpl/README.md
since: 1x
install: manual
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# xPL Action

This add-on provides xPL message sending on the network.

## Actions

*   `sendxPLMessage(String target, String msgType, String msgClass, String bodyLine1, String bodyLine2 ...)` : Sends a message over the xPL network.

Parameters shall follow xPL message elements syntax.

| Parameter | Meaning                                                                                                                    |
|-----------|----------------------------------------------------------------------------------------------------------------------------|
| target    | string spelled vendor-device.instance                                                                                      |
| msgType   | being one of : command, trigger, status                                                                                    |
| msgClass  | string spelled class.type                                                                                                  |
| bodyLineX | string containing key and value in the form of "bodykey1=bodyvalue1".  There may be as many bodyLine parameters as needed. |
