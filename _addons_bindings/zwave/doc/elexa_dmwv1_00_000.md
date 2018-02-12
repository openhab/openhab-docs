---
layout: documentation
title: DMWV1 - ZWave
---

{% include base.html %}

# DMWV1 Dome Water Main Shut Off

This describes the Z-Wave device *DMWV1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmwv1_00_000```. 

Dome Water Main Shut Off


## Channels
The following table summarises the channels available for the DMWV1 Dome Water Main Shut Off.

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
The following table provides a summary of the configuration parameters available in the DMWV1 Dome Water Main Shut Off.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Lifeline |  |


#### 1: Lifeline

  


##### Overview 

Group 1 is the “Lifeline” group, which can hold five devices.  The Water Main Shut-Off sends this group a Binary Switch Report whenever it is turned on or off.  The Water Main Shut-Off also sends this group a Device Reset Locally notification to remove itself from the Z-Wave network. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/650).
