---
layout: documentation
title: TZDW-100 - ZWave
---

{% include base.html %}

# TZDW-100 Door/window sensor

This describes the Z-Wave device *TZDW-100*, manufactured by *Telldus Technologies AB* with the thing type UID of ```telldus_tzdw100_00_000```. 

Door/window sensor


## Channels
The following table summarises the channels available for the TZDW-100 Door/window sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door Sensor | sensor_door | sensor_door | Door | Contact |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the TZDW-100 Door/window sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1:  | Select what type of command to be sent to nodes in association group 2 |
| 2:  | Select what value that should be sent to association group 2 |
| 3:  | Type of commands to association group 2 |
| 4:  | Select what type of command to be sent to nodes in association group 3 |
| 5:  | Select what value that should be sent to association group 3 |
| 6:  | Type of commands to association group 3 |
| 7:  | LED-Indicator |
| 8:  | Select the type of command to be sent in the Lifeline |
| 1: Lifeline | Lifeline - Sensor status |
| 2: Status | Sensor status |
| 3: Status | Sensor status |


#### 1: 

Select what type of command to be sent to nodes in association group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Basic (0) |
|  | Switch Binary (1) |
|  | Switch All (2) |
|  | Switch Multilevel (3) |


#### 2: 

Select what value that should be sent to association group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 63 || Default Value | 255 |
| Options | Last value (255) |


#### 3: 

Type of commands to association group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Normal (0) |
|  | Inverted (1) |


#### 4: 

Select what type of command to be sent to nodes in association group 3


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Basic (0) |
|  | Switch Binary (1) |
|  | Switch All (2) |
|  | Switch Multilevel (3) |


#### 5: 

Select what value that should be sent to association group 3


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 63 || Default Value | 255 |
| Options | Last value (255) |


#### 6: 

Type of commands to association group 3


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Normal (0) |
|  | Inverted (1) |


#### 7: 

LED-Indicator


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Off (0) |
|  | On (1) |


#### 8: 

Select the type of command to be sent in the Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Notification (0) |
|  | Sensor binary (1) |


#### 1: Lifeline

Lifeline - Sensor status


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Status

Sensor status


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Status

Sensor status


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/312).
