---
layout: documentation
title: PSP02 - ZWave
---

{% include base.html %}

# PSP02 Door/temp/illumination/motion sensor
This describes the Z-Wave device *PSP02*, manufactured by *[Zipato](http://www.zipato.com/)* with the thing type UID of ```zipato_phpsp02_00_000```.

The device is in the category of *Door*, defining Door sensors.

![PSP02 product image](https://www.cd-jackson.com/zwave_device_uploads/857/857_default.jpg)


The PSP02 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The PSP02 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Door/Window, motion, temperature and illumination sensor in one device.

Primarily used as Door/Window sensor, it consists of two parts: magnet and a sensor.

  * Very low power consumption.
  * Low battery battery indication.
  * Door/Window status and battery status auto-report.
  * LED indicator.
  * Over-the-air firmware update.
  * Tamper proof protection.

### Inclusion Information

Put the Z-Wave Controller in inclusion mode.

Pressing tamper key three times within 1.5 seconds will enter inclusion mode.

After successful inclusion, the device will wake to receive the setting command from the Z-Wave Controller in about 20 seconds.

### Exclusion Information

Put the Z-Wave Controller in exclusion mode.

Pressing tamper key three times within 1.5 seconds will enter exclusion mode. Node ID has been excluded.

### Wakeup Information

The PSP02 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Any action.

## Channels

The following table summarises the channels available for the PSP02 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Door/Window sensor | sensor_door | sensor_door | Door | Contact | 
| Sensor(temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor(luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Motion Alarm | alarm_motion | alarm_motion | Motion | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |
| Alarm(general) | alarm_general | alarm_general | Alarm | Switch | 

### Door/Window sensor
Indicates if the door/window is open or closed.

The ```sensor_door``` channel is of type ```sensor_door``` and supports the ```Contact``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Contact``` item type -:

| Value | Label     |
|-------|-----------|
| OPEN | Open |
| CLOSED | Closed |

### Sensor(temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor(luminance)
Indicates the current light reading.

The ```sensor_luminance``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Motion Alarm
Indicates if a motion alarm is triggered.

The ```alarm_motion``` channel is of type ```alarm_motion``` and supports the ```Switch``` item and is in the ```Motion``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.
### Alarm(general)
Indicates if an alarm is triggered.

The ```alarm_general``` channel is of type ```alarm_general``` and supports the ```Switch``` item and is in the ```Alarm``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 30 configuration parameters available in the PSP02.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 2 | Basic Set Level | Basic command to turn on the light |
| 3 | PIR Sensitivity | setting |
| 4 | Light Threshold | setting |
| 5 | Operation mode | set test mode if DIP switch in customer mode |
| 5 | disable the door/window function | Disable/Enable the function |
| 5 | temperature unit | set the temperature unit |
| 5 | Disable illumination reports | toggle illumination reports |
| 5 | Disable temperature reports | Disable/enable temperature reports |
| 5 | back key release action | Disable/enable the back key release into test mode |
| 6 | magnetic integration for lighting control | switch control |
| 6 | PIR integration to control lighting | PIR integration |
| 6 | magetic/pir integration | control lighting in association group 2 |
| 6 | device and lighting in same room | device and lighting in same room |
| 6 | disable delay to turn off the light | disable/enable delay |
| 6 | light off control | disable/enable auto turn off the light |
| 7 | motion off report | enable motion OFF report |
| 7 | PIR super-sensitivity | enable PIR super-sensitivity |
| 7 | BASIC OFF report | Disable/enable report after door closed |
| 7 | door closed report type | notification or sensor binary report |
| 7 | multi CC in auto report | disable/enable multi CC in report |
| 7 | Battery state reports | disable/enable battery state reports |
| 8 | PIR motion re-trigger min interval | PIR motion re-trigger min interval |
| 9 | Light on time hysteresis | time to keep the light on without motion |
| 10 | battery level auto-report interval | battery level auto-report interval |
| 11 | door state report interval | door state report interval |
| 12 | illumination auto report interval | illumination auto report interval |
| 13 | temperature report interval | temperature report interval |
| 20 | tick duration | auto-reports tick duration |
| 21 | temperature differential to report | temperature differential to report |
| 22 | min illumination differential | min illumination differential to report |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 2: Basic Set Level

Basic command to turn on the light
Setting the BASIC command value to turn on the light. The 0xFF(-1) means turn on the light. For dimmer equipment 1 to 100 means the light strength.
The following option values may be configured, in addition to values in the range 0 to 255 -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 255 | On |

The manufacturer defined default value is ```255``` (On).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: PIR Sensitivity

setting
PIR sensitivity settings. 0 means disable the PIR motion. 1 means the lowest sensitivity, 99 means the highest sensitivity. High sensitivity means can detected long distance, but if there is more noise signal in the environment, it will re-trigger too frequently.
Values in the range 0 to 99 may be set.

The manufacturer defined default value is ```80```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Light Threshold

setting
Setting the illumination threshold to turn on the light. When the event is triggered and the environment illumination is lower than the threshold, the device will turn on the light. 0 means turn off illumination detection function, and never turn on the light.

  * 1 means darkest.
  * 99 means brightest.
  * 100 means turn off illumination detection function, and always turn on the light.

Notice: In test mode, only the value in 1 to 99 will enable the illumination detection function and update the illumination value.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Operation mode

set test mode if DIP switch in customer mode
Bit1: 1 means test mode, 0 means normal mode.

Notice: This bit only effect by the DIP Switch setting to “customer mode”, otherwise it is decided by DIP Switch setting to Test or Normal Mode.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Normal mode |
| 2 | test mode |

The manufacturer defined default value is ```0``` (Normal mode).

This parameter has the configuration ID ```config_5_1_00000002``` and is of type ```INTEGER```.


### Parameter 5: disable the door/window function

Disable/Enable the function
Bit2: Disable the door/window function. (1:Disable, 0:Enable).This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | enable the door/window function |
| 1 | disable the door/window function |

The manufacturer defined default value is ```0``` (enable the door/window function).

This parameter has the configuration ID ```config_5_1_00000004``` and is of type ```INTEGER```.


### Parameter 5: temperature unit

set the temperature unit
Bit3: temperature scale. 0: Fahrenheit, 1:CelsiusThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Fahrenheit |
| 8 | Celsius |

The manufacturer defined default value is ```0``` (Fahrenheit).

This parameter has the configuration ID ```config_5_1_00000008``` and is of type ```INTEGER```.


### Parameter 5: Disable illumination reports

toggle illumination reports
Bit4: Disable the illumination report after event triggered. (1:Disable, 0:Enable)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | enable |
| 16 | disable |

The manufacturer defined default value is ```0``` (enable).

This parameter has the configuration ID ```config_5_1_00000010``` and is of type ```INTEGER```.


### Parameter 5: Disable temperature reports

Disable/enable temperature reports
Bit5: Disable the temperature report after event triggered. (1:Disable, 0:Enable)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | enable |
| 32 | disable |

The manufacturer defined default value is ```0``` (enable).

This parameter has the configuration ID ```config_5_1_00000020``` and is of type ```INTEGER```.


### Parameter 5: back key release action

Disable/enable the back key release into test mode
Bit7: Disable the back key release into test mode. (1:Disable, 0:Enable)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | enable |
| 128 | disable |

The manufacturer defined default value is ```0``` (enable).

This parameter has the configuration ID ```config_5_1_00000080``` and is of type ```INTEGER```.


### Parameter 6: magnetic integration for lighting control

switch control
Bit0: Disable magnetic integrate illumination to turn ON the lighting nodes in the association group 2.

(1:Disable, 0:Enable)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | enable |
| 1 | disable |

The manufacturer defined default value is ```0``` (enable).

This parameter has the configuration ID ```config_6_1_00000001``` and is of type ```INTEGER```.


### Parameter 6: PIR integration to control lighting

PIR integration
Bit1: Disable PIR integrate Illumination to turn ON the lighting nodes in the association group 2.  
(1:Disable, 0:Enable)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | enable |
| 2 | disable |

The manufacturer defined default value is ```0``` (enable).

This parameter has the configuration ID ```config_6_1_00000002``` and is of type ```INTEGER```.


### Parameter 6: magetic/pir integration

control lighting in association group 2
Bit2: Disable magnetic integrate PIR to turn ON the lighting nodes in the association group 2. (1:Disable, 0:Enable, default is Disable)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | enable |
| 4 | disable |

The manufacturer defined default value is ```4``` (disable).

This parameter has the configuration ID ```config_6_1_00000004``` and is of type ```INTEGER```.


### Parameter 6: device and lighting in same room

device and lighting in same room
Bit3: When Bit2 is 0 (Enable), Are the device and the lighting in the same room? 0: In the same room (Default), 1: In the different room.

Notice: If this bit is 1, it is recommended also set the Bit1 to 1, cause the PIR triggered, doesn’t mean the people in that room.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | same room |
| 8 | different rooms |

The manufacturer defined default value is ```0``` (same room).

This parameter has the configuration ID ```config_6_1_00000008``` and is of type ```INTEGER```.


### Parameter 6: disable delay to turn off the light

disable/enable delay
Bit4: Disable delay 5 seconds to turn off the light, when door/window closed. (1:Disable, 0:Enable)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | enable |
| 16 | disable |

The manufacturer defined default value is ```0``` (enable).

This parameter has the configuration ID ```config_6_1_00000010``` and is of type ```INTEGER```.


### Parameter 6: light off control

disable/enable auto turn off the light
Bit5: Disable auto turn off the light, after door/window opened to turn on the light. (1:Disable, 0:Enable)

Notice: If bit2 is zero, this setting is useless. If the configuration No.9 is zero, this setting is useless.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | enable |
| 32 | disable |

The manufacturer defined default value is ```0``` (enable).

This parameter has the configuration ID ```config_6_1_00000020``` and is of type ```INTEGER```.


### Parameter 7: motion off report

enable motion OFF report
Bit1: Enable sending motion OFF report. (0:Disable, 1:Enable)

Note: Depends on the Bit4, 0: Report Notification CC, Type: 0x07, Event: 0xFE 1: Sensor Binary Report, Type: 0x0C, Value: 0x00This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | disable |
| 2 | enable |

The manufacturer defined default value is ```0``` (disable).

This parameter has the configuration ID ```config_7_1_00000002``` and is of type ```INTEGER```.


### Parameter 7: PIR super-sensitivity

enable PIR super-sensitivity
Bit2: Enable PIR super sensitivity mode. (0:Disable, 1:Enable)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | disable |
| 4 | enable |

The manufacturer defined default value is ```4``` (enable).

This parameter has the configuration ID ```config_7_1_00000004``` and is of type ```INTEGER```.


### Parameter 7: BASIC OFF report

Disable/enable report after door closed
Bit3: Disable send out BASIC OFF after door closed. (1:Disable, 0:Enable)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | enable |
| 8 | disable |

The manufacturer defined default value is ```0``` (enable).

This parameter has the configuration ID ```config_7_1_00000008``` and is of type ```INTEGER```.


### Parameter 7: door closed report type

notification or sensor binary report
Bit4: Notification Type, 0: Using Notification Report. 1: Using Sensor Binary Report.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | notification report |
| 16 | sensor binary report |

The manufacturer defined default value is ```0``` (notification report).

This parameter has the configuration ID ```config_7_1_00000010``` and is of type ```INTEGER```.


### Parameter 7: multi CC in auto report

disable/enable multi CC in report
Bit5: Disable Multi CC in auto report. (1:Disable, 0:Enable)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | enable |
| 32 | disable |

The manufacturer defined default value is ```0``` (enable).

This parameter has the configuration ID ```config_7_1_00000020``` and is of type ```INTEGER```.


### Parameter 7: Battery state reports

disable/enable battery state reports
Bit6: Disable to report battery state when the device triggered. (1:Disable 0:Enable)This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | enable |
| 64 | disable |

The manufacturer defined default value is ```0``` (enable).

This parameter has the configuration ID ```config_7_1_00000040``` and is of type ```INTEGER```.


### Parameter 8: PIR motion re-trigger min interval

PIR motion re-trigger min interval
In normal mode, after the PIR motion detection, setting the re-detect time. 8 seconds per tick, default tick is 3 (24 seconds). Setting the suitable value to prevent sending the trigger signal too frequently. Also can save the battery energy.

Notice: If this value bigger than the configuration setting NO. 9. There is a period after the light turned off and the PIR  start detecting again.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```3```.

This parameter has the configuration ID ```config_8_1_0000007F``` and is of type ```INTEGER```.


### Parameter 9: Light on time hysteresis

time to keep the light on without motion
After turn on the lighting, setting the delay time to turn off the lighting when the PIR motion is not  
detected. 8 seconds per tick, default tick is 4 (32 seconds). 0 means never send turn off light command.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_9_1_0000007F``` and is of type ```INTEGER```.


### Parameter 10: battery level auto-report interval

battery level auto-report interval
The interval time for auto report the battery level. 0 means turn off auto report battery. The default value is 12. The tick time can be set by the configuration parameter No.20.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_10_1_0000007F``` and is of type ```INTEGER```.


### Parameter 11: door state report interval

door state report interval
The interval time for auto reporting the door/window state. 0 means turn off auto report door/window state. The default value is 12. The tick time can be set by the configuration parameter No.20.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_11_1_0000007F``` and is of type ```INTEGER```.


### Parameter 12: illumination auto report interval

illumination auto report interval
The interval time for auto report the illumination. 0 means turn off auto report illumination. The  
default value is 12. The tick time can be set by the configuration parameter No.20.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_12_1_0000007F``` and is of type ```INTEGER```.


### Parameter 13: temperature report interval

temperature report interval
The interval time for a temperature auto report. default=12, 0=no auto-report. Tick duration set by parameter 20.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```12```.

This parameter has the configuration ID ```config_13_1_0000007F``` and is of type ```INTEGER```.


### Parameter 20: tick duration

auto-reports tick duration
The interval time for auto report each tick. Setting this configuration will effect configuration  
No.10, No.11, No.12 and No.13.<br/> Caution: Setting to 0 means turn off all auto report function.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```30```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: temperature differential to report

temperature differential to report
The temperature differential to report. 0 means turn off this function. The unit is in Fahrenheit. Enable this function the device will detect every minutes. And when the temperature is over 140 degree Fahrenheit, it will continue report. Enable this functionality will cause some issue please see the detail in the “Temperature Report” sectionThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_21_1_0000007F``` and is of type ```INTEGER```.


### Parameter 22: min illumination differential

min illumination differential to report
The illumination differential to report. 0 means turn off this function. The unit is percentage. Enable this function the device will detect every minutes. Enable this functionality will cause some issue please see the detail in the “Illumination Report” section.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 63 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_22_1_0000003F``` and is of type ```INTEGER```.

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

The PSP02 supports 2 association groups.

### Group 1: Reports target.

group to send reports to

Association group 1 supports 8 nodes.

### Group 2: Basic Set target

group to send Basic Set light commands to

Association group 2 supports 8 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_BASIC_WINDOW_COVERING_V1| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V1| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SENSOR_ALARM_V1| |

### Documentation Links

* [Documentation](https://www.cd-jackson.com/zwave_device_uploads/857/ph-psm02-Zipato-Multisensor-Quad-User-Manual-v1-4.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/857).
