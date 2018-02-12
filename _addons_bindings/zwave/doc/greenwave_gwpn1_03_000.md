---
layout: documentation
title: GWPN1 - ZWave
---

{% include base.html %}

# GWPN1 Single-socket PowerNode

This describes the Z-Wave device *GWPN1*, manufactured by *GreenWave Reality Inc.* with the thing type UID of ```greenwave_gwpn1_03_000```. 

Single-socket PowerNode  


## Overview 

This Configuration is for the 1 plug version of the PowerNode.

It should work for both NS210 and NS310 devices.

  


### Inclusion Information 

On the PowerNode, press and hold the **Sync** button for approximately one second until the activity indicator displays a clockwise rotating pattern. This indicates the PowerNode is attempting inclusion. During this process, verify that the Gateway activity indicator still displays a clockwise rotating pattern.

After a few seconds, the rotating pattern on both the PowerNode and the Gateway stops. All bars turn green forming a circle for several seconds. This indicates a successful inclusion.

If all bars on the activity indicator start flashing instead of forming a solid circle, then the PowerNode inclusion process has failed, and you must start the sync process again. If syncing continually fails even though the PowerNode is close to the Gateway, then it may be an indication of a hardware fault, and the PowerNode might need replacing.

  


### Exclusion Information 

On the PowerNode, press and hold the **Sync** button for approximately one second until the PowerNode activity indicator begins to display a counter-clockwise rotating pattern. The PowerNode is attempting exclusion.


## Channels
The following table summarises the channels available for the GWPN1 Single-socket PowerNode.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number |
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number |
| Reset total power consumption | meter_reset | meter_reset | Energy | Switch |
| Alarm | alarm_general | alarm_general | Door | Switch |


### Device Configuration
The following table provides a summary of the configuration parameters available in the GWPN1 Single-socket PowerNode.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 0: Min. variation of load current | Minimum variation in load current before a message is sent. |
| 1: No communication light | Minutes after which the device will flash if controller communicate is lost |
| 2: Wheel position | Wheel position on the GreenWave device (read-only) |
| 3: Power-on state | Default state after power loss |
| 4: LED for network error | If the LED should indicate a network error by flashing or not |
| 1: Wheel position change |  |
| 2: Current leakage on relay |  |
| 3: Power level change |  |
| 4: Over-current detection |  |


#### 0: Min. variation of load current

Minimum variation in load current before a message is sent.  


##### Overview 

 Value in percent (30 => 30%)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_0_1 |
| Data Type        | INTEGER |
| Range | 0 to 100 |
| Default Value | 0 |


#### 1: No communication light

Minutes after which the device will flash if controller communicate is lost


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 2 |


#### 2: Wheel position

Wheel position on the GreenWave device (read-only)


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Black (128) |
|  | Green (129) |
|  | Dark Blue (130) |
|  | Red (131) |
|  | Yellow (132) |
|  | Purple (133) |
|  | Orange (134) |
|  | Light Blue (135) |
|  | Pink (136) |
|  | Locked (137) |


#### 3: Power-on state

Default state after power loss


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_1 |
| Data Type        | INTEGER || Default Value | 2 |
| Options | All OFF (0) |
|  | Remember last state (1) |
|  | All ON (2) |


#### 4: LED for network error

If the LED should indicate a network error by flashing or not


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_4_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Disable the LED for network error (0) |
|  | Enable the LED for network error (1) |


#### 1: Wheel position change


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Current leakage on relay


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Power level change

  


##### Overview 

The new power reading is sent if the delta of the change is greater than the defined minimum variation.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Over-current detection


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/102).
