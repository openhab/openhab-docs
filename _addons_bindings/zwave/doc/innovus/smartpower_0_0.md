---
layout: documentation
title: SmartPower - ZWave
---

{% include base.html %}

# SmartPower RAone SmartPower
This describes the Z-Wave device *SmartPower*, manufactured by *INNOVUS* with the thing type UID of ```innovus_smartpower_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![SmartPower product image](https://www.cd-jackson.com/zwave_device_uploads/61/61_default.png)


The SmartPower supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

For the further reduction of energy consumption INNOVUS offers "RAone SmartPower". This module is an on / off module, which is used in particular to reduce the energy consumption of devices that unnecessarily consume power in "stand-by mode". This module also has a fingertip panel and is also equipped with an internal power meter. 

### Inclusion Information

The device is put into learn mode by touching the touchplate.

### Exclusion Information

The device is put into learn mode by touching the touchplate.

## Channels

The following table summarises the channels available for the SmartPower -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Sensor (power) | sensor_power | sensor_power | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (power)
Indicates the energy consumption (kWh).

The ```sensor_power``` channel is of type ```sensor_power``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the SmartPower.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Report node | Report changes in level to this node id |
| 2 | BO IR support | Enable/Disable BO IR Support |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Report node

Report changes in level to this node id
Report Node, reports changes in level to this node id.

Disabled if 0. -> Copied from SmartDimmer, as there's no config information available.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: BO IR support

Enable/Disable BO IR Support
BO IR support is disabled if 0 otherwise enabled. -> Copied from SmartDimmer, as there's no config information available.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (enabled).

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

The SmartPower supports 1 association group.

### Group 1: Switch


Association group 1 supports 5 nodes.

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
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Technical documentation](https://www.cd-jackson.com/zwave_device_uploads/61/smartpower-zw-tech-doc.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/61).
