---
layout: documentation
title: MYOT2 - ZWave
---

{% include base.html %}

# MYOT2 OpenTherm Interfaces for boiler
This describes the Z-Wave device *MYOT2*, manufactured by *SmartDHOME* with the thing type UID of ```smartdhome_myot2_00_000```.

The device is in the category of *Controller*, defining Central control interface.

![MYOT2 product image](https://opensmarthouse.org/zwavedatabase/1613/image/)


The MYOT2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Interface/actuator for OpenTherm boilers that allows you to monitor the performance of the OpenTherm boilers on which it is installed.

### Inclusion Information

Include the MyOT device by pressing the function button for 8 seconds.

### Exclusion Information

Include the MyOT device by pressing the function button for 8 seconds.

### General Usage Information

Control the boiler using the OpenTherm protocol

## Channels

The following table summarises the channels available for the MYOT2 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Boiler On/Off | switch_binary | switch_binary | Switch | Switch | 
| Heating circuit pressure | sensor_barpressure | sensor_barpressure | Pressure | Number | 
| Return water temperature | water_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Boiler heating modulation | sensor_heatingmodulation | sensor_heatingmodulation |  | Number | 
| DHW Flow | sensor_waterflow | sensor_waterflow |  | Number | 
| Boiler water temperature | boiler_watertemp | sensor_temperature | Temperature | Number:Temperature | 
| DHW water temperature | dhw_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Exhaust fumes temperature | exhaust_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint DHW | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 

### Boiler On/Off
Switch the boiler on/off

Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Heating circuit pressure
Water pressure of the boiler

Indicates the barometric pressure.

The ```sensor_barpressure``` channel is of type ```sensor_barpressure``` and supports the ```Number``` item and is in the ```Pressure``` category. This is a read only channel so will only be updated following state changes from the device.

### Return water temperature
Return water temperature

Indicates the current temperature.

The ```water_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Boiler heating modulation
Boiler heating modulation in percent

Boiler heating modulation in percent.

The ```sensor_heatingmodulation``` channel is of type ```sensor_heatingmodulation``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### DHW Flow
DHW (Heating water) flow



The ```sensor_waterflow``` channel is of type ```sensor_waterflow``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Boiler water temperature
Boiler (heating) water temperature

Indicates the current temperature.

The ```boiler_watertemp``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### DHW water temperature
DHW (hot) water temperature

Indicates the current temperature.

The ```dhw_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Exhaust fumes temperature
Indicates the current temperature.

The ```exhaust_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Setpoint DHW
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the MYOT2.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Max setpoint of the boiler | Max setpoint of the boiler |
| 2 | Min setpoint of the boiler | Min setpoint of the boiler |
| 3 | Setpoint max DHW | Setpoint max DHW (hot water) |
| 4 | Setpoint min DHW | Setpoint min DHW |
| 10 | Error Flag | Error number of the boiler if any, default 0 |
| 11 | Error code | Error code, if error occurs |
| 30 | Summer mode | Summer mode (0: no 1: yes) |
| 31 | Enabling DHW | Enabling DHW (hot water, 0: no 1: yes) |
| 95 | Report rate | Report rate (in min) |

### Parameter 1: Max setpoint of the boiler

Max setpoint of the boiler

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_0``` and is of type ```INTEGER```.


### Parameter 2: Min setpoint of the boiler

Min setpoint of the boiler

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_0``` and is of type ```INTEGER```.


### Parameter 3: Setpoint max DHW

Setpoint max DHW (hot water)

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_0``` and is of type ```INTEGER```.


### Parameter 4: Setpoint min DHW

Setpoint min DHW

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_0``` and is of type ```INTEGER```.


### Parameter 10: Error Flag

Error number of the boiler if any, default 0

Values in the range 0 to 999999999 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Error code

Error code, if error occurs

Values in the range 0 to 999999 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_5``` and is of type ```INTEGER```.


### Parameter 30: Summer mode

Summer mode (0: no 1: yes)

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.


### Parameter 31: Enabling DHW

Enabling DHW (hot water, 0: no 1: yes)

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_31_1``` and is of type ```INTEGER```.


### Parameter 95: Report rate

Report rate (in min)

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_95_0``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MYOT2 supports 1 association group.

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
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1613/reference/opentherm2zwave_manual_en_01335-2080-00_2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1613).
