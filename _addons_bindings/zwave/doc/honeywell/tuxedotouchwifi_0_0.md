---
layout: documentation
title: Tuxedo Touch - ZWave
---

{% include base.html %}

# Tuxedo Touch Tuxedo Touch Keypad and Z-Wave Controller
This describes the Z-Wave device *Tuxedo Touch*, manufactured by *Honeywell* with the thing type UID of ```honeywell_tuxedotouchwifi_00_000```.

The device is in the category of *Remote Control*, defining Any portable or hand-held device that controls the status of something, e.g. remote control, keyfob etc..

![Tuxedo Touch product image](https://www.cd-jackson.com/zwave_device_uploads/941/941_default.jpg)


## Overview

Honeywell Home Tuxedo Touch is a 7", high-resolution graphic touchscreen and controller that integrates security with home and business automation. It provides opportunities to capture new prospects and markets by seamlessly integrating security with voice commands, video viewing and recording, and the ability to control Z-Wave® enabled thermostats, lights, locks and shades.  It may be used as a secondary controller within a Z-Wave network.

### Inclusion Information

**Note that any z-wave devices that may be on the Tuxedo Touch if it acts as a primary controller will be removed when it is added as a secondary controller! ** It is recommended that all devices that may be on the Tuxedo Touch if it acts as primary controller be manually removed and added to the new primary controller before changing the Tuxedo Touch to a secondary controller.

Note that all devices on the primary controller will be added to the Tuxedo Touch when it becomes a secondary controller, but device names will not be moved over.  They must manually be changed on the Tuxedo Touch if this is desired.

Access the Automation menu from the main page of the Tuxedo Touch.  Press the Z-Wave Setup button (third button from the left) and toggle the Z-Wave Primary Ctrl button to change the Tuxedo Touch to be a secondary controller.  It will prompt you to allow the change.

Put the primary controller in inclusion mode.

From the Z-Wave Setup screen on the Tuxedo Touch, press the Add Device button.  The primary controller should add the Tuxedo Touch as a secondary controller.  If successful, the Tuxedo Touch will display "Controller Add Success."

### Exclusion Information

Put the primary controller in exclusion mode.

On the Tuxedo Touch, press Automation and then Z-Wave Setup.  From the Z-Wave Setup screen, press Remove Device.

From the Z-Wave Setup screen on the Tuxedo Touch, press the Add Device button.  The primary controller should exclude the Tuxedo Touch as a secondary controller.

## Channels

The following table summarises the channels available for the Tuxedo Touch -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|



## Device Configuration

The device has no configuration parameters defined.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The device does not support associations.
## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_SECURITY_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/941).
