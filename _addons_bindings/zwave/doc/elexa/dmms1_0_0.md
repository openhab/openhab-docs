---
layout: documentation
title: DMMS1 - ZWave
---

{% include base.html %}

# DMMS1 Dome Z-Wave Plus Motion Detector with Light Sensor and Flexible Magnetic Mount (DMMS1)
This describes the Z-Wave device *DMMS1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmms1_00_000```.

The device is in the category of *Motion Detector*, defining Motion sensors/detectors.

![DMMS1 product image](https://www.cd-jackson.com/zwave_device_uploads/797/797_default.jpg)


The DMMS1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The DMMS1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

Z-Wave Plus Motion Detector with Light Sensor

### Inclusion Information

1. Bring Motion Detector to within 10 feet (3 meters) of the controller
2. Remove the cover of the Motion Detector by twisting it apart
3. Put the controller into inclusion mode
4. Press the Connect Button quickly 3 times in a row

The LED Indicator will flash five times indicating inclusion.

### Exclusion Information

1. Remove the cover of the Motion Detector by twisting apart and make sure the Motion Detector is powered
2. Put the controller into exclusion mode
3. Press the Connect Button quickly three times in a row

The LED Indicator will flash five times indicating exclusion/disconnection

Factory Reset:

1. Remove the cover of the Motion Detector by twisting apart and make sure the Motion Detector is powered
2. Hold the Connect Button for 10 seconds until the LED Indicator blinks once, then release the button.

### Wakeup Information

1. Remove the cover of the Motion Detector by twisting apart and make sure the Motion Detector is powered
2. Press the Connect Button quickly three times in a row

## Channels

The following table summarises the channels available for the DMMS1 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Sensor (luminance) | sensor_luminance | Temperature | Number | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

### Binary Sensor

Indicates if a sensor has triggered.

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (luminance)

Indicates the current light reading.

The ```sensor_luminance``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (burglar)

Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The following table provides a summary of the 10 configuration parameters available in the DMMS1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Motion Sensitivity | 8 = high; 255 = low |
| 2 | Trigger ON Duration | delay after motion before turning OFF |
| 3 | Trigger Action | Brightness to turn on the associated device 1-99, 255=ON |
| 4 | Motion Detection | 255=Motion Detection Enabled |
| 5 | Light Trigger Level | Max Light level which enables motion trigger |
| 6 | Motion Trigger Interval | Minimum time between motion triggers. |
| 7 | Light Polling Interval | Interval between light level reporting |
| 8 | Light Trigger | 255=enable Light sensor |
| 9 | Light Report | Light level change to be reported. |
| 10 | LED Notifications | 0=disable, 1=enable |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Motion Sensitivity

8 = high; 255 = low
Adjust detection by choosing a value from 8 to 255, where 8 stands for high sensitivity level (detection of the smallest movement) and 255 stands for very low sensitivity level
Values in the range 8 to 255 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Trigger ON Duration

delay after motion before turning OFF
Set the duration (in seconds) you want the associated device to stay ON for after being triggered by the sensor before it automatically turns OFF. Must be greater than value set in parameter 6.
Values in the range 5 to 600 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Trigger Action

Brightness to turn on the associated device 1-99, 255=ON
You can choose if your Mini Sensor turns an associated device on or off when sending the BASIC SET command. Use value 0 to turn the associated device OFF and value 255 to turn it ON. Adjust brightness level for a Z-Wave dimmer (Multilevel switch) by putting in any value between 1 and 99.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Motion Detection

255=Motion Detection Enabled

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Light Trigger Level

Max Light level which enables motion trigger
Set your light sensor as a secondary trigger for associated devices. If light level in a room falls beyond the set point and motion is detected, the Mini Sensor will send BASIC\_SET command to associated devices to turn ON. The number entered as the value corresponds to the number of LUX. By default, if motion has been detected by your Mini Sensor, the associated device will turn ON if light level last reported by the sensor is under 100 LUX.
Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Motion Trigger Interval

Minimum time between motion triggers.
Adjust the time (in seconds) when motion is reported again after initial trigger. By default, with continued motion, the Mini Sensor will report motion again 8 seconds after it's last detection. The value set for this parameter can NOT be greater than value set in parameter 2. NOTE: Small interval will increase activity and decrease battery life.
Values in the range 1 to 8 may be set.

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Light Polling Interval

Interval between light level reporting
Decide how often (in seconds) you want the Mini Sensor to report light level to the controller and associated devices. By default, the Mini Sensor will report light level values every 3 minutes. The value set for this parameter can NOT be greater than the wake-up interval. NOTE: Small interval will increase activity and decrease battery life.
Values in the range 60 to 36000 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: Light Trigger

255=enable Light sensor
Use this parameter to enable and disable the light sensor as secondary trigger. If this feature is enabled, the Mini Sensor will activate associated devices based on motion AND light level set in parameter 5
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Light Report

Light level change to be reported.
Choose light level (in LUX) change to be reported by the Mini Sensor to the controller. By default, the sensor will report any change of 100 LUX or more.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: LED Notifications

0=disable, 1=enable
Use this parameter to turn LED notifications on or off for motion detection.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

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

The DMMS1 supports 4 association groups.

### Group 1: Lifeline


This group supports 5 nodes.

### Group 2: BASIC

BASIC\_SET Trigger associated devices
This group supports 5 nodes.

### Group 3: Notification Reports

NOTIFICATION\_REPORT\_V4
This group supports 5 nodes.

### Group 4: SENSOR BINARY

SENSOR\_BINARY\_REPORT\_V2
This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V0| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Dome Motion Detector API Manual](https://www.cd-jackson.com/zwave_device_uploads/797/DomeMotionDetectorAPIManual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/797).
