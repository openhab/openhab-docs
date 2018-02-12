---
layout: documentation
title: WAPIRZ-1 - ZWave
---

{% include base.html %}

# WAPIRZ-1 PIR Motion Detector

This describes the Z-Wave device *WAPIRZ-1*, manufactured by *Linear Corp* with the thing type UID of ```linear_wapirz_00_000```. 

PIR Motion Detector


## Channels
The following table summarises the channels available for the WAPIRZ-1 PIR Motion Detector.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
|  | battery-level | system.battery-level |  |  |


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
The following table provides a summary of the configuration parameters available in the WAPIRZ-1 PIR Motion Detector.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Re-trigger Wait Time | Re-trigger Wait Time |
| 1: Group 1 |  |


#### 1: Re-trigger Wait Time

Re-trigger Wait Time  


##### Overview 

By default, to conserve battery life, after the WAPIRZ-1 detects motion it cannotbe re-triggered by motion again for 3 minutes. Each time motion is detected(even during this wait time) the 3 minute timer starts over.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 3 |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/5).
