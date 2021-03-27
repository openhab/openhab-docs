---
layout: documentation
title: ZME_TIO_3S - ZWave
---

{% include base.html %}

# ZME\_TIO\_3S TION 3S Ventilator
This describes the Z-Wave device *ZME_TIO_3S*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_zmetio3s_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![ZME_TIO_3S product image](https://opensmarthouse.org/zwavedatabase/1312/image/)


The ZME_TIO_3S supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Compact ventilation system, developed by tion.ru

### Inclusion Information

Press the power button  5 sec until it blinks blue 

### Exclusion Information

Press the power button 5 sec until it blinks blue 

### General Usage Information

Ventilation system 

https://rus.z-wave.me/shop/termostats/provetrivatel-tion-3s-z-wave/#item-tabs

## Channels

The following table summarises the channels available for the ZME_TIO_3S -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Power switch | switch_binary | switch_binary | Switch | Switch | 
| Sensor (air temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Power switch 2 | switch_binary1 | switch_binary | Switch | Switch | 
| AirType | switch_binary2 | switch_binary | Switch | Switch | 
| FanSpeed | switch_dimmer3 | switch_dimmer | DimmableLight | Dimmer | 

### Power switch
on/off device switch

Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (air temperature)
Room temperature 

Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Thermostat mode
Heater mode of external air

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

### Setpoint (heating)
Heating temperature 

Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Power switch 2
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### AirType
OFF - internal air

ON - external air

Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### FanSpeed
6 levels of speed:

16 - 1st level 

32 - 2nd level

48 - 3rd level

64 - 4th level

80 - 5th level

96 - 6th level

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer3``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZME_TIO_3S supports 1 association group.

### Group 1: general

main group
main group up to 8 nodes

Association group 1 supports 8 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |

### Documentation Links

* [user guide (Russian only)](https://opensmarthouse.org/zwavedatabase/1312/reference/ZMR_TION_3S.pdf)
* [Instruction (English)](https://opensmarthouse.org/zwavedatabase/1312/reference/sr-zv9001k4-rgbw-instruction-v1_1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1312).
