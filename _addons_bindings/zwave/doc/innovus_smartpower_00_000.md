---
layout: documentation
title: SmartPower - ZWave
---

{% include base.html %}

# SmartPower RAone SmartPower

This describes the Z-Wave device *SmartPower*, manufactured by *INNOVUS* with the thing type UID of ```innovus_smartpower_00_000```. 

RAone SmartPower


## Channels
The following table summarises the channels available for the SmartPower RAone SmartPower.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Sensor (power) | sensor_power | sensor_power | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the SmartPower RAone SmartPower.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Report node | Report changes in level to this node id |
| 2: BO IR support | Enable/Disable BO IR Support |
| 1: Switch |  |


#### 1: Report node

Report changes in level to this node id  


##### Overview 

Report Node, reports changes in level to this node id.

Disabled if 0. -> Copied from SmartDimmer, as there's no config information available.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 2: BO IR support

Enable/Disable BO IR Support  


##### Overview 

BO IR support is disabled if 0 otherwise enabled. -> Copied from SmartDimmer, as there's no config information available.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | disabled (0) |
|  | enabled (1) |


#### 1: Switch


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/61).
