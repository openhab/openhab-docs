---
layout: documentation
title: PSR04 - ZWave
---

{% include base.html %}

# PSR04 Smart Color Button

This describes the Z-Wave device *PSR04*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_psr04_00_000```. 

Smart Color Button  


### Wakeup Information 

By default, this device only wakes up every 86400 seconds (24 hours). To manually wake this device up:

1.  Hold the device vertically, or against a wall (this will not work if the device is horizontal).
2.  Rotate the wheel so that the pointer is at the top of the device.
3.  Wait at least three seconds.
4.  Rotate the wheel clockwise through 180 degrees to the bottom of the device.
5.  Immediately press the centre button once.

This activates the wakeup for 10 seconds, during which time you will be able to identify the device correctly.


## Channels
The following table summarises the channels available for the PSR04 Smart Color Button.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Scene Number | scene_number | scene_number |  | Number |
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
The following table provides a summary of the configuration parameters available in the PSR04 Smart Color Button.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set OFF level | Control the value represented by the left-side in area D. |
| 2: Basic Set ON level | Control the value represented by the right-side in area D. |
| 10: Auto Report Battery Time | The interval time for auto reporting the Battery level. |
| 25: Customer Function | Bit 0: Dimmer setting method. Bit 1: Disable buzzer in timer mode. |
| 26: Disable Scene Holding report | Send Central Scene Holding when the button is held. |
| 1: Controller updates | For receiving the report message, like the battery level. |
| 2: Light control | For light control. The device will send Basic Set command to this group. |


#### 1: Basic Set OFF level

Control the value represented by the left-side in area D.  


##### Overview 

 E.g. Setting this configuration to 0x0F means range of Command Basic Set value start from 0x0F.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 0 |


#### 2: Basic Set ON level

Control the value represented by the right-side in area D.  


##### Overview 

 E.g. Setting this configuration to 0x1E means range of Command Basic Set value start from 0x1E.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 99 |


#### 10: Auto Report Battery Time

The interval time for auto reporting the Battery level.  


##### Overview 

0: Function is disabled.  
1 - 127: Define the time interval.

0 means turn off auto report battery. The default value of 12 is equivalent to 6 hours.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 12 |


#### 25: Customer Function

Bit 0: Dimmer setting method. Bit 1: Disable buzzer in timer mode.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_25_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 26: Disable Scene Holding report

Send Central Scene Holding when the button is held.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_26_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable (0) |
|  | Enable (1) |


#### 1: Controller updates

For receiving the report message, like the battery level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Light control

For light control. The device will send Basic Set command to this group.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/291).
