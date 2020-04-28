---
layout: documentation
title: MH6-HP - ZWave
---

{% include base.html %}

# MH6-HP Programmable Thermostat
This describes the Z-Wave device *MH6-HP*, manufactured by *[McoHome Technology Co., Ltd](http://www.mcohome.com/)* with the thing type UID of ```mcohome_mh6hp_02_000```.
This version of the device is limited to firmware versions above 2.0

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![MH6-HP product image](https://www.cd-jackson.com/zwave_device_uploads/1235/1235_default.jpg)


The MH6-HP supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

MH6-HP programmable thermostat is a Z-Wave Plus enabled device for indoor temperature control. It is mainly applied to heat pump system for heating/cooling, with 3 modes easily switchable: Schedule, Hold and Holiday. The device is of high reliability and practicability, and it can support up to 3H/2C system. This product can be included and operated in any Z-Wave network with other Z-Wave certified devices from any other manufacturers.

### Inclusion Information

In normal display, press and hold ^ button to enter interface for adding Z-Wave network. Before device added into network, “\- - -” will display on the screen. Then press ^ once, device will enter learning mode to get a node ID. If adding is successful, a Node ID will display on the screen in a few seconds.

### Exclusion Information

In normal display, press and hold ^ button to enter interface for removing of Z-Wave network. A Node ID will display on the screen. Then press ^ button once, “\- - -” will display on the screen to show removal was successful.

## Channels

The following table summarises the channels available for the MH6-HP -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | thermostat_state | Temperature | Number | 
| Setpoint (cooling) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Thermostat fan mode | thermostat_fanmode | thermostat_fanmode |  |  | 
| Thermostat fan state | thermostat_fanstate | thermostat_fanstate |  |  | 
| Clock Time Offset | time_offset | time_offset | Time | Number | 

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

### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Time``` category.



## Device Configuration

The following table provides a summary of the 6 configuration parameters available in the MH6-HP.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Upload temperature format automatically | Upload temperature format automatically |
| 2 | Upload temperature and humidity automatically | Upload temperature and humidity automatically |
| 3 | Upload temperature difference | Upload temperature difference |
| 4 | Upload time interval regularly | Upload time interval regularly |
| 5 | Upload humidity difference | Upload humidity difference |
| 255 | Factory reset | Factory reset |

### Parameter 1: Upload temperature format automatically

Upload temperature format automatically

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Upload temperature and humidity automatically

Upload temperature and humidity automatically

Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Upload temperature difference

Upload temperature difference
Base on 0.1℃unit, 0x0005 by default, 5*0.1℃=0.5℃, 0x0003~0x03E8 (3-1000)
Values in the range 3 to 1000 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: Upload time interval regularly

Upload time interval regularly

Values in the range 10 to 65535 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


### Parameter 5: Upload humidity difference

Upload humidity difference

Values in the range 2 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 255: Factory reset

Factory reset
0x55 (85) Restore the factory setting(write only)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 85 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_255_1_wo``` and is of type ```INTEGER```.
This is a write only parameter.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MH6-HP supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

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
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_TIME_V1| |
| COMMAND_CLASS_TIME_PARAMETERS_V1| |

### Documentation Links

* [MH6-HP](https://www.cd-jackson.com/zwave_device_uploads/1235/User-manual-3830222.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1235).
