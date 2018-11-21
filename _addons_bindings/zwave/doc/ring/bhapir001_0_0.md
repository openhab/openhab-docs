---
layout: documentation
title: BHAPIR001 - ZWave
---

{% include base.html %}

# BHAPIR001 Motion Detector
This describes the Z-Wave device *BHAPIR001*, manufactured by *Ring* with the thing type UID of ```ring_bhapir001_00_000```.

The device is in the category of *Motion Detector*, defining Motion sensors/detectors.

![BHAPIR001 product image](https://www.cd-jackson.com/zwave_device_uploads/944/944_default.jpg)


The BHAPIR001 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The BHAPIR001 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

Ring Alarm Motion Sensor: Expand your Ring Alarm system to secure each room, and get alerts as soon as motion is detected.

### Inclusion Information

1. Activate inclusion mode on controller  
2. Pull tab/quickly disconnect and reconnect battery  
3. Device should appear in Inbox

### Exclusion Information

Initiate exclusion mode on controller

1. Open contact sensor’s cover Remove and replace battery quickly

Reset:

1. Open contact sensor’s cover  
2. Press and hold the reset button on sensor circuitry  
3. Remove and replace battery quickly – Blue LED will start to blink rapidly  
4. Wait for the blue LED to stop blinking

### Wakeup Information

The BHAPIR001 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


By opening the top cover, the sensor will get to tamper state and stay awake.

## Channels

The following table summarises the channels available for the BHAPIR001 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The device does not support associations.
## Technical Information

### Endpoints


### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/944/Ring-Motion-Sensor.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/944).
