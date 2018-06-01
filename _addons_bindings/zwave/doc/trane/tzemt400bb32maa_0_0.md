---
layout: documentation
title: TZEMT400BB32MAA - ZWave
---

{% include base.html %}

# TZEMT400BB32MAA Trane Z-Wave Programmable Thermostat
This describes the Z-Wave device *TZEMT400BB32MAA*, manufactured by *Trane Corporation* with the thing type UID of ```trane_tzemt400bb32maa_00_000```.

![TZEMT400BB32MAA product image](https://www.cd-jackson.com/zwave_device_uploads/245/245_default.jpg)


The TZEMT400BB32MAA supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/245) to improve the documentation.

## Channels

The following table summarises the channels available for the TZEMT400BB32MAA -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Thermostat mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | Temperature | Number | 
| Setpoint (cooling) | thermostat_setpoint | Temperature | Number | 
| Thermostat fan mode | thermostat_fanmode |  |  | 
| Thermostat fan state | thermostat_fanstate |  |  | 
| Clock Time Offset | time_offset | Temperature | Number | 

### Sensor (temperature)

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Thermostat mode

Sets the thermostat.

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

### Operating State

Sets the thermostat operating state.

The ```thermostat_state``` channel supports the ```Number``` item and is in the ```Temperature``` category.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Idle |
| 1 | Heating |
| 2 | Cooling |
| 3 | Fan Only |
| 4 | Pending Heat |
| 5 | Pending Cool |
| 6 | Vent / Economiser |

### Setpoint (heating)

Sets the thermostate setpoint.

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Setpoint (cooling)

Sets the thermostate setpoint.

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.

### Thermostat fan mode

Channel type information on this channel is not found.

### Thermostat fan state

Channel type information on this channel is not found.

### Clock Time Offset

Provides the current time difference for the devices time.

The ```time_offset``` channel supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the TZEMT400BB32MAA.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 132 | Schedule Mode |  |

### Parameter 132: Schedule Mode



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Hold |
| 1 | Schedule |

The manufacturer defined default value is ```0``` (Hold).

This parameter has the configuration ID ```config_132_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The TZEMT400BB32MAA supports 1 association group.

### Group 1: Reports


This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_STATE_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_LOCK_V0| |
| COMMAND_CLASS_CLOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/245/d3f32301-3cd0-496f-925a-a0d76971e67c.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/245).
