---
layout: documentation
title: AMZ - ZWave
---

{% include base.html %}

# AMZ Awning Blinds Controller
This describes the Z-Wave device *AMZ*, manufactured by *Fakro* with the thing type UID of ```fakro_amz_00_000```.

The AMZ does not permanently listening for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

No device information is provided in the database. Consider [updating the database](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/616) to improve the documentation.

## Channels

The following table summarises the channels available for the AMZ

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Blinds control | blinds_control | Blinds | Rollershutter | 

### Switch

Switch the power on and off

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds control

Provides start / stop control of blinds
        

The ```blinds_control``` channel supports the ```Rollershutter``` item and is in the ```Blinds``` category.



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
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [AMZ_Z_Wave_FAKRO_EN](https://www.cd-jackson.com/zwave_device_uploads/616/AMZ-Z-WAVE-FAKRO-EN.pdf)
* [FAKRO_Zwave_Weather_Module_ZWMP_Manual](https://www.cd-jackson.com/zwave_device_uploads/616/FAKRO-Zwave-Weather-Module-ZWMP-Manual.pdf)
* [AMZ_Z_WAVE_FAKRO_EN](https://www.cd-jackson.com/zwave_device_uploads/616/AMZ-Z-WAVE-FAKRO-EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/616).
