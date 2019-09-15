---
layout: documentation
title: HTP-4S1-FB - ZWave
---

{% include base.html %}

# HTP-4S1-FB Four Touch Panel and Power Socket
This describes the Z-Wave device *HTP-4S1-FB*, manufactured by *[Hogar Controls](http://hogarcontrols.com/)* with the thing type UID of ```hogar_htp4s1fb_02_002```.
This version of the device is limited to firmware versions above 2.2

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![HTP-4S1-FB product image](https://www.cd-jackson.com/zwave_device_uploads/545/545_default.jpg)


The HTP-4S1-FB supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The HTP-4S1-FB does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The HOGAR Touch Panels features a stunning glass face with advanced capacitive touch sensor engineered with smart home wireless standards Zigbee, Z-Wave Plus and Wifi variants.

The Smart Home deserves better than an ordinary light switch. Hogar touch panels are one-of-a-kind collection of switches, dimmers, and scene controller that will transform walls from boring to absolutely breath-taking.

Fits in existing electrical box and does not require new wires. Innovative assembly and snap-in system make it fast and simple to install.

Please visit http://hogarcontrols.com/shop/touch-panels/four-touch-panel-socket for more information.

### Inclusion Information

1. Tap and hold any of the touch button for few seconds (about 7 seconds).

2. The LEDs of all the buttons will turn solid red all at the same time.

3. At that time, release the button and tap it again only once. 

4. The LED of the button will flash pink (once) indicating that the device is ready to be included.

### Exclusion Information

1. Tap and hold any of the touch button for few seconds (about 7 seconds).

2. The LEDs of all the buttons will turn solid red all at the same time.

3. At that time, release the button and tap it again only once. 

4. The LED of the button will flash pink (once) indicating that the device is ready to be included.

### Wakeup Information

The HTP-4S1-FB does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Channels

The following table summarises the channels available for the HTP-4S1-FB -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Switch 1 | switch_binary1 | switch_binary | Switch | Switch | 
| Switch 2 | switch_binary2 | switch_binary | Switch | Switch | 
| Switch 3 | switch_binary3 | switch_binary | Switch | Switch | 
| Switch 4 | switch_binary4 | switch_binary | Switch | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 1
Switch the power on and off.

The ```switch_binary1``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 2
Switch the power on and off.

The ```switch_binary2``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 3
Switch the power on and off.

The ```switch_binary3``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Switch 4
Switch the power on and off.

The ```switch_binary4``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The device has no configuration parameters defined.

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
| COMMAND_CLASS_MULTI_CHANNEL_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/545/4Touch.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/545).
