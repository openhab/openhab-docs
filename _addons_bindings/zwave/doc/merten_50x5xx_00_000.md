---
layout: documentation
title: 50x5xx - ZWave
---

{% include base.html %}

# 50x5xx Roller shutter push-button

This describes the Z-Wave device *50x5xx*, manufactured by *Merten* with the thing type UID of ```merten_50x5xx_00_000```. 

Roller shutter push-button  


### Inclusion Information 

Program (transmits Node info frame)

Triple click on operating surface. Used for  
include/exclude the device by the primary  

  


### Exclusion Information 

Reset to the factory settings; exclude  

Triple click on operating surface. Used for  
include/exclude the device by the primary  


## Channels
The following table summarises the channels available for the 50x5xx Roller shutter push-button.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Sensor (luminance) | sensor_luminance | sensor_luminance | Temperature | Number |
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer |
| Sensor (luminance) 1 | sensor_luminance1 | sensor_luminance | Temperature | Number |
| Dimmer 2 | switch_dimmer2 | switch_dimmer | DimmableLight | Dimmer |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Dimmer 1

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Dimmer 2

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the 50x5xx Roller shutter push-button.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 0: Switching/dimming/shutters |  |
| 4: Switching single-surface |  |
| 176: Break (motor protection) | Changeover delay (motor protection) Input (0 - 255) \* 0.1 s |
| 177: Travel time UP, Byte 1 | Input 1 (0 - 255) |
| 178: Travel time UP, Byte 2 | Input 2 (0 - 255) |
| 179: Travel time DOWN, Byte 1 | Input 1 (0 - 255) |
| 180: Travel time DOWN, Byte 2 | Input 2 (0 - 255) |
| 1: Other device to be switched |  |


#### 0: Switching/dimming/shutters


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_0_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 4: Switching single-surface


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 176: Break (motor protection)

Changeover delay (motor protection) Input (0 - 255) \* 0.1 s


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_176_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 177: Travel time UP, Byte 1

Input 1 (0 - 255)  


##### Overview 

Raising time  
(256 \* Input 1 + input 2) \* 0.1 s  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_177_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 178: Travel time UP, Byte 2

Input 2 (0 - 255)  


##### Overview 

Raising time  
(256 \* Input 1 + input 2) \* 0.1 s  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_178_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 179: Travel time DOWN, Byte 1

Input 1 (0 - 255)  


##### Overview 

Lowering time  
(256 \* Input 1 + input 2) \* 0.1 s  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_179_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 180: Travel time DOWN, Byte 2

Input 2 (0 - 255)  


##### Overview 

Lowering time  
(256 \* Input 1 + input 2) \* 0.1 s  


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_180_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 1: Other device to be switched

  


##### Overview 


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/57).
