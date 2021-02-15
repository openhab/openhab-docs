---
layout: documentation
title: MATRIX ZBA7140 - ZWave
---

{% include base.html %}

# MATRIX ZBA7140 Matrix ZBA7140
This describes the Z-Wave device *MATRIX ZBA7140*, manufactured by *[Logic Group](http://www.logic-group.com)* with the thing type UID of ```logic_matrixzba7140_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![MATRIX ZBA7140 product image](https://opensmarthouse.org/zwavedatabase/1330/image/)


The MATRIX ZBA7140 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The MATRIX ZBA7140 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

MATRIX type ZBA7140 (from hereon called MATRIX ZBA) is a multifunction battery wall controller that can be mounted in a modular wall-box or directly ontothe wall. It is compatible with existing FUGA® frames and wall boxes.

MATRIX ZBA has four configurable pushbuttons that can control other Z-Wave devices through the wireless Z-Wave network. These buttons can send ‘ON’, ‘OFF’ and ‘DIM’ commands to the associated Z-Wave devices. These devices could be light dimmers, blinds, sunscreens, etc.

MATRIX ZBA can also issue scene activation commands that can be used to activate scenes in the Z-Wave Controller.

MATRIX ZBA has four RGB indicator LEDs, one for each pushbutton, that indicates activation of the pushbutton, and when MATRIX ZBA is in inclusion or exclusion mode. These indicators can be configured to a desired indication colour, or they can indicate the battery level when a pushbutton is activated.

MATRIX ZBA is equipped with the newest battery-saving 700-series Z-Wave chip that uses up to 65% less power and have improved wireless range. This means that the small coin-cell battery can last between 5 –10years.

MATRIX ZBA is estimated to have a battery lifetime, at normal use, to approximately 5 years.

### Inclusion Information

MATRIXZBA is a SmartStart enabled product and can be added into a Z-Wave network by scanning the Z-Wave QR Code present on the product with a controller providing SmartStart inclusion. No further action is required and the SmartStart product will be added automatically within 10 minutes of being switched on in the network vicinity.Find the QR code and PIN Code on the back of the module.

Find the full DSK on the product packaging.

Add MATRIX ZBA to a network with Classic Inclusion by pressing once on the switch behind the pushbutton-cover. The LED near pushbutton 1 will start blinking.

Use same procedure for removing MATRIX ZBA with Classic Exclusion. If MATRIXZBA already belongs to a Z-Wave network, the remove process must be performed before adding it in a new network. Otherwise, the adding of the device will fail.

### Exclusion Information

Add MATRIX ZBA to a network with Classic Inclusion by pressing once on the switch behind the pushbutton-cover. The LED near pushbutton 1 will start blinking.

Use same procedure for removing MATRIX ZBAwith Classic Exclusion.

### Wakeup Information

The MATRIX ZBA7140 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


This device will wake up every 6 hours and announce the wake-upstate by sending out a so-called Wake Up Notification. The controller can then empty the mailbox. The wake-up interval is a trade-off between maximal battery lifetime and the desired responses of the device. The device will stay awake right after inclusion for 10 seconds allowing the controller to perform certain configuration. It is possible to manually wake up the device by double-activating the button

### General Usage Information



## Channels

The following table summarises the channels available for the MATRIX ZBA7140 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

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

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 45 configuration parameters available in the MATRIX ZBA7140.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Enable Central Scene notifications | This parameter can be used for enabling or disabling Central scene notifications |
| 2 | Pushbutton press threshold time | Specifies the time that a pushbutton must be activated before it is detected as pressed. |
| 3 | Pushbutton held threshold time | Specifies the time that a pushbutton must have been activated before it is accepted as “held-down”. |
| 4 | Mode of the LED indication. | This parameter specifies the mode of the LED indication. |
| 5 | LEDs colour indication, Byte 1 | Specifies the level for the red colour. (Default is 255) |
| 5 | LEDs colour indication, Byte 2 | Specifies the level for the green colour. (Default is 85) |
| 5 | LEDs colour indication, Byte 3 | Specifies the level for the blue colour. (Default is 85) |
| 5 | Not used. | This byte is not used and must be set to 0. |
| 6 | Associations groups, transmission when included secure. | This parameter specifies if commands are transmitted as a secure message for each of the association groups. |
| 7 | Pushbutton 1 functionality. | This parameter specifies the functionality of pushbutton 1. |
| 8 | Switch multilevel set single-activation values for pushbutton 1, Byte 1 | Enable/Disable |
| 8 | Switch multilevel set single-activation values for pushbutton 1, Byte 2 | Upper switch value |
| 8 | Switch multilevel set single-activation values for pushbutton 1, Byte 3 | Lower switch value |
| 8 | Switch multilevel set single-activation values for pushbutton 1, Byte 4 | Duration |
| 9 | Switch Multilevel Set double-activation values for pushbutton 1. Byte 1 | Enable/Disable |
| 9 | Switch Multilevel Set double-activation values for pushbutton 1. Byte 2 | Upper switch value |
| 9 | Switch Multilevel Set double-activation values for pushbutton 1. Byte 3 | Lower switch value |
| 9 | Switch Multilevel Set double-activation values for pushbutton 1. Byte 4 | Duration |
| 10 | Pushbutton 2 functionality. | This parameter specifies the functionality of pushbutton 2. |
| 11 | Switch multilevel set single-activation values for pushbutton 2, Byte 1 | Enable/Disable |
| 11 | Switch multilevel set single-activation values for pushbutton 2, Byte 2 | Upper switch value |
| 11 | Switch multilevel set single-activation values for pushbutton 2, Byte 3 | Lower switch value |
| 11 | Switch multilevel set single-activation values for pushbutton 2, Byte 4 | Duration |
| 12 | Switch Multilevel Set double-activation values for pushbutton 2. Byte 1 | Enable/Disable |
| 12 | Switch Multilevel Set double-activation values for pushbutton 2. Byte 2 | Upper switch value |
| 12 | Switch Multilevel Set double-activation values for pushbutton 2. Byte 3 | Lower switch value |
| 12 | Switch Multilevel Set double-activation values for pushbutton 2. Byte 4 | Duration |
| 13 | Pushbutton 3 functionality. | This parameter specifies the functionality of pushbutton 3. |
| 14 | Switch multilevel set single-activation values for pushbutton 3, Byte 1 | Enable/Disable |
| 14 | Switch multilevel set single-activation values for pushbutton 3, Byte 2 | Upper switch value. |
| 14 | Switch multilevel set single-activation values for pushbutton 3, Byte 3 | Lower switch value |
| 14 | Switch multilevel set single-activation values for pushbutton 3, Byte 3 | Duaration |
| 15 | Switch Multilevel Set double-activation values for pushbutton 3. Byte 1 | Enable/Disable |
| 15 | Switch Multilevel Set double-activation values for pushbutton 3. Byte 2 | Upper switch value |
| 15 | Switch Multilevel Set double-activation values for pushbutton 3. Byte 3 | Lower switch value |
| 15 | Switch Multilevel Set double-activation values for pushbutton 3. Byte 4 | Duration |
| 16 | Pushbutton 4 functionality. | This parameter specifies the functionality of pushbutton 4. |
| 17 | Switch multilevel set single-activation values for pushbutton 4, Byte 1 | Enable/Disable |
| 17 | Switch multilevel set single-activation values for pushbutton 4, Byte 2 | Upper switch value |
| 17 | Switch multilevel set single-activation values for pushbutton 4, Byte 3 | Lower switch value |
| 17 | Switch multilevel set single-activation values for pushbutton 4, Byte 4 | Duration |
| 18 | Switch Multilevel Set double-activation values for pushbutton 4. Byte 1 | Enable/Disable |
| 18 | Switch Multilevel Set double-activation values for pushbutton 4. Byte 2 | Upper switch value |
| 18 | Switch Multilevel Set double-activation values for pushbutton 4. Byte 3 | Lower switch value |
| 18 | Switch Multilevel Set double-activation values for pushbutton 4. Byte 4 | Duration |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Enable Central Scene notifications

This parameter can be used for enabling or disabling Central scene notifications

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Central Scene notifications are disabled. |
| 1 | Central Scene Notifications are enabled. (Default) |

The manufacturer defined default value is ```1``` (Central Scene Notifications are enabled. (Default)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Pushbutton press threshold time

Specifies the time that a pushbutton must be activated before it is detected as pressed.
Specifies the time that a pushbutton must be activated before it is detected as pressed. This parameter also affects the detection of double-and triple-activations, as a new activationmust be detectedwithin this specified time for the repeatedly detection. Be aware that this parameter must be lower than the value in Parameter 3. Therefore, change this parameter with caution.
Values in the range 1 to 1000 may be set.

The manufacturer defined default value is ```400```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Pushbutton held threshold time

Specifies the time that a pushbutton must have been activated before it is accepted as “held-down”.
Specifies the time that a pushbutton must have been activated before it is accepted as “held-down”. This value must be higher than the value set in Parameter 2. Resolution is milliseconds
Values in the range 1 to 5000 may be set.

The manufacturer defined default value is ```600```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: Mode of the LED indication.

This parameter specifies the mode of the LED indication.
This parameter specifies the mode of the LED indication.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED indication is turned off. |
| 1 | LEDs indicates the current level of the battery, when the device is in |
| 2 | LED colour is set by configuration parameter 5. |

The manufacturer defined default value is ```1``` (LEDs indicates the current level of the battery, when the device is in).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: LEDs colour indication, Byte 1

Specifies the level for the red colour. (Default is 255)
This parameter specifies the colour levels for the red, green and blue colours in the 4 RGB LEDs. This parameter is not used unless configuration parameter 4 is set to the value 2. The default configuration is a white light, where red level value must be higher than the two other colours in order to get a white light.Value Description

Byte 1: Red colour level.0 -255Specifies the level for the red colour. (Default is 255)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_5_4_00000001``` and is of type ```INTEGER```.


### Parameter 5: LEDs colour indication, Byte 2

Specifies the level for the green colour. (Default is 85)

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```85```.

This parameter has the configuration ID ```config_5_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 5: LEDs colour indication, Byte 3

Specifies the level for the blue colour. (Default is 85)

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```85```.

This parameter has the configuration ID ```config_5_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 5: Not used.

This byte is not used and must be set to 0.

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_4_01000000``` and is of type ```INTEGER```.


### Parameter 6: Associations groups, transmission when included secure.

This parameter specifies if commands are transmitted as a secure message for each of the association groups.
This parameter specifies if commands are transmitted as a secure message for each of the association groups.This parameter is only used when the device is included in security mode (either S0 or S2).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | All messages in all groups are sent as insecure. |
| 1 | Messages in association group 2 are sent as secure. |
| 2 | Messages in association group 3 are sent as secure. |
| 4 | Messages in association group 4 are sent as secure. |
| 8 | Messages in association group 5 are sent as secure. |
| 16 | Messages in association group 6 are sent as secure. |
| 32 | Messages in association group 7 are sent as secure. |
| 64 | Messages in association group 8 are sent as secure. |
| 128 | Messages in association group 9 are sent as secure. |
| 255 | All messages in all groups are sent as secure. (Default) |

The manufacturer defined default value is ```255``` (All messages in all groups  are sent as secure. (Default)).

This parameter has the configuration ID ```config_6_2``` and is of type ```INTEGER```.


### Parameter 7: Pushbutton 1 functionality.

This parameter specifies the functionality of pushbutton 1.
0 Standard toggle-function, the state is switched between on and off, dimming up and down. (Default)

1 Always turn on or dim up. Using this parameter, the pushbutton can only send ‘on’ or ‘dim up’ commands. Use this in pair with another pushbutton with value 2.

2 Always turn offor dim down. Using this parameter, the pushbutton can only send ‘off’ or ‘dim down’ commands. Use this in pair with another pushbutton with value 1.

3 When the pushbutton is down; an on command is sent, and when the pushbutton is released; an off command is sent.
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Switch multilevel set single-activation values for pushbutton 1, Byte 1

Enable/Disable
Byte 1: Enable / Disable  


0 Disabled – A single activation of the pushbutton will not send commands to devices in the association group.

1 Enabled – A single activation will send commands to devices in the association group. Devices will receive commands with the values set in 3 following bytes.(Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled –A single activation of the pushbutton will not send commands |
| 1 | Enabled –A single activation will send commands to devices in the asso |

The manufacturer defined default value is ```1``` (Enabled –A single activation will send commands to devices in the asso).

This parameter has the configuration ID ```config_8_4_00000001``` and is of type ```INTEGER```.


### Parameter 8: Switch multilevel set single-activation values for pushbutton 1, Byte 2

Upper switch value
Byte 2: Upper switch value0 –99, 255When single pressing the pushbutton for ON, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 255)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_8_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 8: Switch multilevel set single-activation values for pushbutton 1, Byte 3

Lower switch value
Byte 3: Lower switch value 0 -99 When single pressing the pushbutton for OFF, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 0)
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 8: Switch multilevel set single-activation values for pushbutton 1, Byte 4

Duration
Byte 4: Duration 0 -255 When single pressing the pushbutton the Switch Multilevel Set with this duration value will be send to devices in the association group.  


0: Use dimmer default timer value. (Default)

1 –127: Duration in seconds.

128 –255: Duration in minutes (minus 127) from 1 –128 minutes, where 128 is 1 minute.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_4_01000000``` and is of type ```INTEGER```.


### Parameter 9: Switch Multilevel Set double-activation values for pushbutton 1. Byte 1

Enable/Disable
This parameter specifies the value that are sent to the devices in the Switch Multilevel association group (group 3) when the pushbutton is double-pressed.

Byte 1: Enable / Disable0Disabled –A double activation of the pushbutton will not send commands to devices in the association group.1Enabled –A double activation will send commands to devices in the association group. Devices will receive commands with the values set in 3 following bytes. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_9_4_00000001``` and is of type ```INTEGER```.


### Parameter 9: Switch Multilevel Set double-activation values for pushbutton 1. Byte 2

Upper switch value
Byte 2: Upper switch value 0 –99, 255 When double pressing the pushbutton for ON, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 99)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_9_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 9: Switch Multilevel Set double-activation values for pushbutton 1. Byte 3

