---
layout: documentation
title: NAS-AB01Z - ZWave
---

{% include base.html %}

# NAS-AB01Z Siren Alarm
This describes the Z-Wave device *NAS-AB01Z*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_nasab01z_00_000```.

The device is in the category of *Siren*, defining Siren used by Alarm systems.

![NAS-AB01Z product image](https://www.cd-jackson.com/zwave_device_uploads/522/522_default.jpg)


The NAS-AB01Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Siren Alarm with ten different sounds.

### Inclusion Information

The siren alarm can be included to the Z-wave network by pressing on the code button.

  1. Disassemble the siren alarm and insert the battery into the siren alarm. Make sure the device is located within the direct range of the controller.
  2. Set the controller into the learning mode (see main controller’s operating manual).
  3. Quickly, triple click the code button, LED light will flash red.
  4. Siren alarm will be detected and included in the Z-Wave network.
  5. Wait for the main controller to configure the siren alarm.

### Exclusion Information

  1. Make sure the sensor is connected to power source.
  2. Set the main controller into the learning mode (see main controller’s operating manual).
  3. Quickly, triple click the code button, LED light will flash red for 5 times.
  4. Wait for the main controller to delete the sensor.

## Channels

The following table summarises the channels available for the NAS-AB01Z -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Siren ON Mode | config_decimal | config_decimal |  | Number | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Siren ON Mode
Configure default siren ON mode:

1 = Alarm Music Mode

2 = Door Bell Music

Generic class for configuration parameter.

The ```config_decimal``` channel is of type ```config_decimal``` and supports the ```Number``` item.

### Alarm
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 7 configuration parameters available in the NAS-AB01Z.
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

The NAS-AB01Z supports 3 association groups.

### Group 1: Group 1


Association group 1 supports 5 nodes.

### Group 2: Group 2


Association group 2 supports 5 nodes.

### Group 3: Group2


Association group 3 supports 5 nodes.

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

### Documentation Links

* [NASAB01Z Manual (1)](https://www.cd-jackson.com/zwave_device_uploads/522/15-NAS-AB01Z-UserMan-pdf-3069596.pdf)
* [NASAB01Z Manual (2)](https://www.cd-jackson.com/zwave_device_uploads/522/NAS-AB01Z.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/522).
