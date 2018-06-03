---
layout: documentation
title: ZMNHWD - ZWave
---

{% include base.html %}

# ZMNHWD Qubino Flush RGBW Dimmer
This describes the Z-Wave device *ZMNHWD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhwd_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZMNHWD product image](https://www.cd-jackson.com/zwave_device_uploads/567/567_default.jpg)


The ZMNHWD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

Qubino Flush RGBW module controls RGB/RGBW strips and LED strips or bulbs and has 5 special scene effects. It can also control halogen lights and fans. Its extremely small size allows for easy installation behind wall sockets and switches. Controlled devices may be powered by 12 or 24 VDC.

Supported control types:

- Push button (monostable switch)
- Bistable switch

This should hopefully work with models ZMNHWD1-ZMNHWD8 (which work on different frequencies).

### Inclusion Information

To include the device, press the service button 3 times within 2 seconds. The LED will turn green if the device was properly included.

The device supports auto inclusion: Install the device and connect the power. The auto inclusion function will be active for about 2 minutes.

### Exclusion Information

To exclude the device, press the service button 3 times within 2 seconds. The green LED will blink if the device was properly included and the device will be reset to factory defaults.

## Channels

The following table summarises the channels available for the ZMNHWD -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Color Control | color_color |  | Color | 
| Color Temperature | color_temperature | ColorLight | Dimmer | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Color Control

The color channel allows to control the color of a light.
            It is also possible to dim values and switch the light on and off.

The ```color_color``` channel supports the ```Color``` item.

### Color Temperature

The color temperature channel allows to set the color
            temperature of a light from 0 (cold) to 100 (warm).

The ```color_temperature``` channel supports the ```Dimmer``` item and is in the ```ColorLight``` category.



## Device Configuration

The following table provides a summary of the 14 configuration parameters available in the ZMNHWD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Input IN1 configuration | Input IN1 configuration |
| 2 | Input IN2 configuration | Input IN2 configuration |
| 3 | Input IN3 configuration | Input IN3 configuration |
| 4 | Input IN4 configuration | Input IN4 configuration |
| 5 | Auto scene mode set | Activation of the programmed scene changing color shades. |
| 6 | Auto Scene Mode | Duration between Colour change |
| 7 | Memorize device status at power cut | Device will be set to status memorized before power cut. |
| 8 | Automatic turning off output after set time | Automatic turning off output after set time |
| 9 | Automatic turning on output after set time | Automatic turning on output after set time |
| 10 | MAX dimming value | MAX dimming value |
| 11 | MIN dimming value | MIN dimming value |
| 12 | Dimming time (soft on/off) | Dimming time (soft on/off) |
| 13 | Dimming time when key pressed | Dimming time when key pressed |
| 14 | 4 Dimmers mode | 4 Dimmers mode |

### Parameter 1: Input IN1 configuration

Input IN1 configuration

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | NORMAL mode – momentary switch type |
| 2 | NORMAL mode – toggle switch type |
| 3 | NORMAL mode – toggle with memory switch type |
| 4 | BRIGHTNESS mode – momentary switch type |
| 5 | BRIGHTNESS mode – toggle switch type |
| 6 | BRIGHTNESS mode – toggle with memory switch type |
| 7 | RAINBOW mode – momentary switch type |
| 8 | SCENE mode – momentary switch type |
| 9 | SCENE mode – toggle switch type |
| 10 | SCENE mode – toggle with memory switch type |

The manufacturer defined default value is ```4``` (BRIGHTNESS mode – momentary switch type).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Input IN2 configuration

Input IN2 configuration

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | NORMAL mode – momentary switch type |
| 2 | NORMAL mode – toggle switch type |
| 3 | NORMAL mode – toggle with memory switch type |
| 4 | BRIGHTNESS mode – momentary switch type |
| 5 | BRIGHTNESS mode – toggle switch type |
| 6 | BRIGHTNESS mode – toggle with memory switch type |
| 7 | RAINBOW mode – momentary switch type |
| 8 | SCENE mode – momentary switch type |
| 9 | SCENE mode – toggle switch type |
| 10 | SCENE mode – toggle with memory switch type |

The manufacturer defined default value is ```7``` (RAINBOW mode – momentary switch type).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Input IN3 configuration

Input IN3 configuration

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | NORMAL mode – momentary switch type |
| 2 | NORMAL mode – toggle switch type |
| 3 | NORMAL mode – toggle with memory switch type |
| 4 | BRIGHTNESS mode – momentary switch type |
| 5 | BRIGHTNESS mode – toggle switch type |
| 6 | BRIGHTNESS mode – toggle with memory switch type |
| 7 | RAINBOW mode – momentary switch type |
| 8 | SCENE mode – momentary switch type |
| 9 | SCENE mode – toggle switch type |
| 10 | SCENE mode – toggle with memory switch type |

The manufacturer defined default value is ```8``` (SCENE mode – momentary switch type).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Input IN4 configuration

Input IN4 configuration

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | NORMAL mode – momentary switch type |
| 2 | NORMAL mode – toggle switch type |
| 3 | NORMAL mode – toggle with memory switch type |
| 4 | BRIGHTNESS mode – momentary switch type |
| 5 | BRIGHTNESS mode – toggle switch type |
| 6 | BRIGHTNESS mode – toggle with memory switch type |
| 7 | RAINBOW mode – momentary switch type |
| 8 | SCENE mode – momentary switch type |
| 9 | SCENE mode – toggle switch type |
| 10 | SCENE mode – toggle with memory switch type |

The manufacturer defined default value is ```1``` (NORMAL mode – momentary switch type).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Auto scene mode set

Activation of the programmed scene changing color shades.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Ocean |
| 2 | Lightning |
| 3 | Rainbow |
| 4 | Snow |
| 5 | Romantic |
| 6 | Party scene |

The manufacturer defined default value is ```1``` (Ocean).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Auto Scene Mode

Duration between Colour change
- 1-127 – delay duration is 1 sec to 127 sec
- 1001-1127 – delay duration is from 1 min to 127 min. This parameter has no effect on Lighting and Party Scene.
Values in the range 1 to 1127 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Memorize device status at power cut

Device will be set to status memorized before power cut.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Do not memorize |
| 1 | Memorize |

The manufacturer defined default value is ```0``` (Do not memorize).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Automatic turning off output after set time

Automatic turning off output after set time
- 0 – Auto OFF disabled
- 1 – 32536 = 1 second – 32536 seconds Auto OFF
Values in the range 0 to 32536 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: Automatic turning on output after set time

Automatic turning on output after set time
- 0 – Auto ON disabled
- 1 – 32536 = 1 second – 32536 seconds Auto ON
Values in the range 0 to 32536 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: MAX dimming value

MAX dimming value
2-99 = 2 % – 99 %
Values in the range 2 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: MIN dimming value

MIN dimming value
1-98 = 1 % – 98 %
Values in the range 1 to 98 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Dimming time (soft on/off)

Dimming time (soft on/off)
- Default value 10 = 1 s
- 5 – 25 = from 0.5 to 2.5 seconds
Values in the range 5 to 25 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Dimming time when key pressed

Dimming time when key pressed
1 – 127 = from 1 to 127 seconds

NOTE: Dimming time depends also on Min and Max dimming value.
Values in the range 1 to 127 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: 4 Dimmers mode

4 Dimmers mode
NOTE: If the parameter no. 14 is enabled, parameter no. 1,2,3,4 has no effect.

NOTE: After parameter change, first exclude device (without setting parameters to default value) and then re include the device.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Four dimmers mode disabled |
| 1 | Four dimmers mode enabled – momentary switch type |
| 2 | Four dimmers mode enabled – toggle switch type |
| 3 | Four dimmers mode enabled – toggle with memory switch type |

The manufacturer defined default value is ```0``` (Four dimmers mode disabled).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZMNHWD supports 1 association group.

### Group 1: Send basic report to this group


This group supports 1 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| Linked to BASIC|
| COMMAND_CLASS_SWITCH_COLOR_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Manual v1.2](https://www.cd-jackson.com/zwave_device_uploads/567/Qubino-Flush-RGBW-Dimmer-PLUS-user-manual-V1-2-eng.pdf)
* [Extended manual](https://www.cd-jackson.com/zwave_device_uploads/567/Qubino-Flush-RGBW-Dimmer-PLUS-extended-manual-eng-2-2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/567).
