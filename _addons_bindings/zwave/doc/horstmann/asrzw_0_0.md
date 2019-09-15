---
layout: documentation
title: ASR-ZW - ZWave
---

{% include base.html %}

# ASR-ZW Thermostat Receiver
This describes the Z-Wave device *ASR-ZW*, manufactured by *Horstmann Controls Limited* with the thing type UID of ```horstmann_asrzw_00_000```.

The device is in the category of *HVAC*, defining Air condition devices, Fans.

![ASR-ZW product image](https://www.cd-jackson.com/zwave_device_uploads/310/310_default.png)


The ASR-ZW supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

The ASR–ZW receiver unit receives the Z-Wave radio signals from the HRT4–ZW room thermostat. In the unlikely event of a communication failure it is possible to override the system and switch On and Off using the On/Off buttons on the ASR-ZW receiver as a local override.

If the override is used to override the HRT4-ZW thermostat when it is functioning correctly then the override will be cancelled by the next switching operation of the thermostat and normal operation will be resumed. In any case, with no further intervention, normal operation will be restored within one hour of the override being operated.

### Inclusion Information

# Stage 1

  1. Set the number 1 DIL switch on the back of the HRT4-ZW thermostat to the On (Up) position and the display on the HRT4-ZW will change to show the letter ‘I’. If the letter ‘L’ appears, carry out stage 1A opposite.
  2. Power up the ASR-ZW receiver unit
  3. The network LED on the ASR-ZW receiver should be flashing.
  4. Press the dial on the front of the HRT4-ZW thermostat once so that the ‘I’ in the display flashes.
  5. Press and hold the network button on the ASR-ZW receiver until the On indicator flashes (green) before the Off indicator becomes solid red.

  6. After a few seconds the radio mast symbol will appear in the display along with the letters IP.
  7. Reset the number 1 DIL switch on the back of the HRT4-ZW to the Off position and the temperature should return in the display.
  8. Now check the receiver responds to the thermostat on and off commands by increasing and decreasing the temperature settings until it switches accordingly. **N.B.** There is a half second delay in switching On and Off on receipt of the command.
  9. The Z-Wave communication link is now successfully established

# Stage 1A – Only used if ‘L’ is displayed instead of ‘I’

  1.  Turn the dial of the HRT4-ZW until the letter P appears in the display.
  2.  Press the dial twice.
  3.  A second P should appear in the display which now shows \`PP’.
  4.  Turn the dial until the letter ‘I’ appears in the display and return to Stage 1 instruction.

# Stage 2 – Only used if the above procedure does not establish a successful communication link

  1. Turn the dial until the letter P appears in the display.
  2. Press the dial twice and PP should appear in the display.
  3. Now turn the dial until letter E appears in the display.
  4. Press the dial once and the display should flash.
  5. Press and hold the network button on the ASR-ZW receiver until it starts to flash. 6
  6. Turn the dial until the letter \`I’ appears in the display and return to the main instruction.

### Exclusion Information

Not Provided

## Channels

The following table summarises the channels available for the ASR-ZW -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Thermostat mode | thermostat_mode | thermostat_mode | Temperature | Number | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

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
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_THERMOSTAT_MODE_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_VERSION_V1| |

### Documentation Links

* [User Manual](https://www.cd-jackson.com/zwave_device_uploads/310/user-and-installer-guide-HRT4-ZWweb1--1-.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/310).
