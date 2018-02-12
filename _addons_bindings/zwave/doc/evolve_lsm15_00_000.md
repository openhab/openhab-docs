---
layout: documentation
title: LSM-15 - ZWave
---

{% include base.html %}

# LSM-15 Wall Mounted Switch

This describes the Z-Wave device *LSM-15*, manufactured by *Evolve* with the thing type UID of ```evolve_lsm15_00_000```. 

Wall Mounted Switch


## Channels
The following table summarises the channels available for the LSM-15 Wall Mounted Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
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
The following table provides a summary of the configuration parameters available in the LSM-15 Wall Mounted Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: Night Light | By default, the LED will turn OFF when the lead attached is turned ON. |
| 4: Invert Switch | To change the top of the switch to OFF and the bottom of the switch ON. |


#### 3: Night Light

By default, the LED will turn OFF when the lead attached is turned ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | On when load is on (0) |
|  | Off when load is on (1) |


#### 4: Invert Switch

To change the top of the switch to OFF and the bottom of the switch ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Top-ON, Bottom-OFF (0) |
|  | Bottom--ON, Top-OFF (1) |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/318).