Lower switch value
Byte 3: Lower switch value 0 -99 When double pressing the pushbutton for OFF, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 99)
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_9_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 9: Switch Multilevel Set double-activation values for pushbutton 1. Byte 4

Duration
Byte 4: Duration 0 -255 When double pressing the pushbutton the Switch Multilevel Set with this duration value will be send to devices in the association group.  


0: Use dimmer default timer value. (Default)

1 –127: Duration in seconds.

128 –255: Duration in minutes (minus 127) from 1 –128 minutes, where 128 is 1 minute.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_4_01000000``` and is of type ```INTEGER```.


### Parameter 10: Pushbutton 2 functionality.

This parameter specifies the functionality of pushbutton 2.
0 Standard toggle-function, the state is switched between on and off, dimming up and down. (Default)

1 Always turn on or dim up. Using this parameter, the pushbutton can only send ‘on’ or ‘dim up’ commands. Use this in pair with another pushbutton with value 2.

2 Always turn off or dim down. Using this parameter, the pushbutton can only send ‘off’ or ‘dim down’ commands. Use this in pair with another pushbutton with value1.

3 When the pushbutton is down; an on command is sent, and when the pushbutton is released; an off command is sent.
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Switch multilevel set single-activation values for pushbutton 2, Byte 1

Enable/Disable
Byte 1: Enable / Disable

0 Disabled – A single activation of the pushbutton will not send commands to devices in the association group.

1 Enabled – A single activation will send commands to devices in the association group. Devices will receive commands with the values set in 3 following bytes. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_4_00000001``` and is of type ```INTEGER```.


