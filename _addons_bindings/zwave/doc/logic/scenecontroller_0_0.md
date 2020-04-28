---
layout: documentation
title: Heatit Z-Scene Controller - ZWave
---

{% include base.html %}

# Heatit Z-Scene Controller Push button 6-gang
This describes the Z-Wave device *Heatit Z-Scene Controller*, manufactured by *[Logic Group](http://www.logic-group.com)* with the thing type UID of ```logic_scenecontroller_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Heatit Z-Scene Controller product image](https://www.cd-jackson.com/zwave_device_uploads/846/846_default.png)


The Heatit Z-Scene Controller does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The Heatit Z-Wave Scene Controller is a Z-Wave module specifically adapted to Gira KNX touch sensors. The Heatit Z-Wave Scene Controller is a device with built-in wireless Z-Wave communication that may be used to control other Z-Wave devices such as dimmers, relay modules, etc.

The scene controller has a built-in relay that can be used to turn on and off a local load, e.g. a lamp, thus replacing a standard 1-pole switch.

### Inclusion Information

Pushing the upper left button 3 times (triple click) will activate Inclusion Mode on the device. It is also possible to activate Inclusion Mode by triple clicking the switch inside the module (through a little hole in the front of the module).

### Exclusion Information

The inclusion and exclusion of the device is confirmed by sending out a Node Information Frame. Beside this, it may be necessary for certain network operations to send out a Node Information Frame. Triple clicking the button inside the module through a little hole (normally covered by GIRA module) or the upper left button will issue a Node Information Frame.

### Wakeup Information

The Heatit Z-Scene Controller does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Channels

The following table summarises the channels available for the Heatit Z-Scene Controller -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 
| LCD Backlight (Level) | indicator_level | indicator_level |  | Dimmer | 
| LCD Backlight (Period) | indicator_period | indicator_period |  | Number | 
| LCD Backlight (Flash) | indicator_flash | indicator_flash |  | Number | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer | 
| LED 1 (Level) | indicator_level1 | indicator_level |  | Dimmer | 
| LED 1 (Period) | indicator_period1 | indicator_period |  | Number | 
| LED 1 (Flash) | indicator_flash1 | indicator_flash |  | Number | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Dimmer 2 | switch_dimmer2 | switch_dimmer | DimmableLight | Dimmer | 
| LED 2 (Level) | indicator_level2 | indicator_level |  | Dimmer | 
| LED 2 (Period) | indicator_period2 | indicator_period |  | Number | 
| LED 2 (Flash) | indicator_flash2 | indicator_flash |  | Number | 
| Switch 3 | switch_binary3 | switch_binary | Switch | Switch | 
| Dimmer 3 | switch_dimmer3 | switch_dimmer | DimmableLight | Dimmer | 
| LED 3 (Level) | indicator_level3 | indicator_level |  | Dimmer | 
| LED 3 (Period) | indicator_period3 | indicator_period |  | Number | 
| LED 3 (Flash) | indicator_flash3 | indicator_flash |  | Number | 
| Switch 4 | switch_binary4 | switch_binary | Switch | Switch | 
| Dimmer 4 | switch_dimmer4 | switch_dimmer | DimmableLight | Dimmer | 
| LED 4 (Level) | indicator_level4 | indicator_level |  | Dimmer | 
| LED 4 (Period) | indicator_period4 | indicator_period |  | Number | 
| LED 4 (Flash) | indicator_flash4 | indicator_flash |  | Number | 
| Switch 5 | switch_binary5 | switch_binary | Switch | Switch | 
| Dimmer 5 | switch_dimmer5 | switch_dimmer | DimmableLight | Dimmer | 
| LED 5 (Level) | indicator_level5 | indicator_level |  | Dimmer | 
| LED 5 (Period) | indicator_period5 | indicator_period |  | Number | 
| LED 5 (Flash) | indicator_flash5 | indicator_flash |  | Number | 
| Switch 6 | switch_binary6 | switch_binary | Switch | Switch | 
| Dimmer 6 | switch_dimmer6 | switch_dimmer | DimmableLight | Dimmer | 
| LED 6 (Level) | indicator_level6 | indicator_level |  | Dimmer | 
| LED 6 (Period) | indicator_period6 | indicator_period |  | Number | 
| LED 6 (Flash) | indicator_flash6 | indicator_flash |  | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

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

### LCD Backlight (Level)
Sets the indicator brightness.

The ```indicator_level``` channel is of type ```indicator_level``` and supports the ```Dimmer``` item.

### LCD Backlight (Period)
Sets the indicator On/Off period.

The ```indicator_period``` channel is of type ```indicator_period``` and supports the ```Number``` item.

### LCD Backlight (Flash)
Sets the number of indicator flash cycles.

The ```indicator_flash``` channel is of type ```indicator_flash``` and supports the ```Number``` item.

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 1
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### LED 1 (Level)
Sets the indicator brightness.

The ```indicator_level1``` channel is of type ```indicator_level``` and supports the ```Dimmer``` item.

### LED 1 (Period)
Sets the indicator On/Off period.

The ```indicator_period1``` channel is of type ```indicator_period``` and supports the ```Number``` item.

### LED 1 (Flash)
Sets the number of indicator flash cycles.

The ```indicator_flash1``` channel is of type ```indicator_flash``` and supports the ```Number``` item.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 2
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer2``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### LED 2 (Level)
Sets the indicator brightness.

The ```indicator_level2``` channel is of type ```indicator_level``` and supports the ```Dimmer``` item.

### LED 2 (Period)
Sets the indicator On/Off period.

The ```indicator_period2``` channel is of type ```indicator_period``` and supports the ```Number``` item.

### LED 2 (Flash)
Sets the number of indicator flash cycles.

The ```indicator_flash2``` channel is of type ```indicator_flash``` and supports the ```Number``` item.

### Switch 3
Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 3
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer3``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### LED 3 (Level)
Sets the indicator brightness.

The ```indicator_level3``` channel is of type ```indicator_level``` and supports the ```Dimmer``` item.

### LED 3 (Period)
Sets the indicator On/Off period.

The ```indicator_period3``` channel is of type ```indicator_period``` and supports the ```Number``` item.

### LED 3 (Flash)
Sets the number of indicator flash cycles.

The ```indicator_flash3``` channel is of type ```indicator_flash``` and supports the ```Number``` item.

### Switch 4
Switch the power on and off.

The ```switch_binary4``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 4
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer4``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### LED 4 (Level)
Sets the indicator brightness.

The ```indicator_level4``` channel is of type ```indicator_level``` and supports the ```Dimmer``` item.

### LED 4 (Period)
Sets the indicator On/Off period.

The ```indicator_period4``` channel is of type ```indicator_period``` and supports the ```Number``` item.

### LED 4 (Flash)
Sets the number of indicator flash cycles.

The ```indicator_flash4``` channel is of type ```indicator_flash``` and supports the ```Number``` item.

### Switch 5
Switch the power on and off.

The ```switch_binary5``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 5
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer5``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### LED 5 (Level)
Sets the indicator brightness.

The ```indicator_level5``` channel is of type ```indicator_level``` and supports the ```Dimmer``` item.

### LED 5 (Period)
Sets the indicator On/Off period.

The ```indicator_period5``` channel is of type ```indicator_period``` and supports the ```Number``` item.

### LED 5 (Flash)
Sets the number of indicator flash cycles.

The ```indicator_flash5``` channel is of type ```indicator_flash``` and supports the ```Number``` item.

### Switch 6
Switch the power on and off.

The ```switch_binary6``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 6
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer6``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### LED 6 (Level)
Sets the indicator brightness.

The ```indicator_level6``` channel is of type ```indicator_level``` and supports the ```Dimmer``` item.

### LED 6 (Period)
Sets the indicator On/Off period.

The ```indicator_period6``` channel is of type ```indicator_period``` and supports the ```Number``` item.

### LED 6 (Flash)
Sets the number of indicator flash cycles.

The ```indicator_flash6``` channel is of type ```indicator_flash``` and supports the ```Number``` item.



## Device Configuration

The following table provides a summary of the 44 configuration parameters available in the Heatit Z-Scene Controller.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Upper paddle buttons mode | Configuration of Pair Mode for the upper two buttons (button #1 and #2) |
| 2 | Middle paddle buttons mode | Configuration of Pair Mode for the middle two buttons (button #3 and #4) |
| 3 | Lower paddle buttons mode | Configuration of Pair Mode for the lower two buttons (button #5 and #6) |
| 4 | LED #1 mode. | Configuration of the internal operation of LED #1 |
| 5 | LED #2 mode | Configuration of the internal operation of LED #2 |
| 6 | LED #3 mode | Configuration of the internal operation of LED #3 |
| 7 | LED #4 mode | Configuration of the internal operation of LED #4 |
| 8 | LED #5 mode | Configuration of the internal operation of LED #5 |
| 9 | LED #6 mode | Configuration of the internal operation of LED #6 |
| 10 | Relay mode | This parameter configures the built-in relay |
| 11 | Disable Central Scene notification | Disables or enables the sending of Central Scene notifications |
| 12 | Disable House Cleaning Mode | Disable House Cleaning Mode, double press = 100% light |
| 13 | Multilevel Switch  for button #1 | Configuration of the Multilevel Switch |
| 13 | Multilevel Switch for button #1 | Configuration of the Multilevel Switch |
| 13 | Lower switch value | Configuration of the Multilevel Switch |
| 13 | Multilevel Switch for button #1 | Configuration of the Multilevel Switch |
| 14 | Multilevel Switch for button #2 | Configuration of the Multilevel Switch |
| 14 | Multilevel Switch for button #2 | Configuration of the Multilevel Switch |
| 14 | Multilevel Switch for button #2 | Configuration of the Multilevel Switch |
| 14 | Multilevel Switch for button #2 | Configuration of the Multilevel Switch |
| 15 | Multilevel Switch for button #3 | Configuration of the Multilevel Switch |
| 15 | Multilevel Switch for button #3 | Configuration of the Multilevel Switch |
| 15 | Multilevel Switch for button #3 | Configuration of the Multilevel Switch |
| 15 | Multilevel Switch for button #3 | Configuration of the Multilevel Switch |
| 16 | Multilevel Switch for button #4 | Configuration of the Multilevel Switch |
| 16 | Multilevel Switch for button #4 | Configuration of the Multilevel Switch |
| 16 | Multilevel Switch for button #4 | Configuration of the Multilevel Switch |
| 16 | Multilevel Switch for button #4 | Configuration of the Multilevel Switch |
| 17 | Multilevel Switch for button #5 | Configuration of the Multilevel Switch |
| 17 | Multilevel Switch for button #5 | Configuration of the Multilevel Switch |
| 17 | Multilevel Switch for button #5 | Configuration of the Multilevel Switch |
| 17 | Multilevel Switch for button #5 | Configuration of the Multilevel Switch |
| 18 | Multilevel Switch for button #6 | Configuration of the Multilevel Switch |
| 18 | Multilevel Switch for button #6 | Configuration of the Multilevel Switch |
| 18 | Multilevel Switch for button #6 | Configuration of the Multilevel Switch |
| 18 | Multilevel Switch for button #6 | Configuration of the Multilevel Switch |
| 19 | Association groups for button 1 | Association groups for button 1 |
| 20 | Association groups for button 2 | Association groups for button 2 |
| 21 | Association groups for button 3 | Association groups for button 3 |
| 22 | Association groups for button 4 | Association groups for button 4 |
| 23 | Association groups for button 5 | Association groups for button 5 |
| 24 | Association groups for button 6 | Association groups for button 6 |
| 25 | Backlight control | Configuration of backlight control. |
| 26 | Basic Set for endpoint 0 | Enable or disable that Basic Set commands to the root device |

### Parameter 1: Upper paddle buttons mode

Configuration of Pair Mode for the upper two buttons (button #1 and #2)
0 Separate mode (toggle mode). (Default)

1 In pair mode, left side sends on/up commands, right side sends off/down commands.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Separate mode (toggle mode). (Default) |
| 1 | Left side ON/UP, right side OFF/DOWN |

The manufacturer defined default value is ```0``` (Separate mode (toggle mode). (Default)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Middle paddle buttons mode

Configuration of Pair Mode for the middle two buttons (button #3 and #4)
0 Separate mode (toggle mode). (Default)

1 In pair mode, left side sends on/up commands, right side sends off/down commands.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Separate mode (toggle mode). (Default) |
| 1 | Left side ON/UP, right side OFF/DOWN |

The manufacturer defined default value is ```0``` (Separate mode (toggle mode). (Default)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Lower paddle buttons mode

Configuration of Pair Mode for the lower two buttons (button #5 and #6)
0 Separate mode (toggle mode). (Default)

1 In pair mode, left side sends on/up commands, right side sends off/down commands.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Separate mode (toggle mode). (Default) |
| 1 | Left side ON/UP, right side OFF/DOWN |

The manufacturer defined default value is ```0``` (Separate mode (toggle mode). (Default)).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: LED #1 mode.

Configuration of the internal operation of LED #1
0 LED indication is disabled (LED can be controlled by Indicator Command Class Set commands).

1 LED indicates the status of the corresponding button. (Default)

2 LED indicates the status of the corresponding button, with inverted indication.

3 LED indicates the status of corresponding paddle (in pair mode).

4 LED indicates the status of the corresponding paddle (in pair mode), with inverted indication.

5 LED indicates the status of the built-in relay.

6 LED indicates the status of the built-in relay, with inverted indication.

7 LED show a 5 seconds indication when the corresponding button is pressed.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED indication is disabled |
| 1 | Status of the corresponding button |
| 2 | Status of the corresponding button, inverted |
| 3 | Status of corresponding paddle (pair mode) |
| 4 | Status of corresponding paddle (pair mode) inv |
| 5 | Status of the built-in relay |
| 6 | Status of the built-in relay, inverted |
| 7 | LED activated on button press |

The manufacturer defined default value is ```1``` (Status of the corresponding button).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: LED #2 mode

Configuration of the internal operation of LED #2
0 LED indication is disabled (LED can be controlled by Indicator Command Class Set commands).

1 LED indicates the status of the corresponding button. (Default)

2 LED indicates the status of the corresponding button, with inverted indication.

3 LED indicates the status of corresponding paddle (in pair mode).

4 LED indicates the status of the corresponding paddle (in pair mode), with inverted indication.

5 LED indicates the status of the built-in relay.

6 LED indicates the status of the built-in relay, with inverted indication.

7 LED show a 5 seconds indication when the corresponding button is pressed.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED indication is disabled |
| 1 | Status of the corresponding button |
| 2 | Status of the corresponding button, inverted |
| 3 | Status of corresponding paddle (pair mode) |
| 4 | Status of corresponding paddle (pair mode) inv |
| 5 | Status of the built-in relay |
| 6 | Status of the built-in relay, inverted |
| 7 | LED activated on button press |

The manufacturer defined default value is ```1``` (Status of the corresponding button).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: LED #3 mode

Configuration of the internal operation of LED #3
0 LED indication is disabled (LED can be controlled by Indicator Command Class Set commands).

1 LED indicates the status of the corresponding button. (Default)

2 LED indicates the status of the corresponding button, with inverted indication.

3 LED indicates the status of corresponding paddle (in pair mode).

4 LED indicates the status of the corresponding paddle (in pair mode), with inverted indication.

5 LED indicates the status of the built-in relay.

6 LED indicates the status of the built-in relay, with inverted indication.

7 LED show a 5 seconds indication when the corresponding button is pressed.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED indication is disabled |
| 1 | Status of the corresponding button |
| 2 | Status of the corresponding button, inverted |
| 3 | Status of corresponding paddle (pair mode) |
| 4 | Status of corresponding paddle (pair mode) inv |
| 5 | Status of the built-in relay |
| 6 | Status of the built-in relay, inverted |
| 7 | LED activated on button press |

The manufacturer defined default value is ```1``` (Status of the corresponding button).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: LED #4 mode

Configuration of the internal operation of LED #4
0 LED indication is disabled (LED can be controlled by Indicator Command Class Set commands).

1 LED indicates the status of the corresponding button. (Default)

2 LED indicates the status of the corresponding button, with inverted indication.

3 LED indicates the status of corresponding paddle (in pair mode).

4 LED indicates the status of the corresponding paddle (in pair mode), with inverted indication.

5 LED indicates the status of the built-in relay.

6 LED indicates the status of the built-in relay, with inverted indication.

7 LED show a 5 seconds indication when the corresponding button is pressed.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED indication is disabled |
| 1 | Status of the corresponding button |
| 2 | Status of the corresponding button, inverted |
| 3 | Status of corresponding paddle (pair mode) |
| 4 | Status of corresponding paddle (pair mode) inv |
| 5 | Status of the built-in relay |
| 6 | Status of the built-in relay, inverted |
| 7 | LED activated on button press |

The manufacturer defined default value is ```1``` (Status of the corresponding button).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: LED #5 mode

Configuration of the internal operation of LED #5
0 LED indication is disabled (LED can be controlled by Indicator Command Class Set commands).

1 LED indicates the status of the corresponding button. (Default)

2 LED indicates the status of the corresponding button, with inverted indication.

3 LED indicates the status of corresponding paddle (in pair mode).

4 LED indicates the status of the corresponding paddle (in pair mode), with inverted indication.

5 LED indicates the status of the built-in relay.

6 LED indicates the status of the built-in relay, with inverted indication.

7 LED show a 5 seconds indication when the corresponding button is pressed.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED indication is disabled |
| 1 | Status of the corresponding button |
| 2 | Status of the corresponding button, inverted |
| 3 | Status of corresponding paddle (pair mode) |
| 4 | Status of corresponding paddle (pair mode) inv |
| 5 | Status of the built-in relay |
| 6 | Status of the built-in relay, inverted |
| 7 | LED activated on button press |

The manufacturer defined default value is ```1``` (Status of the corresponding button).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: LED #6 mode

Configuration of the internal operation of LED #6
0 LED indication is disabled (LED can be controlled by Indicator Command Class Set commands).

1 LED indicates the status of the corresponding button. (Default)

2 LED indicates the status of the corresponding button, with inverted indication.

3 LED indicates the status of corresponding paddle (in pair mode).

4 LED indicates the status of the corresponding paddle (in pair mode), with inverted indication.

5 LED indicates the status of the built-in relay.

6 LED indicates the status of the built-in relay, with inverted indication.

7 LED show a 5 seconds indication when the corresponding button is pressed.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | LED indication is disabled |
| 1 | Status of the corresponding button |
| 2 | Status of the corresponding button, inverted |
| 3 | Status of corresponding paddle (pair mode) |
| 4 | Status of corresponding paddle (pair mode) inv |
| 5 | Status of the built-in relay |
| 6 | Status of the built-in relay, inverted |
| 7 | LED activated on button press |

The manufacturer defined default value is ```1``` (Status of the corresponding button).

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Relay mode

This parameter configures the built-in relay
0 Relay is disabled.

1 Relay is controlled by button #1 or by upper paddle when pair mode is active. (Default)

2 Relay is controlled by button #2 or by upper paddle when pair mode is active.

3 Relay is controlled by button #3 or by middle paddle when pair mode is active.

4 Relay is controlled by button #4 or by middle paddle when pair mode is active.

5 Relay is controlled by button #5 or by lower paddle when pair mode is active.

6 Relay is controlled by button #6 or by lower paddle when pair mode is active.

7 Relay is activated for one second and is controlled by button #1 or by upper paddle when pair mode is active.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Relay is disabled |
| 1 | Controlled by button 1 |
| 2 | Controlled by button 2 |
| 3 | Controlled by button 3 |
| 4 | Controlled by button 4 |
| 5 | Controlled by button 5 |
| 6 | Controlled by button 6 |
| 7 | Controlled by button 1, 1 sec |

The manufacturer defined default value is ```1``` (Controlled by button 1).

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Disable Central Scene notification

Disables or enables the sending of Central Scene notifications
0 Central Scene notifications are enabled. (Default)

1 Central Scene notifications are disabled.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Enabled |
| 1 | Disabled |

The manufacturer defined default value is ```0``` (Enabled).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Disable House Cleaning Mode

Disable House Cleaning Mode, double press = 100% light
0 House Cleaning Mode is enabled (Default)

1 House Cleaning Mode is disabled; double-press button scene notifications will be disabled too.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | House Cleaning Mode is enabled (Default) |
| 1 | House Cleaning Mode is disabled |

The manufacturer defined default value is ```0``` (House Cleaning Mode is enabled (Default)).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Multilevel Switch  for button #1

Configuration of the Multilevel Switch
Byte 1: Enable / Disable

0 Disabled – When single pressing the button, nodes associated to group 6 won’t be switched.

1 Enabled – When single pressing the button, nodes associated to group 6 will be switched between the configured upper and lower switch values. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_13_4_00000001``` and is of type ```INTEGER```.


### Parameter 13: Multilevel Switch for button #1

Configuration of the Multilevel Switch
Byte 2: Upper switch value

0 – 99, 255 When single pressing the button for ON, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 255)
The following option values may be configured, in addition to values in the range 0 to 99 -:

