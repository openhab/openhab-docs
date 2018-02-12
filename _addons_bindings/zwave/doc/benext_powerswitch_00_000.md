---
layout: documentation
title: powerSwitch - ZWave
---

{% include base.html %}

# powerSwitch Power Switch EU

This describes the Z-Wave device *powerSwitch*, manufactured by *BeNext* with the thing type UID of ```benext_powerswitch_00_000```. 

Power Switch EU


## Channels
The following table summarises the channels available for the powerSwitch Power Switch EU.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the powerSwitch Power Switch EU.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Set to Default | Set all configuration values to default values (factory settings) |
| 4: Start up with last known socket status | state in what the switch is when power is supplied |
| 9: Relay delay time | When the relay is switched it can't be switched again until the configured time has passed |
| 10: Led indicator | Show the led compared to the relay state |
| 1: Group 1 |  |


#### 1: Set to Default

Set all configuration values to default values (factory settings)  


##### Overview 

All values (0x00 – 0xFF) except for 0x55 can be used to default all the configuration params .


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 4: Start up with last known socket status

state in what the switch is when power is supplied  


##### Overview 

If 0x01–0xFF: When power applied socket is the state before power was disconnected


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 9: Relay delay time

When the relay is switched it can't be switched again until the configured time has passed  


##### Overview 

Value \* 10 milliseconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 10: Led indicator

Show the led compared to the relay state  


##### Overview 

If value is 0: the indicator led is never switched on If value is 1: the indicator led is switched on when relay is switched on If value is 2: the indicator led is switched on when relay is switched off


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 2 |
| Default Value | 1 |


#### 1: Group 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/224).
