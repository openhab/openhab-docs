---
layout: documentation
title: RE.GUARD - ZWave
---

{% include base.html %}

# RE.GUARD Water leakage detector and meter
This describes the Z-Wave device *RE.GUARD*, manufactured by *REHAU AG + Co* with the thing type UID of ```rehau_reguard_00_000```.

The device is in the category of *Valve*, defining Valves used to control water or gas. e.g. a flow stop valve..

![RE.GUARD product image](https://opensmarthouse.org/zwavedatabase/1233/image/)


The RE.GUARD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Rehau RE.GUARD is a water manager which protects your home against water leakages and measures your consumption of water.

It has a highly sophisticated water meter and pressure meter built inside. Its algorithms are able to detect very small microleakages as well as larger leakages like e.g. pipe bursts. The sensibility can be adapted to your needs.  
Furthermore statistics of your water consumption can be created to help you save water.

This product is available at your professional plumber.

### Inclusion Information

Press Z-wave button for 3 seconds 

### Exclusion Information

Press Z-wave button 3 times in 3 seconds

### General Usage Information



## Channels

The following table summarises the channels available for the RE.GUARD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Open/Close | switch_binary | switch_binary | Switch | Switch | 
| Sensor (water_flow) | sensor_waterflow | sensor_waterflow |  | Number | 
| Sensor (water_temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (water_pressure) | sensor_waterpressure | sensor_waterpressure |  | Number | 
| water meter (m³) | meter_water_cubic_meters | meter_water_cubic_meters | Water | Number | 
| Alarm (flood) | alarm_flood | alarm_flood | Water | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Alarm (water_valve) | alarm_system | alarm_system |  | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Clock Time Offset | time_offset | time_offset | Time | Number | 

### Open/Close
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (water_flow)


The ```sensor_waterflow``` channel is of type ```sensor_waterflow``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (water_temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (water_pressure)


The ```sensor_waterpressure``` channel is of type ```sensor_waterpressure``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### water meter (m³)
Indicates the instantaneous water consumption.

The ```meter_water_cubic_meters``` channel is of type ```meter_water_cubic_meters``` and supports the ```Number``` item and is in the ```Water``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (flood)
Indicates if the flood alarm is triggered.

The ```alarm_flood``` channel is of type ```alarm_flood``` and supports the ```Switch``` item and is in the ```Water``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (water_valve)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Time``` category.



## Device Configuration

The following table provides a summary of the 40 configuration parameters available in the RE.GUARD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | operation mode | 0 valve always off; 1 user absent/holiday; 2 user present; 3 valve always on |
| 4 | fixed schedule time - hours | fixed schedule time hour for microleakage test |
| 5 | fixed schedule time - minutes | fixed schedule time minute for microleakage test |
| 6 | fixed schedule day | fixed day in bin 1111111, Su=1, Sa=2, Fr=4, Th=8, We=16, Tu=32, Mo=64, 0= auto |
| 7 | automatic schedule time interval | automatic schedule time interval between microlekage tests, if not fixed |
| 8 | micro leakage mesuring time | micro leakage mesuring time, time of closed valve |
| 9 | micro leakage pressure drop | pressure drop for microleakage detection recognition |
| 10 | micro leakage pressure drop abort | pressure drop in kPa |
| 11 | number of measurements | how many in one time period |
| 12 | wait time until next measurement | waiting time in minutes between two meassurements |
| 13 | reaction to micro leakage | 0=disable detection, 1=blink LED, 2= blink LED andshut off valve |
| 14 | macro leakage detected | 0 = no leackage 1 = leakage |
| 15 | max flow rate if operation mode is 2 | max flow rate if operation mode is 2 |
| 16 | max pressure drop if operation mode is 2 | max pressure drop if operation mode is 2 |
| 17 | max liters if operation mode is 2 | max liters single water abstraction if operation mode is 2 |
| 18 | max continuous liter if operation mode is 2 | max liter continuous water abstraction if operation mode is 2 |
| 19 | max time if operation mode is 2 | max time of single water abstraction if operation mode is 2 |
| 20 | max continious time if operation mode is 2 | max time of continous water abstraction if operation mode is 2 |
| 21 | max flow rate if operation mode is 1 | max flow rate if operation mode is 1 |
| 22 | max pressure drop if operation mode is 1 | max pressure drop if operation mode is 1 |
| 23 | max liters if operation mode is 1 | max liters non continous water abstraction if operation mode is 1 |
| 24 | max continuous liter if operation mode is 1 | max liters continuous water abstraction if operation mode is 2 |
| 25 | max time if operation mode is 1 | max time of single water abstraction if operation mode is 1 |
| 26 | max continuous time if operation mode is 1 | max time of continous water abstraction if operation mode is 1 |
| 27 | macro leakage deactivation time | temporary macro leakage deactivation (e.g. filling pool) |
| 28 | reaction to macro leakage | 0=disable detection, 1=blink LED, 2= blink LED and shut off valve |
| 29 | flooding sensor detected a leak | 0-no leakage, 1- flooding sensor detected leakage |
| 30 | reaction to flooding sensor | 0=disable detection, 1=blink LED, 2= blink LED and shut off valve |
| 31 | backup battery nominal voltage | Nominal voltage of backup battery |
| 32 | backup battery nominal capacity | Nominal capacity of backup battery |
| 37 | time set correctly | 1 = time is set correctly, 0 = time is not set correctly |
| 38 | total operating time | Counting total operation time internally |
| 39 | operating time since last power on | operating time since last power on |
| 49 | auto absent | 0 = disable, 1-168h time after no use, operation mode is changed to 1 (absent) |
| 50 | water temperature high threshold | water temperature high threshold for warning of sanitary problems |
| 51 | water temperature low threshold | water temperature low threshold for warning of risk of frost |
| 52 | water pressure high threshold | water pressure high threshold for warning of values above valid operating cond. |
| 53 | water pressure low threshold | water pressure high threshold for warning of values below valid operating cond. |
| 54 | error code | error code to identify the reason of a warning or fault |
| 56 | autolearning | automatic adaption of limits, set ids 15-26 to learned values |

### Parameter 1: operation mode

0 valve always off; 1 user absent/holiday; 2 user present; 3 valve always on

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | valve always off |
| 1 | user absent/holiday |
| 2 | user present |

The manufacturer defined default value is ```2``` (user present).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 4: fixed schedule time - hours

fixed schedule time hour for microleakage test

Values in the range 0 to 23 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: fixed schedule time - minutes

fixed schedule time minute for microleakage test

Values in the range 0 to 59 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: fixed schedule day

fixed day in bin 1111111, Su=1, Sa=2, Fr=4, Th=8, We=16, Tu=32, Mo=64, 0= auto

Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```127```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: automatic schedule time interval

automatic schedule time interval between microlekage tests, if not fixed

Values in the range 0 to 168 may be set.

The manufacturer defined default value is ```24```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: micro leakage mesuring time

micro leakage mesuring time, time of closed valve

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: micro leakage pressure drop

pressure drop for microleakage detection recognition

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: micro leakage pressure drop abort

pressure drop in kPa

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: number of measurements

how many in one time period

Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: wait time until next measurement

waiting time in minutes between two meassurements

Values in the range 0 to 60 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: reaction to micro leakage

0=disable detection, 1=blink LED, 2= blink LED andshut off valve

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: macro leakage detected

0 = no leackage 1 = leakage

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 15: max flow rate if operation mode is 2

max flow rate if operation mode is 2

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_15_2``` and is of type ```INTEGER```.


### Parameter 16: max pressure drop if operation mode is 2

max pressure drop if operation mode is 2

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```1000```.

This parameter has the configuration ID ```config_16_2``` and is of type ```INTEGER```.


### Parameter 17: max liters if operation mode is 2

max liters single water abstraction if operation mode is 2

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```400```.

This parameter has the configuration ID ```config_17_2``` and is of type ```INTEGER```.


### Parameter 18: max continuous liter if operation mode is 2

max liter continuous water abstraction if operation mode is 2

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```400```.

This parameter has the configuration ID ```config_18_2``` and is of type ```INTEGER```.


### Parameter 19: max time if operation mode is 2

max time of single water abstraction if operation mode is 2

Values in the range 0 to 1440 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: max continious time if operation mode is 2

max time of continous water abstraction if operation mode is 2

Values in the range 0 to 1440 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 21: max flow rate if operation mode is 1

max flow rate if operation mode is 1

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```3680```.

This parameter has the configuration ID ```config_21_2``` and is of type ```INTEGER```.


### Parameter 22: max pressure drop if operation mode is 1

max pressure drop if operation mode is 1

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```1000```.

This parameter has the configuration ID ```config_22_2``` and is of type ```INTEGER```.


### Parameter 23: max liters if operation mode is 1

max liters non continous water abstraction if operation mode is 1

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_23_2``` and is of type ```INTEGER```.


### Parameter 24: max continuous liter if operation mode is 1

max liters continuous water abstraction if operation mode is 2

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_24_2``` and is of type ```INTEGER```.


### Parameter 25: max time if operation mode is 1

max time of single water abstraction if operation mode is 1

Values in the range 0 to 1440 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_25_2``` and is of type ```INTEGER```.


### Parameter 26: max continuous time if operation mode is 1

max time of continous water abstraction if operation mode is 1

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_26_2``` and is of type ```INTEGER```.


### Parameter 27: macro leakage deactivation time

temporary macro leakage deactivation (e.g. filling pool)

Values in the range 1 to 168 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_27_2``` and is of type ```INTEGER```.


### Parameter 28: reaction to macro leakage

0=disable detection, 1=blink LED, 2= blink LED and shut off valve

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_28_1``` and is of type ```INTEGER```.


### Parameter 29: flooding sensor detected a leak

0-no leakage, 1- flooding sensor detected leakage

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_29_1_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 30: reaction to flooding sensor

0=disable detection, 1=blink LED, 2= blink LED and shut off valve

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 31: backup battery nominal voltage

Nominal voltage of backup battery

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```6000```.

This parameter has the configuration ID ```config_31_2``` and is of type ```INTEGER```.


### Parameter 32: backup battery nominal capacity

Nominal capacity of backup battery

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```3000```.

This parameter has the configuration ID ```config_32_2``` and is of type ```INTEGER```.


### Parameter 37: time set correctly

1 = time is set correctly, 0 = time is not set correctly

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_37_1``` and is of type ```INTEGER```.


### Parameter 38: total operating time

Counting total operation time internally

Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_38_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 39: operating time since last power on

operating time since last power on

Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_39_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 49: auto absent

0 = disable, 1-168h time after no use, operation mode is changed to 1 (absent)

Values in the range 0 to 168 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_49_2``` and is of type ```INTEGER```.


### Parameter 50: water temperature high threshold

water temperature high threshold for warning of sanitary problems

Values in the range -1000 to 1000 may be set.

The manufacturer defined default value is ```250```.

This parameter has the configuration ID ```config_50_2``` and is of type ```INTEGER```.


### Parameter 51: water temperature low threshold

water temperature low threshold for warning of risk of frost

Values in the range -1000 to 1000 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_51_2``` and is of type ```INTEGER```.


### Parameter 52: water pressure high threshold

water pressure high threshold for warning of values above valid operating cond.

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```1000```.

This parameter has the configuration ID ```config_52_2``` and is of type ```INTEGER```.


### Parameter 53: water pressure low threshold

water pressure high threshold for warning of values below valid operating cond.

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_53_2``` and is of type ```INTEGER```.


### Parameter 54: error code

error code to identify the reason of a warning or fault

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_54_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 56: autolearning

automatic adaption of limits, set ids 15-26 to learned values
automatic adaption of limits set ids 15-26 to learned values (only if the last 40 days are ok - no leakage) 
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_56_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The RE.GUARD supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Connection to Gateway


Association group 1 supports 1 node.

### Group 2: Valve Status

Sends status of valve


Association group 2 supports 5 nodes.

### Group 3: Leakage alarm

Sends notification in case of leackage


Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V9| |
| COMMAND_CLASS_METER_V4| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V2| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V4| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_CLOCK_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [User Guide](https://opensmarthouse.org/zwavedatabase/1233/reference/multi-language-small.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1233).
