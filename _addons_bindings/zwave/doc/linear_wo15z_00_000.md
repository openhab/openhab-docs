---
layout: documentation
title: WO15Z - ZWave
---

{% include base.html %}

# WO15Z Single Wall Outlet

This describes the Z-Wave device *WO15Z*, manufactured by *Linear Corp* with the thing type UID of ```linear_wo15z_00_000```. 

Single Wall Outlet


## Channels
The following table summarises the channels available for the WO15Z Single Wall Outlet.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Scene Number | scene_number | scene_number |  | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the WO15Z Single Wall Outlet.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: Night Light | By default, the blue LED on the WO15Z-1 will turn ON when the load attached is turned ON. ... |


#### 3: Night Light

By default, the blue LED on the WO15Z-1 will turn ON when the load attached is turned ON. To make the LED turn OFF when the load attached is turned ON, set Parameter 3 to a value of 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | On when load is on (0) |
|  | Off when load is on (1) |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/12).
