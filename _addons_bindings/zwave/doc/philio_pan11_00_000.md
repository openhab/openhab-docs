---
layout: documentation
title: PAN11 - ZWave
---

{% include base.html %}

# PAN11 Smart Energy Plug In Switch

This describes the Z-Wave device *PAN11*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pan11_00_000```. 

Smart Energy Plug In Switch


## Channels
The following table summarises the channels available for the PAN11 Smart Energy Plug In Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (power factor) | meter_powerfactor | meter_powerfactor | Energy | Number |
| Electric meter (amps) | meter_current | meter_current | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Reset the total power consumption | meter_reset | meter_reset | Energy | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the PAN11 Smart Energy Plug In Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: W meter report period | Set automatic W meter reporting interval |
| 2: kWh meter report period | Set automatic kWh meter reporting interval. |
| 3: Threshold of Watt for load caution | Set threshold of wattage meter value for load caution . |
| 4: Threshold of kWh for Load Caution | If threshold of kWh is reached, a Meter Report will be generated |
| 5: Restore switch state mode |  |
| 6: Mode of switch Off function |  |
| 7: LED indication mode |  |
| 8: Auto Off Timer | Auto off timer. 0 will disable the auto off function. |
| 9: RF Off command mode |  |
| 1: Reports |  |


#### 1: W meter report period

Set automatic W meter reporting interval  


##### Overview 

If the setting is configured for 1hour (set value =720), the PAN11 will report its instant power consumption every 1 hour to Group1 node. The maximum interval to report its instant power consumption is 45 hours (5s\*32767/3600=45hr).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 720 |


#### 2: kWh meter report period

Set automatic kWh meter reporting interval.  


##### Overview 

If the setting is configured for 1hour (set value =6), the PAN11 will report its Accumulated Power Consumption (KW/h) every 1 hour to Group1 node. The maximum interval to report its Accumulated Power Consumption (KW/h) is 227.55 days (10min\*32767/1440=227.55 days).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 32767 |
| Default Value | 6 |


#### 3: Threshold of Watt for load caution

Set threshold of wattage meter value for load caution .  


##### Overview 

This is a warning when the current of load over the preset threshold value, if the setting value is 1300, when the load current of Relay1 over this value, PAN11 will send current meter report to warn the Group1 node, the Range of the setting value is from 10 to 1300,and the default value is 1300. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 10 to 1300 |
| Default Value | 1300 |


#### 4: Threshold of kWh for Load Caution

If threshold of kWh is reached, a Meter Report will be generated  


##### Overview 

Enable automatic warning when the accumulated kWh power consumption exceeds the setting value from 1KWh ~ 10000KWh.. Set to 0 will disable kWh load caution reporting.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 1 to 10000 |
| Default Value | 10000 |


#### 5: Restore switch state mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Switch Off (0) |
|  | Last State (1) |
|  | Switch On (2) |


#### 6: Mode of switch Off function


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | SWITCH OFF commands received are ignored. (0) |
|  | SWITCH OFF commands received are honored. (1) |


#### 7: LED indication mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | The LED follows the state of the switch. (1) |
|  | LED off with load ON (2) |
|  | One flash mode (3) |


#### 8: Auto Off Timer

Auto off timer. 0 will disable the auto off function.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_2 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 9: RF Off command mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Switch Off (0) |
|  | Ignore (1) |
|  | Switch Toggle (2) |
|  | Switch On (3) |


#### 1: Reports


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/177).
