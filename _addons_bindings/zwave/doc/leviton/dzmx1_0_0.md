---
layout: documentation
title: DZMX1 - ZWave
---

{% include base.html %}

# DZMX1 Scene Capable Push On/Off
This describes the Z-Wave device *DZMX1*, manufactured by *Leviton* with the thing type UID of ```leviton_dzmx1_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![DZMX1 product image](https://www.cd-jackson.com/zwave_device_uploads/196/196_default.jpg)


The DZMX1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The Leviton DZMX1 is a Z-Wave enabled universal dimmer designed for use for most residential lighting applications. A large range of lighting loads are supported including dimmable LED and CFL, as well incandescent, halogen and magnetic low voltage. The DZMX1 is fully compatible with Z-Wave enabled controllers, gateways, hubs, and security systems.

**FEATURES AND BENEFITS**

  * Scene Capable Universal Dimmer
  * Z-Wave compatible
  * 450W Dimmable LED/CFL
  * 1000W Incandescent, Halogen, MLV and Mark X
  * 120V 60HZ, neutral required
  * White, Light Almond and Ivory faces included
  * Supports Z-Wave Beaming and Network Wide Inclusion
  * Scene capable
  * User pre-set minimum brightness before turning off
  * 49 different fade rates
  * Transient surge suppression built-in
  * User pre-set ‘on level’

## Channels

The following table summarises the channels available for the DZMX1 -:

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

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| Linked to BASIC|
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_HAIL_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MANUFACTURER_PROPRIETARY_V1| |

### Documentation Links

* [Installation Instructions](https://www.cd-jackson.com/zwave_device_uploads/196/installation-instructions.pdf)
* [Product Overview](https://www.cd-jackson.com/zwave_device_uploads/196/Leviton-DZMX1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/196).
