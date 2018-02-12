---
layout: documentation
title: LTM-5 - ZWave
---

{% include base.html %}

# LTM-5 Wall Mount Accessory Switch

This describes the Z-Wave device *LTM-5*, manufactured by *Evolve* with the thing type UID of ```evolve_ltm5_00_000```. 

Wall Mount Accessory Switch


## Channels
The following table summarises the channels available for the LTM-5 Wall Mount Accessory Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
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
The following table provides a summary of the configuration parameters available in the LTM-5 Wall Mount Accessory Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Ignore Start Level (Transmitting) | Dimmers controlled by this switch will start dimming from their current level. |
| 3: Night Light | In night-light mode the LED on the switch will turn ON when the switch is turned OFF. |
| 4: Invert Switch | Change the top of the switch to OFF and the bottom of the switch to ON. |
| 5: Ignore Start-Level (Receiving) | The dimmer will start dimming from its current level. |
| 19: Transmission Indication | Flicker LED while transmitting. |
| 20: Polling Interval | How often, in minutes, to poll to keep synchronized with group. |
| 21: Poll First Node | Poll only the first node in Group 1. |
| 1: Group 1 |  |


#### 1: Ignore Start Level (Transmitting)

Dimmers controlled by this switch will start dimming from their current level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No (0) |
|  | Yes (1) |


#### 3: Night Light

In night-light mode the LED on the switch will turn ON when the switch is turned OFF.


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


#### 5: Ignore Start-Level (Receiving)

The dimmer will start dimming from its current level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | No (0) |
|  | Yes (1) |


#### 19: Transmission Indication

Flicker LED while transmitting.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_19_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | No Flicker (0) |
|  | Flicker Whole Transmission (1) |
|  | Flicker 1 Second (2) |


#### 20: Polling Interval

How often, in minutes, to poll to keep synchronized with group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 2 |


#### 21: Poll First Node

Poll only the first node in Group 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No (0) |
|  | Yes (1) |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/38).
