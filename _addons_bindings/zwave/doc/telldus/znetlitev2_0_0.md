---
layout: documentation
title: ZNet Lite v2 - ZWave
---

{% include base.html %}

# ZNet Lite v2 TellStick Z-wave Controller
This describes the Z-Wave device *ZNet Lite v2*, manufactured by *[Telldus Technologies AB](http://www.telldus.com/)* with the thing type UID of ```telldus_znetlitev2_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![ZNet Lite v2 product image](https://www.cd-jackson.com/zwave_device_uploads/1257/1257_default.jpg)


The ZNet Lite v2 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The TellStick ZNet Lite v2 gateway combines the best of two worlds to a full extent. It has two-way communication on Z-Wave, which provides high reliability and long range. It also transmit and receive signals at 433MHz, which provides wide compatibility with your existing receivers and sensors.  
  
All configuration for the gateway is made in our cloud service, Telldus Live!. You can create schedules for fixed times or depending on the sun's movements. By allowing incoming signals to create events, you can control and automate your smart home for real. The additional service Telldus Live! Pro gives you even more features, such as the ability to receive email and SMS when things happen in your system. Read more about Telldus Live! Pro here.  
  
Schedules and Event runs locally on TellStick ZNet Lite v2 even though the Internet is not available. The smartphone app Telldus Live! Mobile makes it possible to use your phone as a remote control for the devices in your home, no matter where in the world you are.

Source: https://telldus.com

### Inclusion Information

Inclusion is triggered by the following procedure:

  * Visit https://live.telldus.com and create an account and/or login
  * In the device settings, select "Z-Wave settings" and press "Start learn mode"

The device is now in inclusion mode and can be added to your network.

### Exclusion Information

Exclusion is triggered by the following procedure:

  * Visit https://live.telldus.com and create an account and/or login
  * In the device settings, select "Z-Wave settings" and press "Start learn mode"

The device is now in excluded from the network.

## Channels

The following table summarises the channels available for the ZNet Lite v2 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZNet Lite v2 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Z-Wave Lifeline
Association group 1 - Lifeline - Max 1 node

Lifeline is used to send information to the main controller in the Z­Wave network

source: https://www.telldus.com

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Znet manual](https://www.cd-jackson.com/zwave_device_uploads/1257/TellStick-ZNet-Lite-technical-manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1257).
