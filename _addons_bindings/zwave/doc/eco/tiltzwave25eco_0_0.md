---
layout: documentation
title: TILT-ZWAVE2.5-ECO - ZWave
---

{% include base.html %}

# TILT-ZWAVE2.5-ECO Z-wave Plus Gold Plated Reliability Garage Door Tilt Sensor
This describes the Z-Wave device *TILT-ZWAVE2.5-ECO*, manufactured by *Ecolink* with the thing type UID of ```eco_tiltzwave25eco_00_000```.

The device is in the category of Garage Door, defining Garage Door.

# Overview


## Inclusion Information

1\. Start by placing the controller into inclusion mode.

2\. Activate inclusion mode for the sensor by inserting the battery. When the inclusion process is complete the red LED will turn on for approximately 10 seconds and then it will go out. If the LED continues to flash, repeat the inclusion process.

3\. Test the garage door sensor before mounting it. Hold the sensor in your hand. Flip the sensor upside-down and watch the LED while doing so. The LED will flash each time the position of the sensor is changed. If your Z- Wave network has a software interface you may verify that the messages from the sensor are being received each time the sensor is flipped.

If you need to repeat the inclusion process, repeat STEP ONE above, then for STEP TWO you will need to simply remove the cover of the sensor, remove the battery for 5 seconds, reinsert the battery, and replace the sensor cover. This will re-enter the sensor in inclusion mode.

## Exclusion Information

Exclusion mode on the sensor is activated on the sensor by the exact same procedure as inclusion.

## Wakeup Information

To save power, this sensor sleeps most of the time and is therefore not awake to receive messages from a gateway for testing. Removing the top case from the sensor will put in device into a tampered mode in which the sensor will stay awake and able to receive messages. Most of the time an end user would not do this, but if the sensor needs to be configured after inclusion, an end user can follow the instructions below for sending Wake-Up notifications.

The sensor will wake up every so often and when the case is closed, it will send a Wake-Up Notification to allow the life line master node controller that the sensor is now available for any queued messages that the controller may have for the sensor. **The time between Wake-Up Notifications can be configured with the Wake-Up Notification command class to be between 1 hour and 1 week with interval steps of 200 seconds.**

## Channels

The following table summarises the channels available for the TILT-ZWAVE2.5-ECO

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Binary Sensor | sensor_binary | Door | Switch | 
| Alarm (power) | alarm_power | Door | Switch | 
| Alarm (access) | alarm_access | Door | Switch | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 

### Binary Sensor

The ```sensor_binary``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (power)

The ```alarm_power``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (access)

The ```alarm_access``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |

### Alarm (burglar)

The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | Ok |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 2 configuration parameters available in the TILT-ZWAVE2.5-ECO.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Basic Sets for Association Group 2 | Send or not send Basic Set commands |
| 2 | Send Reports | Send or not send Sensor Binary Report commands |

### Parameter 1: Basic Sets for Association Group 2

Send or not send Basic Set commands
Send or not send Basic Set commands of 0x00 to nodes in Association group 2 turning the devices off when the sensor is in a restored state i.e. the door is closed
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Do Not Send Basic Sets |
| 255 | Send Basic Sets |

The manufacturer defined default value is 0 (Do Not Send Basic Sets).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Send Reports

Send or not send Sensor Binary Report commands
Send or not to send Sensor Binary Report commands to Association Group 1 when the sensor is faulted and restored
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Send Sensor Binary Reports and Notification Reports |
| 255 | Send Only Notification Reports |

The manufacturer defined default value is 0 (Send Sensor Binary Reports and Notification Reports).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The TILT-ZWAVE2.5-ECO supports 2 association groups.

### Group 1: Lifeline

Sends low-battery, tamper, open/close, and sensor binary reports
This group supports 5 nodes.

### Group 2: Basic Set

Sends ON/OFF commands to other devices based on state
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
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V0| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V5| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/581).
