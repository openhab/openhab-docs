---
layout: documentation
title: OOMI ColorStrip - ZWave
---

{% include base.html %}

# OOMI ColorStrip LED RGBWW Strip
This describes the Z-Wave device *OOMI ColorStrip*, manufactured by *Fantem* with the thing type UID of ```oomi_colorstrip_00_000```.

The device is in the category of Light Bulb, defining Devices that illuminate something, such as bulbs, etc..

# Overview

The LED Strip is a multi-colored LED Strip which allows control of color temperature (warm/cold white), RGB, and dimming via Z-Wave commands.

## Inclusion Information

Set your Z-Wave controller into pairing mode. Press the Action Button located on the back of the LED Strip's white controller box once (The network LED will blink green as an indication it is pairing insecurely, please refer to section "Enabling Security Encryption" in the Advanced Function section of the manual to pair it securely). If the LED Strip has been successfully added to your Z-Wave network, its Network LED will become solid. If the pairing was unsuccessful, the red LED will be on for 2 seconds and then remain a colorful gradient, repeat the instructions above from step 1.

## Exclusion Information

Set your Z-Wave controller into device removal mode. Press the Action Button located on the back of the LED Strip's white controller box once. If the LED Strip has been successfully removed from your Z-Wave network, its Network LED will remain colorful gradient. If the removal was unsuccessful, the Network LED will still be solid, repeat the instructions above from step 1.

## Channels

The following table summarises the channels available for the OOMI ColorStrip

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Color Control | color_color |  | Color | 
| Color Temperature | color_temperature | ColorLight | Dimmer | 

### Dimmer

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Color Control

The ```color_color``` channel supports the ```Color``` item.

### Color Temperature

The ```color_temperature``` channel supports the ```Dimmer``` item and is in the ```ColorLight``` category.



## Device Configuration

The following table provides a summary of the 0 configuration parameter available in the OOMI ColorStrip.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The OOMI ColorStrip supports 0 association group.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| |
| COMMAND_CLASS_SWITCH_COLOR_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [edit the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/843).
