---
layout: documentation
title: Siren - ZWave
---

{% include base.html %}

# Siren Wink Siren
This describes the Z-Wave device *Siren*, manufactured by *Wink Inc.* with the thing type UID of ```wink_siren_00_000```.

The device is in the category of *Siren*, defining Siren used by Alarm systems.

![Siren product image](https://www.cd-jackson.com/zwave_device_uploads/917/917_default.png)


The Siren supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

The Wink Siren is a Z-Wave Plus battery-powered device that will sound an alarm, chime, and flash a built-in light to let you know when doors and windows open or when motion is detected in your home. The siren’s multi-purpose functionality of an alarm siren, doorbell, or chime notification can be turned on and off manually or automatically from your smartphone using a Wink Hub or other Z-Wave Plus certified hub.  
  
The Wink Siren offers ten user selectable sounds for alarm and chime, with three volume levels (up to 105dB) and adjustable siren duration timeout. Additional visual notification is provided by built-in flashing blue LEDs when triggered.  
  
The Wink Siren offers an extra-long z-wave wireless range of up to 150 feet, so you can place it in your home where it’s needed, and requires a Wink Hub or other Z-Wave Plus certified hub for operation. The siren comes with two CR123A 3.0V batteries and has a three-year battery life, and will send an alert to your smartphone when the device has low battery.

  * Z-Wave Plus Certified
  * Requires a Z-Wave Plus Certified Hub to operate
  * Works with all Z-Wave Plus compatible networks
  * 110° Extra-Wide Coverage Area
  * Up to 150 feet range
  * Three-Year Battery Life (Two CR123 Batteries included)
  * Low Battery Indication

### Inclusion Information

Follow the instructions for your Z-Wave certified Controller to enter inclusion mode. When prompted by the Controller:

  1. For proper inclusion, bring the Siren within range of your Controller.
  2. Pull the tab on the side of the siren to power on, or remove then re-install the batteries.

The LED Ring will flash five times indicating inclusion

### Exclusion Information

Follow the instructions for your Z-Wave certified Controller to enter exclusion mode. When prompted by the Controller:

  1. Press the sensor cover release button to remove the top cover, and be sure the sensor is powered on.
  2. Press the Connect Button next to the battery quickly 3 times in a row.

The LED indicator will flash five times indicating exclusion/disconnection

### General Usage Information

Use the Binary Switch command class to trigger the main siren, or the  Indicator. Set command to trigger one of ten different secondary chime notifications (indicator.set accepts values from 01~0A.)

To disconnect from the Z-Wave Network and restore factory default settings:

  1. Remove the Back Plate and make sure the Siren is powered.
  2. Hold the Connect Button for 10 seconds until the LED Ring blinks once, then release the button.

Only do this if the controller is missing or otherwise unreachable!

## Channels

The following table summarises the channels available for the Siren -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Alarm | alarm_general | alarm_general | Alarm | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Alarm
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 8 configuration parameters available in the Siren.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Primary Notification Volume Level | Set the volume level |
| 2 | Primary Notification Length | Set the Notification Length |
| 3 | Secondary Notification Length | Secondary Notification Length |
| 4 | Secondary Notification Volume Level |  |
| 5 | Primary Notification Sound | Primary Notification Sound |
| 6 | Secondary Notification Sound | Secondary Notification Sound |
| 7 | Toggle Secondary Chime | Toggle Secondary Chime |
| 8 | Power Level | Power Level |

### Parameter 1: Primary Notification Volume Level

Set the volume level
This parameter sets the volume of the Siren (primary) sound. There are three possible volume levels available
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Low Volume |
| 2 | Medium Volume |
| 3 | High Volume |

The manufacturer defined default value is ```2``` (Medium Volume).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Primary Notification Length

Set the Notification Length
This parameter defines the length of the Alarm/primary notification.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| -1 | Plays until battery dies |
| 1 | 30 Sec |
| 2 | I min |
| 3 | 5 min |

The manufacturer defined default value is ```2``` (I min).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Secondary Notification Length

Secondary Notification Length
This parameter defines the length of the Chime/secondary notification
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| -1 | Chime Will Not Play |
| 0 | Does Not Stop |
| 1 | Time 1 min |
| 2 | Time 2 Min |
| 5 | Time 5 Min |

The manufacturer defined default value is ```1``` (Time 1 min).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Secondary Notification Volume Level



The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Low Volume |
| 2 | Medium Volume |
| 3 | High Volume |

The manufacturer defined default value is ```2``` (Medium Volume).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Primary Notification Sound

Primary Notification Sound
The Siren offers ten different sounds to use as the Siren (primary) notification. This parameter sets the Siren (primary) notification sound
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Tone 1 |
| 2 | Tone 2 |
| 3 | Tone 3 |
| 4 | Tone 4 |
| 5 | Tone 5 |
| 6 | Tone 6 |
| 7 | Tone 7 |
| 8 | Tone 8 |
| 9 | Tone 9 |
| 10 | Tone 10 |

The manufacturer defined default value is ```9``` (Tone 9).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Secondary Notification Sound

Secondary Notification Sound
If Parameter 7 is set to 02, the Siren will play a secondary chime sound instead of the main alarm. The Siren offers ten different sounds to use as the Chime (secondary) notification. This parameter sets the Chime (secondary) notification sound.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Tone 1 |
| 2 | Tone 2 |
| 3 | Tone 3 |
| 4 | Tone 4 |
| 5 | Tone 5 |
| 6 | Tone 6 |
| 7 | Tone 7 |
| 8 | Tone 8 |
| 9 | Tone 9 |
| 10 | Tone 10 |

The manufacturer defined default value is ```9``` (Tone 9).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Toggle Secondary Chime

Toggle Secondary Chime
This Parameter toggles between the Primary and Secondary notification sound to be played when the Siren receives a BINARY\_SWITCH\_SET(FF) command
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Primary Notification Will Play |
| 2 | Secondary Notification Will Play |

The manufacturer defined default value is ```1``` (Primary Notification Will Play).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Power Level

Power Level

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Siren supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Group 1 is the “Lifeline” group, which can hold five members, typically including the main Z-Wave controller. The Siren sends this group a Notification Report and a Binary Switch Report when the siren is turned on or off. It also sends this group a Batter

Association group 1 supports 5 nodes.

### Group 2: Group 2

Group 2 can hold five members, and the Siren sends a single command to this Association Group, the Binary Switch Report, whenever the Siren is turned on or off

Association group 2 supports 5 nodes.

### Group 3: Group 3

Group 2 can hold five members, and the Siren sends a single command to this Association Group, a Notification Report, whenever the Siren is turned on or off

Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V1| |

### Documentation Links

* [Siren](https://www.cd-jackson.com/zwave_device_uploads/917/Wink-Siren-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/917).
