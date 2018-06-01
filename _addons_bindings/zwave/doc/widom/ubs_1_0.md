---
layout: documentation
title: WiDom Universal Relay Switch - ZWave
---

{% include base.html %}

# WiDom Universal Relay Switch WiDom Universal Relay Switch
This describes the Z-Wave device *WiDom Universal Relay Switch*, manufactured by *wiDom* with the thing type UID of ```widom_ubs_01_000```.
This version of the device is limited to firmware version 1.0

The WiDom Universal Relay Switch supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/298) to improve the documentation.

## Channels

The following table summarises the channels available for the WiDom Universal Relay Switch -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the WiDom Universal Relay Switch.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Device status 1 click | Device status when the external switch receives 1 click |
| 2 | Device status 2 click |  |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Device status 1 click

Device status when the external switch receives 1 click

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | TOGGLE |
| 2 | ON |
| 3 | OFF |
| 4 | IGNORE |

The manufacturer defined default value is ```1``` (TOGGLE).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Device status 2 click


Device status when the external switch receives 2 click
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | TOGGLE |
| 2 | ON |
| 3 | OFF |
| 4 | IGNORE |

The manufacturer defined default value is ```1``` (TOGGLE).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.

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

The WiDom Universal Relay Switch supports 5 association groups.

### Group 1: Group 1


This group supports 16 nodes.

### Group 2: Group 2


This group supports 16 nodes.

### Group 3: Group 3


This group supports 16 nodes.

### Group 4: Group 4


This group supports 16 nodes.

### Group 5: Group 5


This group supports 16 nodes.

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
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/298/Widom-UBS--Operating-Manual-multiple-pages-en.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/298).
