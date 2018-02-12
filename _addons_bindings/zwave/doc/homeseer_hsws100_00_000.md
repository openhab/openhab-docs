---
layout: documentation
title: HS-WS100+ - ZWave
---

{% include base.html %}

# HS-WS100+ Scene Capable Wall Switch

This describes the Z-Wave device *HS-WS100+*, manufactured by *HomeSeer Technologies* with the thing type UID of ```homeseer_hsws100_00_000```. 

Scene Capable Wall Switch


## Channels
The following table summarises the channels available for the HS-WS100+ Scene Capable Wall Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Scene Number | scene_number | scene_number |  | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the HS-WS100+ Scene Capable Wall Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: Indicator LED | Defines the behavior of the indicator LED. |
| 4: Orientation | Controls the on/off orientation of the rocker switch |
| 1: Group 1 | Lifeline association only supports the "manual reset" and "central scene" event. |


#### 3: Indicator LED

Defines the behavior of the indicator LED.  


##### Overview 

Defines the behavior of the indicator LED.  Default is Night Light mode where LED is on when switch is off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | LED on when switch is OFF (0) |
|  | LED on when switch is ON (1) |
|  | LED always off (2) |


#### 4: Orientation

Controls the on/off orientation of the rocker switch


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Normal (0) |
|  | Inverted (1) |


#### 1: Group 1

Lifeline association only supports the "manual reset" and "central scene" event.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/351).
