---
layout: documentation
title: ZWN-BPC - ZWave
---

{% include base.html %}

# ZWN-BPC PIR Sensor

This describes the Z-Wave device *ZWN-BPC*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zwnbpc_00_000```. 

PIR Sensor


## Channels
The following table summarises the channels available for the ZWN-BPC PIR Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZWN-BPC PIR Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 0: Off time | Sets the number of minutes to wait to send the OFF command, after triggering the sensor. |
| 1: Reports |  |


#### 0: Off time

Sets the number of minutes to wait to send the OFF command, after triggering the sensor.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_0_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 1: Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/186).
