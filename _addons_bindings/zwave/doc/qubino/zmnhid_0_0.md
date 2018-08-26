---
layout: documentation
title: ZMNHID - ZWave
---

{% include base.html %}

# ZMNHID Flush on/off thermostat
This describes the Z-Wave device *ZMNHID*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhid_00_000```.

The ZMNHID supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/358) to improve the documentation.

## Channels

The following table summarises the channels available for the ZMNHID -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Thermostat mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | Temperature | Number | 

### Sensor (temperature)

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)

Indicates the instantaneous power consumption.

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)

Indicates the energy consumption (kWh).

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Thermostat mode

Sets the thermostat.

The ```thermostat_mode``` channel supports the ```Number``` item and is in the ```Temperature``` category.
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
| 15 | Full Power |
| 31 | Manufacturer Specific |

### Setpoint (heating)

Sets the thermostate setpoint.

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 16 configuration parameters available in the ZMNHID.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 switch type | Input 1 switch type |
| 2 | Input 2 switch type | Input 2 switch type |
| 3 | Input 3 switch type | Input 3 switch type |
| 4 | Input 2 contact type |  |
| 5 | Input 3 contact type |  |
| 10 | Activate / deactivate functions ALL ON/ALL OFF | Module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system. |
| 11 | Set point set by I2 | Set point set by I2 |
| 12 | Set point set by I3 | 65535 – input I3 does not influence on the set point  
 From 0 to 990 set point from 0.0 °C to 99.0 °C  
 From 1001 to 1150 – set point from -0.1 °C to -15.0 °C |
| 40 | Power reporting in Watts on power change for Q1 | Power report is sent (pushed) only when actual power in Watts in real time changed for more than set percentage comparing to previous actual power in Watts, step is 1%.

- 0 = Reporting Disabled
- 1–100 = 1% - 100% Reporti |
| 42 | Power reporting in Watts by time interval for Q1 | default value is 300 (power report in Watts is sent each 300s)

- 0 = Reporting Disabled
- 1–65535 = 1 second – 65535 seconds. Reporting enabled. Power report is sent with time interval set by entered value. |
| 43 | Hysteresis On | This parameter defines temperature min difference between real measured temperature and set-point temperature to turn device on. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 °C to 12.7 °C and from 128 to 255 means from - 0.1 °C to -12. |
| 44 | Hysteresis Off | This parameter defines temperature min difference between real measured temperature and set-point temperature to turn device on. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 °C to 12.7 °C and from 128 to 255 means from - 0.1 °C to -12. |
| 45 | Antifreeze | Set value means at which temperature the device will be turned on even if the thermostat was manually set to off. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 °C to 12.7 °C and from 128 to 254 means from - 0.1 °C to -12.6 °C. 255 is di |
| 60 | Too low temperature limit | 1 - 1000 = 0.1°C – 100.0°C, step is 0.1°C. Too low temperature limit is set by entered value. In case is set value out of this range, module is changing set value automatically to default value. |
| 61 | Too high temperature limit | 1 - 1000 = 0.1°C – 100.0°C, step is 0.1°C. Too low temperature limit is set by entered value. In case is set value out of this range, module is changing set value automatically to default value. |
| 63 | Switch selection | Set value means the type of the device that is connected to the relay output. The device type can be normally open (NO) or normally close (NC). Available configuration parameters (data type is 1 Byte DEC): • default value 0 • 0 - When system is turned |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Input 1 switch type

Input 1 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Input 2 switch type

Input 2 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Input 3 switch type

Input 3 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is ```1``` (bi-stable switch type).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Input 2 contact type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Input 3 contact type



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is ```0``` (NO (normally open) input type).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 10: Activate / deactivate functions ALL ON/ALL OFF

Module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | ALL ON is not active ALL OFF is not active |
| 1 | ALL ON is not active ALL OFF active |
| 2 | ALL ON active ALL OFF is not active |
| 255 | ALL ON active, ALL OFF active |

The manufacturer defined default value is ```255``` (ALL ON active, ALL OFF active).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Set point set by I2

Set point set by I2
When I2 is pressed set point will be set according to the value of this parameter. Available config. parameters

Default Value 65535

65535 - input I2 does not influence on the set point.

From 0 to 990 - set point from 0.0 °C to 99.0 °C

From 1001 to 1150 - set point from -0.1 °C to -15.0 °C
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: Set point set by I3

65535 – input I3 does not influence on the set point  
 From 0 to 990 set point from 0.0 °C to 99.0 °C  
 From 1001 to 1150 – set point from -0.1 °C to -15.0 °C

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in Watts on power change for Q1

Power report is sent (pushed) only when actual power in Watts in real time changed for more than set percentage comparing to previous actual power in Watts, step is 1%.

- 0 = Reporting Disabled
- 1–100 = 1% - 100% Reporti

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting in Watts by time interval for Q1

default value is 300 (power report in Watts is sent each 300s)

- 0 = Reporting Disabled
- 1–65535 = 1 second – 65535 seconds. Reporting enabled. Power report is sent with time interval set by entered value.

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```300```.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 43: Hysteresis On

This parameter defines temperature min difference between real measured temperature and set-point temperature to turn device on. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 °C to 12.7 °C and from 128 to 255 means from - 0.1 °C to -12.

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```132```.

This parameter has the configuration ID ```config_43_1``` and is of type ```INTEGER```.


### Parameter 44: Hysteresis Off

This parameter defines temperature min difference between real measured temperature and set-point temperature to turn device on. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 °C to 12.7 °C and from 128 to 255 means from - 0.1 °C to -12.

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_44_1``` and is of type ```INTEGER```.


### Parameter 45: Antifreeze

Set value means at which temperature the device will be turned on even if the thermostat was manually set to off. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 °C to 12.7 °C and from 128 to 254 means from - 0.1 °C to -12.6 °C. 255 is di

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_45_1``` and is of type ```INTEGER```.


### Parameter 60: Too low temperature limit

1 - 1000 = 0.1°C – 100.0°C, step is 0.1°C. Too low temperature limit is set by entered value. In case is set value out of this range, module is changing set value automatically to default value.

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_60_2``` and is of type ```INTEGER```.


### Parameter 61: Too high temperature limit

1 - 1000 = 0.1°C – 100.0°C, step is 0.1°C. Too low temperature limit is set by entered value. In case is set value out of this range, module is changing set value automatically to default value.

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```700```.

This parameter has the configuration ID ```config_61_2``` and is of type ```INTEGER```.


### Parameter 63: Switch selection

Set value means the type of the device that is connected to the relay output. The device type can be normally open (NO) or normally close (NC). Available configuration parameters (data type is 1 Byte DEC): • default value 0 • 0 - When system is turned

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_63_2``` and is of type ```INTEGER```.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHID supports 6 association groups.

### Group 1: Basic on/off Q1


This group supports 16 nodes.

### Group 2: Basic on/off I2


This group supports 16 nodes.

### Group 3: Basic on/off I3


This group supports 16 nodes.

### Group 4: High Temperature


This group supports 16 nodes.

### Group 5: Low Temperature


This group supports 16 nodes.

### Group 6: Default Reporting Group


This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_THERMOSTAT_MODE_V2| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/358/Qubino-Flush-On-Off-Thermostat-PLUS-user-manual-V1-2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/358).
