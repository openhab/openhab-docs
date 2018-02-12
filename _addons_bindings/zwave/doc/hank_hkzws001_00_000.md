---
layout: documentation
title: HKZW-SO01 - ZWave
---

{% include base.html %}

# HKZW-SO01 Smart Plug with two USB ports

This describes the Z-Wave device *HKZW-SO01*, manufactured by *Hank* with the thing type UID of ```hank_hkzws001_00_000```. 

Smart Plug with two USB ports  


## Overview 

Hank Smart Plug is a Z-Wave Switch plugin module specifically used to enable Z-Wave command and control (On/Off) of any plug-in tool. It can report wattage consumption or kWh energy usage. Smart Plug is also a security Z-Wave device and supports Over The Air (OTA) feature for the product's firmware upgrade.

Based on the Z-Wave Plus specification.

Features List:

1.  Supports 1xAC output and 2xUSB outputs;
2.  AC output switch on/off by manual or Z-Wave command;
3.  LED indicates the working status;
4.  Z-Wave plus compatible (500 serials Product);
5.  Supporting power meter;
6.  Supporting repeater role
7.  Supporting firmware OTA

  


### Inclusion Information 

Manual Z-Wave network inclusion:

(1) Connect the power supply.

(2) Set the Z-Wave network main controller into learning mode (see Z-Wave network controller operating manual).

(3) Triple click the Z-button

(4) Smart Plug should be recognized and included into the Z-Wave network.

TIP:

If the LED indicator not blinking when inserting a Plug into a socket, it means the plug was already added in other existing network.

  


### Exclusion Information 

REMOVING FROM Z-WAVE NETWORK

To remove Smart Plug from the Z-Wave network:

(1) Insert the Plug into a socket,

(2) Set the Z-Wave network controller into the exclusion mode (see Z-Wave controller operating manual)

(3) Triple click the Z button.


## Channels
The following table summarises the channels available for the HKZW-SO01 Smart Plug with two USB ports.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Scene Number | scene_number | scene_number |  | Number |
| Electric meter (amps) | meter_current | meter_current | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the HKZW-SO01 Smart Plug with two USB ports.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 20: Overload Protection | If current exceeds 16.5A over 5 seconds, relay will turn off. |
| 21: Device Status after Power Failure | Define how the plug reacts after power failure |
| 24: Notifcation on Load Change | Smart Plug can send notifications to association device load state changes. |
| 27: Indicator Modes | LED in the device will indicate the state of load |
| 151: Threshold of power report | Power Threshold at which to send meter report |
| 152: Percentage Threshold of Power Report | Percentage Threshold at which to send meter report |
| 171: Power Report Frequency | The interval of sending power report to association device (Group Lifeline). |
| 172: Energy Report Frequency | The interval of sending energy report to association device (Group Lifeline). |
| 173: Voltage Report Frequency | The interval of sending voltage report to association device (Group Lifeline) |
| 174: Electricity Report Frequency | Interval for sending electricity report. |
| 1: Basic Report | Sends Basic Report at On/Off event |


#### 20: Overload Protection

If current exceeds 16.5A over 5 seconds, relay will turn off.  


##### Overview 

If current exceeds 16.5A over 5 seconds, relay will turn off.

0 - The function is disabled

1 - The function is enabled.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 1 |


#### 21: Device Status after Power Failure

Define how the plug reacts after power failure  


##### Overview 

Define how the plug reacts after power failure:

0 - Smart Plug returns to previous state after a power failure.

1 - Smart Plug does not memorize its state after a powerfailure.

Connected device will be on after the power supply is reconnected.

2 - Smart Plug does not memorize its state after a power failure.

Connected device will be off after the power supply is reconnected.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_21_1 |
| Data Type        | INTEGER |
| Range | 0 to 2 |
| Default Value | 0 |


#### 24: Notifcation on Load Change

Smart Plug can send notifications to association device load state changes.  


##### Overview 

Smart Plug can send notifications to association device load state changes.

0 -Disabled.

1 - Basic report.

2 - Basic report only when Load condition not changed by Z-WAVE Command.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_24_1 |
| Data Type        | INTEGER |
| Range | 0 to 2 |
| Default Value | 1 |


#### 27: Indicator Modes

LED in the device will indicate the state of load  


##### Overview 

After smart plug is included into a Z-Wave network, the LED in the device will indicate the state of load.

0 - The LED will follow the status (on/off) of its load.

1 - When the state of Switch’s load changed, The LED will follow the status (on/off) of its load, but the red LED will turn off after 5 seconds if there is not any switch action.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_27_1 |
| Data Type        | INTEGER |
| Range | 0 to 1 |
| Default Value | 0 |


#### 151: Threshold of power report

Power Threshold at which to send meter report  


##### Overview 

Power threshold to be interpreted, when the change value of load power exceeds the setting threshold, the smart plug will send meter report to association device (Group Lifeline).

Available settings: 0 - 65535 (0 - 65535W)

0 - The function is disabled.

Default setting: 50 (50W)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_151_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 50 |


#### 152: Percentage Threshold of Power Report

Percentage Threshold at which to send meter report  


##### Overview 

Power percentage threshold to be interpreted, when change value of the load power exceeds the setting threshold, the smart plug will send meter report to association device (Group Lifeline).

Available settings: 0 - 255 (0 - 255%)

0 - The function is disabled.

Default setting: 10 (10%)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_152_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 10 |


#### 171: Power Report Frequency

The interval of sending power report to association device (Group Lifeline).  


##### Overview 

The interval of sending power report to association device (Group Lifeline).

Available settings: 5- 2678400 (5 - 2678400 seconds)

0 -The function is disabled.

Default setting: 30 (30 seconds).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_171_4 |
| Data Type        | INTEGER |
| Range | 5 to 2678400 |
| Default Value | 30 |


#### 172: Energy Report Frequency

The interval of sending energy report to association device (Group Lifeline).  


##### Overview 

The interval of sending energy report to association device (Group Lifeline).

Available settings: 5- 2678400 (5 - 2678400 seconds)

0 -The function is disabled.

Default setting: 300 (300 seconds).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_172_4 |
| Data Type        | INTEGER |
| Range | 5 to 2678400 |
| Default Value | 300 |


#### 173: Voltage Report Frequency

The interval of sending voltage report to association device (Group Lifeline)  


##### Overview 

The interval of sending voltage report to association device (Group Lifeline)

Available settings: 5- 2678400 (5 - 2678400 seconds)

0 -The function is disabled.

Default setting: 0 (disabled).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_173_4 |
| Data Type        | INTEGER |
| Range | 0 to 2678400 |
| Default Value | 0 |


#### 174: Electricity Report Frequency

Interval for sending electricity report.  


##### Overview 

The interval of sending electricity report to association device (Group Lifeline).

Available settings: 5- 2678400 (5 - 2678400 seconds)

0 -The function is disabled.

Default setting: 0 (disabled).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_174_4 |
| Data Type        | INTEGER |
| Range | 0 to 2678400 |
| Default Value | 0 |


#### 1: Basic Report

Sends Basic Report at On/Off event  


##### Overview 

Association command class allows Smart Plug to communicate with other Z-Wave devices directly, such as sending BASIC REPORT whenever the smart plug is turn on or off.

Smart Plug supports 1 association grouping.

The max number of associated nodes is 5.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/570).
