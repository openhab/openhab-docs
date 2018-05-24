---
layout: documentation
title: SOS/Remote Control - ZWave
---

{% include base.html %}

# SOS/Remote Control Z-Wave Remote for Scene selection and SOS button
This describes the Z-Wave device *SOS/Remote Control*, manufactured by *Shenzhen Neo Electronics Co., Ltd* with the thing type UID of ```shenzhen_sosremotecontrol_00_000```.

The device is in the category of Remote Control, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

# Overview
Remote control/SOS is a smart security device that can communication with other devices via z-wave .

It is compatible with z-wave plus devices, battery powered , compact to carry .

SOS is used for emergency；

With 4 buttons, you can use Remote control for emergency call and set 6 different scenes .

## Inclusion Information
1\) Ensure remote control is in z-wave range.

2\) Set the controller in learning mode.(refer to the controller user manual)

3\) Quickly pressing the red button three times,Led will blink.

4\) The controller will recognize remote control and add it into z-wave network.

5\) Wait for the controller to configure.

## Exclusion Information
1\) Ensure the device is connected to power supply.

2\) Set the controller in remove mode(refer to controller’s user manual)

3\) Quick pressing the red button for three times.

4\) Wait for removing SOS from the controller .

## Channels
The following table summarises the channels available for the SOS/Remote Control

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Scene Number | scene_number |  | Number | 
| Alarm (emergency) | alarm_emergency | Door | Switch | 

### Binary Sensor
The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Scene Number
The ```scene_number``` channel supports the ```Number``` item.

### Alarm (emergency)
The ```alarm_emergency``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration
The following table provides a summary of the 3 configuration parameters available in the SOS/Remote Control.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Basic Set Level | Basic Set Command will be sent where contains a value when SOS is triggered if group 2 have associated a device such as siren |
| 2 | SOS Event Clear Time | This parameter defines the time to clear emergency event after emergency event is triggered when parameter #3 is set to ‘2’. This parameter is set to ‘0’, the clearing emergency event will not occurred always. |
| 3 | SOS Configuration | This parameter defines the SOS key function, the SOS key can be configured as emergency event key or central scene notification key. |

### Parameter 1: Basic Set Level
Basic Set Command will be sent where contains a value when SOS is triggered if group 2 have associated a device such as siren
Basic Set Command will be sent where contains a value when SOS is triggered if group 2 have associated a device such as siren, the receiver will take it for consideration; for instance, if associated siren is received the Basic Set Command (0xFF), the siren will take alarm on.

0~99 are mapping to Basic Set value (0 ~ 99). 100 is mapping to Basic Set Value 0xFF.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is 100.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: SOS Event Clear Time
This parameter defines the time to clear emergency event after emergency event is triggered when parameter #3 is set to ‘2’. This parameter is set to ‘0’, the clearing emergency event will not occurred always.
This parameter defines the time to clear emergency event after emergency event is triggered when parameter #3 is set to ‘2’.

This parameter is set to ‘0’, the clearing emergency event will not occurred always.

The default value of this parameter is set to ‘60’, means that the emergency event will be cleared after 60 seconds when emergency event is triggered.
Values in the range 30 to 32767 may be set.

The manufacturer defined default value is 60.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: SOS Configuration
This parameter defines the SOS key function, the SOS key can be configured as emergency event key or central scene notification key.
This parameter defines the SOS key function, the SOS key can be configured as emergency event key or central scene notification key.

If this parameter is set to ‘1’, the SOS key will be configured as central scene notification key.

If this parameter is set to ‘2’, the SOS key will be configured as emergency event notification key. The default settings is ‘2’, the SOS key is

configured as emergency event notification key.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Enable Scene Mode |
| 2 | SOS Mode |

The manufacturer defined default value is 2 (SOS Mode).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


## Association Groups
Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The SOS/Remote Control supports 2 association groups.

### Group 1: Group 1
Able to control z-wave main controller setting or alarm host status.
This group supports 1 nodes.

### Group 2: Group 2
Switch or active the scene existing in the z-wave controller,thus to control other devices in the scene .
This group supports 1 nodes.

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

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/799).
