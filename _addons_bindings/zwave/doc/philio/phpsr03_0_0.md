---
layout: documentation
title: PH-PSR03 - ZWave
---

{% include base.html %}

# PH-PSR03 Z-WAVE Remote
This describes the Z-Wave device *PH-PSR03*, manufactured by *[Philio Technology Corp](http://www.philio-tech.com/)* with the thing type UID of ```philio_phpsr03_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![PH-PSR03 product image](https://www.cd-jackson.com/zwave_device_uploads/985/985_default.jpg)


The PH-PSR03 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The PH-PSR03 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Zipato Z-Wave Remote is a simple controller for controlling AV device through Z-Wave-to-IR extender, and it can also control 8 ON/OFF lighting groups via basic set, based on Z-Wave technology. It is the Z-Wave plus product, it support the security, OTA... all the newest features of the Z-Wave technology.   
Z-Wave is a wireless communication protocol designed for home automation, specifically to remotely control applications in residential and light commercial environments. The technology uses a low-power RF radio embedded or retrofitted into home electronics devices and systems, such as lighting, home access control, entertainment systems and household appliances.   
This product can be included and operated in any Z-Wave network with other Z-Wave certified devices from other manufacturers and/or other applications. All non-battery operated nodes within the network will act as repeaters regardless of vendor to increase reliability of the network.

The device adopts the Z-Wave 500 series chip. When your Z-Wave network system is all made by Z-Wave 500 series devices, the network system will have the advantages as below.

  * Concurrent multi-channel support reduces external interference
  * Better RF range, about 10 meters improvement indoors.
  * Supports 100 Kbps transmission speed

# POWER UP PROCEDURE

The device can not work normally in the first time. Please activate the battery through micro USB before the first use. After the device is activated by connecting to micro USB, the device will start charging and LED will light on with red color. If the battery is full charged, LED will light on with green color. When device is charging, it will send Wake Up Notification to controller minutely.

## BATTERY POWER CHECK

When any keys around the central key is pressed, the device will check the battery power. If the power level is too low, the red LED will flash once after pressing. Please charge the device through micro USB immediately.

## NWI

When it poweres up, the device will check if it is already added to the network. If it isn’t, it will automatically start the NWI mode. The LED will flash in every second and continue for about 30 seconds, until timeout or successful inclusion by controller. You can hold down the central key and then press the top-right key 3 times within 1.5 seconds to abort the NWI mode.

### Inclusion Information

  1. Put the Z-Wave Controller in inclusion mode.
  2. Hold down the central key, then press the top-right key 3 times
  3. within 1.5 seconds to enter inclusion mode.
  4. After successful inclusion, the device will wake to receive the
  5. setting command from Z-Wave Controller in about 20 seconds.

### Exclusion Information

  1. Put the Z-Wave Controller in exclusion mode.
  2. Hold down the central key, then press the top-right key 3 times within 1.5 seconds to enter exclusion mode. Node ID has been excluded.

### Wakeup Information

The PH-PSR03 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


After the device is added to the network, it will wake-up once per day in default. When it wakes up it will broadcast the “Wake Up Notification” message to the network, and wake-up 10 seconds to receive the setting commands. To wake-up the device immediately, please hold down the central key, then press the top-right key once within. The device will wake-up for 10 seconds.

When device is charging, it will send Wake Up Notification to controller minutely.

## Channels

The following table summarises the channels available for the PH-PSR03 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Alarm (emergency) | alarm_emergency | alarm_emergency | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Alarm (emergency)
Indicates Police, Fire, or Medical services should be contacted.

The ```alarm_emergency``` channel is of type ```alarm_emergency``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | EMERGENCY |
| OFF | OK |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 3 configuration parameters available in the PH-PSR03.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 2 | Basic Set Level | Basic Set Level |
| 7 | Customer Function | Customer Function |
| 10 | Auto Report Battery Time | Auto Report Battery Time |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 2: Basic Set Level

Basic Set Level
Setting the BASIC command value to turn on the light.

  * The 255 means turn on the light.
  * For dimmer equipment 1 to 100 means the light strength. 0 means turn off the light.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 7: Customer Function

Customer Function
Customer function switch, using bit control.

Bit0: Switch AV control/ Lighting group control. (0: AV control, 1: lighting group control)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 10: Auto Report Battery Time

Auto Report Battery Time
The interval time for auto report the battery level.

  * 0 means turn off auto report battery.
  * Each tick means 30 minutes.
  * The default value is 12(6 hours).
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.

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

The PH-PSR03 supports 9 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 4 nodes.

### Group 2: Lighting Group 1


Association group 2 supports 4 nodes.

### Group 3: Lighting Group 2


Association group 3 supports 4 nodes.

### Group 4: Lighting Group 3


Association group 4 supports 4 nodes.

### Group 5: Lighting Group 4


Association group 5 supports 4 nodes.

### Group 6: Lighting Group 5


Association group 6 supports 4 nodes.

### Group 7: Lighting Group 6


Association group 7 supports 4 nodes.

### Group 8: Lighting Group 7


Association group 8 supports 4 nodes.

### Group 9: Lighting Group 8


Association group 9 supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Device Manual](https://www.cd-jackson.com/zwave_device_uploads/985/ph-psr03-Zipato-Z-Wave-Remote-User-Manual-v1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/985).
