---
layout: documentation
title: HM-HS1WL-Z - ZWave
---

{% include base.html %}

# HM-HS1WL-Z Smart Water Leakage Sensor
This describes the Z-Wave device *HM-HS1WL-Z*, manufactured by *[Zipato](http://www.zipato.com/)* with the thing type UID of ```zipato_hmhs1wlz_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![HM-HS1WL-Z product image](https://www.cd-jackson.com/zwave_device_uploads/800/800_default.jpg)


The HM-HS1WL-Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The HM-HS1WL-Z does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

INTRODUCTION

Smart Water Leakage sensor adopts Z-Wave wireless module. Super low power consumption circuit design ensures the long battery lifespan. Separate design of body and sensor efficiently prevents the influence resulted from high humidity. High precision and sensitivity applicable for basement, machine room, hotel, water tower, pool, swimming pool, solar, kitchen, bathroom and other places may have water leakage or water overflow.

SPECIFICATION

Working voltage: DC3V (2 x AAA battery)   
Static current: 5uA   
Alarm current: 35mA   
Networking: Z-Wave  
 Wireless networking distance: 70 (open area)   
Working temperature: -10°C~+50°C  
 Working humidity: max 95%RH  
 Body dimensions: 76 x 36.6 x 16.5 mm   
Sensor dimensions: 28.3 x 26.5 x 12.2 mm

WARNINGS   
1\. Install water leakage sensor at areas where it may leak.   
2\. Don’t install water leakage sensor at position of rainwater, lampblack, water vapor, etc.   
3\. Don’t install water leakage sensor at water immersed position.

ASSOCIATION & ASSOCIATION GROUP INFORMATION   
\- Lifeline between controller and Water Leak Sensor   
\- Supported command classes Battery report, Notification report, and Device Reset Locally notification, Binary report.

\- Association Group description   
  
• Association group 1: Lifeline association group   
\- Maximum supported nodes are   
1\. Include command classes: Battery report, Notification report, and Device Reset Locally notification, Binary report.   
  
• Association group 2: Root Device group (Binary Sensor)   
\- Maximum supported nodes are 5.   
1-Binary Sensor Command Class: Compatible with 300 series   
2-Binary Sensor reports status of water or no water via Lifeline.   
3-When the sensor detects status change between water and no water, the device will be triggered.

• Association group 3: Root Device group (Binary Sensor)   
\- Maximum supported nodes are 5.   
\- Binary Sensor Command Class:Compatible with 300 series   
1-Binary Sensor reports the removed status of water sensor.   
2-When the sensor detects status change of tamper, the device will be triggered.   
  
• Association group 4: Root Device group (Notification)   
\- Maximum supported nodes are 5.   
1-Notification reports reports status of detect water or no water via Lifeline.   
2-When the sensor detects status change between water and no water, the device will be triggered.   
  
• Association group 5: Root Device group (Notification)   
\- Maximum supported nodes are 5.   
1-Binary Sensor reports the removed status of water sensor   
1-When the sensor detects status change of tamper, the device will be triggered.

4-Association & Association Group Information   
\- Lifeline between controller and the product   
\- Supported command classes: Battery report, multilevel sensor, and Device Reset Locally notification.

### Inclusion Information

INSTALLATION STEP 1:   
Remove battery insulation film to power it on

INSTALLATION STEP 2:   
1\. DEVICE INCLUSION   
\- Click \[Add\] icon in Z-Wave PC Controller Program.   
\- Press the networking button 3 times within 1.5s, Green LED is blinking 3 times within 1 second.   
\- If Inclusion Process is successful, Green led will turn off.

### Exclusion Information

DEVICE EXCLUSION   
\- Click \[Remove\] icon in Z-Wave PC Controller Program   
\- Press the networking button 3 times within 1.5s   
\- If Exclusion Process is successful, Green led is Blinking 6 times, then turn off.

FACTORY RESET   
Long press the networking button, then power on (put into the battery), ID code is clear and reset to factory settings.

### Wakeup Information

The manual doesn't say, but I've found that tapping the tamper sensor once makes the device blink and that seems to wake it up.

## Channels

The following table summarises the channels available for the HM-HS1WL-Z -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 
| Alarm (flood) | alarm_flood | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

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

### Alarm (flood)

Indicates if the flood alarm is triggered.

The ```alarm_flood``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The device has no configuration parameters configured.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The HM-HS1WL-Z supports 5 association groups.

### Group 1: Lifeline

Lifeline association group
This group supports 5 nodes.

### Group 2: Root Device group (Binary Sensor)

Root Device group (Binary Sensor)
This group supports 5 nodes.

### Group 3: Root Device group (Binary Sensor) 

Root Device group (Binary Sensor)
This group supports 5 nodes.

### Group 4: Root Device group (Notification) 

Root Device group (Notification)
This group supports 5 nodes.

### Group 5: Root Device group (Notification) 

Root Device group (Notification)
This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| Linked to BASIC|
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V7| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Manual version 1.0](https://www.cd-jackson.com/zwave_device_uploads/800/hm-hs1wl-z-Smart-Water-Leakage-Sensor-Z-Wave-User-Manual-1-0.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/800).
