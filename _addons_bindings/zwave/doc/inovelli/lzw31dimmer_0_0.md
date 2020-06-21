---
layout: documentation
title: LZW31 - ZWave
---

{% include base.html %}

# LZW31 Black Series Dimmer
This describes the Z-Wave device *LZW31*, manufactured by *Inovelli* with the thing type UID of ```inovelli_lzw31dimmer_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![LZW31 product image](https://www.cd-jackson.com/zwave_device_uploads/1171/1171_default.png)


The LZW31 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

For starters, we’ve upgraded our Z-Wave module for better distance. The switch can be used in any 3-Way or 4-Way setting and allows you to use either an auxiliary switch, a smart switch or your existing dumb switch (NOTE: this only applies if a neutral wire is installed. If there is no neutral wire, the switch only works in a single-pole setting).

Lastly, the LED bar can be changed to any default color you’d prefer and also allows for it to be dimmed, or disabled altogether.

### Inclusion Information

Start the Inclusion process on your HUB/Gateway. Turn the power back on and auto-inclusion will activate.You will have 60 seconds before it times out. If it does timeout,the backup method to pair/include the device is to press the Config Button (A) 3 times.

### Exclusion Information

Put your HUB in Exclusion mode and press the Config Button (A) 3x until your HUB says the device is excluded.

## Channels

The following table summarises the channels available for the LZW31 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The following table provides a summary of the 17 configuration parameters available in the LZW31.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Dimming Speed | How fast or slow the light turns on when you hold the switch |
| 2 | Dimming Speed ( Z-wave ) | How fast or slow the light turns dim when you adjust via network |
| 3 | Ramp Rate | How fast or slow the light turns on when you press the switch |
| 4 | Ramp Rate ( Z-wave) | How fast or slow the light turns on / off via the network |
| 5 | Minimum Dim Level | Minimum level the light switch will dim to |
| 6 | Maximum Dim Level | Maximum level the light switch will dim to |
| 7 | Invert Switch | Inverts the switch |
| 8 | Auto Off Timer | Automatically tuns the switch off after X seconds |
| 9 | Default Level ( Local ) | Default dim level when pressed locally |
| 10 | Default level ( Z-Wave ) | Default dim level when switch on via network |
| 11 | Power On State | When power is restored switch reverts On/Off/Last |
| 12 | Association Behavior | When should the switch send commands to associated devices |
| 13 | LED Indicator Colo | Sets the default color of the LED bar |
| 14 | LED Indicator Intensity | Sets the intensity of the LED bar (brightness) |
| 15 | LED Indicator Intensity (when off) | LED Indicator brightness when switch is off |
| 16 | LED Strip Effect | Add sweet effects to the LED bar |
| 17 | LED timeout | Timeout for LED notifications |

### Parameter 1: Dimming Speed

How fast or slow the light turns on when you hold the switch
How fast or slow the lights turns on when you hold the switch ( ie: dimming from 10-20%, 80-60%, etc)

0 = instant on, 1=1 second, 100=100 seconds
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Dimming Speed ( Z-wave )

How fast or slow the light turns dim when you adjust via network
How fast or slow the light turns dim when you adjust the switch remotely.

(ie: dimming from 10-20%, 80-60%, etc)

0= instant on, 1=1 second, 100=100 seconds, 101=keep in sync with Parameter 1
Values in the range 0 to 101 may be set.

The manufacturer defined default value is ```101```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Ramp Rate

How fast or slow the light turns on when you press the switch
How fast or slow the light turns on when you press the switch 1x to bring from ON to OFF or OFF to ON

0=instant on, 1=1 second, 100=100 seconds, 101=keep in sync with Parameter 1
Values in the range 0 to 101 may be set.

The manufacturer defined default value is ```101```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Ramp Rate ( Z-wave)

How fast or slow the light turns on / off via the network
How fast or slow the light turns on when you turn the switch ON to OFF or OFF to ON remotely.

0=instant on, 1=1 second, 100=100 seconds, 101=keep in sync with Parameter 1
Values in the range 0 to 101 may be set.

The manufacturer defined default value is ```101```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Minimum Dim Level

Minimum level the light switch will dim to
Minimum level the light switch will dim to (great for fixing flickering bulbs).

1=1%, 45=45%
Values in the range 1 to 45 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Maximum Dim Level

Maximum level the light switch will dim to
Maximum level the light switch will dim to.

55%=55%, 100=100%
Values in the range 55 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Invert Switch

Inverts the switch
Inverts the switch ( tap down = ON, tap up = OFF)

0 = disabled, 1 = enabled
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Auto Off Timer

Automatically tuns the switch off after X seconds
Automatically turns the switch off after x amount of seconds

0 = disabled, 1 = 1 second, 32767 = 32767 seconds.
Values in the range 0 to 32767 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_2``` and is of type ```INTEGER```.


### Parameter 9: Default Level ( Local )

Default dim level when pressed locally
Default dim level for the switch when pressed locally

0 = Switch will return to the level it was prior to being off, 1=1%, 100=100%
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Default level ( Z-Wave )

Default dim level when switch on via network
Default dim level for the switch when powered on via a Z-Wave command

0 = Switch will return to level it was prior to being off, 1=1%, 100=100%
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: Power On State

When power is restored switch reverts On/Off/Last
When power is restored, the switch reverts to either On, Off, or Last Level

0=Off, 1-100= specific % On, 101= returns to level before power outage
Values in the range 0 to 101 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Association Behavior

When should the switch send commands to associated devices
01=local, 02=3-way, 03=3-way & local, 04=Z-wave hub, 05=Z-wave Hub & local

06=Z-wave hub & 3-way, 07=Z-wave hub & local & 3-way, 08=timer, 09= timer &local

10=timer & 3-way, 11=timer & 3-way & local, 12= timer & z-wave hub

13= timer & z-wave hub & local, 14=timer & z-wave hub & 3-way, 15= ALL
Values in the range 0 to 15 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: LED Indicator Colo

Sets the default color of the LED bar
This will set the default color of the LED bar

Calculated by using a hue color circle ( value / 255*360) see website for more detail
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```170```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: LED Indicator Intensity

Sets the intensity of the LED bar (brightness)
This will set the intensity of the LED bar

0=Off, 1=low, 5=medium, 10=high
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: LED Indicator Intensity (when off)

LED Indicator brightness when switch is off
LED Indicator intensity when light is off

0=off , 1 =low, 10=high
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 16: LED Strip Effect

Add sweet effects to the LED bar
Sweet effects: pulse, chase, solid, etc

Byte 1 = choose color

Byte 2 = Choose Brightness Level

Byte 3 = Choose Effect

Byte 4 = Duration 

See Website for details
Values in the range 0 to 2147483647 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_4``` and is of type ```INTEGER```.


### Parameter 17: LED timeout

Timeout for LED notifications
Changes the amount of time the RGB bar shows the dim level if the LED bar has been disabled

0=always off, 1=1 second after level is adjusted, 10=10 seconds after level is adjusted
Values in the range 0 to 10 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The LZW31 supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: Basic Set


Association group 2 supports 5 nodes.

### Group 3: Switch Multilevel Set


Association group 3 supports 5 nodes.

### Group 4: Control multiple bulbs / dimmers with level change


Association group 4 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V2| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [LZW31 Manual](https://www.cd-jackson.com/zwave_device_uploads/1171/LZW31-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1171).
