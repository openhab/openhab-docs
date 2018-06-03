---
layout: documentation
title: ZWN-RSM1-PLUS - ZWave
---

{% include base.html %}

# ZWN-RSM1-PLUS Smart Relay Switch Module
This describes the Z-Wave device *ZWN-RSM1-PLUS*, manufactured by *Wenzhou MTLC Electric Appliances Co.,Ltd.* with the thing type UID of ```enerwave_zwnrsm1plus_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![ZWN-RSM1-PLUS product image](https://www.cd-jackson.com/zwave_device_uploads/575/575_default.png)


The ZWN-RSM1-PLUS supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

ZWN-RSM1-Plus

Transform any home into a connected home with the Enerwave Z-Wave Plus Smart Single Relay Wireless Lighting Control Module. The lighting control enables wireless control of on/off functions for standard table and floor lamps, and is compatible with incandescent, LED, Xenon, Halogen, fluorescent and compact fluorescent bulbs. The Z-Wave Plus Module provides ultimate flexibility for your home lighting by creating custom scenes and scheduling timed events when you’re either home or away. Compared to Z-Wave Classic models, the Enerwave Z-Wave Plus Smart Meter Module offers 50% more wireless range and energy efficiency a 250% faster processor and 400% more memory

Take charge of your home’s appliances power outlet by installed directly behind your wall sockets. The Z-Wave Plus Smart Relay Module offers all the power of intelligent automation and remote control. Discrete and smart, the Smart Module Switch work invisibly behind your existing switches without the need to replace them.

Easily controlled by your mobile device or computer using any Z-Wave certified gateway, Take control of your home lighting with Enerwave Z-Wave Plus Smart Single Relay Wireless Lighting Controls! Z-Wave is the world’s largest ecosystem of interoperable smart home products. Z-Wave lighting controls provide an easy-to-install and affordable system to control lighting and small appliances in your home. Add an Enerwave Z-Wave lighting controls to a Z-Wave certified gateway to access and control your home from anywhere in the world using your smartphone, tablet or computer as a home automation command center.

Never worry if you accidentally left the lights on because you can turn them off remotely or program your lights to go on/off at specific times. Create customized lighting scenes for any occasion such as a “go to sleep” scene or a “movie night” scene. Give the illusion that someone is home by programming the lights to turn on/off while you are away—perfect for deterring crime and adding additional security!

### Inclusion Information

DEVICE INCLUSION/ EXCLUSION

The process of "Inclusion/ Exclusion" is to Add or Remove the device from the Hub. All Z-Wave devices must be "Included" on the Controller (Hub) before it can be controlled from a smart device. The Hub should be brought physically closer to the device just for the "Inclusion" process (recommended within 10ft). When finished, the Hub and device can be moved back to final installation location. Download the App or log onto the website associated with the Hub you are using and follow their Inclusion/ Exclusion instructions as each Hub's programming and features are different.

• During the Inclusion/ Exclusion process, the Program Button on the relay or the ON/OFF toggle on the switch can be used for including/ excluding the device.

o When using the ON/OFF toggle, the toggle must be toggled ON and OFF 3 times.

• It is best to perform an Exclusion of the device prior to performing an Inclusion.

Step 1. From the Control Panel, go the the device Exclusion page.

o Select "Exclude Device".

o When prompted, press the Program Button on the Relay once or the ON/OFF toggle on the switch 3 times.

Step 2. Go to the "Add Device" page.

o Select "Include Device".

o When prompted, press the Program Button on the Relay once or the ON/OFF toggle on the switch 3 times.

The primary controller should indicate that the action was successful. If the controller indicates the action was unsuccessful, please repeat from Step 1. Once the relay is part of the network, the same basic procedure is used to add

the relay to groups & scenes or change advanced functions. Refer to the Hub’s instructions for details. Step 3. Follow the On-Screen instructions in the Control Panel on adding or removing rooms, scenes, other devices, and other functions and features.

## Channels

The following table summarises the channels available for the ZWN-RSM1-PLUS -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.



## Device Configuration

The following table provides a summary of the 1 configuration parameters available in the ZWN-RSM1-PLUS.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 3 | Unsolicited Report Configuration | Unsolicited Report Configuration |
|  | Switch All Mode | Set the mode for the switch when receiving SWITCH ALL commands |

### Parameter 3: Unsolicited Report Configuration

Unsolicited Report Configuration
ZWN-RSM1-PLUS can send unsolicited status reports to the primary controller (Node ID 0x1) when the switch is toggled if the controller is designed as a gateway. If your controller is not a gateway or does not need the status reported or you think it could confuse your Z-Wave network, you can use Command\_Class\_Configuration to disable this function. By default this function is disabled.
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.

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

The ZWN-RSM1-PLUS supports 2 association groups.

### Group 1: Lifeline

Send device reset locally notification
This group supports 1 nodes.

### Group 2: StatusReport_ EP

Switch Binary Report
This group supports 3 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [ZWN-RSM1-Plus Installation Instructions](https://www.cd-jackson.com/zwave_device_uploads/575/ZWN-RSM1-Plus-0208160043-02.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/575).