### Parameter 11: Switch multilevel set single-activation values for pushbutton 2, Byte 2

Upper switch value
Byte 2: Upper switch value 0 –99, 255 When single pressing the pushbutton for ON, a Switch Multilevel Setwith this value will be send to devices in the association group. (Default = 255)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_11_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 11: Switch multilevel set single-activation values for pushbutton 2, Byte 3

Lower switch value
Byte 3: Lower switch value 0 -99 When single pressing the pushbutton for OFF, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 0)
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 11: Switch multilevel set single-activation values for pushbutton 2, Byte 4

Duration
Byte 4: Duration 0 -255 When single pressing the pushbutton the Switch Multilevel Set with this duration value will be send to devices in the association group.  


0: Use dimmer default timer value. (Default)

1 –127: Duration in seconds.

128 –255: Duration in minutes (minus 127) from 1 –128 minutes, where 128 is 1 minute.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_4_01000000``` and is of type ```INTEGER```.


### Parameter 12: Switch Multilevel Set double-activation values for pushbutton 2. Byte 1

Enable/Disable
Byte 1: Enable / Disable

0 Disabled – A double activation of the pushbutton will not send commands to devices in the association group.

1 Enabled – A double activation will send commands to devices in the association group. Devices will receive commands with the values set in 3 following bytes. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_12_4_00000001``` and is of type ```INTEGER```.


