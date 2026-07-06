---
layout: documentation
title: MH5H-TA - ZWave
---

{% include base.html %}

# MH5H-TA Dual Control System Thermostat
This describes the Z-Wave device *MH5H-TA*, manufactured by *[McoHome Technology Co., Ltd](http://www.mcohome.com/)* with the thing type UID of ```mcohome_mh5hta_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![MH5H-TA product image](https://opensmarthouse.org/zwavedatabase/1616/image/)


The MH5H-TA supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

MH5H-TA dual control system thermostat is a Z-wave (800 series) enabled device for indoor temperature control. It is mainly applied to a heat pump air-conditioning system with fan coil and floor heating control.

### Inclusion Information

Under normal display, long press "^" and "fan symbol" to enter interface for inclusion or exclusion of Z-wave network. Before device included into network, "\---" will display on the screen. Then press M once, device will enter learning mode to get a node ID. If inclusion is success, a node ID will display on the screen in a few seconds.   
  
A node ID can always inform us whether the device is in the network or not.

### Exclusion Information

Follow the same steps for inclusion to exclude the device from the network.

### General Usage Information



## Channels

The following table summarises the channels available for the MH5H-TA -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | thermostat_state | Temperature | Number | 
| Thermostat fan mode | thermostat_fanmode | thermostat_fanmode |  |  | 
| Thermostat fan state | thermostat_fanstate | thermostat_fanstate |  |  | 

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

### Thermostat fan mode
Channel type information on this channel is not found.

### Thermostat fan state
Channel type information on this channel is not found.



## Device Configuration

The following table provides a summary of the 19 configuration parameters available in the MH5H-TA.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Temperature Unit | Temperature Unit |
| 2 | Temp. Difference Reporting | Temperature variation to automatically report |
| 3 | Humidity Difference Reporting | Humidity variation to automatically report |
| 12 | Power Failure Memory | Power Failure Memory |
| 13 | Backlight Brightness | Backlight Brightness |
| 14 | Beep Set | Beep Set |
| 16 | Temp. Upper Limit | Temperature Upper Limit |
| 17 | Temp. Lower Limit | Temperature Lower Limit |
| 18 | Indoor Temp. Offset | Indoor Temperature Offset |
| 19 | Indoor Humidity Offset | Indoor Humidity Offset |
| 20 | External Temp. Sensor Offset | External Temperature Sensor Offset |
| 21 | Function Option For External Temp. | Function Option For External Temperature |
| 22 | Anti-Freeze Protection Function | Anti-Freeze Protection Function |
| 23 | Fan Mode Option When Idle | Fan Mode Option When Idle |
| 24 | Fan Working Mode | Fan Working Mode |
| 25 | Panel Lock | Panel Lock |
| 27 | Option For Interval Ventilation Feature | Option For Interval Ventilation Feature |
| 28 | Duration For Interval Ventilation | Duration For Interval Ventilation |
| 29 | Temperature Hysteresis | Temperature Hysteresis |

### Parameter 1: Temperature Unit

Temperature Unit
Temperature unit
The following option values may be configured, in addition to values in the range 0 to 0 -:

| Value  | Description |
|--------|-------------|
| 0 | Celsius |
| 1 | Fahrenheit |

The manufacturer defined default value is ```0``` (Celsius).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Temp. Difference Reporting

Temperature variation to automatically report
If set to 0, temperature report is disabled.  
If using Celsius, unit is 0.1ºC.  
If using Fahrenheit, unit is 0.1F.  
Values can go between 3 and 255.  
In Celsius, default is 3, this means 0.3ºC temperature difference will report.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Humidity Difference Reporting

Humidity variation to automatically report
0: Disabled.  
1-99: Automatically report the humidity to the gateway when humidity variation is greater than this value.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 12: Power Failure Memory

Power Failure Memory
Secret menu No. E02  
When power on again:  
1: Device will be in shutdown state ("OFF").  
2: Device will be in the last interface.  
3: Device will stay the last status before power failure.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Backlight Brightness

Backlight Brightness
Secret menu No. E03  
1: Dim, when in standby mode, the brightness will be off  
2: Low brightness  
3: Medium brightness  
4: High brightness  
5: Always on
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Beep Set

Beep Set
Secret menu No. E04  
1: OFF  
2: Low beep  
3: Medium beep  
4: High beep  
5: Standard beep
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 16: Temp. Upper Limit

Temperature Upper Limit
Secret menu No. E06: Temperature upper limit value  
Default 37 (Celsius)  
Default 98 (Fahrenheit)
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```37```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Temp. Lower Limit

Temperature Lower Limit
Secret menu No. E07: Temperature lower limit value  
Default 5 (Celsius)  
Default 41 (Fahrenheit)
Values in the range 0 to 98 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Indoor Temp. Offset

Indoor Temperature Offset
Secret menu No. E08  
Temperature offset value (°C or °F), accuracy 0.1  
Value is equal to (n*0.1)  
Same range for either units.
Values in the range -99 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Indoor Humidity Offset

Indoor Humidity Offset
Secret menu No. E09: Humidity offset value
Values in the range -20 to 20 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_19_0``` and is of type ```INTEGER```.


### Parameter 20: External Temp. Sensor Offset

External Temperature Sensor Offset
Secret menu No. E10  
Temperature offset value (°C or °F), accuracy 0.1  
Value equal to (n*0.1)  
Same range for either unit
Values in the range -99 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Function Option For External Temp.

Function Option For External Temperature
Secret menu No. E11  
External temperature sensor work as:  
0: OFF  
1: External temperature sensor work as main control temperature
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Anti-Freeze Protection Function

Anti-Freeze Protection Function
Secret menu No. E12  
0: Function is OFF  
1: Function is ON  
Temperature range: (5.0°C - 8.0°C).  
Anti-freeze feature is only valid in heating mode, when temperature drops to 5.0°C, anti-freeze feature is enabled and start heating, when temperature rise to 8.0°C, anti-freeze feature is disabled and stop heating.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 23: Fan Mode Option When Idle

Fan Mode Option When Idle
Secret menu No. E13  
1: Fan speed remain  
0: Fan off
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: Fan Working Mode

Fan Working Mode
Secret menu No. E14  
0: Fan works in both cooling and heating mode  
1: Fan works only in cooling mode  
2: Fan works only in heating mode  
3: Fan does not work neither in cooling nor heating mode
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Panel Lock

Panel Lock
Secret menu No. E15  
1: Off  
2: On
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 27: Option For Interval Ventilation Feature

Option For Interval Ventilation Feature
Secret menu No. E17  
1: On  
2: Off
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_27_1``` and is of type ```INTEGER```.


### Parameter 28: Duration For Interval Ventilation

Duration For Interval Ventilation
Secret menu No. E18  
Duration for interval ventilation within 1 hour (minute)
Values in the range 1 to 30 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_28_1``` and is of type ```INTEGER```.


### Parameter 29: Temperature Hysteresis

Temperature Hysteresis
 Secret menu No. E19  
Temperature hysteresis (°C or °F), accuracy 0.1  
Default value is:  
-10 (Celsius)  
-20 (Fahrenheit)
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_29_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MH5H-TA supports 1 association group.

### Group 1: Group 1

Reports all changes to the nodes in the group
Changes of temperature, mode, status, set point, fan mode, fan status 

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_STATE_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [MH5 Series Brochure](https://opensmarthouse.org/zwavedatabase/1616/reference/Thermostat_MH5Mcohome.pdf)
* [MH5 Manual](https://opensmarthouse.org/zwavedatabase/1616/reference/MH5H_TA.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1616).
