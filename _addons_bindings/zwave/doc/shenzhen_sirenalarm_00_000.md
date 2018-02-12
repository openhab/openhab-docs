---
layout: documentation
title: Siren Alarm - ZWave
---

{% include base.html %}

# Siren Alarm Siren Alarm

This describes the Z-Wave device *Siren Alarm*, manufactured by *Shenzhen Neo Electronics Co., Ltd* with the thing type UID of ```shenzhen_sirenalarm_00_000```. 

Siren Alarm


## Channels
The following table summarises the channels available for the Siren Alarm Siren Alarm.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Siren Alarm Siren Alarm.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Configure Alarm music volume | Configure Alarm music volume |
| 2: Alarm music duration time | Alarm music duration time |
| 3: Door bell music duration time | Door bell music duration time |
| 4: Door bell music volume | Door bell music volume |
| 5: Alarm music index | Alarm music index |
| 6: Door bell music index | Door bell music index |
| 7: Default Siren on mode | Default Siren on mode |
| 1: Group 1 |  |
| 2: Group 2 |  |
| 3: Group2 |  |


#### 1: Configure Alarm music volume

Configure Alarm music volume


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 3 |
| Default Value | 2 |


#### 2: Alarm music duration time

Alarm music duration time


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 2 |


#### 3: Door bell music duration time

Door bell music duration time


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 4: Door bell music volume

Door bell music volume


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 1 to 3 |
| Default Value | 2 |


#### 5: Alarm music index

Alarm music index


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 1 to 10 |
| Default Value | 9 |


#### 6: Door bell music index

Door bell music index


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 1 to 10 |
| Default Value | 10 |


#### 7: Default Siren on mode

Default Siren on mode  


##### Overview 

This parameter defines the default music index, volume and duration time for siren on.

This parameter can be selected between ALARM MUSIC and DOOR BELL music.

The settings for ALARM MUSIC defines by Param \#1, \#2, \#5.

The settings for DOOR BELL defines by Param \#3, \#4, \#6.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 1 to 2 |
| Default Value | 1 |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/522).
