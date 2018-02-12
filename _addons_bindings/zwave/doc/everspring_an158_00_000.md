---
layout: documentation
title: AN158 - ZWave
---

{% include base.html %}

# AN158 Switch Meter Plugin

This describes the Z-Wave device *AN158*, manufactured by *Everspring* with the thing type UID of ```everspring_an158_00_000```. 

Switch Meter Plugin


## Channels
The following table summarises the channels available for the AN158 Switch Meter Plugin.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Reset the meter | meter_reset | meter_reset | Energy | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the AN158 Switch Meter Plugin.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: True Period | This is the time the switching status needs to remain unchanged after a change to cause th... |
| 2: Send Out Basic Command | Enable or Disable the status message function when the local button press changes the swit... |
| 3: Meter Report Period | The device will report its meter value within the interval set. Set to 0 will disable the ... |
| 1: Reports |  |
| 2: Control |  |


#### 1: True Period

This is the time the switching status needs to remain unchanged after a change to cause the device to send out a status message


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 254 |
| Default Value | 10 |


#### 2: Send Out Basic Command

Enable or Disable the status message function when the local button press changes the switching state.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disabled (0) |
|  | Enabled (1) |


#### 3: Meter Report Period

The device will report its meter value within the interval set. Set to 0 will disable the autoreporting function.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 3240 |
| Default Value | 3 |


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
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/27).
