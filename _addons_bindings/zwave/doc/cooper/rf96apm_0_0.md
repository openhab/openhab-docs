---
layout: documentation
title: RF96APM - ZWave
---

{% include base.html %}

# RF96APM ON/OFF Plug-In Module
This describes the Z-Wave device *RF96APM*, manufactured by *Cooper Wiring Devices* with the thing type UID of ```cooper_rf96apm_00_000```.

The device is in the category of *Power Outlet*, defining Small devices to be plugged into a power socket in a wall which stick there.

![RF96APM product image](https://www.cd-jackson.com/zwave_device_uploads/1272/1272_default.png)


The RF96APM supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The ON/OFF Plug-In Module is a Z-Wave Plus enabled device and is fully compatible with any Z-Wave enabled network. The device can be set up in a Z-Wave network to communicate directly with other end devices such as PIR motion detector, or to report directly to a Z-Wave controller.

This product supports the S2 security protocol that uses encrypted Z-Wave Plus messages to communicate to other security-enabled Z-Wave Plus products. A security-enabled Z-Wave Plus Controller must be used in order to fully utilize the security features of this product.

This ON/OFF Plugin module is designed to control the on/off status of lighting and appliances in the home. Control the connected load by associating it with another end device such as a sensor or switch, or through automations, schedules, and mobile apps by pairing with a compatible Z-Wave controller. Each module is also designed to act as a repeater to re-transmit the Z-Wave signal to ensure that it is received at its intended destination by routing the signal around obstacles and signal dead spots.

### Inclusion Information

Auto Inclusion This ON/OFF plug supports Auto Inclusion feature where it will automatically enter Inclusion mode when first powered up after a factory reset.

  1. There is an ON/OFF button on the front of the device which is used to carry out inclusion, exclusion or association.
  2. Put your Z-Wave Controller into inclusion/exclusion mode.
  3. Plug this ON/OFF Plug-in module into a wall outlet near the load to be controlled.
  4. he Inclusion process should be completed when the LED stops blinking.

Note: If Auto Inclusion fails, refer to the Troubleshooting section regarding Manual Inclusion

Manual Inclusion

If auto inclusion fails:

  1. Put the Z-Wave Controller into Inclusion mode
  2. Press the ON/OFF button 3 times within 1.5 seconds to put the unit into Inclusion mode

### Exclusion Information

Exclusion

  1. Put the Z-Wave Controller into Exclusion mode
  2. Press the ON/OFF button 3 times within 1.5 seconds to put the unit into Exclusion mode

### General Usage Information

Factory Reset (Please use this procedure only when the network primary controller is missing or otherwise inoperable)

  1. Press the ON/OFF button 3 times within 1.5 seconds to put the unit into exclusion mode
  2. Within 1 second of step 1, press and hold the button for 5 seconds
  3. Node ID is deleted. The device reverts to factory default state

LED will flash: 2-second ON, 2-second OFF

## Channels

The following table summarises the channels available for the RF96APM -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the RF96APM.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 13 | Remember last status | Remember last status |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 13: Remember last status

Remember last status
Remember the last status:

In the event of a power outage, this parameter determined if the plug should revert to the last status on power restore.

0: Do not remember

1: Remember
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Do not remember |
| 1 | Remember |

The manufacturer defined default value is ```0``` (Do not remember).

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The RF96APM supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Group 1 commands:

  * When the unit is powered for the first time, the unit will send a Notification Report to the node of Group 1
  * When setting the unit or changing the unit’s status, the unit will send a Binary Switch Report to the node of Group 1. When the unit is OFF, Switch Binary Report Value = 0x00. When the unit is ON, Switch Binary Report Value = 0xFF.
  * Device Reset: When performing Factory Reset the unit will send Device Reset Locally Notification to the node of Group1

Association group 1 supports 1 node.

### Group 2: Basic Set

Group 2: Association with 4 nodes (i.e. end devices such as detectors or other lighting switches).This allows the ON/OFF module to receive commands directly from these end devices without the participation of the controller.

Group 2 commands:

  * When the button on the unit is pressed, the unit will send a Basic Set command to the nodes of Group 2. When the unit is OFF, Basic Set Value = 0x00. When the unit is ON, Basic Set Value = 0xFF

Association group 2 supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [RF96APM Manual](https://www.cd-jackson.com/zwave_device_uploads/1272/z-wave-wireless-plugin-module-RF96APM-instrsheet.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1272).
