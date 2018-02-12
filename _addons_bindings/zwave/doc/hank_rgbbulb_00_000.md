---
layout: documentation
title: RGB bulb - ZWave
---

{% include base.html %}

# RGB bulb HKZW-RGB01-V1.0

This describes the Z-Wave device *RGB bulb*, manufactured by *Hank* with the thing type UID of ```hank_rgbbulb_00_000```. 

HKZW-RGB01-V1.0


## Channels
The following table summarises the channels available for the RGB bulb HKZW-RGB01-V1.0.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Scene Number | scene_number | scene_number |  | Number |
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
The following table provides a summary of the configuration parameters available in the RGB bulb HKZW-RGB01-V1.0.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 21: Status after power failure | Define how the RGB BULB will react after the power supply is back on. |
| 24: Notification when Load status change | RGB BULB can send notifications to associated device |
| 51: Enable/disable the function of using wall switch | Enable/disable the function of using wall switch to turn on/off RGB BULB |
| 61: Advance mode | RGB BULB can blink or cyclic/random change color automatically at set intervals. |
| 255: Resetting to factory default | RGB BULB will exclude from the Z-Wave network with this particular command |
| 1: Lifeline |  |


#### 21: Status after power failure

Define how the RGB BULB will react after the power supply is back on.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | RGB BULB memorizes its state after a power failure (0) |
|  | Device will be on after power supply is reconnected (1) |
|  | Device will be off after power supply is reconnected (2) |


#### 24: Notification when Load status change

RGB BULB can send notifications to associated device  


##### Overview 

RGB BULB can send notifications to associated device (Group Lifeline) when the status of the RGB BULB is changed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_24_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Notifications Disabled (0) |
|  | Send BASIC REPORT (1) |
|  | Send BASIC REPORT only without status change (2) |


#### 51: Enable/disable the function of using wall switch

Enable/disable the function of using wall switch to turn on/off RGB BULB


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_51_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 61: Advance mode

RGB BULB can blink or cyclic/random change color automatically at set intervals.  


##### Overview 

RGB BULB can blink or cyclic/random change color automatically at set intervals. It will stop blink or change color when receiving any control command like Basic Set


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_61_4 |
| Data Type        | INTEGER || Default Value | 3072 |
| Options | Stop changing (3072) |
|  | Color gradual change randomly (16826368) |
|  | Color change randomly with a breathing blink (33603584) |
|  | Blink with random color (50380800) |
|  | Color change randomly (67158016) |
|  | Color gradual change (285261824) |
|  | Breathing blink with a specific color (302039040) |
|  | Blink with a specific color (318816256) |


#### 255: Resetting to factory default

RGB BULB will exclude from the Z-Wave network with this particular command


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_255_4 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Resetting to the factory default (1431655765) |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/598).
