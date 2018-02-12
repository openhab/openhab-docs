---
layout: documentation
title: AN181 - ZWave
---

{% include base.html %}

# AN181 Mini Plug Switch with Metering (Gen5)

This describes the Z-Wave device *AN181*, manufactured by *Everspring* with the thing type UID of ```everspring_an181_00_000```. 

Mini Plug Switch with Metering (Gen5)  


## Overview 

The Metering Plug is designed to control the on/off status appliances load in your house. For metering the unit can detect up to 10485.75kW\*h and can support wattage, voltage, ampere, and PF detection. The unit can also detect overload upon which the unit will switch off relay and keep LED flashing until power is off and re-applied. At 220-240V voltage, this Plug can support up to 2500W resistive. 

  


### Inclusion Information 

Press the link key three times within 1.5 seconds to put the unit into inclusion mode.

  


### Exclusion Information 

Press the link key three times within 1.5 seconds to put the unit into exclusion mode.


## Channels
The following table summarises the channels available for the AN181 Mini Plug Switch with Metering (Gen5).

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (amps) | meter_current | meter_current | Energy | Number |
| Electric meter (power factor) | meter_powerfactor | meter_powerfactor | Energy | Number |
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the AN181 Mini Plug Switch with Metering (Gen5).
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Command value | Set Basic Set Command value to be sent to group 2 when switch is turned on |
| 2: Delaying time | Set the delaying time to report to Group 1 in seconds |
| 3: Remember status | Set whether to remember the last status |
| 4: Interval for wattage auto report | Set the interval for wattage auto report in minutes |
| 5: Interval for kW*h auto report | Set the interval for kW\*h auto report in minutes |
| 6: Auto report load surpasses value | Auto report when load surpasses the set value of wattage |
| 7: Auto report change percentage | Auto report when the change of wattage surpasses the set percentage |
| 1: Target for automatic reports | Binary Switch Report, Notification Report, Device Reset Locally Notification, Meter Report |
| 2: Basic Set | Basic Set, Control:key1, On/Off control (Button1) |


#### 1: Command value

Set Basic Set Command value to be sent to group 2 when switch is turned on  


##### Overview 

Meaningful range is 0-99 & 255 where

0 = No command will be sent  
1-99 = Turn on switches and dimmers listening to Group 2 to indicated % level (ON for switches)  
255 = Turn on switches and dimmers (full power) listening to Group 2

Command will be sent if the mini plug is turned on via the button or if it receives a remote command.

Basic Set Command = 0 (Off) will be sent to Group 2 only if the button is used to turn off the mini plug, not when the mini plug is turned off via remote command.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 1 to 99 || Default Value | 255 |
| Options | No Basic Set Command will be sent (0) |
|  | Basic Set Command ON will be sent (255) |


#### 2: Delaying time

Set the delaying time to report to Group 1 in seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 3 to 25 |
| Default Value | 3 |


#### 3: Remember status

Set whether to remember the last status


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Do not remember (0) |
|  | Remember (1) |


#### 4: Interval for wattage auto report

Set the interval for wattage auto report in minutes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 || Default Value | 1 |
| Options | Does not report automatically (0) |


#### 5: Interval for kW*h auto report

Set the interval for kW\*h auto report in minutes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 || Default Value | 60 |
| Options | Does not report automatically (0) |


#### 6: Auto report load surpasses value

Auto report when load surpasses the set value of wattage


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 1 to 2500 || Default Value | 0 |
| Options | Does not report automatically (0) |


#### 7: Auto report change percentage

Auto report when the change of wattage surpasses the set percentage


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 1 to 100 || Default Value | 0 |
| Options | Does not report automatically (0) |


#### 1: Target for automatic reports

Binary Switch Report, Notification Report, Device Reset Locally Notification, Meter Report  


##### Overview 

When powered on, the device will send (Notification Type = 0x08, Event = 0x01) to the node of Group 1. When overload occurs, the device will send (Notification Type = 0x08, Event = 0x08) to the node of Group 1.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Basic Set

Basic Set, Control:key1, On/Off control (Button1)


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/306).
