---
layout: documentation
title: HA-ZW-5SE - ZWave
---

{% include base.html %}

# HA-ZW-5SE Door/Window Sensor
This describes the Z-Wave device *HA-ZW-5SE*, manufactured by *Ameta International* with the thing type UID of ```ameta_hazw5se_00_000```.

The device is in the category of *Door*, defining Door sensors.

![HA-ZW-5SE product image](https://www.cd-jackson.com/zwave_device_uploads/1216/1216_default.png)


The HA-ZW-5SE supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The HA-ZW-5SE does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

  * The AIBASE Door/Window Sensor contains a sensor body and a magnet.
  * The AIBASE Door/Window Sensor detects through the separation and combination of the main body and the magnet.
  * Recommend installation distance between the sensor body and the magnet is 10mm.
  * The Sensor also anti‐tamper functionality. Once the sensor is moved, it will notify the gateway.
  * The AIBASE Door/Window Sensor is powered by CR2 battery with 2 years battery life.
  * The AIBASE Door/Window Sensor is designed to be mounted on the door or windows.
  * The AIBASE Door/Window Sensor supports low battery alarm function.
  * The AIBASE Door/Window Sensor supports firmware OTA.

### Inclusion Information

Add for inclusion: 

  1. Insert the battery.
  2. Set the Z-Wave network main controller into learning mode.
  3. Short press the action button one time.
  4. If the add for inclusion is successful, the LED will blink fast and then keep on 3 seconds. Otherwise, the LED will blink 25 seconds and then turn off, in which case you need to repeat the process from step 

### Exclusion Information

Remove for exclusion;

  1. Insert the CR battery.
  2. Set the Z-Wave network main controller into exclusion mode.
  3. Short press the action button one time.

If the remove for exclusion is successful, the LED will blink fast and turn off. Otherwise, the LED will keep solid for 2 seconds and then turn off, in which case you need to repeat the process from step 2.

### Wakeup Information

The HA-ZW-5SE does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


  1. Short press 3 time.
  2. LED will blink one time; sending wake up notification cc

### General Usage Information

FACTORY RESET

Press and hold for 5 seconds.

LED will blink fast for 5 seconds and then keep solid for 3 seconds, after that Door/Window Sensor will send “Device\_Reset\_Locally” to the main controller and exclude from the Z-Wave network.

Please use this procedure only when the network primary controller is missing or otherwise inoperable.

## Channels

The following table summarises the channels available for the HA-ZW-5SE -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Sensor Door | sensor_door | sensor_door | Door | Contact | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Alarm (burglar)
Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Sensor Door
Indicates if the door/window is open or closed.

The ```sensor_door``` channel is of type ```sensor_door``` and supports the ```Contact``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Contact``` item type -:

| Value | Label     |
|-------|-----------|
| OPEN | Open |
| CLOSED | Closed |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 4 configuration parameters available in the HA-ZW-5SE.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 10 | Level of low battery | This parameter defines a battery level as the “low battery” |
| 14 | Enable/Disable BASIC SET command | Door/Window Sensor can send BASIC SET command to nodes associated with group 2. |
| 15 | Value of the BASIC SET | Reverse value of BASIC SET when the magnet is triggered. |
| 254 | Enable/disable the configuration command | Lock/unlock all configuration parameters. |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 10: Level of low battery

This parameter defines a battery level as the “low battery”
Available settings: 0‐50 (0% ‐ 50%) 

Default setting: 10 (10%)
Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 14: Enable/Disable BASIC SET command

Door/Window Sensor can send BASIC SET command to nodes associated with group 2.
0 – Disable.  
1 – Enable.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 1 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Value of the BASIC SET

Reverse value of BASIC SET when the magnet is triggered.
0 –Send BASIC SET VALUE = 255 to nodes associated with group 2 when door/window is opened. Send BASIC SET VALUE = 0 to nodes associated with group 2 when door/window is closed.

1 –Send BASIC SET VALUE = 0 to nodes associated with group 2 when door/window is opened. Send BASIC SET VALUE = 255 to nodes associated with group 2 when door/window is closed.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Send BASIC SET VALUE = 255 when Opened |
| 1 | Send BASIC SET VALUE = 255 when Closed |

The manufacturer defined default value is ```0``` (Send BASIC SET VALUE = 255 when Opened).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 254: Enable/disable the configuration command

Lock/unlock all configuration parameters.
0 – Unlock.  
1 – Lock.  
Default setting: 0
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Unlock |
| 1 | Lock |

The manufacturer defined default value is ```0``` (Unlock).

This parameter has the configuration ID ```config_254_1``` and is of type ```INTEGER```.

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

The HA-ZW-5SE supports 2 association groups.

### Group 1: Group 1

  1. Notification Report.  
    Sensor will send Notification Report when the supported event is triggered.
  2. Battery Report.  
    Sensor will send Battery Report when the battery level is low and the battery report’s value is 0xFF.
  3. Device Reset Locally.

Association group 1 supports 5 nodes.

### Group 2: Group 2

Basic Set, Sensor will send Basic Set when the sensor body and magnet removed or combined.

Association group 2 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Manufacturer Provided Product Manual](https://www.cd-jackson.com/zwave_device_uploads/1216/Z-Wave-Door-Window-Sensor---User-Guide---Aibase.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1216).
