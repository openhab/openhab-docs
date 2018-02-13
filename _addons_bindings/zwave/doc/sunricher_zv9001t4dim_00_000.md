---
layout: documentation
title: ZV9001T4-DIM - ZWave
---

{% include base.html %}

# ZV9001T4-DIM 4 group single colour touch panel secondary controller

This describes the Z-Wave device *ZV9001T4-DIM*, manufactured by *Sunricher* with the thing type UID of ```sunricher_zv9001t4dim_00_000```. 

4 group single colour touch panel secondary controller  


## Overview 

SR-ZV9001T4-DIM-EU is a touch control z-wave secondary controller (z wave dimmer switch) with z-wave Plus enabled for single color LED lighting. As a z-wave secondary controller, it is a z wave dimmer switch which can be added to z-wave network and removed from z-wave network by z-wave primary (master) controllers or gateway and control z-wave devices that are added to the network. It supports 5 groups for associations, a lifeline group association to primary (master) controller and 4 groups association to devices, the group association to devices supports maximum 12 Z-wave devices per group. It is a universal z-wave slave which can be compatible with universal z-wave primary controller or gateway. The wireless controller is compatible with single color z wave device SR-ZV9101FA-DIM and different frequencies are available for different countries or areas. The signal transmit distance can be up to 30m. The controller supports group and scene storage and recall functions. It is easy to install on the wall and available in standard EU size.

**Key Features**

 *  Single color touch Z-wave secondary controller
 *  Source-routed Mesh Network Architecture
 *  Each device works as a node
 *  All Nodes Are Transceivers
 *  Each Z-wave Network Allows Up to 243 Devices
 *  Actively route around and circumvent obstacles or radio dead spots
 *  Wireless Synchronization to Drastically Increase Control Distance
 *  Devices can communicate to one another by using intermediate nodes
 *  Added or removed by primary controllers or gateway
 *  Supports 1 lifeline group association to master controller
 *  Supports 4 groups association to z-wave devices, maximum 12 devices per group
 *  Compatible with universal z-wave primary controller or gateway
 *  Supports group, scene storage and recall functions


## Channels
The following table summarises the channels available for the ZV9001T4-DIM 4 group single colour touch panel secondary controller.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZV9001T4-DIM 4 group single colour touch panel secondary controller.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 3: Scene_type | Scene type |
| 4: Scene_send_to_where | Scene send to where |
| 1: Lifeline |  |
| 2: Group 2 | Launch 1 |
| 3: Group 3 | Launch 2 |
| 4: Group 4 | Launch 3 |
| 5: Group 5 | Launch 4 |


#### 3: Scene_type

Scene type  


##### Overview 

Parameter 3 can be configured via “COMMAND\_CLASS\_CONFIGURATION” to decide which scene command to use “CENTRAL SCENE” or “SCENE ACTIVATION”, factory default is “CENTRAL SCENE”.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 4: Scene_send_to_where

Scene send to where  


##### Overview 

Parameter 4 can be configured via “COMMAND\_CLASS\_CONFIGURATION” to decide which object shall the remote send scene packet to, the gateway or the association group. Factory default is the association group.   By factory default this remote uses “CENTRAL SCENE” to send packet to the association group devices, this method requires that the controlled devices support “CENTRAL SCENE”


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

Launch 1  


##### Overview 

Send mode:

Singlecast/Multicast (The touch color wheel uses multicast to send packets)

Send commands:

The Basic Set,  
Switch Multilevel Start Level Change,  
Switch Multilevel Stop Level Change,  
Switch Multilevel Set,  
Scene Activation,  
Scene Actuator Conf Set,  
Central Scene Notification


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group 3

Launch 2  


##### Overview 

Send mode:  
  
Singlecast/Multicast (The touch color wheel uses multicast to send packets)  
  
Send commands:  
  
The Basic Set,  
Switch Multilevel Start Level Change,  
Switch Multilevel Stop Level Change,  
Switch Multilevel Set,  
Scene Activation,  
Scene Actuator Conf Set,  
Central Scene Notification


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Group 4

Launch 3  


##### Overview 

Send mode:  
  
Singlecast/Multicast (The touch color wheel uses multicast to send packets)  
  
Send commands:  
  
The Basic Set,  
Switch Multilevel Start Level Change,  
Switch Multilevel Stop Level Change,  
Switch Multilevel Set,  
Scene Activation,  
Scene Actuator Conf Set,  
Central Scene Notification


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Group 5

Launch 4  


##### Overview 

Send mode:  
  
Singlecast/Multicast (The touch color wheel uses multicast to send packets)  
  
Send commands:  
  
The Basic Set,  
Switch Multilevel Start Level Change,  
Switch Multilevel Stop Level Change,  
Switch Multilevel Set,  
Scene Activation,  
Scene Actuator Conf Set,  
Central Scene Notification


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/792).
