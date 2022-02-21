---
layout: documentation
title: Aeotec Multisensor 7 - ZWave
---

{% include base.html %}

# Aeotec Multisensor 7 Multisensor
This describes the Z-Wave device *Aeotec Multisensor 7*, manufactured by *Aeotec Limited* with the thing type UID of ```aeotec_multisensor7_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![Aeotec Multisensor 7 product image](https://opensmarthouse.org/zwavedatabase/1444/image/)


The Aeotec Multisensor 7 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Aeotec MultiSensor 7 was developed to detect ambient values and movement and to transmit them with Z-Wave Plus. It is powered by Aeotec’s Gen7 technology.

### Inclusion Information

  1. Power on the device, the power led will blink blue slowly.
  2. Let the Primary Controller into inclusion mode (If you don’t know how to do this, refer to its manual)
  3. Press the action button one time, when the yellow led on release the button. It indicates the device has enter learn mode.
  4. If added successful, the power led will flash (white -> green -> white -> green at a rate of 250ms per each color) for 2 seconds

### Exclusion Information

  1. Power on the device.
  2. Let the Primary Controller into exclusion mode (If you don’t know how to do this refer to its manual)
  3. Press the action button one time, when the purple led on release the button. It indicates the device has enter learn mode.
  4. If removed successful, the blue led will blink slowly.

### General Usage Information



## Channels

The following table summarises the channels available for the Aeotec Multisensor 7 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Sensor (luminance) | sensor_luminance | sensor_luminance |  | Number | 
| Sensor (ultraviolet) | sensor_ultraviolet | sensor_ultraviolet |  | Number | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (relative humidity) | sensor_relhumidity | sensor_relhumidity | Humidity | Number | 
| Alarm (system) | alarm_system | alarm_system |  | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
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

### Sensor (luminance)
Indicates the current light reading.

The ```sensor_luminance``` channel is of type ```sensor_luminance``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (ultraviolet)
Indicates the current ultraviolet level.

The ```sensor_ultraviolet``` channel is of type ```sensor_ultraviolet``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (relative humidity)
Indicates the current relative humidity.

The ```sensor_relhumidity``` channel is of type ```sensor_relhumidity``` and supports the ```Number``` item and is in the ```Humidity``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (system)
Indicates if a system alarm is triggered.

