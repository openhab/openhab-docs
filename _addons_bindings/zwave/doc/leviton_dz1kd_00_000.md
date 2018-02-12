---
layout: documentation
title: DZ1KD - ZWave
---

{% include base.html %}

# DZ1KD 1000W Dimmer

This describes the Z-Wave device *DZ1KD*, manufactured by *Leviton* with the thing type UID of ```leviton_dz1kd_00_000```. 

1000W Dimmer


## Channels
The following table summarises the channels available for the DZ1KD 1000W Dimmer.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Scene Number | scene_number | scene_number |  | Number |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DZ1KD 1000W Dimmer.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Fade On Time | Fade on time |
| 2: Fade Off Time | Fade off time |
| 3: Minimum Light Level | Minimum light level |
| 4: Maximum Light Level | Maximum light level |
| 5: Preset Light Level | Preset light level |
| 6: LED Dim Level Indicator Timeout | LED dim level indicator timeout |
| 7: Locator LED Status | Locator LED status |
| 8: Load Type | Load type |
| 1: Group 1 | Z-Wave Plus Lifeline |


#### 1: Fade On Time

Fade on time  


##### Overview 

 *  0: Instant on
 *  1 to 127: 1-127 seconds
 *  128 to 253: 1-126 minutes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 253 |
| Default Value | 2 |


#### 2: Fade Off Time

Fade off time  


##### Overview 

 *  0: Instant off
 *  1 to 127: 1-127 seconds
 *  128 to 253: 1-126 minutes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 253 |
| Default Value | 2 |


#### 3: Minimum Light Level

Minimum light level


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 10 |


#### 4: Maximum Light Level

Maximum light level


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 100 |


#### 5: Preset Light Level

Preset light level  


##### Overview 

 *  0: Last dim level
 *  1 to 100: Level


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 0 |


#### 6: LED Dim Level Indicator Timeout

LED dim level indicator timeout  


##### Overview 

 *  0: LED indicators off
 *  1 to 254: Timeout in seconds
 *  255: Always on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 3 |


#### 7: Locator LED Status

Locator LED status  


##### Overview 

 *  0: LED off
 *  254: Status mode
 *  255: Locator mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 8: Load Type

Load type  


##### Overview 

 *  0: Incandescent
 *  1: LED
 *  2: CFL


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 0 to 2 |
| Default Value | 0 |


#### 1: Group 1

Z-Wave Plus Lifeline  


##### Overview 

A NOTIFICATION frame is sent to the nodes in this association group when a Lifeline event occurs.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/664).
