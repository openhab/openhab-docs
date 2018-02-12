---
layout: documentation
title: NAS-DS01Z - ZWave
---

{% include base.html %}

# NAS-DS01Z Cyrus Door Window Sensor

This describes the Z-Wave device *NAS-DS01Z*, manufactured by *Shenzhen Neo Electronics Co., Ltd* with the thing type UID of ```shenzhen_nasds01z_00_000```. 

Cyrus Door Window Sensor


## Channels
The following table summarises the channels available for the NAS-DS01Z Cyrus Door Window Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (access) | alarm_access | alarm_access | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the NAS-DS01Z Cyrus Door Window Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: OFF Delay | Adjust the amount of delay before the OFF command is transmitted. |
| 2: Basic Set Level |  |
| 1: Lifeline | GROUP 1 is lifeline service that assigned to Sensor (Door/Window detector) status – Open/C... |
| 2: Group 2 | GROUP 2 allows for sending control commands to associated devices such as relay module, li... |
| 3: Group 3 | GROUP 3 allows for Send Notification to associated devices in this group. This Group Suppo... |
| 4: Group 4 | GROUP 4 allows for Send Notification to associated devices in this group. This Group Suppo... |


#### 1: OFF Delay

Adjust the amount of delay before the OFF command is transmitted.  


##### Overview 

Description This configuration parameter that can be used to adjust the amount of delay before the OFF command is transmitted. This parameter can be configured with the value of 0 through 65535, where 0 means send OFF command immediately and 65535 means 65535 seconds of delay.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 2: Basic Set Level


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | -1 to 99 || Default Value | -1 |
| Options | ON (Binary Switch Device) (-1) |
|  | OFF, Alarm cancelling or turning a device off (0) |


#### 1: Lifeline

GROUP 1 is lifeline service that assigned to Sensor (Door/Window detector) status – Open/Close


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

GROUP 2 allows for sending control commands to associated devices such as relay module, lighting, etc. This association group is configured through the advanced parameters no. 1 and 2. This Group Support: BASIC\_SET.  


##### Overview 

GROUP 2 allows for sending control commands to associated devices such as relay module, lighting, etc. This association group is configured through the advanced parameters no. 1 and 2. This Group Support: BASIC\_SET.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Group 3

GROUP 3 allows for Send Notification to associated devices in this group. This Group Support: NOTIFICATION\_REPORT.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Group 4

GROUP 4 allows for Send Notification to associated devices in this group. This Group Support: SENSOR\_BINARY\_REPORT  


##### Overview 

GROUP 4 allows for Send Notification to associated devices in this group. This Group Support: SENSOR\_BINARY\_REPORT


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/458).
