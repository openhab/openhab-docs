---
layout: documentation
title: DHS-WIN-BLW-DHS - ZWave
---

{% include base.html %}

# DHS-WIN-BLW-DHS Blind controller
This describes the Z-Wave device *DHS-WIN-BLW-DHS*, manufactured by *Wintop* with the thing type UID of ```wintop_dhswinblwdhs_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![DHS-WIN-BLW-DHS product image](https://www.cd-jackson.com/zwave_device_uploads/859/859_default.png)


The DHS-WIN-BLW-DHS supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The DHS Z-Wave AC Motor Shutter Controller DHS-WIN-BLW-DHS is Z-Wave Shutter device specifically designed for use in smart homes and offices. 

The product allows to operate roller blinds/shutters wirelessly using a Z-wave enabled (AUS/NZ version 921.42 MHz) controllers (compatible universal remote controllers, control panels, gateways, PC with Z-Wave USB dongle) or manually via connected manual switch.

The shutter controller can act as a wireless repeater to ensure that commands intended for another device in the network are received. This is useful to eliminate “RF deadspots” when the radio range of the Z-Wave network is influenced. This function is part of the Z-Wave network functionality and is set up via Z-Wave controller.

### Inclusion Information

  1. Connect the Z-Wave Shutter Controller to the motor, power circuits and to the manual switches as per instructions in the section INSTALLATION above.
  2. When the Shutter Controller is not yet included in a Z-Wave network, NWI works for 30 seconds when the Shutter Controller is power ON. Make sure your Z-Wave Gateway is in the correct operating mode (inclusion). To include/exclude press 5 times any connected buttons. During the whole procedure controller (Gateway) and Z-Wave Shutter Controller must be in close proximity of 3 m. Successful inclusion will be indicated by your Z-Wave remote controller (Gateway). In case inclusion was not successful, try the procedure again or reset network settings by running exclusion procedure (see below).
  3. Once the Z-Wave Shutter Controller has been added into your Z-Wave home network successfully, you may need to assign it to a speciö c button on your controller (Gateway). Refer to your Z-Wave controller (Gateway) / panel for instructions on how to do this.
  4. Now, you can control your lamp via your Z-Wave Gateway or other controller

### Exclusion Information

  1. Install Connect the Z-Wave Shutter Controller to the load, power circuits and to the manual switch as per instructions in the section INSTALLATION above.
  2. Start exclusion procedure on your controller and when requested press and release any connected button 5 times. During the whole procedure the controller and Z-Wave Shutter Controller must be close proximity of not more then 3 m.
  3. Successful exclusion will be indicated by your Z-Wave remote controller. LED on the Z-Wave Shutter Controller will start slow blinking. In case exclusion was not successful, try the procedure again.

## Channels

The following table summarises the channels available for the DHS-WIN-BLW-DHS -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 

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



## Device Configuration

The following table provides a summary of the 12 configuration parameters available in the DHS-WIN-BLW-DHS.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Buttons mode | Set number and type of directly connected buttons |
| 2 | Automatically close after | If not zero, automatically close blind after a user defined time |
| 3 | What to do on RF close command | What to do on RF close command |
| 4 | Typical click timeout | Typical time used to differentiate click, hold, double and triple clicks |
| 5 | Invert buttons | Invert buttons |
| 6 | Action on button press or hold | Which command sent to Association group on button press or hold. |
| 7 | Set LED indication mode |  |
| 10 | Full close time | Time to go from opened to closed state |
| 11 | Full open time | Time to go from closed to open state |
| 12 | Node Id of the blocking device | Node Id of the blocking device |
| 13 | Blocking mode command | Blocking mode command |
| 14 | Invert open and close relays | Invert open and close relays |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Buttons mode

Set number and type of directly connected buttons
  * One push button: One button is used (chose any), press while moving up and down stops, while stopped moves to opposite direction to previous.
  * Two buttons with neutral position: Up click moves up if stopped and stops if moving down, Down click moves down if stopped and stops if moving up, Hold Up/Down moves in up/down, Release stops.
  * Two toggle switch: Switch to Up/Down moves up/down.
  * Two paddles with Power and Direction: Hold Up button to move blinds up. If Down button is pressed, blinds will move down. Release Up button to stop.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | One push button |
| 1 | Two paddles with Power and Direction |
| 2 | Two toggle switch |
| 3 | Two buttons with neutral position |

The manufacturer defined default value is ```3``` (Two buttons with neutral position).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Automatically close after

If not zero, automatically close blind after a user defined time

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: What to do on RF close command

What to do on RF close command

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Close |
| 1 | Ignore |
| 2 | Open |
| 3 | Open if closed, otherwise Close |

The manufacturer defined default value is ```0``` (Close).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Typical click timeout

Typical time used to differentiate click, hold, double and triple clicks

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Invert buttons

Invert buttons

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is ```0``` (No).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Action on button press or hold

Which command sent to Association group on button press or hold.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Basic |
| 2 | Send Scene |

The manufacturer defined default value is ```1``` (Basic).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Set LED indication mode



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Show working state |
| 2 | Always on |
| 3 | Show opened state |
| 4 | Indicator Command Class |

The manufacturer defined default value is ```1``` (Show working state).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 10: Full close time

Time to go from opened to closed state
Time to go from opened to closed state. Used to estimate the current level. Note that in Permanent motion mode the reported value would be Closed or Opened, while all Basic and Multilevel Set values (1-99, 255) would Open except 0 value that would Close
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Full open time

Time to go from closed to open state
 Time to go from closed to open state. This value may differ from full close time for some blinds due to gravity. Used to estimate the current level. Note that in Permanent motion mode the reported value would be Closed or Opened, while all Basic and Multilevel Set values (1-99, 255) would Open except 0 value that would Close
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Node Id of the blocking device

Node Id of the blocking device
Id of the device which commands would be interpreted not as Open/Close, but as block/unblock. Useful with door opening detector: if the door is open, block the blind not to break shades while they move. 
Values in the range 0 to 24 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Blocking mode command

Blocking mode command
Defines which command from blocking device to interpret as closed door and hence, unprotected.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | On |
| 1 | Off |

The manufacturer defined default value is ```0``` (On).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Invert open and close relays

Invert open and close relays

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is ```0``` (No).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The DHS-WIN-BLW-DHS supports 2 association groups.

### Group 1: Click, press and hold of up/down buttons

Click, press and hold of up/down buttons

Association group 1 supports 10 nodes.

### Group 2: Send Reports on blind state change

Send Reports on blind state change

Association group 2 supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V2| |

### Documentation Links

* [User Guide](https://www.cd-jackson.com/zwave_device_uploads/859/DHS-Shutter-ACController-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/859).
