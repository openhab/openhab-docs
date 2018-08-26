---
layout: documentation
title: CA3000 - ZWave
---

{% include base.html %}

# CA3000 Wall Switch
This describes the Z-Wave device *CA3000*, manufactured by *Intermatic* with the thing type UID of ```intermatic_intermaticca3000_00_000```.

The CA3000 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/468) to improve the documentation.

## Channels

The following table summarises the channels available for the CA3000 -:

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
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MANUFACTURER_PROPRIETARY_V0| |

### Documentation Links

* [Intermatic CA3000 Manual](https://www.cd-jackson.com/zwave_device_uploads/468/Intermatic-CA3000-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/468).
