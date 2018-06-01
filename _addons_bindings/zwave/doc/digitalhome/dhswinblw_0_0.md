---
layout: documentation
title: DHS-WIN-BLW-DHS - ZWave
---

{% include base.html %}

# DHS-WIN-BLW-DHS Blind controller
This describes the Z-Wave device *DHS-WIN-BLW-DHS*, manufactured by *[Digital Home Systems Pty Ltd,](https://digitalhomesystems.com.au/)* with the thing type UID of ```digitalhome_dhswinblw_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![DHS-WIN-BLW-DHS product image](https://www.cd-jackson.com/zwave_device_uploads/850/850_default.jpg)


## Overview

The DHS Z-Wave AC Motor Shutter Controller DHS-WIN-BLW-DHS is Z-Wave Shutter device specifically designed for use in smart homes and offices. The product allows to operate roller blinds/shutters wirelessly using a Z-wave enabled (AUS/NZ version 921.42 MHz) controllers (compatible universal remote controllers, control panels, gateways, PC with Z-Wave USB dongle) or manually via connected manual switch. The shutter controller can act as a wireless repeater to ensure that commands intended for another device in the network are received. This is useful to eliminate “RF deadspots” when the radio range of the Z-Wave network is inuenced. This function is part of the Z-Wave network functionality and is set up via Z-Wave controller.

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

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Blinds | blinds_control | Blinds | Rollershutter | 
| Blinds | blinds_control | Blinds | Rollershutter | 

### Blinds

Provides start / stop control of blinds.

The ```blinds_control``` channel supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Blinds

Provides start / stop control of blinds.

The ```blinds_control``` channel supports the ```Rollershutter``` item and is in the ```Blinds``` category.



## Device Configuration

The following table provides a summary of the 12 configuration parameters available in the DHS-WIN-BLW-DHS.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Buttons mode | Buttons mode |
| 2 | Automatically close after | If not zero, automatically close blind after a user deö ned time |
| 3 | What to do on RF close command | How to interpret RF Off command |
| 4 | Typical click timeout | Typical time used to diff erentiate click, hold, double and triple clicks |
| 5 | Invert buttons |  |
| 6 | Action on button press or hold | Which command should be sent to Association group on button press or hold |
| 7 | LED mode | Set LED indication mode |
| 10 | Full close time | Time to go from opened to closed state |
| 11 | Full open time | Time to go from closed to open state |
| 12 | Node Id of the blocking device | Id of the device which can block movement of the blind |
| 13 |  Command from the blocking node | Which command from the blocking node indicates blocking is disabled |
| 14 | Invert open and close relays | Exchange open and close relays |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Buttons mode

Buttons mode
One push button: One button is used (chose any), press while moving up and down stops, while stopped moves to opposite direction to previous. // Two buttons with neutral position: Up click moves up if stopped and stops if moving down, Down click moves down if stopped and stops if moving up, Hold Up/Down moves in up/down, Release stops. // Two toggle switch: Switch to Up/Down moves up/down. // Two paddles with Power and Direction: Hold Up button to move blinds up. If Down button is pressed, blinds will move down. Release Up button to stop.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | One push button |
| 1 | Two paddles with Power and Direction |
| 2 | Two toggle switch |
| 3 | Two buttons with neutral position |

The manufacturer defined default value is ```3``` ( Two buttons with neutral position).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Automatically close after

If not zero, automatically close blind after a user deö ned time

Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: What to do on RF close command

How to interpret RF Off command
Defines how to interpret RF Off command. Can be used in conjunction with Auto Close function: Ignore - to open the door by motion detectors and close it back after some amount of time: in case of multiple motion detectors each would try to open that would break logics Open - to open on both On and Off paddle press on the remote and close after some amount of time. Button close click will still work (if button operations are not disabled). Note that Dim Down command will still begin close motion.
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

Typical time used to diff erentiate click, hold, double and triple clicks

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Invert buttons



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is ```0``` (No).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Action on button press or hold

Which command should be sent to Association group on button press or hold
Defines which command should be sent to Association group on button press or hold. Scene mode will send 1 for Up event, 2 for Stop, 3 for Down.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Switch On, Off and dim |
| 2 | Send Scene |

The manufacturer defined default value is ```1``` (Switch On, Off and dim).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: LED mode

Set LED indication mode

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
Time to go from opened to closed state. Used to estimate the current level. Note that in Permanent motion mode the reported value would be Closed or Opened, while all Basic and Multilevel Set values (1-99, 255) would Open except 0 value that would Close.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Full open time

Time to go from closed to open state
Time to go from closed to open state. This value may differ from full close time for some blinds due to gravity. Used to estimate the current level. Note that in Permanent motion mode the reported value would be Closed or Opened, while all Basic and Multilevel Set values (1-99, 255) would Open except 0 value that would Close.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Node Id of the blocking device

Id of the device which can block movement of the blind
Id of the device which commands would be interpreted not as Open/Close, but as block/unblock. Useful with door opening detector: if the door is open, block the blind not to break shades while they move.
Values in the range 0 to 24 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13:  Command from the blocking node

Which command from the blocking node indicates blocking is disabled

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | on On |
| 1 | on Off |

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Invert open and close relays

Exchange open and close relays
Allow exchanging open and close relays if blind control is wired to the motor incorrectly
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


This group supports 10 nodes.

### Group 2: Send reports on blind state change


This group supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_BINARY_V0| Linked to BASIC|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V0| |
| COMMAND_CLASS_SWITCH_ALL_V0| |
| COMMAND_CLASS_SCENE_ACTIVATION_V0| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V0| |
| COMMAND_CLASS_CONFIGURATION_V0| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V0| |
| COMMAND_CLASS_PROTECTION_V0| |
| COMMAND_CLASS_NODE_NAMING_V0| |
| COMMAND_CLASS_ASSOCIATION_V0| |
| COMMAND_CLASS_VERSION_V0| |
| COMMAND_CLASS_INDICATOR_V0| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V0| |

### Documentation Links

* [User Guide](https://www.cd-jackson.com/zwave_device_uploads/850/DHS-Shutter-ACController-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/850).
