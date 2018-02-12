---
layout: documentation
title: TZWP-100 - ZWave
---

{% include base.html %}

# TZWP-100 Wall Plug Switch

This describes the Z-Wave device *TZWP-100*, manufactured by *Telldus Technologies AB* with the thing type UID of ```telldus_tzwp100_00_000```. 

Wall Plug Switch


## Channels
The following table summarises the channels available for the TZWP-100 Wall Plug Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the TZWP-100 Wall Plug Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Countdown timer | Automatic turning off in minutes, 0 to disable |
| 2: Device status after power failure | Define how the plug will react after the power supply is back on |
| 3: LED indicator | Set the intensity of the LED indicator |
| 1: Lifeline - Plug status |  |
| 2: Control other devices |  |


#### 1: Countdown timer

Automatic turning off in minutes, 0 to disable


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 254 |
| Default Value | 0 |


#### 2: Device status after power failure

Define how the plug will react after the power supply is back on


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Always off (0) |
|  | Remember status (1) |
|  | Always on (2) |


#### 3: LED indicator

Set the intensity of the LED indicator


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 100 |


#### 1: Lifeline - Plug status

  


##### Overview 

The plug will send it's status to the node in this group whenever the status of the plug changes.  
Lifeline is normally used to send the plug status to the main controller / gateway.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Control other devices

  


##### Overview 

The plug will send Basic Set control signals to the nodes in this group whenever the status of the  
plug changes. This will work like a master/slave solution.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/409).
