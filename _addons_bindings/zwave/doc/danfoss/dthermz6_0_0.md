---
layout: documentation
title: DTHERMZ6 - ZWave
---

{% include base.html %}

# DTHERMZ6 Living Connect Z Thermostat
This describes the Z-Wave device *DTHERMZ6*, manufactured by *Danfoss* with the thing type UID of ```danfoss_dthermz6_00_000```.

# Overview

## Channels
The following table summarises the channels available for the DTHERMZ6

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | Temperature | Number | 
| Clock Time Offset | time_offset | Temperature | Number | 

### Sensor (temperature)
The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Setpoint (heating)
The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Clock Time Offset
The ```time_offset``` channel supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration
The following table provides a summary of the 0 configuration parameter available in the DTHERMZ6.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|

## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The DTHERMZ6 supports 1 association group.

### Group 1: Target for Wakeup and Override Notifications

This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V6| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_CLIMATE_CONTROL_SCHEDULE_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_PROTECTION_V2| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_CLOCK_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CMD_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/502).
