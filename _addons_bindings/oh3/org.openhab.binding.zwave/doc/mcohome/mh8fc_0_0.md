---
layout: documentation
title: MH8-FC - ZWave
---

{% include base.html %}

# MH8-FC Fan Coil Thermostat
This describes the Z-Wave device *MH8-FC*, manufactured by *[McoHome Technology Co., Ltd](http://www.mcohome.com/)* with the thing type UID of ```mcohome_mh8fc_00_000```.
This version of the device is limited to firmware versions below 2.9

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![MH8-FC product image](https://opensmarthouse.org/zwavedatabase/336/image/)


The MH8-FC supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

MCOHome Fan Coil Thermostat is a Z-Wave enabled device for indoor temperature control. It is mainly applied to a 4-pipe Fan coil system. It can read room temperature and local time, and automatically control fan speed based on the temperature difference. The device is of high reliability and practicability. This product can be included and operated in any Z-Wave network with other Z-Wave certified devices from any other manufacturers.

**Features：**

  * Capacitive touch buttons
  * Tempered glass panel, PC alloy enclosure
  * Precise temperature calibration function
  * Non-volatile Memory, working state saved even power failure
  * Intelligent on/off control of 3-speed fan, electric (ball) valve or air-valve
  * Easily steel frame back plate installatio

**Specification**

  * Power Supply：AC85V~260V, 50/60HZ
  * Resistive Load: ≤3A
  * Self Consumption：< 1W
  * Temperature Sensor: NTC 15K
  * Display Accuracy: 0.1 ℃
  * Working Environment：0～55℃; <95% RH（Non-condensation)
  * Temperature Setting：5～35 ℃（Adjustable）
  * Dimension：86\* 86\*42mm
  * Hole Pitch：60-65mm（86 Standard junction box）
  * Z-Wave Frequency: 868.42MHz (EU)

**Safety Information**

To protect yourself and others from danger and to protect the device from damage, please read the safety information before using it.

### Inclusion Information

**Including of Z-Wave network**

Under the shutdown state, press & hold "Down Arrow" to enter interface for inclusion or exclusion of Z-Wave network.

Before device included into network, “\- - -” will display on the screen. Then press once "Down Arrow", device will enter learning mode to get a node ID. If inclusion is success, a node ID will display on the screen in a few seconds.  
A node ID can always inform us whether the device is in the network or not.

### Exclusion Information

**Excluding of Z-Wave network**

Under the shutdown state, press & hold "Down Arrow" to enter interface for inclusion or exclusion of Z-Wave network.

Before device included into network, “\- - -” will display on the screen. Then press once "Down Arrow", device will enter learning mode to get a node ID. If inclusion is success, a node ID will display on the screen in a few seconds.  
A node ID can always inform us whether the device is in the network or not.

## Channels

The following table summarises the channels available for the MH8-FC -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | thermostat_state | Temperature | Number | 
| Setpoint (cooling) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Thermostat fan mode | thermostat_fanmode | thermostat_fanmode |  |  | 
| Thermostat fan state | thermostat_fanstate | thermostat_fanstate |  |  | 

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



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MH8-FC supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
For sending temperature, working mode, etc. notifications

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_OPERATING_STATE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_FAN_STATE_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://opensmarthouse.org/zwavedatabase/336/MH8-FC-EU-User-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/336).
