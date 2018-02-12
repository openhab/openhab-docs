---
layout: documentation
title: Ecolink PIR v2.5 - ZWave
---

{% include base.html %}

# Ecolink PIR v2.5 Z-Wave PIR Motion Sensor v2.5

This describes the Z-Wave device *Ecolink PIR v2.5*, manufactured by *Ecolink* with the thing type UID of ```eco_ecolinkpirv25_00_000```. 

Z-Wave PIR Motion Sensor v2.5  


## Overview 

**Overview:**

This is a hardware revision update to EcoLink's prior PIR sensor.  It provides the same general capabilities as the prior detector--motion detection, battery state messages, and "burgler" alarm for the case being opened.  On motion detection a green LED will flash and the notification will be sent to Group 1.

**Association Groups:**

The device has two association groups of up to 5 nodes each.

**Configuration Parameters:**

The device has two configuration parameters. Parameter 1 configures the sensor to send or not send Basic Set commands of 0x00 to nodes in Association group 2 turning the devices off when the sensor is in a restored state (i.e. motion not detected).  By default the sensor does NOT send Basic Set commands of 0x00.  Paremter 2 configures the sensor to either send or not to send Sensor Binary Report commands to Association Group 1 when the sensor is faulted and restored.  If the controller is fully compatible with the Notification Command Class thereby making the Sensor Binary Reports redundant, the controller  can disable the Sensor Binary Report Commands completely.

  


### Inclusion Information 

Initial device inclusion is started by removing the pull tab from the back of the unit.  This connects the battery and the device will immediately be eligible for inclusion.  Place your controller in inclusion mode prior to pulling the tab from the back.

The manual indicates network-wide inclusion is supported, but also indicates that the device should be within 15 feet of the controller during the inclusion process.


## Channels
The following table summarises the channels available for the Ecolink PIR v2.5 Z-Wave PIR Motion Sensor v2.5.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (power) | alarm_power | alarm_power | Door | Switch |
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Ecolink PIR v2.5 Z-Wave PIR Motion Sensor v2.5.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Send Basic Sets | Send or do not send Basic Set commands to AG2 |
| 2: Send Binary Reports | Send Sensor Binary Reports for backward compatibility |
| 1: Group 1 |  |
| 2: Group 2 |  |


#### 1: Send Basic Sets

Send or do not send Basic Set commands to AG2  


##### Overview 

Parameter 1 configures the sensor to send or not send Basic Set commands of 0x00 to nodes in Association group 2 turning the devices off when the sensor is in a restored state (i.e. motion not detected).  By default the sensor does NOT send Basic Set commands of 0x00.

Configuration Value: 0x00:

(Default) Sensor does NOT send Basic Sets to Node IDs in Association Group 2 when the sensor is restored (i.e. Motion Not Detected)

Configuration Value: 0xFF:

Sensor sends Basic Sets of 0x00 to nodes in Association Group2 when sensor is restored


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Do not send (0) |
|  | Send Basic Sets (255) |


#### 2: Send Binary Reports

Send Sensor Binary Reports for backward compatibility  


##### Overview 

Paremter 2 configures the sensor to either send or not to send Sensor Binary Report commands to Association Group 1 when the sensor is faulted and restored.  If the controller is fully compatible with the Notification Command Class thereby making the Sensor Binary Reports redundant, the controller  can disable the Sensor Binary Report Commands completely.

Configuration Value: 0x00:

(Default) Sensor sends Sensor Binary Reports when sensor is faulted and restored for backwards compatibility in addition to Notification Reports.

Configuration Value: 0xFF:

Sensor will send only Notification Reports and NOT Sensor Binary Reports when the sensor is faulted and restored.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER || Default Value | 0 |
| Options | Send Sensor Binary Reports (0) |
|  | Send only Notification Reports (255) |


#### 1: Group 1

  


##### Overview 

Group 1 is a lifeline group who will receive unsolicited messages relating to motion detection notifications, case tampering notifications, low-battery notifications, and snsor binary reports.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Group 2

  


##### Overview 

Group 2 is intended for devices that are to be controlled i.e. turned on or off (on only by default) with a Basic Set.  On inclusion the controller should put its node ID in group 1 but not in group 2.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/525).
