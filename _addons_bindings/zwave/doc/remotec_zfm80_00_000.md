---
layout: documentation
title: ZFM-80 - ZWave
---

{% include base.html %}

# ZFM-80 Fixture Switch Module

This describes the Z-Wave device *ZFM-80*, manufactured by *Remotec* with the thing type UID of ```remotec_zfm80_00_000```. 

Fixture Switch Module  


## Overview 

The ZFM-80US Fixture Switch Module is a Z-Wave enabled device and fully compatible with any Z-Wave enabled network. It allows remote On/Off control of specified resistive household appliance. Each fixture switch module is designed to act as a repeater, which will re-transmit the RF signal to ensure that the signal is received by its intended destination by routing the signal around obstacle and radio dead spots.

Key Features:

\- High output power

\- Remote ON/OFF control via the Z-Wave controller

\- Manual ON/OFF control with the front panel push button

\- Support External ON/OFF key connects to the module

\- Advanced function

Conditional trigger for "Fail Safe Installation"

\- Support Network Wide Inclusion (NWI) and Explore Frames

\- Screw terminals for wires connection

\- Flexible mounting structure - mount inside gang box or any place

  


### Inclusion Information 

Include or exclude the Fixture Switch Module from the existing ZWave home control network with your primary controller.

\- Refer to your primary controller instructions to process the inclusion / exclusion setup procedure.

\- When prompted by your primary controller, click once on the PROG button or external switch.

\- The primary controller should indicate that the action was successful. If the controller indicates the action was unsuccessful, please repeat the procedure.

\- Once the Fixture Switch Module is part of the network, the same basic procedure is used to add the Fixture Switch Module to groups or scenes. Refer to the primary controller's instructions for details.


## Channels
The following table summarises the channels available for the ZFM-80 Fixture Switch Module.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZFM-80 Fixture Switch Module.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: ExternalSwitchType | Set External switch type Definitions |
| 2: Timeout | Set timeout period |
| 3: NodeIdNumber | Configure Node ID number for Z-Wave command source |
| 4: OutputStatus | Set relay output status if timeout period has been reached |
| 1: AssociationGroup |  |


#### 1: ExternalSwitchType

Set External switch type Definitions  


##### Overview 

ZFM-80 provides an option to user that can add an external switch to control the On/Off function. ZFM-80US can be placed into the switch box with external wall switch cover. User can configure the external switch type through the configuration command


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 3 |
| Options | Disable (0) |
|  | TypeA (1) |
|  | TypeB (2) |
|  | TypeC (3) |
|  | TypeD (4) |


#### 2: Timeout

Set timeout period  


##### Overview 

ZFM-80US provides an advanced function "Conditional trigger for Fail Safe Installation". It can turn on or turn off the relay if ZFM-80US has not received any Z-Wave commands from a specified Z-Wave Node ID and within a specified period. For example: Z-Wave gateway can monitor a Z-Wave device status and power on equipment if this Z-Wave device is out of service.

(default value is 0 \[function disabled\])


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 240 |
| Default Value | 0 |


#### 3: NodeIdNumber

Configure Node ID number for Z-Wave command source  


##### Overview 

ZFM-80US provides an advanced function "Conditional trigger for Fail Safe Installation". It can turn on or turn off the relay if ZFM-80US has not received any Z-Wave commands from a specified Z-Wave Node ID and within a specified period. For example: Z-Wave gateway can monitor a Z-Wave device status and power on equipment if this Z-Wave device is out of service.

(default value is 0 \[function disabled\])


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 232 |
| Default Value | 0 |


#### 4: OutputStatus

Set relay output status if timeout period has been reached  


##### Overview 

 ZFM-80US provides an advanced function "Conditional trigger for Fail Safe Installation". It can turn on or turn off the relay if ZFM-80US has not received any Z-Wave commands from a specified Z-Wave Node ID and within a specified period. For example: Z-Wave gateway can monitor a Z-Wave device status and power on equipment if this Z-Wave device is out of service.

1 = turn on relay

0 = turn off relay


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 1: AssociationGroup

  


##### Overview 

Used to report the relay on/off status to specify nodes with ZFM-80US predefined association group once the relay state has been changed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/448).