### Parameter 12: Switch Multilevel Set double-activation values for pushbutton 2. Byte 2

Upper switch value
Byte 2: Upper switch value 0 –99, 255 When double pressing the pushbutton for ON, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 99)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_12_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 12: Switch Multilevel Set double-activation values for pushbutton 2. Byte 3

Lower switch value
Byte 3: Lower switch value 0 -99 When double pressing the pushbutton for OFF, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 99)
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_12_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 12: Switch Multilevel Set double-activation values for pushbutton 2. Byte 4

Duration
Byte 4: Duration 0 -255 When double pressing the pushbutton the Switch Multilevel Set with this duration value will be send to devices in the association group.  


0: Use dimmer default timer value. (Default)

1 –127: Duration in seconds.

128 –255: Duration in minutes (minus 127) from 1 –128 minutes, where 128 is 1 minute.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_4_01000000``` and is of type ```INTEGER```.


### Parameter 13: Pushbutton 3 functionality.

This parameter specifies the functionality of pushbutton 3.
0 Standard toggle-function, the state is switched between on and off, dimming up and down. (Default)

1 Always turn on or dim up. Using this parameter, the pushbutton can only send ‘on’ or ‘dim up’ commands. Use this in pair with another pushbutton with value 2.

2 Always turn offor dim down. Using this parameter, the pushbutton can only send ‘off’ or ‘dim down’ commands. Use this in pair with another pushbutton with value 1.

3 When the pushbutton is down; an on command is sent, and when the pushbutton is released; an off command is sent.
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Switch multilevel set single-activation values for pushbutton 3, Byte 1

Enable/Disable
Byte 1: Enable / Disable  


0 Disabled – A single activation of the pushbutton will not send commands to devices in the association group.

1 Enabled – A single activation will send commands to devices in the association group. Devices will receive commands with the values set in 3 following bytes. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_14_4_00000001``` and is of type ```INTEGER```.


