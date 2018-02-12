---
layout: documentation
title: Forest Shuttle S/L, Forest Group NL - ZWave
---

{% include base.html %}

# Forest Shuttle S/L, Forest Group NL Drapery hardware

This describes the Z-Wave device *Forest Shuttle S/L, Forest Group NL*, manufactured by *Forest Group Nederland B.V* with the thing type UID of ```forest_forestshuttlesl_00_000```. 

Drapery hardware  


## Overview 

Role type: always on slave

Node type: z-wave plus node

  


### Inclusion Information 

Set your main controller into learn mode. Press configuration button 3 times. Led 3 is ON. Press and hold once more for 4 seconds, led will start blinking for 10 seconds. The Shuttle Z-wave motor will be detected and included into the Z-wave network of your controller.

  


### Exclusion Information 

To exclude, set your main controller into exclude mode. Press configuration button 3 times. Led 3 is ON. Press and hold once more for 4 seconds, led will start blinking for 10 seconds. The Shuttle Z-wave motor will be detected and excluded into the Z-wave network of your controller.

You can also reset the device, but only use this if your main controller is not operable. For reset, press the config button 25 times and confirm by pressing the button once more for 4 seconds until the led blinks 3 times and goes off.

  


### Wakeup Information 

Not specified


## Channels
The following table summarises the channels available for the Forest Shuttle S/L, Forest Group NL Drapery hardware.

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
The following table provides a summary of the configuration parameters available in the Forest Shuttle S/L, Forest Group NL Drapery hardware.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: lifeline |  |


#### 1: lifeline

  


##### Overview 

Node associated in this group will receive an unsolicited SWITCH\_MULTILEVEL\_REPORT frame every time the position of the curtain rail is changed, where the value represents the (changed) position.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/510).
