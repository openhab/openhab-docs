---
id: upb
label: UPB
title: UPB - Bindings
type: binding
description: "The UPB binding is used to enable communication between openHAB and UPB devices. This binding requires the use of a UPB PIM or power-line modem. This binding has only been tested against simple automated devices."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/binding/org.openhab.binding.upb/README.md
since: 1x
install: auto
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# UPB Binding

The UPB binding is used to enable communication between openHAB and UPB devices. This binding requires the use of a UPB PIM or power-line modem. This binding has only been tested against simple automated devices.

## Prerequisites

The binding may not be compatible with Windows.  Please report if you find this to be true or false.

## Binding Configuration

This binding can be configured in the file `services/upb.cfg`.

| Property | Default | Required | Description |
|----------|---------|:--------:|-------------|
| port     |         |   Yes    | Name of the serial device to which the UPB device is connected.  For example, COM1 on Windows or /dev/ttyUSB0 on Linux |
| network  |          |  Yes    | The network number.  Example: `55` |

## Item Configuration

The binding only supports Switches or Dimmers.

```
Dimmer Light_Dining_Room        "Dining Room"           (Lights) {upb="id=2"}
Switch Light_Kitchen            "Kitchen"               (Lights) {upb="id=3"}
```

To activate a link set the link property to true:

```
Dimmer Light_Lamps              "Living Room Lamps"     (Lights) {upb="id=4 link=true"}
```
