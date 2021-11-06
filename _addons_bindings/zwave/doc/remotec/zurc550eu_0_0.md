---
layout: documentation
title: Z-URC 550EU - ZWave
---

{% include base.html %}

# Z-URC 550EU Z-Wave Enabled Universal Remote Control
This describes the Z-Wave device *Z-URC 550EU*, manufactured by *Remotec* with the thing type UID of ```remotec_zurc550eu_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![Z-URC 550EU product image](https://opensmarthouse.org/zwavedatabase/1427/image/)


The Z-URC 550EU does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Your Z-URC will be able to control all the Z-Wave products around your house.

### Inclusion Information

  1. Enter Z-Wave Additional Feature Setup Mode by pressing and holding the Conf and Remove key for 3 seconds then the OK light will remain on.
  2. Place the two remotes close to each other.
  3. Enter 8363 on the XpressZetupTM keypad the OK light will flash once after you enter one digit and then will keep flashing after entering all 4 digits.
  4. Make sure the primary source remote is set up to send information to your Z-URCTMremote control. (Refer to the target remotes user manual for more information)
  5. When the replication has been completed the OK light flashes once slowly and then turns off.

Note: If the replication is unsuccessful, the OK light turns off and the error light will flash 6 times then turn off.

### Exclusion Information

See Inclusion.

### Wakeup Information

The Z-URC 550EU does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


See Inclusion, but press 836**4** instead of 836**3**, see manual p. 9.

### General Usage Information

Set the remote to Listening mode (press Conf+Remove for 3 seconds, then enter 836**4**, see manual p. 9) and tell your application to send the associations to the remote (for OH 3.1: click 'Save (Ctrl-S)' on the Thing Configuration page).

## Channels

The following table summarises the channels available for the Z-URC 550EU -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Z-URC 550EU supports 16 association groups.

### Group 1: Button 1

Button 1

Association group 1 supports 32 nodes.

### Group 2: Button 2

Button 2

Association group 2 supports 32 nodes.

### Group 3: Button 3

Button 3

Association group 3 supports 32 nodes.

### Group 4: Button 4

Button 4

Association group 4 supports 32 nodes.

### Group 5: Button 5

Button 5

Association group 5 supports 32 nodes.

### Group 6: Button 6

Button 6

Association group 6 supports 32 nodes.

### Group 7: Button 7

Button 7

Association group 7 supports 32 nodes.

### Group 8: Button 8

Button 8

Association group 8 supports 32 nodes.

### Group 9: Button 9

Button 9

Association group 9 supports 32 nodes.

### Group 10: Button 10

Button 10

Association group 10 supports 32 nodes.

### Group 11: Button 11

Button 11

Association group 11 supports 32 nodes.

### Group 12: Button 12

Button 12

Association group 12 supports 32 nodes.

### Group 13: Button 13

Button 13

Association group 13 supports 32 nodes.

### Group 14: Button 14

Button 14

Association group 14 supports 32 nodes.

### Group 15: Button 15

Button 15

Association group 15 supports 32 nodes.

### Group 16: Button 16

Button 16

Association group 16 supports 32 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_CONTROLLER_REPLICATION_V1| |
| COMMAND_CLASS_SCENE_CONTROLLER_CONF_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Z-URC 550EU manual](https://opensmarthouse.org/zwavedatabase/1427/reference/8332_manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1427).
