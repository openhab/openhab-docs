---
layout: documentation
title: 11 04 021 - ZWave
---

{% include base.html %}

# 11 04 021 Strips Drip 700 Water leak & temperature sensor
This describes the Z-Wave device *11 04 021*, manufactured by *Sensative AB* with the thing type UID of ```sensative_stripsdrip700_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![11 04 021 product image](https://opensmarthouse.org/zwavedatabase/1608/image/)


The 11 04 021 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The 11 04 021 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Strips Drip 700/800 water leak sensor also comes with temperature alerts for detecting freezing pipes, which makes it ideal for monitoring any area where a leak might occur. Drip offers a range of up to 100 meters, and with its sturdy design, these sensors can be installed in environmentally challenging areas such as in cellars or employed in outdoor environments such as under the roof where water might leak into the house structure.

  * Water-leak detection
  * Discreet mounting
  * Temperature sensor
  * Easy set up & installation
  * Long lasting battery
  * SmartStart & S2 Security
  * Z-Wave™ 700/800 extended range (up to 100 m range)

### Inclusion Information

Add Strips Drip 700/800 using classic inclusion (Non SmartStart Controllers):

  1. Open your Z-Wave™ Controller application and start pairing mode.
  2. Remove the magnets from Strips (If you have previously removed the magnets from Strips, or need to re-add the device, performing a manual wake up will join the device when the controller is in pairing mode).
  3. One long LED blink means Strips has been successfully added to your Z-Wave™ network.

To perform a manual wake up:

  1. Take the magnet, move it to the rounded edge and wait for the blink. Then move the magnet away.
  2. Repeat this 3 times. A final short blink will confirm that the user command was successful.

### Exclusion Information

Place the controller into exclude mode and perform the "wake up" pattern described in the Wakeup section.

### Wakeup Information

The 11 04 021 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


To perform a manual wake up:

  1. Take the magnet, move it to the rounded edge and wait for the blink. Then move the magnet away.
  2. Repeat this 3 times. A final short blink will confirm that the user command was successful.

### General Usage Information

https://staging.yggio.net/docs/strips/drip/

## Channels

The following table summarises the channels available for the 11 04 021 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (moisture) | sensor_moisture | sensor_moisture | Moisture | Number | 
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 
| Alarm (flood) | alarm_flood | alarm_flood | Water | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (moisture)
Indicates the current moisture level.

The ```sensor_moisture``` channel is of type ```sensor_moisture``` and supports the ```Number``` item and is in the ```Moisture``` category. This is a read only channel so will only be updated following state changes from the device.

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

### Alarm (burglar)
Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 16 configuration parameters available in the 11 04 021.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 2 | LED alarm event reporting | LED alarm event reporting |
| 4 | Temperature reporting type | Turn On or Off the temperature sensorvalue |
| 5 | Temperature reporting unit | Select the temperature unit |
| 6 | Temperature alarms | Turn On or Off the temperature alarm |
| 7 | High temperature alarm level | Select a high temperature alarm level |
| 8 | Low temperature alarm level | Select a low temperature alarm level |
| 12 | Leakage/moisture alarm | Turn the Leakage Alarm to On or Off |
| 13 | Leakage/moisture alarm level | Set the trigger level at which the Leakage Alarm Notification Report will be sent |
| 14 | Leakage/moisture reporting period | Select the number of hours between moisture reports. Report values between -100 to 100. |
| 15 | Activate supervision | Activate Supervision command for only important alarm events orall events |
| 20 | Wake-Up moisture polling workaround for Fibaro Gateway users | Turn On or Off Moisture reporting during polling (applicable only for Fibaro gateway users) |
| 23 | Perform leakage/moisture sensor calibration | Should be performed when Drip is mounted correctly and absolutely dry to calibrate the "zero-level". A MultiLevel Sensor Report with the Moisture value is sent after the calibration is performed. |
| 24 | Temperature offset | The offset value is used to calibrate the temperature reports in the actual temperature. |
| 25 | Temperature reporting period | Select the number of minutes between the temperature reports (15 minutes to 24 hours) (Used for parameter 4) |
| 26 | Temperature delta | A new temperature report is sent when the temperature has changed more than the delta value. Input value converted to one decimal place. |
| 27 | Temperature hysteresis for temperature alarms | Triggers alarm clear reports (See parameters 7&8). Input value converted to one decimal place. |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 2: LED alarm event reporting

LED alarm event reporting
Turn On or Off LED for specific event indications  
(ex. alarms)
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 4: Temperature reporting type

Turn On or Off the temperature sensorvalue
Turn On or Off the temperature sensorvalue reporting(Does not affect temperature alarms.)  
  
0: Off  


1: On. Reports the actual value when the temperature is changed according to parameter 26 since the last report or at least according to the reporting period set in the config parameter 25.

2: On. Reports the actual value periodically based on the config parameter 25.

3: On. The average temperature during the period is sent periodically during every wake up interval.
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | On\_P26\_P25 |
| 2 | On_P25 |
| 3 | On\_wake\_up |

The manufacturer defined default value is ```0``` (Off).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Temperature reporting unit

Select the temperature unit
Select the temperature unit  
  
0: Celsius  


1: Fahrenheit
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Celsius |
| 1 | Farenheit |

The manufacturer defined default value is ```0``` (Celsius).

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Temperature alarms

Turn On or Off the temperature alarm
Turn On or Off the temperature alarm
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | On |

The manufacturer defined default value is ```0``` (Off).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: High temperature alarm level

Select a high temperature alarm level
Select a high temperature alarm level: -20 to +80 (Degree C)
Values in the range -20 to 80 may be set.

The manufacturer defined default value is ```40```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Low temperature alarm level

Select a low temperature alarm level
Select a low temperature alarm level: -20 to +60 (Degree C)
Values in the range -20 to 60 may be set.

The manufacturer defined default value is ```5```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 12: Leakage/moisture alarm

Turn the Leakage Alarm to On or Off
Turn the Leakage Alarm to On or Off
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | On |

The manufacturer defined default value is ```1``` (On).

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: Leakage/moisture alarm level

Set the trigger level at which the Leakage Alarm Notification Report will be sent
Set the trigger level at which the Leakage Alarm Notification Report will be sent.  
  
1 to 100 (1: Almost Dry, 100: Wet)
Values in the range 1 to 100 may be set.

The manufacturer defined default value is ```10```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 14: Leakage/moisture reporting period

Select the number of hours between moisture reports. Report values between -100 to 100.
Select the number of hours between moisture reports. Report values between -100 to 100. 0-120 Hours (Hours between reports) Default: 0 (Off)
Values in the range 0 to 120 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_14_1``` and is of type ```INTEGER```.


