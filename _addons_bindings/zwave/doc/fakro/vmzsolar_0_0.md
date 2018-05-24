---
layout: documentation
title: VMZ Solar - ZWave
---

{% include base.html %}

# VMZ Solar Awning Blind
This describes the Z-Wave device *VMZ Solar*, manufactured by *Fakro* with the thing type UID of ```fakro_vmzsolar_00_000```.

The device is in the category of Blinds, defining Roller shutters, window blinds, etc..

# Overview

## Channels
The following table summarises the channels available for the VMZ Solar

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Blinds control | blinds_control | Blinds | Rollershutter | 

### Switch
The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds control
The ```blinds_control``` channel supports the ```Rollershutter``` item and is in the ```Blinds``` category.



## Device Configuration
The following table provides a summary of the 6 configuration parameters available in the VMZ Solar.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | mode | operating mode |
| 2 | winter mode | Summer/Winter mode |
| 3 | Measurement frequency | Measurement frequency |
| 4 | Level of sensitivity for day | Level of sensitivity for day |
| 5 | Temperature | Temperature |
| 6 | Level of sensitivity for night | Level of sensitivity for night |

### Parameter 1: mode
operating mode
Operating mode. Available values:

0 - manual

1 - semiauto

2 - auto
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | manual |
| 1 | semiauto |
| 2 | auto |

The manufacturer defined default value is 1 (semiauto).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: winter mode
Summer/Winter mode
Summer / Winter mode

50 - Auto (summer / winter mode)

0 - summer mode only
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | summer mode only |
| 50 | Auto (summer / winter mode) |

The manufacturer defined default value is 50 (Auto (summer / winter mode)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Measurement frequency
Measurement frequency

Values in the range 1 to 30 may be set.

The manufacturer defined default value is 3.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Level of sensitivity for day
Level of sensitivity for day

Values in the range 1 to 99 may be set.

The manufacturer defined default value is 60.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Temperature
Temperature

Values in the range 0 to 0 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 6: Level of sensitivity for night
Level of sensitivity for night

Values in the range 1 to 9 may be set.

The manufacturer defined default value is 3.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The VMZ Solar supports 0 association group.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_CONFIGURATION_V0| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V0| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/670).
