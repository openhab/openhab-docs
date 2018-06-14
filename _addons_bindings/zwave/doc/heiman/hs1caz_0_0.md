---
layout: documentation
title: HS1CA-Z - ZWave
---

{% include base.html %}

# HS1CA-Z CO Detector
This describes the Z-Wave device *HS1CA-Z*, manufactured by *[Heiman Technology Co. Ltd](http://www.heimantech.com/)* with the thing type UID of ```heiman_hs1caz_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![HS1CA-Z product image](https://www.cd-jackson.com/zwave_device_uploads/790/790_default.png)


The HS1CA-Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The HS1CA-Z does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour. The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Overview

Carbon monoxide Sensor

Battery Type: CR123A

The device has two operation buttons: A big button that can be pressed with your fingers on the side of the device (for function test only) and a hidden button behind a small hole on the side of the device (used for inclusion/exclusion to z-wave network, and to reset the device to factory defaults)

After inserting battery, the device will make a short sound. The device will then perform a preheat cycle. While preheating cycle is active (about 90 s) the LED will flash green, red, yellow alternately. After that the device will enter normal mode and LED will stop flashing. After that, device will be ready to be included into z-wave network.

Device Factory Reset

-Long press Net\_Button (small button behind hole on the side of the device) while installing battery in HS1CA-Z.

You can use a needle or a SIM card extractor (included in package) to press the button.

\- Device Reset Locally notification is transmitted.

\- Please use this procedure only when the network primary controller is

missing or otherwise inoperable.

Manual:

https://products.z-wavealliance.org/ProductManual/File?folder=&filename=Manuals/1940/HS1CA-Z%20documentation.doc

### Inclusion Information

Set the z-Wave controller to inclusion mode.

Then quickly triple press button behind small hole on the side of the CO-Sensor device (within 1.5 s) to include. This button is called „NET Button“ in manual. You can use a needle or an SIM card extractor to push the button behind the small hole on the side of the device.

Green LED will blink 3 times within 1 second.

If inclusion process is successful, green LED will turn off.

### Exclusion Information

Set the z-Wave controller to exclusion mode and then quickly triple press button behind small hole on the side of the CO-Sensor device (within 1.5 s) to exclude. This button is called „NET Button“ in manual. You can use a needle or an SIM card extractor to push the button behind the small hole on the side of the device.

If exclusion process is successful, green LED will blink 6 times and then turn off.

## Channels

The following table summarises the channels available for the HS1CA-Z -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (CO) | alarm_co | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

### Binary Sensor

Indicates if a sensor has triggered.

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (CO)

Indicates if the carbon monoxide alarm is triggered.

The ```alarm_co``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

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

The HS1CA-Z supports 3 association groups.

### Group 1: Lifeline

Battery, Notification, Reset locally Notification, Binary report
This group supports 1 nodes.

### Group 2: Root device Group (binary sensor)

Binary Sensor CO via lifeline and on status Chance of CO detection
This group supports 5 nodes.

### Group 3: Root device Group (notification)

CO status as notification report and on status change of CO detection
This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_ALARM_V4| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_SENSOR_BINARY_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/790).
