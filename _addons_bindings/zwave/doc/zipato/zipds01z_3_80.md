---
layout: documentation
title: 0131 - ZWave
---

{% include base.html %}

# 0131 Door/Window Sensor
This describes the Z-Wave device *0131*, manufactured by *[Zipato](http://www.zipato.com/)* with the thing type UID of ```zipato_zipds01z_03_080```.
This version of the device is limited to firmware version 3.80

The device is in the category of *Door*, defining Door sensors.

The 0131 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The 0131 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Door sensor is an intelligent security equipment that can transmit through Z-Wave network and radio waves. In the Z-Wave network communications, door sensor can be connected to any Z-Wave gateway. Door sensor can send messages to Z-Wave gateway, then realize association with other devices. Different countries or areas, the radio frequency is different.

Each door sensor has a unique ID code. When we add or remove door sensor from gateway, just place it in the Z-Wave network range of gateway. Then we can easily find the door sensor through device ID code. In the communication with Z-Wave gateway, door sensor can only send messages to Z-Wave gateway, but can not receive messages. When alarm is triggered, door sensor would send messages to gateway, then Z-Wave gateway would display the current status of door sensor. At the same time, door sensor can realize association with other devices through Z-Wave gateway. Door sensor is powered by batteries, with small body, and can be installed on the window or door easily. When door or window is open, door sensor would be triggered, then associates with other devices to work, to realize the goal of safety protection.

### Inclusion Information

ADD DOOR SENSOR TO Z-WAVE NETWORK

  1. Disassemble the main body of door sensor by pressing the disassemble button, then install battery. After making it powered on, please do not operate it within 20 s.
  2. Place door sensor within Z-Wave network range of gateway.
  3. Set Z-Wave gateway into inclusion mode (Refer to gateway user manual).
  4. Press the code button in door sensor three times continuously, then door sensor will enter inclusion mode. Meanwhile, LED light would flash red color five times on and off alternately.
  5. Door sensor will be detected and included in the Z

### Exclusion Information

REMOVE DOOR SENSOR FROM Z-WAVE NETWORK

  1. Make sure doorsensoris powered on.
  2. Set Z-Wave gateway into exclusion mode (Refer to gateway user manual).
  3. Press the code button in door sensor three times continuously, then door sensor will enter exclusion mode. Meanwhile, LED light would flash red color five times on and off alternately.
  4. Wait for gateway to remove the sensor.

### Wakeup Information

The 0131 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


Door sensor stays in dormant state for the majority of time in orderto conserve battery life.

The minimum wakeup interval is 300s (5 minutes).

The maximum wakeup interval is 16,777,200s (about 194 days)

Allowable min step among each wakeup interval is 60 seconds, such as 360s, 420s, 480s...

NOTE: The default value is 12 hours. The larger the value is, the greater the battery life is.

## Channels

The following table summarises the channels available for the 0131 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The device does not support associations.
## Technical Information

### Endpoints


---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/844).
