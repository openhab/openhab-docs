---
layout: documentation
title: SOS/Remote Control - ZWave
---

{% include base.html %}

# SOS/Remote Control Z-Wave Remote for Scene selection and SOS button
This describes the Z-Wave device *SOS/Remote Control*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_sosremote_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![SOS/Remote Control product image](https://www.cd-jackson.com/zwave_device_uploads/799/799_default.jpg)


The SOS/Remote Control supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The SOS/Remote Control does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Remote control/SOS is a smart security device that can communication with other devices via z-wave. It is compatible with z-wave plus devices, battery powered , compact to carry .SOS is used for emergency.  
With 4 buttons, you can use Remote control for emergency call and set 6 different scenes.

### Inclusion Information

  1. Ensure remote control is in z-wave range.
  2. Set the controller in learning mode.(refer to the controller user manual)
  3. Quickly pressing the red button three times,Led will blink.
  4. The controller will recognize remote control and add it into z-wave network.
  5. Wait for the controller to configure.

### Exclusion Information

  1. Ensure the device is connected to power supply. 
  2. Set the controller in remove mode(refer to controller’s user manual)
  3. Quick pressing the red button for three times.
  4. Wait for removing SOS from the controller .

### Wakeup Information

The SOS/Remote Control does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Press the red button once.

## Channels

The following table summarises the channels available for the SOS/Remote Control -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 
| Alarm (emergency) | alarm_emergency | alarm_emergency | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.
This channel provides the scene, and the event as a decimal value in the form ```<scene>.<event>```. The scene number is set by the device, and the event is as follows -:

| Event ID | Event Description  |
|----------|--------------------|
| 0        | Single key press   |
| 1        | Key released       |
| 2        | Key held down      |
| 3        | Double keypress    |
| 4        | Tripple keypress   |
| 5        | 4 x keypress       |
| 6        | 5 x keypress       |

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

The following table provides a summary of the 3 configuration parameters available in the SOS/Remote Control.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Basic Set Level | Basic Set Level |
| 2 | SOS Event Clear Time | SOS Event Clear Time |
| 3 | SOS Configuration | SOS Configuration |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Basic Set Level

Basic Set Level
Basic Set Command will be sent where contains a value when SOS is triggered if group 2 have associated a device such as siren, the receiver will take it for consideration; for instance, if associated siren is received the Basic Set Command (0xFF), the siren will take alarm on.

0~99 are mapping to Basic Set value (0 ~ 99). 100 is mapping to Basic Set Value 0xFF.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: SOS Event Clear Time

SOS Event Clear Time
This parameter defines the time to clear emergency event after emergency event is triggered when parameter #3 is set to ‘2’.

This parameter is set to ‘0’, the clearing emergency event will not occurred always.

The default value of this parameter is set to ‘60’, means that the emergency event will be cleared after 60 seconds when emergency event is triggered.
Values in the range 30 to 32767 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: SOS Configuration

SOS Configuration
This parameter defines the SOS key function, the SOS key can be configured as emergency event key or central scene notification key.

If this parameter is set to ‘1’, the SOS key will be configured as central scene notification key.

If this parameter is set to ‘2’, the SOS key will be configured as emergency event notification key. The default settings is ‘2’, the SOS key is 

configured as emergency event notification key.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Enable Scene Mode |
| 2 | SOS Mode |

The manufacturer defined default value is ```2``` (SOS Mode).

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

The SOS/Remote Control supports 2 association groups.

### Group 1: Group 1

Able to control z-wave main controller setting or alarm host status.
* COMMAND\_CLASS\_ZWAVEPLUS_INFO (V2)

* COMMAND\_CLASS\_VERSION (V2)

* COMMAND\_CLASS\_MANUFACTURER_SPECIFIC (V2)

* COMMAND\_CLASS\_DEVICE\_RESET\_LOCALLY (V1)

* COMMAND\_CLASS\_POWERLEVEL (V1)

* COMMAND\_CLASS\_BATTERY (V1)

* COMMAND\_CLASS\_ASSOCIATION (V2)

* COMMAND\_CLASS\_ASSOCIATION\_GRP\_INFO (V1)

* COMMAND\_CLASS\_WAKE_UP (V2)

* COMMAND\_CLASS\_NOTIFICATION (V8)

* COMMAND\_CLASS\_SENSOR_BINARY (V2)

* COMMAND\_CLASS\_CONFIGURATION (V1)

Association group 1 supports 1 node.

### Group 2: Group 2

Switch or active the scene existing in the z-wave controller,thus to control other devices in the scene .
Note:Remote control is communicating with other devices via z-wave network directly, z-wave controller is not involved in.

Association group 2 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V2| |
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

* [SOS PDF from NEO](https://www.cd-jackson.com/zwave_device_uploads/799/SOS.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/799).
