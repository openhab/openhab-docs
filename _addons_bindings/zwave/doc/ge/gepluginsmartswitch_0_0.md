---
layout: documentation
title: GE Plug in Smart Switch - ZWave
---

{% include base.html %}

# GE Plug in Smart Switch GE Plug in Smart Switch Zwave Plus
This describes the Z-Wave device *GE Plug in Smart Switch*, manufactured by *Jasco Products* with the thing type UID of ```ge_gepluginsmartswitch_00_000```.

![GE Plug in Smart Switch product image](https://www.cd-jackson.com/zwave_device_uploads/517/517_default.jpg)


The GE Plug in Smart Switch supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/517) to improve the documentation.

## Channels

The following table summarises the channels available for the GE Plug in Smart Switch -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the GE Plug in Smart Switch.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 3 | LED light | control LED light behavior. Default is on when connected device is off |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 3: LED light

control LED light behavior. Default is on when connected device is off

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | reset to factory default |
| 1 | LED is on when connected device is on |
| 2 | LED is off at all times |

The manufacturer defined default value is ```0``` (reset to factory default).

This parameter has the configuration ID ```config_3_1_wo``` and is of type ```INTEGER```.
This is a read only parameter.
This is a write only parameter.

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

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/517/ge-zwaveplus-plug-in-smart-switch-manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/517).