### Parameter 15: Activate supervision

Activate Supervision command for only important alarm events orall events
Activate Supervision command for only important alarm events orall events.

*Supervised commands require aconfirmation from the gateway whena notification is received  
  
0: Off  


1: Alarm Report (*)

2: All Reports

*Only for alarm events (e.g. Leakage alarm)
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | Alarm_Report |
| 2 | All_Reports |

The manufacturer defined default value is ```1``` (Alarm_Report).

This parameter has the configuration ID ```config_15_1``` and is of type ```INTEGER```.


### Parameter 20: Wake-Up moisture polling workaround for Fibaro Gateway users

Turn On or Off Moisture reporting during polling (applicable only for Fibaro gateway users)
Turn On or Off Moisture reporting during polling (applicable only for Fibaro gateway users).  
  
0: Off  


1: On
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Off |
| 1 | On |

The manufacturer defined default value is ```0``` (Off).

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 23: Perform leakage/moisture sensor calibration

Should be performed when Drip is mounted correctly and absolutely dry to calibrate the "zero-level". A MultiLevel Sensor Report with the Moisture value is sent after the calibration is performed.
Should be performed when Drip is mounted correctly and absolutely dry to calibrate the "zero-level". A MultiLevel Sensor Report with the Moisture value is sent after the calibration is performed.

0: Device resets to this value after performing capacitance calibration and sends a report with value 0 to the gateway (as recommended by Z-Wave Specifications.)

1: Perform Calibration
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | reset_0 |
| 1 | calibrate |

The manufacturer defined default value is ```0``` (reset_0).

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 24: Temperature offset

The offset value is used to calibrate the temperature reports in the actual temperature.
The offset value is used to calibrate the temperature reports in the actual temperature.

-100 to 100 [=-10.0 to +10.0 (Degree C)]
Values in the range -100 to 100 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Temperature reporting period

Select the number of minutes between the temperature reports (15 minutes to 24 hours) (Used for parameter 4)
Select the number of minutes between the temperature reports (15 minutes to 24 hours) (Used for parameter 4)

15-1440 (minutes between reports)
Values in the range 15 to 1440 may be set.

The manufacturer defined default value is ```1440```.

This parameter has the configuration ID ```config_25_2``` and is of type ```INTEGER```.


### Parameter 26: Temperature delta

A new temperature report is sent when the temperature has changed more than the delta value. Input value converted to one decimal place.
A new temperature report is sent when the temperature has changed more than the delta value. Input value converted to one decimal place.

5 to 100 [=0.5 to 10.0 (Degree C)]
Values in the range 5 to 100 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_26_1``` and is of type ```INTEGER```.


### Parameter 27: Temperature hysteresis for temperature alarms

Triggers alarm clear reports (See parameters 7&8). Input value converted to one decimal place.
Triggers alarm clear reports (See parameters 7&8). Input value converted to one decimal place.

5 to 100 [=0.5 to 10.0 (Degree C)]
Values in the range 5 to 100 may be set.

The manufacturer defined default value is ```20```.

This parameter has the configuration ID ```config_27_1``` and is of type ```INTEGER```.

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

The 11 04 021 supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Strips supports association group 1 (Lifeline), max 1  
node, normally used to send Strips' notification to the  
Z-Wave Controller

Association group 1 supports 1 node.

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

* [Strips Drip 700 manual](https://opensmarthouse.org/zwavedatabase/1608/reference/Strips_Drip_700_manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1608).
