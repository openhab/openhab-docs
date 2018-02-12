---
layout: documentation
title: WD-100 - ZWave
---

{% include base.html %}

# WD-100 Wall Dimmer Switch

This describes the Z-Wave device *WD-100*, manufactured by *Dragon Tech Industrial, Ltd.* with the thing type UID of ```dragontech_wd100_00_000```. 

Wall Dimmer Switch


## Channels
The following table summarises the channels available for the WD-100 Wall Dimmer Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Scene Number | scene_number_param0 | scene_number |  | Number |


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
The following table provides a summary of the configuration parameters available in the WD-100 Wall Dimmer Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 4: Orientation | Controls the on/off orientation of the rocker switch |
| 9: Dim Level Increment | Indicates the number of levels (1-99) to change dimming each step |
| 10: Step Duration | The number of tens of milliseconds (1-255) to delay on each dimming step. |
| 1: Group 1 |  |


#### 4: Orientation

Controls the on/off orientation of the rocker switch


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Normal (0) |
|  | Inverted (1) |


#### 9: Dim Level Increment

Indicates the number of levels (1-99) to change dimming each step


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 1 |


#### 10: Step Duration

The number of tens of milliseconds (1-255) to delay on each dimming step.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 3 |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/243).
