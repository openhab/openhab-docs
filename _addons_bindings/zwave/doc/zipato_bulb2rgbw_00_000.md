---
layout: documentation
title: RGBWE2 - ZWave
---

{% include base.html %}

# RGBWE2 RGBW Bulb V2

This describes the Z-Wave device *RGBWE2*, manufactured by *Zipato* with the thing type UID of ```zipato_bulb2rgbw_00_000```. 

RGBW Bulb V2


## Channels
The following table summarises the channels available for the RGBWE2 RGBW Bulb V2.

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
The following table provides a summary of the configuration parameters available in the RGBWE2 RGBW Bulb V2.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: internal bulb temperature |  |


#### 1: internal bulb temperature


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/619).
