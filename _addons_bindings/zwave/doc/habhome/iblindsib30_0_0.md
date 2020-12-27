---
layout: documentation
title: IB3.0 - ZWave
---

{% include base.html %}

# IB3.0 Window Blind Controller
This describes the Z-Wave device *IB3.0*, manufactured by *HAB Home Intelligence, LLC* with the thing type UID of ```habhome_iblindsib30_00_000```.

The device is in the category of *Blinds*, defining Roller shutters, window blinds, etc..

![IB3.0 product image](https://opensmarthouse.org/zwavedatabase/1325/image/)


The IB3.0 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

An intelligent Z-Wave blind motor that installs out of sight in existing Horizontal (2" and 2 1/2" slatted-style) blind headrails. Use iBlinds to tilt the slats open, closed or use the value slider for precise positioning of the slat tilt angle.

### Inclusion Information

Follow the directions for your Z-Wave hub/controller to place it in the add for inclusion mode.

Press the inclusion button (IN/EX) once and wait for the device to be discovered and joined to the Z-Wave network. Follow the directions of your Z-Wave controller to uniquely identify your iblinds device. (Ex: Bedroom iblinds).

Note: If the device is not joined to the network. Press the CLBR button, wait 1 second and repeat steps 1 and 2 again. If you continue to have trouble joining the iblinds motor to the Z-Wave network, follow the Z-Wave network exclusion process.

### Exclusion Information

Follow the directions for your Z-Wave hub/controller to place it in the exclusion mode.

Press the exclude button (IN/EX) once and wait for the iblinds device to be removed from the Z-Wave network.

If you are having issues with exclusion, please check our troubleshooting page here.

### General Usage Information

NOTE: The command polling period should be set to 'disabled' 

## Channels

The following table summarises the channels available for the IB3.0 -:

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

The following table provides a summary of the 5 configuration parameters available in the IB3.0.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Close Interval | Close Interval |
| 2 | Reverse Direction | Reverse Direction |
| 3 | Disable Report | Disable Report |
| 4 | Default ON Value | Default ON Value |
| 6 | Speed | Speed |

### Parameter 1: Close Interval

Close Interval
Used for large blind auto calibration endpoint detection. A smaller value will make the blinds close tighter
Values in the range 15 to 30 may be set.

The manufacturer defined default value is ```22```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Reverse Direction

Reverse Direction
Used to reverse the direction of the blinds
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Forwards |
| 1 | Reverse |

The manufacturer defined default value is ```0``` (Forwards).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Disable Report

Disable Report
Used to disable Z-Wave Report. This is useful for systems that poll iBlinds immediately after sending a position command. Disable if an immediate Z-Wave GET command is causing iBlinds motor to function improperly
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | False |
| 1 | True |

The manufacturer defined default value is ```0``` (False).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Default ON Value

Default ON Value
Used to set the default ON level. Default value for ON=50% (0x32). Change this value if you wish to change the Charge Adapter push button ON or the Z-Wave Binary Switch ON default value
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 6: Speed

Speed
Used to set the default blind speed. 0 = No Delay. The larger the value the slower the speed. Note: A Z-Wave MultiLevel Switch command sent with a Duration value greater than 0 will always override the speed parameter
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The IB3.0 supports 1 association group.

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
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [User Guide v3.0](https://opensmarthouse.org/zwavedatabase/1325/reference/User-Guide-v3.0-1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1325).
