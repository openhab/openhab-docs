---
layout: documentation
title: HKZW_MS02 - ZWave
---

{% include base.html %}

# HKZW_MS02 Motion Sensor
This describes the Z-Wave device *HKZW_MS02*, manufactured by *[Hank](http://www.hank-tech.com/)* with the thing type UID of ```hank_hkzwms02_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![HKZW_MS02 product image](https://www.cd-jackson.com/zwave_device_uploads/676/676_default.jpg)


The HKZW_MS02 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Motion sensor is a universal Z-Wave Sensor. It can detect motion and communicate with other associated Z-Wave devices, such as Gateway, Siren, Smart Switch, etc.

Motion sensor can be included and operated in any Z-Wave network with other Z-Wave certified devices.

The features list:

  1. Z-Wave Plus certified for wide compatibility (500 serials product).
  2. Supports security 0 and security 2 protected mode with AES-128 encryption.
  3. Motion sensor.
  4. Product shock alarm.
  5. The battery life is up to 1 year.
  6. Low battery alarm.
  7. Support firmware OTA

### Inclusion Information

Adding the device:

  1. Open the cover.
  2. Place the device within the direct range of your Z-Wave controller.
  3. Set the main controller’s adding mode (see the controller’s manual).
  4. Click the Z-button once or triple click the Z-button quickly, the LED indicator should blink fast.
  5. Wait for the adding process to end.
  6. Successful adding will be confirmed by the Z-Wave controller’s message.

### Exclusion Information

Removing the device:

  1. Open the cover.
  2. Place the device within the direct range of your Z-Wave controller.
  3. Set the main controller remove mode (see the controller’s manual).
  4. Triple click the Z-button quickly, the LED indicator should blink fast.Wait for the removing process to end.
  5. Successful removing will be confirmed by the Z-Wave controller’s message.

### General Usage Information

Installation:

  1. Turn the cover counter-clockwise and open it. 
  2. Remove the battery blocker.
  3. Add the device (see “Adding/removing the device”).
  4. Close the cover and turn it clockwise.
  5. Place the sensor to anywhere you want.

Detection Area:

Actual range of the sensor can be influenced by environment conditions. Should false motion alarms be reported, check for any moving objects within the sensor’s detection area, such as trees blowing in the wind, cars passing by, windmills. False motion alarms may be caused by moving masses of air and heat as well. If the device keeps on reporting false alarms, despite eliminating all of the above-mentioned factors, install the device in another place.

## Channels

The following table summarises the channels available for the HKZW_MS02 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Motion Alarm | alarm_motion | alarm_motion | Motion | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Motion Alarm
Indicates if a motion alarm is triggered.

The ```alarm_motion``` channel is of type ```alarm_motion``` and supports the ```Switch``` item and is in the ```Motion``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 6 configuration parameters available in the HKZW_MS02.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 12 | Motion Sensor`s Sensitivity | The higher the value,the more sensitive the PIR sensor |
| 14 | Enable/Disable Basic Set Command | The motion Sensor can reverse its value of BASIC SET when motion is triggered |
| 15 | value of basic set command | assigned to send Basic Set Command |
| 17 | enable/disable shock alarm |  |
| 18 | Motion Alarm Cancellation Delay | Period of time after which Motion alarm will be cancelled. |
| 32 | Level of low battery | Define a battery level ad the "low battery" |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 12: Motion Sensor`s Sensitivity

The higher the value,the more sensitive the PIR sensor

The following option values may be configured, in addition to values in the range 1 to 8 -:

| Value  | Description |
|--------|-------------|
| 1 | Sensitivity 1 (min) |
| 2 | Sensitivity 2 |
| 3 | Sensitivity 3 |
| 4 | Sensitivity 4 |
| 5 | Sensitivity 5 |
| 6 | Sensitivity 6 |
| 7 | Sensitivity 7 |
| 8 | Sensitivity 8 (max) |

The manufacturer defined default value is ```8``` (Sensitivity 8 (max)).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 14: Enable/Disable Basic Set Command

The motion Sensor can reverse its value of BASIC SET when motion is triggered

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: value of basic set command

assigned to send Basic Set Command

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 17: enable/disable shock alarm



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 18: Motion Alarm Cancellation Delay

Period of time after which Motion alarm will be cancelled.
The Motion alarm will be cancelled in the main controller and the associated devices after 3 seconds, the alarm cancellation can be delay by this parameter. Any motion detected during the cancellation delay time countdown will result in the countdown being restarted.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_2``` and is of type ```INTEGER```.


### Parameter 32: Level of low battery

Define a battery level ad the "low battery"

Values in the range 10 to 50 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_32_1``` and is of type ```INTEGER```.

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

The HKZW_MS02 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Report the motion detection and battery level

Association group 1 supports 5 nodes.

### Group 2: assigned to send BASIC SET command


Association group 2 supports 5 nodes.

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
| COMMAND_CLASS_ALARM_V5| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/676/HKZW-MS02.pdf)
* [HKZW-MS02-V1 Product Manual](https://www.cd-jackson.com/zwave_device_uploads/676/HKZW-MS02-V1-ProductManual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/676).
