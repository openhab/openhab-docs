---
layout: documentation
title: HS2WD-Z - ZWave
---

{% include base.html %}

# HS2WD-Z Smart Siren
This describes the Z-Wave device *HS2WD-Z*, manufactured by *[Heiman Technology Co. Ltd](http://www.heimantech.com/)* with the thing type UID of ```heiman_hs2wdz_00_000```.

The device is in the category of *Siren*, defining Siren used by Alarm systems.

![HS2WD-Z product image](https://www.cd-jackson.com/zwave_device_uploads/771/771_default.png)


The HS2WD-Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

Product support sound and light alarm.

### Inclusion Information

- Press the pin-hole 3 times within 1.5s, Green LED is Blinking 3 times within 1.5 second.
- If add Process is successful, Green LED will turn off.

### Exclusion Information

- Press the pin-hole 3 times within 1.5 second.
- If remove Process is successful, Green LED is Blinking 6 times, then turn off.

## Channels

The following table summarises the channels available for the HS2WD-Z -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Battery Level | battery-level | Battery | Number |

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The device has no configuration parameters configured.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HS2WD-Z supports 1 association group.

### Group 1: Lifeline


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Documentation](https://www.cd-jackson.com/zwave_device_uploads/771/HS2WD-Z-documentation.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/771).