### Parameter 14: Switch multilevel set single-activation values for pushbutton 3, Byte 2

Upper switch value.
Byte 2: Upper switch value 0 –99, 255 When single pressing the pushbutton for ON, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 255)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_14_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 14: Switch multilevel set single-activation values for pushbutton 3, Byte 3

Lower switch value
Byte 3: Lower switch value 0 -99 When single pressing the pushbutton for OFF, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 0)
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 14: Switch multilevel set single-activation values for pushbutton 3, Byte 3

Duaration
Byte 4: Duration 0 -255 When single pressing the pushbutton the Switch Multilevel Set with this duration value will be send to devices in the association group.  


0: Use dimmer default timer value. (Default)

1 –127: Duration in seconds.

128 –255: Duration in minutes (minus 127) from 1 –128 minutes, where 128 is 1 minute.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_4_01000000``` and is of type ```INTEGER```.


### Parameter 15: Switch Multilevel Set double-activation values for pushbutton 3. Byte 1

Enable/Disable
Byte 1: Enable / Disable

0 Disabled – A double activation of the pushbutton will not send commands to devices in the association group.

1 Enabled – A double activation will send commands to devices in the association group. Devices will receive commands with the values set in 3 following bytes. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_15_4_00000001``` and is of type ```INTEGER```.


### Parameter 15: Switch Multilevel Set double-activation values for pushbutton 3. Byte 2

Upper switch value
Byte 2: Upper switch value 0 –99, 255 When double pressing the pushbutton for ON, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 99)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_15_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 15: Switch Multilevel Set double-activation values for pushbutton 3. Byte 3

Lower switch value
Byte 3: Lower switch value 0 -99 When double pressing the pushbutton for OFF, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 99)
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_15_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 15: Switch Multilevel Set double-activation values for pushbutton 3. Byte 4

Duration
Byte 4: Duration 0 -255 When double pressing the pushbutton the Switch Multilevel Set with this duration value will be send to devices in the association group.  


0: Use dimmer default timer value. (Default)

1 –127: Duration in seconds.

