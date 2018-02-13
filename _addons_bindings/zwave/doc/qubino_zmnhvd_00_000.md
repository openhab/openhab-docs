---
layout: documentation
title: ZMNHVD - ZWave
---

{% include base.html %}

# ZMNHVD Flush Dimmer 0-10V

This describes the Z-Wave device *ZMNHVD*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhvd_00_000```. 

Flush Dimmer 0-10V


## Channels
The following table summarises the channels available for the ZMNHVD Flush Dimmer 0-10V.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Sensor (general) | sensor_general | sensor_general |  | Number |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZMNHVD Flush Dimmer 0-10V.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input 1 Switch Type | By this parameter the user can set input based on device type (switch, potentiometer, 0-10... |
| 11: Automatic turning off output after set time |  |
| 12: Automatic turning on output after set time |  |
| 21: Enable/Disable Double click function |  |
| 30: Saving the state of the device after a power failure |  |
| 52: Auto or manual selection |  |
| 53: PID value inside deadband |  |
| 54: PID deadband |  |
| 55: Integral sampling time |  |
| 56: P parameter |  |
| 57: I parameter |  |
| 58: D parameter | Available config. parameters (data type is2 Byte DEC): |
| 60: Minimum dimming value |  |
| 61: Maximum dimming value |  |
| 65: Dimming time (soft on/off) |  |
| 66: Dimming time when key pressed |  |
| 67: Ignore start level |  |
| 68: Dimming duration |  |
| 110: Temperature sensor offset settings |  |
| 120: Digital temperature sensor reporting |  |
| 140: Input I1 Sensor reporting |  |
| 141: Input I1 0-10V reporting threshold |  |
| 143: Minimum sensor range value |  |
| 144: Maximum sensor range value |  |
| 1: Lifeline | Reserved for communication with the main controller |
| 2: basic on/off | triggered at change of the input I1 state and reflecting its state |
| 3: start level change/stop level change | triggered at change of the input I1 state and reflecting its state) up to 16 nodes. Workin... |
| 4: multilevel set | triggered at changes of state/value of the Flush Dimmer 0-10V |
| 5: multilevel sensor report | triggered at change of analogue sensor |
| 6: multilevel sensor report | triggered at change of temperature sensor |


#### 1: Input 1 Switch Type

By this parameter the user can set input based on device type (switch, potentiometer, 0-10V sensor,...)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | mono-stable switch type (push button) (0) |
|  | Bi-stable switch type (1) |
|  | Potentiometer (2) |
|  | Temperature sensor (3) |
|  | Illumination sensor (4) |
|  | General purpose sensor (5) |


#### 11: Automatic turning off output after set time


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 0 to 32536 |
| Default Value | 0 |


#### 12: Automatic turning on output after set time


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 32535 |
| Default Value | 0 |


#### 21: Enable/Disable Double click function


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 30: Saving the state of the device after a power failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 52: Auto or manual selection


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_52_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 53: PID value inside deadband


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_53_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 54: PID deadband


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_54_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 1 |


#### 55: Integral sampling time


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_55_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 5 |


#### 56: P parameter


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_56_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 100 |


#### 57: I parameter


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_57_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 1 |


#### 58: D parameter

Available config. parameters (data type is2 Byte DEC):


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_58_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 1 |


#### 60: Minimum dimming value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_60_1 |
| Data Type        | INTEGER |
| Range | 1 to 98 |
| Default Value | 1 |


#### 61: Maximum dimming value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_61_1 |
| Data Type        | INTEGER |
| Range | 2 to 99 |
| Default Value | 99 |


#### 65: Dimming time (soft on/off)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_65_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 100 |


#### 66: Dimming time when key pressed


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_66_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 3 |


#### 67: Ignore start level


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_67_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 68: Dimming duration


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_68_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 110: Temperature sensor offset settings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_110_2 |
| Data Type        | INTEGER |
| Range | 1 to 32536 |
| Default Value | 32536 |


#### 120: Digital temperature sensor reporting


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_120_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 140: Input I1 Sensor reporting


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_140_2 |
| Data Type        | INTEGER |
| Range | 0 to 140 |
| Default Value | 5 |


#### 141: Input I1 0-10V reporting threshold


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_141_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 5 |


#### 143: Minimum sensor range value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_143_2 |
| Data Type        | INTEGER |
| Range | 0 to 20000 |
| Default Value | 0 |


#### 144: Maximum sensor range value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_144_2 |
| Data Type        | INTEGER |
| Range | 0 to 20000 |
| Default Value | 1000 |


#### 1: Lifeline

Reserved for communication with the main controller


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: basic on/off

triggered at change of the input I1 state and reflecting its state


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: start level change/stop level change

triggered at change of the input I1 state and reflecting its state) up to 16 nodes. Working only when the Parameter no. 1 is set to mono stable switch type.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: multilevel set

triggered at changes of state/value of the Flush Dimmer 0-10V


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: multilevel sensor report

triggered at change of analogue sensor


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: multilevel sensor report

triggered at change of temperature sensor


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/363).
