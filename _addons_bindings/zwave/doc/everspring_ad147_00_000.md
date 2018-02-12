---
layout: documentation
title: AD147 - ZWave
---

{% include base.html %}

# AD147 Z-Wave Dimmer Plug

This describes the Z-Wave device *AD147*, manufactured by *Everspring* with the thing type UID of ```everspring_ad147_00_000```. 

Z-Wave Dimmer Plug


## Channels
The following table summarises the channels available for the AD147 Z-Wave Dimmer Plug.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Alarm (general) | alarm_general | alarm_general | Door | Switch |


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
The following table provides a summary of the configuration parameters available in the AD147 Z-Wave Dimmer Plug.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set Command value | Basic Set Command value |
| 2: Delaying Time to report to Group 1 | The delaying time to report to Group 1 |
| 3: Remember the last status | Remember the last status |
| 4: Output mode setting: Dimming, On/Off | Output mode setting: Dimming, On/Off |
| 1: Lifeline | Provides reports |
| 2: On/Off control | Basic Set |


#### 1: Basic Set Command value

Basic Set Command value


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 2: Delaying Time to report to Group 1

The delaying time to report to Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 3 to 25 |
| Default Value | 3 |


#### 3: Remember the last status

Remember the last status  


##### Overview 

1 = Remember

0 = Do not remember


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 4: Output mode setting: Dimming, On/Off

Output mode setting: Dimming, On/Off  


##### Overview 

0 = Dimming

1 = On/off


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 1: Lifeline

Provides reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: On/Off control

Basic Set


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/353).