| Value  | Description |
|--------|-------------|
| 255 | On |

The manufacturer defined default value is ```255``` (ON).

This parameter has the configuration ID ```config_13_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 13: Lower switch value

Configuration of the Multilevel Switch
Byte 3: Lower switch value

0 - 99 When single pressing the button for OFF, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 0)
The following option values may be configured, in addition to values in the range 0 to 99 -:

| Value  | Description |
|--------|-------------|
| 0 | Off |

The manufacturer defined default value is ```0``` (OFF).

This parameter has the configuration ID ```config_13_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 13: Multilevel Switch for button #1

Configuration of the Multilevel Switch
Byte 4: Not used – must be set to 0.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_4_01000000``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 14: Multilevel Switch for button #2

Configuration of the Multilevel Switch
Byte 1: Enable / Disable

0 Disabled – When single pressing the button, nodes associated to group 6 won’t be switched.

1 Enabled – When single pressing the button, nodes associated to group 6 will be switched between the configured upper and lower switch values. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_14_4_00000001``` and is of type ```INTEGER```.


### Parameter 14: Multilevel Switch for button #2

Configuration of the Multilevel Switch
Byte 2: Upper switch value

0 – 99, 255 When single pressing the button for ON, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 255)
The following option values may be configured, in addition to values in the range 0 to 99 -:

| Value  | Description |
|--------|-------------|
| 255 | On |

The manufacturer defined default value is ```255``` (ON).

This parameter has the configuration ID ```config_14_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 14: Multilevel Switch for button #2

