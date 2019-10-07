---
layout: documentation
title: GoControl GC-TBZ48 - ZWave
---

{% include base.html %}

# GoControl GC-TBZ48 Z-Wave Plus Thermostat
This describes the Z-Wave device *GoControl GC-TBZ48*, manufactured by *Linear Corp* with the thing type UID of ```linear_gctbz48_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![GoControl GC-TBZ48 product image](https://www.cd-jackson.com/zwave_device_uploads/622/622_default.jpg)


The GoControl GC-TBZ48 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

The Z-Wave Thermostat (GC-TBZ48) is a programmable, Z-Wave communications thermostat. It can be powered using 24VAC (if both “R”&”C”wires are available at the thermostat), or using four (4) AA batteries. Using Z-Wave technology, end users have the ability to use the 2GIG Go!Control panel to control the thermostat, configure programming settings, as well as to display current conditions in the home or office.

### Inclusion Information

  1. Set your primary controller to Include, add or Install mode, to add the thermostat as a node on your network (see your controller’s user manual for detailed instructions).
  2. Press any button to take thermostat out of sleep mode.
  3. Press and hold FAN button for 5 seconds. SETUP will be displayed in the status display line.
  4. Scroll to “Z-Wave” using up/down buttons. Press SELECT.
  5. When prompted by your Z-Wave controller, Press the YES button in the Z-Wave Install screen.
  6. Press SELECT (mode button) to add thermostat to network.
  7. Display line should flash WAIT then SUCCESS if Z-Wave connection is made.
  8. If Z-Wave does not connect to controller, WAIT, then FAIL will flash in status display line.
  9. If thermostat fails to connect, repeat Steps three (3) through (7) to re-try connecting.

### Exclusion Information

  1. Set your primary controller to Include, add or Install mode, to add the thermostat as a node on your network (see your controller’s user manual for detailed instructions).
  2. Press any button to take thermostat out of sleep mode.
  3. Press and hold FAN button for 5 seconds. SETUP will be displayed in the status display line.
  4. Scroll to “Z-Wave” using up/down buttons. Press SELECT.
  5. When prompted by your Z-Wave controller, Press the YES button in the Z-Wave Install screen.
  6. Press SELECT (mode button) to add thermostat to network.
  7. Display line should fl ash WAIT then SUCCESS if Z-Wave connection is made.
  8. If Z-Wave does not connect to controller, WAIT, then FAIL will flash in status display line. 

## Channels

The following table summarises the channels available for the GoControl GC-TBZ48 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | thermostat_state | Temperature | Number | 
| Setpoint (cooling) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Thermostat fan mode | thermostat_fanmode | thermostat_fanmode |  |  | 
| Thermostat fan state | thermostat_fanstate | thermostat_fanstate |  |  | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Clock Time Offset | time_offset | time_offset | Temperature | Number | 

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

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

### Setpoint (cooling)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Thermostat fan mode
Channel type information on this channel is not found.

### Thermostat fan state
Channel type information on this channel is not found.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 38 configuration parameters available in the GoControl GC-TBZ48.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | System Type | System Type |
| 2 | Fan Type | Fan Type |
| 3 | Change Over Type | Change Over Type |
| 4 | 2nd Stage Heat Enable | 2nd Stage Heat Enable |
| 5 | Aux Heat Enable | Aux Heat Enable |
| 6 | 2nd Stage Cool Enable | 2nd Stage Cool Enable |
| 7 | Temperature Unit | Temperature Unit |
| 8 | Minimum Off Time | Minimum Off Time |
| 9 | Minimum Run Time | Minimum Run Time |
| 10 | Setpoint H/C Delta | Setpoint H/C Delta |
| 11 | H Delta Stage 1 ON | H Delta Stage 1 ON |
| 12 | H Delta Stage 1 OFF | H Delta Stage 1 OFF |
| 13 | H Delta Stage 2 ON | H Delta Stage 2 ON |
| 14 | H Delta Stage 2 OFF | H Delta Stage 2 OFF |
| 15 | H Delta Aux ON | H Delta Aux ON |
| 16 | H Delta Stage 3 OFF | H Delta Stage 3 OFF |
| 17 | C Delta Stage 1 ON | C Delta Stage 1 ON |
| 18 | C Delta Stage 1 OFF | C Delta Stage 1 OFF |
| 19 | C Delta Stage 2 ON | C Delta Stage 2 ON |
| 20 | C Delta Stage 2 OFF | C Delta Stage 2 OFF |
| 23 | Lifeline Association Group Report To Send | Lifeline Association Group Report To Send |
| 24 | Display Lock | Display Lock |
| 26 | Backlight Timer | Backlight Timer |
| 33 | Max Heat Setpoint | Max Heat Setpoint |
| 34 | Min Cool Setpoint | Min Cool Setpoint |
| 38 | Schedule Enable | Schedule Enable |
| 39 | Run/Hold Mode | Run/Hold Mode |
| 40 | Setback Mode | Setback Mode |
| 41 | Un-Occupied HSP | Un-Occupied HSP |
| 42 | Un-Occupied CSP | Un-Occupied CSP |
| 43 | Remote Sensor 1 Node Number | Remote Sensor 1 Node Number |
| 46 | Remote Sensor 1 Temperature | Remote Sensor 1 Temperature |
| 48 | Internal Sensor Temp Offset | Internal Sensor Temp Offset |
| 49 | R1 Sensor Temp Offset | R1 Sensor Temp Offset |
| 54 | Heat Timer | Heat Timer |
| 55 | Cool Timer | Cool Timer |
| 61 | Fan Purge Heat | Fan Purge Heat |
| 62 | Fan Purge Cool | Fan Purge Cool |

### Parameter 1: System Type

System Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Standard |
| 1 | Heat Pump |

The manufacturer defined default value is ```0``` (Standard).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Fan Type

Fan Type
  * 0 = Gas (no fan w/Heat)
  * 1 = Electric (Fan w/Heat)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Gas |
| 1 | Electric |

The manufacturer defined default value is ```0``` (Gas).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Change Over Type

Change Over Type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | w/Cool |
| 1 | w/Heat |

The manufacturer defined default value is ```0``` (w/Cool).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: 2nd Stage Heat Enable

2nd Stage Heat Enable

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Aux Heat Enable

Aux Heat Enable

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: 2nd Stage Cool Enable

2nd Stage Cool Enable

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Temperature Unit

Temperature Unit

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Celsius |
| 1 | Fahrenheit |

The manufacturer defined default value is ```1``` (Fahrenheit).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Minimum Off Time

Minimum Off Time
Sets the Minimum Off Time (MOT) delay before another heating/cooling cycle can begin
Values in the range 5 to 9 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Minimum Run Time

Minimum Run Time
Sets the Minimum Run Time (MRT) delay before a heating/cooling cycle can turn off
Values in the range 3 to 9 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Setpoint H/C Delta

Setpoint H/C Delta
Sets the minimum separation between heating and cooling setpoints
Values in the range 3 to 15 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: H Delta Stage 1 ON

H Delta Stage 1 ON
Sets the delta from setpoint that stage 1 heating starts
Values in the range 1 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: H Delta Stage 1 OFF

H Delta Stage 1 OFF
Sets the delta from setpoint that stage 1 heating stops
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: H Delta Stage 2 ON

H Delta Stage 2 ON
Sets the delta from setpoint that stage 2 heating starts
Values in the range 2 to 7 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: H Delta Stage 2 OFF

H Delta Stage 2 OFF
Sets the delta from setpoint that stage 2 heating stops
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: H Delta Aux ON

H Delta Aux ON
Sets the delta from setpoint that stage 3 heating starts
Values in the range 3 to 8 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: H Delta Stage 3 OFF

H Delta Stage 3 OFF
Sets the delta from setpoint that stage 3 heating stops
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: C Delta Stage 1 ON

C Delta Stage 1 ON
Sets the delta from setpoint that stage 1 cooling starts
Values in the range 1 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: C Delta Stage 1 OFF

C Delta Stage 1 OFF
Sets the delta from setpoint that stage 1 cooling stops
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: C Delta Stage 2 ON

C Delta Stage 2 ON
Sets the delta from setpoint that stage 2 cooling starts
Values in the range 2 to 7 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: C Delta Stage 2 OFF

C Delta Stage 2 OFF
Sets the delta from setpoint that stage 2 cooling stops
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 23: Lifeline Association Group Report To Send

Lifeline Association Group Report To Send
Report to send to the Lifeline Association Group upon change in thermostat state. 

Bitmask values:

  * 1 = Temperature
  * 2 = Heat Setpoint
  * 4 = Cool Setpoint
  * 8 = Thermostat Heat/Cooling Mode
  * 16 = Fan Mode
  * 32 = Fan State
  * 64 = Operating State
  * 128 = Schedule (send CC parameter 38)
  * 256 = Setback (send CC parameter 40)
  * 512 = Run Hold (send CC parameter 39)
  * 1024 = Display Lock (send CC parameter 24)
  * 8192 = Battery Level
  * 16834 = Mechanical Relay State (send CC parameter 21)
  * 32768 = Thermostat State Config (send CC parameter 22)    This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```8319```.

This parameter has the configuration ID ```config_23_4``` and is of type ```INTEGER```.


### Parameter 24: Display Lock

Display Lock

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Unlocked |
| 1 | Locked |

The manufacturer defined default value is ```0``` (Unlocked).

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 26: Backlight Timer

Backlight Timer
Sets the time from last button press that the backlight will turn OFF
Values in the range 10 to 30 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_26_1``` and is of type ```INTEGER```.


