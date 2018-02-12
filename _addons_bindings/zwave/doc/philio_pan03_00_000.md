---
layout: documentation
title: PAN03 - ZWave
---

{% include base.html %}

# PAN03 In Wall Micromodule Single Switch

This describes the Z-Wave device *PAN03*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pan03_00_000```. 

In Wall Micromodule Single Switch


## Channels
The following table summarises the channels available for the PAN03 In Wall Micromodule Single Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (power factor) | meter_powerfactor | meter_powerfactor | Energy | Number |
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number |
| Electric meter (amps) | meter_current | meter_current | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the PAN03 In Wall Micromodule Single Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Watt Meter Report Period | Watt Meter Report Period |
| 2: KWH Meter Report Period | KWH Meter Report Period (6\*10min=1 hour) |
| 3: Threshold of current for Load caution | Threshold of current for Load caution (1100\*0.01A = 11A) |
| 4: Threshold of KWh for Load caution | Threshold of KWh for Load caution |
| 5: Restore switch state mode | Restore switch state mode |
| 6: Manual On/Off mode | Manual On/Off mode |
| 7: LED indication mode | LED indication mode |
| 8: Auto off timer | Auto off timer |
| 9: RF off command mode | RF off command mode |
| 1: Group 1 | the Switch will report its latest status to Z-Wave Controller |


#### 1: Watt Meter Report Period

Watt Meter Report Period  


##### Overview 

WATT METER REPORT PERIOD:

If the setting is configured for 1hour (set value =720), the Micromodule Single Switch Max.Load: 11A will report its instant power consumption every 1 hour to Group1 node. The maximum interval to report its instant power consumption is 45 hours (5s\*32767/3600=45hr).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 720 |


#### 2: KWH Meter Report Period

KWH Meter Report Period (6\*10min=1 hour)  


##### Overview 

KWH METER REPORT PERIOD:

If the setting is configured for 1hour (set value =6), the Micromodule Single Switch Max.Load: 11A will report its Accumulated Power Consumption (KW/h) every 1 hour to Group1 node. The maximum interval to report its Accumulated Power Consumption (KW/h) is 227.55 days (10min\*32767/1440=227.55 days).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 6 |


#### 3: Threshold of current for Load caution

Threshold of current for Load caution (1100\*0.01A = 11A)  


##### Overview 

THRESHOLD OF CURRENT FOR LOAD CAUTION:

This is a warning when the current of load over the preset threshold value, if the setting value is 1100, when the load current of Relay1 over this value, Micromodule Single Switch Max.Load: 11A will send current meter report to warn the Group1 node, the Range of the setting value is from 10 to 1100, and the default value is 1100.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 10 to 1100 |
| Default Value | 1100 |


#### 4: Threshold of KWh for Load caution

Threshold of KWh for Load caution  


##### Overview 

THRESHOLD OF KWH FOR LOAD CAUTION

This is a warning when the KWh of load over the preset threshold value, if the setting value is 10000, when the Accumulated Power Consumption of Relay1 over this value, Micromodule Single Switch Max.Load: 11A will send KWH meter report to warn the Group1 node, minimum value is 1KWh and default value is 10000 kWh


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 10 to 10000 |
| Default Value | 10000 |


#### 5: Restore switch state mode

Restore switch state mode  


##### Overview 

RESTORE SWITCH STATE MODE:

Whenever the AC power return from lost, Micromodule Single Switch Max.Load: 11A will restore the switch state which could be SWITCH OFF, LAST SWITCH STATE, SWITCH ON. The default setting is LAST SWITCH STATE.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Switch off (0) |
|  | Last switch state (1) |
|  | Switch on (2) |


#### 6: Manual On/Off mode

Manual On/Off mode  


##### Overview 

MANUAL ON/OFF MODE:

The On/Off function of S1, S2 and learn switch can be disabled or enabled by this parameter, default value is Enable. But the learning operation won’t be affected. When manual On/Off function is disabled, the RF command can only switch On but not Off. This is useful function for keeping the device in switch on state


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable manual On/Off (0) |
|  | Enable manual On/Off (1) |


#### 7: LED indication mode

LED indication mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Show switch state (1) |
|  | Show night mode (2) |
|  | One flash mode (2) |


#### 8: Auto off timer

Auto off timer  


##### Overview 

AUTO OFF TIMER:

Whenever Micromodule Single Switch Max.Load: 11A switches to on, the auto off timer begin to count down. After the timer decrease to zero, it will switch to off automatically. However if Auto off timer is set as 0, the auto off function will be disabled. The default setting is 0.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 0 |


#### 9: RF off command mode

RF off command mode  


##### Overview 

RF OFF COMMAND MODE:

Whenever a switch off command, BASIC\_SET, BINARY\_SWITCH\_SET, SWITCH\_ALL\_OFF, is received, it could be interpreted as 4 variety of commands. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Switch off (0) |
|  | Ignore (1) |
|  | Switch toggle (2) |
|  | Switch on (3) |


#### 1: Group 1

the Switch will report its latest status to Z-Wave Controller  


##### Overview 

Grouping 1 includes, SWITCH\_BINARY\_REPORT, METER\_REPORT, ALARM\_REPORT.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/529).
