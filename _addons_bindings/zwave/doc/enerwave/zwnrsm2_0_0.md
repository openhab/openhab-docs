---
layout: documentation
title: ZWN-RSM2 - ZWave
---

{% include base.html %}

# ZWN-RSM2 Smart Dual Relay Switch Module
This describes the Z-Wave device *ZWN-RSM2*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zwnrsm2_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZWN-RSM2 product image](https://www.cd-jackson.com/zwave_device_uploads/465/465_default.png)


The ZWN-RSM2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

This smart relay can be used to convert a continuous load into a remotely switched load or used in conjunction with the existing manual switches to add remote operability. For the advanced users of Z-Wave, the functions can be customized with programming codes.

### Inclusion Information

Put controller into inclusion mode, toggle ON and OFF 3 times

### Exclusion Information

Put controller into exclusion mode, toggle ON and OFF 3 times

## Channels

The following table summarises the channels available for the ZWN-RSM2 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the ZWN-RSM2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 3 | Unsolicited Report Configuration | Send unsolicited status report to primary controller |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 3: Unsolicited Report Configuration

Send unsolicited status report to primary controller
ZWN-RSM2 can send unsolicited status report to primary controller (Node ID 0X01) when switch toggled due to some controllers designed as gateway. If your controller is not a gateway or does not need the status or you think it could confuse your Z-Wave net
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.

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

The ZWN-RSM2 supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 1 node.

### Group 2: Switch Binary Report EP1


Association group 2 supports 3 nodes.

### Group 3: Switch Binary Report EP2


Association group 3 supports 3 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V2| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/465/ZWN-RSM2-Plus-0208160044-01.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/465).
