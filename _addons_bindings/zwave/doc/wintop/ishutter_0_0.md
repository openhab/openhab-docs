---
layout: documentation
title: iShutter - ZWave
---

{% include base.html %}

# iShutter iShutter
This describes the Z-Wave device *iShutter*, manufactured by *Wintop* with the thing type UID of ```wintop_ishutter_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![iShutter product image](https://www.cd-jackson.com/zwave_device_uploads/329/329_default.png)


The iShutter supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Shutter Control

### Inclusion Information

Continuously switch on and switch off the external switch 3 times quickly to start the inclusion or exclusion process

### Exclusion Information

Continuously switch on and switch off the external switch 3 times quickly to start the inclusion or exclusion process

## Channels

The following table summarises the channels available for the iShutter -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch 1 | switch_binary | switch_binary | Switch | Switch | 
| Switch 2 | switch_binary1 | switch_binary | Switch | Switch | 
|  | switch_binary2 | switch_binary | Switch | Switch | 

### Switch 1
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 2
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### 
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 12 configuration parameters available in the iShutter.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Buttons Mode | See overview |
| 2 | Automatically close after | If not zero, automatically close blind after a user defined time |
| 3 | What to do on RF close command | Defines how to interpret RF Off command. |
| 4 | Typical click timeout | time used to differentiate click, hold, double and triple clicks |
| 5 | Invert buttons | Invert buttons |
| 6 | Action on button press or hold | Defines which command should be sent to Association group |
| 7 | LED mode | Set LED indication mode |
| 10 | Full close time | Time to go from opened to closed state. |
| 11 | Full open time | Time to go from closed to open state |
| 12 | Node Id of the blocking device | Id of the device which commands would not be Open/Close, but as block/unblock. |
| 13 | Protected command | Protected command |
| 14 | Invert open and close relays | Allow exchanging open and close relays |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Buttons Mode

See overview
0 -> One push button

1 -> Two paddles with Power and Direction

2 -> Two toggle switch

3 -> Two buttons with neutral position 

One push button: One button is used (chose any), press while moving up and down, stops, while stopped moves to opposite direction to previous. Two buttons with neutral position: Up click moves up if stopped and stops if moving down, Down click moves down 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | One push button |
| 1 | Two paddles with Power and Direction |
| 2 | Two toggle switch |
| 3 | Two buttons with neutral position |

The manufacturer defined default value is ```0``` (One push button).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Automatically close after

If not zero, automatically close blind after a user defined time

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: What to do on RF close command

Defines how to interpret RF Off command.
0 -> Close

1 -> Ignore

2 -> Open

3 -> Open if closed, otherwise Close

Can be used in conjunction with Auto Close function: Ignore - to open the door by motion detectors and close it back after some amount of time: in case of multiple motion detectors each would try to open that would that would break logics; Open - to open on both On and Off paddle press on the remote and close after some amount of time. Button close click will still work (if button operations are not disabled). Note that Dim Down command will still begin close motion. 
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

time used to differentiate click, hold, double and triple clicks
1 - 100 -> in 10ms units
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Invert buttons

Invert buttons
0 -> No

1 -> Yes 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is ```0``` (No).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Action on button press or hold

Defines which command should be sent to Association group
Defines which command should be sent to Association group on button press or hold. Scene mode will send 1 for Up event, 2 for Stop, 3 for Down.

1 -> Switch On, Off and dim using Basic Set and MultiLevel Start/Stop Changing

2 -> Send Scene 
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Switch On, Off and dim using Basic Set |
| 2 | Send Scene |

The manufacturer defined default value is ```1``` (Switch On, Off and dim using Basic Set).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: LED mode

Set LED indication mode
0 -> Disabled

1 -> Show working state

2 -> Always on

3 -> Show opened state

4 -> Indicator Command Class
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

Time to go from opened to closed state.
Used to estimate the current level. Note that in Permanent motion mode the reported value would a be Closed or Opened, while all Basic and  multilevel Set values (1-99, 255) would Open except 0 value that would Close. 
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Full open time

Time to go from closed to open state
Time to go from closed to open state. This value may differ from Full close time for some blinds due to gravity. Used to estimate the current level. Note that in Permanent motion mode the reported value would a be Closed or Opened, while all Basic and Multilevel Set values (1-99, 255) would Open except 0 value that would Close
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Node Id of the blocking device

Id of the device which commands would not be Open/Close, but as block/unblock.
Id of the device which commands would be interpreted not as Open/Close, but as block/unblock. Usefull with door opening detector: if the door is open, block the blind not to break shades while they move.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Protected command

Protected command
Which command from blocking device is closed door and hence, unprotected.

0 -> on On

1 -> on Off
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | on On |
| 1 | on Off |

The manufacturer defined default value is ```0``` (on On).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Invert open and close relays

Allow exchanging open and close relays
Allow exchanging open and close relays if blind control is wired to the motor incorrectly 

0 -> No

1 -> Yes
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

The iShutter supports 2 association groups.

### Group 1: Click, press and hold of up/down buttons

Click, press and hold of up/down buttons

Association group 1 supports 10 nodes.

### Group 2:  Send Reports on blind state change

Send Reports on blind state change

Association group 2 supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |

### Documentation Links

* [User manual for iShutter](https://www.cd-jackson.com/zwave_device_uploads/329/iModuleShutter-11222RA-94-V0-4.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/329).
