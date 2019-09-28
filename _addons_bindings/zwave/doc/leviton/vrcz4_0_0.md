---
layout: documentation
title: VRCZ4 - ZWave
---

{% include base.html %}

# VRCZ4 4 zone controller
This describes the Z-Wave device *VRCZ4*, manufactured by *Leviton* with the thing type UID of ```leviton_vrcz4_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![VRCZ4 product image](https://www.cd-jackson.com/zwave_device_uploads/879/879_default.png)


The VRCZ4 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Vizia RF + 4-Button Zone Controller for Multi-Location Control with IR Remote Capability. 

### Inclusion Information

  * To access programming mode, press and hold the left side of buttons 1 and 3. Wait 5 seconds until the LEDs turn amber then release the buttons.  The LEDs will blink amber.
  * While holding your system controller close the the 4-Zone controller (approximately 1 foot) put your system comptroller into inclusion mode.  When the 4-Zone controller is included in your system the LEDs will turn off.
  * If the LEDs on the 4-Zone controller turn red while including, there has been a communications problem.
  * The instructions state that only one device may be included at a time and it seems that inclusion works best if the system controller is put in including mode after the device is in programming mode.
  * If the 4-Zone controller has been successfully included in the network and the user tries to include it again without first excluding it from the network, the controller will retain the first node ID it had received and ignore the second.

### Exclusion Information

  * To access programming mode, press and hold the left side of buttons 1 and 3. Wait 5 seconds until the LEDs turn amber then release the buttons.  The LEDs will blink amber.
  * While holding your system controller close the the 4-zone controller (approximately 1 foot) put your system comptroller into exclusion mode.  When the 4-Zone controller is excluded from your system the LEDs will turn off.
  * If the LEDs on the 4-Zone controller turn red while excluding, there has been a communications problem.

## Channels

The following table summarises the channels available for the VRCZ4 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number | 

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The VRCZ4 supports 4 association groups.

### Group 1: Group 1

Button 1
First (top) button on controller, can be associated with up to 32 devices.

Association group 1 supports 32 nodes.

### Group 2: Group 2

Button 2
Second button on controller. Can be associated with up to 32 devices.

Association group 2 supports 32 nodes.

### Group 3: Group 3

Button 3
Third button on controller. Can be associated with up to 32 devices.

Association group 3 supports 32 nodes.

### Group 4: Group 4

Button 4
Fourth button on controller. Can be associated with up to 32 devices.

Association group 4 supports 32 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SCENE_ACTIVATION_V1| Linked to BASIC|
| COMMAND_CLASS_SCENE_ACTUATOR_CONF_V1| |
| COMMAND_CLASS_SCENE_CONTROLLER_CONF_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_HAIL_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [VRCZ4 installation instructions](https://www.cd-jackson.com/zwave_device_uploads/879/LevitonVRCZ4-Installation-Instructions.pdf)
* [Instruction sheet VRCZ4](https://www.cd-jackson.com/zwave_device_uploads/879/Instruction-Sheet-VRCZ4.pdf)
* [Instruction sheet VRCS4](https://www.cd-jackson.com/zwave_device_uploads/879/Instruction-Sheet-VRCS4.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/879).
