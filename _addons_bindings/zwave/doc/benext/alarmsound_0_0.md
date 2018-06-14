---
layout: documentation
title: Alarm Sound - ZWave
---

{% include base.html %}

# Alarm Sound Alarm sound
This describes the Z-Wave device *Alarm Sound*, manufactured by *[BeNext](http://www.benext.eu/)* with the thing type UID of ```benext_alarmsound_00_000```.

The device is in the category of *Siren*, defining Siren used by Alarm systems.

![Alarm Sound product image](https://www.cd-jackson.com/zwave_device_uploads/443/443_default.png)


The Alarm Sound supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/443) to improve the documentation.

## Channels

The following table summarises the channels available for the Alarm Sound -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Alarm | alarm_general | Door | Switch | 

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



## Device Configuration

The following table provides a summary of the 12 configuration parameters available in the Alarm Sound.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Set to Default | Set all configuration values to default values (factory settings) |
| 2 | Destination routine on/off | Test connection by sending a periodic test. if the device doesn't react the user will be notified by a sound. |
| 3 | Desitnation routine succes time | Time it takes to send a new frame after the last frame has succesfully send |
| 4 | Destination routine failed time | Time elapsed between failing to end a frame and sending a new frame. |
| 7 | Select index sound/light mode | The index of the sound mode when a switch binary/basic set frame been received |
| 8 | power offline sound/light mode | The sound and light mode that will be used when the device gets unplugged. |
| 10 | sound/light index 1 | Sound/light that will be played when index 1 has been selected |
| 28 | sound/light index 2 | Sound/light that will be played when index 2 has been selected |
| 46 | sound/light index 3 | Sound/light that will be played when index 3 has been selected |
| 64 | sound/light index 4 | Sound/light that will be played when index 4 has been selected |
| 82 | sound/light index 5 | Sound/light that will be played when index 5 has been selected |
| 100 | sound/light index 6 | Sound/light that will be played when index 6 has been selected |

### Parameter 1: Set to Default

Set all configuration values to default values (factory settings)
If value is set to 255 reset to default settings.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Destination routine on/off

Test connection by sending a periodic test. if the device doesn't react the user will be notified by a sound.
0 this is turned off. 1-255 turn it on.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Desitnation routine succes time

Time it takes to send a new frame after the last frame has succesfully send
t(s) = param1 \* 6 \*60
Values in the range 0 to 60 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Destination routine failed time

Time elapsed between failing to end a frame and sending a new frame.
t(s) = param1 \*60
Values in the range 0 to 240 may be set.

The manufacturer defined default value is ```240```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 7: Select index sound/light mode

The index of the sound mode when a switch binary/basic set frame been received
0 to switch off, 1-6 to select light/sound mode.

If value is put higher then 5 the application will read this as 1.
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: power offline sound/light mode

The sound and light mode that will be used when the device gets unplugged.
0 to switch off, 1-6 to select light/sound mode.

If value is put higher then 5 the application will read this as 1.
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 10: sound/light index 1

Sound/light that will be played when index 1 has been selected
Params 10-27 are the values to set the sound/light (this will be set when index 1)

When the configuration is not this size the frame will be ignored.

For the configuration of the light/sound mode i would like to refer to the manual.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_18``` and is of type ```INTEGER```.


### Parameter 28: sound/light index 2

Sound/light that will be played when index 2 has been selected
Params 28-45 are the values to set the sound/light (this will be set when index 2)

When the configuration is not this size the frame will be ignored.

For the configuration of the light/sound mode i would like to refer to the manual.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_28_18``` and is of type ```INTEGER```.


### Parameter 46: sound/light index 3

Sound/light that will be played when index 3 has been selected
Params 45-63 are the values to set the sound/light (this will be set when index 3)

When the configuration is not this size the frame will be ignored.

For the configuration of the light/sound mode i would like to refer to the manual.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_46_18``` and is of type ```INTEGER```.


### Parameter 64: sound/light index 4

Sound/light that will be played when index 4 has been selected
Params 64-81 are the values to set the sound/light (this will be set when index 4)

When the configuration is not this size the frame will be ignored.

For the configuration of the light/sound mode i would like to refer to the manual.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_64_18``` and is of type ```INTEGER```.


### Parameter 82: sound/light index 5

Sound/light that will be played when index 5 has been selected
Params 82-99 are the values to set the sound/light (this will be set when index 5)

When the configuration is not this size the frame will be ignored.

For the configuration of the light/sound mode i would like to refer to the manual.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_82_18``` and is of type ```INTEGER```.


### Parameter 100: sound/light index 6

Sound/light that will be played when index 6 has been selected
Params 100-117 are the values to set the sound/light (this will be set when index 6)

When the configuration is not this size the frame will be ignored.

For the configuration of the light/sound mode i would like to refer to the manual.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_100_18``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Alarm Sound supports 2 association groups.

### Group 1: Association group 1

Changes the LED on the device
This group supports 1 nodes.

### Group 2: Association group 2

The alarm sound reports it status to the associated devices
This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CMD_V1| |

### Documentation Links

* [Alarm Sound NL](https://www.cd-jackson.com/zwave_device_uploads/443/alarmsound-nl.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/443).
