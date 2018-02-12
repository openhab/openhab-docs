---
layout: documentation
title: ZMNHAA - ZWave
---

{% include base.html %}

# ZMNHAA Flush 1 relay

This describes the Z-Wave device *ZMNHAA*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhaa_00_000```. 

Flush 1 relay


## Channels
The following table summarises the channels available for the ZMNHAA Flush 1 relay.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Binary Sensor 1 | sensor_binary1 | sensor_binary | Door | Switch |
| Binary Sensor 2 | sensor_binary2 | sensor_binary | Door | Switch |


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
The following table provides a summary of the configuration parameters available in the ZMNHAA Flush 1 relay.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input 1 switch type | Input 1 switch type |
| 2: Input 2 contact type | Input 2 contact type |
| 3: Input 3 contact type | Input 3 contact type |
| 10: Activate / deactivate functions ALL ON/ALL OFF | Flush 1 relay module responds to commands ALL ON / ALL OFF that may be sent by the main co... |
| 11: Automatic turning off relay after set time | 0 - Auto OFF disabled 1 – 65535 = 0,01second – 655,35 seconds Auto OFF enabled with define... |
| 30: Saving the state of the relay after a power failure | Saving the state of the relay after a power failure |
| 40: Power reporting in Watts on power change | 0 – Reporting Disabled 1 – 100 = 1% - 100% Reporting enabled Power report is send (push) o... |
| 42: Power reporting in Watts on power change | default value 300 (power report in Watts is send each 300s) 0 – Reporting Disabled 1 – 655... |
| 1: basic on/off (triggered at change of the output Q state and reflecti |  |
| 2: basic on/off (triggered at change of the input I2 state and reflect |  |
| 3: basic on/off (triggered at change of the input I3 state and reflect |  |
| 4: Controller Updates |  |


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

0 - Auto OFF disabled 1 – 65535 = 0,01second – 655,35 seconds Auto OFF enabled with define time, step is 10mseconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 30: Saving the state of the relay after a power failure

Saving the state of the relay after a power failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Flush 1relay module saves its state before power failure (it returns t (0) |
|  | Flush 1relay module does not save the state after a power failure, it (1) |


#### 40: Power reporting in Watts on power change

0 – Reporting Disabled 1 – 100 = 1% - 100% Reporting enabled Power report is send (push) only when actual power in Watts in real time change for more than set percentage comparing to previous actual power in Watts, step is 1%. NOTE: if power chan


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 3 |


#### 42: Power reporting in Watts on power change

default value 300 (power report in Watts is send each 300s) 0 – Reporting Disabled 1 – 65535 = 1second – 65535 seconds. Reporting enabled. Power report is send with time interval set by entered value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 300 |


#### 1: basic on/off (triggered at change of the output Q state and reflecti


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: basic on/off (triggered at change of the input I2 state and reflect


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: basic on/off (triggered at change of the input I3 state and reflect


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Controller Updates


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/205).
