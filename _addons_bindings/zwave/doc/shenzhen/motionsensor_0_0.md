---
layout: documentation
title: Motion Sensor - ZWave
---

{% include base.html %}

# Motion Sensor PIR Motion Sensor
This describes the Z-Wave device *Motion Sensor*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_motionsensor_00_000```.

The device is in the category of *Motion Detector*, defining Motion sensors/detectors.

![Motion Sensor product image](https://www.cd-jackson.com/zwave_device_uploads/401/401_default.jpg)


The Motion Sensor supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The Motion Sensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

This product can be included and operated in any Z‐Wave network with other Z‐Wave certified devices from other manufacturers and/or other applications. All non‐battery operated nodes within the network will act as repeaters regardless of vendor to increase reliability of the network.

In the Back casing, there is a button that is used to carry out include, exclude, wakeup device or reset factory default settings.

When power is first supplied, the LED will flash on and off alternately at one second intervals within 5 seconds if the detector has not been added a Z‐Wave network. Please get familiar with the terms below before starting the operations.

### Inclusion Information

1\. Remove the sensor cover.

2\. Make sure the sensor is powered.

3\. Set Z‐Wave controller or Z‐Wave gateway into inclusion mode (Refer to the controller or

gateway operating manual)

4\. Press the button three times within 1.5 second, the device will enter inclusion mode. And the

LED will flash on and off alternately five times..

### Exclusion Information

1\. Remove the device cover.

2\. Make sure the sensor is powered.

3\. Set Z‐Wave controller or Z‐Wave gateway into exclusion mode (Refer to the controller or

gateway operating manual)

4\. Press the button three times within 1.5 second, the device will enter exclusion mode.

### Wakeup Information

You can press the button once to wake up the device and send wakeup notification to controller.

If press successfully, the LED will blink one time.

The minimum wakeup interval is 300s

The maximum wakeup interval is 16,777,200s (about 194 days)

Allowable interval among each wakeup interval is 60 second, such as 360, 420, 480…

Note: The default value is 12 hours. This value is longer, the battery life is greater.

## Channels

The following table summarises the channels available for the Motion Sensor -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Sensor (luminance) | sensor_luminance | Temperature | Number | 
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
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

### Sensor (temperature)

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 10 configuration parameters available in the Motion Sensor.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Sensitivity Level Setting | Defines the sensitivity of PIR sensor. Where 8 = highest & 255 = lowest sensitivity |
| 2 | ON/OFF Duration Setting | Determined how long the associated devices should stay ON status. This Parameter value must be large than Parameter 6#. |
| 3 | Basic Set Level | Basic Set Command will be sent when the door/window is opened or closed, the receiver will take it for consideration; for instance, if a lamp module received the BSC of which value is decisive as to how bright of dim level of lamp module shall be. |
| 4 | Enable/Disable PIR Function |  |
| 5 | Lux Level Set | Set a lux level value which determines when the light sensor is activated. |
| 6 | Re-trigger Interval | Adjust the interval of being re-triggered after the PIR detector has been triggered. No report will be sent during this interval if a movement is presented. This Parameter value must be less than Parameter 2#. |
| 7 | Light Sensor Polling Interval | The Intervall after which the Light Sensor Measure is polled. |
| 8 | Lux Level Function Enable | 0 = Off, 1 =On and Lux Level must be less than #5 -> then send Basic Set(Parameter #3) |
| 9 | Lux Level Changed Report | How much the Lux Level must change, in lux, to be reported to the main controller. |
| 10 | LED Blink Enable | Defines whether the LED blinking is on / off. 1 = enable -> blink once when motion sensor detect movement, 0= disbale |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Sensitivity Level Setting

Defines the sensitivity of PIR sensor. Where 8 = highest & 255 = lowest sensitivity

Values in the range 8 to 255 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: ON/OFF Duration Setting

Determined how long the associated devices should stay ON status. This Parameter value must be large than Parameter 6#.
For instance, this parameter is set to 30(second), the PIR detector will send a

BASIC SET Command to an associated device with value basic set level if PIR

detector is triggered and the associated device will be turned on 30(second) before it

is turned off.
Values in the range 5 to 600 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Basic Set Level

Basic Set Command will be sent when the door/window is opened or closed, the receiver will take it for consideration; for instance, if a lamp module received the BSC of which value is decisive as to how bright of dim level of lamp module shall be.
Available Settings:

 0 - Off, Alarm cancelling or turning a device OFF

1~99 or 255 – ON (Binary Switch Device)

 Dim Level (Multilevel Switch Device)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Enable/Disable PIR Function



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable PIR Detector Function |
| 255 | Enable PIR Detector Function |

The manufacturer defined default value is ```255``` (Enable PIR Detector Function).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Lux Level Set

Set a lux level value which determines when the light sensor is activated.
If the ambient illumination level falls below this value and a person moves

across or within the detected area , PIR detector will send a Z-Wave ON

command(i.e. BASIC\_SET value = parameter 3#) to an associated device and activate

it.
Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Re-trigger Interval

Adjust the interval of being re-triggered after the PIR detector has been triggered. No report will be sent during this interval if a movement is presented. This Parameter value must be less than Parameter 2#.

Values in the range 1 to 8 may be set.

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Light Sensor Polling Interval

The Intervall after which the Light Sensor Measure is polled.

Values in the range 60 to 36000 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: Lux Level Function Enable

0 = Off, 1 =On and Lux Level must be less than #5 -> then send Basic Set(Parameter #3)
If this parameter is set to ‘1’, and when Lux level less than the value define by parameter #5, PIR

detector will send a BASIC\_SET command frame(i.e. BASIC\_SET (value = parameter 3) to an

associated device and activate it. If Lux Level greater than the value define by parameter #5, PIR

detector will not send a BASIC\_SET command frame.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable Lux Level Function |
| 1 | Enable Lux Level Function |

The manufacturer defined default value is ```0``` (Disable Lux Level Function).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Lux Level Changed Report

How much the Lux Level must change, in lux, to be reported to the main controller.

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: LED Blink Enable

Defines whether the LED blinking is on / off. 1 = enable -> blink once when motion sensor detect movement, 0= disbale

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable LED blinking |
| 1 | Enable LED blinking |

The manufacturer defined default value is ```1``` (Enable LED blinking).

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

The Motion Sensor supports 4 association groups.

### Group 1: Group 1

Is assigned to the device status - OPEN/CLOSED. It enables the sensor to send reports and readings to Z-Wave Controller or Z-Wave Gateway whenever the sensor is triggered.
This group supports 1 nodes.

### Group 2: Group 2

Sending Control Command to associated devices. This association group is configured through the advanced parameters no. 2, 3, 5 and 8
This group supports 4 nodes.

### Group 3: Group 3

Send Notification to associated devices.
This group supports 4 nodes.

### Group 4: Group 4

Send Notification to associated devices.
This group supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Instruction Manual Motion Sensor](https://www.cd-jackson.com/zwave_device_uploads/401/Manual-for-Motion-sensor-PIR-Zwave-Neo.pdf)
* [Motion Detector User Guide](https://www.cd-jackson.com/zwave_device_uploads/401/Motion-Detector-User-Guide.pdf)
* [Motion Detector User Guide V_3.2](https://www.cd-jackson.com/zwave_device_uploads/401/Motion-Detector-User-Guide-EU-V3-2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/401).