The ```alarm_system``` channel is of type ```alarm_system``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

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

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 63 configuration parameters available in the Aeotec Multisensor 7.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Beaming Mode | Beaming Mode |
| 2 | Motion Retrigger Time | Motion Retrigger Time |
| 3 | Motion Untrigger Time | Motion Untrigger Time |
| 4 | Motion Sensitivity | Motion Sensitivity |
| 5 | Motion Report Type | Motion Report Type |
| 6 | Vibration Sensor Enable/Disable | Vibration Sensor Enable/Disable |
| 7 | Vibration Intensity Reports | Vibration Intensity Reports |
| 9 | Wakeup CC Timeout | Wakeup CC Timeout |
| 10 | Power Status | Power Status |
| 11 | Motion Group Control (Group2) | Motion Group Control (Group2) |
| 12 | Motion Group Value Setting | Motion Group Value Setting |
| 13 | Motion Group Control Requirement | Motion Group Control Requirement |
| 14 | Over Humidity Group Threshold (Group5) | Over Humidity Group Threshold (Group5) |
| 15 | Under Humidity Group Threshold (Group6) | Under Humidity Group Threshold (Group6) |
| 16 | Over Heat Group Threshold (Group3) | Over Heat Group Threshold (Group3) |
| 17 | Under Heat Group Threshold (Group4) | Under Heat Group Threshold (Group4) |
| 18 | Over Light Group Threshold (Group7) | Over Light Group Threshold (Group7) |
| 19 | Under Light Group Threshold (Group8) | Under Light Group Threshold (Group8) |
| 20 | Over UV Group Threshold (Group9) | Over UV Group Threshold (Group9) |
| 21 | Under UV Group Threshold (Group10) | Under UV Group Threshold (Group10) |
| 39 | Low Battery Threshold | Low Battery Threshold |
| 40 | Threshold Check Enable/Disable | Threshold Check Enable/Disable |
| 41 | Temperature Threshold | Temperature Threshold |
| 42 | Humidity Threshold | Humidity Threshold |
| 43 | Lux Threshold | Lux Threshold |
| 44 | UV Threshold | UV Threshold |
| 45 | Threshold Check Time | Threshold Check Time |
| 46 | Low Temperature Report | Low Temperature Report |
| 48 | Sensor Limit Control | Sensor Limit Control |
| 49 | Temperature Upper Limit | Temperature Upper Limit |
| 50 | Temperature Lower Limit | Temperature Lower Limit |
| 51 | Temperature Recover Limit | Temperature Recover Limit |
| 51 | Humidity Upper Limit | Humidity Upper Limit |
| 53 | Humidity Lower Limit | Humidity Lower Limit |
| 54 | Humidity Recover Limit | Humidity Recover Limit |
| 55 | Lux Upper Limit | Lux Upper Limit |
| 56 | Lux Lower Limit | Lux Lower Limit |
| 57 | Lux Recover Limit | Lux Recover Limit |
| 58 | UV Upper Limit | UV Upper Limit |
| 59 | UV Lower Limit | UV Lower Limit |
| 60 | UV Recover Limit | UV Recover Limit |
| 61 | Out-of-limit State | Out-of-limit State |
| 64 | Temperature Scale | Temperature Scale |
| 81 | LED Activity | LED Activity |
| 82 | Motion Sensor Report Indicator | Motion Sensor Report Indicator |
| 83 | Temperature Sensor Report Indicator | Temperature Sensor Report Indicator |
| 84 | Humidity Sensor Report Indicator | Humidity Sensor Report Indicator |
| 85 | Lux Sensor Report Indicator | Lux Sensor Report Indicator |
| 86 | UV Sensor Report Indicator | UV Sensor Report Indicator |
| 87 | Vibration Sensor Report Indicator | Vibration Sensor Report Indicator |
| 88 | Battery Report Indicator | Battery Report Indicator |
| 89 | Wakeup Report Indicator | Wakeup Report Indicator |
| 90 | Communication Indicator | Communication Indicator |
| 101 | Automatic Report Checklist 1 | Automatic Report Checklist 1 |
| 102 | Automatic Report Checklist 2 | Automatic Report Checklist 2 |
| 103 | Automatic Report Checklist 3 | Automatic Report Checklist 3 |
| 111 | Automatic Checklist 1 Interval Time | Automatic Checklist 1 Interval Time |
| 112 | Automatic Checklist 2 Interval Time | Automatic Checklist 2 Interval Time |
| 113 | Automatic Checklist 3 Interval Time | Automatic Checklist 3 Interval Time |
| 201 | Temperature Offset Value | Temperature Offset Value |
| 202 | Humidity Offset Value | Humidity Offset Value |
| 203 | Lux Offset Value | Lux Offset Value |
| 204 | UV Offset Value | UV Offset Value |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Beaming Mode

Beaming Mode
Used to enable/disable beaming. If set to 1, FLiR commands will be supported and device type will be LSS. But the device must be re-included into the network to activate it.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Motion Retrigger Time

Motion Retrigger Time
Presence re-detection time set in second to allow motion sensor to reset timeout of motion sensor. In this time, the motion sensor can not be triggered again. If this value reach zero, the timeout configuration value set by Parameter 3 will be reset.

0 – disable

1~30 - 30 seconds

30 ~ 3600 - timeout set in seconds
Values in the range 0 to 3600 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_2``` and is of type ```INTEGER```.


### Parameter 3: Motion Untrigger Time

Motion Untrigger Time
Timeout configuration set in second for motion sensor to send no trigger status.
Values in the range 30 to 3600 may be set.