Configuration of the Multilevel Switch
Byte 3: Lower switch value

0 - 99 When single pressing the button for OFF, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 0)
The following option values may be configured, in addition to values in the range 0 to 99 -:

| Value  | Description |
|--------|-------------|
| 0 | Off |

The manufacturer defined default value is ```0``` (OFF).

This parameter has the configuration ID ```config_14_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 14: Multilevel Switch for button #2

Configuration of the Multilevel Switch
Byte 4: Not used – must be set to 0.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_4_01000000``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 15: Multilevel Switch for button #3

Configuration of the Multilevel Switch
Byte 1: Enable / Disable

0 Disabled – When single pressing the button, nodes associated to group 6 won’t be switched.

1 Enabled – When single pressing the button, nodes associated to group 6 will be switched between the configured upper and lower switch values. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_15_4_00000001``` and is of type ```INTEGER```.


### Parameter 15: Multilevel Switch for button #3

Configuration of the Multilevel Switch
Byte 2: Upper switch value

0 – 99, 255 When single pressing the button for ON, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 255)
The following option values may be configured, in addition to values in the range 0 to 99 -:

| Value  | Description |
|--------|-------------|
| 255 | On |

The manufacturer defined default value is ```255``` (ON).

This parameter has the configuration ID ```config_15_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 15: Multilevel Switch for button #3

Configuration of the Multilevel Switch
Byte 3: Lower switch value

0 - 99 When single pressing the button for OFF, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 0)
The following option values may be configured, in addition to values in the range 0 to 99 -:

| Value  | Description |
|--------|-------------|
| 0 | Off |

The manufacturer defined default value is ```0``` (OFF).

This parameter has the configuration ID ```config_15_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 15: Multilevel Switch for button #3

