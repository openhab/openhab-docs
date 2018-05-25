---
layout: documentation
title: ZMNHLA - ZWave
---

{% include base.html %}

# ZMNHLA Flush PWM thermostat
This describes the Z-Wave device *ZMNHLA*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhla_00_000```.

The device is in the category of HVAC, defining Air condition devices, Fans.

# Overview


## Channels

The following table summarises the channels available for the ZMNHLA

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Electric meter (watts) | meter_watts | Energy | Number | 
| Electric meter (kWh) | meter_kwh | Energy | Number | 
| Thermostat mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | Temperature | Number | 

### Sensor (temperature)

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)

The ```meter_watts``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (kWh)

The ```meter_kwh``` channel supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Thermostat mode

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

The ```thermostat_setpoint``` channel supports the ```Number``` item and is in the ```Temperature``` category.



## Device Configuration

The following table provides a summary of the 32 configuration parameters available in the ZMNHLA.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input 1 switch type | Input 1 switch type |
| 2 | Input 2 switch type | Input 2 switch type |
| 3 | Input 3 switch type | Input 3 switch type |
| 4 | Input 1 contact type | Input 1 contact type |
| 5 | Input 2 contact type | Input 2 contact type |
| 6 | Input 3 contact type | Input 3 contact type |
| 10 | Activate / deactivate functions ALL ON/ALL OFF			 | Respond to ALL ON/ALL OFF |
| 11 | I1 Functionality Selection | Default Value = 1. 65535 – Input I1 does not influence on the heat/cool process. 1 - Input I1 changes the mode of the thermostat between OFF and AUTO. In this case function on flood sensor (if connected) is disabled. 2 - inpu |
| 12 | I2 Functionality Selection | Default = 65535, 65535 - I2 does not influence on the heat/cool process, From From 0 to 990 - Temperature set point from 0.0 C to 99.0 C. When I2 is pressed, the temperature set point is automatically set to value defined here. In |
| 13 | I3 Functionality Selection | Default Value = 65535. 65535 – Input I3 does not influence on the heat/cool process. 1 - Input I3 changes the mode of the thermostat between OFF and AUTO. In this case function on window sensor is disabled. 2 - input I3 influ |
| 40 | Power reporting in Watts on power change | Default Value = 0. 0 – Reporting Disabled 1 - 100 = 1% - 100% Reporting enabled. Power report is sent (pushed) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in |
| 42 | Power reporting in Watts by timer interval | Default Value = 300. 0 – Reporting Disabled 1 - 32767 = 1 second - 32767 seconds Reporting enabled. Power report is sent with time interval set by entered value. |
| 45 | Antifreeze | Set value at which temperature the device will be turned on even if the termpearture was manually set to off. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 C to 12.7 C and from 128 to 254 means from -0.1 C to -12.6 C |
| 50 | PWM Maximum Value | 2 - 100 = 2% - 100%, step is 1% Max PWM set by entered value. Default = 100. The Maximum level may not be lower than the minimum level. |
| 51 | PWM Minimum Value | 1 - 99 = 1% - 99%, step is 1% Minimum PWM set by entered value. Default = 0. The Minimum level may exceed the maximum level. |
| 52 | PWM Cycle Duration | 1 - 127 = 1-127 seconds, step is 1s PWM Cycle Duration set by entered value. Default = 10. NOTE:PWM Cycle duration defines the summary of all ON plus OFF time periods. For example if Output is set to 70% with PWM cycle duration of 20s, |
| 53 | PID Value Inside Deadband | When value is set to ZERO PID inside deadband is forced to zero. LAST VALUE means PID remains on same level as was before entering into deadband. |
| 54 | PID Deadband | 0 - 127 = 0.0C - 12.7C step is 0.1 C This parameter defines the zone where PID is not active. If the temperature difference between actual and setpoint is bigger than PID deadband, then the PID will start to regulate the system, otherw |
| 55 | Integral Sampling Time | 0 - 127 = 0s -127s step is 1s Parameter defines the time between samples. On each sample the controller captures difference between SP-act. |
| 56 | P Parameter | 0 - 1000 P value step is 1. Default = 100 |
| 57 | I Parameter | 0 - 1000 - 0s I value step is 1. Default = 1 |
| 58 | D Parameter | 0 - 1000 - 0s D value step is 1. Default = 1 |
| 59 | Thermostat Mode |  |
| 60 | Too low temperature limit | 1 - 1000 = 0.1 C - 100.0 C step is 0.1 C Too low temperature limit is set by entered value. In case measured temperature is below set value, module sends BasicSet value. Default = 50 |
| 61 | Too high temperature limit | 1 - 1000 = 0.1 C - 100.0 C step is 0.1 C Too high temperature limit is set by entered value. In case measured temperature is higher than set value, module sends BasicSet value. Default = 700 |
| 63 | Output Switch Selection |  |
| 70 | Input 1 Status on delay | 1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 11 must be set to 2! |
| 71 | Input 1 Status off delay | 1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 11 must be set to 2! |
| 72 | Input 2 Status on delay | 1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 12 must be set to 2000! |
| 73 | Input 2 Status off delay | 1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 12 must be set to 2000! |
| 74 | Input 3 Status on delay | 1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 13 must be set to 2! |
| 75 | Input 3 Status off delay | 1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 13 must be set to 2! |