The manufacturer defined default value is ```240```.

This parameter has the configuration ID ```config_3_2``` and is of type ```INTEGER```.


### Parameter 4: Motion Sensitivity

Motion Sensitivity
Set the sensitivity of motion sensor.

0 - disable

1 - minimum sensitivity

11 - maximum sensitivity
Values in the range 0 to 11 may be set.

The manufacturer defined default value is ```11```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Motion Report Type

Motion Report Type
Set which command class will be sent when motion sensor is triggered or detriggered.

0 - Sends Notification Report

1 - Sends Sensor Binary Report

2 - Sends Notification and Sensor Binary Report
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```2```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Vibration Sensor Enable/Disable

Vibration Sensor Enable/Disable
Used to enable/disable vibration sensor.

0 - disable vibration

1~254 - timeout set in minutes to reset vibration status

255 - only send vibration triggered, does not timeout
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_6_0``` and is of type ```INTEGER```.


### Parameter 7: Vibration Intensity Reports

Vibration Intensity Reports
Used to enable/disable vibration intensity reports. If set to 1, vibration intensity will be sent to gateway when

triggered. If set to 0, do not report.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 9: Wakeup CC Timeout

Wakeup CC Timeout
Timeout set in seconds after Wakeup CC is send out before go to sleep. If role type is RSS, the minimum value will

be 10. If role type is LSS, the minimum value will be 2. If wakeup no more information received, return to sleep

mode immediately.
Values in the range 2 to 255 may be set.

The manufacturer defined default value is ```15```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.


### Parameter 10: Power Status

Power Status
This value is Readonly. Used to report the power status (USB or Battery powered)

0 - When battery powered, the device will act as RSS.

1 - When USB cable insert, the device will act as AOS.

The device must be re-included in the network to change the role type.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_10_0``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 11: Motion Group Control (Group2)

Motion Group Control (Group2)
Set control of other devices on group2 based on motion trigger

0 - Send BASIC_SET (0xFF) when motion is triggered to associated device

Send BASIC_SET (0x00) when motion is untriggered to associated device

1 - Send BASIC_SET (0x00) when motion is triggered

Send BASIC_SET (0xFF) when motion is untriggered

2 - Send BASIC_SET (0xFF) when motion is triggered, Nothing when motion untriggered.

3 - Send BASIC_SET (0x00) when motion is triggered, Nothing when motion untriggered.

4 - Send BASIC_SET (0x00) when motion is untriggered, Nothing when motion triggered.

5 - Send BASIC_SET (0xFF) when motion is untriggered, Nothing when motion triggered.

6 - Send BASIC_SET (value is configured by parameter 12) when motion is triggered to associated devices.

Send BASIC_SET (value is configured by parameter 12) when motion is untriggered.
Values in the range 0 to 6 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: Motion Group Value Setting

Motion Group Value Setting
Set Basic Set value for Group2. The MSB will act as the basic set value when motion trigger. The LSB will act as the

basic set value when motion untrigger. E.g. value=0x0A00, then BASIC_SET(0x0A) will be sent when motion trigger,

BASIC_SET(0x00) will be sent when motion untrigger.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```65280```.

This parameter has the configuration ID ```config_12_2``` and is of type ```INTEGER```.


### Parameter 13: Motion Group Control Requirement

Motion Group Control Requirement
Set threshold of Light/Lux when devices associated in group2 should be triggered by motion. Associated device only

receive BASIC_SET command when light <= (this value).
Values in the range 0 to 30000 may be set.

The manufacturer defined default value is ```30000```.

This parameter has the configuration ID ```config_13_2``` and is of type ```INTEGER```.


### Parameter 14: Over Humidity Group Threshold (Group5)

Over Humidity Group Threshold (Group5)
Set threshold of humidity. If measured humidity >= (this value), send BASIC_SET (0xFF) to associated devices

through group5. If measured humidity < (this value) send BASIC_SET (0x00) to associated devices through group5.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Under Humidity Group Threshold (Group6)

Under Humidity Group Threshold (Group6)
Set threshold of humidity. If measure humidity <= (this value) send BASIC_SET (0xFF) to associated devices through

group6. If measured humidity > (this value) send BASIC_SET (0x00) to associated devices through group6.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```40```.

This parameter has the configuration ID ```config_15_0``` and is of type ```INTEGER```.


### Parameter 16: Over Heat Group Threshold (Group3)

Over Heat Group Threshold (Group3)
Set threshold of temperature. Designed to control Air Conditioners or temperature controllers ON or OFF. If

measured temperature >= (this value, Scale is determined by Param64) send BASIC_SET (0xFF) to associated devices.

If measured temperature < (this value) send BASIC_SET (0x00) to associated devices. E.g. Value 239 means 23.9 C.

Value 750 means 75.0 F.

Value Range (EU/AU) : 400~850  


Value Range (US) : 400~1850

Default Value  (EU/AU) : 239  


Default Value (US) :750
Values in the range 400 to 1850 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_16_2``` and is of type ```INTEGER```.


