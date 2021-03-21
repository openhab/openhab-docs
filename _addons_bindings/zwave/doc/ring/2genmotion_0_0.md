---
layout: documentation
title: 2Gen Motion - ZWave
---

{% include base.html %}

# 2Gen Motion 2nd Gen Motion Sensor
This describes the Z-Wave device *2Gen Motion*, manufactured by *Ring* with the thing type UID of ```ring_2genmotion_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![2Gen Motion product image](https://opensmarthouse.org/zwavedatabase/1361/image/)


The 2Gen Motion supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Ring Alarm Motion Detector is a wireless sensor for the Ring Alarm system which provides users the ability to know when there is movement of a person or similar object within an area. 

Notes:

1. This product can be operated in any Z-Wave™ network with other Z-Wave certified devices from other manufacturers. All mains operated nodes within the network will act as repeaters regardless of vendor to increase reliability of the network.

### Inclusion Information

 After powering on the device, press and hold the button on the front of the device for ~3 seconds.  


Release the button and the device will enter Classic inclusion mode which implements both classic inclusion with a Node Information Frame, and Network Wide Inclusion. 

During Classic Inclusion mode, the green LED will blink three times followed by a brief pause, repeatedly. When Classic inclusion times-out, the device will blink alternating red and green a few times.

### Exclusion Information

1. Locate the pinhole reset button on the back of the device in the battery compartment.  


2. With the controller in Remove (Z-Wave Exclusion) mode, use a paper clip or similar object and tap the pinhole button. The device’s red LED turns on solid to indicate the device was removed from the network.

### General Usage Information



## Channels

The following table summarises the channels available for the 2Gen Motion -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (burglar)
Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 12 configuration parameters available in the 2Gen Motion.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Heartbeats | Number minutes between heartbeats. |
| 2 | Number of  App Retries | Number of application level retries attempted |
| 3 | App Level Retry Base Wait | Application Level Retry Base Wait Time Period |
| 4 | LED configuration | configure the various LED indications on the device |
| 5 | Supervisory Retry Wait | Supervisory Retry Wait |
| 6 | Occupancy Clear Delay | Occupancy Clear Delay |
| 7 | Intrusion Clear Delay | Intrusion Clear Delay |
| 8 | Standard Clear Delay | Standard Clear Delay |
| 9 | Motion Detection Mode | Motion Detection Mode |
| 10 | Any Motion Threshold | Any Motion Threshold |
| 11 | Lighting Enabled | Lighting Enabled |
| 12 | Lighting Delay | Lighting Delay |

### Parameter 1: Heartbeats

Number minutes between heartbeats.
Heartbeats are automatic battery reports on a timer after the last event.
Values in the range 1 to 70 may be set.

The manufacturer defined default value is ```70```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Number of  App Retries

Number of application level retries attempted
Number of application level retries attempted for messages either not ACKed or messages encapsulated via supervision get that did not receive a report.
Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: App Level Retry Base Wait

Application Level Retry Base Wait Time Period
The number base seconds used in the calculation for sleeping between retry messages.
Values in the range 1 to 60 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: LED configuration

configure the various LED indications on the device
0 == Don’t show green 

1 == Show green after Supervision Report Intrusion (Fault) 

2 == Show green after Supervision Report both Intrusion and Intrusion clear
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Don’t show green |
| 1 | Show green after Supervision Report Intrusion (Fault) |
| 2 | Show green after Supervision Report both Intrusion and Intrusion clear |

The manufacturer defined default value is ```1``` (Show green after Supervision Report Intrusion (Fault) ).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Supervisory Retry Wait

Supervisory Retry Wait
The number of milliseconds waiting for a Supervisory Report response to a Supervisory Get encapsulated command from the sensor before attempting a retry.
Values in the range 500 to 5000 may be set.

The manufacturer defined default value is ```1500```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Occupancy Clear Delay

Occupancy Clear Delay

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Intrusion Clear Delay

Intrusion Clear Delay

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Standard Clear Delay

Standard Clear Delay

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Motion Detection Mode

Motion Detection Mode

Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Any Motion Threshold

Any Motion Threshold

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```80```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Lighting Enabled

Lighting Enabled

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Lighting Delay

Lighting Delay

Values in the range 0 to 60 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The 2Gen Motion supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
1. Notification Report a. See notification CC section for notifications that are sent 2. Battery Report 3. Device Reset Locally Notification


Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Z Wave Technical Manual](https://opensmarthouse.org/zwavedatabase/1361/reference/Ring_Alarm_Motion_Detector_Zwave.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1361).
