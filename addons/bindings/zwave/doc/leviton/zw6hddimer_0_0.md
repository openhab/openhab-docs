---
layout: documentation
title: ZW6HD - ZWave
---

{% include base.html %}

# ZW6HD Scene Capable Dimmer
This describes the Z-Wave device *ZW6HD*, manufactured by *Leviton* with the thing type UID of ```leviton_zw6hddimer_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZW6HD product image](https://opensmarthouse.org/zwavedatabase/1636/image/)


The ZW6HD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Z-Wave 800 Series. Supports 300W LED, 300W CFL, 600W Incandescent/Halogen, 600VA Magnetic Low Voltage

### Inclusion Information

Network Wide Inclusion:

Network Wide Inclusion allows your device to be included into the network using devices already in the network to assist with communication. Work your way from the closest devices to the controller outward.

Enter Programming Mode by holding the top of the paddle for 7 seconds, the Locator LED will blink amber.

Tap the top of the paddle one time. The Locator LED will quickly ash green.

The Decora SmartTM Z-Wave® device is ready to learn into the Z-Wave® network.

Follow directions in the Z-Wave controller to complete the adding process.

Upon successful addition to network the LED will turn off and then blink green 3 times.

If the adding process is not successful the LED will ash red 3 times.

Traditional Inclusion:

For older controllers Traditional Inclusion is supported. Depending on the age of the controller the controller will need to be 3 to 35 feet from the device when including.

Enter Programming Mode by holding the top of the paddle for 7 seconds, the Locator LED will blink amber.

The Decora Smart Z-Wave® device is ready to add to the Z-Wave® network.

Follow directions in the Z-Wave® controller to enter learn mode.

Tap the top of the paddle one time. The Locator LED will quickly ash green. The Z-Wave® controller will begin to pair with the Decora Smart device.

Upon successful addition to the network the LED will turn off and then blink green 3 times.

If the adding process is not successful the LED will ash red 3 times.

### Exclusion Information

When removing a device from a Z-Wave® network best practice is to use the exclusion command found in the Z-Wave® controller.

Enter Programming Mode by holding the top of the paddle for 7 seconds, the Locator LED will blink amber.

Follow directions in the Z-Wave® controller to enter exclusion mode.

Tap the top of the paddle one time. The Locator LED will quickly flash green. The Z-Wave® controller will exclude the Decora Smart device.

The Z-Wave® controller will confirm successful exclusion from the network.

### General Usage Information

Rocker:

• Press the top to turn the light ON.

• Press the bottom to turn the light OFF.

• Double press the top to turn ON at maximum brightness with no fade.

• Double press the bottom to turn OFF with no fade.

## Channels

The following table summarises the channels available for the ZW6HD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Scene Number | scene_number | scene_number |  | Number | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the ZW6HD.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Fade ON Time | Fade on time |
| 2 | Fade OFF Time | Fade off time |
| 3 | Minimum Dim Light Level | Minimum dim light level |
| 4 | Maximum Brightness Light Level | Maximum brightness light level |
| 5 | Preset Light Level or Return To Last Level | Preset light level or return to last level |
| 6 | LED dim/bright bar behavior | LED dim/bright bar behavior |
| 7 | Status LED configuration | Status LED configuration |
| 8 | Bulb type | Bulb type |
| 9 | Control timing | Control timing |

### Parameter 1: Fade ON Time

Fade on time
• 0 = Instant ON

• 1 - 127 = Seconds: 1 – 127 seconds

• 128 – 253 = Minutes: 1 -126 minutes
Values in the range 0 to 253 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_1_4``` and is of type ```INTEGER```.


### Parameter 2: Fade OFF Time

Fade off time
• 0 = Instant ON

• 1 - 127 = Seconds: 1 – 127 seconds

• 128 – 253 = Minutes: 1 -126 minutes
Values in the range 0 to 253 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_2_4``` and is of type ```INTEGER```.


### Parameter 3: Minimum Dim Light Level

Minimum dim light level

Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_3_4``` and is of type ```INTEGER```.


### Parameter 4: Maximum Brightness Light Level

Maximum brightness light level

Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_4_4``` and is of type ```INTEGER```.


### Parameter 5: Preset Light Level or Return To Last Level

Preset light level or return to last level
• 0 = Return to last level

• 1 - 99 = Preset light level
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_4``` and is of type ```INTEGER```.


### Parameter 6: LED dim/bright bar behavior

LED dim/bright bar behavior
• 0 = Level Indicators Off

• 1 - 254 = Level Indicator Timeout (seconds)

• 255 = Levels Always ON
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_6_4``` and is of type ```INTEGER```.


### Parameter 7: Status LED configuration

Status LED configuration
• 0 = Status LED OFF

• 254 = Status LED ON when load is ON

• 255 = Status LED ON when load is OFF (locator mode)
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_7_4``` and is of type ```INTEGER```.


### Parameter 8: Bulb type

Bulb type
• 0 = Incandescent

• 1 = LED

• 2 = CFL

• 3 = MLV
Values in the range 0 to 3 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_8_0``` and is of type ```INTEGER```.


### Parameter 9: Control timing

Control timing
• 0 = Normal

• 1 = Medium

• 2 = Extended
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_4``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZW6HD supports 3 association groups.

### Group 1: Group 1

Lifeline
• A notification is sent to the nodes in this association group when

a Lifeline event occurs.

• All nodes in the association group receive notification of Status

changes

Association group 1 supports 5 nodes.

### Group 2: Group 2

Multilevel switch set
• All nodes in the association group receive a command based on

ON/OFF button presses

Association group 2 supports 5 nodes.

### Group 3: Group 3

Basic set
• All nodes in the association group receive a command based on

ON/OFF button presses

Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1636/reference/installation-manual-RS-JA-040324A-ZW6HD-ENG.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1636).
