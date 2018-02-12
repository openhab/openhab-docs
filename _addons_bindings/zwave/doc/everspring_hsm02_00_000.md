---
layout: documentation
title: HSM02 - ZWave
---

{% include base.html %}

# HSM02 Door/Window Contact

This describes the Z-Wave device *HSM02*, manufactured by *Everspring* with the thing type UID of ```everspring_hsm02_00_000```. 

Door/Window Contact


## Channels
The following table summarises the channels available for the HSM02 Door/Window Contact.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door / Window Status | sensor_door | sensor_door | Door | Contact |
| Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the HSM02 Door/Window Contact.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Basic Set Level | Value to be sent with a BASIC SET command |
| 2: Configuring the OFF Delay | OFF Delay in seconds |
| 3: Staying Awake (for testing) |  |
| 1: Target for reports | Support ALARM\_REPORT, SENSOR\_BINARY\_SUPPORT |
| 2: Target nodes who receive BASIC_SET command |  |


#### 1: Basic Set Level

Value to be sent with a BASIC SET command  


##### Overview 

0: Off

1-99, 255: Dim Level (Multilevel Switch Device), ON (Binary Switch Device)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 99 |
| Default Value | 99 |


#### 2: Configuring the OFF Delay

OFF Delay in seconds  


##### Overview 

The Configuration parameter that can be used to adjust the amount of delay before the OFF command is transmitted. This parameter can be configured as 0-127, where 0 means sending OFF command immediately and 127 means 127 seconds of delay. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 127 |
| Default Value | 0 |


#### 3: Staying Awake (for testing)

  


##### Overview 

Can be used to determine if the unit stays "awake" all the time. This parameter can be configured as 0 or 1, where 1 means "enabled" and 0 stands for "disabled"


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 1: Target for reports

Support ALARM\_REPORT, SENSOR\_BINARY\_SUPPORT  


##### Overview 

##### Power Applied (Alarm Report) 

Once the power has been applied, Alarm Report Command will be sent to Nodes in Grouping 1 to confirm the power applied status for HSM02. 

Power Applied Notice:**\[Command Class Alarm, Alarm Report, Alarm Type = 0x02, Alarm Level = 0x01\]**

##### Magnet status report (Binary Sensor Report) 

When the magnets of HSM02 are to be opened, Binary Sensor Report Command (Value = 0xFF) will be sent to Nodes in Grouping 1, and when the magnets are to be closed, Binary Sensor Report Command (Value = 0x00) will be sent as well.

Magnets to be opened: **\[Command Class Sensor Binary, Sensor Binary Report, Value = 0xFF(255)\]**  
Magnets to be closed: **\[Command Class Sensor Binary, Sensor Binary Report, Value = 0x00(0)\]**

##### Low Battery Report (Alarm Report) 

When HSM02 automatically wakes up, it will check the battery usage. When low battery is detected, Alarm Report Command will be sent to Nodes in Grouping 1, afterward, LED will light up for 1 sec to remind user when HSM02 is triggered due to open or close incidents.

Low Battery Report : **\[Command Class Alarm, Alarm Report, Alarm Type = 0x01, Alarm Level = 0xFF\]**

##### Tamper Event Report (Alarm Report) 

Press and hold the tamper switch more than 10 seconds then release, the unit will send ALARM REPORT command to the nodes of Grouping 1 to inform them there is a tamper event.

Tamper Event Report : **\[Command Class Alarm, Alarm Report, Alarm Type = 0x01, Alarm Level = 0x11\] **


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Target nodes who receive BASIC_SET command

  


##### Overview 

##### Control other Z-Wave Devices  

When door/window is opened, the unit will send BASIC\_SET command which contains a value that is adjustable, to the nodes of Grouping 2. For instance, the brightness level of a lamp module can be fixed according to the set value. 

When the door/window is closed, the BASIC\_SET command will also be sent to the nodes of Grouping 2. For instance, a lamp module will be turned off after receiving the BASIC\_SET command

Basic Set Command:  
Event Present: **\[Command Class Basic, Basic Set, Value = 99 (0x63)\] **  
Event Clear: **\[Command Class Basic, Basic Set, Value = 0 (0x00)\] **


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/34).
