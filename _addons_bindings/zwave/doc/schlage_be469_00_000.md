---
layout: documentation
title: BE469 - ZWave
---

{% include base.html %}

# BE469 Touchscreen Deadbolt

This describes the Z-Wave device *BE469*, manufactured by *Allegion* with the thing type UID of ```schlage_be469_00_000```. 

Touchscreen Deadbolt


## Channels
The following table summarises the channels available for the BE469 Touchscreen Deadbolt.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door Lock | lock_door | lock_door | Door | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
| Alarm (raw) | alarm_raw | alarm_raw |  | String |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the BE469 Touchscreen Deadbolt.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: Beeper |  |
| 4: Vacation Mode |  |
| 5: Lock &amp; Leave |  |
| 6: User Slot Status |  |
| 7: Lock Specific Alarm Mode | BE469 Only |
| 8: Lock Specific Alarm Alert Sensitivity |  |
| 9: Lock Specific Alarm Tamper Sensitivity |  |
| 10: Lock Specific Alarm Kick Sensitivity | BE469 Only |
| 11: Lock Specific Alarm Disable—Local Controls |  |
| 12: Electronic Transition Count |  |
| 13: Mechanical Transition Count |  |
| 14: Electronic Failed Count |  |
| 15: Auto Lock |  |
| 16: User Code PIN Length | User Code PIN length, a value between 4 and 8 (default 4) |
| 18: Get Bootloader Version |  |
| 1: Alarm Reports |  |


#### 3: Beeper


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | Disable Beeper (0) |
|  | Enable Beeper (255) |


#### 4: Vacation Mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable Vacation Mode (0) |
|  | Enable Vacation Mode (255) |


#### 5: Lock &amp; Leave


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable Lock &amp; Leave (0) |
|  | Enable Lock &amp; Leave (255) |


#### 6: User Slot Status

  


##### Overview 

Byte 1 (msb): Bit 7: User 8 Status Bit 6: User 7 Status Bit 5: User 6 Status Bit 4: User 5 Status Bit 3: User 4 Status Bit 2: User 3 Status Bit 1: User 2 Status Bit 0: User 1 Status Byte 2 : Bit 7: User 16 Status Bit 6: User 15 Status Bit 5: User 14 Status Bit 4: User 13 Status Bit 3: User 12 Status Bit 2: User 11 Status Bit 1: User 10 Status Bit 0: User 9 Status Byte 3 : Bit 7: User 24 Status Bit 6: User 23 Status Bit 5: User 22 Status Bit 4: User 21 Status Bit 3: User 20 Status Bit 2: User 19 Status Bit 1: User 18 Status Bit 0: User 17 Status Byte 4 (lsb): Bit 7: reserved Bit 6: reserved Bit 5: User 30 Status Bit 4: User 29 Status Bit 3: User 28 Status Bit 2: User 27 Status Bit 1: User 26 Status Bit 0: User 25 Status


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_4 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 7: Lock Specific Alarm Mode

BE469 Only


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Alarm Off (0) |
|  | Alert (1) |
|  | Tamper (2) |
|  | Forced Entry (3) |


#### 8: Lock Specific Alarm Alert Sensitivity


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Not Supported (0) |
|  | Most Sensitive (1) |
|  | More Sensitive (2) |
|  | Medium Sensitivity (3) |
|  | Less Sensitive (4) |
|  | Least Sensitive (5) |


#### 9: Lock Specific Alarm Tamper Sensitivity


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Not Supported (0) |
|  | Most Sensitive (1) |
|  | More Sensitive (2) |
|  | Medium Sensitivity (3) |
|  | Less Sensitive (4) |
|  | Least Sensitive (5) |


#### 10: Lock Specific Alarm Kick Sensitivity

BE469 Only


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Not Supported (0) |
|  | Most Sensitive (1) |
|  | More Sensitive (2) |
|  | Medium Sensitivity (3) |
|  | Less Sensitive (4) |
|  | Least Sensitive (5) |


#### 11: Lock Specific Alarm Disable—Local Controls


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable Local Control (0) |
|  | Enable Local Control (255) |


#### 12: Electronic Transition Count


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_4 |
| Data Type        | INTEGER |
| Range | 0 to 2147483647 |
| Default Value | 0 |


#### 13: Mechanical Transition Count


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_13_4 |
| Data Type        | INTEGER |
| Range | 0 to 2147483647 |
| Default Value | 0 |


#### 14: Electronic Failed Count


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_4 |
| Data Type        | INTEGER |
| Range | 0 to 2147483647 |
| Default Value | 0 |


#### 15: Auto Lock


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable Auto Lock (0) |
|  | Enable Auto Lock (255) |


#### 16: User Code PIN Length

User Code PIN length, a value between 4 and 8 (default 4)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_16_1 |
| Data Type        | INTEGER || Default Value | 4 |
| Options | Four Digits (4) |
|  | Five Digits (5) |
|  | Six Digits (6) |
|  | Seven Digits (7) |
|  | Eight Digits (8) |


#### 18: Get Bootloader Version


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_18_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 1: Alarm Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/303).
