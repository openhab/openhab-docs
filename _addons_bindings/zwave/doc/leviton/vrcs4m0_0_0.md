---
layout: documentation
title: VRCS4-M0 - ZWave
---

{% include base.html %}

# VRCS4-M0 4-Scene controller with load control
This describes the Z-Wave device *VRCS4-M0*, manufactured by *Leviton* with the thing type UID of ```leviton_vrcs4m0_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![VRCS4-M0 product image](https://www.cd-jackson.com/zwave_device_uploads/881/881_default.png)


## Overview

Hybrid 4 button scene controller with single pole switch. Vizia RF + 4-Button Remote Scene Controller with built in single pole switch, rated @ 120/240 VAC, 50/60HZ.

The top four buttons provide ON/OFF switching of four scenes.  Each button can have up to 32 devices associated with it. 

The bottom button transmits DIM/BRIGHT commands to the most recently switched-ON scene.

### Inclusion Information

To access programming mode, press and hold the left side of buttons 1 and 3. Wait 5 seconds until the LEDs turn amber then release the buttons.  The LEDs will blink amber.

While holding your system controller close the the 4-Scene controller (approximately 1 foot) put your system comptroller into inclusion mode.  When the 4-Scene controller is included in your system the LEDs will turn off.

If the LEDs on the 4-Scene controller turn red while including, there has been a communications problem.

The instructions state that only one device may be included at a time and it seems that inclusion works best if the system controller is put in including mode after the device is in programming mode.

If the 4-Scene controller has been successfully included in the network and the user tries to include it again without first excluding it from the network, the controller will retain the first node ID it had received and ignore the second.

### Exclusion Information

To access programming mode, press and hold the left side of buttons 1 and 3. Wait 5 seconds until the LEDs turn amber then release the buttons.  The LEDs will blink amber.

While holding your system controller close the the 4-Scene controller (approximately 1 foot) put your system comptroller into exclusion mode.  When the 4-Scene controller is excluded from your system the LEDs will turn off.

If the LEDs on the 4-Zone controller turn red while excluding, there has been a communications problem.

## Channels

The following table summarises the channels available for the VRCS4-M0 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number | 

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The VRCS4-M0 supports 4 association groups.

### Group 1: Button 1

First (top) button on controller
On off control of associated scene or zone.

Association group 1 supports 32 nodes.

### Group 2: Button 2

Second button on controller
On off control of associated scene or zone.

Association group 2 supports 32 nodes.

### Group 3: Button 3

Third button on controller
On off control of associated scene or zone.

Association group 3 supports 32 nodes.

### Group 4: Button 4

Fourth button on controller
On off control of associated scene or zone.

Association group 4 supports 32 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| Linked to BASIC|
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_SCENE_CONTROLLER_CONF_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_HAIL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Leviton VRCS4-M0 installation instructions](https://www.cd-jackson.com/zwave_device_uploads/881/Leviton-VRCS4-M0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/881).
