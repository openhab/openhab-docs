---
layout: documentation
title: ZMNHLA - ZWave
---

{% include base.html %}

# ZMNHLA Flush PWM thermostat

This describes the Z-Wave device *ZMNHLA*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhla_00_000```. 

Flush PWM thermostat


## Channels
The following table summarises the channels available for the ZMNHLA Flush PWM thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Thermostat mode | thermostat_mode | qubino_zmnhla_00_000_thermostat_mode | Temperature | Number |
| Setpoint (heating) | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Setpoint (heating)

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZMNHLA Flush PWM thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input 1 switch type | Input 1 switch type |
| 2: Input 2 switch type | Input 2 switch type |
| 3: Input 3 switch type | Input 3 switch type |
| 4: Input 1 contact type | Input 1 contact type |
| 5: Input 2 contact type | Input 2 contact type |
| 6: Input 3 contact type | Input 3 contact type |
| 10: Activate / deactivate functions ALL ON/ALL OFF | Respond to ALL ON/ALL OFF |
| 11: I1 Functionality Selection | Default Value = 1. 65535 – Input I1 does not influence on the heat/cool process. 1 - Input... |
| 12: I2 Functionality Selection | Default = 65535, 65535 - I2 does not influence on the heat/cool process, From From 0 to 99... |
| 13: I3 Functionality Selection | Default Value = 65535. 65535 – Input I3 does not influence on the heat/cool process. 1 - I... |
| 40: Power reporting in Watts on power change | Default Value = 0. 0 – Reporting Disabled 1 - 100 = 1% - 100% Reporting enabled. Power rep... |
| 42: Power reporting in Watts by timer interval | Default Value = 300. 0 – Reporting Disabled 1 - 32767 = 1 second - 32767 seconds Reporting... |
| 45: Antifreeze | Set value at which temperature the device will be turned on even if the termpearture was m... |
| 50: PWM Maximum Value | 2 - 100 = 2% - 100%, step is 1% Max PWM set by entered value. Default = 100. The Maximum l... |
| 51: PWM Minimum Value | 1 - 99 = 1% - 99%, step is 1% Minimum PWM set by entered value. Default = 0. The Minimum l... |
| 52: PWM Cycle Duration | 1 - 127 = 1-127 seconds, step is 1s PWM Cycle Duration set by entered value. Default = 10.... |
| 53: PID Value Inside Deadband | When value is set to ZERO PID inside deadband is forced to zero. LAST VALUE means PID rema... |
| 54: PID Deadband | 0 - 127 = 0.0C - 12.7C step is 0.1 C This parameter defines the zone where PID is not acti... |
| 55: Integral Sampling Time | 0 - 127 = 0s -127s step is 1s Parameter defines the time between samples. On each sample t... |
| 56: P Parameter | 0 - 1000 P value step is 1. Default = 100 |
| 57: I Parameter | 0 - 1000 - 0s I value step is 1. Default = 1 |
| 58: D Parameter | 0 - 1000 - 0s D value step is 1. Default = 1 |
| 59: Thermostat Mode |  |
| 60: Too low temperature limit | 1 - 1000 = 0.1 C - 100.0 C step is 0.1 C Too low temperature limit is set by entered value... |
| 61: Too high temperature limit | 1 - 1000 = 0.1 C - 100.0 C step is 0.1 C Too high temperature limit is set by entered valu... |
| 63: Output Switch Selection |  |
| 70: Input 1 Status on delay | 1 - 32000 seconds. If the value of the parameter is different to 0, means that the influen... |
| 71: Input 1 Status off delay | 1 - 32000 seconds. If the value of the parameter is different to 0, means that the influen... |
| 72: Input 2 Status on delay | 1 - 32000 seconds. If the value of the parameter is different to 0, means that the influen... |
| 73: Input 2 Status off delay | 1 - 32000 seconds. If the value of the parameter is different to 0, means that the influen... |
| 74: Input 3 Status on delay | 1 - 32000 seconds. If the value of the parameter is different to 0, means that the influen... |
| 75: Input 3 Status off delay | 1 - 32000 seconds. If the value of the parameter is different to 0, means that the influen... |
| 1: On/Off Triggered by Q State |  |
| 2: On/Off Triggered by I2 |  |
| 3: On/Off Triggered by I3 |  |
| 4: On/Off Triggerd by High Temp |  |
| 5: On/Off Trigger by Low Temp |  |
| 6: Controller Updates |  |


#### 1: Input 1 switch type

Input 1 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (push button) (0) |
|  | bi-stable switch type (1) |


#### 2: Input 2 switch type

Input 2 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (push button) (0) |
|  | bi-stable switch type (1) |


#### 3: Input 3 switch type

Input 3 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (push button) (0) |
|  | bi-stable switch type (1) |


#### 4: Input 1 contact type

Input 1 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NO (normally open) input type (0) |
|  | NC (normally close) input type (1) |


#### 5: Input 2 contact type

Input 2 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NO (normally open) input type (0) |
|  | NC (normally close) input type (1) |


#### 6: Input 3 contact type

Input 3 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NO (normally open) input type (0) |
|  | NC (normally close) input type (1) |


#### 10: Activate / deactivate functions ALL ON/ALL OFF

Respond to ALL ON/ALL OFF  


##### Overview 

Flush PWM thermostat module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.           


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON is not active ALL OFF is not active (0) |
|  | ALL ON is not active ALL OFF active (1) |
|  | ALL ON active ALL OFF is not active (2) |
|  | ALL ON active, ALL OFF active (255) |


#### 11: I1 Functionality Selection

Default Value = 1. 65535 – Input I1 does not influence on the heat/cool process. 1 - Input I1 changes the mode of the thermostat between OFF and AUTO. In this case function on flood sensor (if connected) is disabled. 2 - inpu


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 1 |


#### 12: I2 Functionality Selection

Default = 65535, 65535 - I2 does not influence on the heat/cool process, From From 0 to 990 - Temperature set point from 0.0 C to 99.0 C. When I2 is pressed, the temperature set point is automatically set to value defined here. In


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 65535 |


#### 13: I3 Functionality Selection

Default Value = 65535. 65535 – Input I3 does not influence on the heat/cool process. 1 - Input I3 changes the mode of the thermostat between OFF and AUTO. In this case function on window sensor is disabled. 2 - input I3 influ


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER |
| Range | 1 to 65535 |
| Default Value | 65535 |


#### 40: Power reporting in Watts on power change

Default Value = 0. 0 – Reporting Disabled 1 - 100 = 1% - 100% Reporting enabled. Power report is sent (pushed) only when actual power in Watts in real time changes for more than set percentage comparing to previous actual power in


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 0 |


#### 42: Power reporting in Watts by timer interval

Default Value = 300. 0 – Reporting Disabled 1 - 32767 = 1 second - 32767 seconds Reporting enabled. Power report is sent with time interval set by entered value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 300 |


#### 45: Antifreeze

Set value at which temperature the device will be turned on even if the termpearture was manually set to off. Parameter can be set from 0 to 255 where 0 to 127 means from 0.0 C to 12.7 C and from 128 to 254 means from -0.1 C to -12.6 C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_45_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 50 |


#### 50: PWM Maximum Value

2 - 100 = 2% - 100%, step is 1% Max PWM set by entered value. Default = 100. The Maximum level may not be lower than the minimum level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_1 |
| Data Type        | INTEGER |
| Range | 2 to 100 |
| Default Value | 100 |


#### 51: PWM Minimum Value

1 - 99 = 1% - 99%, step is 1% Minimum PWM set by entered value. Default = 0. The Minimum level may exceed the maximum level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_51_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 0 |


#### 52: PWM Cycle Duration

1 - 127 = 1-127 seconds, step is 1s PWM Cycle Duration set by entered value. Default = 10. NOTE:PWM Cycle duration defines the summary of all ON plus OFF time periods. For example if Output is set to 70% with PWM cycle duration of 20s,


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_52_1 |
| Data Type        | INTEGER |
| Range | 1 to 127 |
| Default Value | 10 |


#### 53: PID Value Inside Deadband

When value is set to ZERO PID inside deadband is forced to zero. LAST VALUE means PID remains on same level as was before entering into deadband.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_53_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | PID value equals ZERO (0) |
|  | PID value set to LAST VALUE (1) |


#### 54: PID Deadband

0 - 127 = 0.0C - 12.7C step is 0.1 C This parameter defines the zone where PID is not active. If the temperature difference between actual and setpoint is bigger than PID deadband, then the PID will start to regulate the system, otherw


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_54_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 5 |


#### 55: Integral Sampling Time

0 - 127 = 0s -127s step is 1s Parameter defines the time between samples. On each sample the controller captures difference between SP-act.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_55_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 5 |


#### 56: P Parameter

0 - 1000 P value step is 1. Default = 100


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_56_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 100 |


#### 57: I Parameter

0 - 1000 - 0s I value step is 1. Default = 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_57_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 1 |


#### 58: D Parameter

0 - 1000 - 0s D value step is 1. Default = 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_58_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 1 |


#### 59: Thermostat Mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_59_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Heat Mode (0) |
|  | Cool Mode (1) |


#### 60: Too low temperature limit

1 - 1000 = 0.1 C - 100.0 C step is 0.1 C Too low temperature limit is set by entered value. In case measured temperature is below set value, module sends BasicSet value. Default = 50


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_60_2 |
| Data Type        | INTEGER |
| Range | 1 to 1000 |
| Default Value | 50 |


#### 61: Too high temperature limit

1 - 1000 = 0.1 C - 100.0 C step is 0.1 C Too high temperature limit is set by entered value. In case measured temperature is higher than set value, module sends BasicSet value. Default = 700


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_61_2 |
| Data Type        | INTEGER |
| Range | 1 to 1000 |
| Default Value | 700 |


#### 63: Output Switch Selection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_63_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | When system is turned off the output is 0V (NC) (0) |
|  | When system is turned off the output is 230V (NO) (1) |


#### 70: Input 1 Status on delay

1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 11 must be set to 2!


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_70_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 71: Input 1 Status off delay

1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 11 must be set to 2!


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_71_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 72: Input 2 Status on delay

1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 12 must be set to 2000!


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_72_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 73: Input 2 Status off delay

1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 12 must be set to 2000!


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_73_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 74: Input 3 Status on delay

1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 13 must be set to 2!


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_74_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 75: Input 3 Status off delay

1 - 32000 seconds. If the value of the parameter is different to 0, means that the influence of this input to heating or cooling will react after inserted time. Parameter 13 must be set to 2!


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_75_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 1: On/Off Triggered by Q State


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: On/Off Triggered by I2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: On/Off Triggered by I3


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: On/Off Triggerd by High Temp


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: On/Off Trigger by Low Temp


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: Controller Updates


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/212).
