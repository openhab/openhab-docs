---
layout: documentation
title: TLS-ZWAVE5 - ZWave
---

{% include base.html %}

# TLS-ZWAVE5 Automated Light Switch
This describes the Z-Wave device *TLS-ZWAVE5*, manufactured by *Ecolink* with the thing type UID of ```eco_tlszwave5_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![TLS-ZWAVE5 product image](https://www.cd-jackson.com/zwave_device_uploads/915/915_default.jpg)


The TLS-ZWAVE5 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Automates wall switch without replacing existing switches.  Battery-powered

### Inclusion Information

Network Inclusion

The Z-Wave Plus Toggle Light Switch must be added to a Z-Wave Plus network prior to use. To include the device in a network both the device and the network controller must be in inclusion mode at the same time. Refer to the instructions provided by the manufacturer of your specific controller for details on initiating the controller’s inclusion mode.

  1. Verify that the Z-Wave Plus controller you are using is compatible with the Z-Wave Plus Toggle Light Switch.
  2. Locate the light switch desired to be used with the Z-Wave Plus Toggle Light Switch.
  3. Put your Z-Wave Plus Controller into add (inclusion) mode.
  4. Press the inclusion / exclusion button on the Z-Wave Plus Toggle Light Switch. (Figure 1)
  5. The LED on the front of the unit will turn off if successful included into a network.

### Exclusion Information

Network Exclusion

  1. Any Z-Wave Plus Device can be removed from any Z-Wave Plus controller. Follow the directions to put your Z-Wave Plus Controller into exclusion mode.
  2. Press the inclusion / exclusion button on the Z-Wave Plus Toggle Light Switch.

### Wakeup Information

The TLS-ZWAVE5 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Channels

The following table summarises the channels available for the TLS-ZWAVE5 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The TLS-ZWAVE5 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: Basic Reports

The light switch will send basic reports with a value of 0x00 if the light is turned off and 0xFF if the light is turned on to all nodes in group 2.

Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Product Manual](https://www.cd-jackson.com/zwave_device_uploads/915/ea1265b3f76f673ca8cf54cc210044665d4dae83.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/915).
