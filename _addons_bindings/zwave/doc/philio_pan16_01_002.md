---
layout: documentation
title: PAN16 - ZWave
---

{% include base.html %}

# PAN16 Smart Energy Plug In Switch

This describes the Z-Wave device *PAN16*, manufactured by *Philio Technology Corp* with the thing type UID of ```philio_pan16_01_002```. 

Smart Energy Plug In Switch  


## Overview 

This plug-in ON/OFF switch PAN16 is a security enabled Z-Wave Plus product, based on Z-Wave Plus technology. The device will enable security mode automatically if the controller supports security mode, too. Z-Wave PlusTM enabled devices displaying the Z-Wave PlusTM logo can also be used with it regardless of the manufacturer, and can also be used in other manufacturer’s Z-WaveTM enabled networks. Remote On/Off control of the connected load is possible with other manufacturer’s wireless Controller. Each switch is designed to act as a repeater. Repeaters will re-transmit the RF signal to ensure that the signal is received by its intended destination by routing the signal around obstacles and radio dead spots. Because PAN16 supports Security Command Class, it can learn with a Secured enabled Z-Wave controller to fully utilize the device. Its functionality and supported command classes is identical when included as a secure and non-secure device.   
This plug-in ON/OFF switch is able to detect instance wattage (3000W/230Vac) (13Ampere) and overload current (14.5A with resistive load) of connected lights or appliances. When detecting overload state, the Switch will be disabled and its On/Off button will be lockout of which LED will flash quickly. However, unplug and re-connect the switch will reset its overload condition to normal status.   
Adding to Z-WaveTM Network   
In the front casing, there is an On/Off button with LED indicator which is used to toggle switch on and off or carry out inclusion, exclusion, reset or association. When first power is applied, its LED flashes on and off alternately and repeatedly at 0.5 second intervals. It implies that it has not been assigned a node ID and start auto inclusion.   
Auto Inclusion   
The function of auto inclusion will be executed as long as the switch does not have Node ID and just plug the switch into a wall outlet.   
Note: Auto inclusion timeout is 2 minute during which the node information of explorer frame will be emitted once several seconds. Unlike “inclusion” function as shown in the table below, the execution of auto inclusion is free from pressing the On/Off button on the Switch. 


## Channels
The following table summarises the channels available for the PAN16 Smart Energy Plug In Switch.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (volts) | meter_voltage | meter_voltage | Energy | Number |
| Electric meter (amps) | meter_current | meter_current | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (power factor) | meter_powerfactor | meter_powerfactor | Energy | Number |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the PAN16 Smart Energy Plug In Switch.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Report |  |


#### 1: Report


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/642).
