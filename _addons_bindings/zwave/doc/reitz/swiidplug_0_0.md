---
layout: documentation
title: swiidplug - ZWave
---

{% include base.html %}

# swiidplug SwiidPlug
This describes the Z-Wave device *swiidplug*, manufactured by *Reitz-Group.de* with the thing type UID of ```reitz_swiidplug_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![swiidplug product image](https://www.cd-jackson.com/zwave_device_uploads/49/49_default.jpg)


The swiidplug supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

The SwiidPlug™ is designed to switch on and off remotely appliances (mainly lights) which are plugged into its female socket, The SwiidPlug™ is suitable for the wireless switching of incandescent light bulbs as well as halogen and LED lights (all transformer types). The SwiidPlug™ can be operated manually by pressing on its FUNCTION button which then acts as an on/off toggle switch and can be operated remotely and wirelessly by Z -Wave®. The SwiidPlug™ can also handle associations with other devices, both ways to and from it. Thus, your SwiidPlug™ can respond directly to a signal from another Z-Wave® device in your network, such as the triggering of a presence detector. As soon as it has been plugged into a mains socket, the SwiidPlug™ can be included into a Z-Wave® network so as to interoperate with controllers and other Z-Wave® devices.

http://www.swiid.com/medias/documents/ZAP-User-s-manual-vBAT-30.11.2014.pdf

http://www.swiid.com/medias/documents/advanced-swiidplug.pdf

## Channels

The following table summarises the channels available for the swiidplug -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The device has no configuration parameters configured.

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
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
| COMMAND_CLASS_HAIL_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_INDICATOR_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/49/Manual-IP20-POPP-En.pdf)
* [User manual](https://www.cd-jackson.com/zwave_device_uploads/49/ZAP-User-s-manual-vBAT-30-11-2014.pdf)
* [advanced-swiidplug](https://www.cd-jackson.com/zwave_device_uploads/49/advanced-swiidplug.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/49).