### Parameter 33: Max Heat Setpoint

Max Heat Setpoint
Sets the maximum heating setpoint value
Values in the range 30 to 109 may be set.

The manufacturer defined default value is ```90```.

This parameter has the configuration ID ```config_33_1``` and is of type ```INTEGER```.


### Parameter 34: Min Cool Setpoint

Min Cool Setpoint
Sets the minimum cooling setpoint value
Values in the range 33 to 112 may be set.

The manufacturer defined default value is ```61```.

This parameter has the configuration ID ```config_34_1``` and is of type ```INTEGER```.


### Parameter 38: Schedule Enable

Schedule Enable
Enable or disable thermostat's local scheduler
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_38_1``` and is of type ```INTEGER```.


### Parameter 39: Run/Hold Mode

Run/Hold Mode
0 = Hold, 1 = Run
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Hold |
| 1 | Run |

The manufacturer defined default value is ```0``` (Hold).

This parameter has the configuration ID ```config_39_1``` and is of type ```INTEGER```.


### Parameter 40: Setback Mode

Setback Mode

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No Setback |
| 2 | Unoccupied Mode |

The manufacturer defined default value is ```0``` (No Setback).

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 41: Un-Occupied HSP

Un-Occupied HSP
Heat Setpoint for Unoccupied mode
Values in the range 30 to 109 may be set.

The manufacturer defined default value is ```62```.

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 42: Un-Occupied CSP

Un-Occupied CSP
Cool Setpoint for Unoccupied mode
Values in the range 33 to 112 may be set.

The manufacturer defined default value is ```80```.

This parameter has the configuration ID ```config_42_1``` and is of type ```INTEGER```.


### Parameter 43: Remote Sensor 1 Node Number

Remote Sensor 1 Node Number
Node number for Remote Sensor 1
Values in the range 0 to 252 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_43_1``` and is of type ```INTEGER```.


