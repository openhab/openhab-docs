---
layout: documentation
title: Comet Z-Wave - ZWave
---

{% include base.html %}

# Comet Z-Wave Radator thermostat 700226
This describes the Z-Wave device *Comet Z-Wave*, manufactured by *Eurotronics* with the thing type UID of ```eurotronic_cometzwave_00_000```.

The device is in the category of *Radiator Control*, defining Controls on radiators used to heat up rooms.

![Comet Z-Wave product image](https://opensmarthouse.org/zwavedatabase/1549/image/)


The Comet Z-Wave supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

## Overview

Comet Z-Wave is an energy-saving radiator controller compatible with the Z-Wave wireless standard.

FLiRS (Frequently Listening Receiver Slave): 

Comet Z-Wave uses the Z-Wave function FLiRS as a radiator thermostat. As a FLiRS device, the radiator thermostat reacts to incoming commands such as temperature changes with a particularly short latency period

### Inclusion Information

Put your primary Z-Wave controller in inclusion mode and press v or ^button to activate add mode. If Comet Z-Wave was added successfully, the LED display will show the receivedNode ID

### Exclusion Information

Please put your Z-Wave controller into the exclusion mode. Then press and hold the button in the battery compartment for 5 seconds until “LE” appears in the display

### General Usage Information



## Channels

The following table summarises the channels available for the Comet Z-Wave -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Basic | basic_number | basic_number |  | Number | 
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 

### Basic
Basic class operation mode



The ```basic_number``` channel is of type ```basic_number``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Thermostat mode
Sets the thermostat.

The ```thermostat_mode``` channel is of type ```thermostat_mode``` and supports the ```Number``` item and is in the ```Temperature``` category.
The following state translation is provided for this channel to the ```Number``` item type -:

| Value | Label     |
|-------|-----------|
| 0 | Off |
| 1 | Heat |
| 2 | Cool |
| 3 | Auto |
| 4 | Aux Heat |
| 5 | Resume |
| 6 | Fan Only |
| 7 | Furnace |
| 8 | Dry Air |
| 9 | Moist Air |
| 10 | Auto Changeover |
| 11 | Heat Economy |
| 12 | Cool Economy |
| 13 | Away |



## Device Configuration

The following table provides a summary of the 5 configuration parameters available in the Comet Z-Wave.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | LCD invert | LCD invert |
| 2 | LCD Timeout | 0x05-0x1E Timeout after 5 seconds - 30 seconds default: 0x05 |
| 4 | Battery status update | Battery status update frequence |
| 5 | Actual temperature update  | Temperature upddate policy |
| 7 | Window open detection | Window-open detection sensitivity |

### Parameter 1: LCD invert

LCD invert
0x00 LCD content normal

0x01 LCD mirrored content 

default: 0x00 This is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | normal |
| 1 | inverted |

The manufacturer defined default value is ```0``` (normal).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: LCD Timeout

0x05-0x1E Timeout after 5 seconds - 30 seconds default: 0x05
0x05-0x1E Timeout after 5 seconds - 30 seconds

default: 0x05
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 4: Battery status update

Battery status update frequence
0x00 Batteriestatus Send only event-controlled as system warning 

0x01 Batteriestatus send 1x a day 

default: 0x00
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Actual temperature update 

Temperature upddate policy
0x00 Send Actual-Temperature not automatically 

0x01-0x32 0x32 With temperature difference of 0.1°C - 5.0°C 

transfer actual temperature 

default: 0x05 (When Delta = 0,5°C report
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 7: Window open detection

Window-open detection sensitivity
0x00 Deactivated

0x01 low sensitivity

0x02 medium sensitivity 

0x03 high sensivity 

default: 0x01 low sinsitive
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Comet Z-Wave supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Lifeline
Should be set to your controller.

Association group 1 supports 1 node.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V3| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V10| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |

### Documentation Links

* [Image](https://opensmarthouse.org/zwavedatabase/1549/reference/Comet-Z-Wave-EN-2023-01-23.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1549).
