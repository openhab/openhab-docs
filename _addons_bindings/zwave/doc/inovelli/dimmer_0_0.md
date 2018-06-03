---
layout: documentation
title: NZW31 - ZWave
---

{% include base.html %}

# NZW31 In-wall Dimming Switch
This describes the Z-Wave device *NZW31*, manufactured by *Inovelli* with the thing type UID of ```inovelli_dimmer_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![NZW31 product image](https://www.cd-jackson.com/zwave_device_uploads/807/807_default.jpg)


The NZW31 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

Inovelli's In-Wall Smart Dimmer not only has the ability to control lights from anywhere in the world, but it acts as a Z-Wave signal repeater, which amplifies your Z-Wave signal, growing the capabilities of your network.   
  
In addition, it has scene control enabled, which allows you to double tap the switch to activate a Z-Wave scene. An example would be a bedtime scene, which turns off all lights, locks the door(s) and sets the temperature to 68 degrees.   
  
Simplifying lives, one smart home product at a time... that's Inovelli.

### Inclusion Information

**Including Steps:**

- This will vary based on the HUB/Gateway you’re using, but you need to go one (1) step before putting your HUB/Gateway in inclusion process — once you are one (1) step away from physically starting the inclusion/pairing process — **THEN STOP!**
- Walk down to your circuit breaker and flip on the power (you will now have 30 seconds to physically start the inclusion process on your HUB/Gateway)
- While next to the breaker, start the inclusion process and your HUB/Gateway will automatically start looking for devices
- Wait for auto-inclusion to do its thing. Your switch will automatically include/pair to your HUB/Gateway 
  - If successful, your device will flash twice (**NOTE:** Auto-Inclusion will time out after 30 seconds)
  - If the switch does not flash within 30 seconds, please use the alternate method of pairing which is pressing the top (UP) button 6x within 2 seconds
- Confirm that your HUB/Gateway shows the switch

Congratulations, you now have a remote controlled switch!

**\*\*If you are having issues pairing your device, please ensure your switch is within range of your HUB. 95% of the pairing/including failures stem from this issue. Best practice is to start with Z-Wave products near your HUB and build your network out. The more Z-Wave devices, the more efficient your network.\*\***

### Exclusion Information

- Press the Top (UP) Button on your NZW31 six (6) times within 2 seconds

## Channels

The following table summarises the channels available for the NZW31 -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The following table provides a summary of the 4 configuration parameters available in the NZW31.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Dimmer Step configuration | Dimmer Speed Setting (On/Off) |
| 2 | Dimmer Minimum Configuration | Lowest dim setting before turning off |
| 4 | Switch Orientation | Invert On/Off from Top/Bottom |
| 5 | Countdown Timer | Shutoff Timer |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 1: Dimmer Step configuration

Dimmer Speed Setting (On/Off)
Control the speed with which the dimmer turns on and off.
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Dimmer Minimum Configuration

Lowest dim setting before turning off
Lowest dim setting before turning off
Values in the range 1 to 99 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 4: Switch Orientation

Invert On/Off from Top/Bottom
Invert the switch on/off position.

00 - Up = On, Down = Off

01 - Up = Off, Down = On
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Up=ON, Down=OFF |
| 1 | Up=OFF, Down=ON |

The manufacturer defined default value is ```0``` (Up=ON, Down=OFF).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Countdown Timer

Shutoff Timer
Countdown timer.

0x00 - x8000 - 0-32768 Seconds
Values in the range 0 to 32768 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_2``` and is of type ```INTEGER```.

### Switch All Mode

Set the mode for the switch when receiving SWITCH ALL commands.

The following option values may be configured -:
| Value  | Description |
|--------|-------------|
| 0 | Exclude from All On and All Off groups |
| 1 | Include in All On group |
| 2 | Include in All Off group |
| 255 | Include in All On and All Off groups |

This parameter has the configuration ID ```switchall_mode``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The NZW31 supports 1 association group.

### Group 1: Lifeline


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/807/NZW31manual171102.pdf)
* [NZw31 Command Classes and Parameters](https://www.cd-jackson.com/zwave_device_uploads/807/nzw31-command-classes.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/807).
