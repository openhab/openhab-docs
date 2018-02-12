---
layout: documentation
title: DMS01 - ZWave
---

{% include base.html %}

# DMS01 Dome Wireless Siren

This describes the Z-Wave device *DMS01*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dms01_00_000```. 

Dome Wireless Siren


## Channels
The following table summarises the channels available for the DMS01 Dome Wireless Siren.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DMS01 Dome Wireless Siren.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Primary Notification Volume Level |  |
| 2: Primary Notification Length |  |
| 3: Secondary Notification Length |  |
| 4: Secondary Notification Volume Level |  |
| 5: Primary Notification Sound |  |
| 6: Secondary Notification Sound |  |
| 7: Toggle secondary chime | Toggles between primary and secondary chime for binary switch |


#### 1: Primary Notification Volume Level


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Low Volume (1) |
|  | Medium Volume (2) |
|  | High Volume (3) |


#### 2: Primary Notification Length


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | 30 Seconds (1) |
|  | 1 Minute (2) |
|  | 5 Minutes (3) |
|  | Plays Until Battery Is Depleted (255) |


#### 3: Secondary Notification Length


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Does Not Stop (0) |
|  | 1 Minute (1) |
|  | 5 Minutes (5) |
|  | Chime Will Not Play (255) |


#### 4: Secondary Notification Volume Level


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Low Volume (1) |
|  | Medium Volume (2) |
|  | High Volume (3) |


#### 5: Primary Notification Sound

  


##### Overview 

The siren offers ten different sounds to use as the Siren (primary) notification. This parameter sets the Siren (primary) notification sound.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER || Default Value | 9 |
| Options | Ding dong (1) |
|  | Fur Elise (2) |
|  | Westminster Chime (3) |
|  | Dingdongdingdongdingdong (4) |
|  | William Tell Overture (5) |
|  | Classical (6) |
|  | Weeooeeooeeooeeoo (7) |
|  | Err-err-err-err-err (8) |
|  | Beepbeepbeepbeep (Default) (9) |
|  | beeeep-beeeep-beeeep (10) |


#### 6: Secondary Notification Sound


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER || Default Value | 9 |
| Options | Ding dong (1) |
|  | Fur Elise (2) |
|  | Westminster Chime (3) |
|  | Dingdongdingdongdingdong (4) |
|  | William Tell Overture (5) |
|  | Classical (6) |
|  | Weeooeeooeeooeeoo (7) |
|  | Err-err-err-err-err (8) |
|  | Beepbeepbeepbeep (Default) (9) |
|  | beeeep-beeeep-beeeep (10) |


#### 7: Toggle secondary chime

Toggles between primary and secondary chime for binary switch


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_2 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Primary notification will play (1) |
|  | Secondary notification will play (2) |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/589).
