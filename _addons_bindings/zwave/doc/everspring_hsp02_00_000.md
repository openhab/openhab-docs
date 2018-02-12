---
layout: documentation
title: HSP02 - ZWave
---

{% include base.html %}

# HSP02 Motion Detector

This describes the Z-Wave device *HSP02*, manufactured by *Everspring* with the thing type UID of ```everspring_hsp02_00_000```. 

Motion Detector


## Channels
The following table summarises the channels available for the HSP02 Motion Detector.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the HSP02 Motion Detector.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set Level | Value to be sent with a BASIC SET command |
| 2: Sensor Detecting Function |  |
| 3: Sensitivity Level |  |
| 4: Re-trigger Interval Setting |  |
| 5: LUX Level | Value for what LUX level will arm the detection sensor |
| 6: On-Off Duration |  |
| 1: Target for reports |  |
| 2: Target nodes who receive BASIC_SET command |  |


#### 1: Basic Set Level

Value to be sent with a BASIC SET command


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 99 |


#### 2: Sensor Detecting Function


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Group 1 Enabled / Group 2 Enabled (1) |
|  | Group 1 Enabled / Group 2 Disabled (2) |
|  | Group 1 Disabled / Group 2 Disabled (3) |


#### 3: Sensitivity Level


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 10 |
| Default Value | 6 |


#### 4: Re-trigger Interval Setting


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 5 to 255 |
| Default Value | 180 |


#### 5: LUX Level

Value for what LUX level will arm the detection sensor


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 10 |


#### 6: On-Off Duration


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 5 to 255 |
| Default Value | 15 |


#### 1: Target for reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Target nodes who receive BASIC_SET command


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/22).
