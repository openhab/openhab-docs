---
layout: documentation
title: DZ6HD - ZWave
---

{% include base.html %}

# DZ6HD 600W Dimmer
This describes the Z-Wave device *DZ6HD*, manufactured by *Leviton* with the thing type UID of ```leviton_dz6hd_00_000```.

![DZ6HD product image](https://www.cd-jackson.com/zwave_device_uploads/556/556_default.png)


The DZ6HD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/556) to improve the documentation.

## Channels

The following table summarises the channels available for the DZ6HD -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number |  | Number | 

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number

Triggers when a scene button is pressed.

The ```scene_number``` channel supports the ```Number``` item.



## Device Configuration

The following table provides a summary of the 8 configuration parameters available in the DZ6HD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Fade On Time | Fade on time |
| 2 | Fade Off Time | Fade off time |
| 3 | Minimum Light Level | Minimum light level |
| 4 | Maximum Light Level | Maximum light level |
| 5 | Preset Light Level | Preset light level |
| 6 | LED Dim Level Indicator Timeout | LED dim level indicator timeout |
| 7 | Locator LED Status | Locator LED status |
| 8 | Load Type | Load type |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Fade On Time

Fade on time
- 0: Instant on
- 1 to 127: 1-127 seconds
- 128 to 253: 1-126 minutes
Values in the range 0 to 253 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Fade Off Time

Fade off time
- 0: Instant off
- 1 to 127: 1-127 seconds
- 128 to 253: 1-126 minutes
Values in the range 0 to 253 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Minimum Light Level

Minimum light level

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Maximum Light Level

Maximum light level

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Preset Light Level

Preset light level
- 0: Last dim level
- 1 to 100: Level
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: LED Dim Level Indicator Timeout

LED dim level indicator timeout
- 0: LED indicators off
- 1 to 254: Timeout in seconds
- 255: Always on
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Locator LED Status

Locator LED status
- 0: LED off
- 254: Status mode
- 255: Locator mode
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Load Type

Load type
- 0: Incandescent
- 1: LED
- 2: CFL
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.

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

The DZ6HD supports 1 association group.

### Group 1: Group 1

Z-Wave Plus Lifeline
This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_HAIL_V0| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/556/DI-000-DZ6HD-02A-X4--1-.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/556).
