---
layout: documentation
title: NeoMotion - ZWave
---

{% include base.html %}

# NeoMotion Motion Sensor
This describes the Z-Wave device *NeoMotion*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_neomotion_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![NeoMotion product image](https://opensmarthouse.org/zwavedatabase/1301/image/)


The NeoMotion supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The NeoMotion does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Motion sensor(PIR) is a passive infrared detector or physical sensor. This sensor doesn't emitany energy but only passively receive and detect infrared radiation from outside. Under roomtemperature, all items have radiation. Human beings are warm-blooded animals with stableinfrared radiation, so are most easily to be detected. That's why we also call it body sensor.PIR send messages via Z-Wave network to Z-Wave gateway. In the Z-Wavenetwork communications, PIR can be connected to any Z-Wave gateway. Different countriesor areas, the radio frequency is different. In the communication between PIR and Z-Wave gatwway, PIR can only send messages, not be able to receive messages. When PIR istriggered, PIR will send message to Z-Wave gateway, and associate devices to work throughZWave gateway. PIR is battery powered, is small and can be installed easily.

### Inclusion Information

Press the code button in PIR sensor three times continuously

### Exclusion Information

Press the code button in PIR sensor three times continuously

### Wakeup Information

The NeoMotion does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.




### General Usage Information



## Channels

The following table summarises the channels available for the NeoMotion -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
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

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

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

The following table provides a summary of the 13 configuration parameters available in the NeoMotion.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Sensitivity Level Setting |  |
| 2 | On/Off Duration |  |
| 3 | Basic Set Level |  |
| 4 | PIR Detecting Function Enabled/Disabled |  |
| 5 | Ambient illumination Lux Level |  |
| 6 | Re-trigger Interval Setting |  |
| 7 | Light Sensor Polling Interval |  |
| 8 | Lux Level Function Enable |  |
| 9 | Ambient illumination Lux Level Report |  |
| 10 | Ambient Temperature Differential Report |  |
| 11 | Led Blink Enable |  |
| 12 | Motion Event Report One Time Enable |  |
| 99 | Ambient light intensity calibration |  |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Sensitivity Level Setting


This parameter defines the sensitivity of PIR sensor. At the first time of test, it is recommended to test the sensor with movements from a farthest end of the coverage area .If movements cannot be detected sensitively, simply adjust the sensitivity level by changing this parameter.
Values in the range 8 to 255 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: On/Off Duration


This parameter can determine how long the associated devices should stay ON status. For instance, this parameter is set to 30(second), PIR sensor will send a BASIC SET Command toan associated device with value basic set level if PIR sensor is triggered, and the associated devices will be turned on, and stay in this status for 30(second) before it is turned off
Values in the range 5 to 6000 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Basic Set Level


Basic Set Command will be sent where contains a value when motion sensor is triggered, Z-Wave gateway will take it for consideration; for instance, if a lamp module is received the Basic Set Command of which value is decisive as to how bright of dim level of lamp module shall be.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 255 | On |

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: PIR Detecting Function Enabled/Disabled


This parameter can enable or disable PIR detector detecting function.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Ambient illumination Lux Level


This parameter can be set a lux level value which determines when light sensor is activated. Ifthe ambient illumination level falls below this value, and a person moves across orstands within the detected area , PIR detector will send a Z-Wave ON command(i.e.BASIC_SET value = parameter 3#) to an associated device and activate it.
Values in the range 0 to 1000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.


### Parameter 6: Re-trigger Interval Setting


This Parameter can be used to adjust the interval of being retriggered after PIR sensor has been triggered. This Parameter value must be less than Parameter 2#.If user set this parameter to default by Configure CC, the parameter #2 will be set to default value
Values in the range 1 to 8 may be set.

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Light Sensor Polling Interval


This Parameter can be set as interval time for light sensor measuring ambient illumination level.
Values in the range 60 to 36000 may be set.

The manufacturer defined default value is ```180```.

This parameter has the configuration ID ```config_7_2``` and is of type ```INTEGER```.


### Parameter 8: Lux Level Function Enable


If this parameter is set to '1', and when Lux level is less than the value defined by parameter#5, PIR sensor will send a BASIC\_SET command frame(i.e. BASIC\_SET (value = parameter3) to an associated device and activate it. If Lux Level is greater than the value defined by parameter #5, PIR sensor will not send a BASIC_SET command frame.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Ambient illumination Lux Level Report


This parameter defines how much Lux must be changed first, then PIR sensor will report to zwave gateway.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Ambient Temperature Differential Report


This parameter is configured the value that differential between current measured andprevious report value. If the differential value larger than the settings, device will report thismeasured temperature value to nodes associated in lifeline
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Led Blink Enable


This parameter defines the Led on/off enable. If this parameter is set to '1', led blink will be enabled, the led will blink once when motion sensor detect a movement. Otherwise, the led will be turned off always.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Motion Event Report One Time Enable



Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 99: Ambient light intensity calibration


This parameter defines the calibrated scale for ambient light intensity. Because the methodand position that the sensor is mounted , and the cover of sensor will bringmeasurement error,user can get more real light intensity by this parameter setting. Usershould run the steps as blows for calibrating.
Values in the range 1 to 65536 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_99_2``` and is of type ```INTEGER```.

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

The NeoMotion supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 4 nodes.

### Group 2: Basic_set


Association group 2 supports 4 nodes.

### Group 3: Notification Report


Association group 3 supports 4 nodes.

### Group 4: Sensor Binary Report


Association group 4 supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
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

* [motion_sensor_2](https://opensmarthouse.org/zwavedatabase/1301/reference/motion_sensor_2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1301).
