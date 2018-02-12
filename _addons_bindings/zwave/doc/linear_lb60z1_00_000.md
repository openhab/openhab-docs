---
layout: documentation
title: LB60Z-1 - ZWave
---

{% include base.html %}

# LB60Z-1 Dimmable LED Light Bulb

This describes the Z-Wave device *LB60Z-1*, manufactured by *Linear Corp* with the thing type UID of ```linear_lb60z1_00_000```. 

Dimmable LED Light Bulb


## Channels
The following table summarises the channels available for the LB60Z-1 Dimmable LED Light Bulb.

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
The following table provides a summary of the configuration parameters available in the LB60Z-1 Dimmable LED Light Bulb.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Dim Level Memory | Dim Settings |
| 1: Lifeline |  |


#### 1: Dim Level Memory

Dim Settings  


##### Overview 

By default, the LB60Z-1 bulb will go to full brightness when turned on. To have the bulb turn on to the last dim level setting, set parameter 1 to 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable dim level memory (0) |
|  | Enable dim level memory (1) |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/8).
