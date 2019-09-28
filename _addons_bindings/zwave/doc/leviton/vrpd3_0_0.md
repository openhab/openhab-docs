---
layout: documentation
title: VRPD3 - ZWave
---

{% include base.html %}

# VRPD3 Scene Capable Plug-in Dimmer
This describes the Z-Wave device *VRPD3*, manufactured by *Leviton* with the thing type UID of ```leviton_vrpd3_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![VRPD3 product image](https://www.cd-jackson.com/zwave_device_uploads/199/199_default.jpg)


The VRPD3 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

  * Smart plug-in module for use with table and floor lamps
  * ON/OFF/DIM/BRIGHT switching of CFL/LED loads up to 100W and incandescent loads up to 300W 
  * ON/OFF scene and zone compatibility
  * 2-way status updates
  * Supports Z-Wave Beaming

### Inclusion Information

  1. Plug in Leviton VRPD3
  2. Place controller in inclusion mode
  3. Press button on front of VRPD3

If successful, the VRPD3 LED will turn orange during inclusion and then green. The LED will flash red if it fails.

### Exclusion Information

  1. Place controller in exclusion mode
  2. Press button on front of VRPD3

If successful, the VRPD3 LED will turn orange during exclusion and then green. The LED will flash red if it fails.

## Channels

The following table summarises the channels available for the VRPD3 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The VRPD3 supports 1 association group.

### Group 1: Group 1


Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| |
| COMMAND_CLASS_METER_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Product Information](https://www.cd-jackson.com/zwave_device_uploads/199/VRF-plugin-modules-techsht-BW-v1p4HR.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/199).
