---
layout: documentation
title: EZMultiPli - ZWave
---

{% include base.html %}

# EZMultiPli Multi Sensor
This describes the Z-Wave device *EZMultiPli*, manufactured by *Express Controls* with the thing type UID of ```homeseer_ezmultipli_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![EZMultiPli product image](https://www.cd-jackson.com/zwave_device_uploads/268/268_default.jpg)


The EZMultiPli supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/268) to improve the documentation.

## Channels

The following table summarises the channels available for the EZMultiPli -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | Temperature | Number | 
| Sensor (luminance) | sensor_luminance | Temperature | Number | 
| Color | color_color |  | Color | 
| Alarm | alarm_general | Door | Switch | 

### Sensor (temperature)

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Sensor (luminance)

Indicates the current light reading.

The ```sensor_luminance``` channel supports the ```Number``` item and is in the ```Temperature``` category. This is a read only channel so will only be updated following state changes from the device.

### Color

The color channel allows to control the color of a light.
            It is also possible to dim values and switch the light on and off.

The ```color_color``` channel supports the ```Color``` item.

### Alarm

Indicates if an alarm is triggered.

The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the EZMultiPli.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | OnTime | OnTime sets the number of minutes that the lights stay on when motion has not been detected. |
| 2 | OnLevel | OnLevel is the value sent by the Z-Wave BASIC\_SET command to all Association Group 2 nodes when motion is detected. |
| 3 | LiteMin | A Luminance report is sent to the system controller every LiteMin minutes. |
| 4 | TempMin | A Temperature report is sent to the controller every TempMin minutes. |
| 5 | TempAdj | TempAdj is a twos-complement number that is used to adjust the temperature reading to make it more accurate. |

### Parameter 1: OnTime

OnTime sets the number of minutes that the lights stay on when motion has not been detected.
OnTime sets the number of minutes that the lights stay on when motion has not been detected.

A value of 0 is a special mode where the lights are constantly sent a command to turn them on whenever motion is detected. EZMultiPli will NOT turn the lights off in this mode.

Recommended values:

- 5 min for hallways
- 20 min for an office environment
- 60 min for a library, office or other room where someone may be sitting still for a long time
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: OnLevel

OnLevel is the value sent by the Z-Wave BASIC\_SET command to all Association Group 2 nodes when motion is detected.
OnLevel is the value sent by the Z-Wave BASIC\_SET command to all Association Group 2 nodes when motion is detected.

A value of 0 will turn the lights off (not recommended). A value between 1 and 99 will set the dim level to between 1% and 99% (99% is full on).

A value of -1 will turn the light “on” which depends on the device but most will set the dim level to the last dim setting.
Values in the range -1 to 99 may be set.

The manufacturer defined default value is ```-1```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: LiteMin

A Luminance report is sent to the system controller every LiteMin minutes.
A Luminance report is sent to the system controller every LiteMin minutes.

A value of zero turns this mode off. Luminance values can still be obtained at any time by the home control application in this mode
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: TempMin

A Temperature report is sent to the controller every TempMin minutes.
A Temperature report is sent to the controller every TempMin minutes.

A value of zero turns this mode off. Temperature values can still be obtained at any time by polling the status of the temperature sensor.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: TempAdj

TempAdj is a twos-complement number that is used to adjust the temperature reading to make it more accurate.
TempAdj is a twos-complement number that is used to adjust the temperature reading to make it more accurate. The value is in tenths of degree Fahrenheit. The temperature reading can be adjusted by +12.7F to -12.8F. A value of 1 will adjust the temperature reading by +0.1F. A value of -1 will adjust the temperature by -0.1F. A value of 123 will adjust the temperature by +12.3F.
Values in the range -127 to 128 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The EZMultiPli supports 2 association groups.

### Group 1: LIFELINE

This group is normally automatically assigned to the Z-Wave system controller when EZMultiPli is added to the ZWave network.
This group supports 1 nodes.

### Group 2: BASIC

This group is used to directly turn lights on or off when motion is detected.
This group supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V5| |
| COMMAND_CLASS_SWITCH_COLOR_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/268/EZMultiPliOwnerManual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/268).
