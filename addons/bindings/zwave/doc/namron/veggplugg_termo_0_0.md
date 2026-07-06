---
layout: documentation
title: 4512725 - ZWave
---

{% include base.html %}

# 4512725 Smart plug with thermostat
This describes the Z-Wave device *4512725*, manufactured by *Namron* with the thing type UID of ```namron_veggplugg_termo_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![4512725 product image](https://opensmarthouse.org/zwavedatabase/1439/image/)


The 4512725 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Z-Wave Smart Plug

### Inclusion Information

Press action button three times.

### Exclusion Information

Press action button three times. Pressing the action button for 10 seconds will do a factory reset, which will reset any Z-Wave inclusions.

### General Usage Information



## Channels

The following table summarises the channels available for the 4512725 -:

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
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 
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

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 14 configuration parameters available in the 4512725.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 7 | Device Operating Mode | Device operating mode, switch or thermostat. Note that this entirely changes the operation of the unit. |
| 8 | Thermostat Mode Reporting | Actively report when setpoint or mode changes, in thermostat mode |
| 9 | Temperature Compensation | Temperature compensation value; in 1/10 °C |
| 10 | Over Temperature Protection | Over temperature protection; in °C, 0 to disable |
| 11 | Temperature Change Report Threshold | Temperature change report threshold. 0: disable report - 2-50 set a threshold |
| 12 | Temperature Report Interval | Time interval for periodical temperature report; in seconds, 0 to disable |
| 13 | Power Change Threshold | Power change absolute threshold; in Watt, 0 to disable |
| 14 | Voltage Change Threshold | Voltage change absolute threshold; in Volt, 0 to disable |
| 15 | Current Change Threshold | Current change absolute threshold; in 1/10 Amperes, 0 to disable |
| 16 | Not Used | Not used |
| 17 | Time Interval Report Power | Time interval for reporting power, voltage and current; in seconds |
| 18 | Power Reset State | Device state after power reset |
| 19 | Switch Binary Report | Enable SWITCH\_BINARY\_REPORT when status changes in switch mode |
| 20 | Overcurrent Protection | Current protection threshold; 10..16 Amperes, 0 to disable |

### Parameter 7: Device Operating Mode

Device operating mode, switch or thermostat. Note that this entirely changes the operation of the unit.

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Switch mode |
| 1 | Thermostat mode |

The manufacturer defined default value is ```0``` (Switch mode).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Thermostat Mode Reporting

Actively report when setpoint or mode changes, in thermostat mode

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | On |

The manufacturer defined default value is ```1``` (On).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Temperature Compensation

Temperature compensation value; in 1/10 °C

Values in the range -50 to 50 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: Over Temperature Protection

Over temperature protection; in °C, 0 to disable

Values in the range 30 to 60 may be set.

The manufacturer defined default value is ```36```.

This parameter has the configuration ID ```config_10_2``` and is of type ```INTEGER```.


### Parameter 11: Temperature Change Report Threshold

Temperature change report threshold. 0: disable report - 2-50 set a threshold

Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Temperature Report Interval

Time interval for periodical temperature report; in seconds, 0 to disable

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Power Change Threshold

Power change absolute threshold; in Watt, 0 to disable

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Voltage Change Threshold

Voltage change absolute threshold; in Volt, 0 to disable

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Current Change Threshold

Current change absolute threshold; in 1/10 Amperes, 0 to disable

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: Not Used

Not used

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_4``` and is of type ```INTEGER```.


### Parameter 17: Time Interval Report Power

Time interval for reporting power, voltage and current; in seconds

Values in the range 0 to 2678400 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_17_4``` and is of type ```INTEGER```.


### Parameter 18: Power Reset State

Device state after power reset

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | OFF switch or heating |
| 1 | ON switch or heating |
| 2 | Set to previous state |

The manufacturer defined default value is ```2``` (Set to previous state).

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Switch Binary Report

Enable SWITCH\_BINARY\_REPORT when status changes in switch mode

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```1``` (Enable).

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Overcurrent Protection

Current protection threshold; 10..16 Amperes, 0 to disable

Values in the range 0 to 16 may be set.

The manufacturer defined default value is ```16```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The 4512725 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
1. Smart plug Factory Reset, send Command Class **Device Reset Locally Notification** to associated devices of this group to report factory reset information when factory reset the smart plug.

2. Smart plug over current, over temperature, send Command Class **NOTIFICATION_REPORT** to associated devices of this group to report overload information.

3. When smart plug state changes, send Command Class **SWITCH\_BINARY\_REPORT** to associated devices of this group to report state information.

4. **METER_REPORT.**

5. Send **SENSOR\_MULTILEVEL\_REPORT** to report temperature.

6. Report when thermostat setpoint or mode changes.

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
