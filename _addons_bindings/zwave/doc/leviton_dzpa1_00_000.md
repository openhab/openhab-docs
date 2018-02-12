---
layout: documentation
title: DZPA1 - ZWave
---

{% include base.html %}

# DZPA1 Plug-in Appliance Module

This describes the Z-Wave device *DZPA1*, manufactured by *Leviton* with the thing type UID of ```leviton_dzpa1_00_000```. 

Plug-in Appliance Module


## Channels
The following table summarises the channels available for the DZPA1 Plug-in Appliance Module.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the DZPA1 Plug-in Appliance Module.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 4: Invert Switch | Invert the ON/OFF Switch State. |
| 5: Ignore Start-Level (Receiving) | This dimmer will start dimming from its current level. |
| 7: Night Light | Defines the behavior of the blue LED. Default is Night Light mode where LED is on when swi... |
| 7: On/Off Command Dim Step | Indicates how many levels the dimmer will change for each dimming step. |
| 8: On/Off Command Dim Rate | This value indicates in 10 millisecond resolution. |
| 9: Local Control Dim Step | Indicates how many levels the dimmer will change for each dimming step. |
| 10: Local Control Dim Rate | This value indicates in 10 millisecond resolution. |
| 11: ALL ON/ALL OFF Dim Step | Indicates how many levels the dimmer will change for each dimming step. |
| 12: ALL ON/ALL OFF Dim Rate | This value indicates in 10 millisecond resolution. |


#### 4: Invert Switch

Invert the ON/OFF Switch State.  
Setting this parameter to Yes will change the top of the switch to OFF and the bottom to ON.  
Note: If you invert the switches and also install the product upside down, the load will now be control


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No (0) |
|  | Yes (1) |


#### 5: Ignore Start-Level (Receiving)

This dimmer will start dimming from its current level.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | No (0) |
|  | Yes (1) |


#### 7: Night Light

Defines the behavior of the blue LED. Default is Night Light mode where LED is on when switch is off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | LED always off (0) |
|  | LED on when switch is ON (254) |
|  | LED on when switch is OFF (255) |


#### 7: On/Off Command Dim Step

Indicates how many levels the dimmer will change for each dimming step.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 1 |


#### 8: On/Off Command Dim Rate

This value indicates in 10 millisecond resolution.  
This sets how often the dim level will change. For example, if you set this parameter to 1, then every 10ms the dim level will change. If you set it to 255, then every 2.55 seconds the


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 3 |


#### 9: Local Control Dim Step

Indicates how many levels the dimmer will change for each dimming step.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 1 |


#### 10: Local Control Dim Rate

This value indicates in 10 millisecond resolution.  
This sets how often the dim level will change. For example, if you set this parameter to 1, then every 10ms the dim level will change. If you set it to 255, then every 2.55 seconds the


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 3 |


#### 11: ALL ON/ALL OFF Dim Step

Indicates how many levels the dimmer will change for each dimming step.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_11_1 |
| Data Type        | INTEGER |
| Range | 1 to 99 |
| Default Value | 1 |


#### 12: ALL ON/ALL OFF Dim Rate

This value indicates in 10 millisecond resolution.  
This sets how often the dim level will change. For example, if you set this parameter to 1, then every 10ms the dim level will change. If you set it to 255, then every 2.55 seconds the


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_12_1 |
| Data Type        | INTEGER |
| Range | 1 to 255 |
| Default Value | 3 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/305).
