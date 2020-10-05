---
layout: documentation
title: ZCOMBO-G - ZWave
---

{% include base.html %}

# ZCOMBO-G Smoke and Carbon Monoxide Alarm
This describes the Z-Wave device *ZCOMBO-G*, manufactured by *BRK Brands, Inc.* with the thing type UID of ```brk_zcombog_00_000```.

The device is in the category of *Smoke Detector*, defining Smoke detectors.

![ZCOMBO-G product image](https://opensmarthouse.org/zwavedatabase/1295/image/)


The ZCOMBO-G supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The ZCOMBO-G does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The Z-Wave Smoke/CO alarm can be implemented in residential and institutional applications. Installation settings include sleeping areas within hospitals, hotels, motels, dormitories and other multi-family dwellings that are defined in standard NFPA 101.

The First Alert ZCOMBO-G Smoke and Carbon Monoxide Detector has been fully tested and complies with UL217, UL2034, CSFM, NFPA 720, NFPA 101 and other agencies that model their codes after the above agencies. The combination alarm meets building codes that require the use of a battery operated Z-Wave wireless Smoke and CO detector. This First Alert Z-Wave Combination Alarm includes silence features and meets the model building codes published by the ICC.

The First Alert Z-Wave Combo Alarm includes: an insect screened photoelectric smoke sensing chamber, electrochemical carbon monoxide sensor, 85dB horn, supervised 3V (2 AA batteries) power supply, full function test switch and a silence feature.

The First Alert Z-Wave Enabled Battery Smoke & Carbon Monoxide Combo Alarm includes a battery drawer that prevents battery removal and tamper resistant locking pins that lock the alarm to the mounting bracket. This First Alert Combination Alarm is an ideal fit for any number of applications that include apartments, dormitories, and hotels. Designed for wall or ceiling mounting, this alarm includes all of the required mounting anchors and screws needed for easy installation.

### Inclusion Information

  


  1. Slide battery door open.
  2. Insert batteries checking the correct orientation.
  3. Press and hold the test button. Keep it held down as you slide the battery drawer closed. You may then release the button.NOTE: Use only your finger or thumb on the test button. The use of any other instrument is strictly prohibited.

### Exclusion Information

  


  1. Slide battery door open.
  2. Remove and re-insert batteries checking the correct orientation.
  3. Press and hold the test button. Keep it held down as you slide the battery drawer closed. You may then release the button.

NOTE: Use only your finger or thumb on the test button. The use of any other instrument is strictly prohibited.

### Wakeup Information

The ZCOMBO-G does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


PROCEDURE TO MANUALLY WAKE-UP THE DEVICE

To manual wake-up the device, slide the battery door open wait for ~5 seconds and then slide the battery drawer closed. Upon power-up, the device will send the wake-up notification.

### General Usage Information

**Discovery in Openhab**

When including in OpenHAB, the wakeup procedure in the manual does not work for fully discovering the device.

Slide the battery door open wait for ~5 seconds.  Hold the TEST button and then slide the battery drawer closed.  Release the TEST button when the device beeps. This must be repeated 4 or 5 times for complete discovery  


**Events in Notification Command Class**

The attached ZCOMBO Z-Wave Specification document has details on all the event notifications that are supported.  The document also has 2 diagrams outlining the flow of messages that will aid in the development of OpenHAB rules.

## Channels

The following table summarises the channels available for the ZCOMBO-G -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Alarm (CO) | alarm_co | alarm_co |  | Switch | 
| Alarm (smoke) | alarm_smoke | alarm_smoke | Smoke | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (CO)
Indicates if the carbon monoxide alarm is triggered.

The ```alarm_co``` channel is of type ```alarm_co``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (smoke)
Indicates if a smoke is triggered.

The ```alarm_smoke``` channel is of type ```alarm_smoke``` and supports the ```Switch``` item and is in the ```Smoke``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 3 configuration parameters available in the ZCOMBO-G.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | SuperVision report timeout | ZCOMBO will send the message over SuperVision Command Class and it will wait for the SuperVision report from the Controller for the SuperVision report timeout time. |
| 2 | SuperVision retry count | If the SuperVision report is not received within the SuperVision report timeout time, the ZCOMBO will retry sending the message again. Upon exceeding the max retry, the ZCOMBO device will send the next message available in the queue. |
| 3 | SuperVision wait time | Before retrying the message, ZCOMBO will wait for the SuperVision wait time. |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: SuperVision report timeout

ZCOMBO will send the message over SuperVision Command Class and it will wait for the SuperVision report from the Controller for the SuperVision report timeout time.

Values in the range 500 to 5000 may be set.

The manufacturer defined default value is ```1500```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: SuperVision retry count

If the SuperVision report is not received within the SuperVision report timeout time, the ZCOMBO will retry sending the message again. Upon exceeding the max retry, the ZCOMBO device will send the next message available in the queue.

Values in the range 0 to 5 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: SuperVision wait time

Before retrying the message, ZCOMBO will wait for the SuperVision wait time.
Actual wait time is calculated using below formula,

Wait time = SuperVision wait time base-value + random-value + (attempt-count x 5 seconds)

• The random value shall be a time between 100 and 1100 milliseconds
Values in the range 1 to 60 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.

### Wakeup Interval

The wakeup interval sets the period at which the device will listen for messages from the controller. This is required for battery devices that sleep most of the time in order to conserve battery life. The device will wake up at this interval and send a message to the controller to tell it that it can accept messages - after a few seconds, it will go back to sleep if there is no further communications. 

This setting is defined in *seconds*. It is advisable not to set this interval too short or it could impact battery life. A period of 1 hour (3600 seconds) is suitable in most instances.

Note that this setting does not affect the devices ability to send sensor data, or notification events.

This parameter has the configuration ID ```wakeup_interval``` and is of type ```INTEGER```.

### Wakeup Node

When sleeping devices wake up, they send a notification to a listening device. Normally, this device is the network controller, and normally the controller will set this automatically to its own address.
In the event that the network contains multiple controllers, it may be necessary to configure this to a node that is not the main controller. This is an advanced setting and should not be changed without a full understanding of the impact.

This parameter has the configuration ID ```wakeup_node``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZCOMBO-G supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
The alarm supports one association group (Lifeline) and sends its alarms to that group. The Z-Wave network controller may be set in this group. It’s not recommended to modify this association group. All the critical events in the list of supported events


Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [User Manual](https://opensmarthouse.org/zwavedatabase/1295/zcombo-g-first-alert-z-wave-smoke-and-co-alarm-manual.pdf)
* [Product Specifications](https://opensmarthouse.org/zwavedatabase/1295/B00KMHXFAI_First_Alert_NXZCOMBO_Specifications.pdf)
* [ZCOMBO Z-Wave Specification](https://opensmarthouse.org/zwavedatabase/1295/BRK_ZCOMBO_Z-Wave_Specification_11.0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1295).
