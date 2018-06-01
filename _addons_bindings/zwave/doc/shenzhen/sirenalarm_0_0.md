---
layout: documentation
title: Siren Alarm - ZWave
---

{% include base.html %}

# Siren Alarm Siren Alarm
This describes the Z-Wave device *Siren Alarm*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_sirenalarm_00_000```.

![Siren Alarm product image](https://www.cd-jackson.com/zwave_device_uploads/522/522_default.png)


The Siren Alarm supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/522) to improve the documentation.

## Channels

The following table summarises the channels available for the Siren Alarm -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Alarm | alarm_general | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Alarm

Indicates if an alarm is triggered.

The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The following table provides a summary of the 7 configuration parameters available in the Siren Alarm.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Configure Alarm music volume | Configure Alarm music volume |
| 2 | Alarm music duration time | Alarm music duration time |
| 3 | Door bell music duration time | Door bell music duration time |
| 4 | Door bell music volume | Door bell music volume |
| 5 | Alarm music index | Alarm music index |
| 6 | Door bell music index | Door bell music index |
| 7 | Default Siren on mode | Default Siren on mode |

### Parameter 1: Configure Alarm music volume

Configure Alarm music volume

Values in the range 1 to 3 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Alarm music duration time

Alarm music duration time

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Door bell music duration time

Door bell music duration time

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Door bell music volume

Door bell music volume

Values in the range 1 to 3 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Alarm music index

Alarm music index

Values in the range 1 to 10 may be set.

The manufacturer defined default value is ```9```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Door bell music index

Door bell music index

Values in the range 1 to 10 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Default Siren on mode

Default Siren on mode
This parameter defines the default music index, volume and duration time for siren on.

This parameter can be selected between ALARM MUSIC and DOOR BELL music.

The settings for ALARM MUSIC defines by Param #1, #2, #5.

The settings for DOOR BELL defines by Param #3, #4, #6.
Values in the range 1 to 2 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Siren Alarm supports 3 association groups.

### Group 1: Group 1


This group supports 5 nodes.

### Group 2: Group 2


This group supports 5 nodes.

### Group 3: Group2


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/522).
