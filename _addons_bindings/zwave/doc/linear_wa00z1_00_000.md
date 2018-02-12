---
layout: documentation
title: WA00Z-1 - ZWave
---

{% include base.html %}

# WA00Z-1 Wall Mounted Switch

This describes the Z-Wave device *WA00Z-1*, manufactured by *Linear Corp* with the thing type UID of ```linear_wa00z1_00_000```. 

Wall Mounted Switch


## Channels
The following table summarises the channels available for the WA00Z-1 Wall Mounted Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the WA00Z-1 Wall Mounted Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Activation of Central Scene | Set top and bottom button scene numbers. |
| 2: Control Mode | Control other devices or issue various scene activation... |
| 4: Invert Switch | Invert top of switch ON/OFF buttons |
| 1: Lifeline |  |
| 2: Group 2 |  |
| 3: Group 3 |  |


#### 1: Activation of Central Scene

Set top and bottom button scene numbers.  


##### Overview 

Z-Wave Plus introduces a new process for scene activation – “Central Scene  
Control”. Press and release the button, it will send a certain command to the  
central controller via the lifeline association group 1. This allows the controller  
to react to both a button press and a button release. This mode implements  
communication pattern 6, and requires a gateway supporting Z-Wave Plus.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 0 |


#### 2: Control Mode

Control other devices or issue various scene activation...  


##### Overview 

...  commands to a central controller.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 2 |
| Default Value | 0 |


#### 4: Invert Switch

Invert top of switch ON/OFF buttons  


##### Overview 

To change the top of the switch to OFF and the bottom of the switch ON, set Parameter 4 to a value of 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 1: Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group 3


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/610).
