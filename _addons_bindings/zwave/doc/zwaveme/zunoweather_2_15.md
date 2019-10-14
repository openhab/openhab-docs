---
layout: documentation
title: Z-Uno Weather 2.1.5.1 - ZWave
---

{% include base.html %}

# Z-Uno Weather 2.1.5.1 Weather Station with Temperature, Pressure, Light-Level and Humidity
This describes the Z-Wave device *Z-Uno Weather 2.1.5.1*, manufactured by *Z-Wave.Me* with the thing type UID of ```zwaveme_zunoweather_02_015```.
This version of the device is limited to firmware versions above 2.15

The device is in the category of *Sensor*, defining Device used to measure something.

The Z-Uno Weather 2.1.5.1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

### Inclusion Information

Press 3-Times Service button. Refer to https://z-uno.z-wave.me/getting-started/include-in-network.

### Exclusion Information

Refer to https://z-uno.z-wave.me/getting-started/include-in-network.

### Wakeup Information

The Z-Uno Weather 2.1.5.1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Press Service Button once.

## Channels

The following table summarises the channels available for the Z-Uno Weather 2.1.5.1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Temperature | temperature | temperature |  |  | 
| Humidity | humidity | humidity |  |  | 
| Luminance | luminance | luminance |  |  | 
| Barometric pressure | barpressure | barpressure |  |  | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Temperature
Temperature in Degrees Celsius.

Channel type information on this channel is not found.

### Humidity
Humidity in percent.

Channel type information on this channel is not found.

### Luminance
Luminance in lux.

Channel type information on this channel is not found.

### Barometric pressure
Pressure in kilopascal.

Channel type information on this channel is not found.

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 18 configuration parameters available in the Z-Uno Weather 2.1.5.1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Debug Mode | Debug mode for on-the-fly changes |
| 2 | Service LED | Blink with service LED during operation |
| 3 | Security S0 | Enable or disable Security S0 during inclusion (requires re-inclusion) |
| 11 | Min. Waittime for Multilevel-Sensor Reports | Minimal time between Sensor Multilevel reports. |
| 12 | Legacy Sensor Binary | Change channel type from Notification to legacy Sensor Binary for compatibility. |
| 20 | OTA Confirmation | Confirmation of OTA operations |
| 64 | Luminance Resolution | Mode for luminance measurements. |
| 65 | Luminance Compensation | Compensation value for luminance. |
| 66 | Temperature Compensation | Compensation value for Temperature |
| 67 | Pressure Compensation | Compensation for barometric pressure. |
| 68 | Humidity Compensation | Compensation value for humidity. |
| 69 | Temperature Oversampling | Oversampling factor for temperature measurement. |
| 70 | Pressure Oversampling | Oversampling factor for pressure measurement |
| 71 | Humidity Oversampling | Oversampling factor for humidity measurement |
| 72 | Luminance Report Delta | Minimum delta to report luminance changes. |
| 73 | Temperature Report Delta | Minimum delta to report temperature changes. |
| 74 | Pressure Report Delta | Minimum delta to report pressure changes. |
| 75 | Humidity Report Delta | Minimum delta to report humidity changes. |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Debug Mode

Debug mode for on-the-fly changes
Debug mode to apply channels, associations and power mode changes on the fly without exclusion-inclusion sequence. **Use for debugging only!**

Refer to https://z-uno.z-wave.me/z-wave/configuration-parameters/This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_1_1_00000001``` and is of type ```INTEGER```.


### Parameter 2: Service LED

Blink with service LED during operation
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_2_1_00000001``` and is of type ```INTEGER```.


### Parameter 3: Security S0

Enable or disable Security S0 during inclusion (requires re-inclusion)
This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```1``` (Enabled).

This parameter has the configuration ID ```config_3_1_00000001``` and is of type ```INTEGER```.


### Parameter 11: Min. Waittime for Multilevel-Sensor Reports

Minimal time between Sensor Multilevel reports.
Minimal time (in seconds) between Sensor Multilevel reports. See zunoSendReport(). Values less than 30 should not be used to conform to Z-Wave Plus, use them for debug only! 0 means send immediately. This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_11_1_000000FF``` and is of type ```INTEGER```.


