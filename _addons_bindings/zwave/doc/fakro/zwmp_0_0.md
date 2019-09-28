---
layout: documentation
title: ZWMP - ZWave
---

{% include base.html %}

# ZWMP Weather Module
This describes the Z-Wave device *ZWMP*, manufactured by *Fakro* with the thing type UID of ```fakro_zwmp_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![ZWMP product image](https://www.cd-jackson.com/zwave_device_uploads/636/636_default.png)


## Overview

The ZWMP weather module (performing the controlling function similarly to the ZWP10 remote control and ZWK10 keyboard) enables remote control of electronic accessories compatible with the Z-Wave system, e.g. ZWS12 or ZWS30 motors for operating FAKRO roof windows. This module is equipped with three digital inputs (No. 7, 8 and 9 in Figure 1) into which signals from various external devices can be plugged, e.g. rain or wind sensors, thermostat, timer switch, EIB system, etc. This module can operate up to 231 devices simultaneously or in groups

### Inclusion Information

Associating the weather module (controller) results in its being categorized as SECONDARY. Associating the module with the network consists in sending data to it from PRIMARY controller. 

Press “In/Ex” button three times in ZWMP module which is to be added to the network. 

After successful inclusion lights 2 & 4 should be on steady.

Lights 1 & 3 flash for 2-3 sec. if there is a programming error.

### Exclusion Information

Restoring default settings of the controller leads to the following information being deleted from its memory:

  * network, to which the module has been added;
  * devices associated with the ZWMP module.

 Within 1.5 sec., press:

  * **“In/Ex”** button twice and then
  * **SEL** button once.

Alternate flashing of 1&4 and then 2&3 indocate default settings have been restored.

## Channels

The following table summarises the channels available for the ZWMP -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ZWMP supports 6 association groups.

### Group 1: Group 1


Association group 1 supports 2 nodes.

### Group 2: Group 2


Association group 2 supports 2 nodes.

### Group 3: Group 3


Association group 3 supports 3 nodes.

### Group 4: Group 4


Association group 4 supports 3 nodes.

### Group 5: Group 5


Association group 5 supports 4 nodes.

### Group 6: Group 6


Association group 6 supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/636/FAKRO-Zwave-Weather-Module-ZWMP-Manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/636).
