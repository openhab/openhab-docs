---
layout: documentation
title: RGBWE27ZW - ZWave
---

{% include base.html %}

# RGBWE27ZW RGBW bulb

This describes the Z-Wave device *RGBWE27ZW*, manufactured by *Zipato* with the thing type UID of ```zipato_rgbwe27zw_00_000```. 

RGBW bulb


## Channels
The following table summarises the channels available for the RGBWE27ZW RGBW bulb.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Color Control | color_color | color_color |  | Color |
| Color Temperature | color_temperature | color_temperature | ColorLight | Dimmer |


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
The following table provides a summary of the configuration parameters available in the RGBWE27ZW RGBW bulb.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Color temperature | Values range from 0 to 100 where 0 is cold white and 100 is warm white. |
| 2: Shock sensor sensitivity | Range from 0 to 31 where 0 is minimum sensitivity and 31 is maximum sensitivity. |
| 3: Strobe Light Interval | Values range from 0 to 25 in intervals of 100 milliseconds. |
| 4: Strobe Light Pulse Count | Values range from 0 to 250 and a special value 255 which sets infinite flashing. |
| 5: Enable or Disable Random Strobe Pulse Colors | Values range are 0 (turn on) or 1 (turn off). |
| 1: Lifeline |  |


#### 1: Color temperature

Values range from 0 to 100 where 0 is cold white and 100 is warm white.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 |
| Default Value | 50 |


#### 2: Shock sensor sensitivity

Range from 0 to 31 where 0 is minimum sensitivity and 31 is maximum sensitivity.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 31 |
| Default Value | 16 |


#### 3: Strobe Light Interval

Values range from 0 to 25 in intervals of 100 milliseconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 25 |
| Default Value | 0 |


#### 4: Strobe Light Pulse Count

Values range from 0 to 250 and a special value 255 which sets infinite flashing.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 5: Enable or Disable Random Strobe Pulse Colors

Values range are 0 (turn on) or 1 (turn off).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | turn off (0) |
|  | turn on (1) |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/237).
