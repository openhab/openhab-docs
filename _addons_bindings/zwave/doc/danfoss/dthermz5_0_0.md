---
layout: documentation
title: DTHERMZ5 - ZWave
---

{% include base.html %}

# DTHERMZ5 Z-Wave room sensor
This describes the Z-Wave device *DTHERMZ5*, manufactured by *Danfoss* with the thing type UID of ```danfoss_dthermz5_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![DTHERMZ5 product image](https://www.cd-jackson.com/zwave_device_uploads/501/501_default.jpg)


The DTHERMZ5 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The DTHERMZ5 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

qheat RS is a battery operated temperature sensor. When included into Z-Wave wireless network, its buttons can also be used to control the heating system.

### Inclusion Information

Press the LED button on the qheat RS

### Exclusion Information

Hold down the 3 buttons on the qheat RS for 5 seconds (up, down and LED buttons).

### Wakeup Information

The DTHERMZ5 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


 The qheat RS can be woken manually by pushing any of the three buttons, and will stay awake for 10 seconds

## Channels

The following table summarises the channels available for the DTHERMZ5 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Setpoint (cooling) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Setpoint (heating) | thermostat_setpoint | thermostat_setpoint | Heating | Number:Temperature | 
| Scene Number | scene_number | scene_number |  | Number | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Setpoint (cooling)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

### Setpoint (heating)
Sets the thermostat setpoint.

The ```thermostat_setpoint``` channel is of type ```thermostat_setpoint``` and supports the ```Number:Temperature``` item and is in the ```Heating``` category.

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

The following table provides a summary of the 11 configuration parameters available in the DTHERMZ5.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Temperature Report threshold | Temperature Report threshold |
| 2 | Set-point display resolution | range from 0.1 to 10°C 1=0.1°C 100=10°C |
| 3 | Min Set-point and override limit | from min 0°C to max setpoint override limit 0=0°C 40=40°C |
| 4 | Max Set-point and override limit | from min setpoint override limit to max 40°C 0=0°C 40=40°C |
| 5 | LED Flash period | 0 to 65535 seconds |
| 6 | Set-point control function | 0=Disabled 1=Enabled |
| 7 | Temporarily override scheduler | 0=Disabled 1=Enabled |
| 8 | Set-point type in Thermostat_Setpoint_Reports | 1=Heating 2=Cooling 10=Auto Changeover |
| 9 | LED on time | 1=100ms 5=500ms |
| 10 | Number of LED flashes (duration) | 0 to 255 |
| 11 | LED color | 1=Green 2=Red |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Temperature Report threshold

Temperature Report threshold
Range is from 0.1 to 10°C 1=0.1°C 100=10°C, default value 5 = 0.5 °C
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Set-point display resolution

range from 0.1 to 10°C 1=0.1°C 100=10°C

Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Min Set-point and override limit

from min 0°C to max setpoint override limit 0=0°C 40=40°C

Values in the range 0 to 40 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: Max Set-point and override limit

from min setpoint override limit to max 40°C 0=0°C 40=40°C

Values in the range 0 to 40 may be set.

The manufacturer defined default value is ```28```.

This parameter has the configuration ID ```config_4_2``` and is of type ```INTEGER```.


### Parameter 5: LED Flash period

0 to 65535 seconds

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_5_4``` and is of type ```INTEGER```.


### Parameter 6: Set-point control function

0=Disabled 1=Enabled

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (enabled).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Temporarily override scheduler

0=Disabled 1=Enabled

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (enabled).

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Set-point type in Thermostat_Setpoint_Reports

1=Heating 2=Cooling 10=Auto Changeover

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Heating |
| 2 | Cooling |
| 10 | Auto-Changeover |

The manufacturer defined default value is ```1``` (Heating).

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: LED on time

1=100ms 5=500ms

Values in the range 1 to 5 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_9_2``` and is of type ```INTEGER```.


### Parameter 10: Number of LED flashes (duration)

0 to 255

Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_10_1``` and is of type ```INTEGER```.


### Parameter 11: LED color

1=Green 2=Red

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 1 | Green |
| 2 | Red |

The manufacturer defined default value is ```1``` (Green).

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.

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

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V6| |
| COMMAND_CLASS_THERMOSTAT_SETPOINT_V1| |
| COMMAND_CLASS_SCHEDULE_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_PROTECTION_V2| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_MULTI_CMD_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/501/Bedienungsanleitung-DTHERMZ5.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/501).
