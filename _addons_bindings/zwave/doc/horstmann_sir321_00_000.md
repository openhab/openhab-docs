---
layout: documentation
title: SIR-321 - ZWave
---

{% include base.html %}

# SIR-321 RF Countdown Timer

This describes the Z-Wave device *SIR-321*, manufactured by *Horstmann Controls Limited* with the thing type UID of ```horstmann_sir321_00_000```. 

RF Countdown Timer  


## Overview 

Wirelessly controllable 3 KW wall switch timer function


## Channels
The following table summarises the channels available for the SIR-321 RF Countdown Timer.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Temperature | sensor_temperature | sensor_temperature | Temperature | Number |


### Temperature

#### Scale

Select the scale for temperature readings


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_scale |
| Data Type        | TEXT || Default Value | 0 |
| Options | Celsius (0) |
|  | Fahrenheit (1) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the SIR-321 RF Countdown Timer.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Fail Save timer | Enable/Disable the Fail save timer |
| 2: Temperature Scale | Set the Temperatur scale to Celsius |
| 3: Temperature reporting intervals | Define the time interval for the temperature report that is sent. |
| 4: Delta configuration temperature reporting | Set the delta-configuration of the temperature report in Celsius or Fahrenheit |
| 5: Temperature Cutoff | Set the Cutoff in Celsius |
| 1: Group 1 | Group 1 |
| 2: Group 2 | Group 2 |


#### 1: Fail Save timer

Enable/Disable the Fail save timer


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 2: Temperature Scale

Set the Temperatur scale to Celsius


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 3: Temperature reporting intervals

Define the time interval for the temperature report that is sent.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 0 |


#### 4: Delta configuration temperature reporting

Set the delta-configuration of the temperature report in Celsius or Fahrenheit


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 0 |


#### 5: Temperature Cutoff

Set the Cutoff in Celsius


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 0 |


#### 1: Group 1

Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

Group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/313).
