---
layout: documentation
title: TILTZWAVE1 - ZWave
---

{% include base.html %}

# TILTZWAVE1 Z-Wave Garage Door Sensor
This describes the Z-Wave device *TILTZWAVE1*, manufactured by *Ingersoll Rand (was Ecolink)* with the thing type UID of ```ingersollecolink_tiltzwave1_00_000```.

The device is in the category of *Garage Door*, defining Garage Door.

![TILTZWAVE1 product image](https://www.cd-jackson.com/zwave_device_uploads/136/136_default.png)


The TILTZWAVE1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

  * Z-Wave PlusTM enabled device which transmits when a garage door is opened or closed
  * Uses a tilt sensor to detect the angle of a door and transmits open/closed status
  * Reports tamper condition if cover is removed

### Inclusion Information

  * Activate inclusion mode for the sensor by inserting the battery.
  * When the inclusion process is complete the red LED will turn on for approximately 10 seconds and then it will go out.
  * If the LED continues to flash, repeat the inclusion process.

### Exclusion Information

  * Activate exclusion mode for the sensor by inserting the battery.
  * When the exclusion process is complete the red LED will flash continuously.

### Wakeup Information

The TILTZWAVE1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.

## Channels

The following table summarises the channels available for the TILTZWAVE1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The TILTZWAVE1 supports 2 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.

Association group 1 supports 5 nodes.

### Group 2: Group 2


Association group 2 supports 5 nodes.

## Technical Information

### Endpoints


### Documentation Links

* [User Guide](https://www.cd-jackson.com/zwave_device_uploads/136/Eco-Link-Tilt-ZWave-Plus-Manual-R1-04-021816kgs.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/136).
