---
layout: documentation
title: ZMNHAD - ZWave
---

{% include base.html %}

# ZMNHAD Flush 1 relay

This describes the Z-Wave device *ZMNHAD*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhad_00_000```. 

Flush 1 relay


## Channels
The following table summarises the channels available for the ZMNHAD Flush 1 relay.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number |
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number |
| Binary Sensor 2 | sensor_binary2 | sensor_binary | Door | Switch |
| Alarm (power) 2 | alarm_power2 | alarm_power | Door | Switch |
| Sensor (temperature) | sensor_temperature3 | sensor_temperature | Temperature | Number |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZMNHAD Flush 1 relay.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input 1 switch type | Input 1 switch type |
| 2: Input 2 contact type | Input 2 contact type |
| 3: Input 3 contact type | Input 3 contact type |
| 10: Activate / deactivate functions ALL ON/ALL OFF | Flush 1 relay module responds to commands ALL ON / ALL OFF that may be sent by the main co... |
| 11: Automatic turning off relay after set time | When relay is ON it goes automatically OFF after time defined by this parameter. Timer is ... |
| 12: Automatic turning on relay after set time | When relay is OFF it goes automatically ON after time defined by this parameter. Timer is ... |
| 15: Automatic turning off / on seconds or milliseconds selection | NOTE: Parameter is the same for turning OFF or ON. |
| 30: Saving the state of the relay after a power failure | Saving the state of the relay after a power failure |
| 40: Power reporting in Watts on power change | 0 – Reporting Disabled 1 – 100 = 1% - 100% Reporting enabled Power report is send (push) o... |
| 42: Power reporting in Watts on power change | Set value means time interval (0 – 32535) in seconds, when power report is send. Default v... |
| 63: Output Switch selection | Set value means the type of the device that is connected to the output. The device type ca... |
| 100: Enable / Disable Endpoints I2 or select Notification Type and Event | Enabling I2 means that Endpoint (I2) will be present on UI. Disabling it will result in hi... |
| 101: Enable / Disable Endpoints I3 or select Notification Type and Event | Enabling I3 means that Endpoint (I3) will be present on UI. Disabling it will result in hi... |
| 110: Temperature sensor offset settings | Set value is added or subtracted to actual measured value by sensor. 32536 – offset is 0.0... |
| 120: Digital temperature sensor reporting | If digital temperature sensor is connected, module reports measured temperature on tempera... |
| 1: Lifeline to Controller (reserved for communication with the main contr |  |
| 2: Basic on/off (triggered at change of the input Q state and reflectin |  |
| 3: Basic on/off (triggered at change of the input I2 state and reflecti |  |
| 4: Notification report (triggered at change of the input I2 state and r |  |
| 5: Binary Sensor (triggered at change of the input I2 state and reflect |  |
| 6: Basic on/off (triggered at change of the input I3 state and reflecti |  |
| 7: Notification report (triggered at change of the input I3 state and re |  |
| 8: Binary Sensor report(triggered at change of the input I3 state and r |  |
| 9: Multilevel Sensor report (triggered at change of temperature sensor) |  |


#### 1: Input 1 switch type

Input 1 switch type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | mono-stable switch type (push button) (0) |
|  | bi-stable switch type (1) |


#### 2: Input 2 contact type

Input 2 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NO (normaly open) input type (0) |
|  | NC (normaly close) input type (1) |


#### 3: Input 3 contact type

Input 3 contact type


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | NO (normaly open) input type (0) |
|  | NC (normaly close) input type (1) |


#### 10: Activate / deactivate functions ALL ON/ALL OFF

Flush 1 relay module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON is not active ALL OFF is not active (0) |
|  | ALL ON is not active ALL OFF active (1) |
|  | ALL ON active ALL OFF is not active (2) |
|  | ALL ON active, ALL OFF active (255) |


#### 11: Automatic turning off relay after set time

When relay is ON it goes automatically OFF after time defined by this parameter. Timer is reset to zero each time the module receive ON command regardless from where it comes (push button, associated module, controller,..). 0 - Auto OFF disabled. 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 12: Automatic turning on relay after set time

When relay is OFF it goes automatically ON after time defined by this parameter. Timer is reset to zero each time the module receive OFF command regardless from where it comes (push button, associated module, controller,..). 0 - Auto ON disabled. 1 –


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 15: Automatic turning off / on seconds or milliseconds selection

NOTE: Parameter is the same for turning OFF or ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Seconds selected (0) |
|  | Milliseconds selected (1) |


#### 30: Saving the state of the relay after a power failure

Saving the state of the relay after a power failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Flush 1relay module saves its state before power failure (it returns t (0) |
|  | Flush 1relay module does not save the state after a power failure, it (1) |


#### 40: Power reporting in Watts on power change

0 – Reporting Disabled 1 – 100 = 1% - 100% Reporting enabled Power report is send (push) only when actual power in Watts in real time change for more than set percentage comparing to previous actual power in Watts, step is 1%. NOTE: If power chan


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 10 |


#### 42: Power reporting in Watts on power change

Set value means time interval (0 – 32535) in seconds, when power report is send. Default value 300 (power report in Watts is send each 300s) 0 – Reporting Disabled 1 – 32535 = 1second – 32535 seconds. Reporting enabled. Power report is send with time


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 300 |


#### 63: Output Switch selection

Set value means the type of the device that is connected to the output. The device type can be normally open (NO) or normally close (NC).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_63_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | When system is turned off the output is 0V (NC). (0) |
|  | When system is turned off the output is 230V or 24V (NO). (1) |


#### 100: Enable / Disable Endpoints I2 or select Notification Type and Event

Enabling I2 means that Endpoint (I2) will be present on UI. Disabling it will result in hiding the endpoint according to the parameter set value. Additionally, a Notification Type and Event can be selected for the endpoint. Endpoint device type selec


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_100_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Endpoint, I2 disabled (0) |
|  | Home Security; Motion Detection, unknown loc. (1) |
|  | Carbon Monoxide; Carbon Monoxide detected, unknown location. (2) |
|  | Carbon Dioxide; Carbon Dioxide detected, unknown location. (3) |
|  | Water Alarm; Water Leak detected, unknown lo.. (4) |
|  | Heat Alarm; Overheat detected, unknown loc. (5) |
|  | Smoke Alarm; Smoke detected, unknown loc. (6) |
|  | Sensor binary. (9) |


#### 101: Enable / Disable Endpoints I3 or select Notification Type and Event

Enabling I3 means that Endpoint (I3) will be present on UI. Disabling it will result in hiding the endpoint according to the parameter set value. Additionally, a Notification Type and Event can be selected for the endpoint. Endpoint device type selec


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_101_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Endpoint, I3 disabled (0) |
|  | Home Security; Motion Detection, unknown loc. (1) |
|  | Carbon Monoxide; Carbon Monoxide detected, unknown location. (2) |
|  | Carbon Dioxide; Carbon Dioxide detected, unknown location. (3) |
|  | Water Alarm; Water Leak detected, unknown lo.. (4) |
|  | Heat Alarm; Overheat detected, unknown loc. (5) |
|  | Smoke Alarm; Smoke detected, unknown loc. (6) |
|  | Sensor binary. (9) |


#### 110: Temperature sensor offset settings

Set value is added or subtracted to actual measured value by sensor. 32536 – offset is 0.0C From 1 to 100–value from 0.1°C to 10.0°C is added to actual measured temperature. From 1001 to 1100 – value from -0.1 °C to -10.0 °C is subtracted to actual mea


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_110_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 32536 |


#### 120: Digital temperature sensor reporting

If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter.0 – Reporting disabled1- 127 = 0,1°C – 12,7°C, step is 0,1°C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_120_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 5 |


#### 1: Lifeline to Controller (reserved for communication with the main contr


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Basic on/off (triggered at change of the input Q state and reflectin


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Basic on/off (triggered at change of the input I2 state and reflecti


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Notification report (triggered at change of the input I2 state and r


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Binary Sensor (triggered at change of the input I2 state and reflect


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: Basic on/off (triggered at change of the input I3 state and reflecti


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


#### 7: Notification report (triggered at change of the input I3 state and re


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_7 |
| Data Type        | TEXT |
| Range |  to  |


#### 8: Binary Sensor report(triggered at change of the input I3 state and r


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_8 |
| Data Type        | TEXT |
| Range |  to  |


#### 9: Multilevel Sensor report (triggered at change of temperature sensor)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_9 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/206).
