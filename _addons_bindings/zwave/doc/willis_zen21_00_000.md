---
layout: documentation
title: ZEN21 - ZWave
---

{% include base.html %}

# ZEN21 Zooz Z-Wave On / Off Light Switch ZEN21

This describes the Z-Wave device *ZEN21*, manufactured by *Willis Electric Co., Ltd.* with the thing type UID of ```willis_zen21_00_000```. 

Zooz Z-Wave On / Off Light Switch ZEN21  


## Overview 

PRODUCT FEATURES:   
\- Manual or remote on/off control from your mobile device or computer (when included to a Z-Wave gateway controller)   
\- Z-Wave Plus with improved 500 chip for faster and safer wireless communication   
\- Works with LED, CFL, and incandescent bulbs   
\- Based on universal binary switch command class - supported by most Z-Wave controllers   
\- May be associated and grouped with other Z-Wave devices for advanced home automation   
\- Simple elegant design with screwless snap-on wall plate included   
\- Built-in Z-Wave signal repeater for a stronger and more reliable network   
\- Single pole installation only, neutral wire required   
  
SPECIFICATIONS:   
Model Number: ZEN21   
Z-Wave Signal Frequency: 908.42 MHz   
Power: 120 VAC, 60 Hz   
Maximum Loads: 960W Incandescent, 1800W (15A) Resistive, ½ HP Motor   
Range: Up to 100 feet line of sight between the Wireless Controller and the closest Z-Wave receiver module   
Operating Temperature: 32-104° F (0-40° C)   
Installation and Use: Indoor only

  


### Inclusion Information 

1. Bring your Z-Wave gateway hub or controller as close to the switch as possible

2. Put your Z-Wave controller in inclusion mode

3. Tap the switch on and off quickly 3 times to finalize the inclusion process

4. A new on/off device should appear on your controller's device list

Troubleshooting Tips:

If you are unable to include the Z-Wave switch to your controller, please try one of the following:

\- Bring the controller closer to your Z-Wave switch or use a hand-held secondary controller for inclusion

\- Tap your Z-Wave switch quicker 4 or 5 times once you put the controller in the inclusion mode to ensure the command has gone through

\- Put your controller in the EXCLUSION mode and tap the switch quickly 3 times, then try adding it to your network again 

  


### Exclusion Information 

1. Bring your Z-Wave gateway hub or controller as close to the switch as possible

2. Put your Z-Wave controller in exclusion mode

3. Tap the switch on and off quickly 3 times to complete the exclusion process

4. The device should disappear from your controller's device list

Please repeat the process following all steps carefully if the first attempt is unsuccessful 

  


### Wakeup Information 

The switch will be reset to factory defaults only by exclusion using a Z-Wave controller. You may use any certified Z-Wave controller to exclude and reset the switch. This device may not be reset manually when the network’s primary controller is missing or otherwise inoperable. NOTE: All previously recorded activity and custom settings will be erased from the device’s memory. 


## Channels
The following table summarises the channels available for the ZEN21 Zooz Z-Wave On / Off Light Switch ZEN21.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZEN21 Zooz Z-Wave On / Off Light Switch ZEN21.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Status | This device will send SWITCH BINARY REPORT to Group 1 when operated manually. |


#### 1: Status

This device will send SWITCH BINARY REPORT to Group 1 when operated manually.  


##### Overview 

Depending on your Z-Wave gateway's home automation software capabilities, you may be able to associate your Z-Wave switch in groups with other Z-Wave devices to schedule scenes and create events. This on off switch supports Group 1 with up to five devices for lifeline communication. This device will send SWITCH BINARY REPORT to Group 1 when operated manually. Please refer to your controller's user guide for advanced programming instructions as they are a little different for every software.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/544).
