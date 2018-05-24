---
layout: documentation
title: CometZ - ZWave
---

{% include base.html %}

# CometZ Thermostatic Valve
This describes the Z-Wave device *CometZ*, manufactured by *Eurotronics* with the thing type UID of ```eurotronic_cometz_00_000```.

The device is in the category of Radiator Control, defining Controls on radiators used to heat up rooms.

# Overview

## Channels
The following table summarises the channels available for the CometZ

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Openness Of The Valve | switch_dimmer | DimmableLight | Dimmer | 
| Temperature measured by the device | sensor_temperature | Temperature | Number | 
| Thermostat mode | thermostat_mode | Temperature | Number | 
| Temperature for Heat (Eco) | thermostat_setpoint | Temperature | Number | 
| Temperature for Heat (Comfort) | thermostat_setpoint | Temperature | Number | 

### Openness Of The Valve
The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Temperature measured by the device
The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Thermostat mode
The ```thermostat_mode``` channel supports the ```Number``` item and is in the ```Temperature``` category.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Off |
| 1 | Heat |
| 2 | Cool |
| 3 | Auto |
| 4 | Aux Heat |
| 5 | Resume |
| 6 | Fan Only |
| 7 | Furnace |
| 8 | Dry Air |
| 9 | Moist Air |
| 10 | Auto Changeover |
| 11 | Heat Economy |
| 12 | Cool Economy |
| 13 | Away |
| 15 | Full Power |
| 31 | Manufacturer Specific |

### Temperature for Heat (Eco)
The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Temperature for Heat (Comfort)
The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration
The following table provides a summary of the 0 configuration parameter available in the CometZ.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|

## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The CometZ supports 0 association group.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V4| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/372).
