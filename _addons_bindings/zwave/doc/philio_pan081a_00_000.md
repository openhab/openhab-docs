---
layout: documentation
title: PAN08-1a - ZWave
---

{% include base.html %}

# PAN08-1a Roller shutter controller

This describes the Z-Wave device *PAN08-1a*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pan081a_00_000```. 

Roller shutter controller  


## Overview 

The in-wall Roller Shutter Controller is designed to switch rise/lower roller shutter  
connected to its terminals using radio waves, controllers and a push button directly  
connected to this Roller Controller.  
This in-wall Roller Shutter Controller is a transceiver which is a Z-Wave PlusTM  
enabled device and is fully compatible with any Z-WaveTM enabled network. Slim  
design let the Controller can easily hide itself into the wall box and that will be good  
for the house decoration.  
The new smart relay calibration technology can reduce the inrush current caused by  
the load and let the module work perfectly with many kind of Roller Shutter.  
This in-wall Roller Shutter Controller is able to detect position of the Shutter by using  
the patterned power measuring method, so it can be remote controlled not only fully  
up or down , but also can be adjusted to ex. 30% or 50%. And when manual  
controlled by push button, the controller also can memorize the position and send the  
new shutter position to its controller (ex. IP-Gateway).

  


### Inclusion Information 

In the front casing, there is an include button with LED indicator below which is used  
to carry out inclusion, exclusion, reset or association. When first power is applied, its  
LED flashes on and off alternately and repeatedly at 0.5 second intervals. It implies  
that it has not been assigned a node ID and start auto inclusion.

The function of auto inclusion will be executed as long as the PAN08 does not have  
Node ID and just connect the PAN08 to main power.

Note: Auto inclusion timeout is 2 minute during which the node information of  
explorer frame will be emitted once every several seconds.

  


### Exclusion Information 

 Put your Z-Wave controller into  
exclusion mode by following the  
instructions provided by the  
controller manufacturer.

 Pressing Include button three times  
within 2 seconds will enter exclusion  
mode.

  


### Wakeup Information 

Device is not battery operated, hence no wakeup procedure.


## Channels
The following table summarises the channels available for the PAN08-1a Roller shutter controller.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Scene Number | scene_number | scene_number |  | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (power factor) | meter_powerfactor | meter_powerfactor | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (amps) | meter_current | meter_current | Energy | Number |
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |


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
The following table provides a summary of the configuration parameters available in the PAN08-1a Roller shutter controller.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Watt meter report interval (5s) | Interval (x5 seconds) to send out watt meter report |
| 2: KWH Meter Report Interval (10min) | Interval (x10 minutes) to send out KWH Meter Report |
| 3: Threshold for Load Caution (10mA) | Threshold (x0.01A) of current for Load Caution |
| 4: Threshold of KWh for Load Caution |  |
| 5: External SwitchType | Sets the type of an external switch |
| 6: Level report mode | Sets the way the controller reports the shutter level |
| 1: Blind Control |  |


#### 1: Watt meter report interval (5s)

Interval (x5 seconds) to send out watt meter report


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 720 |


#### 2: KWH Meter Report Interval (10min)

Interval (x10 minutes) to send out KWH Meter Report


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_2 |
| Data Type        | INTEGER |
| Range | 1 to 32767 |
| Default Value | 6 |


#### 3: Threshold for Load Caution (10mA)

Threshold (x0.01A) of current for Load Caution


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 1 to 1100 |
| Default Value | 500 |


#### 4: Threshold of KWh for Load Caution


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_2 |
| Data Type        | INTEGER |
| Range | 1 to 10000 |
| Default Value | 10000 |


#### 5: External SwitchType

Sets the type of an external switch  


##### Overview 

1: One Push button

2: Two push bittons


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_5_1 |
| Data Type        | INTEGER |
| Range | 1 to 2 |
| Default Value | 2 |


#### 6: Level report mode

Sets the way the controller reports the shutter level  


##### Overview 

1: Report destination level in 5s

2: Report 10 percent level while running


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_6_1 |
| Data Type        | INTEGER |
| Range | 1 to 2 |
| Default Value | 2 |


#### 1: Blind Control


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/609).