Configuration of the Multilevel Switch
Byte 4: Not used – must be set to 0.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_15_4_01000000``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 16: Multilevel Switch for button #4

Configuration of the Multilevel Switch
Byte 1: Enable / Disable

0 Disabled – When single pressing the button, nodes associated to group 6 won’t be switched.

1 Enabled – When single pressing the button, nodes associated to group 6 will be switched between the configured upper and lower switch values. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_16_4``` and is of type ```INTEGER```.


### Parameter 16: Multilevel Switch for button #4

Configuration of the Multilevel Switch
Byte 2: Upper switch value

0 – 99, 255 When single pressing the button for ON, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 255)
The following option values may be configured, in addition to values in the range 0 to 99 -:

| Value  | Description |
|--------|-------------|
| 255 | On |

The manufacturer defined default value is ```255``` (ON).

This parameter has the configuration ID ```config_16_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 16: Multilevel Switch for button #4

Configuration of the Multilevel Switch
Byte 3: Lower switch value

0 - 99 When single pressing the button for OFF, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 0)
The following option values may be configured, in addition to values in the range 0 to 99 -:

| Value  | Description |
|--------|-------------|
| 0 | Off |

The manufacturer defined default value is ```0``` (OFF).

This parameter has the configuration ID ```config_16_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 16: Multilevel Switch for button #4

Configuration of the Multilevel Switch
Byte 4: Not used – must be set to 0.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_4_01000000``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 17: Multilevel Switch for button #5

Configuration of the Multilevel Switch
Byte 1: Enable / Disable

0 Disabled – When single pressing the button, nodes associated to group 6 won’t be switched.

1 Enabled – When single pressing the button, nodes associated to group 6 will be switched between the configured upper and lower switch values. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_17_4_00000001``` and is of type ```INTEGER```.


