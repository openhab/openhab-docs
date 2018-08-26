---
layout: documentation
title: Heatit Z-Scene Controller - ZWave
---

{% include base.html %}

# Heatit Z-Scene Controller Push button 6-gang
This describes the Z-Wave device *Heatit Z-Scene Controller*, manufactured by *[Logic Home Control](http://logichome.dk/)* with the thing type UID of ```logic_scenecontroller_00_000```.

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

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number |  | Number | 
| Switch 1 | switch_binary1 | Switch | Switch | 
| Dimmer 1 | switch_dimmer1 | DimmableLight | Dimmer | 
| Switch 2 | switch_binary2 | Switch | Switch | 
| Dimmer 2 | switch_dimmer2 | DimmableLight | Dimmer | 
| Switch 3 | switch_binary3 | Switch | Switch | 
| Dimmer 3 | switch_dimmer3 | DimmableLight | Dimmer | 
| Switch 4 | switch_binary4 | Switch | Switch | 
| Dimmer 4 | switch_dimmer4 | DimmableLight | Dimmer | 
| Switch 5 | switch_binary5 | Switch | Switch | 
| Dimmer 5 | switch_dimmer5 | DimmableLight | Dimmer | 
| Switch 6 | switch_binary6 | Switch | Switch | 
| Dimmer 6 | switch_dimmer6 | DimmableLight | Dimmer | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number

Triggers when a scene button is pressed.

The ```scene_number``` channel supports the ```Number``` item.

### Switch 1

Switch the power on and off.

The ```switch_binary1``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 1

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch 2

Switch the power on and off.

The ```switch_binary2``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 2

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer2``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch 3

Switch the power on and off.

The ```switch_binary3``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 3

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer3``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch 4

Switch the power on and off.

The ```switch_binary4``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 4

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer4``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch 5

Switch the power on and off.

The ```switch_binary5``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 5

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer5``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Switch 6

Switch the power on and off.

The ```switch_binary6``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer 6

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer6``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The following table provides a summary of the 26 configuration parameters available in the Heatit Z-Scene Controller.
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
| 14 | Multilevel Switch for button #2 | Configuration of the Multilevel Switch |
| 15 | Multilevel Switch for button #3 | Configuration of the Multilevel Switch |
| 16 | Multilevel Switch for button #4 | Configuration of the Multilevel Switch |
| 17 | Multilevel Switch for button #5 | Configuration of the Multilevel Switch |
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
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Middle paddle buttons mode

Configuration of Pair Mode for the middle two buttons (button #3 and #4)
0 Separate mode (toggle mode). (Default)

1 In pair mode, left side sends on/up commands, right side sends off/down commands.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Lower paddle buttons mode

Configuration of Pair Mode for the lower two buttons (button #5 and #6)
0 Separate mode (toggle mode). (Default)

1 In pair mode, left side sends on/up commands, right side sends off/down commands.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

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
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```1```.

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
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```1```.

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
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```1```.

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
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```1```.

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
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```1```.

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
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```1```.

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

7 Relay is activated for one second and is controlled by button #1 or by upper paddle when pair mode is active.
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Disable Central Scene notification

Disables or enables the sending of Central Scene notifications
0 Central Scene notifications are enabled. (Default)

1 Central Scene notifications are disabled.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Disable House Cleaning Mode

Disable House Cleaning Mode, double press = 100% light
0 House Cleaning Mode is enabled (Default)

1 House Cleaning Mode is disabled; double-press button scene notifications will be disabled too.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Multilevel Switch  for button #1

Configuration of the Multilevel Switch
**Byte 1**: Enable / Disable

0 Disabled – When single pressing the button, nodes associated to group 6 won’t be switched.

1 Enabled – When single pressing the button, nodes associated to group 6 will be switched between the configured upper and lower switch values. (Default)

**Byte 2**: Upper switch value

0 – 99, 255 When single pressing the button for ON, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 255)

**Byte 3**: Lower switch value

0 - 99 When single pressing the button for OFF, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 0)

**Byte 4**: Not used – must be set to 0.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_13_4``` and is of type ```INTEGER```.


### Parameter 14: Multilevel Switch for button #2

Configuration of the Multilevel Switch
**Byte 1**: Enable / Disable

0 Disabled – When single pressing the button, nodes associated to group 6 won’t be switched.

1 Enabled – When single pressing the button, nodes associated to group 6 will be switched between the configured upper and lower switch values. (Default)

**Byte 2**: Upper switch value

0 – 99, 255 When single pressing the button for ON, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 255)

**Byte 3**: Lower switch value

0 - 99 When single pressing the button for OFF, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 0)

**Byte 4:** Not used – must be set to 0.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_14_4``` and is of type ```INTEGER```.


### Parameter 15: Multilevel Switch for button #3

Configuration of the Multilevel Switch
**Byte 1**: Enable / Disable

0 Disabled – When single pressing the button, nodes associated to group 6 won’t be switched.

1 Enabled – When single pressing the button, nodes associated to group 6 will be switched between the configured upper and lower switch values. (Default)

**Byte 2**: Upper switch value

0 – 99, 255 When single pressing the button for ON, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 255)

