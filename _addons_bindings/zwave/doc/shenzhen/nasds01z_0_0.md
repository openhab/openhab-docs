---
layout: documentation
title: NAS-DS01Z - ZWave
---

{% include base.html %}

# NAS-DS01Z Cyrus Door Window Sensor
This describes the Z-Wave device *NAS-DS01Z*, manufactured by *[Shenzhen Neo Electronics Co., Ltd](http://www.szneo.com/)* with the thing type UID of ```shenzhen_nasds01z_00_000```.

The device is in the category of *Door*, defining Door sensors.

![NAS-DS01Z product image](https://www.cd-jackson.com/zwave_device_uploads/458/458_default.jpg)


The NAS-DS01Z supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The NAS-DS01Z does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Contact sensor is an intelligent security equipment that can transmit the Z-Wave network which has particular frequency. In the Z-Wave network communications, contact sensor can be connected to any Z-wave main controller. The contact sensor can send messages to the Z-wave main controller, and realize association with other devices through the Z-wave main controller. Different countries or areas, the radio frequency is different.In the communication with the Z-wave main controller, the contact sensor can send messages to the Z-wave main controller, but it can not receive messages from the Z-wave main controller. When alarm is triggered, the contact sensor sends messages to the Z-wave main controller, the Z-wave main controller will displays the current status of contact sensor, so the contact sensor can associate with other devices. Contact sensor is battery powered, is small and can be installed on the window or door easily. When the door or window is open, the contact sensor is triggered and linkage alarm realized.

**Technical parameters**

  * Power: CR14250 x1
  * Standby current: 1uA
  * Battery life: 10 years
  * Radio Protocol: Z-wave
  * Radio Frequency: 868.4MHz EU; 908.4MHz US; 921.4MHz ANZ; 869.2MHz RU
  * Wireless distance：50m
  * Operation temperature: 0-40℃
  * Storage temperature: 0-60℃
  * Size: Contact sensor main body (L x W x H): 70mmx20mmx20mm Contact sensor deputy body (L x W x H): 40mmx11mmx11mm 

### Inclusion Information

  1. Disassemble the contact sensor main body and insert the battery into the contact sensor. Make sure the device is located within the direct range of the controller.
  2. Set the controller into the learning mode (see mail controller’s operating manual).
  3. Quickly, triple click the code button, LED light will flash for 5 times.
  4. Contact sensor will be detected and included in the Z-Wave network.
  5. Wait for the main controller to configure the sensor.

### Exclusion Information

  1. Make sure the sensor is connected to power source.
  2. Set the main controller into the learning mode (see main controller’s operating manual).
  3. Quickly, triple click the code button,LED light will flash for 5 times.
  4. Wait for the main controller to delete the sensor.

### Wakeup Information

The NAS-DS01Z does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Quickly, triple click the code button

## Channels

The following table summarises the channels available for the NAS-DS01Z -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Door Sensor | sensor_door | Door | Contact | 
| Tamper Alarm | alarm_tamper |  | Switch | 
| Battery Level | battery-level | Battery | Number |

### Door Sensor

Indicates if the door/window is open or closed.

The ```sensor_door``` channel supports the ```Contact``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Contact``` item type -:

| Value | Label     |
|-------|-----------|
| OPEN | Open |
| CLOSED | Closed |

### Tamper Alarm

Indicates if the tamper alarm is triggered.

The ```alarm_tamper``` channel supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the NAS-DS01Z.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | OFF Delay | Adjust the amount of delay before the OFF command is transmitted. |
| 2 | Basic Set Level |  |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: OFF Delay

Adjust the amount of delay before the OFF command is transmitted.
Description This configuration parameter that can be used to adjust the amount of delay before the OFF command is transmitted. This parameter can be configured with the value of 0 through 65535, where 0 means send OFF command immediately and 65535 means 65535 seconds of delay.
Values in the range 0 to 65535 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_1_2``` and is of type ```INTEGER```.


### Parameter 2: Basic Set Level



The following option values may be configured, in addition to values in the range -1 to 99 -:

| Value  | Description |
|--------|-------------|
| -1 | ON (Binary Switch Device) |
| 0 | OFF, Alarm cancelling or turning a device off |

The manufacturer defined default value is ```-1``` (ON (Binary Switch Device)).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.

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

The NAS-DS01Z supports 4 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
GROUP 1 is lifeline service that assigned to Sensor (Door/Window detector) status – Open/Close

Association group 1 supports 5 nodes.

### Group 2: Group 2

GROUP 2 allows for sending control commands to associated devices such as relay module, lighting, etc. This association group is configured through the advanced parameters no. 1 and 2. This Group Support: BASIC_SET.
GROUP 2 allows for sending control commands to associated devices such as relay module, lighting, etc. This association group is configured through the advanced parameters no. 1 and 2. This Group Support: BASIC_SET.

Association group 2 supports 5 nodes.

### Group 3: Group 3

GROUP 3 allows for Send Notification to associated devices in this group. This Group Support: NOTIFICATION_REPORT.

Association group 3 supports 5 nodes.

### Group 4: Group 4

GROUP 4 allows for Send Notification to associated devices in this group. This Group Support: SENSOR\_BINARY\_REPORT
GROUP 4 allows for Send Notification to associated devices in this group. This Group Support: SENSOR\_BINARY\_REPORT

Association group 4 supports 5 nodes.

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
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V3| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [German Manual](https://www.cd-jackson.com/zwave_device_uploads/458/Tuer-Fensterkontakt-Z-Wave-manual-DE.pdf)
* [English Manual](https://www.cd-jackson.com/zwave_device_uploads/458/neo-coolcam-door-window-sensor-user-manual.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/458).
