---
layout: documentation
title: WWDZWE - ZWave
---

{% include base.html %}

# WWDZWE Water Sensor
This describes the Z-Wave device *WWDZWE*, manufactured by *Ubitech* with the thing type UID of ```ubitech_wwdzwe_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![WWDZWE product image](https://opensmarthouse.org/zwavedatabase/1402/image/)


The WWDZWE supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The WWDZWE does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

The Water Contact Sensor is placed on critical positions within the home and will detect even smallest drops of water thanks to the capillary effect (water is soaked into the colored sensor channel). Detected water results in an alarm sent to a central gateway using Z-Wave wireless protocol.  


The unique feature of this device is the central sensor ring with 4 metal water probes on four corners. This ensures the detection works in all possible orientations of the device.

An external second water detection probe can be connected to the main device and it will act as second sensor differing from the primary sensor probe inside the ring. The internal temperature sensor will report freezing condition to protect water installation from further damaging.

### Inclusion Information

  1. When in factory reset state connect two of the pins in the ring (using a wire or water or two wet fingers) for two seconds. Short beeps and yellow LED help counting.
  2. Release connection. This process only works when the device is in factory reset state.

### Exclusion Information

  1. Shake the device for few seconds.
  2. Place it flat on the table.
  3. Wait for two buzzer sounds with two times green LED. This indicates the device is ready for gesture. Red/Yellow blinking LED shows readiness.
  4. Now Turn the device in upright position.

### Wakeup Information

The WWDZWE does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Wakeup the device by connecting two of the pins for 5 seconds.

### General Usage Information



## Channels

The following table summarises the channels available for the WWDZWE -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 
| Alarm (flood) | alarm_flood | alarm_flood | Water | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (flood)
Indicates if the flood alarm is triggered.

The ```alarm_flood``` channel is of type ```alarm_flood``` and supports the ```Switch``` item and is in the ```Water``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 18 configuration parameters available in the WWDZWE.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 16 | Sensor Functions | This parameter defines which sensor function of the device is active |
| 17 | Water Leak Cancelation Command Behavior | Defines when a BASIC command Value to send to cancel water alarm |
| 48 | Temperature Sensor Report | Defines if and how a temperature value is reported. |
| 49 | Temperature Sensor Report Threshold | Defines the change in temperature value to cause unsolicited sending of an report. |
| 50 | Temperature Sensor Report Offset | Defines a temperature offset for the reported temperature. This parameter can be used to compensate for certain temperature deviations. |
| 51 | Temperature Overheat Trigger | Sets the temperature to trigger and overheat alarm and |
| 52 | Temperature Overheat Reset Trigger Value | Sets the temperature to reset the overheat alarm and |
| 53 | Freeze Trigger Value | Sets the temperature threshold to cause a freeze alarm |
| 54 | Freeze Trigger Reset Value | Sets the temperature threshold to reset a freeze alarm |
| 64 | Built-In Leak Detection Command Value | Defines what BASIC command Value to send into Association Group 3 |
| 65 | Built-In Leak Detection Reset Command Value | Defines what BASIC command Value to send into Association Group 3 |
| 66 | Remote Leak Detection Command Value | Defines what BASIC command Value to send into Association Group 3 |
| 67 | Remote Leak Detection Reset Command Value | Defines what BASIC command Value to send into Association Group 3 |
| 68 | Temperature Overhead Action Value | Defines what BASIC command Value to send into Association Group 4 |
| 69 | Temperature Overhead Action Reset Value | Defines what BASIC command Value to send into Association Group 4 |
| 70 | Freeze Association Action Command | Defines what BASIC command Value to send into Association Group 5 |
| 71 | Freeze Association Reset Command | Defines what BASIC command Value to send into Association Group 5 |
| 80 | Resent Water Leak Notification time | Defines the interval of resending water leak notification if the water is still present |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 16: Sensor Functions

This parameter defines which sensor function of the device is active
Bit 0: Built-In Detection Probe  
Bit 1: Remote Water Detection Probe  
Bit 2: Overhead Detection  
Bit 3: Freeze Detection
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_16_1``` and is of type ```INTEGER```.


### Parameter 17: Water Leak Cancelation Command Behavior

Defines when a BASIC command Value to send to cancel water alarm
0: Send BASIC SET command when Water Alarm canceled either Built-In OR on Remote Probe

1: Send BASIC SET command when Water Alarm canceled on Built-In AND on Remote Probe
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 48: Temperature Sensor Report

Defines if and how a temperature value is reported.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Report in Celsius |
| 2 | Report in Fahrenheit |

The manufacturer defined default value is ```1``` (Report in Celsius).

This parameter has the configuration ID ```config_48_1``` and is of type ```INTEGER```.


### Parameter 49: Temperature Sensor Report Threshold

Defines the change in temperature value to cause unsolicited sending of an report.
0x00-0xff: Value in Celsius (example: 0x02 = 2 °C)  


0x100-0x1ff: Value in Fahrenheit (example: 0x102 = 2 °F)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_49_2``` and is of type ```INTEGER```.


