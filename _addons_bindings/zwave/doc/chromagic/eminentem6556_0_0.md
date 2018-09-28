---
layout: documentation
title: Eminent EM6556 miniswitch - ZWave
---

{% include base.html %}

# Eminent EM6556 miniswitch in wall single switch
This describes the Z-Wave device *Eminent EM6556 miniswitch*, manufactured by *[Chromagic Technologies Corporation](http://www.ctc-chromagic.com/)* with the thing type UID of ```chromagic_eminentem6556_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Eminent EM6556 miniswitch product image](https://www.cd-jackson.com/zwave_device_uploads/902/902_default.jpg)


The Eminent EM6556 miniswitch supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

Eminent e-DOMOTICA in wall mini switch. Allows you to turn on and turn off your illumination and other electircal devices by using the e-Domotica e-Centre touchscreen or the EM6511 e-Domotica remote control. 

The switch utilizes the Z-Wave protocol and can be included into a Z-Wave network.

### Inclusion Information

  * Put your Z-Wave controller into inclusion mode. 
  * Press the button on the switch 3 times
  * The switch is now included

### Exclusion Information

  * Put your Z-Wave controller into exclusion mode. 
  * Press the button on the switch 3 times
  * The switch is now excluded

## Channels

The following table summarises the channels available for the Eminent EM6556 miniswitch -:

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
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [Usermanual](https://www.cd-jackson.com/zwave_device_uploads/902/EM6556-UK.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/902).
