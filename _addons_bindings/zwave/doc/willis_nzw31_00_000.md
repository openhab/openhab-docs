---
layout: documentation
title: NZW31 - ZWave
---

{% include base.html %}

# NZW31 In-wall Dimming Switch

This describes the Z-Wave device *NZW31*, manufactured by *Willis Electric Co., Ltd.* with the thing type UID of ```willis_nzw31_00_000```. 

In-wall Dimming Switch  


## Overview 

Z-Wave Plus dimming switch with instant status reporting.


## Channels
The following table summarises the channels available for the NZW31 In-wall Dimming Switch.

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
The following table provides a summary of the configuration parameters available in the NZW31 In-wall Dimming Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Lifeline |  |


#### 1: Lifeline

  


##### Overview 

An association command class that allows the device to communicate with other Z-Wave devices directly -- such as sending BASIC REPORT whenever the switch is turned on or off.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/766).