### Parameter 17: Multilevel Switch for button #5

Configuration of the Multilevel Switch
Byte 2: Upper switch value

0 – 99, 255 When single pressing the button for ON, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 255)
The following option values may be configured, in addition to values in the range 0 to 99 -:

| Value  | Description |
|--------|-------------|
| 255 | On |

The manufacturer defined default value is ```255``` (ON).

This parameter has the configuration ID ```config_17_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 17: Multilevel Switch for button #5

Configuration of the Multilevel Switch
Byte 3: Lower switch value

0 - 99 When single pressing the button for OFF, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 0)
The following option values may be configured, in addition to values in the range 0 to 99 -:

| Value  | Description |
|--------|-------------|
| 0 | Off |

The manufacturer defined default value is ```0``` (OFF).

This parameter has the configuration ID ```config_17_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 17: Multilevel Switch for button #5

Configuration of the Multilevel Switch
Byte 4: Not used – must be set to 0.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_4_01000000``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 18: Multilevel Switch for button #6

Configuration of the Multilevel Switch
Byte 1: Enable / Disable

0 Disabled – When single pressing the button, nodes  associated to group 6 won’t be switched.

1 Enabled – When single pressing the button, nodes associated to group 6 will be switched between the configured upper and lower switch values. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_18_4_00000001``` and is of type ```INTEGER```.


### Parameter 18: Multilevel Switch for button #6

Configuration of the Multilevel Switch
Byte 2: Upper switch value

0 – 99, 255 When single pressing the button for ON, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 255)
The following option values may be configured, in addition to values in the range 0 to 99 -:

| Value  | Description |
|--------|-------------|
| 255 | On |

The manufacturer defined default value is ```255``` (ON).

This parameter has the configuration ID ```config_18_4_0000FF00``` and is of type ```INTEGER```.


### Parameter 18: Multilevel Switch for button #6

Configuration of the Multilevel Switch
Byte 3: Lower switch value

0 - 99 When single pressing the button for OFF, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 0)
The following option values may be configured, in addition to values in the range 0 to 99 -:

| Value  | Description |
|--------|-------------|
| 0 | Off |

The manufacturer defined default value is ```0``` (OFF).

This parameter has the configuration ID ```config_18_4_00FF0000``` and is of type ```INTEGER```.


### Parameter 18: Multilevel Switch for button #6

Configuration of the Multilevel Switch
Byte 4: Not used – must be set to 0.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_4_01000000``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 19: Association groups for button 1

Association groups for button 1
0 When commands are received by device 1, nodes in the association groups will not be switched, button activations will still send switch values.

1 When commands are received by device 1, nodes in the association groups will be switched. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Not switched |
| 1 | Switched |

The manufacturer defined default value is ```1``` (Switched).

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Association groups for button 2

Association groups for button 2
0 When commands are received by device 1, nodes in the association groups will not be switched, button activations will still send switch values.

1 When commands are received by device 1, nodes in the association groups will be switched. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Not switched |
| 1 | Switched |

The manufacturer defined default value is ```1``` (Switched).

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Association groups for button 3

Association groups for button 3
0 When commands are received by device 1, nodes in the association groups will not be switched, button activations will still send switch values.

1 When commands are received by device 1, nodes in the association groups will be switched. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Not switched |
| 1 | Switched |

The manufacturer defined default value is ```1``` (Switched).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Association groups for button 4

Association groups for button 4
0 When commands are received by device 1, nodes in the association groups will not be switched, button activations will still send switch values.

1 When commands are received by device 1, nodes in the association groups will be switched. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Not switched |
| 1 | Switched |

The manufacturer defined default value is ```1``` (Switched).

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 23: Association groups for button 5

Association groups for button 5
0 When commands are received by device 1, nodes in the association groups will not be switched, button activations will still send switch values.

1 When commands are received by device 1, nodes in the association groups will be switched. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Not switched |
| 1 | Switched |

The manufacturer defined default value is ```1``` (Switched).

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: Association groups for button 6

Association groups for button 6
0 When commands are received by device 1, nodes in the association groups will not be switched, button activations will still send switch values.

1 When commands are received by device 1, nodes in the association groups will be switched. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Not switched |
| 1 | Switched |

The manufacturer defined default value is ```1``` (Switched).

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Backlight control

Configuration of backlight control.
0 Backlight is only controlled by Indicator Command Class – commands send to endpoint 0.

1 Backlight is turned on for 5 seconds when a button is pressed. (Default)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | By indicator command class |
| 1 | 5 sec when button pressed |

The manufacturer defined default value is ```1``` (5 sec when button pressed).

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 26: Basic Set for endpoint 0

Enable or disable that Basic Set commands to the root device
Enable or disable that Basic Set commands to the root device will be able to control the backlight.

Value Description

0 Basic Set commands to endpoint 0 is forwarded to endpoint 1 (Default).

1 Basic Set commands to endpoint 0 controls backlight (on/off).
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Forwarded to endpoint 1 |
| 1 | Controls backlight |

The manufacturer defined default value is ```0``` (Forwarded to endpoint 1).

This parameter has the configuration ID ```config_26_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Heatit Z-Scene Controller supports 31 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: Basic Report On/Off button 1

