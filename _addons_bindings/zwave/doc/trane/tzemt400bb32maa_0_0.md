---
layout: documentation
title: TZEMT400BB32MAA - ZWave
---

{% include base.html %}

# TZEMT400BB32MAA Trane Z-Wave Programmable Thermostat
This describes the Z-Wave device *TZEMT400BB32MAA*, manufactured by *Trane Corporation* with the thing type UID of ```trane_tzemt400bb32maa_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![TZEMT400BB32MAA product image](https://www.cd-jackson.com/zwave_device_uploads/245/245_default.jpg)


The TZEMT400BB32MAA supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Thermostat for Heating and Cooling HVAC System control

### Inclusion Information

  * Press the MENU button on the thermostat.
  * Scroll down to Z Wave Install, and press the Select button.
  * Press the Yes button to enroll the thermostat.

### Exclusion Information

  * Press the MENU button on the thermostat.
  * Scroll down to Z Wave Install, and press the Select button.
  * Press the Yes button to enroll the thermostat.

## Channels

The following table summarises the channels available for the TZEMT400BB32MAA -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | thermostat_state | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (cooling) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Thermostat fan mode | thermostat_fanmode | thermostat_fanmode |  |  | 
| Thermostat fan state | thermostat_fanstate | thermostat_fanstate |  |  | 
| Schedule Mode | config_decimal | config_decimal |  | Number | 
| Clock Time Offset | time_offset | time_offset | Temperature | Number | 

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Thermostat mode
Sets the thermostat.

The ```thermostat_mode``` channel is of type ```thermostat_mode``` and supports the ```Number``` item and is in the ```Temperature``` category.
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

### Operating State
Sets the thermostat operating state.

The ```thermostat_state``` channel is of type ```thermostat_state``` and supports the ```Number``` item and is in the ```Temperature``` category.
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
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Setpoint (cooling)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Thermostat fan mode
Channel type information on this channel is not found.

### Thermostat fan state
Channel type information on this channel is not found.

### Schedule Mode
Send 0 to Hold and 1 to Run Schedule.

Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Temperature``` category.



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


Association group 1 supports 1 node.

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
| COMMAND_CLASS_LOCK_V1| |
| COMMAND_CLASS_CLOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/245/d3f32301-3cd0-496f-925a-a0d76971e67c.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/245).
