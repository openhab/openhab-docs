---
layout: documentation
title: ZWM-RSM1 - ZWave
---

{% include base.html %}

# ZWM-RSM1 Smart Single Relay Switch Module

This describes the Z-Wave device *ZWM-RSM1*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zwmrsm1_00_000```. 

Smart Single Relay Switch Module  


## Overview 

Z-Wave unifies all your home electronics into an integrated wireless network and helps them talk to each other. It can be added to the network, and making your home electronics fully compatible. The ZWN-RSM1 Switch Module is a component of lighting control system, it can’t be used separately but should turn an existing switch into a Z-Wave switch. This ZWN-RSM1 module is a Z-Wave enabled device and fully interoperable with other Z-Wave certified device from other manufacturers and/or other applications. In a Z-Wave network, each device is designed to act as a wireless repeater. Once the ZWN-RSM1 module is installed and setup with in your wall, it will retransmit the RF signal from one device to another until the intended device is reached. This ensures that the signal is received by its intended destination by routing the signal around obstacles and radio dead spots.  

  


### Inclusion Information 

. When the controller is in add mode, and once program button is pressed and release, or Flick 3 times of the connected switch in 1.5S will also set the ZWN-RSM1 module enter into learn mode . and then the controller will verify the add.

  


### Exclusion Information 

When the controller is in remove mode, and once program button is pressed and release, or Flick 3 times of the connected switch in 1.5S will also set the ZWN-RSM1 module enter into learn mode . and then the controller will verify the remove.


## Channels
The following table summarises the channels available for the ZWM-RSM1 Smart Single Relay Switch Module.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZWM-RSM1 Smart Single Relay Switch Module.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Lifeline | Lifeline: Send device reset locally notification |
| 2: StatusReport | StatusReport: Send basic report |


#### 1: Lifeline

Lifeline: Send device reset locally notification


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: StatusReport

StatusReport: Send basic report


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/479).
