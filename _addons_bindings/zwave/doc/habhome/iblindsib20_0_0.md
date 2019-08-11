---
layout: documentation
title: IB2.0 - ZWave
---

{% include base.html %}

# IB2.0 Window Blind Controller
This describes the Z-Wave device *IB2.0*, manufactured by *HAB Home Intelligence, LLC* with the thing type UID of ```habhome_iblindsib20_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![IB2.0 product image](https://www.cd-jackson.com/zwave_device_uploads/1073/1073_default.png)


The IB2.0 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

An intelligent Z-Wave blind motor that installs out of sight in existing Horizontal (2" and 2 1/2" slatted-style) blind headrails. Use iBlinds to tilt the slats open, closed or use the value slider for precise positioning of the slat tilt angle.

### Inclusion Information

  1. Follow the directions for your Z-Wave hub/controller to place it in the add for inclusion mode.
  2. Press the inclusion button (IN/EX) once and wait for the device to be discovered and joined to the Z-Wave network.  Follow the directions of your Z-Wave controller to uniquely identify your iblinds device.   (Ex: Bedroom iblinds).

**_Note: If the device is not joined to the network.  Press the CLBR button, wait 1 second and repeat steps 1 and 2 again.  If you continue to have trouble joining the iblinds motor to the Z-Wave network, follow the Z-Wave network exclusion process._**

### Exclusion Information

  1. Follow the directions for your Z-Wave hub/controller to place it in the exclusion mode.
  2. Press the exclude button (IN/EX) once and wait for the iblinds device to be removed from the Z-Wave network.

If you are having issues with exclusion, please check our troubleshooting page here.

### General Usage Information

NOTE:  **The command polling period should be set to 'disabled' **

## Channels

The following table summarises the channels available for the IB2.0 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Blinds Control | blinds_control | blinds_control | Blinds | Rollershutter | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Blinds Control
Provides start / stop control of blinds.

The ```blinds_control``` channel is of type ```blinds_control``` and supports the ```Rollershutter``` item and is in the ```Blinds``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the IB2.0.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Auto Calibration Torque | Adjust Torque Value for Auto Calibration |

### Parameter 1: Auto Calibration Torque

Adjust Torque Value for Auto Calibration
Changing the Auto Calibration torque will allow you to change the initial calibration torque.  Reducing the torque helps improve calibration for small blinds and increasing the torque helps improve calibration for large blinds. 

Calibration will automatically begin when the parameter value is received by iblinds.  After calibration is completed the parameter value will be set back to the default value of 1. 

**\*\\*\* INCREASE TORQUE AT YOUR OWN RISK \*\****  Increasing torque can cause damage to lightweight and/or small blinds.  Only increase torque if the endpoints need adjusting. This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Calibrate using default torque |
| 2 | Reduce calibration torque by 1 factor |
| 3 | Reduce calibration torque by 2 factors |
| 4 | Increase calibration torque by .5 factor |
| 5 | Increase calibration torque by 1 factor |

The manufacturer defined default value is ```1``` (Calibrate using default torque ).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The IB2.0 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Z-Wave Plus Lifeline

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [User Guide v1.0](https://www.cd-jackson.com/zwave_device_uploads/1073/User-Guide-v1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1073).
