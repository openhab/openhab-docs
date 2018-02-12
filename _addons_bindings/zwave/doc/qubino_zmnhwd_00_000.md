---
layout: documentation
title: ZMNHWD - ZWave
---

{% include base.html %}

# ZMNHWD Qubino Flush RGBW Dimmer

This describes the Z-Wave device *ZMNHWD*, manufactured by *Goap* with the thing type UID of ```qubino_zmnhwd_00_000```. 

Qubino Flush RGBW Dimmer  


## Overview 

Qubino Flush RGBW module controls RGB/RGBW strips and LED strips or bulbs and has 5 special scene effects. It can also control halogen lights and fans. Its extremely small size allows for easy installation behind wall sockets and switches. Controlled devices may be powered by 12 or 24 VDC.

Supported control types:

 *  Push button (monostable switch)
 *  Bistable switch

This should hopefully work with models ZMNHWD1-ZMNHWD8 (which work on different frequencies).

  


### Inclusion Information 

To include the device, press the service button 3 times within 2 seconds. The LED will turn green if the device was properly included.

The device supports auto inclusion: Install the device and connect the power. The auto inclusion function will be active for about 2 minutes.

  


### Exclusion Information 

To exclude the device, press the service button 3 times within 2 seconds. The green LED will blink if the device was properly included and the device will be reset to factory defaults.


## Channels
The following table summarises the channels available for the ZMNHWD Qubino Flush RGBW Dimmer.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
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
The following table provides a summary of the configuration parameters available in the ZMNHWD Qubino Flush RGBW Dimmer.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Input switch type | Change the type of switch (bistable/monostable) |
| 2: Switch mode | Choose RGBW Dimmer operation mode. |
| 3: Auto scene mode set | Activation of the programmed scene changing color shades. |
| 4: Auto scene duration | Change auto scene mode duration. |
| 1: Send basic report to this group |  |


#### 1: Input switch type

Change the type of switch (bistable/monostable)  


##### Overview 

NOTE: Please power cycle the device when parameter is changed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | bistable switch type (1) |
|  | monostable (push button) switch type (2) |


#### 2: Switch mode

Choose RGBW Dimmer operation mode.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Normal Mode (1) |
|  | Brightness Mode (2) |
|  | Rainbow Mode (3) |


#### 3: Auto scene mode set

Activation of the programmed scene changing color shades.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Ocean (1) |
|  | Lightning (2) |
|  | Rainbow (3) |
|  | Snow (4) |
|  | Sun (5) |


#### 4: Auto scene duration

Change auto scene mode duration.  


##### Overview 

 *  1 - 127 delay duration is from 1s to 127s
 *  \-128 ~ -1 delay duration is from 1min. to 127min.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | -128 to 127 |
| Default Value | 3 |


#### 1: Send basic report to this group

  


##### Overview 

The Module can be set 1 auto-report ID in Group 1.

The Module will send BASIC\_REPORT to device associated in Group 1 when correspond Device is activated.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/567).
