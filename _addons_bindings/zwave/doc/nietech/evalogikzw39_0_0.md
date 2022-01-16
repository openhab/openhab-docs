---
layout: documentation
title: ZW39 - ZWave
---

{% include base.html %}

# ZW39 Dimmable Smart Plug
This describes the Z-Wave device *ZW39*, manufactured by *NIE Technology* with the thing type UID of ```nietech_evalogikzw39_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![ZW39 product image](https://opensmarthouse.org/zwavedatabase/1123/image/)


The ZW39 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

EVA LOGIK ZW39 Plug is a Z-Wave PLUS On/Off + Dimmer Smart Plug-In Module + Z-Wave Range Extender which has one dimming smart plug.

  * Maximum load for the Z-Wave controlled outlet: 2.5A; 300W Incandescent or 100W Dimmable CFL/LED
  * One Z-Wave controlled AC outlet for standard incandescent lighting or dimmable CFL/LEDs
  * Remote ON/OFF and brightness control via the Z-Wave controller
  * Manual ON/OFF and brightness control with the front panel push button
  * Load-sensing turns the light ON if the switch on the connected light is used instead of the remote or push button on the Z-Wave smart switch (default setting is disabled)
  * Space efficient design
  * Does not block the lower outlet when plugged in to the upper outlet of a duplex wall receptacle. (This assumes that the duplex receptacle is mounted with the ground pin down).
  * Plugs and cords for connected devices route to the side allowing close placement

### Inclusion Information

  1. Follow the instructions for your Z-Wave certified controller to include a device to the Z-Wave network.
  2. Once the controller is ready to include your device, quick triple press the button to include it in the network.
  3. Once your controller has confirmed that the device has been included, refresh the Z-Wave network to optimize performance.
  4. The device is associated in the same group when it included in setting process.

Now you can control your Z-Wave device according to groups, scenes, schedules and automation programmed. If your controller features remote access, you can now control all devices in Z-Wave network from mobile devices

### Exclusion Information

  1. Follow the instructions for your Z-Wave certified controller to exclude a device from the Z-Wave network.
  2. Once the controller is ready to Exclude your device, quick triple press the button to exclude it from the network.

## Channels

The following table summarises the channels available for the ZW39 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the ZW39.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 8 | Minimum Brightness | defines the brightness when the output level is set to 1. 0=disable |
| 9 | Maximum brightness | controls the brightness when the device is set to maximum output |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 8: Minimum Brightness

defines the brightness when the output level is set to 1. 0=disable
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Maximum brightness

controls the brightness when the device is set to maximum output
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.

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

The ZW39 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [ZW39 Manual](https://opensmarthouse.org/zwavedatabase/1123/reference/ZW39manual0527.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1123).