### Parameter 17: Under Heat Group Threshold (Group4)

Under Heat Group Threshold (Group4)
Set threshold of temperature. Designed to control Air Conditioners or temperature controllers ON or OFF. If

measured temperature <= (this value, Scale is determined by Param64) send BASIC_SET (0xFF) to associated devices.

If measured temperature > (this value) send BASIC_SET (0x00) to associated devices. E.g. Value 155 means 15.5 C.

Value 600 means 60.0 F.

Value Range (EU/AU) : 400~850

Value Range (US) : 400~1850

Default Value (EU/AU) : 155

Default Value (US) : 600
Values in the range 400 to 1850 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_17_2``` and is of type ```INTEGER```.


### Parameter 18: Over Light Group Threshold (Group7)

Over Light Group Threshold (Group7)
Set threshold of Light/Lux. If measured light/lux >= (this value) send BASIC_SET (0xFF) to associated devices. If

measured light/lux < (this value) send BASIC_SET (0x00) to associated devices.
Values in the range 0 to 30000 may be set.

The manufacturer defined default value is ```2000```.

This parameter has the configuration ID ```config_18_2``` and is of type ```INTEGER```.


### Parameter 19: Under Light Group Threshold (Group8)

Under Light Group Threshold (Group8)
Set threshold of Light/Lux. If measured light/lux <= (this value) send BASIC_SET (0xFF) to associated devices. If

measured light/lux > (this value) send BASIC_SET (0x00) to associated devices.
Values in the range 0 to 30000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: Over UV Group Threshold (Group9)

Over UV Group Threshold (Group9)
Set threshold of UV. If measured UV >= (this value) send BASIC_SET (0xFF) to associated devices. If measured UV <

(this value) send BASIC_SET (0x00) to associated devices.
Values in the range 0 to 11 may be set.

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 21: Under UV Group Threshold (Group10)

Under UV Group Threshold (Group10)
Set threshold of UV. If measured UV <= (this value) send BASIC_SET (0xFF) to associated devices. If measured UV >

(this value) send BASIC_SET (0x00 to associated devices.)
Values in the range 0 to 11 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_21_1``` and is of type ```INTEGER```.


### Parameter 39: Low Battery Threshold

Low Battery Threshold
Configure low battery report threshold, sends low battery report via notification and battery report when battery

level drops under setting. Unit %.
Values in the range 10 to 90 may be set.

The manufacturer defined default value is ```50```.

This parameter has the configuration ID ```config_39_1``` and is of type ```INTEGER```.


### Parameter 40: Threshold Check Enable/Disable

Threshold Check Enable/Disable
Enable/Disable threshold reporting, check time can be adjusted by Param45.

0 - disable all threshold reports

1 - enable all threshold reports
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 41: Temperature Threshold

