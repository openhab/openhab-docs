---
layout: documentation
title: WV-01 - ZWave
---

{% include base.html %}

# WV-01 Wireless Z-Wave Water Valve

This describes the Z-Wave device *WV-01*, manufactured by *FortrezZ LLC* with the thing type UID of ```fortrezz_wv01_00_000```. 

Wireless Z-Wave Water Valve


## Channels
The following table summarises the channels available for the WV-01 Wireless Z-Wave Water Valve.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the WV-01 Wireless Z-Wave Water Valve.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 0: Mode |  |
| 1: WaterLevel Timeout |  |


#### 0: Mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_0_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Alarm Mode (0) |
|  | Level Mode (255) |


#### 1: WaterLevel Timeout


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 60 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/368).
