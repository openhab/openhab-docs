---
layout: documentation
title: ZMNHLD - ZWave
---

{% include base.html %}

# ZMNHLD Flush PWM Thermostat

This describes the Z-Wave device *ZMNHLD*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhld_00_000```. 

Flush PWM Thermostat  


## Overview 

This Z-Wave module is used to regulate temperature.

Regulation is done using full wave PWM technology. The module can be controlled either through Z-wave network or through the wall switch.

The module is designed to be mounted inside a "flush mounting box" and is hidden behind a traditional wall switch.  
Module measures power consumtion of connected device.

It is designed to act as repeater in order to improve range and stability of Z-wave network.

  


### Inclusion Information 

WARNING: Service button S **must NOT be used** when module is connected to 110-230V power supply.

 *  Connect module to power supply (with temperature sensor connected - if purchased),
 *  Enable add/remove mode on main controller
 *  Auto-inclusion (works for about 2 minutesafter connected to power supply) or
 *  **110V-230V power supply: **Press push button I1 three times within 3 seconds (3 times change switch state within 3 seconds)
 *  **24V SELV: **Press service button **S** for more than 2 seconds.

**NOTE1:** For auto-inclusion procedure, first set main controller into inclusion mode and then connect module to power supply.

**NOTE2:** When connecting temperature sensor to module that has already been included, you have to exclude module first. Switch off power supply,connect the sensor and re-include the module.

  


### Exclusion Information 

WARNING: Service button S **must NOT be used** when module is connected to 110-230V power supply.

 *  Connect module to power supply
 *  Bring module within maximum 1 meter (3 feet) of the main controller
 *  Enable add/remove mode on main controller
 *  **110V-230V power supply:** Press push button **I1** five times within 3 seconds (5 times change switch state within 3 seconds) in the first 60 seconds after the module is connected to the power supply
 *  **24V SELV:** Press ervice button **S** for more than 6 seconds.

By this function all parameters of the module are set to default values and own ID is deleted. If push button I1 is pressed three times within 3 seconds (or service button S is pressed more than 2 and less than 6 seconds) module is excluded, but configuration parameters are not set to default values.

NOTE: If the module is included with parameters 100 or 101 with values different to default and module reset is done, wait at least 30s before next inclusion.


## Channels
The following table summarises the channels available for the ZMNHLD Flush PWM Thermostat.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode | qubino_zmnhld_00_000_thermostat_mode | Temperature | Number |
| Thermostat setpoint | thermostat_setpoint_heating | thermostat_setpoint | Temperature | Number |
| Temperature Sensor | sensor_temperature1 | sensor_temperature | Temperature | Number |
| Thermostat mode | thermostat_mode1 | qubino_zmnhld_00_000_thermostat_mode | Temperature | Number |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Thermostat setpoint

#### Scale

Select the scale to use for setpoints.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Temperature Sensor

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZMNHLD Flush PWM Thermostat.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input I1 switch type | Input I1 switch type |
| 2: Input I2 switch type | Input I2 switch type |
| 3: Input I3 switch type | Input I3 switch type |
| 4: Input 1 contact type | Input 1 contact type |
| 5: Input 2 contact type | Input 2 contact type |
| 6: Input 3 contact type | Input 3 contact type |
| 10: Activate / deactivate ALL ON/ALL OFF | Activate / deactivate ALL ON/ALL OFF |
| 11: I1 Functionality selection | I1 Functionality selection |
| 12: I2 Functionality selection | I2 Functionality selection |
| 13: I3 Functionality selection | I3 Functionality selection |
| 40: Power reporting in Watts on power change | Power reporting in Watts on power change |
| 42: Power reporting in Watts by time interval | Power reporting in Watts by time interval |
| 45: Antifreeze | Antifreeze |
| 50: PWM maximum value | PWM maximum value |
| 51: PWM minimum value | PWM minimum value |
| 52: PWM cycle duration | PWM cycle duration |
| 53: PID value inside deadband | PID value inside deadband |
| 54: PID deadband | PID deadband |
| 55: Integral sampling time | Integral sampling time |
| 56: P parameter | P parameter |
| 57: I parameter | I parameter |
| 58: D parameter | D parameter |
| 59: Thermostat mode | Thermostat mode |
| 60: Too low temperature limit | Too low temperature limit |
| 61: Too high temperature limit | Too high temperature limit |
| 63: Output switch selection | Output switch selection |
| 70: Input I1 status on delay | Input I1 status on delay |
| 71: Input I1 status off delay | Input I1 status off delay |
| 72: Input I2 status on delay | Input I2 status on delay |
| 73: Input I2 status off delay | Input I2 status off delay |
| 74: Input I3 status on delay | Input I3 status on delay |
| 75: Input I3 status off delay | Input I3 status off delay |
| 100: Enable/Disable Endpoint I1 or select type | Enable/Disable Endpoint I1 or select type |
| 101: Enable/Disable Endpoint I2 or select type | Enable/Disable Endpoint I2 or select type |
| 102: Enable/Disable Endpoint I3 or select type | Enable/Disable Endpoint I3 or select type |
| 110: Temperature sensor offset settings | Temperature sensor offset settings |
| 120: Digital temperature sensor reporting | Digital temperature sensor reporting |
| 121: Digital temperature sensor / setpoint selector | Digital temperature sensor / setpoint selector |
| 122: Node Id of external battery powered sensor | Node Id of external battery powered sensor |
| 1: Lifeline group | reserved for communication with the main controller |
| 2: basic on/off (output) | Triggered at change of the output |
| 3: Sensor_multilevel_get |  |
| 4: basic on/off (temp limit) | triggered by Too high temperature limit |
| 5: Thermostat setpoint get |  |
| 6: basic on/off (window) | triggered by change of I1 |
| 7: basic on/off (condense sensor) | triggered by change of I2 |
| 8: basic on/off (flood sensor) | triggered by change of I3 |
| 9: sensor multilevel report | Triggered at change of temperature |


#### 1: Input I1 switch type

Input I1 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (0) |
|  | bi-stable switch type (1) |


#### 2: Input I2 switch type

Input I2 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (0) |
|  | bi-stable switch type (1) |


#### 3: Input I3 switch type

Input I3 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (0) |
|  | bi-stable switch type (1) |


#### 4: Input 1 contact type

Input 1 contact type  


##### Overview 

This parameter has influence only when parameter no. 11 is set to value "2"  
After setting the parameter switch the sensor once, so tha the module could determine the input state


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | normally open (0) |
|  | normally closed (1) |


#### 5: Input 2 contact type

Input 2 contact type  


##### Overview 

This parameter has influence only when parameter no. 12 is set to value "2000"  
After setting the parameter switch the sensor once, so tha the module could determine the input state


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | normally open (0) |
|  | normally closed (1) |


#### 6: Input 3 contact type

Input 3 contact type  


##### Overview 

This parameter has influence only when parameter no. 13 is set to value "2"  
After setting the parameter switch the sensor once, so tha the module could determine the input state


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | normally open (0) |
|  | normally closed (1) |


#### 10: Activate / deactivate ALL ON/ALL OFF

Activate / deactivate ALL ON/ALL OFF  


##### Overview 

Flush PWM thermostat module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controllers belonging to the system.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON is not active / ALL OFF is not active (0) |
|  | ALL ON is not active / ALL OFF is active (1) |
|  | ALL ON is active / ALL OFF is not active (2) |
|  | ALL ON is active / ALL OFF is active (255) |


#### 11: I1 Functionality selection

I1 Functionality selection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Input I1 changes the mode between Off and Heat/Cool (1) |
|  | Input I1 influences the heating/cooling valves (2) |
|  | Input I1 doesnt influence on the Heat/Cool process (32767) |


#### 12: I2 Functionality selection

I2 Functionality selection  


##### Overview 

0-990 - Temperature setpoint from 0,0 to 99,0 °C  
1001-1150 - Temperature setpoint -0.1 to -15°C  
2000 - Input I2 influences on the cooling value according to the status of condense sensor.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER || Default Value | 32767 |
| Options | Input I2 influences the cooling value with condense sensor (2000) |
|  | Input I2 doesnt influence on the Heat/Cool process (32767) |


#### 13: I3 Functionality selection

I3 Functionality selection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_2 |
| Data Type        | INTEGER || Default Value | 32767 |
| Options | Input I3 changes the mode between Heat and Cool (1) |
|  | Input I3 influences the heating/cooling valves (2) |
|  | Input I3 doesnt influence on the Heat/Cool process (32767) |


#### 40: Power reporting in Watts on power change

Power reporting in Watts on power change  


##### Overview 

0 - reporting disabled  
1-100 = 1%-100% Reporting enabled  
Power report is send only when actual power in Watts in real time changes for more then that set percentage


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 0 |


#### 42: Power reporting in Watts by time interval

Power reporting in Watts by time interval  


##### Overview 

0 - report disabled  
1-32767 = 1 second - 32767 seconds interval. Reporting enabled with time interval


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 0 |


#### 45: Antifreeze

Antifreeze  


##### Overview 

Set value means at which temperature the thermostat will be turned on even if the thermostat was manually set off  
0-127 = 0..12.7°C  
1001-1127 = -0.1..-12.6°C  
255 = Antifreeze is disabled


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_45_2 |
| Data Type        | INTEGER |
| Range | 0 to 1127 |
| Default Value | 50 |


#### 50: PWM maximum value

PWM maximum value  


##### Overview 

2..100 = 2..100% Maximum PWM is set by entered value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_50_1 |
| Data Type        | INTEGER |
| Range | 2 to 100 |
| Default Value | 100 |


#### 51: PWM minimum value

PWM minimum value  


##### Overview 

0..99 = 0..99% Minimum PWM is set by entered value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_51_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 0 |


#### 52: PWM cycle duration

PWM cycle duration  


##### Overview 

5..127 = 5-125 seconds. PWM cycle duration is set by entered value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_52_1 |
| Data Type        | INTEGER |
| Range | 5 to 127 |
| Default Value | 10 |


#### 53: PID value inside deadband

PID value inside deadband  


##### Overview 

0 - PID value equals PWM minimum cycle  
1 - PID value set to LAST VALUE


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_53_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 54: PID deadband

PID deadband  


##### Overview 

0..127 = 0..12.7 °C  
This parameter defines the zone where PID is not active.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_54_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 5 |


#### 55: Integral sampling time

Integral sampling time  


##### Overview 

0..127 = 0..127 seconds.  
Parameter defines the time between samples.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_55_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 5 |


#### 56: P parameter

P parameter


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_56_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 100 |


#### 57: I parameter

I parameter


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_57_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 1 |


#### 58: D parameter

D parameter


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_58_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 1 |


#### 59: Thermostat mode

Thermostat mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_59_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Heat mode (0) |
|  | Cool mode (1) |


#### 60: Too low temperature limit

Too low temperature limit  


##### Overview 

0..1000 = 0.1-100.0°C  
1001..1150 = -0.1..-15.0°C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_60_2 |
| Data Type        | INTEGER |
| Range | 1 to 1150 |
| Default Value | 50 |


#### 61: Too high temperature limit

Too high temperature limit  


##### Overview 

1..1000 = 0.1..100.0°C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_61_2 |
| Data Type        | INTEGER |
| Range | 1 to 1000 |
| Default Value | 700 |


#### 63: Output switch selection

Output switch selection  


##### Overview 

Set value means the type of the device that is connected to the PWM output.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_63_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | When the device is turned off the output is 0V (0) |
|  | When the system is turned off the output is 230V (1) |


#### 70: Input I1 status on delay

Input I1 status on delay  


##### Overview 

If the value of the parameter is different to 0 means that the influence of this input to heating or cooling will react after inserted time.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_70_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 71: Input I1 status off delay

Input I1 status off delay  


##### Overview 

If the value of the parameter is different to 0 means that the influence of this input to heating or cooling will react after inserted time.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_71_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 72: Input I2 status on delay

Input I2 status on delay  


##### Overview 

If the value of the parameter is different to 0 means that the influence of this input to heating or cooling will react after inserted time.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_72_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 73: Input I2 status off delay

Input I2 status off delay  


##### Overview 

If the value of the parameter is different to 0 means that the influence of this input to heating or cooling will react after inserted time.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_73_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 74: Input I3 status on delay

Input I3 status on delay  


##### Overview 

If the value of the parameter is different to 0 means that the influence of this input to heating or cooling will react after inserted time.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_74_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 75: Input I3 status off delay

Input I3 status off delay  


##### Overview 

If the value of the parameter is different to 0 means that the influence of this input to heating or cooling will react after inserted time.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_75_2 |
| Data Type        | INTEGER |
| Range | 0 to 32000 |
| Default Value | 0 |


#### 100: Enable/Disable Endpoint I1 or select type

Enable/Disable Endpoint I1 or select type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_100_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | disabled (0) |
|  | Home security, motion detection (1) |
|  | CO - Carbon monoxid detected (2) |
|  | CO2 - Carbon dioxid detected (3) |
|  | Water alarm (4) |
|  | Heat alarm (5) |
|  | Smoke alarm (6) |
|  | Sensor binary (9) |


#### 101: Enable/Disable Endpoint I2 or select type

Enable/Disable Endpoint I2 or select type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_101_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | disabled (0) |
|  | Home security, motion detection (1) |
|  | CO - Carbon monoxid detected (2) |
|  | CO2 - Carbon dioxid detected (3) |
|  | Water alarm (4) |
|  | Heat alarm (5) |
|  | Smoke alarm (6) |
|  | Sensor binary (9) |


#### 102: Enable/Disable Endpoint I3 or select type

Enable/Disable Endpoint I3 or select type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_102_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | disabled (0) |
|  | Home security, motion detection (1) |
|  | CO - Carbon monoxid detected (2) |
|  | CO2 - Carbon dioxid detected (3) |
|  | Water alarm (4) |
|  | Heat alarm (5) |
|  | Smoke alarm (6) |
|  | Sensor binary (9) |


#### 110: Temperature sensor offset settings

Temperature sensor offset settings  


##### Overview 

32536 = offset is 0.0°C  
1..100 = offset is 0.1..10.0°C added to actual measuring value  
1001..1100 = offset is -0.1..-10.0°C subtracted to actual measuring value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_110_2 |
| Data Type        | INTEGER |
| Range | 0 to 32536 |
| Default Value | 32536 |


#### 120: Digital temperature sensor reporting

Digital temperature sensor reporting  


##### Overview 

If digital teperature sensor is connected, module reports measured temperature on temperture change defined by this parameter


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_120_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 5 |


#### 121: Digital temperature sensor / setpoint selector

Digital temperature sensor / setpoint selector


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_121_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | internal sensor is mounted (0) |
|  | temperature is grabbed by sensor with assoc 3 (1) |
|  | temperature is grabbed from ext battery sensor (2) |
|  | setpoint is grabbed by sensor with assoc 5 (4) |
|  | setpoint is grabbed from ext battery sensor (8) |
|  | temperature an setpoint are grabbed from ext batt sensor (10) |


#### 122: Node Id of external battery powered sensor

Node Id of external battery powered sensor  


##### Overview 

0 - disabled

1..254 = NodeId of external battery powered room sensor


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_122_1 |
| Data Type        | INTEGER |
| Range | 0 to 254 |
| Default Value | 0 |


#### 1: Lifeline group

reserved for communication with the main controller


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: basic on/off (output)

Triggered at change of the output


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Sensor_multilevel_get


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: basic on/off (temp limit)

triggered by Too high temperature limit


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Thermostat setpoint get


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: basic on/off (window)

triggered by change of I1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


#### 7: basic on/off (condense sensor)

triggered by change of I2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_7 |
| Data Type        | TEXT |
| Range |  to  |


#### 8: basic on/off (flood sensor)

triggered by change of I3


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_8 |
| Data Type        | TEXT |
| Range |  to  |


#### 9: sensor multilevel report

Triggered at change of temperature


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_9 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/498).
