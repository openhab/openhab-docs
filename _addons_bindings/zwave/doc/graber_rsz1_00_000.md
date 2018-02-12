---
layout: documentation
title: RSZ1 - ZWave
---

{% include base.html %}

# RSZ1 Somfy Motorized Shade

This describes the Z-Wave device *RSZ1*, manufactured by *Graber* with the thing type UID of ```graber_rsz1_00_000```. 

Somfy Motorized Shade


## Channels
The following table summarises the channels available for the RSZ1 Somfy Motorized Shade.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Rollershutter | blinds_control | blinds_control | Blinds | Rollershutter |
| Rollershutter | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
|  | battery-level | system.battery-level |  |  |


### Rollershutter

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


### Rollershutter

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the RSZ1 Somfy Motorized Shade.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Primary | Lifeline (primary controller) |


#### 1: Primary

Lifeline (primary controller)  


##### Overview 

SWITCH MULTILEVEL REPORT after movement

BATTERY STATUS after movement or critical status

DEVICE RESET LOCALLY


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/585).