Temperature Threshold
Threshold = (Value * 0.1) Scale is determined by Param64. 0 = disable.
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 42: Humidity Threshold

Humidity Threshold
Humidity range = 1% to 50%, 0 = disable.
Values in the range 0 to 50 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_42_1``` and is of type ```INTEGER```.


### Parameter 43: Lux Threshold

Lux Threshold
0 = disable.
Values in the range 0 to 10000 may be set.

The manufacturer defined default value is ```250```.

This parameter has the configuration ID ```config_43_2``` and is of type ```INTEGER```.


### Parameter 44: UV Threshold

UV Threshold
0 = disable.
Values in the range 0 to 11 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_44_1``` and is of type ```INTEGER```.


### Parameter 45: Threshold Check Time

Threshold Check Time
Set threshold check time in seconds if threshold is enable via Parameter 40.

1~65535 - When USB powered

60~65535 - When Battery powered
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_45_2``` and is of type ```INTEGER```.


### Parameter 46: Low Temperature Report

Low Temperature Report
Eable/Disable alarm report for low temperature(<= -15 C) Multilevel CC temperature report will be sent to gateway.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_46_1``` and is of type ```INTEGER```.


### Parameter 48: Sensor Limit Control

Sensor Limit Control
This value is bit mask. Used to enable/disable measurement reports for various sensors that is more than the upper

limit value or less than the lower limit value.

0 - Disabled

1 - Temperature upper level

2 - Humidity upper level

4 - Lux upper level

8 - UV upper level

16 - Temperature lower level

32 - Humidity lower level

64 - Lux lower level

128 - UV lower level
Values in the range 0 to 256 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_48_0_00000100``` and is of type ```INTEGER```.


### Parameter 49: Temperature Upper Limit

Temperature Upper Limit
Set upper limit level for temperature set in scale of 0.1. Scale is determined by Param64. If (Current measurement) >

(Upper Limit), then report sensor.

Value Range (EU/AU) : 400~1000

Value Range (US) : 400~21200

Default value (EU/AU) : 280

Default value (US) : 824
Values in the range -400 to 2120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_49_2``` and is of type ```INTEGER```.


### Parameter 50: Temperature Lower Limit

Temperature Lower Limit
Set lower limit level for temperature set in scale of 0.1. Scale is determined by Param64. If (Current Measurement) <

(Lower limit), then report sensor.

Value Range (EU/AU) : 400~1000  


Value Range (US) :  400~2120  


Default Value (EU/AU) : 0  


Default Value (US) : 320
Values in the range -400 to 2120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_50_2``` and is of type ```INTEGER```.


### Parameter 51: Temperature Recover Limit

Temperature Recover Limit
Temperature recover limit set in scale of 0.1. Scale is determined by Param64. If (Current measurement) <= (upper

limit - recover limit), then temperature report. If (Current measurement) >= (lower limit + recover limit), then

temperature report.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 51: Humidity Upper Limit

Humidity Upper Limit
Set humidity upper limit level.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```60```.

This parameter has the configuration ID ```config_51_1``` and is of type ```INTEGER```.


### Parameter 53: Humidity Lower Limit

Humidity Lower Limit
Set humidity lower limit level.
Values in the range 0 to 100 may be set.

The manufacturer defined default value is ```40```.

This parameter has the configuration ID ```config_53_1``` and is of type ```INTEGER```.


### Parameter 54: Humidity Recover Limit

Humidity Recover Limit
Set humidity recover limit level. Refer to Param 51.
Values in the range 1 to 50 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_54_1``` and is of type ```INTEGER```.


### Parameter 55: Lux Upper Limit

Lux Upper Limit
Set lux upper limit level.
Values in the range 0 to 30000 may be set.

The manufacturer defined default value is ```1000```.

This parameter has the configuration ID ```config_55_2``` and is of type ```INTEGER```.


### Parameter 56: Lux Lower Limit

