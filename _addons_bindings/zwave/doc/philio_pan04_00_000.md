---
layout: documentation
title: PAN04 - ZWave
---

{% include base.html %}

# PAN04 In Wall Dual Relay(1 Way) Switch Module 2x 1.5kW with power meter

This describes the Z-Wave device *PAN04*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pan04_00_000```. 

In Wall Dual Relay(1 Way) Switch Module 2x 1.5kW with power meter


## Channels
The following table summarises the channels available for the PAN04 In Wall Dual Relay(1 Way) Switch Module 2x 1.5kW with power meter.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (power factor) | meter_powerfactor | meter_powerfactor | Energy | Number |
| Electric meter (amps) | meter_current | meter_current | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch |
| Electric meter (power factor) 1 | meter_powerfactor1 | meter_powerfactor | Energy | Number |
| Electric meter (amps) 1 | meter_current1 | meter_current | Energy | Number |
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number |
| Electric meter (volts) 1 | meter_voltage1 | meter_voltage | Energy | Number |
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number |
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch |
| Electric meter (power factor) 2 | meter_powerfactor2 | meter_powerfactor | Energy | Number |
| Electric meter (amps) 2 | meter_current2 | meter_current | Energy | Number |
| Electric meter (kWh) 2 | meter_kwh2 | meter_kwh | Energy | Number |
| Electric meter (volts) 2 | meter_voltage2 | meter_voltage | Energy | Number |
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number |
| Switch 3 | switch_binary3 | switch_binary | Switch | Switch |
| Electric meter (power factor) 3 | meter_powerfactor3 | meter_powerfactor | Energy | Number |
| Electric meter (amps) 3 | meter_current3 | meter_current | Energy | Number |
| Electric meter (kWh) 3 | meter_kwh3 | meter_kwh | Energy | Number |
| Electric meter (volts) 3 | meter_voltage3 | meter_voltage | Energy | Number |
| Electric meter (watts) 3 | meter_watts3 | meter_watts | Energy | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the PAN04 In Wall Dual Relay(1 Way) Switch Module 2x 1.5kW with power meter.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: W meter report period | Period for reporting W meter |
| 2: kWh meter report period | Period for reporting kWh meter |
| 3: Selected endpoint | Which endpoint is addressed by the BASIC command class |
| 4: Switch mode | Change the external switch mode |
| 5: Threshold of Watt for Load Caution | If threshold of wattage is reached, a meter report will be generated |
| 6: Threshold of kWh for Load Caution | If threshold of kWh is reached, a Meter Report will be generated |
| 7: Restore switch state mode | Restore switch state mode |
| 8: Auto Off Timer | Auto Off Timer |
| 9: RF off command mode | RF off command mode |
| 10: Endpoint 3 | Endpoint 3 |
| 1: Relay 1 + 2 |  |
| 2: Relay 1 |  |
| 3: Relay 2 |  |


#### 1: W meter report period

Period for reporting W meter  


##### Overview 

If the setting is configured for 1 hour (value = 720), the device will report its instant power consumption every 1 hour to Z-Wave Controller. Unit: 5 seconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 720 |


#### 2: kWh meter report period

Period for reporting kWh meter  


##### Overview 

If the setting is configured for 1 hour (value = 6), the device will report its total power consumption every 1 hour to Z-Wave Controller. 

Unit: 10 minutes


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 6 |


#### 3: Selected endpoint

Which endpoint is addressed by the BASIC command class  


##### Overview 

If the Controller is not using Multi\_Channel command class to access the endpoint of PAN04, you may configure the endpoint value to react the Basic Command Class


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Relay 1 (1) |
|  | Relay 2 (2) |
|  | Relay 1 + 2 (3) |


#### 4: Switch mode

Change the external switch mode


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Edge mode (1) |
|  | Pulse mode (2) |
|  | Edge-Toggle mode (3) |


#### 5: Threshold of Watt for Load Caution

If threshold of wattage is reached, a meter report will be generated


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 750 |


#### 6: Threshold of kWh for Load Caution

If threshold of kWh is reached, a Meter Report will be generated


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 10000 |


#### 7: Restore switch state mode

Restore switch state mode  


##### Overview 

Restores the switch state setting in case the device was disconnected from the power source.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Switch Off (0) |
|  | Last State (1) |
|  | Switch On (2) |


#### 8: Auto Off Timer

Auto Off Timer  


##### Overview 

Whenever the device switches to on, the auto off timer begin to count down. After the timer decrease to zero, it will switch off automatically.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 9: RF off command mode

RF off command mode  


##### Overview 

Whenever a switch off command, BASIC\_SET, BINARY\_SWITCH\_SET, SWITCH\_ALL\_OFF, is received, it could be interpreted as 4 kinds of commands.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Switch Off (0) |
|  | Ignore (1) |
|  | Switch Toggle (2) |
|  | Switch On (3) |


#### 10: Endpoint 3

Endpoint 3  


##### Overview 

Multi-Channel Command is a good way to control relay1 and relay2 of PAN04 individually. The endpoint3 of PAN04 is related to both relay1 and relay2. In some condition it becomes redundant in Multi-Channel Command Class.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER || Default Value | 1 |
| Options | Exists (1) |
|  | Doesn&#x27;t Exist (2) |


#### 1: Relay 1 + 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Relay 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Relay 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/172).
