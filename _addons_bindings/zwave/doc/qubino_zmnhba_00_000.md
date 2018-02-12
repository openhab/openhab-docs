---
layout: documentation
title: ZMNHBA - ZWave
---

{% include base.html %}

# ZMNHBA Flush 2 relays

This describes the Z-Wave device *ZMNHBA*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhba_00_000```. 

Flush 2 relays


## Channels
The following table summarises the channels available for the ZMNHBA Flush 2 relays.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number |
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |
| Electric meter (kWh) 2 | meter_kwh2 | meter_kwh | Energy | Number |
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number |


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
The following table provides a summary of the configuration parameters available in the ZMNHBA Flush 2 relays.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input 1 switch type | Input 1 switch type |
| 2: Input 2 switch type | Input 2 switch type |
| 10: Activate / deactivate functions ALL ON/ALL OFF | Activate / deactivate functions ALL ON/ALL OFF |
| 11: Automatic turning off relay Q1 after set time | Automatic turning off relay Q1 after set time |
| 12: Automatic turning off relay Q2 after set time | Automatic turning off relay Q2 after set time |
| 30: Saving Q1 and Q2 after a power failure | Saving the state of the relays Q1 and Q2 after a power failure |
| 40: Power reporting in Watts on power change for Q1 | Power report is sent (pushed) only when actual power in Watts in real time changed for mor... |
| 41: Power reporting in Watts on power change for Q2 | Power report is sent (pushed) only when actual power in Watts in real time changed for mor... |
| 42: Power reporting in Watts by time interval for Q1 | default value is 300 (power report in Watts is sent each 300s) |
| 43: Power reporting in Watts by time interval for Q2 | default value is 300 (power report in Watts is sent each 300s) |
| 1: Basic on/off Q1 |  |
| 2: Basic on/off Q2 |  |
| 3: Default Reporting Group |  |


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


#### 10: Activate / deactivate functions ALL ON/ALL OFF

Activate / deactivate functions ALL ON/ALL OFF  


##### Overview 

Flush 1 relay module responds to commands ALL ON / ALL OFF that may be sent by the main controller or by other controller belonging to the system.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON is not active ALL OFF is not active (0) |
|  | ALL ON is not active ALL OFF active (1) |
|  | ALL ON active ALL OFF is not active (2) |
|  | ALL ON active, ALL OFF active (255) |


#### 11: Automatic turning off relay Q1 after set time

Automatic turning off relay Q1 after set time  


##### Overview 

Auto OFF enabled with define time, step is 10 mseconds

 *  0 = Auto OFF disabled
 *  1–65535 = 0,01 second – 655,35 seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 12: Automatic turning off relay Q2 after set time

Automatic turning off relay Q2 after set time  


##### Overview 

Auto OFF enabled with define time, step is 10 mseconds

 *  0 = Auto OFF disabled
 *  1–65535 = 0,01 second – 655,35 seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 30: Saving Q1 and Q2 after a power failure

Saving the state of the relays Q1 and Q2 after a power failure


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Flush 2 relays module saves its state before power failure (it returns (0) |
|  | Flush 2 relays module does not save the state after a power failure, i (1) |


#### 40: Power reporting in Watts on power change for Q1

Power report is sent (pushed) only when actual power in Watts in real time changed for more than set percentage comparing to previous actual power in Watts, step is 1%.  


 *  0 = Reporting Disabled
 *  1–100 = 1% - 100% Reporti


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_40_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 41: Power reporting in Watts on power change for Q2

Power report is sent (pushed) only when actual power in Watts in real time changed for more than set percentage comparing to previous actual power in Watts, step is 1%.  


 *  0 = Reporting Disabled
 *  1–100 = 1% - 100% Reporti


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_41_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 42: Power reporting in Watts by time interval for Q1

default value is 300 (power report in Watts is sent each 300s)  


 *  0 = Reporting Disabled
 *  1–65535 = 1 second – 65535 seconds. Reporting enabled. Power report is sent with time interval set by entered value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_42_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 300 |


#### 43: Power reporting in Watts by time interval for Q2

default value is 300 (power report in Watts is sent each 300s)  


 *  0 = Reporting Disabled
 *  1–65535 = 1 second – 65535 seconds. Reporting enabled. Power report is sent with time interval set by entered value.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_43_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 300 |


#### 1: Basic on/off Q1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Basic on/off Q2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Default Reporting Group


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/208).