Send Basic Report (On/Off) when button #1 is used

Association group 2 supports 5 nodes.

### Group 3: Basic Set On/Off button #1

Sends Basic Set (On/Off) when button #1 is used

Association group 3 supports 5 nodes.

### Group 4: Binary Switch Set On/Off button #1

Sends Binary Switch Set (On/Off) when button #1 is used

Association group 4 supports 5 nodes.

### Group 5: Binary Toggle Switch Set button #1

Send Binary Toggle Switch Set when button #1 is used.

Association group 5 supports 5 nodes.

### Group 6: Multilevel Switch for button #1

Sends Multilevel Switch Set / Multilevel Switch Start Level Change / Multilevel Switch Stop Level Change when button #1 is used.

Association group 6 supports 5 nodes.

### Group 7: Basic Report On/Off button 2

Send Basic Report (On/Off) when button #2 is used

Association group 7 supports 5 nodes.

### Group 8: Basic Set On/Off button #2

Sends Basic Set (On/Off) when button #2 is used

Association group 8 supports 5 nodes.

### Group 9: Binary Switch Set On/Off button #2

Sends Binary Switch Set (On/Off) when button #2 is used

Association group 9 supports 5 nodes.

### Group 10: Binary Toggle Switch Set button #2

Send Binary Toggle Switch Set when button #2 is used

