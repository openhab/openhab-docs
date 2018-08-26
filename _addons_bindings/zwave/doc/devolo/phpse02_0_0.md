---
layout: documentation
title: ph-pse02 - ZWave
---

{% include base.html %}

# ph-pse02 Multisound indoor siren (Zipato/Devolo)
This describes the Z-Wave device *ph-pse02*, manufactured by *Devolo* with the thing type UID of ```devolo_phpse02_00_000```.

The device is in the category of *Siren*, defining Siren used by Alarm systems.

![ph-pse02 product image](https://www.cd-jackson.com/zwave_device_uploads/453/453_default.jpg)


The ph-pse02 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

**\### NOTE ###**

The XML used for adding this device to the database comes from the Devolo Home Control Alarmsiren (http://www.devolo.de/article/devolo-home-control-alarmsirene/). But it seems to be made by Zipato (https://www.zipato.com/product/multisound-indoor-siren).  
  
**\### FEATURES ###**  
  
\- Indoor multichannel siren that works with a a variety of Z-Wave networks/controllers, regardless of the manufacturer  
\- The new Z-Wave 500 series chip supports multichannel operationand higher data rates (9.6/40/100kbps)  
\- 110db sound level  
\- 6 sounds: Door Chime, Bi Bi Arm/Disarm, Intruder alarm, Ambulance, Police car  
\- Higher output power enhances communication range(+6dBm output power as compared to -2.5dBm 300 series)  
\- DC or Li-ion battery power (over 24 hours of battery life)  
\- Battery overcharge protection  
\- Very low power consumption  
\- Over-the-air firmware update  
\- Easy to install in EU/China/Taiwan wall sockets  
\- Tamperproof protection  
  
  
**\### TECHNICAL SPECIFICATIONS ###**  
  
PROTOCOL: Z-Wave Plus  
  
POWER  
\- DC 5V, Li-Ion battery (optional)  
\- BATTERY CAPACITY 1150mAh  
  
OPERATING CONDITIONS:  
\- OPERATING VOLTAGE 3.7V  
\- OPERATING CURRENT 150 mA  
\- OPERATION TEMPERATURE -10°C ~ 40°C  
  
RANGE  
\- Minimum 30 meters indoor  
\- 70 meters outdoor (meant for indoor use only)  
  
DIMENSIONS  
\- DEVICE DIMENSIONS 110 x 110 x 22 mm  
\- DEVICE WEIGHT 113g  
\- PACKAGE DIMENSIONS 117 x 50 x 117 mm  
\- PACKAGE WEIGHT 217g  
  
FREQUENCY  
  
 ph-pse02.au 921.42 MHz (AU)  
 ph-pse02.eu 868.42 MHz (EU)  
 ph-pse02.in 865.20 MHz (IN)  
 ph-pse02.is 916.02 MHz (IS)  
 ph-pse02.ru 869.02 MHz (RU)  
 ph-pse02.us 908.42 MHz (US)  
  
Source: https://www.zipato.com/product/multisound-indoor-siren

## Channels

The following table summarises the channels available for the ph-pse02 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 
| Alarm (general) | alarm_general | Door | Switch | 
| Start Sound | notification_send |  | Number | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Binary Sensor

Indicates if a sensor has triggered.

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (burglar)

Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (general)

Indicates if an alarm is triggered.

The ```alarm_general``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Start Sound

Notification

Event

Sound

 event1 Smokealarm (0x01)

0x01 ~ 0xFF

fire alert

 event2 Accesscontrol (0x06)

Window/Door open (0x16)

door chime

 event7 Accesscontrol (0x06)

Activate alarm system (0x03)

2x beep

 event8 Accesscontrol (0x06)

Deactivate alarm system (0x04)

1x beep

 event3 Homesecurity (0x07)

0x01 ~ 0xFF

emergency

 sound event4 Emergency (0x0A)

Contact police (0x01)

policecar

sound

 event5 Emergency (0x0A)

Contact fire department (0x02)

fire engine sound

 event6 Emergency (0x0A)

Contact ambulance (0x03)

ambulance

sound

 event9 Emergency (0x0A) Notification (0xFE)

silent alarm (no sound, flashing LED)

Sends a notification.

The ```notification_send``` channel supports the ```Number``` item.



## Device Configuration

The following table provides a summary of the 3 configuration parameters available in the ph-pse02.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 7 | Costumer  Function | NotificationReport/BinaryReport |
| 29 | Disable Alarm | Disable the alarm function. |
| 31 | Alarm Duration | Play alarm sound duration. |

### Parameter 7: Costumer  Function

NotificationReport/BinaryReport
Notification Type,

0: Using Notification Report.

1: Using Sensor Binary Report.This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```4```.

This parameter has the configuration ID ```config_7_4``` and is of type ```INTEGER```.


### Parameter 29: Disable Alarm

Disable the alarm function.
Disable the alarm function.

1: Disable Alarm,

0: Enable Alarm.

Caution: After the power up, this configuration is always 0.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_29_4``` and is of type ```INTEGER```.


### Parameter 31: Alarm Duration

Play alarm sound duration.
Play alarm sound duration, 1 tick is 30 seconds.

Default is 3 minutes, maximum is 63.5 minutes.

0 means never auto stop.
Values in the range 0 to 127 may be set.

The manufacturer defined default value is ```6```.

This parameter has the configuration ID ```config_31_4_0000000C``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The ph-pse02 supports 1 association group.

### Group 1: Report Message

Report Message, e.g. tamper alarm
This group supports 8 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_MULTILEVEL_V0| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Quick Installation Guide V1.2](https://www.cd-jackson.com/zwave_device_uploads/453/ph-pse02-Zipato-Siren-User-Manual-v1-2.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/453).
