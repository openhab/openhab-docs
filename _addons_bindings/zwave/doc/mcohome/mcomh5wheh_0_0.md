---
layout: documentation
title: MCO MH5-WH or MH5-EH - ZWave
---

{% include base.html %}

# MCO MH5-WH or MH5-EH MCO MH5-WH or MH5-EH
This describes the Z-Wave device *MCO MH5-WH or MH5-EH*, manufactured by *[McoHome Technology Co., Ltd](http://www.mcohome.com/)* with the thing type UID of ```mcohome_mcomh5wheh_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![MCO MH5-WH or MH5-EH product image](https://opensmarthouse.org/zwavedatabase/1673/image/)


The MCO MH5-WH or MH5-EH supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The MCO MH5-WH thermostat is a Z-Wave Plus enabled device designed for indoor temperature control. MH5-WH is mainly applied to control water heating systems like wall mounted boiler, water heating valve, heating actuator etc, while MH5-EH is for electrical heating system. The device is of high reliability and practicability, which can be included and operated in any Z-Wave network with other Z-Wave certified devices from any other manufacturers

### Inclusion Information

In normal working interface, long press DOWN and UP arrows enter interface for inclusion or exclusion of Z-Wave network. Before the device included into network, "\---" will display on the screen. Then press UP arrow once, device will enter learning mode to get a node ID. If inclusion is success, a node ID will display on the screen in a few seconds. A node ID can always inform us whether the device is in the network or not.

### Exclusion Information

In normal working interface, long press DOWN and UP arrows enter interface for inclusion or exclusion of Z-Wave network. Before the device included into network, "\---" will display on the screen. Then press UP arrow once, device will enter learning mode to get a node ID. If inclusion is success, a node ID will display on the screen in a few seconds. A node ID can always inform us whether the device is in the network or not.

### General Usage Information



## Channels

The following table summarises the channels available for the MCO MH5-WH or MH5-EH -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Operating State | thermostat_state | thermostat_state | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
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

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Clock Time Offset
Provides the current time difference for the devices time.

The ```time_offset``` channel is of type ```time_offset``` and supports the ```Number``` item and is in the ```Time``` category.



## Device Configuration

The following table provides a summary of the 16 configuration parameters available in the MCO MH5-WH or MH5-EH.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Temperature Unit | Set temperature display unit |
| 2 | Temperature Difference Reporting | Temperature difference required to trigger a report in either Celsius or Fahrenheit |
| 3 | Humidity Difference Reporting | Humidity difference required to trigger a report |
| 10 | Power Failure Memory | Power Failure Memory |
| 11 | Schedule Function Selection | Enable or disable scheduling functionality |
| 12 | Backlight Setting | Control for the backlight |
| 13 | Panel Lock | Panel lock |
| 14 | Button Volume | Volume on button press |
| 18 | Controlled temperature | Select controlled temperature of Air or Floor |
| 19 | Room (air) temperature calibration | Room (air) temperature calibration |
| 20 | Floor temperature calibration | Floor temperature calibration |
| 21 | Hysteresis when controlling room temperature | Hysteresis when controlling room temperature |
| 22 | Hysteresis when controlling floor temperature | Hysteresis when controlling floor temperature |
| 23 | Hysteresis when controlling high temperature protection | Hysteresis when controlling high temperature protection |
| 24 | High temperature protection | High temperature protection |
| 255 | Factory Restore | Factory Restore |

### Parameter 1: Temperature Unit

Set temperature display unit
0: Celsius

1: Fahrenheit
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Celsius |

The manufacturer defined default value is ```0``` (Celsius).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Temperature Difference Reporting

Temperature difference required to trigger a report in either Celsius or Fahrenheit
Sets the minimum temperature variation, in 0.1 increments, that triggers an automatic report to the gateway.

Default value is 5ºC or 10ºF. 

0.3 is the minimum value possible.
Values in the range 3 to 255 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Humidity Difference Reporting

Humidity difference required to trigger a report
0: Disabled

1-99: Specifies the humidity variation percentage that will cause the device to send a report to the gateway.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 10: Power Failure Memory

Power Failure Memory
Secret Menu No. P7  
0: OFF  
1: Man  
2: Auto  
3: Restore the working mode before the power failure
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | Man |
| 2 | Auto |
| 3 | Restore the working mode before the power failure |

The manufacturer defined default value is ```3``` (Restore the working mode before the power failure).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Schedule Function Selection

Enable or disable scheduling functionality
0: Disabled  
1: Enabled
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Backlight Setting

Control for the backlight
Secret Menu No. P2  
0: close after no operate  
1: always on
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Close after no operate |
| 1 | Always on |

The manufacturer defined default value is ```0``` (Close after no operate).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Panel Lock

Panel lock
0: Off  
1: On
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |

The manufacturer defined default value is ```0``` (Off).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Button Volume

Volume on button press
Secret Menu No. P4  
0: Mute  
1: Beep
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Mute |

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_14_14``` and is of type ```INTEGER```.


### Parameter 18: Controlled temperature

Select controlled temperature of Air or Floor
Secret Menu No. P8  
0: Air  
1: Floor
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Air |

The manufacturer defined default value is ```0``` (Air).

This parameter has the configuration ID ```config_18_1``` and is of type ```INTEGER```.


### Parameter 19: Room (air) temperature calibration

Room (air) temperature calibration
Parameter menu No. P9:

unit (°C): n*0.1 °C, setting gap 0.5 °C

unit (°F): n*0.1 °F
Values in the range -95 to 95 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Floor temperature calibration

Floor temperature calibration
Parameter menu No. P10:

unit (°C): n*0.1 °C, setting gap 0.5 °C

unit (°F): n*0.1 °F
Values in the range -95 to 95 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Hysteresis when controlling room temperature

Hysteresis when controlling room temperature
Parameter menu No. P11:

unit (°F): n*0.1 °F, range 1-20

unit (°C): n*0.1 °C, setting gap 0.5 °C, range 5-100
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Hysteresis when controlling floor temperature

Hysteresis when controlling floor temperature
Parameter menu No. P12:

unit (°F): n*0.1 °F, range 1-20

unit (°C): n*0.1 °C, setting gap 0.5 °C, range 5-100
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 23: Hysteresis when controlling high temperature protection

Hysteresis when controlling high temperature protection
Parameter menu No. P13:

unit (°F): n*0.1 °F, range 5-100

unit (°C): n*0.1 °C, setting gap 0.5 °C, range 1-20
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: High temperature protection

High temperature protection
Parameter menu No. P14:

unit (°C): n*0.1 °C, setting gap 0.1 °C, range 445-950  
445: turn off high temperature protection  
  
unit (°F): n*1°F, range 112-203  
112: turn off high temperature protection
Values in the range 112 to 950 may be set.

The manufacturer defined default value is ```550```.

This parameter has the configuration ID ```config_24_2``` and is of type ```INTEGER```.


### Parameter 255: Factory Restore

Factory Restore

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Invalid |
| 1 | Restore factory setting |

The manufacturer defined default value is ```0``` (Invalid).

This parameter has the configuration ID ```config_255_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The MCO MH5-WH or MH5-EH supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline
Gateway controller association group

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
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_TIME_V1| |
| COMMAND_CLASS_TIME_PARAMETERS_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [MCO MH5-WH MH5-EH](https://opensmarthouse.org/zwavedatabase/1673/reference/MCO_MH5-WH_MH5-WH_user_manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1673).