### Parameter 1: Input 1 switch type

Input 1 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is 1 (bi-stable switch type).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Input 2 switch type

Input 2 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is 1 (bi-stable switch type).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Input 3 switch type

Input 3 switch type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | mono-stable switch type (push button) |
| 1 | bi-stable switch type |

The manufacturer defined default value is 1 (bi-stable switch type).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Input 1 contact type

Input 1 contact type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is 0 (NO (normally open) input type).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Input 2 contact type

Input 2 contact type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is 0 (NO (normally open) input type).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Input 3 contact type

Input 3 contact type

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | NO (normally open) input type |
| 1 | NC (normally close) input type |

The manufacturer defined default value is 0 (NO (normally open) input type).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 10: Activate / deactivate functions ALL ON/ALL OFF			

Respond to ALL ON/ALL OFF
Flush PWM thermostat module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | ALL ON is not active ALL OFF is not active |
| 1 | ALL ON is not active ALL OFF active |
| 2 | ALL ON active ALL OFF is not active |
| 255 | ALL ON active, ALL OFF active |

The manufacturer defined default value is 255 (ALL ON active, ALL OFF active).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: I1 Functionality Selection

Default Value = 1. 65535 – Input I1 does not influence on the heat/cool process. 1 - Input I1 changes the mode of the thermostat between OFF and AUTO. In this case function on flood sensor (if connected) is disabled. 2 - inpu

Values in the range 1 to 65535 may be set.

The manufacturer defined default value is 1.

This parameter has the configuration ID ```config_11_2``` and is of type ```INTEGER```.


### Parameter 12: I2 Functionality Selection

Default = 65535, 65535 - I2 does not influence on the heat/cool process, From From 0 to 990 - Temperature set point from 0.0 C to 99.0 C. When I2 is pressed, the temperature set point is automatically set to value defined here. In

Values in the range 1 to 65535 may be set.

The manufacturer defined default value is 65535.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: I3 Functionality Selection

Default Value = 65535. 65535 – Input I3 does not influence on the heat/cool process. 1 - Input I3 changes the mode of the thermostat between OFF and AUTO. In this case function on window sensor is disabled. 2 - input I3 influ

Values in the range 1 to 65535 may be set.

The manufacturer defined default value is 65535.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 40: Power reporting in Watts on power change

Default Value = 0. 0 – Reporting Disabled 1 - 100 = 1% - 100% Reporting enabled. Power report is sent (pushed) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in

Values in the range 0 to 100 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 42: Power reporting in Watts by timer interval

Default Value = 300. 0 – Reporting Disabled 1 - 32767 = 1 second - 32767 seconds Reporting enabled. Power report is sent with time interval set by entered value.

Values in the range 0 to 32767 may be set.

The manufacturer defined default value is 300.

This parameter has the configuration ID ```config_42_2``` and is of type ```INTEGER```.


### Parameter 45: Antifreeze

Set value at which temperature the device will be turned on even if the termpearture was manually set to off. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 C to 12.7 C and from 128 to 254 means from -0.1 C to -12.6 C

Values in the range 0 to 255 may be set.

The manufacturer defined default value is 50.

This parameter has the configuration ID ```config_45_1``` and is of type ```INTEGER```.


### Parameter 50: PWM Maximum Value

2 - 100 = 2% - 100%, step is 1% Max PWM set by entered value. Default = 100. The Maximum level may not be lower than the minimum level.

Values in the range 2 to 100 may be set.

The manufacturer defined default value is 100.

This parameter has the configuration ID ```config_50_1``` and is of type ```INTEGER```.


### Parameter 51: PWM Minimum Value

1 - 99 = 1% - 99%, step is 1% Minimum PWM set by entered value. Default = 0. The Minimum level may exceed the maximum level.

Values in the range 0 to 99 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 52: PWM Cycle Duration

1 - 127 = 1-127 seconds, step is 1s PWM Cycle Duration set by entered value. Default = 10. NOTE:PWM Cycle duration defines the summary of all ON plus OFF time periods. For example if Output is set to 70% with PWM cycle duration of 20s,

Values in the range 1 to 127 may be set.

The manufacturer defined default value is 10.

