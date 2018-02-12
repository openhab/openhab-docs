---
layout: documentation
title: ZW ESJ 300 - ZWave
---

{% include base.html %}

# ZW ESJ 300 Duwi ZW ESJ 300 Blind Control

This describes the Z-Wave device *ZW ESJ 300*, manufactured by *Reitz-Group.de* with the thing type UID of ```reitz_zwesj300_00_000```. 

Duwi ZW ESJ 300 Blind Control


## Channels
The following table summarises the channels available for the ZW ESJ 300 Duwi ZW ESJ 300 Blind Control.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter |


### Blinds Control

#### Invert control

Invert the blinds control


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_invert_control |
| Data Type        | BOOLEAN || Default Value | false |
| Options | Yes (true) |
|  | No (false) |


#### Invert percentage value

Invert the blinds percentage value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_invert_percent |
| Data Type        | BOOLEAN || Default Value | false |
| Options | Yes (true) |
|  | No (false) |


#### Step duration

Sets the dim rate speed  
Values from 1 to 127 are defined in seconds, while values from 128 to 254 are defined in minutes.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_duration |
| Data Type        | INTEGER |
| Range | 1 to 254 || Default Value | 255 |
| Options | Device Default (255) |
|  | Change Instantly (0) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZW ESJ 300 Duwi ZW ESJ 300 Blind Control.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 0: Running time | Adjustment of the operating times of the sun blind control |
| 1: Stop-functionality | Adjusting the Stop-Functionality |


#### 0: Running time

Adjustment of the operating times of the sun blind control  


##### Overview 

**NOTE**: The set values remain stored even after a power failure. The adjustment process of the operating times can be repeated anytime.  
**NOTE**: Should the adjustment of the operating times take place with the help of the configuration tool of a third-party manufacturer, you can consider the following values as the basis: Please note that the adjustments should be undertaken only by well-versed technicians.

0x00 = nointerruption/permanent operation

0x01-0x7F = 1 second to 127 seconds in 1-second steps

0x80-0xFE = 130 seconds (0x80) to 1390 seconds (0xFE) in 10 second-steps

0xFF = factory settings 120 seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_0_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 1: Stop-functionality

Adjusting the Stop-Functionality  


##### Overview 

5.2.2 ADJUSTING THE STOP-FUNCTIONALITY:

You can also programm the shutter actuator in a way, that in case of a press in the apposite direction, the shutter won‘t stop, but continue directly in the opposite way (Z-Wave conform). Please proceed as follows:

 *  Hold the “UP” and “DOWN” button of the shutter actuator simulaneausly for 5 seconds. Please note, that the devise nust not be included in the network!
 *  Alternatively by configuration command (only for adviced users): Set the configuration value “1” to the value “0” in or- der to disable the stop-functionality.
    
    In order to enable the stop-functionality, please proceed as follows:
 *  Hold the “UP” and “DOWN” button of the shutter actuator simulaneausly for 5 seconds. Please note, that the devise
    
    nust not be included in the network!
 *  Alternatively by configuration command (only for adviced users): Set the configuration value “1” to the value “1” in order
    
    to enable the stop-functionality. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Disabled (0) |
|  | Enabled (default) (1) |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/563).
