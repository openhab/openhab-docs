---
layout: documentation
title: KFOB - ZWave
---

{% include base.html %}

# KFOB 4 button keyfob
This describes the Z-Wave device *KFOB*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_kfob_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![KFOB product image](https://www.cd-jackson.com/zwave_device_uploads/146/146_default.png)


The KFOB does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The Secure Key Fob Controller is a 4 button Z-Wave device capable to act both as primary or secondary controller. The four buttons can control other Z-Wave devices such as switches, dimmer and even door locks directly. Various options - configurable by Z-Wave configuration commands - define the actions and the commands used for this control. It is possible to use two sets of buttons (one of on/open/up and one for off/closed/down) or 4 single buttons to control 4 different groups of devices.  
  
The controller also allows triggering scenes in a central controller. Again different modes can be configured to adapt to the various implementations of scenes in different central controllers in the market.  
  
Control options also include special modes like 'all on/off' or always controlling the Z-Wave device in proximity to the fob. The device supports secure communication when included with enhanced security option and when communicating to a device also supporting enhanced security option. Otherwise the device will automatically turn into normal communication. to maintain backward compatibility.

### Inclusion Information

KFOB

When in factory default push Button 3 (secure) or Button 4 (normal) for one second to enter inclusion mode. Inclusion mode is indicated by a blinking green LED.

From second device on you need to enter management mode:

  1. Push all four buttons together for one second - green led blinks slowly)
  2. Hit button 3 ( enter primary controller functions - green led blinks faster)
  3. Then button 1 (secure) or button 2 (normal).

KFOB2

When in factory default push any button for one second to enter inclusion mode. The inclusion mode is indicated by a blinking green LED.

From second device on you need to enter management mode:

  1. Enter management mode by pushing all four buttons together for 5 seconds (until green led blinks slowly)
  2. Hit button 1 (enter primary controller functions - green led blinks faster)

### Exclusion Information

KFOB

  1. Enter management mode by pushing all four buttons together for one second - green led blinks slowly),
  2. Hit button 3 ( enter primary controller functions - green led blinks faster) and
  3. Then button 3 again.

KFOB2

  1. Enter management mode by pushing all four buttons together for 5 seconds (until green led blinks slowly)
  2. Hit button 1 ( enter primary controller functions - green led blinks faster)

### Wakeup Information

The KFOB does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


  1. Enter management mode by pushing all four buttons together for one second - green led blinks slowly),
  2. Then hit button 2 .

## Channels

The following table summarises the channels available for the KFOB -:

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

The following table provides a summary of the 11 configuration parameters available in the KFOB.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Button 1 and 3 pair mode | Button 1 and 3 pair mode |
| 2 | Button 2 and 4 pair mode | Button 2 and 4 pair mode |
| 11 | Action on group A | Action on group A |
| 12 | Action on group B | Action on group B |
| 13 | Action on group C | Action on group C |
| 14 | Action on group D | Action on group D |
| 20 | Typical click timeout | Typical time used to differenciate click, hold and double clicks in 10ms units |
| 21 | Send the following Switch All commands |  |
| 22 | Invert buttons |  |
| 24 | LED confirmation mode |  |
| 30 | Send unsolicited Battery Report on Wake Up |  |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Button 1 and 3 pair mode

Button 1 and 3 pair mode
  * In separate mode button 1 works with Group A, button 3 with Group C. Click is ON, Hold is dimming UP, Double click is OFF, Click-Hold is dimming DOWN.
  * In pair button 1/3 are UP/DOWN correspondingly. Click is ON/OFF, Hold is dimming UP/DOWN. Single clicks works with Group A, double click with Group C
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Separately |
| 1 | In pair without double clicks |
| 2 | In pair with double clicks |

The manufacturer defined default value is ```1``` (In pair without double clicks).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Button 2 and 4 pair mode

Button 2 and 4 pair mode
  * In separate mode button 2 works with control group B, button 4 with control group D. Click is ON, Hold is dimming UP, Double click is OFF, Click-Hold is dimming DOWN.
  * In pair button B/D are UP/DOWN correspondingly. Click is ON/OFF, Hold is dimming UP/DOWN. Single clicks works with Group B, double click with Group D.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Separately |
| 1 | In pair without double clicks |
| 2 | In pair with double clicks |

The manufacturer defined default value is ```1``` (In pair without double clicks).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 11: Action on group A

Action on group A
This parameter defines the command to be sent to devices of control group A when the related button is pressed.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch all |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Action on group B

Action on group B
This parameter defines the command to be sent to devices of control group B when the related button is pressed.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch all |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim ).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Action on group C

Action on group C
This parameter defines the command to be sent to devices of control group C when the related button is pressed
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch all |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim ).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Action on group D

Action on group D
This parameter defines the command to be sent to devices of control group D when the related button is pressed
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only (send Basic Set) |
| 3 | Switch all |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 6 | Control devices in proximity |

The manufacturer defined default value is ```1``` (Switch On/Off and Dim ).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 20: Typical click timeout

Typical time used to differenciate click, hold and double clicks in 10ms units

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Send the following Switch All commands



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| -1 | Switch all on and off |
| 1 | NO (Normal Open) |
| 2 | NC (Normal Close) |

The manufacturer defined default value is ```1``` (NO (Normal Open)).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Invert buttons



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is ```0``` (No).

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 24: LED confirmation mode



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No confirmations |
| 1 | Confirm button press |
| 2 | Confirm button press and delivery |

The manufacturer defined default value is ```2``` (Confirm button press and delivery).

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 30: Send unsolicited Battery Report on Wake Up



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | To same node as wake up notification |
| 2 | Broadcast to neighbours |

The manufacturer defined default value is ```0``` (No).

This parameter has the configuration ID ```config_30_1``` and is of type ```INTEGER```.

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

The KFOB supports 5 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 10 nodes.

### Group 2: Group A

Controlled by button 1 or single clicks of buttons 1 and 3

Association group 2 supports 10 nodes.

### Group 3: Group B

Ccontrolled by button 2 or single clicks of buttons 2 and 4

Association group 3 supports 10 nodes.

### Group 4: Group C

Controlled by button 3 or single clicks of buttons 1 and 3

Association group 4 supports 10 nodes.

### Group 5: Group D

Controlled by button 4 or double clicks of buttons 2 and 4

Association group 5 supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V1| Linked to BASIC|
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CMD_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/146/Manual-KFOB-POPP-C-En.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/146).
