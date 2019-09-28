---
layout: documentation
title: ZCOMBO - ZWave
---

{% include base.html %}

# ZCOMBO Smoke and Carbon Monoxide Alarm
This describes the Z-Wave device *ZCOMBO*, manufactured by *BRK Brands, Inc.* with the thing type UID of ```brk_zcombo_00_000```.

The device is in the category of *Smoke Detector*, defining Smoke detectors.

![ZCOMBO product image](https://www.cd-jackson.com/zwave_device_uploads/238/238_default.jpg)


The ZCOMBO supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The ZCOMBO does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Z-wave compatible smoke and carbon monoxide alarm. First Alert Z-Wave Detector - NOT WINK compatible.

Integrated wireless alarm system is Iris compatible to send you mobile alerts and emails. The alarm is also compatible with 3rd party certified Z-Wave devices with the First Alert protocol. Note- this alarm is not compatible with Onelink.

  * Wireless connection to z-wave hub
  * Reliable electrochemical co and photoelectric smoke sensors
  * Features single button test/Silence and side-access battery drawer
  * Meets UL standards and backed by 7 year limited warranty
  * Certified for use with Nexia Home Intelligence or other Z-Wave systems
  * Combination Smoke and Carbon Monoxide protection that alerts you whether you are home or away
  * Photoelectric smoke sensor helps reduce false alarms such as from cooking or shower steam

### Inclusion Information

  1. Slide battery door open.
  2. Insert batteries checking the correct orientation.
  3. Press and hold the test button. Keep it held down as you slide the battery drawer closed. You may then release the button.

  * The alarm will remain awake for 30 seconds on inclusion.
  * The alarm supports one association group with up to 1 node, and sends its alarms to that group.
  * The alarm supports configuration parameter #1, which has a size of 1, a default value of 0, and when set to 1 causes the device to send double alarm messages.

### Exclusion Information

  1. Slide battery door open.
  2. Remove and re-insert batteries checking the correct orientation.
  3. Press and hold the test button. Keep it held down as you slide the battery drawer closed. You may then release the button.

### Wakeup Information

The ZCOMBO does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Slide the battery out then back in while holding the button to wake it up.

## Channels

The following table summarises the channels available for the ZCOMBO -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Heartbeat | alarm_general | alarm_general | Alarm | Switch | 
| Smoke Alarm | alarm_smoke | alarm_smoke | Smoke | Switch | 
| Carbon Monoxide Alarm | alarm_co | alarm_co |  | Switch | 
| Test Button | alarm_tamper | alarm_tamper |  | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Heartbeat
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Smoke Alarm
Indicates if a smoke is triggered.

The ```alarm_smoke``` channel is of type ```alarm_smoke``` and supports the ```Switch``` item and is in the ```Smoke``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Carbon Monoxide Alarm
Indicates if the carbon monoxide alarm is triggered.

The ```alarm_co``` channel is of type ```alarm_co``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Test Button
Indicates if the tamper alarm is triggered.

The ```alarm_tamper``` channel is of type ```alarm_tamper``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 1 configuration parameters available in the ZCOMBO.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Send double alarms | Causes the device to send double alarm messages |

### Parameter 1: Send double alarms

Causes the device to send double alarm messages

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Single Alarm |
| 1 | Double Alarm |

The manufacturer defined default value is ```0``` (Single Alarm).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZCOMBO supports 1 association group.

### Group 1: Group 1


Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/238/NXZCOMBO-Specifications.pdf)
* [Instructions sheet](https://www.cd-jackson.com/zwave_device_uploads/238/first-alert-NXZCOMBO-instructions.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/238).
