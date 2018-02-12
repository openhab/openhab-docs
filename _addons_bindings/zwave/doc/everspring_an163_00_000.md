---
layout: documentation
title: AN163 - ZWave
---

{% include base.html %}

# AN163 Metering Power Switch

This describes the Z-Wave device *AN163*, manufactured by *Everspring* with the thing type UID of ```everspring_an163_00_000```. 

Metering Power Switch


## Channels
The following table summarises the channels available for the AN163 Metering Power Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the AN163 Metering Power Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: True Period | Timeout before unit transmits ON/OFF state after manual button press |
| 2: Send Basic Command to Group 2 | Configure the unit to send command to other devices in Grouping 2 |
| 3: Meter Report Period (W) | How often the meter should report load (W). |
| 4: Meter Report Period (kWh) | How often the meter should report load (kWh). |
| 1: Grouping 1 | Grouping 1 reports status |
| 2: Grouping 2 | Allows control of up to four other devices |


#### 1: True Period

Timeout before unit transmits ON/OFF state after manual button press  


##### Overview 

This setting configures the timeout after the manual on/off button is pressed before the status is transmitted. When the on/off button is pressed, the timer starts. After the timeout expires, the status of the switch is examined, and if it is different than it was prior to the first button press, the updated status is transmitted. If it is the same, no status is transmitted.

The time setting is made in increments of 100ms, so a setting of "10" sets the timer to 10 \* 100ms, or 1000ms (1s).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 120 |
| Default Value | 10 |


#### 2: Send Basic Command to Group 2

Configure the unit to send command to other devices in Grouping 2  


##### Overview 

If set to 0, pressing the manual on/off button or receiving a basic\_set command will not send a command to other devices in grouping 2. If set to 1, the device will send a command to other devices in grouping 2.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disabled (0) |
|  | Enabled (1) |


#### 3: Meter Report Period (W)

How often the meter should report load (W).  


##### Overview 

This setting configures how often the module should report instant power load (in Watts) to the controller. The maximum interval is 9h (10s \* 3240 / 3600 = 9h).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 3240 |
| Default Value | 3 |


#### 4: Meter Report Period (kWh)

How often the meter should report load (kWh).  


##### Overview 

This setting configures the period for the module to report power load over time (kWh). The default is 24h. Maximum period is 1 week (1min \* 10080 / 60 = 168h = 1 week). Smaller loads generally need more time for accurate calculation of kilowatt-hours. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 0 to 10080 |
| Default Value | 1440 |


#### 1: Grouping 1

Grouping 1 reports status  


##### Overview 

 Grouping 1 includes ALARM\_REPORT, SWITCH\_BINARY\_REPORT, METER\_REPORT\_COMMAND


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Grouping 2

Allows control of up to four other devices  


##### Overview 

 Grouping 2 includes BASIC\_SET.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/492).