128 –255: Duration in minutes (minus 127) from 1 –128 minutes, where 128 is 1 minute.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_15_4_01000000``` and is of type ```INTEGER```.


### Parameter 16: Pushbutton 4 functionality.

This parameter specifies the functionality of pushbutton 4.
0 Standard toggle-function, the state is switched between on and off, dimming up and down. (Default)

1 Always turn on or dim up. Using this parameter, the pushbutton can only send ‘on’ or ‘dim up’ commands. Use this in pair with another pushbutton with value 2.

2 Always turn offor dim down. Using this parameter, the pushbutton can only send ‘of’ or ‘dim down’ commands. Use this in pair with another pushbutton with value 1.

3 When the pushbutton is down; an on command is sent, and when the pushbutton is released; an off command is sent.
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Switch multilevel set single-activation values for pushbutton 4, Byte 1

Enable/Disable
Byte 1: Enable / Disable

0 Disabled – A single activation of the pushbutton will not send commands to devices in the association group.

1 Enabled – A single activation will send commands to devices in the association group. Devices will receive commands with the values set in 3 following bytes. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_17_4_00000001``` and is of type ```INTEGER```.


### Parameter 17: Switch multilevel set single-activation values for pushbutton 4, Byte 2

Upper switch value
Byte 2: Upper switch value 0 –99, 255 When single pressing the pushbutton for ON, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 255)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_17_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 17: Switch multilevel set single-activation values for pushbutton 4, Byte 3

Lower switch value
Byte 3: Lower switch value 0 -99 When single pressing the pushbutton for OFF, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 0)
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 17: Switch multilevel set single-activation values for pushbutton 4, Byte 4

Duration
Byte 4: Duration 0 -255 When single pressing the pushbutton the Switch Multilevel Set with this duration value will be send to devices in the association group.  


0: Use dimmer default timer value. (Default)

1 –127: Duration in seconds.

128 –255: Duration in minutes (minus 127) from 1 –128 minutes, where 128 is 1 minute.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_4_01000000``` and is of type ```INTEGER```.


### Parameter 18: Switch Multilevel Set double-activation values for pushbutton 4. Byte 1

Enable/Disable
Byte 1: Enable / Disable

0 Disabled – A double activation of the pushbutton will not send commands to devices in the association group.

1 Enabled – A double activation will send commands to devices in the association group. Devices will receive commands with the values set in 3 following bytes. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_18_4_00000001``` and is of type ```INTEGER```.


### Parameter 18: Switch Multilevel Set double-activation values for pushbutton 4. Byte 2

Upper switch value
Byte 2: Upper switch value 0 –99, 255 When double pressing the pushbutton for ON, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 99)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_18_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 18: Switch Multilevel Set double-activation values for pushbutton 4. Byte 3

Lower switch value
Byte 3: Lower switch value 0 -99 When double pressing the pushbutton for OFF, a Switch Multilevel Set with this value will be send to devices in the association group. (Default = 99)
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_18_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 18: Switch Multilevel Set double-activation values for pushbutton 4. Byte 4

Duration
Byte 4: Duration 0 -255 When double pressing the pushbutton the Switch Multilevel Set with this duration value will be send to devices in the association group.  


0: Use dimmer default timer value. (Default)

1 –127: Duration in seconds.

128 –255: Duration in minutes (minus 127) from 1 –128 minutes, where 128 is 1 minute.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_4_01000000``` and is of type ```INTEGER```.

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

The MATRIX ZBA7140 supports 9 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.


Association group 1 supports 5 nodes.

### Group 2: Button 1 Basic

Button 1 Basic
Nodes in this group receives Basic Set when pushbutton 1 is activated, the on or off status is decided by the internal button status and is toggled between each activation 

Association group 2 supports 5 nodes.

### Group 3: Button 1 Multilevel

Button 1 Multilevel
Nodes in this group receives Switch Multilevel Set / Switch Multilevel Start Level Change/ Switch Multilevel Stop Level Change when pushbutton 1 is operated. It can, as an example, be used for controlling light dimmers.

Association group 3 supports 5 nodes.

### Group 4: Button 2 Basic

Button 2 Basic


Association group 4 supports 5 nodes.

### Group 5: Button 2 Multilevel

Button 2 Multilevel


Association group 5 supports 5 nodes.

### Group 5: Button 4 Basic

Button 4 Basic

Association group 5 supports 5 nodes.

### Group 6: Button 3 Basic

Button 3 Basic

Association group 6 supports 5 nodes.

### Group 7: Button 3 Multilevel

Button 3 Multilevel

Association group 7 supports 5 nodes.

### Group 9: Button 4 Multilevel

Button 4 Multilevel


Association group 9 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [manual](https://opensmarthouse.org/zwavedatabase/1330/reference/zba7140-user-manual-en-4.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1330).