**Byte 3**: Lower switch value

0 - 99 When single pressing the button for OFF, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 0)

**Byte 4**: Not used – must be set to 0.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_15_4``` and is of type ```INTEGER```.


### Parameter 16: Multilevel Switch for button #4

Configuration of the Multilevel Switch
**Byte 1**: Enable / Disable

0 Disabled – When single pressing the button, nodes associated to group 6 won’t be switched.

1 Enabled – When single pressing the button, nodes associated to group 6 will be switched between the configured upper and lower switch values. (Default)

**Byte 2**: Upper switch value

0 – 99, 255 When single pressing the button for ON, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 255)

**Byte 3**: Lower switch value

0 - 99 When single pressing the button for OFF, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 0)

**Byte 4**: Not used – must be set to 0.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_16_4``` and is of type ```INTEGER```.


### Parameter 17: Multilevel Switch for button #5

Configuration of the Multilevel Switch
**Byte 1**: Enable / Disable

0 Disabled – When single pressing the button, nodes associated to group 6 won’t be switched.

1 Enabled – When single pressing the button, nodes associated to group 6 will be switched between the configured upper and lower switch values. (Default)

**Byte 2**: Upper switch value

0 – 99, 255 When single pressing the button for ON, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 255)

**Byte 3**: Lower switch value

0 - 99 When single pressing the button for OFF, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 0)

**Byte 4**: Not used – must be set to 0.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_17_4``` and is of type ```INTEGER```.


### Parameter 18: Multilevel Switch for button #6

Configuration of the Multilevel Switch
**Byte 1**: Enable / Disable

0 Disabled – When single pressing the button, nodes associated to group 6 won’t be switched.

1 Enabled – When single pressing the button, nodes associated to group 6 will be switched between the configured upper and lower switch values. (Default)

**Byte 2**: Upper switch value

0 – 99, 255 When single pressing the button for ON, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 255)

**Byte 3**: Lower switch value

0 - 99 When single pressing the button for OFF, a Multilevel Switch Set with this value will be send to devices in association group 6. (Default = 0)

**Byte 4**: Not used – must be set to 0.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_18_4``` and is of type ```INTEGER```.


### Parameter 19: Association groups for button 1

Association groups for button 1
0 When commands are received by device 1, nodes in the association groups will not be switched, button activations will still send switch values.

