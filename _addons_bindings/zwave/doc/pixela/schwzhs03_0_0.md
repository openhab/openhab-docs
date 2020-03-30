---
layout: documentation
title: ZHS03 - ZWave
---

{% include base.html %}

# ZHS03 Wall Controller
This describes the Z-Wave device *ZHS03*, manufactured by *Pixela Corporation* with the thing type UID of ```pixela_schwzhs03_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZHS03 product image](https://www.cd-jackson.com/zwave_device_uploads/1227/1227_default.png)


The ZHS03 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The SCHWAIGER ZHS03 Z-Wave Secure Wall Controller is a Z-Wave device that can both control other Z-Wave devices and activate predefined scenes in an IP gateway. Although it is controlling other devices, the Wall Controller cannot act as Z-Wave network controller (primary or secondary) and will always need a Z-Wave network controller to be included into a Z-Wave network. The device can be used in different modes that are selected by configuration parameters:

  1. Control of groups of other Z-Wave devices using 'ON', 'OFF' and Dim commands.
  2. Activation of predefined scenes in Gateways or other Z-Wave devices.

This device support **secure communication** when included by a controller that also supports securecommunication. The device will then send all commands as secure commands unless the receiving device cannot accept them. Then the command is send the normal way automatically.

**Batteries**  
  
The unit is operated by batteries. Use only batteries of correct type. Never mix old and new batteries in the same device. Used batteries contain hazardous substances and should not be disposed of with household waste!  
  
Battery Type:  **1 x CR2032**

**Installation Guidelines**  
  
On factory default state pushing any button for one seconds starts inclusion (red/green LED blinking fast). Thisbehavior can be used to test the factory default or exclusion state.  
  
The device can be mounted on every dry and flat surface using either screws or double side adhesive. First the mounting base is fixed on the wall. Next step the switch frame is placed on the 2 frame and the electronic insert is used to fix the frame to the mounting base as shown on the image. Finally the switching paddle(s) are mounted on the electronic base.  
  
For battery change, the switching paddle(s) need to be removed. The CR battery can be replaced by pushingthe little nipple above the battery. The old battery will slide out and the new battery is inserted until the nipple will hold it again.  
  
The device can be operated in two different modes:  
  
**Operation Mode:**

This is the mode where the device is controlling other Z-Wave devices or isactivating scenes.  
  
**Management Mode:**

The device is turned into the management mode by pushing all four buttons for 5 sec. A blinking green LED indicates the management mode. In the management mode the buttons of the device have different functions. If no further action is performed, the device will turn back tothe normal mode after 10 sec. Any management action terminates the management mode as well.  
  
In management mode the following actions can be performed:

**Button 1:**

Re-Inclusion/Exclusion: Every re-inclusion or exclusion attempt is confirmed by hittingthis button. Any button press stops the mode as well.

**Button 2:**

Send Node Information Frame and Wake up Notification. (see explanation below)

**Button 3:**

Factory Default Reset. After clicking on button 3 keep button 4 pushed for >4 seconds

**Button 4:**

Enter into Association mode to assign target devices to one of the four association. Referto the manuals section about association for more information how to set and unset association groups.

**Factory Reset**  
  
The device can be set back to factory defaults without performing an exclusion process. Please executes the following steps: (1) Turn the device into Management Mode, (2) click on Button 3, (3) keep button 4 pushed for 4 seconds.

**Child Protection**  
  
The device can be turn into a child protection mode. In this mode all local operation is disabled. The device can be turned into a child protection mode. In this mode all local operation is disabled. The child protection mode MUST be turned on wirelessly. However, in protected by sequence mode it is possible to unlock the device for local operation by pressing any button for 5 seconds. The unlock state will last for 5 seconds.

**LED Control**  
  
1. Confirmation - green 2 sec  
2. Failure - red 2 sec  
3. Button press confirmation - green 1/4 sec  
4. Waiting for Network Management mode selection - green blinks  
5. Waiting for group selection in Association Set Mode - green fast blink  
6. Waiting for NIF in Association Set Mode - green-red - off blink

### Inclusion Information

  * Turn the Z-Wave Controller into inclusion mode
  * Turn the device into the management mode by pushing all four buttons for 5 sec. A blinking green LED indicates the management mode.
  * Press button 1 to start a network wide inclusion or button 3 to start a lokal inclusion.

### Exclusion Information

  * Turn the Z-Wave Controller into exclusion mode
  * Turn the device into the management mode by pushing all four buttons for 5 sec. A blinking green LED indicates the management mode.
  * Press button 1 to start a network wide exclusion or button 3 to start a lokal exclusion.

### Wakeup Information

The ZHS03 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


This device is battery operated and turned into deep sleep state most of the time to save battery life time. Communication with the device is limited. In order to communicate with the device, a static controller C is needed in the network. This controller will maintain a mailbox for the battery operated devices and store commands that can not be received during deep sleep state. Without such a controller, communication may become impossible and/or the battery life time is significantly decreased.  
  
This device will wakeup regularly and announce the wakeup state by sending out a so called Wakeup Notification. The controller can then empty the mailbox. Therefore, the device needs to be configured with the desired wakeup interval and the node ID of the controller. If the device was included by a static controller this controller will usually perform all necessary configurations. The wakeup interval is a tradeoff between maximal battery life time and the desired responses of the device.  
  
The device will stay awake right after inclusion for 10 seconds allowing the controller to perform certa inconfiguration actions. It is possible to manually wake up the device by pushing button 2 in management mode.  
  
The minimum allowed wakeup time is 240s but it is strongly recommended to define a much longer interval since the only purpose of a wakeup should be the reporting of the battery status or an update of the child protection settings. Defining Node ID of 0 as a destination of the Wakeup Notification will disable the periodical wakeup function entirely.  
  
It is possible to set the node ID to 255 to send wakeup notifications as broadcast. In this mode device takes more time to go to sleep and drains battery faster, but can notify all it's direct neighbors about a wakeup.

### General Usage Information

Depending on the button mode and operating modes configured using the configuration parameters the key fob can be used in different ways.  
  
Button modes:  
  
**4 Groups are controlled with single button (parameter 1/2 = 0)** The four buttons 1-4 control one single controlgroup each: 1->A, 2->B, 3->C, 4->D. Single click turns devices in the control group on, double click turns themoff. Click and hold can be used for dimming.  
  
**2 Groups are controlled with two buttons (parameter 1/2 = 1)** The buttons 1 and 3 control the control group A (button on turns on, buttons turns off), the buttons 2 and 4 control the control group B (button on turns on, buttons turns off). In case dimmers are controlled, holding down the larger button will dim up, holding downthe smaller button will dim down the load. Releasing the button will stop the dimming function.  
  
**4 Groups are controlled with two buttons and double click (parameter 1/2 = 2)** This mode enhances the previous mode and allows to control two further control groups C and D using double clicks.  
  
Operating modes:  
  
The devices supports 8 different operating modes - this means the kind of command sent out when pushing abutton. Operating modes either directly control other devices or they issue various scene activation commands to a central controller. Operating modes for direct device control are:  
  
**Direct Control of associated devices with On/Off/Dim commands (parameter 11...14 = 1)**. Devices are controlled using Basic Set On/Off commands and SwitchMultilevel Dim Start/Stop. This mode implements communication pattern 7.  
  
**Direct Control of associated devices with only On/Off commands (parameter 11...14 = 2)**. Devices are controlled using only Basic Set On/Off commands. On dimming Up event On is sent, on dimming Down Off is sent. This mode also implements communication pattern 7.  
  
**Switch All commands (parameter 11...14 = 3)** In this mode a all neighbouring devices will receive SwitchAll Set On/Off command and interpret it according to their membership in SwitchAll groups.This mode implements communication pattern 7.  
  
**Door Lock Control (parameter 11...14 = 7)** This modes allows direct control (open/close) of electronic door locks using secure communication. The mode implements communication pattern 7.  
  
Operating modes for scene activation are:  
  
**Direct Activation of preconfigured scenes (parameter 11...14 = 5)** Associated devices in an association group are controlled by individual commands defines by Z-Wave command class ‘Scene Controller Configuration’. This mode enhances mode Direct Control of associated devices with On/Off/Dim commands and implements communication patterns 6 and 7. Please turn the button mode to 'seperate' to allow different scene id on every button.  
  
**Scene Activation in IP Gateway (parameter 11...14 = 4)** If configured correctly the buttons can trigger a scene in a gateway. The scene number triggered is a combination of the group number and the action performed on the button and has always two digits. The group number defines the upper digit of the scene number, the action the lower digit. The following actions are possible:1 = On  
2 = Off  
3 = Dim Up Start  
4 = Dim Down Start  
5 = Dim Up Stop  
6 = Dim Down Stop  
  
Example: Clicking/double clicking the button will issue scene triggers, scene 11 (button 1 click, event on), scene 12 (button double click 1, event off, single button control is used in this example)  
  
**Activation of Central Scenes (parameter 11...14 = 8, Default)** Z-Wave Plus introduces a new process for scene activation - the central scene control. Pushing a button and releasing a button sends a certain command to the central controller using the lifeline association group. This allows to react both on button push and button release. This mode implements communication patterns 6 but requires a central gateway supporting Z-Wav Plus.

## Channels

The following table summarises the channels available for the ZHS03 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

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

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 10 configuration parameters available in the ZHS03.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Button 1 and 3 pair mode | Button 1 and 3 pair mode |
| 2 | Button 2 and 4 pair mode | Button 2 and 4 pair mode |
| 11 | Command to Control Group A | Command to Control Group A |
| 12 | Command to Control Group B | Command to Control Group B |
| 13 | Command to Control Group C | Command to Control Group C |
| 14 | Command to Control Group D | Command to Control Group D |
| 21 | Send the following Switch All commands | Send the following Switch All commands |
| 22 | Invert buttons | Invert buttons |
| 25 | Blocks wakeup even when wakeup interval is set | Blocks wakeup even when wakeup interval is set |
| 30 | Send unsolicited Battery Report on Wake Up | Send unsolicited Battery Report on Wake Up |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Button 1 and 3 pair mode

Button 1 and 3 pair mode
In separate mode button 1 works with group A, button 3 with groups C. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button 1/3 are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks works with group A, double click with group C.
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | Separately |
| 1 | In pair without double clicks |
| 2 | In pair with double clicks |

The manufacturer defined default value is ```1``` (In pair without double clicks).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Button 2 and 4 pair mode

Button 2 and 4 pair mode
In separate mode button 2 works with group B, button 4 with groups D. Click is On, Hold is dimming Up, Double click is Off, Click-Hold is dimming Down. In pair button 2/4 are Up/Down correspondingly. Click is On/Off, Hold is dimming Up/Down. Single clicks works with group B, double click with group D.
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | Seperately |
| 1 | In pair without double clicks |
| 2 | In pair with double clicks |

The manufacturer defined default value is ```1``` (In pair without double clicks).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 11: Command to Control Group A

Command to Control Group A
This parameter defines the command to be sent to devices of control group A when the related button is pressed.
The following option values may be configured, in addition to values in the range 0 to 8 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 7 | Control Door Lock |
| 8 | Central Scene to Gateway |

The manufacturer defined default value is ```8``` (Central Scene to Gateway).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Command to Control Group B

Command to Control Group B
This parameter defines the command to be sent to devices of control group B when the related button is pressed.
The following option values may be configured, in addition to values in the range 0 to 8 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 7 | Control Door Lock |
| 8 | Central Scene to Gateway |

The manufacturer defined default value is ```8``` (Central Scene to Gateway).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Command to Control Group C

Command to Control Group C
This parameter defines the command to be sent to devices of control group C when the related button is pressed.
The following option values may be configured, in addition to values in the range 0 to 8 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 7 | Control Door Lock |
| 8 | Central Scene to Gateway |

The manufacturer defined default value is ```8``` (Central Scene to Gateway).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Command to Control Group D

Command to Control Group D
This parameter defines the command to be sent to devices of control group A when the related button is pressed.
The following option values may be configured, in addition to values in the range 0 to 8 -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Switch On/Off and Dim |
| 2 | Switch On/Off only |
| 3 | Switch All |
| 4 | Send Scenes |
| 5 | Send Preconfigured Scenes |
| 7 | Control Door Lock |
| 8 | Central Scene to Gateway |

The manufacturer defined default value is ```8``` (Central Scene to Gateway).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 21: Send the following Switch All commands

Send the following Switch All commands

The following option values may be configured, in addition to values in the range 1 to 255 -:

| Value  | Description |
|--------|-------------|
| 1 | Switch off only |
| 2 | Switch on only |
| 255 | Switch all on and off |

The manufacturer defined default value is ```1``` (Switch off only).

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 22: Invert buttons

Invert buttons

The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | Yes |

The manufacturer defined default value is ```0``` (No).

This parameter has the configuration ID ```config_22_1``` and is of type ```INTEGER```.


### Parameter 25: Blocks wakeup even when wakeup interval is set

Blocks wakeup even when wakeup interval is set
If the device wakes up and there is no controller nearby, several unsuccessful communication attempts will drain battery.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Wakeup is blocked |
| 1 | Wakeup is possible if configured accordingly |

The manufacturer defined default value is ```1``` (Wakeup is possible if configured accordingly).

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 30: Send unsolicited Battery Report on Wake Up

Send unsolicited Battery Report on Wake Up

The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | No |
| 1 | To same node as wake up notification |
| 2 | Broadcast to neighbors |

The manufacturer defined default value is ```1``` (To same node as wake up notification).

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

The ZHS03 supports 5 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 10 nodes.

### Group 2: Control Group A

Controlled by button 1 or single clicks of buttons 1 and 3

Association group 2 supports 10 nodes.

### Group 3: Control Group B

Controlled by button 2 or single clicks of buttons 2 and 4

Association group 3 supports 10 nodes.

### Group 4: Control Group C

Controlled by button 3 or double clicks of buttons 1 and 3

Association group 4 supports 10 nodes.

### Group 5: Control Group D

Controlled by button 4 or double clicks of buttons 2 and 4

Association group 5 supports 10 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_CONTROLLER_CONF_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CMD_V1| |

### Documentation Links

* [Handbuch ZHS03 (a.k.a "ZME_WALLC-S")](https://www.cd-jackson.com/zwave_device_uploads/1227/Handbuch-Schwaiger-ZHS03-Wandschalter.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1227).
