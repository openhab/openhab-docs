---
layout: documentation
title: AMZ Solar - ZWave
---

{% include base.html %}

# AMZ Solar Solar Awning
This describes the Z-Wave device *AMZ Solar*, manufactured by *Fakro* with the thing type UID of ```fakro_amzsolar_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![AMZ Solar product image](https://www.cd-jackson.com/zwave_device_uploads/1030/1030_default.png)


The AMZ Solar supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

The AMZ Z-Wave Solar Awning Blind is intended for installation in Fakro roof windows and is adapted to cooperation with elements of wireless remote control system offered by FAKRO and other manufacturers offering products with Z-Wave logo. The awning blind is equipped with a two-way radio communication module. For communication, Z-Wave utilizes radio wave frequency of 868,42 MHz.

### Inclusion Information

Start the INCLUDE procedure by means of the controller of the existing network and then press the “Programming” button on the awning blind being added to the network.

### Exclusion Information

Put your controller into exclusion mode, then press the programming button on the awning blind for longer than 1 sec.

## Channels

The following table summarises the channels available for the AMZ Solar -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds Control
Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 6 configuration parameters available in the AMZ Solar.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Operation Mode | Operation Mode |
| 2 | Season | Season |
| 3 | Time | Time |
| 4 | Sensitivity | Sensitivity |
| 12 | Calibration | Calibration |
| 13 | Positioning | Positioning |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Operation Mode

Operation Mode
0 – manual  
1 – semi  
2 – auto
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Season

Season
1 – summer  
2 – winter
Values in the range 1 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Time

Time

Values in the range 1 to 30 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Sensitivity

Sensitivity

Values in the range 3 to 100 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 12: Calibration

Calibration
Value 1 – calibrated  
Value 2 – discalibrated – to enter the calibration mode must first time discalibrate and then calibrate.
Values in the range 1 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Positioning

Positioning
1 – FF go to Max  
2 – FF go to previous position
Values in the range 1 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.

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

The AMZ Solar supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

### Group 2: Basic Repeat


Association group 2 supports 5 nodes.

### Group 3: Multilevel Repeat


Association group 3 supports 5 nodes.

### Group 4: Basic Control


Association group 4 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Manual (EN)](https://www.cd-jackson.com/zwave_device_uploads/1030/AMZ-SOLAR-FAKRO-EN.pdf)
* [Manual (DE)](https://www.cd-jackson.com/zwave_device_uploads/1030/AMZ-Solar-Z-Wave-DE.pdf)
* [Zwave User Manual (EN)](https://www.cd-jackson.com/zwave_device_uploads/1030/MZ-SOLAR-User-Manual-Zwave.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1030).
