---
layout: documentation
title: SSA1/SSA2 - ZWave
---

{% include base.html %}

# SSA1/SSA2 Siren and Strobe Alarm

This describes the Z-Wave device *SSA1/SSA2*, manufactured by *FortrezZ LLC* with the thing type UID of ```fortrezz_ssa1_00_000```. 

Siren and Strobe Alarm  


## Overview 

## Description 

The SSA1/SSA2 is a Z-WaveTM enabled device and will sound a loud siren and flash a strobe light when an alarm message or alert is received on any Z-WaveTM enabled network.

 *  SSA1: Clear lense
 *  SSA2: Red lense

## Testing the SSA1 

After connecting power to the SSA1, you can test the alarm mode after manually exiting the Network Wide Inclusion (NWI) mode by pressing the button once or after the unit is included into any Z-WaveTM enabled network. To test the SSA1, press and hold the button. The SSA1 will turn on and remain on until the button is released. While the siren is on, it will continually cycle for 1 second off / 4 seconds on for up to 5 minutes or until it is turned off. While the strobe is on, the unit will flash at a rate of once per second.

  


### Inclusion Information 

1.  Set up the inclusion mode at the controller (If the controller supports NWI, the SSA1 will automatically be included at power on);
2.  If the controller does not support NWI, press the SSA1 button once to exit NWI mode.
3.  Press the button again to include the unit in the network. The controller will indicate that the unit has been included in the network. Also, the Status LED will flash when the inclusion completes. Inclusion and exclusion are always done at normal transmit power mode.

  


### Exclusion Information 

1.  Set up the exclusion mode at the controller
2.  Press the SSA1 button once. The SSA1 will be removed from the network and the Status LED will flash. 


## Channels
The following table summarises the channels available for the SSA1/SSA2 Siren and Strobe Alarm.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |


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
The following table provides a summary of the configuration parameters available in the SSA1/SSA2 Siren and Strobe Alarm.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Delay before accept of Basic Set Off | Delay, from the time the siren-strobe turns on, before the Basic Set Off command is accept... |


#### 1: Delay before accept of Basic Set Off

Delay, from the time the siren-strobe turns on, before the Basic Set Off command is accepted.  


##### Overview 

Delay, from the time the siren-strobe turns on, before the Basic Set Off command is accepted; 1 Byte (in seconds, default is 0, interpreted as unsigned integer for negative values sent in set command). This could be used, for example, to avoid the situation where an associated window/door sensor turns the SSA1 alarm on and then immediately off when the window/door is opened and then quickly closed.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 0 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/220).
