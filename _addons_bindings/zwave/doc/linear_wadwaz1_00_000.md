---
layout: documentation
title: WADWAZ-1 - ZWave
---

{% include base.html %}

# WADWAZ-1 Door/Windows Sensor

This describes the Z-Wave device *WADWAZ-1*, manufactured by *Linear Corp* with the thing type UID of ```linear_wadwaz1_00_000```. 

Door/Windows Sensor  


## Overview 

Linear Z-Wave products are easy to install, and allow dealers to create an integrated wireless network with nearly limitless expansion and interoperability with security and health monitoring systems, energy management, home entertainment, appliances, and more.

The WADWAZ-1 sensor monitors a door or window and sends Z-Wave signals when the door is opened or closed.

  


### Inclusion Information 

Refer to your Controller operating instructions to add this module under the command of the Wireless Controller.

1.  Unscrew the screw fastening the rear cover and slide the rear cover down.
2.  Insert a CR123A battery into the battery compartment and LED will start to fl ash slowly, which means the sensor has not yet performed “inclusion” with the Controller.
3.  Prepare the Controller to include a unit to the network by adding it to a group (method of adding a node to the network). Refer to the Controller instructions.
4.  If your Controller supports Network Wide Inclusion (NWI) locate the WADWAZ-1 near the proposed installation location. If not skip to Step 6.
5.  With your Controller in Inclusion mode, you should see an indication on your Controller that the “device was included” in the network. It should display binary switch / Linear. The LED will stop blinking. Skip to Step 9. If the LED does not stop blinking, relocate the WADWAZ-1 to within 100 feet (line of sight) of a Z-Wave device or your hub and repeat Step 5. If the LED continues to blink, your Controller does not support NWI and continue with Step 6.
6.  Place the WADWAZ-1 within 3 feet of the Controller.
7.  With your Controller in Inclusion mode, depress the Program switch for 1 second then release.
8.  You should see an indication on your Controller that the “device was included” in the network. It should display binary switch / Linear. The LED will stop blinking.
9.  The device will appear in the list of Switches

**NOTE**: If you have trouble adding the WADWAZ-1 to a group it may be that the Home ID and Node ID were not cleared from it after testing. You must first “RESET UNIT” with your Controller to remove it from the network. Although adding it to a group includes it in the network, removing it from a group does not remove it from the network. If removed from a group, it functions as a repeater (only). “RESET UNIT” removes it completely from the network

  


### Exclusion Information 

For “Exclusion” from (removing from) a network:

1.  Set up the Z-WaveTM Interface Controller into “exclusion” mode, and following its instruction to delete the WADWAZ-1 from the Controller.
2.  Press the Program switch of WADWAZ-1 for 1 second and release to be excluded. The LED light will fl ash continuously when the sensor is in the Exclusion condition.


## Channels
The following table summarises the channels available for the WADWAZ-1 Door/Windows Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_door | sensor_door | Door | Contact |
| Door Alarm | alarm_entry | alarm_entry | Door | Switch |
| Tamper Alarm | alarm_general | alarm_general | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the WADWAZ-1 Door/Windows Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Controller Updates |  |


#### 1: Controller Updates


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/9).
