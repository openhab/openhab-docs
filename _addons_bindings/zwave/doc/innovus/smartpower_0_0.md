---
layout: documentation
title: SmartPower - ZWave
---

{% include base.html %}

# SmartPower RAone SmartPower
This describes the Z-Wave device *SmartPower*, manufactured by *INNOVUS* with the thing type UID of ```innovus_smartpower_00_000```.

# Overview


## Channels

The following table summarises the channels available for the SmartPower

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Sensor (power) | sensor_power | Energy | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 

### Switch

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (power)

The ```sensor_power``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the SmartPower.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Report node | Report changes in level to this node id |
| 2 | BO IR support | Enable/Disable BO IR Support |

### Parameter 1: Report node

Report changes in level to this node id
Report Node, reports changes in level to this node id.

Disabled if 0. -> Copied from SmartDimmer, as there's no config information available.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: BO IR support

Enable/Disable BO IR Support
BO IR support is disabled if 0 otherwise enabled. -> Copied from SmartDimmer, as there's no config information available.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | disabled |
| 1 | enabled |

The manufacturer defined default value is 1 (enabled).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The SmartPower supports 1 association group.

### Group 1: Switch


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SWITCH_TOGGLE_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V2| |
| COMMAND_CLASS_METER_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/61).
