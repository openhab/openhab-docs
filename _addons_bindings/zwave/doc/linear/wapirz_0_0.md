---
layout: documentation
title: WAPIRZ-1 - ZWave
---

{% include base.html %}

# WAPIRZ-1 PIR Motion Detector
This describes the Z-Wave device *WAPIRZ-1*, manufactured by *Linear Corp* with the thing type UID of ```linear_wapirz_00_000```.

The device is in the category of *Motion Detector*, defining Motion sensors/detectors.

![WAPIRZ-1 product image](https://www.cd-jackson.com/zwave_device_uploads/5/5_default.jpg)


The WAPIRZ-1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The WAPIRZ-1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Wireless Passive Infrared (PIR) Motion Detector

### Inclusion Information

  1. Prepare the Controller to include a unit to the network by adding it to a group (method of adding a node to the network). Refer to controller instructions.
  2. If your Controller supports Network Wide Inclusion (NWI) locate the WAPIRZ-1 near the proposed installation location. If not skip to Step 4.
  3. With your Controller in Inclusion mode, you should see an indication on your Controller that the “device was included” in the network. It should display binary switch / Linear. The LED will stop blinking. Skip to Step 10. If the LED does not stop blinking, relocate the WAPIRZ-1 to within 100 feet (line of sight) of a Z-Wave device or your hub and repeat Step 3. If the LED continues to blink, your Controller does not support NWI and continue with Step 4.
  4. Place the WAPIRZ-1 within 3 feet of the Controller.
  5. With your controller in Inclusion mode, depress the Tamper switch for 1 second then release.
  6. You should see an indication on your Controller that the “device was included” in the network. It should display binary switch / Linear. The LED will stop blinking.
  7. The device will appear in the list of Switches.

### Exclusion Information

  1. Set up the Z-Wave™ Interface Controller into “exclusion” mode, and following its instruction to delete the WAPIRZ-1 from the controller.
  2. Press the Tamper switch of WAPIRZ-1 for 1 second and release to be excluded. The LED light will flash continuously when the sensor is in the Exclusion condition.

### Wakeup Information

The WAPIRZ-1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Open the motion detector case to “wake” the unit.

## Channels

The following table summarises the channels available for the WAPIRZ-1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Motion Alarm | alarm_motion | alarm_motion | Motion | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

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

The following table provides a summary of the 1 configuration parameters available in the WAPIRZ-1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Re-trigger Wait Time | Re-trigger Wait Time |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Re-trigger Wait Time

Re-trigger Wait Time
By default, to conserve battery life, after the WAPIRZ-1 detects motion it cannot be re-triggered by motion again for 3 minutes. Each time motion is detected (even during this wait time) the 3 minute timer starts over.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.

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

The WAPIRZ-1 supports 1 association group.

### Group 1: Group 1


Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V4| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Installation Guide](https://www.cd-jackson.com/zwave_device_uploads/5/WAPIRZ-install.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/5).