### Parameter 46: Remote Sensor 1 Temperature

Remote Sensor 1 Temperature
Temperature of Remote Sensor 1
Values in the range 0 to 112 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_46_1``` and is of type ```INTEGER```.


### Parameter 48: Internal Sensor Temp Offset

Internal Sensor Temp Offset
Internal Sensor Temperature Offset
Values in the range -7 to 7 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_48_1``` and is of type ```INTEGER```.


### Parameter 49: R1 Sensor Temp Offset

R1 Sensor Temp Offset
R1 Sensor Temperature Offset
Values in the range -7 to 7 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_49_1``` and is of type ```INTEGER```.


### Parameter 54: Heat Timer

Heat Timer
Heat Timer in hours
Values in the range 0 to 4000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_54_2``` and is of type ```INTEGER```.


### Parameter 55: Cool Timer

Cool Timer
Cool Timer in hours
Values in the range 0 to 4000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_55_2``` and is of type ```INTEGER```.


### Parameter 61: Fan Purge Heat

Fan Purge Heat
Fan purge period for Heat modeThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 90 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_61_1``` and is of type ```INTEGER```.


### Parameter 62: Fan Purge Cool

Fan Purge Cool
Fan purge period for Cool modeThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 90 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_62_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The GoControl GC-TBZ48 supports 3 association groups.

### Group 1: Group 1

Lifeline

Association group 1 supports 5 nodes.

### Group 2: Group 2


Association group 2 supports 5 nodes.

### Group 3: Group 3


Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_STATE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_CLOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CMD_V1| |

### Documentation Links

* [Product Manual](https://www.cd-jackson.com/zwave_device_uploads/622/GC-TBZ48-Install.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/622).
