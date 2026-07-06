---
layout: documentation
title: ZME_TIO_4S - ZWave
---

{% include base.html %}

# ZME\_TIO\_4S TION 4S Ventilator
This describes the Z-Wave device *ZME_TIO_4S*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_zmetio4s_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![ZME_TIO_4S product image](https://opensmarthouse.org/zwavedatabase/1500/image/)


The ZME_TIO_4S supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Compact ventilation system, developed by tion.ru

### Inclusion Information

Turn off device until yellow light shows, press and keep power button until blue color starts blinking

### Exclusion Information

Turn off device until yellow light shows, press and keep power button until blue color starts blinking

### General Usage Information



## Channels

The following table summarises the channels available for the ZME_TIO_4S -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Power switch | switch_binary | switch_binary | Switch | Switch | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Thermostat mode 1 | thermostat_mode1 | thermostat_mode | Temperature | Number | 
| Setpoint (heating) 1 | thermostat_setpoint1 | thermostat_setpoint | Heating | Number:Temperature | 
| Power switch | switch_binary2 | switch_binary | Switch | Switch | 
| Air Type | switch_binary3 | switch_binary | Switch | Switch | 
| FanSpeed | switch_dimmer4 | switch_dimmer | DimmableLight | Dimmer | 
| sensor (InflowTemperature) | sensor_temperature5 | sensor_temperature | Temperature | Number:Temperature | 
| sensor (Outflow Temperature) | sensor_temperature6 | sensor_temperature | Temperature | Number:Temperature | 

### Power switch
on/off device switch

Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

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
Air heating temperature 

Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Thermostat mode 1
Sets the thermostat.

The ```thermostat_mode1``` channel is of type ```thermostat_mode``` and supports the ```Number``` item and is in the ```Temperature``` category.
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

### Setpoint (heating) 1
Sets the thermostat setpoint.

The ```thermostat_setpoint1``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Power switch
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Air Type
off - inflow

on - room

Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### FanSpeed
Fan speed, step 16 

1 - 16

2 - 32

3 - 48

4 - 64

5 - 80

6 - 96

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer4``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### sensor (InflowTemperature)
Indicates the current temperature.

The ```sensor_temperature5``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### sensor (Outflow Temperature)
Indicates the current temperature.

The ```sensor_temperature6``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the ZME_TIO_4S.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 20 | AllowsFirmwareUpdates | Firmware updates |
| 66 | Fibaro | Fibaro controller compatibility |

### Parameter 20: AllowsFirmwareUpdates

Firmware updates
Defines if firmware update allowed
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_20_4``` and is of type ```INTEGER```.


### Parameter 66: Fibaro

Fibaro controller compatibility

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | fibaro |
| 1 | non fibaro |

The manufacturer defined default value is ```1``` (non fibaro).

This parameter has the configuration ID ```config_66_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZME_TIO_4S supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline
Lifeline group

Association group 1 supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_V4| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V3| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
#### Endpoint 6

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |

### Documentation Links

* [user guide rus](https://opensmarthouse.org/zwavedatabase/1500/reference/ZME_TION_4s.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1500).