Lux Lower Limit
Set lux lower limit level.
Values in the range 0 to 30000 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_56_2``` and is of type ```INTEGER```.


### Parameter 57: Lux Recover Limit

Lux Recover Limit
Set lux recover limit level. Refer to Parameter  51.
Values in the range 1 to 255 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_57_1``` and is of type ```INTEGER```.


### Parameter 58: UV Upper Limit

UV Upper Limit
Set UV upper limit level.
Values in the range 1 to 11 may be set.

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_58_1``` and is of type ```INTEGER```.


### Parameter 59: UV Lower Limit

UV Lower Limit
Set UV lower limit level.
Values in the range 1 to 11 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_59_1``` and is of type ```INTEGER```.


### Parameter 60: UV Recover Limit

UV Recover Limit
Set UV recover limit level. Refer to Parameter 51.
Values in the range 1 to 5 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_60_1``` and is of type ```INTEGER```.


### Parameter 61: Out-of-limit State

Out-of-limit State
This is read only and bit mask. Out of the limit state of sensors.

Bit Mask:

0 - within limit

1 - out of limit

Value:

1 - Temperature upper level

2 - Humidity upper level

4 - Lux upper level

8 - UV upper level

16 - Temperature lower level

32 - Humidity lower level

64 - Lux lower level

128 - UV lower level
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_61_1_00000100``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 64: Temperature Scale

Temperature Scale
Set the scale for temperature when reports.

0 - Celsius

1 - Fahrenheit

Default Value (EU/AU) : 0  


Default Value (US) : 1
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Celsius |
| 1 | Fahrenheit |

The manufacturer defined default value is ```0``` (Celsius).

This parameter has the configuration ID ```config_64_1``` and is of type ```INTEGER```.


### Parameter 81: LED Activity

LED Activity
Allow user to enable/disable LED activity of specific reports sent by sensor. Button press indicator is not affected by this.

0 - disable

1 - enable
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_81_1``` and is of type ```INTEGER```.


### Parameter 82: Motion Sensor Report Indicator

Motion Sensor Report Indicator
If LED is enabled by Param81, allow user to change the report color of motion sensor.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_82_1``` and is of type ```INTEGER```.


### Parameter 83: Temperature Sensor Report Indicator

Temperature Sensor Report Indicator
If LED is enabled by Parameter 81, allow user to change the report color of temperature sensor.
Values in the range 0 to 9 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_83_1``` and is of type ```INTEGER```.


### Parameter 84: Humidity Sensor Report Indicator

Humidity Sensor Report Indicator
If LED is enabled by Param81, allow user to change the report color of humidity sensor.
Values in the range 0 to 9 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_84_1``` and is of type ```INTEGER```.


### Parameter 85: Lux Sensor Report Indicator

Lux Sensor Report Indicator
If LED is enabled by Param81, allow user to change the report color of Lux sensor.
Values in the range 0 to 9 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_85_1``` and is of type ```INTEGER```.


### Parameter 86: UV Sensor Report Indicator

UV Sensor Report Indicator
If LED is enabled by Param81, allow user to change the report color of UV sensor.
Values in the range 0 to 9 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_86_1``` and is of type ```INTEGER```.


### Parameter 87: Vibration Sensor Report Indicator

Vibration Sensor Report Indicator
If LED is enabled by Param81, allow user to change the report color of vibration sensor.
Values in the range 0 to 9 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_87_1``` and is of type ```INTEGER```.


### Parameter 88: Battery Report Indicator

Battery Report Indicator
If LED is enabled by Param81, allow user to change the report color of battery.
Values in the range 0 to 9 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_88_1``` and is of type ```INTEGER```.


### Parameter 89: Wakeup Report Indicator

Wakeup Report Indicator
If LED is enabled by Parameter 81, allow user to change the report color of wakeup.
Values in the range 0 to 9 may be set.

The manufacturer defined default value is ```8```.

This parameter has the configuration ID ```config_89_1``` and is of type ```INTEGER```.


### Parameter 90: Communication Indicator

Communication Indicator
If LED is enabled by Parameter 81, allow user to change indicator color when receiving communication from gateway or other devices.
Values in the range 0 to 9 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_90_1``` and is of type ```INTEGER```.