Association group 10 supports 5 nodes.

### Group 11: Multilevel Switch for button #2

Sends Multilevel Switch Set / Multilevel Switch Start Level Change / Multilevel Switch Stop Level Change when button #2 is used.

Association group 11 supports 5 nodes.

### Group 12: Basic Report On/Off button 3

Send Basic Report (On/Off) when button #3 is used

Association group 12 supports 5 nodes.

### Group 13: Basic Set On/Off button #3

Sends Basic Set (On/Off) when button #3 is used

Association group 13 supports 5 nodes.

### Group 14: Binary Switch Set On/Off button #3

Sends Binary Switch Set (On/Off) when button #3 is used

Association group 14 supports 5 nodes.

### Group 15: Binary Toggle Switch Set button #3

Send Binary Toggle Switch Set when button #3 is used.

Association group 15 supports 5 nodes.

### Group 16: Multilevel Switch for button #3

Sends Multilevel Switch Set / Multilevel Switch Start Level Change / Multilevel Switch Stop Level Change when button #3 is used.

Association group 16 supports 5 nodes.

### Group 17: Basic Report On/Off button 4

Send Basic Report (On/Off) when button #4 is used

Association group 17 supports 5 nodes.

### Group 18: Basic Set On/Off button #4

Sends Basic Set (On/Off) when button #4 is used

