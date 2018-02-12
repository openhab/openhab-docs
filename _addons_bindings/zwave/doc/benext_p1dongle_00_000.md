---
layout: documentation
title: P1-dongle - ZWave
---

{% include base.html %}

# P1-dongle P1-dongle

This describes the Z-Wave device *P1-dongle*, manufactured by *BeNext* with the thing type UID of ```benext_p1dongle_00_000```. 

P1-dongle  


## Overview 

The P1-dongle sends smart meter data wirelessly to your controller, helping you get insight of your consumption and things like the overall yield of your solar panels. The P1-dongle can connect to smart meters that support DSMR (Dutch Smart Meter Reader Protocol) eg. all smart meters with a P1-connector.

LED Status Information

 *  Ready to install: LED pulse once per second
 *  Including: LED pulse twice per second
 *  Excluding: LED pulse three times per 1.5 second
 *  Include Successful: LED on for one second
 *  Ready and operating in a Z-Wave network: LED continuously on
 *  No ready and not included in a Z-Wave network: LED pulse once per second

  


### Inclusion Information 

 *  Put you controller in inclusion mode
 *  Connect the P1 Dongle to your Smart Meter (use a power source when needed)
 *  The P1 Dongle will switch to Network Wide Inclusion automatically

Use the button to switch the P1 Dongle to Inclusion (LED pulse twice per second) or Exclusion / Reset (LED pulse three times per 1.5 second) mode

  


### Exclusion Information 

 *  Put your controller and the P1 Dongle in exclusion mode (LED pulse three times per 1.5 second)
 *  The dongle will exclude from it's former network and reset to node ID zero 
 *  If the P1 Dongle wasn't included in a network before, this procedure will act as a node reset

Use the button to switch the P1 Dongle to Inclusion (LED pulse twice per second) or Exclusion / Reset (LED pulse three times per 1.5 second) mode


## Channels
The following table summarises the channels available for the P1-dongle P1-dongle.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) 1 | meter_kwh1 | meter_kwh | Energy | Number |
| Electric meter (watts) 1 | meter_watts1 | meter_watts | Energy | Number |
| Electric meter (kWh) 2 | meter_kwh2 | meter_kwh | Energy | Number |
| Electric meter (watts) 2 | meter_watts2 | meter_watts | Energy | Number |
| Gas meter (G_Cubic_Meters) 3 | meter_gas_cubic_meters3 | meter_gas_cubic_meters | Energy | Number |


### Device Configuration
The following table provides a summary of the configuration parameters available in the P1-dongle P1-dongle.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 4: Baud Rate | Baud rate: the rate the device sends data between the smart meter and z-wave |


#### 4: Baud Rate

Baud rate: the rate the device sends data between the smart meter and z-wave  


##### Overview 

Set BAUD rate value \* 100.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 0 to 40000 |
| Default Value | 1152 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/340).
