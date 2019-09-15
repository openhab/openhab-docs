---
layout: documentation
title: SW-ZCS-1 - ZWave
---

{% include base.html %}

# SW-ZCS-1 Cord Switch
This describes the Z-Wave device *SW-ZCS-1*, manufactured by *CBCC Domotique SAS* with the thing type UID of ```cbcc_swzcs1_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![SW-ZCS-1 product image](https://www.cd-jackson.com/zwave_device_uploads/236/236_default.jpg)


The SW-ZCS-1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The wall switch is in “Gateway” Mode as soon as it is added in a Z-Wave® network managed by a home automation gateway.

The wall switch becomes then the gateway’s assistant, capable to launch up to 16 different scenes through it (SCENE Profile) or directly associated to your Z-Wave® compatible devices (MONO or DUO Profile).

### Inclusion Information

  1. Simultaneously push on 1 and 2, during 1sec. The LED glows in pink to confirm the selection
  2. Push on 1, within 10 seconds. The LED blinks in pink to confirm your choice The LED blinks in green to confirm the procedure

### Exclusion Information

  1. Simultaneously push on 1 and 2, during 1sec. The LED glows in pink to confirm the selection
  2. Push on 1, within 10 seconds. The LED blinks in pink to confirm your choice The LED blinks in green to confirm the procedure

## Channels

The following table summarises the channels available for the SW-ZCS-1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the SW-ZCS-1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Switch All |  |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Switch All



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch on only |
| 2 | Switch off only |
| 255 | Fully enabled (Default) |

The manufacturer defined default value is ```255``` (Fully enabled (Default)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The SW-ZCS-1 supports 2 association groups.

### Group 1: Group 1


Association group 1 supports 5 nodes.

### Group 2: Group 2


Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [NodON Wall Switch User Guide](https://www.cd-jackson.com/zwave_device_uploads/236/NodOn-WallSwitch-ZWave-UserGuide-EN-2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/236).