### Parameter 101: Automatic Report Checklist 1

Automatic Report Checklist 1
Checklist 1 for automatic timed report. When the corresponding item is selected, it will be checked when timeout setting by Parameter 111.

0 - Disabled

1 - Battery

16 - UV

32 - Temperature

64 - Humidity

128 - Lux

Default 241 = 1 + 16 + 32 + 64 + 128, means all enable.
Values in the range 0 to 241 may be set.

The manufacturer defined default value is ```241```.

This parameter has the configuration ID ```config_101_1``` and is of type ```INTEGER```.


### Parameter 102: Automatic Report Checklist 2

Automatic Report Checklist 2
Checklist 2 for automatic timed report. When the corresponding item is selected, it will be checked when timeout setting by Parameter 112.

0 - Disabled

1 - Battery

16 - UV

32 - Temperature

64 - Humidity

128 - Lux

Max value 241 = 1 + 16 + 32 + 64 + 128, means all enable.
Values in the range 0 to 241 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_102_1``` and is of type ```INTEGER```.


### Parameter 103: Automatic Report Checklist 3

Automatic Report Checklist 3
Checklist 3 for automatic timed report. When the corresponding item is selected, it will be checked when timeout setting by Parameter 113.

0 - Disabled

1 - Battery

16 - UV

32 - Temperature

64 - Humidity

128 - Lux

Max value 241 = 1 + 16 + 32 + 64 + 128, means all enable.
Values in the range 0 to 241 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_103_1``` and is of type ```INTEGER```.


### Parameter 111: Automatic Checklist 1 Interval Time

Automatic Checklist 1 Interval Time
Interval time set in seconds to check the checklist1’s items. Multilevel Sensor Report will be sent when timeout.
Values in the range 30 to 65535 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_111_2``` and is of type ```INTEGER```.


### Parameter 112: Automatic Checklist 2 Interval Time

Automatic Checklist 2 Interval Time
Interval time set in seconds to check the checklist2’s items. Multilevel Sensor Report will be sent when timeout.
Values in the range 30 to 65535 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_112_2``` and is of type ```INTEGER```.


### Parameter 113: Automatic Checklist 3 Interval Time

Automatic Checklist 3 Interval Time
Interval time set in seconds to check the checklist3’s items. Multilevel Sensor Report will be sent when timeout.
Values in the range 30 to 65535 may be set.

The manufacturer defined default value is ```3600```.

This parameter has the configuration ID ```config_113_2``` and is of type ```INTEGER```.


### Parameter 201: Temperature Offset Value

Temperature Offset Value
Can add or minus this setting value to calibrate temperature when checked. Scale is defined by Param64. e.g. Value

15 means 1.5C or 1.5F.
Values in the range -200 to 200 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_201_1``` and is of type ```INTEGER```.


### Parameter 202: Humidity Offset Value

Humidity Offset Value
Can add or minus this setting value to calibrate humidity when checked. Unit: %.
Values in the range -100 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_202_1``` and is of type ```INTEGER```.


### Parameter 203: Lux Offset Value

Lux Offset Value
Can add or minus this setting value to calibrate Lux when checked.
Values in the range -10000 to 10000 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_203_2``` and is of type ```INTEGER```.


### Parameter 204: UV Offset Value

UV Offset Value
Can add or minus this setting value to calibrate UV when checked.
Values in the range -10 to 10 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_204_1``` and is of type ```INTEGER```.

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
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Device Manual](https://opensmarthouse.org/zwavedatabase/1444/reference/ES_-_MultiSensor_7.pdf)
* [Device Manual](https://opensmarthouse.org/zwavedatabase/1444/reference/Multisensor_7.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1444).
