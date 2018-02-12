---
layout: documentation
title: FGR221 - ZWave
---

{% include base.html %}

# FGR221 Roller Shutter Controller

This describes the Z-Wave device *FGR221*, manufactured by *Fibargroup* with the thing type UID of ```fibaro_fgr221_00_000```. 

Roller Shutter Controller


## Channels
The following table summarises the channels available for the FGR221 Roller Shutter Controller.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Blinds control | blinds_control | blinds_control | Blinds | Rollershutter |


### Blinds control

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
The following table provides a summary of the configuration parameters available in the FGR221 Roller Shutter Controller.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Enable/Disable ALL ON/OFF | Activate/Deactive ALL ON/OFF |
| 10: Control key #2 behaviour | Turning off the shutter positioning function |
| 14: Inputs Button/Switch configuration | Binary inputs type configuration |
| 20: Dimmer/Roller shutter control | Options for changing parameter 1-99, default 16 |
| 30: General Alarm | set for shutter no. 1 |
| 31: Alarm of flooding with water | set for relay the shutter |
| 32: Smoke, CO, CO2 Alarm. | Set for the roller shutter. |
| 33: Temperature Alarm | set for roller shutter |
| 41: Scene activation functionality | Only valid for the 1.9 version of FGR221. |
| 1: Group 1 |  |
| 2: Group 2 |  |
| 3: Controller Updates |  |


#### 1: Enable/Disable ALL ON/OFF

Activate/Deactive ALL ON/OFF


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 255 |
| Options | ALL ON active / ALL OFF active (-1) |
|  | ALL ON disabled/ ALL OFF disabled (0) |
|  | ALL ON disabled/ ALL OFF active (1) |
|  | ALL ON active / ALL OFF disabled (2) |


#### 10: Control key #2 behaviour

Turning off the shutter positioning function


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Turning on the shutter positioning function - Default (0) |
|  | Turning off the shutter positioning function (1) |


#### 14: Inputs Button/Switch configuration

Binary inputs type configuration


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_14_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Mono-stable input (button) (0) |
|  | Bi-stable input (switch) (1) |
|  | Single Mono-stable switch (2) |


#### 20: Dimmer/Roller shutter control

Options for changing parameter 1-99, default 16


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 16 |


#### 30: General Alarm

set for shutter no. 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_30_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | DEACTIVATION (0) |
|  | OPEN SHUTTER ALARM (1) |
|  | CLOSED SHUTTER ALARM (2) |


#### 31: Alarm of flooding with water

set for relay the shutter


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_31_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | DEACTIVATION (0) |
|  | OPEN SHUTTER ALARM (1) |
|  | CLOSED SHUTTER ALARM (2) |


#### 32: Smoke, CO, CO2 Alarm.

Set for the roller shutter.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_32_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | DEACTIVATION (0) |
|  | OPEN SHUTTER ALARM (1) |
|  | CLOSED SHUTTER ALARM (2) |


#### 33: Temperature Alarm

set for roller shutter


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_33_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | DEACTIVATION (0) |
|  | OPEN SHUTTER ALARM (1) |
|  | CLOSED SHUTTER ALARM (2) |


#### 41: Scene activation functionality

Only valid for the 1.9 version of FGR221.  


##### Overview 

The device offers the possibility of sending commands compatible with Command class scene activation. Information is sent to devices assigned to association group no. 3.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_41_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Deactivation of functionality - Default (0) |
|  | Activation of functionality (1) |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Controller Updates


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/132).
