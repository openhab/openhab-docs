---
layout: documentation
title: FGWCEU-201 - ZWave
---

{% include base.html %}

# FGWCEU-201 FIBARO Walli Double Wall Mounted Remote Controller
This describes the Z-Wave device *FGWCEU-201*, manufactured by *[Fibargroup](http://www.fibaro.com/)* with the thing type UID of ```fibaro_fgwceu-201_00_000```.

The device is in the category of *Battery*, defining Batteries, Energy Storages.

![FGWCEU-201 product image](https://opensmarthouse.org/zwavedatabase/1383/image/)


The FGWCEU-201 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The FGWCEU-201 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

FIBARO Walli Controller is a smart wall-mounted Z-Wave™ remote controller that can activate scenes or control other Z-Wave devices via associations.

Main features:  
• Can be used for controlling multiple types of devices, e.g. switches, dimmers, roller shutters.  
• Pre-set configurations allow to easily adjust operation for specific type of controlled devices.  
• Battery or VDC powered.  
• Equipped with a built-in temperature sensor.  


• Supports Z-Wave network Security Modes: S0 with AES-128 encryption and S2 Authenticated with PRNG-based encryption.  
• Works as a Z-Wave signal repeater when VDC powered (all non-battery operated devices within the network will act as repeaters to increase reliability of the network).  
• May be used with all devices certified with the Z-Wave Plus™ certificate and should be compatible with such devices produced by other manufacturers

### Inclusion Information

To add the device to the Z-Wave network manually:

1. Set the main controller in (Security/non-Security Mode) add mode (see the controller’s manual).  
2. Quickly, three times click one of the buttons.  
3. If you are adding in Security S2 Authenticated, input the underlined part of the DSK (label on the box).  
4. LED will start blinking yellow, wait for the adding process to end.  
5. Adding result will be confirmed by the Z-Wave controller’s message and the LED frame:  
• Green – successful (non-secure, S0, S2 non-authenticated),  
• Magenta – successful (Security S2 Authenticated),  
• Red – not successful.

### Exclusion Information

To remove the device from the Z-Wave network:

1. Set the main controller into remove mode (see the controller’s manual).  
2. Quickly, three times click, then press and hold one of the buttons for 12 seconds.  
3. Release the button when the device glows green.  
4. Quickly click the button to confirm.  
5. LED will start blinking yellow, wait for the removing process to end.  
6. Successful removing will be confirmed by the Z-Wave controller’s message and red LED colour

### Wakeup Information

The FGWCEU-201 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


You can wake up the device manually using first menu position (white):

1. Quickly, three times click, then press and hold one of the buttons.

2. After 3 seconds LED ring signals adding status:  
• Blinking green – entering the menu (added as non-secure, S0, S2 non-authenticated)

  
• Blinking magenta – entering the menu (added as Security S2 Authenticated)  
• Blinking red – entering the menu (not added to a Z-Wave network)

3. The LED ring will turn off for 3 seconds, then start signalling menu positions.

4. Release the button when device signals desired position with colour:  
• WHITE – wake up the device  
• GREEN – start learning mode (add/remove)  
• MAGENTA – test Z-Wave range  
• CYAN – show battery level  
» Green – 50-100%  
» Yellow – 16-49%  
» Red – 1-15%  
• YELLOW – reset to factory default

5. Quickly click the button to confirm.

### General Usage Information

Resetting to factory defaults

Reset procedure allows to restore the device back to its factory settings, which means all information about the Z-Wave controller and user configuration will be deleted.

Resetting the device is not the recommended way of removing the device from the Z-Wave network. Use reset procedure only if the primary controller is missing or inoperable.

1. Quickly, three times click, then press and hold one of the buttons for 21 seconds.  
2. Release the button when the device glows yellow.  
3. Quickly click the button to confirm.  
4. After a few seconds the device will be restarted, which is signalled with red LED colour.

## Channels

The following table summarises the channels available for the FGWCEU-201 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Scene Number | scene_number | scene_number |  | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

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

The following table provides a summary of the 6 configuration parameters available in the FGWCEU-201.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 13 | LED frame – brightness | This parameter allows to adjust the LED frame brightness |
| 20 | Operation mode | This parameter defines operation of the device. Choose the mode depending on the type of the device you want to control remotely |
| 150 | LED ring – first button | This parameter defines the colour of first button indicator (upper part of the LED ring) for indications using Indicator CC. |
| 151 | LED ring – second button | This parameter defines the colour of second button indicator (lower part of the LED ring) for indications using Indicator CC. |
| 152 | 1st button - double click value | This parameter defines value of Basic Set or Multilevel Set frame (depending on selected mode) sent to associated devices after double click. This parameter is not relevant for Scene Controller Mode |
| 153 | 2nd button - double click value | This parameter defines value of Basic Set or Multilevel Set frame (depending on selected mode) sent to associated devices after double click. This parameter is used only in Double Button Mode. |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 13: LED frame – brightness

This parameter allows to adjust the LED frame brightness
0 – LED disabled  
1-100 (1-100% brightness)
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 20: Operation mode

This parameter defines operation of the device. Choose the mode depending on the type of the device you want to control remotely
0 – scene controller mode  
1 – double button mode  
2 – single button mode  
3 – switch controller mode  
4 – dimmer / roller shutter controller mode  
5 – roller shutter controller mode (step-by-step)  
6 – venetian blinds controller mode (step-by-step)
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 150: LED ring – first button

This parameter defines the colour of first button indicator (upper part of the LED ring) for indications using Indicator CC.
0 – LED disabled  
1 – White  
2 – Red  
3 – Green  
4 – Blue  
5 – Yellow  
6 – Cyan  
7 – Magenta  
8 – Blinking red-white-blue
Values in the range 0 to 8 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_150_2``` and is of type ```INTEGER```.


### Parameter 151: LED ring – second button

This parameter defines the colour of second button indicator (lower part of the LED ring) for indications using Indicator CC.
0 – LED disabled  
1 – White  
2 – Red  
3 – Green  
4 – Blue  
5 – Yellow  
6 – Cyan  
7 – Magenta  
8 – Blinking red-white-blue
Values in the range 0 to 8 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_151_2``` and is of type ```INTEGER```.


### Parameter 152: 1st button - double click value

This parameter defines value of Basic Set or Multilevel Set frame (depending on selected mode) sent to associated devices after double click. This parameter is not relevant for Scene Controller Mode
Available values 0-99 or 255
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_152_2``` and is of type ```INTEGER```.


### Parameter 153: 2nd button - double click value

This parameter defines value of Basic Set or Multilevel Set frame (depending on selected mode) sent to associated devices after double click. This parameter is used only in Double Button Mode.
Available values 0-99 or 255
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_153_2``` and is of type ```INTEGER```.

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

The FGWCEU-201 supports 7 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Reports the device status and allows for assigning single device only (main controller by default)

Association group 1 supports 1 node.

### Group 2: On/Off (1)

Used to turn the associated devices on/off.

Association group 2 supports 5 nodes.

### Group 3: Dimmer (1)

Used to change level of associated devices

Association group 3 supports 5 nodes.

### Group 4: On/Off (2)

Used to turn the associated devices on/off

Association group 4 supports 5 nodes.

### Group 5: Dimmer (2)

Used to change level of associated devices

Association group 5 supports 5 nodes.

### Group 6: Multidevice

Used to control different type of devices

Association group 6 supports 5 nodes.

### Group 7: Slats

Used to move slats of Venetian blinds.

Association group 7 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V1| |
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

* [Fibaro Walli Controller manual EN](https://opensmarthouse.org/zwavedatabase/1383/reference/FGWCEU-201-T-EN-1.1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1383).