### Parameter 50: Temperature Sensor Report Offset

Defines a temperature offset for the reported temperature. This parameter can be used to compensate for certain temperature deviations.
0x00-0xff: Positive Deviation in Celsius (e.g. 0x02 = +2 °C)  
0x1000-0x10ff: Negative Deviation in Celsius (e.g. 0x02 = -2 °C)  
0x0100-0x01ff: Positive Deviation in Fahrenheit (e.g. 0x02 = +2 °F)  
0x1100-0x11ff: Negative Deviation in Fahrenheit (e.g. 0x02 = -2 °F)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_50_2``` and is of type ```INTEGER```.


### Parameter 51: Temperature Overheat Trigger

Sets the temperature to trigger and overheat alarm and
0x00-0xff: Value in Celsius (example: 0x02 = 2 °C)  
0x100-0x1ff: Value in Fahrenheit (example: 0x102 = 2 °F)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_51_2``` and is of type ```INTEGER```.


### Parameter 52: Temperature Overheat Reset Trigger Value

Sets the temperature to reset the overheat alarm and
0x00-0xff: Value in Celsius (example: 0x02 = 2 °C)  
0x100-0x1ff: Value in Fahrenheit (example: 0x102 = 2 °F)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_52_2``` and is of type ```INTEGER```.


### Parameter 53: Freeze Trigger Value

Sets the temperature threshold to cause a freeze alarm
0x00-0xff: Value in Celsius (example: 0x02 = 2 °C)  
0x100-0x1ff: Value in Fahrenheit (example: 0x102 = 2 °F)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_53_2``` and is of type ```INTEGER```.


### Parameter 54: Freeze Trigger Reset Value

Sets the temperature threshold to reset a freeze alarm
0x00-0xff: Value in Celsius (example: 0x02 = 2 °C)  
0x100-0x1ff: Value in Fahrenheit (example: 0x102 = 2 °F)
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_54_2``` and is of type ```INTEGER```.


### Parameter 64: Built-In Leak Detection Command Value

Defines what BASIC command Value to send into Association Group 3

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_64_1``` and is of type ```INTEGER```.


### Parameter 65: Built-In Leak Detection Reset Command Value

Defines what BASIC command Value to send into Association Group 3

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_65_1``` and is of type ```INTEGER```.


### Parameter 66: Remote Leak Detection Command Value

Defines what BASIC command Value to send into Association Group 3

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_66_1``` and is of type ```INTEGER```.


### Parameter 67: Remote Leak Detection Reset Command Value

Defines what BASIC command Value to send into Association Group 3

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_67_1``` and is of type ```INTEGER```.


### Parameter 68: Temperature Overhead Action Value

Defines what BASIC command Value to send into Association Group 4

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_68_1``` and is of type ```INTEGER```.


### Parameter 69: Temperature Overhead Action Reset Value

Defines what BASIC command Value to send into Association Group 4

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_69_1``` and is of type ```INTEGER```.


### Parameter 70: Freeze Association Action Command

Defines what BASIC command Value to send into Association Group 5

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_70_1``` and is of type ```INTEGER```.


### Parameter 71: Freeze Association Reset Command

Defines what BASIC command Value to send into Association Group 5

Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_71_1``` and is of type ```INTEGER```.


### Parameter 80: Resent Water Leak Notification time

Defines the interval of resending water leak notification if the water is still present
0: Disabled  
1: 1 minute  
2: 2 minutes  
etc...
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_80_1``` and is of type ```INTEGER```.

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

The WWDZWE supports 5 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline. All alarms that shall be sent to the gateway

Association group 1 supports 5 nodes.

### Group 2: Switch on leak

Switch Devices when Built-In Leak Sensor alerts

Association group 2 supports 5 nodes.

### Group 3: Switch on pad leak

Switch Devices when Remote Leak Sensor Pad alerts

Association group 3 supports 5 nodes.

### Group 4: Switch on temperature too high

Switch Devices when temperature raise above threshold

Association group 4 supports 5 nodes.

### Group 5: Switch on temperature too low

Switch Devices when temperature falls below threshold

Association group 5 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1402/reference/WWDZWE_Manual_EN.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1402).
