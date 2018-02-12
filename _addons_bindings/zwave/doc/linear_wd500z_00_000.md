---
layout: documentation
title: WD500Z-1 - ZWave
---

{% include base.html %}

# WD500Z-1 Wall Dimmer Switch

This describes the Z-Wave device *WD500Z-1*, manufactured by *Linear Corp* with the thing type UID of ```linear_wd500z_00_000```. 

Wall Dimmer Switch


## Channels
The following table summarises the channels available for the WD500Z-1 Wall Dimmer Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |


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
The following table provides a summary of the configuration parameters available in the WD500Z-1 Wall Dimmer Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Dim Start Level | A dimmer receiving this command will start dimming from that start level if this bit is se... |
| 3: LED Indication | The WD500Z-1 will flicker its LED when it is transmitting to any of its groups. |
| 4: Invert Switch | To change the top of the switch to OFF and the bottom to ON change parameter to 1. |
| 14: Enable Shade Control Group 2 | The switch can control shade control devices if this parameter is set to 1 |
| 15: Enable Shade Control Group 3 | The switch can control shade control devices if this parameter is set to 1. |
| 19: LED Transmission Indication | The WD500Z-1 will flicker its LED when it is transmitting to any of its groups. Parameter ... |
| 1: UNKNOWN!!! |  |
| 2: Double Tap |  |
| 3: Triple Tap |  |


#### 1: Dim Start Level

A dimmer receiving this command will start dimming from that start level if this bit is set to 0. If the bit is set to 1, the dimmer will ignore the start level and instead start dimming from its current level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Use Start Level (0) |
|  | Ignore Start Level (1) |


#### 3: LED Indication

The WD500Z-1 will flicker its LED when it is transmitting to any of its groups.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | 0 (0) |
|  | 1 (1) |


#### 4: Invert Switch

To change the top of the switch to OFF and the bottom to ON change parameter to 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Top-ON, Bottom-OFF (0) |
|  | Bottom-ON, Top-OFF (1) |


#### 14: Enable Shade Control Group 2

The switch can control shade control devices if this parameter is set to 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 15: Enable Shade Control Group 3

The switch can control shade control devices if this parameter is set to 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_15_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 19: LED Transmission Indication

The WD500Z-1 will flicker its LED when it is transmitting to any of its groups. Parameter set to 0 = not flicker Parameter set to 1 = flicker the entire time of transmitting Parameter set to 2 = flicker for only 1 second.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_19_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | Disable Flicker (0) |
|  | Flicker while transmitting (1) |
|  | Flicker for 1 second (2) |


#### 1: UNKNOWN!!!


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Double Tap


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Triple Tap


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/6).
