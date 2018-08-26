---
layout: documentation
title: Vitrum Satellite VI - ZWave
---

{% include base.html %}

# Vitrum Satellite VI Vitrum touch switch satellite 6 buttons
This describes the Z-Wave device *Vitrum Satellite VI*, manufactured by *VDA* with the thing type UID of ```vda_satellitevi_00_000```.

The Vitrum Satellite VI supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data from other devices.

## Overview

When the device is in the stand-alone mode and is not included in a Z-Wave network the illuminated ring around the touch keys will light red for a moment when passing from one mode to another.

Each button can be configured in 4 different modes. Press the 2 service buttons (left and right each) for at least 8 seconds. Buttons will start to flash and the color of the flashing ring will indicate the channel setting:

\- Yellow: for association with On-Off Modules, toggle-button function (BASIC)

\- Red: for association with On-Off Modules, push-button function (BASIC)

\- Magenta: for association with Roller Blinds, 2 buttons will start flashing together for up and down movement (SWITCH\_MULTILEVEL)

\- Green: for association with Dimmer Modules (SWITCH\_MULTILEVEL)

After mode selection, please proceed with inclusion process.

### Inclusion Information

With the controller in the inclusion mode, press any of the touch keys on the device. Vitrum indicates that it has been included to the network by flashing the yellow LEDs three times and switching on all the lights connected to the unit.

### Exclusion Information

Press and hold the leftmost touch key for at least 8 seconds. The device will flash red three times and sound an acoustic signal to indicate that the original factory setting has been restored.

## Channels

The following table summarises the channels available for the Vitrum Satellite VI -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Switch | switch_binary | Switch | Switch | 
| Dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Dimmer 1 | switch_dimmer1 | DimmableLight | Dimmer | 
| Dimmer 2 | switch_dimmer2 | DimmableLight | Dimmer | 
| Dimmer 3 | switch_dimmer3 | DimmableLight | Dimmer | 
| Dimmer 4 | switch_dimmer4 | DimmableLight | Dimmer | 
| Dimmer 5 | switch_dimmer5 | DimmableLight | Dimmer | 
| Dimmer 6 | switch_dimmer6 | DimmableLight | Dimmer | 

### Switch

Switch the power on and off.

The ```switch_binary``` channel supports the ```Switch``` item and is in the ```Switch``` category.

### Dimmer

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 1

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 2

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer2``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 3

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer3``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 4

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer4``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 5

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer5``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 6

The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer6``` channel supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



## Device Configuration

The device has no configuration parameters configured.

## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Vitrum Satellite VI supports 6 association groups.

### Group 1: Button channel 1


This group supports 5 nodes.

### Group 2: Button channel 2


This group supports 5 nodes.

### Group 3: Button channel 3


This group supports 5 nodes.

### Group 4: Button channel 4


This group supports 5 nodes.

### Group 5: Button channel 5


This group supports 5 nodes.

### Group 6: Button channel 6


This group supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_INDICATOR_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 3

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 4

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 5

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_VERSION_V1| |
#### Endpoint 6

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V0| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V1| Linked to BASIC|
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_VERSION_V1| |

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/626).