### Parameter 12: Legacy Sensor Binary

Change channel type from Notification to legacy Sensor Binary for compatibility.
Change channel type from Notification to legacy Sensor Binary to help Fibaro Home Center, Vera and some other controllers having problems with the latest Z-Wave Plus to understand the channel typeThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Disabled |
| 1 | Enabled |

The manufacturer defined default value is ```0``` (Disabled).

This parameter has the configuration ID ```config_12_1_00000001``` and is of type ```INTEGER```.


### Parameter 20: OTA Confirmation

Confirmation of OTA operations
Confirmation of OTA operations (for bootloader and sketch upgrades). Refer to https://z-uno.z-wave.me/z-wave/ota/This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_20_4_7FFFFFFF_wo``` and is of type ```INTEGER```.
This is a write only parameter.


### Parameter 64: Luminance Resolution

Mode for luminance measurements.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Low (4 lux) |
| 1 | High (1lx) |
| 2 | Very High (0.5lx) |

The manufacturer defined default value is ```0``` (Low (4 lux)).

This parameter has the configuration ID ```config_64_1_0000FFFF``` and is of type ```INTEGER```.


### Parameter 65: Luminance Compensation

Compensation value for luminance.
Compensation value for luminance. Keep in mind that luminance ranges from 0 to 65535. The compensation value will be added and an overflow can be the result.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_65_2_0000FFFF``` and is of type ```INTEGER```.


### Parameter 66: Temperature Compensation

Compensation value for Temperature
Compensation value for temperature in 1/100 °C (i.e. 10=0.1°C, 100=1°C, 1000=10°C).
Values in the range 0 to 10000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_66_2_0000FFFF``` and is of type ```INTEGER```.


### Parameter 67: Pressure Compensation

Compensation for barometric pressure.
Compensation value for pressure in 1/100 kPa (i.e. 10=0.1kPa, 100=1kPa, 1000=10kPa).
Values in the range 0 to 10000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_67_1_0000FFFF``` and is of type ```INTEGER```.


### Parameter 68: Humidity Compensation

Compensation value for humidity.
Compensation value for humidity in percent.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_68_1_0000FFFF``` and is of type ```INTEGER```.


### Parameter 69: Temperature Oversampling

Oversampling factor for temperature measurement.

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Skipped |
| 1 | 1x |
| 2 | 2x |
| 3 | 4x |
| 4 | 8x |
| 5 | 16x |

The manufacturer defined default value is ```0``` (Skipped).

This parameter has the configuration ID ```config_69_1_0000FFFF``` and is of type ```INTEGER```.


### Parameter 70: Pressure Oversampling

Oversampling factor for pressure measurement

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Skipped |
| 1 | 1x |
| 2 | 2x |
| 3 | 4x |
| 4 | 8x |
| 5 | 16x |

The manufacturer defined default value is ```1``` (1x).

This parameter has the configuration ID ```config_70_1_0000FFFF``` and is of type ```INTEGER```.


### Parameter 71: Humidity Oversampling

Oversampling factor for humidity measurement

The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Skipped |
| 1 | 1x |
| 2 | 2x |
| 3 | 4x |
| 4 | 8x |
| 5 | 16x |

The manufacturer defined default value is ```1``` (1x).

This parameter has the configuration ID ```config_71_1_0000FFFF``` and is of type ```INTEGER```.


### Parameter 72: Luminance Report Delta

Minimum delta to report luminance changes.

Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_72_2_0000FFFF``` and is of type ```INTEGER```.


### Parameter 73: Temperature Report Delta

Minimum delta to report temperature changes.

Values in the range 0 to 10000 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_73_2_0000FFFF``` and is of type ```INTEGER```.


### Parameter 74: Pressure Report Delta

Minimum delta to report pressure changes.

Values in the range 0 to 10000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_74_2_0000FFFF``` and is of type ```INTEGER```.


### Parameter 75: Humidity Report Delta

Minimum delta to report humidity changes.

Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_75_1_000000FF``` and is of type ```INTEGER```.

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
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1115).
