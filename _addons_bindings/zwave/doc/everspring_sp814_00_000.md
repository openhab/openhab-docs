---
layout: documentation
title: SP814 - ZWave
---

{% include base.html %}

# SP814 Motion Detector

This describes the Z-Wave device *SP814*, manufactured by *Everspring* with the thing type UID of ```everspring_sp814_00_000```. 

Motion Detector


## Channels
The following table summarises the channels available for the SP814 Motion Detector.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the SP814 Motion Detector.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set Level | Basic Set Level |
| 2: Enable/Disable Detecting | The Detecting function can be Disabled or Enabled. |
| 3: Sensitivity Level | 1 Means lowest sensitivity and 10 means highest. |
| 4: Re-trigger Interval | Adjust the interval of being re-triggered after a trigger |
| 5: Lux Level | Minimum Lux Level to provoke trigger |
| 6: On-Off Duration | On-Off Duration |
| 1: Reports |  |
| 2: Control |  |


#### 1: Basic Set Level

Basic Set Level  


##### Overview 

When Basic Set Command is sent where contains a value, the receiver will take it for consideration; for instance, if a lamp module is received the Basic Set command of which value is decisive as to how bright of dim level of lamp module shall be.

Example: 0: OFF

1-99: ON (Binary Switch Device)

Dim Level (Multilevel Switch Device)

Function: Basic Set level

Parameter: 1

Number Size: 1

Range: 0-99

Default: 99 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 99 |


#### 2: Enable/Disable Detecting

The Detecting function can be Disabled or Enabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disabled (0) |
|  | Enabled (1) |


#### 3: Sensitivity Level

1 Means lowest sensitivity and 10 means highest.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 10 |
| Default Value | 6 |


#### 4: Re-trigger Interval

Adjust the interval of being re-triggered after a trigger  


##### Overview 

The Configuration parameter that can be used to adjust the interval of being re-triggered after the detector has been triggered as Configuration Parameter \#4. No response will be made during this interval if a movement is presented. The time interval can be set between 5 secs to 3600 secs. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 5 to 3600 |
| Default Value | 5 |


#### 5: Lux Level

Minimum Lux Level to provoke trigger  


##### Overview 

Sets minimum Lux Level of ambient illumination necessary for Motion Detector to trigger.

The user can set a detecting percentage of lux level which determines when the light sensor will be activated. If percentage of lux level of ambient illumination falls below this percentage, and a person moves across or within the protected area, the detector will emit Z-Wave ON Command (i.e. Basic Set Command (Value = Basic Set Level)) to controller and activate connected modules and lighting. Percentage can be set between 1% to 100%.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 10 |


#### 6: On-Off Duration

On-Off Duration  


##### Overview 

The function of on-off duration setting will be useful if the detector is connected with a module or lighting. The duration determines how long the module/lighting should stay ON. For instance, Lamp Module turns off 100 secs after it has been turned on. This parameter can be configured with the value of 5 through 3600, where 5 means 5 second delay and 3600 means 3600 seconds of delay


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 5 to 255 |
| Default Value | 5 |


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/30).
