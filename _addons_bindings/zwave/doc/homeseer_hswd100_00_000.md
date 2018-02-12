---
layout: documentation
title: HS-WD100+ - ZWave
---

{% include base.html %}

# HS-WD100+ Scene Capable Wall Dimmer Switch

This describes the Z-Wave device *HS-WD100+*, manufactured by *HomeSeer Technologies* with the thing type UID of ```homeseer_hswd100_00_000```. 

Scene Capable Wall Dimmer Switch


## Channels
The following table summarises the channels available for the HS-WD100+ Scene Capable Wall Dimmer Switch.

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
The following table provides a summary of the configuration parameters available in the HS-WD100+ Scene Capable Wall Dimmer Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 4: Orientation | Controls the on/off orientation of the rocker switch |
| 7: Remote Dimming Level Increment | Number of levels (1-99) to change dimming each step when controlled remotely |
| 8: Remote Dimming Step Duration | Time interval (in tens of ms) of brightness change when controlled remotely |
| 9: Local Dimming Level Increment | Number of levels (1-99) to change dimming each step when controlled locally |
| 10: Local Dimming Step Duration | Time interval (in tens of ms) of brightness change when controlled locally |
| 1: Group 1 | Lifeline association only supports the "manual reset" event. |


#### 4: Orientation

Controls the on/off orientation of the rocker switch


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Normal (0) |
|  | Inverted (1) |


#### 7: Remote Dimming Level Increment

Number of levels (1-99) to change dimming each step when controlled remotely  


##### Overview 

This is the step value that the dimmer level is incremented or decremented for each step duration when controlled remotely.

(This parameter was added in firmware version 5.14)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 1 |


#### 8: Remote Dimming Step Duration

Time interval (in tens of ms) of brightness change when controlled remotely  


##### Overview 

Select time interval to move to the next brightness level. The larger the number, the slower the adjustment to dim levels. 

(This parameter was added in firmware version 5.14)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 3 |


#### 9: Local Dimming Level Increment

Number of levels (1-99) to change dimming each step when controlled locally  


##### Overview 

This is the step value that the dimmer level is incremented or decremented for each step duration when controlled locally.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 1 |


#### 10: Local Dimming Step Duration

Time interval (in tens of ms) of brightness change when controlled locally  


##### Overview 

Select time interval to move to the next brightness level. The larger the number, the slower the adjustment to dim levels. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_2 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 3 |


#### 1: Group 1

Lifeline association only supports the "manual reset" event.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/346).
