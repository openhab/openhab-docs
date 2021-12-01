---
layout: documentation
title: Z-Wave plugg med termostat - ZWave
---

{% include base.html %}

# Z-Wave plugg med termostat Smart plug with thermostat
This describes the Z-Wave device *Z-Wave plugg med termostat*, manufactured by *Namron* with the thing type UID of ```namron_veggplugg_termo_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![Z-Wave plugg med termostat product image](https://opensmarthouse.org/zwavedatabase/1439/image/)


The Z-Wave plugg med termostat supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

  


Zwave Smart Plug

### Inclusion Information

  


Press action button three times

### Exclusion Information

  


Press action button three times

### General Usage Information



## Channels

The following table summarises the channels available for the Z-Wave plugg med termostat -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (amps) | meter_current | meter_current | Energy | Number | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Alarm (heat) | alarm_heat | alarm_heat | Fire | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Electric meter (volts)
Indicates the instantaneous voltage.

The ```meter_voltage``` channel is of type ```meter_voltage``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (amps)
Indicates the instantaneous current consumption.

The ```meter_current``` channel is of type ```meter_current``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```Fire``` category. This is a read only channel so will only be updated following state changes from the device.

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



## Device Configuration

The following table provides a summary of the 14 configuration parameters available in the Z-Wave plugg med termostat.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 7 | Device operating mode | Device operating mode - 0 switch mode - 1 Thermostat mode |
| 8 | Actively report when in thermostat mode | Actively report when in thermostat mode - 0 no report - 1 report |
| 9 | Temperature compensation value | Temperature compensation value |
| 10 | Enable over temperature protection | Enable over temperature protection |
| 11 | Temperature change report threshold | Temperature change report threshold. 0: disable report - 2-50 set a threshold |
| 12 | Time interval for periodical temperature report | Time interval for periodical temperature report |
| 13 | Power change absolute threshold | Power change absolute threshold |
| 14 | Voltage change absolute threshold | Voltage change absolute threshold |
| 15 | Current change absolute threshold | Current change absolute threshold |
| 16 | Time Interval Report Power | Time Interval Report Power |
| 17 | Time interval for report of voltage | Time interval for report of voltage |
| 18 | Device state after power reset | Device state after power reset. Switch: 00-turn off relay 01:turn on relay Thermostat mode: 00:HVAC OFF 01:HVAC ON 02:save HVAC state before power reset |
| 19 | Enable/Disable Switch Binary Report | Enable/Disable Switch Binary Report |
| 20 | Enable/Disable Current Protection Function | Enable/Disable Current Protection Function |

### Parameter 7: Device operating mode

Device operating mode - 0 switch mode - 1 Thermostat mode

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Actively report when in thermostat mode

Actively report when in thermostat mode - 0 no report - 1 report

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Temperature compensation value

Temperature compensation value

Values in the range -50 to 50 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: Enable over temperature protection

Enable over temperature protection

Values in the range 30 to 60 may be set.

The manufacturer defined default value is ```36```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Temperature change report threshold

Temperature change report threshold. 0: disable report - 2-50 set a threshold

Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Time interval for periodical temperature report

Time interval for periodical temperature report

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Power change absolute threshold

Power change absolute threshold

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Voltage change absolute threshold

Voltage change absolute threshold

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Current change absolute threshold

Current change absolute threshold

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Time Interval Report Power

Time Interval Report Power

Values in the range 0 to 2678400 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_4``` and is of type ```INTEGER```.


### Parameter 17: Time interval for report of voltage

Time interval for report of voltage

Values in the range 0 to 2678400 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_17_4``` and is of type ```INTEGER```.


### Parameter 18: Device state after power reset

Device state after power reset. Switch: 00-turn off relay 01:turn on relay Thermostat mode: 00:HVAC OFF 01:HVAC ON 02:save HVAC state before power reset

Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Enable/Disable Switch Binary Report

Enable/Disable Switch Binary Report

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Enable/Disable Current Protection Function

Enable/Disable Current Protection Function

Values in the range 0 to 16 may be set.

The manufacturer defined default value is ```16```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Z-Wave plugg med termostat supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [User manual](https://opensmarthouse.org/zwavedatabase/1439/reference/4512725-Brukerveiledning-5.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1439).
