---
layout: documentation
title: HAC01 - ZWave
---

{% include base.html %}

# HAC01 In-Wall Remote Insert

This describes the Z-Wave device *HAC01*, manufactured by *Everspring* with the thing type UID of ```everspring_hac01_00_000```. 

In-Wall Remote Insert


## Channels
The following table summarises the channels available for the HAC01 In-Wall Remote Insert.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the HAC01 In-Wall Remote Insert.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set Level | The Basic Set Command is sent with this value. |
| 2: Amount Of Delay | Amount Of Delay (seconds) to send the Basic Set Off command. |
| 1: Switch Input Change | Target nodes that receive Basic Set command when the switch input changed. |


#### 1: Basic Set Level

The Basic Set Command is sent with this value.  


##### Overview 

The Basic Set Command is sent with value to have the receiving device recognize the value for controlled level, for example, if the Basic Set Command sent to dimmer with value, the dimmer would activate the luminance according to the value.  
  
0 : Off  
1 – 99 : On (for Binary Switch Device); Dim Level (for Multilevel Switch Device)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 99 |


#### 2: Amount Of Delay

Amount Of Delay (seconds) to send the Basic Set Off command.  


##### Overview 

This is applied to determine the delay time setting to send the Basic Set Off command when the manual switch input at NO (open).  
  
Example :  
0 : immediately Off  
1 – 127 : delay 1 ~ 127 second to Off


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 1 |


#### 1: Switch Input Change

Target nodes that receive Basic Set command when the switch input changed.  


##### Overview 

The remote module supports association with maximum 5 node for Grouping 1. Grouping 1 supports BASIC\_SET.

When the manual switch input is from NC to NO or from NO to NC, HAC01 would send Basic Set Command to the nodes in Grouping 1 to On or Off the controlled device. Basic Set Command:

Manual switch input at NC: Command Class Basic, Basic Set, Value = 0xFF(255)

Manual switch input at NO: Command Class Basic, Basic Set, Value = 0x00(0)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/270).
