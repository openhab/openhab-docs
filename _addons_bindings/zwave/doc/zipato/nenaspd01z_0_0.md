---
layout: documentation
title: NE-NAS-PD01Z - ZWave
---

{% include base.html %}

# NE-NAS-PD01Z PIR motion sensor and light measurement
This describes the Z-Wave device *NE-NAS-PD01Z*, manufactured by *[Zipato](http://www.zipato.com/)* with the thing type UID of ```zipato_nenaspd01z_00_000```.

The device is in the category of *Motion Detector*, defining Motion sensors/detectors.

![NE-NAS-PD01Z product image](https://www.cd-jackson.com/zwave_device_uploads/735/735_default.jpg)


The NE-NAS-PD01Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The NE-NAS-PD01Z does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Zipato PIR Motion Sensor is a passive infrared detector or physical sensor, the sensor doesn’t emit any energy, but only passively receive and detect infrared radiation. Sensor sends messages via Z-Wave network to the Z-Wave main controller. In the communication between the PIR and Z-Wave main controller, PIR sensor can only send messages and not receive them. When sensor is triggered, it will send message to the main controller and associate devices to work through the Z-Wave main controller. Sensor is battery powered, small and can be installed easily

### Inclusion Information

 Press the button 3 times within 1.5 seconds and the device will enter inclusion mode. LED will flash on and off 5 times.

### Exclusion Information

 Press the button 3 times within 1.5 seconds and the device will enter exclusion mode.

### Wakeup Information

The NE-NAS-PD01Z does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


 Press the button 3 times within 1.5 seconds to wake the device. LED will blink once.

## Channels

The following table summarises the channels available for the NE-NAS-PD01Z -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (luminance)
Indicates the current light reading.

The ```sensor_luminance``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 9 configuration parameters available in the NE-NAS-PD01Z.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Sensitivity level | 8 = Highest sensitivity, 255 = lowest sesitivity |
| 2 | ON / OFF Duration | How long should the associated devices have ON status. |
| 3 | BASIC SET Level | BASIC SET LEVEL |
| 4 |  PIR detection ENABLED / DISABLED | Enable og disable the PIR sensor |
| 5 | Ambent illumination LUX level | Lux value which determines when the light sensor is activated |
| 6 | Re-Trigger Interval | Adjust the interval of being re-triggered |
| 7 | Light sensor polling interval | How often should ambient illumination be evaluated |
| 8 | LUX level function enable | See overview |
| 9 | Ambient illumination report | when lux changes by the number in this setting it is reported |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Sensitivity level

8 = Highest sensitivity, 255 = lowest sesitivity
1. SENSITIVITY LEVEL SETTING

This parameter defines the sensitivity of PIR sensor. It’s recommended to test the sensor with moevements from a farthest end of the coverage area at the first time of use. If movements cannot be detected sensitively, simply adjust the sensitivity level with this parameter. This parameter can be configured with the value of 8 through 255, where 8 means high sensitivity and 255 means low sensitivity. Function: Sensivity Level Setting

Parameter size: 1 byte

Parameter number: 1

Available settings: 8 ~ 255

Default settings: 12
Values in the range 8 to 255 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: ON / OFF Duration

How long should the associated devices have ON status.
2. ON / OFF DURATION

This parameter determines how long the associated devices should have ON status. For instace, if this parameter is set to 30 (sec), the PIR sensor will send a BASIC\_SET command to associated device with valu BASIC\_SET level if PIR sensor is triggered and associated device will be turned on 30 seconds begore it’s turned off. This parameter value must be large as Parameter #. If user set this parameter to default by Configure CC, the parameter # will be set to default value.

Function: ON / OFF duration setting

Parameter size: 2 byte

Parameter number: 2

Available settings: 5~600 (seconds)

Default setting: 30
Values in the range 5 to 600 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: BASIC SET Level

BASIC SET LEVEL
3. BASIC SET LEVEL BASIC\_SET command will be sent when PIR sensor is triggered. The receiver will take it into consideration; for instance, if a lamp module is receiving the BASIC\_SET command of which value is decisive as to how bright of dim level of lamp module shall be.

Function: Basic Set Level

Parameter size: 1 byte

Parameter number: 2

Available settings: 0,1 ~ 99 or 255 0 - OFF, Alarm cancelling or turning device off

1 ~ 99 or 255 - ON (Binary Switch Device)

Dim level (Multilevel Switch Device)

Default setting: 255This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4:  PIR detection ENABLED / DISABLED

Enable og disable the PIR sensor
4. PIR DETECTION FUNCTION ENABLED / DISABLED This parameter can enable or disable the PIR sensor detecting function. Function: Enabled / Disabled PIR function

Parameter size: 1 byte

Parameter number: 4

Available settings: 0 (disable) or 255 (enable)

Default setting: 255 
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Ambent illumination LUX level

Lux value which determines when the light sensor is activated
5. AMBIENT ILLUMINATION LUX LEVEL This parameter can set Lux value which determines when the light sensor is activated. If the ambient illumination level falls bellow this value and a person moves across or within the detection area, PIR sensor will send Z-Wave ON command (i.e. BASIC_set (value = parameter 3) to an associated device and activate it.

Function: Lux Level Set

Parameter size: 2 byte

Parameter number: 5

Available settings: 0~1000 (Lux)

Default setting: 100 (Lux)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Re-Trigger Interval

Adjust the interval of being re-triggered
6. RE-TRIGGER INTERVAL SETTING This parameter can be used to adjust the interval of being re-triggered after the PIR sensor has been triggered. This parameter value must be less than Paramater #2. If user sets this parameter to default by Configure CC, the parameter #2 will be set to default value.

Function: Re-trigger interval setting

Parameter size: 1 byte

Parameter number: 6

Available settings: 1~8 (s)

Default setting: 8
Values in the range 1 to 8 may be set.

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Light sensor polling interval

How often should ambient illumination be evaluated
7. LIGHT SENSOR POLLING INTERVAL This parameter can set the light sensor to measure ambient illumination level interval time. NOTE: This value must be less than Wakeup Interval Time!

Function: Light Sensor Polling Interval

Parameter size: 2 byte

Parameter number: 7

Available settings: 60~3600 (seconds)

Default setting: 180 (s)
Values in the range 60 to 3600 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: LUX level function enable

See overview
8. LUX LEVEL FUNCTION ENABLE If this parameter is set to “1” and when Lux level is less than the value defined by parameter #5, PIR sensor will send a BASIC\_SET command frame (i.e. BASIC\_SET (value = parameter 3) to an associated device and activate it. If Lux level is greater than the value defined by parameter #5, PIR sensor will not send BASIC_SET command frame.

Function: Lux Level Enable

Parameter size: 1 byte

Parameter number: 8

Available sttings: 0, 1

Default setting: 0
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Ambient illumination report

when lux changes by the number in this setting it is reported
9. AMBIENT ILLUMINATION LUX LEVEL REPORT This parameter defines by how much Lux level must change in Lux to be reported to the main controller.

Function: Lux Level Report

Parameter size: 2 byte

Parameter number: 9

Available settings: 0~1000 (Lux)

Default setting: 1
Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.

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

The NE-NAS-PD01Z supports 4 association groups.

### Group 1: Group 1

lifeline service
**GROUP 1** is lifeline service that is assigned to sensor status - Open/Close. It enables the sensor to send reports and readings to Z-Wave controller or Z-Wave Gateway whenever the sensor is triggered. This group supports: NOTIFICATION\_REPORT\_V4 SENSOR\_BINARY\_REPORT\_V2 SENSOR\_MULTILEVEL\_REPORT\_V7 BATTERY\_REPORT\_DEVICE\_RESET\_LOCALLY_NOTIFICATION

Association group 1 supports 4 nodes.

### Group 2: Group 2

BASIC_SET control command group
**GROUP 2** allows sending control commands to associated devices such as relay module, lighting, etc. This association group is configured through the advanced parameters no. 2, 3, 5 and 8. This griup supports: BASIC_SET

Association group 2 supports 4 nodes.

### Group 3: Group 3

NOTIFICATION\_REPORT\_V4
**GROUP 3** allows sending notifications to associated devices int his group. This group supports: NOTIFICATION\_REPORT\_V4

Association group 3 supports 4 nodes.

### Group 4: Group 4

Sensor Binary Report
**GROUP 4** allows sending sending Sensor Binary Report to associated devices in this group. This group supports: SENSOR\_BINARY\_REPORT_V2

Association group 4 supports 4 nodes.

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
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/735/ne-nas-pd01z-Zipato-PIR-Motion-Sensor-User-Manual-1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/735).
