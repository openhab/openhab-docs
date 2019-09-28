---
layout: documentation
title: VRPA1 - ZWave
---

{% include base.html %}

# VRPA1 Vizia RF + Scene Capable Plug-in Module
This describes the Z-Wave device *VRPA1*, manufactured by *Leviton* with the thing type UID of ```leviton_vrpa1_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![VRPA1 product image](https://www.cd-jackson.com/zwave_device_uploads/350/350_default.png)


The VRPA1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Vizia RF + Scene Capable Plug-in Appliance Module (VRPA1-1LW) is ideal for any residential setting where remote ON/OFF switching of appliances, motor loads up to 1/2 HP, or freestanding lights, including Incandescent, Magnetic Low Voltage, Fluorescent and Compact Fluorescent loads is needed. Typical applications include switching of fluorescent lamps, portable fans, kitchen appliances, indoor fountains and more. The Vizia RF + Scene Capable Plug-in Appliance Module also allows users to incorporate small appliances into scene and zone home control applications. 

### Inclusion Information

  1. Plug in VRPA1
  2. Place controller in inclusion mode
  3. Press button on front of VRPA1

### Exclusion Information

  1. Place controller in exclusion mode
  2. Press button on front of VRPA1

## Channels

The following table summarises the channels available for the VRPA1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Scene Number | scene_number | scene_number |  | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The VRPA1 supports 1 association group.

### Group 1: Unknown


Association group 1 supports 254 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Product Specification and Data Sheet](https://www.cd-jackson.com/zwave_device_uploads/350/VRF-plugin-modules-techsht-BW-v1p4HR.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/350).
