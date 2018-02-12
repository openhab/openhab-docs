---
layout: documentation
title: Energy Switch + - ZWave
---

{% include base.html %}

# Energy Switch + Energy Switch +

This describes the Z-Wave device *Energy Switch +*, manufactured by *BeNext* with the thing type UID of ```benext_energyswitch_00_000```. 

Energy Switch +


## Channels
The following table summarises the channels available for the Energy Switch + Energy Switch +.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Energy Switch + Energy Switch +.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Set to Default | If value is set to 0XFF (255), device set to default |
| 2: Amount of decimals | If value is set to 1 the info shall be presented with 1 decimal |
| 3: Power Limit | The device will shut down when it reaches an amount higher then defined (W) |
| 4: Start up with last known socket status | If 0 then the device will always be off, when 1-255 it will emain the last known state |
| 6: Auto report % | The value will change when the % is changed. |
| 7: Auto report Watt | The value will change when the Watt is changed. |
| 8: Auto report time | The time between 2 of the meter rerport |
| 9: Relais delay time | The time that needs to pass before the next state change |
| 10: Led indicator | The state of the Led compared to the relais state |


#### 1: Set to Default

If value is set to 0XFF (255), device set to default


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 2: Amount of decimals

If value is set to 1 the info shall be presented with 1 decimal  


##### Overview 

0,1,2,3 amount of decimals. Every Amount higher then 3 shall be printed as 3 decimals.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 3 |
| Default Value | 0 |


#### 3: Power Limit

The device will shut down when it reaches an amount higher then defined (W)  


##### Overview 

0 = no power limit.

1-4500 are acceptable values and can be used, everything above the 4500 shall be changed to 4500.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 4500 |
| Default Value | 4500 |


#### 4: Start up with last known socket status

If 0 then the device will always be off, when 1-255 it will emain the last known state


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


#### 6: Auto report %

The value will change when the % is changed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 10 to 100 |
| Default Value | 20 |


#### 7: Auto report Watt

The value will change when the Watt is changed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_7_1 |
| Data Type        | INTEGER |
| Range | 5 to 255 |
| Default Value | 10 |


#### 8: Auto report time

The time between 2 of the meter rerport


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_8_1 |
| Data Type        | INTEGER |
| Range | 10 to 255 |
| Default Value | 20 |


#### 9: Relais delay time

The time that needs to pass before the next state change  


##### Overview 

Value \* 10 miliseconds


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_9_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 50 |


#### 10: Led indicator

The state of the Led compared to the relais state  


##### Overview 

0 = Indication Led never off

1 = led ON when relais ON

2 = led On when relais OFF


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_10_1 |
| Data Type        | INTEGER |
| Range | 0 to 2 |
| Default Value | 0 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/445).
