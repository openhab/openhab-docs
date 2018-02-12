---
layout: documentation
title: PAN06 - ZWave
---

{% include base.html %}

# PAN06 In Wall Dual Relay(1 Way) Switch Module 2x 1.5kW

This describes the Z-Wave device *PAN06*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pan06_00_000```. 

In Wall Dual Relay(1 Way) Switch Module 2x 1.5kW


## Channels
The following table summarises the channels available for the PAN06 In Wall Dual Relay(1 Way) Switch Module 2x 1.5kW.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |
| Switch 3 | switch_binary3 | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the PAN06 In Wall Dual Relay(1 Way) Switch Module 2x 1.5kW.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Selected endpoint | If Controller not using Multi\_Channel command class to access the endpoint of PAN06, you ... |
| 2: Switch mode | Change the external switch mode |
| 1: Relay 1 + 2 |  |
| 2: Relay 1 |  |
| 3: Relay 2 |  |


#### 1: Selected endpoint

If Controller not using Multi\_Channel command class to access the endpoint of PAN06, you may configure the endpoint value to react the Basic Command Class


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Relay 1 + 2 (1) |
|  | Relay 1 (2) |
|  | Relay 2 (3) |


#### 2: Switch mode

Change the external switch mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Edge mode (1) |
|  | Pulse mode (2) |
|  | Edge-Toggle mode (3) |


#### 1: Relay 1 + 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Relay 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Relay 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/173).
