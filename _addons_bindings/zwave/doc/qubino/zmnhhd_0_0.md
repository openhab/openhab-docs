---
layout: documentation
title: ZMNHHD - ZWave
---

{% include base.html %}

# ZMNHHD Qubino Mini Dimmer
This describes the Z-Wave device *ZMNHHD*, manufactured by *[Goap](http://www.qubino.com/)* with the thing type UID of ```qubino_zmnhhd_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZMNHHD product image](https://www.cd-jackson.com/zwave_device_uploads/1188/1188_default.png)


The ZMNHHD supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

Mini Dimmer is a MOSFET-switching light device that also supports control of low-voltage halogen lamps with electronic transformers, dimmable compact fluorescent lights, and dimmable LED bulbs. It measures power consumption of the connected device. It supports push-button/momentary switches (default) and toggle switches. It can work with or without the neutral line. Qubino Mini Dimmer allows the easiest and quickest installation.

### Inclusion Information

**AUTOMATICALLY ADDING THE DEVICE TO A Z-WAVE NETWORK (AUTO INCLUSION)**

  1. Enable add/remove mode on your Z-Wave gateway (hub).
  2. Automatic selection of secure/unsecure inclusion.
  3. The device can be automatically added to a Z-Wave network during the first 2 minutes.
  4. Connect the device to the power supply.
  5. Auto-inclusion will be initiated within 5 seconds of connection to the power supply and the device will automatically enrol in your network. (when the device is excluded and connected to the power supply it automatically enters the LEARN MODE state.)

NOTE: the device can be automatically added to a Z-Wave network during the first 2 minutes after connected to the power supply.

ⓘ NOTE: LEARN MODE state allows the device to receive network infromation from the controller

ⓘ NOTE: For S2 inclusion please check chapter – »17. Z-Wave Security« in the manual.

**MANUALLY ADDING THE DEVICE TO A Z-WAVE NETWORK (MANUAL INCLUSION) **

  1. Connect the device to the power supply
  2. Enable add/remove mode on your Z-Wave gateway (hub)
  3. Toggle the switch connected to the I1 terminal 3 times within 3 seconds (this procedure put the device in LEARN MODE). The device has to get On/Off signal 3 times, meaning 3 times push of the button or with the normal button 3 times On/Off.

**OR**

Press and hold the S (Service) button between 2 and 6 seconds if connected to 24-30VDC (this procedure put the device in LEARN MODE).

  1. A new device will appear on your dashboard
  2. Inclusion with the switch connected to I1 terminal is not limited by time

ⓘ NOTE: LEARN MODE state allows the device to receive network information from the controller.

### Exclusion Information

**REMOVAL FROM A ZWAVE NETWORK (Z-WAVE EXCLUSION)**

  1. Connect the device to the power supply.
  2. Make sure the device is within direct range of your Z-Wave gateway (hub) or use a hand-held Z-Wave remote to perform exclusion.
  3. Enable add/remove mode on your Z-Wave gateway (hub).
  4. Toggle the switch connected to the I1 terminal 3 times within 3 seconds (this procedure put the device in LEARN MODE). The device has to get On/Off signal 3 times, meaning 3 times push of the button or with the normal button 3 times On/Off.

**OR**

Press and hold the S (Service) button between 2 and 6 seconds if connected to 24-30VDC (this procedure put the device in LEARN MODE)

  1. Exclusion with the switch connected to I1 terminal is not limited by time.
  2. The device will be removed from your network, but any custom configuration parameters will not be erased.

ⓘ NOTE: LEARN MODE state allows the device to receive network information from the controller.

**FACTORY RESET**

  1. Connect the device to the power supply.
  2. Within the first minute (60seconds) the device is connected to the power supply, toggle the switch connected to the I1 terminal 5 times within 3 seconds.

**OR**

Press and hold the S (Service) button for at least 6 seconds if connected to 24-30VDC.

ⓘ NOTE: By resetting the device, all custom parameters previously set on the device will return to their default values, and the node ID will be deleted. Use this reset procedure only when the main gateway (hub) is missing or otherwise inoperable.

ⓘ NOTE: the reset with switch connected to I1 is possible only in the first minute after the device is connected to the power.

ⓘ NOTE: after the reset is successfully done the autocalibration will trigger and the green LED will start blinking.

**LED SIGNALIZATION FOR INCLUSION/EXCLUSION**

LED (green)

  * LED is blinking (1 sec ON, 1 sec OFF) = module is excluded
  * LED is ON = module is included

LED (red)

  * LED is OFF = normal operation
  * LED is ON = overload
  * LED is blinking (1 sec ON, 1 sec OFF) = over temperature

LED (blue)

  * LED is OFF = normal operation
  * LED is blinking (1 sec ON, 1 sec OFF) = calibration in progress
  * LED is ON = calibration failed

ⓘ NOTE: after each power cycle all 3 LEDs will blink once before resuming normal operation.

## Channels

The following table summarises the channels available for the ZMNHHD -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The device does not support associations.
## Technical Information

### Endpoints


### Documentation Links

* [Qubino Mini Dimmer v4.5.pdf](https://www.cd-jackson.com/zwave_device_uploads/1188/Qubino-Mini-Dimmer-V-4-5.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1188).
