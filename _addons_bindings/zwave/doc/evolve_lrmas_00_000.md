---
layout: documentation
title: LRM-AS - ZWave
---

{% include base.html %}

# LRM-AS Wall Mounted Dimmer

This describes the Z-Wave device *LRM-AS*, manufactured by *Evolve* with the thing type UID of ```evolve_lrmas_00_000```. 

Wall Mounted Dimmer


## Channels
The following table summarises the channels available for the LRM-AS Wall Mounted Dimmer.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


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
The following table provides a summary of the configuration parameters available in the LRM-AS Wall Mounted Dimmer.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: Night Light | In night-light mode the LED will turn ON when the switch is turned OFF. |
| 4: Invert Switch | Change the top of the switch to OFF and the bottom of the switch to ON. |
| 29: Load Sense |  |
| 1: Group 1 |  |


#### 3: Night Light

In night-light mode the LED will turn ON when the switch is turned OFF.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No (0) |
|  | Yes (1) |


#### 4: Invert Switch

Change the top of the switch to OFF and the bottom of the switch to ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No (0) |
|  | Yes (1) |


#### 29: Load Sense


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_29_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/39).
