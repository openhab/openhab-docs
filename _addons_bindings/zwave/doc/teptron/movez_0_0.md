---
layout: documentation
title: MoveZ - ZWave
---

{% include base.html %}

# MoveZ ZWave Blind Controllers
This describes the Z-Wave device *MoveZ*, manufactured by *Teptron AB* with the thing type UID of ```teptron_movez_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![MoveZ product image](https://www.cd-jackson.com/zwave_device_uploads/1264/1264_default.jpg)


The MoveZ supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Z-Wave retro fit blind motor.

### Inclusion Information

  1. Set the gateway into inclusion mode (See gateway’s product manual for more information).
  2. Set MOVEZ into learn mode. Learn mode is set by press and holding stop button (middle button) for 10 plus seconds. Once both red and green led indicator start blinking together, release stop button to issue node information frame.
  3. Because device supports S2 Unauthenticated Class gateway may ask for an option of secure or non-secure inclusion. Please select this as per your preference.
  4. Green led blink twice once inclusion process is successfully completed.

### Exclusion Information

  1. Set gateway into the exclusion mode (See gateway user manual for more information)
  2. Set MOVEZ into learn mode. Learn mode is set by press and holding stop button (middle button) for 10 plus seconds. Once both red and green led indicator start blinking together (picture 2, position 5), release stop button to issue node information frame.
  3. Red led blink twice once exclusion process is successfully completed.

## Channels

The following table summarises the channels available for the MoveZ -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Blinds Control
Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 4 configuration parameters available in the MoveZ.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Motor’s up speed | Motor’s up speed |
| 2 | Motor’s down speed | Motor’s down speed |
| 3 | Basic Set 0xFF support | Basic Set 0xFF support |
| 4 | Association group 02 control command preference | Association group 02 control command preference |

### Parameter 1: Motor’s up speed

Motor’s up speed

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Motor’s down speed

Motor’s down speed

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Basic Set 0xFF support

Basic Set 0xFF support

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Association group 02 control command preference

Association group 02 control command preference

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MoveZ supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

### Group 2: Group 2


Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V4| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V3| |

### Documentation Links

* [MOVEZ Beta User Manual](https://www.cd-jackson.com/zwave_device_uploads/1264/MOVEZ-user-manual-draft-v2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1264).
