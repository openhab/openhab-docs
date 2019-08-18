---
layout: documentation
title: EZMultiPli - ZWave
---

{% include base.html %}

# EZMultiPli Multi Sensor
This describes the Z-Wave device *EZMultiPli*, manufactured by *Express Controls* with the thing type UID of ```homeseer_ezmultipli_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![EZMultiPli product image](https://www.cd-jackson.com/zwave_device_uploads/268/268_default.jpg)


The EZMultiPli supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

EZMultiPli™ enables fully automated lighting that turns on the lights when you enter a room and turns them off shortly after you leave. Sophisticated lighting, Audio, Video and heating/cooling are enabled with the EZMultiPli™ threesensors-in-one Z-Wave® device.

EZMultiPli is primarily intended as a motion sensor that will detect motion and send a command to up to 4 associated ZWave devices as well as the system controller. The other ZWave devices can directly control lights in a room or the motion indication can be sent to a computer for complex scene control of lighting, audio, video and heating/cooling. When motion is not detected within a pre-set amount of time, EZMultiPli will send an “off” command to the Z-Wave nodes to turn the lights off.

In addition to the motion sensor, EZMultiPli also senses the amount of light in the room as well as the current temperature. The color LED light within EZMultiPli is a convenient night light or can be used as an indicator light to let you know if the weather forecast is predicting rain, your garage doors are open or any other indicator supported by your home control application.

EZMultiPli is wall powered and needs no wires or batteries. Simply plug EZMultiPli into the wall, join the Z-Wave network and you’re ready to go.

### Inclusion Information

Before attempting to include (pair) EZMultiPli to a Z-Wave network, be sure the LED is blinking an aqua color. If it is not blinking aqua, follow the exclusion instructions above.

Follow the procedure of the Z-Wave primary controller to begin the inclusion process. Then press and release the push button on the side of EZMultiPli. Once EZMultiPli has been added to the Z-Wave network, the LED will stop blinking blue and instead will blink white each time it detects motion. EZMultiPli remains in this mode for 5 minutes. Once the 5 minutes has expired, EZMultiPli will enter normal operating mode and the LED will remain off. Pressing the push button will restart the 5 minute motion detector test mode. The primary controller should provide a Z-Wave NodeID which has been assigned to EZMultiPli. The NodeID is a unique identifier and is used by many home control applications to identify this particular EZMultiPli. Write down the NodeID and location for later entry into your home control application.

### Exclusion Information

When EZMultiPli is first plugged into the wall outlet, the LED should blink an aqua color. This indicates that it is not currently joined (or paired) to a Z-Wave network. If the LED is blinking white each time motion is detected, then it is already joined to a Z-Wave network. If the LED is blinking white you will need to exclude it from the other Z-Wave network before attempting to join a new one.

Follow the procedure of the Z-Wave primary controller to begin the exclusion process. Once the primary controller is ready to receive the exclusion command, press and release the push button on the side of EZMultiPli. The primary controller should give an indication that the reset process has completed. EZMultiPlis LED will blink aqua when it is ready to be added to a Z-Wave network.

## Channels

The following table summarises the channels available for the EZMultiPli -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Color | color_color | color_color | ColorLight | Color | 
| Motion Alarm | alarm_motion | alarm_motion | Motion | Switch | 

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (luminance)
Indicates the current light reading.

The ```sensor_luminance``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Color
The color channel allows to control the color of a light.
            It is also possible to dim values and switch the light on and off.

The ```color_color``` channel is of type ```color_color``` and supports the ```Color``` item and is in the ```ColorLight``` category.

### Motion Alarm
Indicates if a motion alarm is triggered.

The ```alarm_motion``` channel is of type ```alarm_motion``` and supports the ```Switch``` item and is in the ```Motion``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the EZMultiPli.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | OnTime | OnTime |
| 2 | OnLevel | OnLevel |
| 3 | LiteMin | LiteMin |
| 4 | TempMin | A Temperature report is sent to the controller every TempMin minutes. |
| 5 | TempAdj | TempAdj |

### Parameter 1: OnTime

OnTime
OnTime sets the number of minutes that the lights stay on when motion has not been detected.

A value of 0 is a special mode where the lights are constantly sent a command to turn them on whenever motion is detected. EZMultiPli will NOT turn the lights off in this mode.

Recommended values:

  * 5 min for hallways
  * 20 min for an office environment
  * 60 min for a library, office or other room where someone may be sitting still for a long time
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: OnLevel

OnLevel
OnLevel is the value sent by the Z-Wave BASIC_SET command to all Association Group 2 nodes when motion is detected.

A value of 0 will turn the lights off (not recommended). A value between 1 and 99 will set the dim level to between 1% and 99% (99% is full on).

A value of -1 will turn the light “on” which depends on the device but most will set the dim level to the last dim setting.
Values in the range -1 to 99 may be set.

The manufacturer defined default value is ```-1```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: LiteMin

LiteMin
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

TempAdj
TempAdj is a twos-complement number that is used to adjust the temperature reading to make it more accurate. The value is in tenths of degree Fahrenheit. The temperature reading can be adjusted by +12.7F to -12.8F. A value of 1 will adjust the temperature reading by +0.1F. A value of -1 will adjust the temperature by -0.1F. A value of 123 will adjust the temperature by +12.3F. 
Values in the range -127 to 128 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The EZMultiPli supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
This group is normally automatically assigned to the Z-Wave system controller when EZMultiPli is added to the ZWave network.
This group is normally automatically assigned to the Z-Wave system controller when EZMultiPli is added to the ZWave network. All Notification command class reports (motion detection) are sent to the node assigned to this group. Advanced lighting control should be handled by a home control application based on these reports.

Association group 1 supports 1 node.

### Group 2: Basic

This group is used to directly turn lights on or off when motion is detected.
This group is used to directly turn lights on or off when motion is detected. Up to four (4) Z-Wave devices can be associated in this group. EZMultiPli will send a BASIC ON command to all devices that are associated in this group. Note that the Z-Wave devices in this group must be within direct range (about 30’) of EZMultiPli. Control of nodes that are further away or blocked by metal or concrete walls should rely on the Z-Wave system controller and the home-control application for reliable operation. Note that including the NodeID of EZMultiPli in this group will control the LED which will come on when motion is detected and goes off when no motion has been detected for OnTime minutes.

Association group 2 supports 4 nodes.

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
