---
layout: documentation
title: HRT4-ZW - ZWave
---

{% include base.html %}

# HRT4-ZW Battery Powered Wall Thermostat
This describes the Z-Wave device *HRT4-ZW*, manufactured by *Horstmann Controls Limited* with the thing type UID of ```horstmann_hrt4zw_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![HRT4-ZW product image](https://www.cd-jackson.com/zwave_device_uploads/20/20_default.jpg)


The HRT4-ZW does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Wireless Z–Wave Battery Operated Electronic Room Thermostat with TPI temperature control software and ASR-ZW receiver unit

### Inclusion Information

  1. Set the number 1 DIL switch on the back of the HRT4-ZW thermostat to the On (Up) position and the display on the HRT4-ZW will change to show the letter ‘I’. If the letter ‘L’ appears, carry out stage 1A opposite.
  2. Power up the ASR-ZW receiver unit
  3. The network LED on the ASR-ZW receiver should be flashing.
  4. Press the dial on the front of the HRT4-ZW thermostat once so that the ‘I’ in the display flashes.
  5. Press and hold the network button on the ASR-ZW receiver until the On indicator flashes (green) before the Off indicator  
    becomes solid red.
  6. After a few seconds the radio mast symbol will appear in the display along with the letters IP.
  7. Reset the number 1 DIL switch on the back of the HRT4-ZW to the Off position and the temperature should return in the display

### Exclusion Information

Not provided

### Wakeup Information

The HRT4-ZW does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


  1. Turn the dial of the HRT4-ZW until the letter P appears in the display.
  2. Press the dial twice.
  3. A second P should appear in the display which now shows \`PP’.
  4. Turn the dial until the letter ‘I’ appears in the display and return to the main instruction.

## Channels

The following table summarises the channels available for the HRT4-ZW -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Thermostat mode
Sets the thermostat.

The ```thermostat_mode``` channel is of type ```thermostat_mode``` and supports the ```Number``` item and is in the ```Temperature``` category.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Off |
| 1 | Heat |
| 2 | Cool |
| 3 | Auto |
| 4 | Aux Heat |
| 5 | Resume |
| 6 | Fan Only |
| 7 | Furnace |
| 8 | Dry Air |
| 9 | Moist Air |
| 10 | Auto Changeover |
| 11 | Heat Economy |
| 12 | Cool Economy |
| 13 | Away |

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 3 configuration parameters available in the HRT4-ZW.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Enable Temperature Sensor | Controls the use of the temperature sensor on the device |
| 2 | Temperature Scale | Controls the temperature sensor scale |
| 3 | Delta T | Defines the temperature steps of the heating control. Steps are 0.1 K |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Enable Temperature Sensor

Controls the use of the temperature sensor on the device

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disable |
| 255 | Enable |

The manufacturer defined default value is ```0``` (Disable).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Temperature Scale

Controls the temperature sensor scale

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Celsius |
| 255 | Fahrenheit |

The manufacturer defined default value is ```0``` (Celsius).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Delta T

Defines the temperature steps of the heating control. Steps are 0.1 K

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.

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

The HRT4-ZW supports 5 association groups.

### Group 1: Thermostat Mode Set


Association group 1 supports 4 nodes.

### Group 2: Binary Switch Set


Association group 2 supports 4 nodes.

### Group 3: Unsolicited Battery Level Reports


Association group 3 supports 4 nodes.

### Group 4: Thermostat Set Point Reports


Association group 4 supports 4 nodes.

### Group 5: Unsolicited Sensor Multilevel Reports


Association group 5 supports 4 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Guide](https://www.cd-jackson.com/zwave_device_uploads/20/user-and-installer-guide-HRT4-ZWweb1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/20).
