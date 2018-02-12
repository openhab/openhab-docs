---
layout: documentation
title: ZW500D - ZWave
---

{% include base.html %}

# ZW500D Dimmer

This describes the Z-Wave device *ZW500D*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zw500d_00_000```. 

Dimmer


## Channels
The following table summarises the channels available for the ZW500D Dimmer.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
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
The following table provides a summary of the configuration parameters available in the ZW500D Dimmer.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: configure LED light state | configure LED light state |
| 2: Reverse installed direction | Control if switch up is on or off |
| 1: Group 1 |  |


#### 1: configure LED light state

configure LED light state  


##### Overview 

0 = LED off with load on

1 = LED on with load on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | LED off with load on (0) |
|  | LED on with load on (1) |


#### 2: Reverse installed direction

Control if switch up is on or off  


##### Overview 

0 = normal install, up is on

1 = invert switch


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | normal install - up is on (0) |
|  | invert switch (1) |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/299).
