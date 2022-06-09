---
layout: documentation
title: NM-CO-10x-INT - ZWave
---

{% include base.html %}

# NM-CO-10x-INT Carbon Monoxide Detector
This describes the Z-Wave device *NM-CO-10x-INT*, manufactured by *Fireangle* with the thing type UID of ```fireangle_nmco10xint_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![NM-CO-10x-INT product image](https://opensmarthouse.org/zwavedatabase/1495/image/)


The NM-CO-10x-INT supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The NM-CO-10x-INT does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The higher the concentration of CO detected, the quicker the alarm will respond. When sufficient CO is detected a loud audible signal of 4 chirps repeated (85 dB at 1m/3 feet) will sound & the Alarm LED will flash red every 5 seconds. The alarm will sound:

Between 60 & 90 mins when exposed to 50ppm of CO. Between 10 & 40 mins when exposed to 100ppm of CO. Within 3 mins when exposed to 300ppm or more of CO.

ZW-MODULE INSTALLATION GUIDE

This wireless module is designed to be installed in a Z-Wave compatible smoke or heat alarm which offers an additional option for wireless connectivity. For the current range of Z-Wave compatible products visit www.fireangel.de.com.

When the wireless module is fitted into a Z-Wave compatible FireAngel smoke or heat alarm it enables the unit to be wirelessly interlinked to a third party Z-Wave Controller.

When any of the interlinked products are triggered by smoke or heat, the unit will transmit messages to the main Controller.

Note: You will need the User Manual of the product into which you are installing the wireless module in order to understand alarm operation. Z-Wave module characteristics are different to those stated in FireAngel Wi-Safe 2 literature, please contact Technical Support on 0800 330 5103 or email technik@sprue.com for more information.

This product can be included and operated in any Z-Wave network with other Z-Wave certified devices from other manufacturers. All non-battery operated devices within the network will act as repeaters regardless of vendor to increase reliability of the network.

### Inclusion Information

‘ADDING’ YOUR Z-WAVE UNITS

Do not attempt to add your Z-Wave Module unless you are familiar with the operation of your Z-Wave Controller.

  1. Read the instructions for your Z-Wave Controller regarding adding new devices. Then initiate the inclusion function from your Z-Wave Controller.
  2. Triple-press the add button once the Z-Wave Module is on the device. The LED will show a quick blink once per second while the module is being added. This process may take as long as 30 seconds, but typically is much quicker. If you triple-press too quickly or too slowly, inclusion will not start. In this case wait a few seconds and then try again.
  3. Upon successful inclusion, the Z-Wave Module LED will flash 3 times. If inclusion fails, the LED will simply stop its blink pattern.
  4. If inclusion does not succeed, restart at step 1. 5. If successful, place the alarm on its base and wait at least 30 seconds.
  5. Press the alarm’s test button and verify the Z-Wave Controller receives Notification Reports.
  6. After the Z-Wave Module is included, you may define association groups or perform other configuration operations from the Z-Wave Controller.

For information about where to position the alarm, and operational guidelines, please see the device User Manual.

Once a year the unit will send a Notification Report showing Maintenance Required, Periodic Planned Inspection. The alarm’s test button should be pressed to clear this condition.

### Exclusion Information

‘REMOVING’ YOUR Z-WAVE UNITS

  1. Read the instructions on your Z-Wave Controller regarding removing devices. Note that a device can be removed using any Z-Wave Controller, not just the Controller that was used to add the Module. Initiate the removal process at your Controller.
  2. Triple-press the button on the Z-Wave Module. The LED will show a quick double-blink once per second while the module is being removed. This process may take up to 30 seconds. If you triple-press too quickly or too slowly the removing function will not start. In this case you must wait a few seconds and try again.
  3. Upon successful removal, the Z-Wave Module LED will flash 5 times. If removal fails, the LED will simply stop its blink pattern.
  4. If the removal operation does not succeed, restart at step 1.
  5. After removing, either a) add the Z-Wave Module into a different Z-Wave Controller, or b) remove the battery from the Z-Wave Module.

NOTE: The effective range of the wireless module may be reduced by walls and other obstructions in the building. It is recommended not to exceed 40m as the maximum distance between smoke alarms and the Controller.

Once the Z-Wave module is removed from a device, it needs to be reset before it can be used in another device.

  1. Press and hold the button on the Z-Wave Module for 10 seconds. Once the LED light goes off, release the button.
  2. The module is now reset. This will erase the network as well as the device ID. The module can then be placed in a new device and learned-in to a network again. Resetting whilst the module is still connected to the old alarm, will erase only the network content.

Resetting once the module is removed from the alarm, will erase the network as well as the device details from the module.

### Wakeup Information

The NM-CO-10x-INT does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Waking the Module

If the module has been successfully included, when pressing the button, the LED will flash three times. In addition, the module will communicate with the Z-Wave Controller, accepting any pending commands.

### General Usage Information

HOW TO INSTALL A Z-WAVE

WIRELESS MODULE (ZW-MODULE)

Please read these fitting instructions carefully before proceeding, paying particular attention to the ESD handling guidelines below.

  * Remove the label which covers the module aperture on the host unit.
  * Avoid carpeted areas in cool, dry areas if possible, and reduce static electricity if necessary by touching a grounded metal object.
  * Carefully remove the module from its packaging, handling the module only by the protective plastic cover, to avoid electrostatic discharge.
  * Be careful not to touch the components or connector pins.
  * Remove the plastic battery insulation tab by pulling it out.
  * Carefully plug the module into the aperture in the unit, pushing down until it lies flat within the base of the unit.

The unit is now ready to be added (included) to the Z-Wave Controller.

## Channels

The following table summarises the channels available for the NM-CO-10x-INT -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Alarm (CO) | alarm_co | alarm_co |  | Switch | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Alarm (CO)
Indicates if the carbon monoxide alarm is triggered.

The ```alarm_co``` channel is of type ```alarm_co``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The NM-CO-10x-INT supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Z-Wave Plus Lifeline

Association group 1 supports 5 nodes.

### Group 2: Basic Report


Association group 2 supports 5 nodes.

### Group 3: Notification Report


Association group 3 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [FireAngel NM-CO-10x-INT UserManual](https://opensmarthouse.org/zwavedatabase/1495/reference/FireAngel_NM-CO-10x-INT_UserManual.pdf)
* [FireAngel NM-CO-10x-INT Specs](https://opensmarthouse.org/zwavedatabase/1495/reference/FireAngel_NM-CO-10x-INT_specs.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1495).
