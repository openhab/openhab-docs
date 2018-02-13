---
layout: documentation
title: ZV9102FA-CCT - ZWave
---

{% include base.html %}

# ZV9102FA-CCT Z-wave CCT LED controller

This describes the Z-Wave device *ZV9102FA-CCT*, manufactured by *Sunricher* with the thing type UID of ```sunricher_zv9102facct_00_000```. 

Z-wave CCT LED controller  


## Overview 

The SR-ZV9102FA-CCT is a dual color zwave lighting device and z wave slave that adopts z-wave RF Plus and z-wave mesh network technology with 4 channel, 5A per channel output for dual color LED lights. As a z-wave slave, the device can be added to z-wave network or removed from z-wave network by z-wave primary (master) controllers or gateway. The z wave devices are transceivers that enable to receive and transmit RF signal from the z wave remote while both of them are added to the network. The transceiver is a universal z wave slave which is compatible with universal z wave primary (master) controllers/gateway.


## Channels
The following table summarises the channels available for the ZV9102FA-CCT Z-wave CCT LED controller.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Scene Number | scene_number | scene_number |  | Number |
| Color Control | color_color | color_color |  | Color |
| Color Temperature | color_temperature | color_temperature | ColorLight | Dimmer |
| Alarm (system) | alarm_system | alarm_system |  | Switch |


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
The following table provides a summary of the configuration parameters available in the ZV9102FA-CCT Z-wave CCT LED controller.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Lifeline |  |


#### 1: Lifeline

  


##### Overview 

Single Cast DEVICE\_RESET\_LOCALLY\_NOTIFICATION (sent when factory reset the device)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/793).
