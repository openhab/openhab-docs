---
layout: documentation
title: ZMNHND - ZWave
---

{% include base.html %}

# ZMNHND Flush 1D relay

This describes the Z-Wave device *ZMNHND*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhnd_00_000```. 

Flush 1D relay


## Channels
The following table summarises the channels available for the ZMNHND Flush 1D relay.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Sensor Binary | sensor_binary2 | sensor_binary | Door | Switch |
| Sensor (temperature) 2 | sensor_temperature2 | sensor_temperature | Temperature | Number |
| Burglar | alarm_burglar2 | alarm_burglar | Door | Switch |


### Sensor (temperature)

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Sensor (temperature) 2

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZMNHND Flush 1D relay.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input 1 switch type | Input 1 switch type |
| 2: Input 2 contact type | Input 2 contact type |
| 10: Activate / deactivate functions ALL ON/ALL OFF | Flush 1D relay module responds to commands ALL ON / ALL OFF that may be sent by the main c... |
| 11: Automatic turning off relay after set time | When relay is ON it goes automatically OFF after time defined by this parameter. Timer is ... |
| 12: Automatic turning on relay after set time | When relay is OFF it goes automatically ON after time defined by this parameter. Timer is ... |
| 15: Automatic turning off / on seconds or milliseconds selection | NOTE: Parameter is the same for turning OFF or ON. |
| 30: Saving the state of the relay after a power failure | Saving the state of the relay after a power failure |
| 63: Output Switch selection | Set value means the type of the device that is connected to the output. The device type ca... |
| 100: Enable / Disable Endpoints I2 or select Notification Type and Event | Enabling I2 means that Endpoint (I2) will be present on UI. Disabling it will result in hi... |
| 110: Temperature sensor offset settings | Set value is added or subtracted to actual measured value by sensor. 32536 – offset is 0.0... |
| 120: Digital temperature sensor reporting | If digital temperature sensor is connected, module reports measured temperature on tempera... |
| 1: Lifeline to Controller (reserved for communication with the main contr |  |
| 2: Basic on/off (triggered at change of the input Q state and reflectin |  |
| 3: Basic on/off (triggered at change of the input I2 state and reflecti |  |
| 4: Notification report (triggered at change of the input I2 state and r |  |
| 5: Binary Sensor (triggered at change of the input I2 state and reflect |  |
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


#### 10: Activate / deactivate functions ALL ON/ALL OFF

Flush 1D relay module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.


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
| Options | Flush 1D relay module saves its state before power failure (it returns (0) |
|  | Flush 1D relay module does not save the state after a power failure, i (1) |


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


#### 110: Temperature sensor offset settings

Set value is added or subtracted to actual measured value by sensor. 32536 – offset is 0.0C From 1 to 100–value from 0.1°C to 10.0°C is added to actual measured temperature. From 1001 to 1100 – value from -0.1 °C to -10.0 °C is subtracted to actual mea


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_110_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 32536 |


#### 120: Digital temperature sensor reporting

If digital temperature sensor is connected, module reports measured temperature on temperature change defined by this parameter. 0 – Reporting disabled 1- 127 = 0,1°C – 12,7°C, step is 0,1°C


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_120_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
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


#### 9: Multilevel Sensor report (triggered at change of temperature sensor)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_9 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/207).