This parameter has the configuration ID ```config_52_1``` and is of type ```INTEGER```.


### Parameter 53: PID Value Inside Deadband

When value is set to ZERO PID inside deadband is forced to zero. LAST VALUE means PID remains on same level as was before entering into deadband.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | PID value equals ZERO |
| 1 | PID value set to LAST VALUE |

The manufacturer defined default value is 0 (PID value equals ZERO).

This parameter has the configuration ID ```config_53_1``` and is of type ```INTEGER```.


### Parameter 54: PID Deadband

0 - 127 = 0.0C - 12.7C step is 0.1 C This parameter defines the zone where PID is not active. If the temperature difference between actual and setpoint is bigger than PID deadband, then the PID will start to regulate the system, otherw

Values in the range 0 to 127 may be set.

The manufacturer defined default value is 5.

This parameter has the configuration ID ```config_54_1``` and is of type ```INTEGER```.


### Parameter 55: Integral Sampling Time

0 - 127 = 0s -127s step is 1s Parameter defines the time between samples. On each sample the controller captures difference between SP-act.

Values in the range 0 to 127 may be set.

The manufacturer defined default value is 5.

This parameter has the configuration ID ```config_55_1``` and is of type ```INTEGER```.


### Parameter 56: P Parameter

0 - 1000 P value step is 1. Default = 100

Values in the range 0 to 1000 may be set.

The manufacturer defined default value is 100.

This parameter has the configuration ID ```config_56_2``` and is of type ```INTEGER```.


### Parameter 57: I Parameter

0 - 1000 - 0s I value step is 1. Default = 1

Values in the range 0 to 1000 may be set.

The manufacturer defined default value is 1.

This parameter has the configuration ID ```config_57_2``` and is of type ```INTEGER```.


### Parameter 58: D Parameter

0 - 1000 - 0s D value step is 1. Default = 1

Values in the range 0 to 1000 may be set.

The manufacturer defined default value is 1.

This parameter has the configuration ID ```config_58_2``` and is of type ```INTEGER```.


### Parameter 59: Thermostat Mode



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Heat Mode |
| 1 | Cool Mode |

The manufacturer defined default value is 0 (Heat Mode).

This parameter has the configuration ID ```config_59_1``` and is of type ```INTEGER```.


### Parameter 60: Too low temperature limit

1 - 1000 = 0.1 C - 100.0 C step is 0.1 C Too low temperature limit is set by entered value. In case measured temperature is below set value, module sends BasicSet value. Default = 50

Values in the range 1 to 1000 may be set.

The manufacturer defined default value is 50.

This parameter has the configuration ID ```config_60_2``` and is of type ```INTEGER```.


### Parameter 61: Too high temperature limit

1 - 1000 = 0.1 C - 100.0 C step is 0.1 C Too high temperature limit is set by entered value. In case measured temperature is higher than set value, module sends BasicSet value. Default = 700

Values in the range 1 to 1000 may be set.

The manufacturer defined default value is 700.

This parameter has the configuration ID ```config_61_2``` and is of type ```INTEGER```.


### Parameter 63: Output Switch Selection



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | When system is turned off the output is 0V (NC) |
| 1 | When system is turned off the output is 230V (NO) |

The manufacturer defined default value is 0 (When system is turned off the output is 0V (NC)
				).

This parameter has the configuration ID ```config_63_1``` and is of type ```INTEGER```.


### Parameter 70: Input 1 Status on delay

1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 11 must be set to 2!

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_70_2``` and is of type ```INTEGER```.


### Parameter 71: Input 1 Status off delay

1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 11 must be set to 2!

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_71_2``` and is of type ```INTEGER```.


### Parameter 72: Input 2 Status on delay

1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 12 must be set to 2000!

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_72_2``` and is of type ```INTEGER```.


### Parameter 73: Input 2 Status off delay

1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 12 must be set to 2000!

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_73_2``` and is of type ```INTEGER```.


### Parameter 74: Input 3 Status on delay

1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 13 must be set to 2!

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_74_2``` and is of type ```INTEGER```.


### Parameter 75: Input 3 Status off delay

1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 13 must be set to 2!

Values in the range 0 to 32000 may be set.

The manufacturer defined default value is 0.

This parameter has the configuration ID ```config_75_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHLA supports 6 association groups.

### Group 1: On/Off Triggered by Q State


This group supports 16 nodes.

### Group 2: On/Off Triggered by I2


This group supports 16 nodes.

### Group 3: On/Off Triggered by I3


This group supports 16 nodes.

### Group 4: On/Off Triggerd by High Temp


This group supports 16 nodes.

### Group 5: On/Off Trigger by Low Temp


This group supports 16 nodes.

### Group 6: Controller Updates


This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V3| |
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_THERMOSTAT_MODE_V2| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/212).
