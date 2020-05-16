---
layout: documentation
title: JTB-1007 - ZWave
---

{% include base.html %}

# JTB-1007 Curtain motor
This describes the Z-Wave device *JTB-1007*, manufactured by *UFairy G.R. Tech* with the thing type UID of ```ufairy_curtainmotor_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![JTB-1007 product image](https://www.cd-jackson.com/zwave_device_uploads/1247/1247_default.jpg)


The JTB-1007 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

JTB-1007 is a Z-Wave enabled curtain motor.

### Inclusion Information

Click the PB-button once, located near by motor power socket.

### Exclusion Information

Click the PB-button once, located near by motor power socket.

## Channels

The following table summarises the channels available for the JTB-1007 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter | 

### Blinds Control
Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.



## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the JTB-1007.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 17 | Motor Open, Go to Direction B | Motor Open, Go to Direction B |
| 18 | Motor Stop | Motor Stop |
| 19 | Motor Close, Go to Direction A | Motor Close, Go to Direction A |
| 20 | Motor Position | Return motor current position |
| 22 | Motor revert direction | Motor revert direction |
| 23 | Clear motor lead tail endpoint setting | Clear motor lead tail endpoint setting |
| 32 | Return motor status flag | Return motor status flag |
| 33 | Enable manual pulling function | Enable manual pulling function |
| 34 | Disable manual pulling function | Disable manual pulling function |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 17: Motor Open, Go to Direction B

Motor Open, Go to Direction B
Set only, any value possible
Values in the range 0 to 4294967295 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_4_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 18: Motor Stop

Motor Stop

Values in the range 0 to 4294967295 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_18_4_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 19: Motor Close, Go to Direction A

Motor Close, Go to Direction A

Values in the range 0 to 4294967295 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_19_4_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 20: Motor Position

Return motor current position

Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 22: Motor revert direction

Motor revert direction

Values in the range 0 to 4294967295 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_4_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 23: Clear motor lead tail endpoint setting

Clear motor lead tail endpoint setting

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_23_1_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 32: Return motor status flag

Return motor status flag
<table>
  <tr>
    <td>
    </td>
    
    <td>
        ->  
    </td>
    
    <td>
      motor is closing, go to direction A
    </td>
  </tr>
  
  <tr>
    <td>
      1
    </td>
    
    <td>
        ->  
    </td>
    
    <td>
      motor is opening, go to direction B
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
        ->  
    </td>
    
    <td>
      motor endpoint A has setting
    </td>
  </tr>
  
  <tr>
    <td>
      3
    </td>
    
    <td>
        ->  
    </td>
    
    <td>
      motor endpoint B has setting
    </td>
  </tr>
  
  <tr>
    <td>
      4
    </td>
    
    <td>
        ->  
    </td>
    
    <td>
      (Reserved)
    </td>
  </tr>
  
  <tr>
    <td>
      5
    </td>
    
    <td>
        ->  
    </td>
    
    <td>
      (Reserved)
    </td>
  </tr>
  
  <tr>
    <td>
      6
    </td>
    
    <td>
        ->  
    </td>
    
    <td>
      (Reserved)
    </td>
  </tr>
  
  <tr>
    <td>
      7
    </td>
    
    <td>
        ->  
    </td>
    
    <td>
      direction revert
    </td>
  </tr>
</table>This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_32_1``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 33: Enable manual pulling function

Enable manual pulling function

Values in the range 0 to 4294967295 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_33_4_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 34: Disable manual pulling function

Disable manual pulling function

Values in the range 0 to 4294967295 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_34_4_wo``` and is of type ```INTEGER```.
This is a write only parameter.

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

The JTB-1007 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
lifeline group

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1247/Curtain-motor.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1247).
