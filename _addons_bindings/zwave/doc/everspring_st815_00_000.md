---
layout: documentation
title: ST815 - ZWave
---

{% include base.html %}

# ST815 Illumination Sensor

This describes the Z-Wave device *ST815*, manufactured by *Everspring* with the thing type UID of ```everspring_st815_00_000```. 

Illumination Sensor


## Channels
The following table summarises the channels available for the ST815 Illumination Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ST815 Illumination Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set Level | Basic Set Level |
| 2: Lux Trigger On Value | Lux Trigger On Value |
| 3: Lux Trigger Off Value |  |
| 4: Lux Trigger Off Timer Value. | Lux Trigger Off Timer Value. |
| 5: Auto Report Time Interval | Auto Report Time Interval |
| 6: Auto Report Lux Interval | Auto Report Lux Interval |
| 1: Reports |  |
| 2: Control |  |


#### 1: Basic Set Level

Basic Set Level  


##### Overview 

Set basic set value to be on or off.

Set to 0 to disable


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 99 |


#### 2: Lux Trigger On Value

Lux Trigger On Value  


##### Overview 

Lux level when ON command is sent out.

Set to 0 to disable.

Valid values - 30-1000 or 0

Default 30


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 300 |


#### 3: Lux Trigger Off Value

  


##### Overview 

Lux level when Off command is sent out.

Values 30-1000 or 0

Default 500

Set to 0 to disable.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 500 |


#### 4: Lux Trigger Off Timer Value.

Lux Trigger Off Timer Value.  


##### Overview 

Timer value in minutes.

Values : 1-480 or 0

Default 240

Set to 0 to disable.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 0 to 480 |
| Default Value | 0 |


#### 5: Auto Report Time Interval

Auto Report Time Interval  


##### Overview 

Time interval in minutes to auto report to association group 1

Valid values 1-1439 minutes or 0

Set to 0 to Disable


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 0 to 1439 |
| Default Value | 0 |


#### 6: Auto Report Lux Interval

Auto Report Lux Interval  


##### Overview 

Lux interval step size to auto report to association group 1

Valid Values 30-1000 (Lux)

Set to 0 to Disable


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 0 to 1000 |
| Default Value | 0 |


#### 1: Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Control


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/32).