1 When commands are received by device 1, nodes in the association groups will be switched. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_19_1``` and is of type ```INTEGER```.


### Parameter 20: Association groups for button 2

Association groups for button 2
0 When commands are received by device 1, nodes in the association groups will not be switched, button activations will still send switch values.

1 When commands are received by device 1, nodes in the association groups will be switched. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Association groups for button 3

Association groups for button 3
0 When commands are received by device 1, nodes in the association groups will not be switched, button activations will still send switch values.

1 When commands are received by device 1, nodes in the association groups will be switched. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Association groups for button 4

Association groups for button 4
0 When commands are received by device 1, nodes in the association groups will not be switched, button activations will still send switch values.

1 When commands are received by device 1, nodes in the association groups will be switched. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 23: Association groups for button 5

Association groups for button 5
0 When commands are received by device 1, nodes in the association groups will not be switched, button activations will still send switch values.

1 When commands are received by device 1, nodes in the association groups will be switched. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: Association groups for button 6

Association groups for button 6
0 When commands are received by device 1, nodes in the association groups will not be switched, button activations will still send switch values.

1 When commands are received by device 1, nodes in the association groups will be switched. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Backlight control

Configuration of backlight control.
0 Backlight is only controlled by Indicator Command Class – commands send to endpoint 0.

1 Backlight is turned on for 5 seconds when a button is pressed. (Default)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 26: Basic Set for endpoint 0

Enable or disable that Basic Set commands to the root device
Enable or disable that Basic Set commands to the root device will be able to control the backlight.

Value Description

0 Basic Set commands to endpoint 0 is forwarded to endpoint 1 (Default).

1 Basic Set commands to endpoint 0 controls backlight (on/off).
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_26_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Heatit Z-Scene Controller supports 31 association groups.

### Group 1: Lifeline


This group supports 5 nodes.

### Group 2: Basic Report On/Off button 1

Send Basic Report (On/Off) when button #1 is used
This group supports 5 nodes.

### Group 3: Basic Set On/Off button #1

Sends Basic Set (On/Off) when button #1 is used
This group supports 5 nodes.

### Group 4: Binary Switch Set On/Off button #1

Sends Binary Switch Set (On/Off) when button #1 is used
This group supports 5 nodes.

### Group 5: Binary Toggle Switch Set button #1

Send Binary Toggle Switch Set when button #1 is used.
This group supports 5 nodes.

### Group 6: Multilevel Switch for button #1

Sends Multilevel Switch Set / Multilevel Switch Start Level Change / Multilevel Switch Stop Level Change when button #1 is used.
This group supports 5 nodes.

### Group 7: Basic Report On/Off button 2

Send Basic Report (On/Off) when button #2 is used
This group supports 5 nodes.

### Group 8: Basic Set On/Off button #2

Sends Basic Set (On/Off) when button #2 is used
This group supports 5 nodes.

### Group 9: Binary Switch Set On/Off button #2

Sends Binary Switch Set (On/Off) when button #2 is used
This group supports 5 nodes.

### Group 10: Binary Toggle Switch Set button #2

Send Binary Toggle Switch Set when button #2 is used
This group supports 5 nodes.

### Group 11: Multilevel Switch for button #2

Sends Multilevel Switch Set / Multilevel Switch Start Level Change / Multilevel Switch Stop Level Change when button #2 is used.
This group supports 5 nodes.

### Group 12: Basic Report On/Off button 3

Send Basic Report (On/Off) when button #3 is used
This group supports 5 nodes.

### Group 13: Basic Set On/Off button #3

Sends Basic Set (On/Off) when button #3 is used
This group supports 5 nodes.

### Group 14: Binary Switch Set On/Off button #3

Sends Binary Switch Set (On/Off) when button #3 is used
This group supports 5 nodes.

### Group 15: Binary Toggle Switch Set button #3

Send Binary Toggle Switch Set when button #3 is used.
This group supports 5 nodes.

### Group 16: Multilevel Switch for button #3

Sends Multilevel Switch Set / Multilevel Switch Start Level Change / Multilevel Switch Stop Level Change when button #3 is used.
This group supports 5 nodes.

### Group 17: Basic Report On/Off button 4

Send Basic Report (On/Off) when button #4 is used
This group supports 5 nodes.

### Group 18: Basic Set On/Off button #4

Sends Basic Set (On/Off) when button #4 is used
This group supports 5 nodes.

### Group 19: Binary Switch Set On/Off button #4

Sends Binary Switch Set (On/Off) when button #4 is used
This group supports 5 nodes.

### Group 20: Binary Toggle Switch Set button #4

Send Binary Toggle Switch Set when button #4 is used
This group supports 5 nodes.

### Group 21: Multilevel Switch for button #4

Sends Multilevel Switch Set / Multilevel Switch Start Level Change / Multilevel Switch Stop Level Change when button #4 is used.
This group supports 5 nodes.

### Group 22: Basic Report On/Off button #5

Sends Basic Report (On/Off) when button #5 is used
This group supports 5 nodes.

### Group 23: Basic Set On/Off button #5

Sends Basic Set (On/Off) when button #5 is used
This group supports 5 nodes.

### Group 24: Binary Switch Set On/Off button #5

Sends Binary Switch Set (On/Off) when button #5 is used
This group supports 5 nodes.

### Group 25: Binary Toggle Switch Set button #5

Send Binary Toggle Switch Set when button #5 is used
This group supports 5 nodes.

### Group 26: Multilevel Switch for button #5

Sends Multilevel Switch Set / Multilevel Switch Start Level Change / Multilevel Switch Stop Level Change when button #5 is used.
This group supports 5 nodes.

### Group 27: Basic Report On/Off button 6

Send Basic Report (On/Off) when button #6 is used
This group supports 5 nodes.

### Group 28: Basic Set On/Off button #6

Sends Basic Set (On/Off) when button #6 is used
This group supports 5 nodes.

### Group 29: Binary Switch Set On/Off button #6

Sends Binary Switch Set (On/Off) when button #6 is used
This group supports 5 nodes.

### Group 30: Binary Toggle Switch Set button #6

Send Binary Toggle Switch Set when button #6 is used
This group supports 5 nodes.

### Group 31: Multilevel Switch for button #6

Sends Multilevel Switch Set / Multilevel Switch Start Level Change / Multilevel Switch Stop Level Change when button #6 is used.
This group supports 5 nodes.

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
