---
layout: documentation
title: powerSwitch - ZWave
---

{% include base.html %}

# powerSwitch Power Switch EU
This describes the Z-Wave device *powerSwitch*, manufactured by *[BeNext](http://www.benext.eu/)* with the thing type UID of ```benext_powerswitch_00_000```.

The powerSwitch supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/224) to improve the documentation.

## Channels

The following table summarises the channels available for the powerSwitch -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 4 configuration parameters available in the powerSwitch.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Set to Default | Set all configuration values to default values (factory settings) |
| 4 | Start up with last known socket status | state in what the switch is when power is supplied |
| 9 | Relay delay time | When the relay is switched it can't be switched again until the configured time has passed |
| 10 | Led indicator | Show the led compared to the relay state |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Set to Default

Set all configuration values to default values (factory settings)
All values (0x00 – 0xFF) except for 0x55 can be used to default all the configuration params .
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 4: Start up with last known socket status

state in what the switch is when power is supplied
If 0x01–0xFF: When power applied socket is the state before power was disconnected
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 9: Relay delay time

When the relay is switched it can't be switched again until the configured time has passed
Value \* 10 milliseconds
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Led indicator

Show the led compared to the relay state
If value is 0: the indicator led is never switched on If value is 1: the indicator led is switched on when relay is switched on If value is 2: the indicator led is switched on when relay is switched off
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.

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

The powerSwitch supports 1 association group.

### Group 1: Group 1


This group supports 1 nodes.

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
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/224/powerswitch.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/224).
