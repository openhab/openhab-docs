---
layout: documentation
title: Heatit Z-Push Wall Controller - ZWave
---

{% include base.html %}

# Heatit Z-Push Wall Controller Wall Mounted Switch
This describes the Z-Wave device *Heatit Z-Push Wall Controller*, manufactured by *ThermoFloor* with the thing type UID of ```thermofloor_zpushwallctrl_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![Heatit Z-Push Wall Controller product image](https://opensmarthouse.org/zwavedatabase/1512/image/)


The Heatit Z-Push Wall Controller supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The Heatit Z-Push Wall Controller does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The Heatit Z-Push Wall Controller is a wireless wall mounted Z-Wave Controller. It has mounting options for 1, 2 or 3 rockers, allowing for easy and practical management of your Z-Wave products. The switch can be set up to control scenarios or work in association with other Z-Wave products. Each rocker switch has a dual color LED to indicate button actions.  


The Heatit Z-Push Wall Controller is supplied with all three sets of rockers in the box. The Wall Controller is coin cell battery poweredThe product is intended primarily for residential applications.

### Inclusion Information

Method 1: Standard (Manual)  


  1. Initiate the learning mode in the controller.
  2. Press any UP button 6 times within 3 seconds.-When the add/remove mode has started, the LED corresponding to the button you pressed will blink green. The device will indicate ”Success” by emitting a green light for 3 seconds.

  
Error while adding:  
The add/remove mode times out after 30 seconds if it does not receive  
any information from the gateway. The device will indicate fail by emitting a red light for 3 seconds, if this happens, please perform a removing from the controller and start adding mode on Heatit Z-Push Wall Controller.

Method 2: SmartStart (Automatic)  
SmartStart-enabled products may be added to a Z-Wave network by scanning the Z-Wave QR-Code on the product if your primary controller supports SmartStart inclusion. No further action is required and the SmartStart product will be added automatically after being powered on within range of the primary controller.

### Exclusion Information

The primary controller/gateway has a mode for adding or removing devices. Please refer to your primary controller manual on how to set the primary controller in add/remove mode. The device may only be added or removed from the network if the primary controller is in add/ remove mode.

When the device is removed from the network, it will NOT revert to factory settings. To factory reset the device, remove the battery from the device. Press and hold any button on the device and repower the device. The LEDs will start blinking 3 times before lighting up in green. When the green LED is on, you can release the button. The device will issue a Device Reset Locally Notification Command to notify that the device will be reset to default. When preforming a factory reset the device will lose its Node ID from the gateway and reset its Home ID.

### Wakeup Information

The Heatit Z-Push Wall Controller does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


To manually wake up the device, please press any down button 6 times. The device will light up in green until wake up is no longer active. The default wake up interval in seconds: 604 800 (1 week).

### General Usage Information



## Channels

The following table summarises the channels available for the Heatit Z-Push Wall Controller -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Scene Number | scene_number | scene_number |  | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Scene Number
Triggers when a scene button is pressed.

The ```scene_number``` channel is of type ```scene_number``` and supports the ```Number``` item.
This channel provides the scene, and the event as a decimal value in the form ```<scene>.<event>```. The scene number is set by the device, and the event is as follows -:

| Event ID | Event Description  |
|----------|--------------------|
| 0        | Single key press   |
| 1        | Key released       |
| 2        | Key held down      |
| 3        | Double keypress    |
| 4        | Tripple keypress   |
| 5        | 4 x keypress       |
| 6        | 5 x keypress       |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 4 configuration parameters available in the Heatit Z-Push Wall Controller.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 0 |  |  |
| 1 | Select Button reports | Select Button reports |
| 2 | LED signalling | LED signalling |
| 3 | Active Button rockers | Active Button rockers |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 0: 


Configure reports sent when pressing buttons
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_0_0``` and is of type ```INTEGER```.


### Parameter 1: Select Button reports

Select Button reports
Configure reports sent when pressing buttons:

• 0 - Send Central Scene Command only  
• 1 - Send Group Association Command only  
• 2 - Send Central Scene and Group Association Commands
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_1_0``` and is of type ```INTEGER```.


### Parameter 2: LED signalling

LED signalling
Configure if LED signaling should be enabled (should only disable simple press actions, should not turn off factory reset / inclusion etc).

• 0 = Disable (does not turn off factory reset/ learn mode blinking etc)  
• 1 = Enable
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_2_0``` and is of type ```INTEGER```.


### Parameter 3: Active Button rockers

Active Button rockers
Configure different rocker setups:

1 = Single rocker  
2 = Dual rocker  
3 = Triple rocker
Values in the range 1 to 3 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_3_0``` and is of type ```INTEGER```.

### Wakeup Interval

The wakeup interval sets the period at which the device will listen for messages from the controller. This is required for battery devices that sleep most of the time in order to conserve battery life. The device will wake up at this interval and send a message to the controller to tell it that it can accept messages - after a few seconds, it will go back to sleep if there is no further communications. 

This setting is defined in *seconds*. It is advisable not to set this interval too short or it could impact battery life. A period of 1 hour (3600 seconds) is suitable in most instances.

Note that this setting does not affect the devices ability to send sensor data, or notification events.

This parameter has the configuration ID ```wakeup_interval``` and is of type ```INTEGER```.

### Wakeup Node

When sleeping devices wake up, they send a notification to a listening device. Normally, this device is the network controller, and normally the controller will set this automatically to its own address.
In the event that the network contains multiple controllers, it may be necessary to configure this to a node that is not the main controller. This is an advanced setting and should not be changed without a full understanding of the impact.

This parameter has the configuration ID ```wakeup_node``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Heatit Z-Push Wall Controller supports 4 association groups.

### Group 1: Group 1

Lifeline
- Battery notification (sent when the battery runs low).  
- Device reset locally (sent if the device is reset).  
- Central scene notification.

Association group 1 supports 5 nodes.

### Group 2: Group 2

Used for the first button with double rocker and triple rocker configuration.
Push on UP will send: ON (0xFF)  
Holding UP send: Level Increase Start  
Releasing UP send: Level Increase Stop  
Push on DOWN send: OFF (0x00)  
Holding DOWN send: Level Increase Start  
Releasing DOWN send: Level Increase Stop

Association group 2 supports 5 nodes.

### Group 3: Group 3

Used for the first button with single rocker and the second button for triple rocker configuration.
Push on UP will send: ON (0xFF)  
Holding UP send: Level Increase Start  
Releasing UP send: Level Increase Stop  
Push on DOWN send: OFF (0x00)  
Holding DOWN send: Level Increase Start  
Releasing DOWN send: Level Increase Stop

Association group 3 supports 5 nodes.

### Group 4: Group 4

Used for the last button with double rocker and triple rocker configuration.
Push on UP will send: ON (0xFF)  
Holding UP send: Level Increas Start  
Releasing UP send: Level Increase Stop  
Push on DOWN send: OFF (0x00)  
Holding DOWN send: Level Increase Start  
Releasing DOWN send: Level Increase Stop

Association group 4 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [HeatIit Z-Push Wall Controller manual](https://opensmarthouse.org/zwavedatabase/1512/reference/Manual_Heatit_Z-Push_Wall_Controller_ENG.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1512).
