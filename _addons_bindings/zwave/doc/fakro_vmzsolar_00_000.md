---
layout: documentation
title: VMZ Solar - ZWave
---

{% include base.html %}

# VMZ Solar Awning Blind

This describes the Z-Wave device *VMZ Solar*, manufactured by *Fakro* with the thing type UID of ```fakro_vmzsolar_00_000```. 

Awning Blind


## Channels
The following table summarises the channels available for the VMZ Solar Awning Blind.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Blinds control | blinds_control | blinds_control | Blinds | Rollershutter |
|  | battery-level | system.battery-level |  |  |


### Blinds control

#### Invert control

Invert the blinds control


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_invert_control |
| Data Type        | BOOLEAN || Default Value | false |
| Options | Yes (true) |
|  | No (false) |


#### Invert percentage value

Invert the blinds percentage value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_invert_percent |
| Data Type        | BOOLEAN || Default Value | false |
| Options | Yes (true) |
|  | No (false) |


#### Step duration

Sets the dim rate speed  
Values from 1 to 127 are defined in seconds, while values from 128 to 254 are defined in minutes.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_duration |
| Data Type        | INTEGER |
| Range | 1 to 254 || Default Value | 255 |
| Options | Device Default (255) |
|  | Change Instantly (0) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the VMZ Solar Awning Blind.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: mode | operating mode |
| 2: winter mode | Summer/Winter mode |
| 3: Measurement frequency | Measurement frequency |
| 4: Level of sensitivity for day | Level of sensitivity for day |
| 5: Temperature | Temperature |
| 6: Level of sensitivity for night | Level of sensitivity for night |


#### 1: mode

operating mode  


##### Overview 

Operating mode. Available values:

0 - manual

1 - semiauto

2 - auto


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | manual (0) |
|  | semiauto (1) |
|  | auto (2) |


#### 2: winter mode

Summer/Winter mode  


##### Overview 

Summer / Winter mode

50 - Auto (summer / winter mode)

0 - summer mode only


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 50 |
| Options | summer mode only (0) |
|  | Auto (summer / winter mode) (50) |


#### 3: Measurement frequency

Measurement frequency


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 1 to 30 |
| Default Value | 3 |


#### 4: Level of sensitivity for day

Level of sensitivity for day


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 60 |


#### 5: Temperature

Temperature


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 6: Level of sensitivity for night

Level of sensitivity for night


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 1 to 9 |
| Default Value | 3 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/670).
