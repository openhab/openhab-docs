---
layout: documentation
title: ZWN-RSM2 - ZWave
---

{% include base.html %}

# ZWN-RSM2 Smart Dual Relay Switch Module
This describes the Z-Wave device *ZWN-RSM2*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zwnrsm2_00_000```.

The device is in the category of Wall Switch, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

# Overview

## Channels
The following table summarises the channels available for the ZWN-RSM2

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Switch 1 | switch_binary1 | Switch | Switch | 
| Switch 2 | switch_binary2 | Switch | Switch | 

### Switch
The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 1
The ```switch_binary1``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 2
The ```switch_binary2``` channel supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration
The following table provides a summary of the 1 configuration parameter available in the ZWN-RSM2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 3 | Unsolicited Report Configuration | ZWN-RSM2 can send unsolicited status report to primary controller (Node ID 0X01) when switch toggled due to some controllers designed as gateway. If your controller is not a gateway or does not need the status or you think it could confuse your Z-Wave net |

### Parameter 3: Unsolicited Report Configuration
ZWN-RSM2 can send unsolicited status report to primary controller (Node ID 0X01) when switch toggled due to some controllers designed as gateway. If your controller is not a gateway or does not need the status or you think it could confuse your Z-Wave net

Values in the range 0 to 255 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZWN-RSM2 supports 0 association group.

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
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/465).
