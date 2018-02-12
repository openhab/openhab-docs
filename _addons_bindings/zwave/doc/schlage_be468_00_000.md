---
layout: documentation
title: BE468 - ZWave
---

{% include base.html %}

# BE468 Touchscreen Deadbolt

This describes the Z-Wave device *BE468*, manufactured by *Allegion* with the thing type UID of ```schlage_be468_00_000```. 

Touchscreen Deadbolt


## Channels
The following table summarises the channels available for the BE468 Touchscreen Deadbolt.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch |
| Alarm (access) | alarm_access | alarm_access | Door | Switch |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
| Alarm (system) | alarm_system | alarm_system |  | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the BE468 Touchscreen Deadbolt.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: Beeper | Audio feedback when keypad pressed during normal operation |
| 4: Vacation Mode | Prevents all user codes from unlocking the deadbolt |
| 5: Lock &amp; Leave | Press the Schlage button to lock the deadbolt |
| 15: Auto Lock | Automatically locks 30 seconds after unlocking |
| 16: User Code PIN Length | User codes can be 4-8 digits. Changing length will delete all existing codes. |
| 1: Group 1 |  |


#### 3: Beeper

Audio feedback when keypad pressed during normal operation


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | Disable (0) |
|  | Enable (255) |


#### 4: Vacation Mode

Prevents all user codes from unlocking the deadbolt


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (255) |


#### 5: Lock &amp; Leave

Press the Schlage button to lock the deadbolt


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | Disable (0) |
|  | Enable (255) |


#### 15: Auto Lock

Automatically locks 30 seconds after unlocking


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (255) |


#### 16: User Code PIN Length

User codes can be 4-8 digits. Changing length will delete all existing codes.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_1 |
| Data Type        | INTEGER |
| Range | 4 to 8 |
| Default Value | 4 |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/240).