Association group 18 supports 5 nodes.

### Group 19: Binary Switch Set On/Off button #4

Sends Binary Switch Set (On/Off) when button #4 is used

Association group 19 supports 5 nodes.

### Group 20: Binary Toggle Switch Set button #4

Send Binary Toggle Switch Set when button #4 is used

Association group 20 supports 5 nodes.

### Group 21: Multilevel Switch for button #4

Sends Multilevel Switch Set / Multilevel Switch Start Level Change / Multilevel Switch Stop Level Change when button #4 is used.

Association group 21 supports 5 nodes.

### Group 22: Basic Report On/Off button #5

Sends Basic Report (On/Off) when button #5 is used

Association group 22 supports 5 nodes.

### Group 23: Basic Set On/Off button #5

Sends Basic Set (On/Off) when button #5 is used

Association group 23 supports 5 nodes.

### Group 24: Binary Switch Set On/Off button #5

Sends Binary Switch Set (On/Off) when button #5 is used

Association group 24 supports 5 nodes.

### Group 25: Binary Toggle Switch Set button #5

Send Binary Toggle Switch Set when button #5 is used

Association group 25 supports 5 nodes.

### Group 26: Multilevel Switch for button #5

Sends Multilevel Switch Set / Multilevel Switch Start Level Change / Multilevel Switch Stop Level Change when button #5 is used.

Association group 26 supports 5 nodes.

### Group 27: Basic Report On/Off button 6

Send Basic Report (On/Off) when button #6 is used

Association group 27 supports 5 nodes.

### Group 28: Basic Set On/Off button #6

Sends Basic Set (On/Off) when button #6 is used

Association group 28 supports 5 nodes.

### Group 29: Binary Switch Set On/Off button #6

Sends Binary Switch Set (On/Off) when button #6 is used

Association group 29 supports 5 nodes.

### Group 30: Binary Toggle Switch Set button #6

Send Binary Toggle Switch Set when button #6 is used

Association group 30 supports 5 nodes.

### Group 31: Multilevel Switch for button #6

Sends Multilevel Switch Set / Multilevel Switch Start Level Change / Multilevel Switch Stop Level Change when button #6 is used.

Association group 31 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_TOGGLE_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V2| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_TOGGLE_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_TOGGLE_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_TOGGLE_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_TOGGLE_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_TOGGLE_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
#### Endpoint 6

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_TOGGLE_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/846/manualmultiregzwavescenecontroller.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/846).
