---
layout: documentation
title: Wave 1 Mini - ZWave
---

{% include base.html %}

# Wave 1 Mini A secure, energy-efficient Z-Wave smart switch
This describes the Z-Wave device *Wave 1 Mini*, manufactured by *Shelly* with the thing type UID of ```shelly_wave1mini_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![Wave 1 Mini product image](https://opensmarthouse.org/zwavedatabase/1648/image/)


The Wave 1 Mini supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

## Terminology

Device - In this document, the term “Device” is used to refer to the Shelly Qubino device that is a subject of this guide.

Gateway - A Z-Wave® gateway, also referred to as a Z-Wave® controller, Z-Wave® main controller, Z-Wave® primary controller, or Z-Wave® hub, etc., is a device that serves as a central hub for a Z-Wave® smart home network. The term “gateway” is used in this document.

S button - The Z-Wave® Service button, located on Z-Wave® devices and is used for various functions such as adding (inclusion), removing (exclusion), and resetting the device to its factory default settings. The term "S button" is used in this document.

## Short description

If the SW (SW1) is configured as a switch (default), each toggle of the switch will change the output O (O1) state to the opposite state - on, off, on, etc. If the SW (SW1) is configured as a push-button in the Device settings, each press of the push-button will change the output O (O1) state to the opposite state - on, off, on, etc.

### Switch connected to input terminal SW (SW1)

If the SW (SW1) is configured as a switch (default), each toggle of the switch will change the output O (O1) state to the opposite state - on, off, on, etc.

Change switch position once: Change the state of the output O (O1) state to the opposite state and send the command to the associated devices in associated groups 2 and 3 (check chapter Z-Wave Association).

### Switch-memory connected to input terminal SW (SW1)

If the SW (SW1) is configured as a switch-memory, than:

Switching to Close switch-memory contact: Change the state of the output state O (O1) to the On state and send command to the associated devices in associated groups 2 and 3 (check chapter Z-Wave Association)

Switching to Open switch-memory contact: Change the state of the output state O (O1) to the Off state and send command to the associated devices in associated groups 2 and 3 (check chapter Z-Wave Association)

### Push-button connected to input terminal SW (SW1)

If the SW (SW1) is configured as a push-button in the Device settings, each press of the push-button changes the output state O (O1) to opposite - ON, OFF, ON, etc.

1x click: Change the state of the output state O (O1) to the opposite one and send command to the associated devices in associated groups 2 and 3 (check chapter Z-Wave Association)

2x click: If the delay between first in second click is less then 500ms, this is interpreted as double clik. Send command to the associated devices (dimmers, shutters,….) in associated groups 2 and 3 (check chapter Z-Wave Association)

Hold: Send command to the associated devices in associated group 3 (check chapter Z-Wave Association)

Release: Send command to the associated devices in associated group 3 (check chapter Z-Wave Association)

## Main applications

Residential

MDU (Multi Dwelling Units - apartments, condominiums, hotels, etc.)

Light commercial (small office buildings, small retail/restaurant/gas station, etc.)

Government/municipal

University/college

## Integrations

Shelly Qubino Wave devices are developed on the world's leading technology for smart homes – Z-Wave.

This means Shelly Qubino Wave works with all certified gateways supporting Z-Wave communication protocol.

To make sure the functions of Shelly Qubino Wave products are supported on your gateway, we are regularly executing compatibility tests of our devices with different Z-Wave gateways.

## Device electrical interfaces

### Inputs

1 switch/button input on screw terminal

1 potential-free contact relay input on screw terminal

2 power supply inputs on screw terminals: N, L

### Outputs

1 potential-free contacts relay output on screw terminal

## Addon interface

N/A

## Connectivity

Z-Wave - Unsecure, S0 Security, S2 Unauthenticated Security, S2 Authenticated Security

## Safety features

### Overheat protection

  * switch off its own relay
  * sends the Notification Report to the Gateway (Overheat detected)
  * the led lights react as specified above (check blinking mode for Overheat detected)

Any of next activities reset this alarm: power cycle, short press on S button, press any switch-push button connected to any SW (SW, SW1, SW2, …) terminal.

NOTE: The Overheat protection is always active and cannot be disabled.

Additional description above under chapter Notification for Overheat detected.

## Supported load types

  * Resistive (incandescent bulbs, heating devices)
  * Capacitive (capacitor banks, electronic equipment, motor start capacitors)
  * Inductive with RC Snubber (LED light drivers, transformers, fans, refrigerators, air-conditioners)

## User interface

### S button and operating modes

  1. Normal mode
  2. Setting in progress mode
  3. Setting mode (with S button)

  *   * Settings mode is required to start desired procedure for example: adding (inclusion), removing (exclusion), factory reset etc. It has a limited time of operation. After the procedure in Setting mode is concluded, the Device goes automatically into Normal mode.
      * Entering to Setting mode:
          * Quickly press and hold the S button on the Device until the LED turns solid blue
          * An additional quick press on the S button means menu change in infinite loop
          * Menu LED status has a timeout of 10s before entering again into Normal state

### S button’s functions

  * Manually adding the Device to a Z-Wave network
  * Manually removing the Device from a Z-Wave network
  * Factory Reset the Device

## LED Signalisation

### **Normal mode**

**Removed/Excluded**

The LED will be blinking blue in Mode 1 for 10 min after every power cycle and 10 min after S button pressed.

**Added/Included**

The LED will be blinking green in Mode 1 for 10 min after every power cycle and 10 min after S button pressed.

### **Settings in progress**

**Factory reset and reboot**

During factory reset, the LED will turn solid green for approx. 1sec, then the blue and red LED will be blinking 0,1s On, 0,1s Off for about 2sec.

**Adding / Removing**

During adding or removing, the LED will be blinking blue in Mode 2.

**Firmware updating OTA**

During the OTA update, the LED will be blinking blue and red in Mode 2.

Checking power supply 230 V AC frequency or 24 V DC voltage

During checking the power supply, the LED will be blinking blue and red in Mode 5.

### **Settings mode with S button**

**Adding / Removing menu selected**

When the menu is selected the LED will be on blue, for maximum of 10 seconds.

**Adding / Removing menu - while pressing S- button - Add/Remove process selected**

When the menu is executing the LED will be blinking blue in Mode 3.

**Factory reset menu selected**

When the menu is selected the LED will be on red, for maximum of 10 seconds.

**Factory reset - while pressing S - button - Factory reset process selected**

When the menu is executing the LED will be blinking red in Mode 3.

### **Alarm Mode**

**Overheat detected**

The LED will be blinking red in Mode 4 - 0,2s On 0,2s Off 0,2s On 0,2s Off 2s Off and repeating this sequence

### LED blinking modes

Click to see the LED blinking modes

| LED blinking modes | |

| Mode 1 | 0,5s On/2s Off |

| Mode 2 | 0,5s On/0,5s Off |

| Mode 3 | 0,1s On/0,1s Off |

| Mode 4 | (1x to 6x - 0,2s On/0,2s Off) + 2s Off |

| Mode 5 | 0,2s On blue/0,2s On red |

## Specifications

| Power supply | 110 - 240 V AC, 50/60 Hz |

| Power consumption | < 0,3 W |

| Max. switching voltage AC | 240 V |

| Max. switching current AC | 8 A |

| Max switching power AC | 2000 W |

| Max. switching voltage DC | 30 V |

| Max. switching current DC | 5 A |

| Overheating protection | Yes |

| Distance| Up to 40 m indoors (131 ft.) (depends on local condition) |

| Z-Wave® repeater: | Yes |

| CPU | Z-Wave® S800 |

| Z-Wave® frequency band: | 868,4 MHz |

| Maximum radio frequency power transmitted in frequency band(s) | < 25 mW |

| Size (H x W x D) | 29x35x16 ±0.5 mm / 1.11x1.35x0.63 ±0.02 in |

| Weight | 19 ±1 g / 0.65 ±0.04 oz |

| Mounting | Wall box |

| Screw terminals max. torque | 0.4 Nm / 3.54 lbin |

| Conductor cross section | 0.5 to 1.5 mm² / 20 to 16 AWG |

| Conductor stripped length | 5 to 6 mm / 0.20 to 0.24 in |

| Shell material | Plastic |

| Color | Blue |

| Ambient temperature | -20°C to 40°C / -5°F to 105°F |

| Humidity | 30% to 70% RH |

| Max. altitude | 2000 m / 6562 ft. |

## Factory reset

### Factory reset general

After Factory reset, all custom parameters and stored values (kWh, associations, routings, etc.) will return to their default state. HOME ID and NODE ID assigned to the Device will be deleted. Use this reset procedure only when the gateway is missing or otherwise inoperable.

### Factory reset with the S button

Note! Factory reset with the S button is possible anytime.

  1. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  2. Press the S button multiple times until the LED turns solid red.
  3. Press and hold (> 2s) S button on the Device until the red LED starts blinking in Mode 3. Releasing the S button will start the factory reset.
  4. During factory reset, the LED will turn solid green for about 1s, then the blue and red LED will start blinking in Mode 3 for approx. 2s.
  5. The blue LED will be blinking in Mode 1 if the Factory reset is successful.

### Factory reset with a switch/push-button

Note! Factory reset with a switch/push-button is only possible within the first minute after the Device is connected to a power supply.

  1. Connect the Device to a power supply.
  2. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2,…) 5 times within 3 seconds. The Device must receive on/off signal 5 times, which means pressing the push-button 5 times, or toggling the switch on and off 5 times.
  3. During factory reset, the LED will turn solid green for about 1s, then the blue and red LED will start blinking in Mode 3 for approx. 2s.
  4. The blue LED will be blinking in Mode 1 if the Factory reset is successful.

### Factory reset remotely with parameter with the gateway

Factory reset can be done remotely by settings in Parameter No. 120

## Z-Wave® Security and Device Specific Key (DSK)

Click to see about the Security and the DSK

The Device supports the latest Security 2 (S2) feature. S2 is handled by the Strong AES 128 Encryption protocol, which means that the S2 makes Z-Wave® the most secure IoT (Internet of Things) security platform out there. To fully utilize the product and its Security 2 feature, a Security 2-enabled Z-Wave® gateway must be used.

Authenticated Control

· Out-Of-Band DSK for inclusion

· May be used by most implementations

The Device also supports Security 2 Authenticated, Unauthenticated, and Unsecure inclusion.

Note! When adding the Device to a Z-Wave® network with a gateway supporting Security 2 (S2), the PIN Code of the Z-Wave® Device Specific Key (DSK) is required. The unique DSK code is printed on the DSK label on the side of the Device and a copy is inserted in the packaging, which must not be lost. Do not remove the DSK label from the product. As a backup measure, use the label in the packaging.

The first five digits of the key are highlighted or underlined to help the user identify the PIN Code part of the DSK text. The DSK is additionally represented with a QR Code as shown on the image.

### DSK label and QR code (example)

A joining node requesting to join the S2 Access Control Class or the S2 Authenticated Class will obfuscate its Public Key by setting the bytes 1..2 to zeros (0x00) before transferring its key via RF.

The DSK may be used for out-of-band (OOB) authentication.

The including gateway may use a QR code scanning device to read the entire DSK of the joining device and match it with the obfuscated public key received via RF from the joining device.

### Inclusion Information

## Adding the Device to a Z-Wave® network (inclusion)

Click to see how to add, remove and reset the Device

Note! All Device outputs (O, O1, O2, etc. - depending on the Device type) will turn the load 1s on/1s off /1s on/1s off if the Device is successfully added to/removed from a Z-Wave® network.

Note! In case of Security 2 (S2) adding (inclusion), a dialog will appear asking you to enter the corresponding PIN Code (5 underlined digits) that are written on the Z-Wave® DSK label on the side of the Device and on the Z-Wave® DSK label inserted in the packaging.

IMPORTANT: The PIN Code must not be lost.

### SmartStart adding (inclusion)

SmartStart enabled products can be added into a Z-Wave® network by scanning the Z-Wave® QR Code present on the Device with a gateway providing SmartStart inclusion. No further action is required, and the SmartStart device will be added automatically within 10 minutes of being switched on in the network vicinity.

With the gateway application scan the QR code on the Device label and add the Security 2 (S2) Device Specific Key (DSK) to the provisioning list in the gateway.

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  3. Adding will be initiated automatically within a few seconds after connecting the Device to a power supply, and the Device will be added to a Z-Wave® network automatically.
  4. The blue LED will be blinking in Mode 2 during the adding process.
  5. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

### Adding (inclusion) with the S button

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the Learn mode.
  6. The blue LED will be blinking in Mode 2 during the adding process.
  7. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

### Adding (inclusion) with a switch/push-button

  1. Connect the Device to a power supply.
  2. Check if the blue LED is blinking in Mode 1. If so, the Device is not added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2, etc.) 3 times within 3 seconds (this procedure puts the Device in Learn mode*). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. The blue LED will be blinking in Mode 2 during the adding process.
  6. The green LED will be blinking in Mode 1 if the Device is successfully added to a Z-Wave® network.

*Learn mode - a state that allows the Device to receive network information from the gateway.

### Exclusion Information

## Removing the Device from a Z-Wave® network (exclusion)

Note! The Device will be removed from your Z-Wave® network, but any custom configuration parameters will not be erased.

Note! All Device outputs (O, O1, O2, etc. - depending on the Device type) will turn the load 1s on/1s off /1s on/1s off if the Device is successfully added to/removed from a Z-Wave® network.

### Removing (exclusion) with the S button

  1. Connect the Device to a power supply.
  2. Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. To enter the Setting mode, quickly press and hold the S button on the Device until the LED turns solid blue.
  5. Quickly release and then press and hold (> 2s) the S button on the Device until the blue LED starts blinking in Mode 3. Releasing the S button will start the LEARN MODE.
  6. The blue LED will be blinking in Mode 2 during the removing process.
  7. The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.Note! In Setting mode, the Device has a timeout of 10s before entering again into Normal mode.

  


### Removing (exclusion) with a switch/push-button

  1. Connect the Device to a power supply.
  2. Check if the green LED is blinking in Mode 1. If so, the Device is added to a Z-Wave® network.
  3. Enable add/remove mode on the gateway.
  4. Toggle the switch/push-button connected to any of the SW terminals (SW, SW1, SW2,…) 3 times within 3 seconds (this procedure puts the Device in LEARN MODE). The Device must receive on/off signal 3 times, which means pressing the momentary switch 3 times, or toggling the switch on and off 3 times.
  5. The blue LED will be blinking in Mode 2 during the removing process.
  6. The blue LED will be blinking in Mode 1 if the Device is successfully removed from a Z-Wave® network.

### General Usage Information



## Channels

The following table summarises the channels available for the Wave 1 Mini -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch | 
| Alarm (heat) | alarm_heat | alarm_heat | temperature_hot | Switch | 

### Switch
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Alarm (heat)
Indicates if a heat alarm is triggered.

The ```alarm_heat``` channel is of type ```alarm_heat``` and supports the ```Switch``` item and is in the ```temperature_hot``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |



## Device Configuration

The following table provides a summary of the 14 configuration parameters available in the Wave 1 Mini.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | SW (SW1) Switch type | This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal. |
| 17 | Restore state of O (O1) after power failure | This parameter determines if the on/off status is saved and restored for the load connected to O (O1) after a power failure. |
| 19 | O (O1) Auto OFF with timer | If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or lo |
| 20 | O (O1) Auto ON with timer | If the load O (O1) is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an OFF command, either remotely (from the gateway or associated device) or l |
| 23 | O (O1) contact type - NO/NC | The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC). |
| 25 | Set timer units to s or ms for O (O1) | Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20. |
| 91 | Water Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 92 | Smoke Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 93 | CO Alarm | This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification. |
| 94 | Heat Alarm | This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification. |
| 120 | Factory Reset | Reset to factory default settings and removed from the Z-Wave network. |
| 201 | Serial Number 1 | This parameter contains a part of device’s serial number. |
| 202 | Serial Number 2 | This parameter contains a part of device’s serial number. |
| 203 | Serial Number 3 | This parameter contains a part of device’s serial number. |

### Parameter 1: SW (SW1) Switch type

This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal.
This parameter defines how the Device should treat the switch (which type) connected to the SW (SW1) terminal.

Value size: 1 Byte

Default value: 2

Values & descriptions:

0 - momentary switch,

1 - toggle switch (contact closed - ON / contact opened - OFF),

2 - toggle switch (device changes status when switch changes status)
The following option values may be configured, in addition to values in the range 0 to 2 -:

| Value  | Description |
|--------|-------------|
| 0 | momentary switch |
| 1 | toggle switch (contact closed - ON / contact opened - OFF) |
| 2 | toggle switch (device changes status when switch changes status) |

The manufacturer defined default value is ```2``` (toggle switch (device changes status when switch changes status)).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 17: Restore state of O (O1) after power failure

This parameter determines if the on/off status is saved and restored for the load connected to O (O1) after a power failure.
This parameter determines if the on/off status is saved and restored for the load connected to O (O1) after a power failure.

Values size: 1 Byte

Default value: 0

Values & descriptions:

0 - Device saves last on/off status and restores it after a power failure

1 - Device does not save on/off status and does not restore it after a power failure, it remains off
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Device saves last on/off status and restores it after a power failure |
| 1 | Device does not save on/off status and does not restore it after a pow |

The manufacturer defined default value is ```0``` (Device saves last on/off status and restores it after a power failure).

This parameter has the configuration ID ```config_17_1``` and is of type ```INTEGER```.


### Parameter 19: O (O1) Auto OFF with timer

If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or lo
If the load O (O1) is ON, you can schedule it to turn OFF automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an ON command, either remotely (from the gateway or associated device) or locally from the switch.

Values size: 2 Byte

Default value: 0

Values & their descriptions:

0 - Auto OFF Disabled

1 - 32535 = 1 - 32535 seconds (or milliseconds – see Parameter no. 25. Auto OFF timer enabled for a given amount of seconds (or milliseconds) resolution 100ms
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Auto OFF Disabled |

The manufacturer defined default value is ```0``` (Auto OFF Disabled).

This parameter has the configuration ID ```config_19_2``` and is of type ```INTEGER```.


### Parameter 20: O (O1) Auto ON with timer

If the load O (O1) is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an OFF command, either remotely (from the gateway or associated device) or l
If the load O (O1) is OFF, you can schedule it to turn ON automatically after the period of time defined in this parameter. The timer resets to zero each time the Device receives an OFF command, either remotely (from the gateway or associated device) or locally from the switch.

Values size: 2 Byte

Default value: 0

Values & their descriptions:

0 - Auto ON Disabled

1 - 32535 = 1 - 32535 seconds (or milliseconds – see Parameter no. 25. Auto ON timer enabled for a given amount of seconds (or milliseconds) resolution 100ms
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Auto ON Disabled |

The manufacturer defined default value is ```0``` (Auto ON Disabled).

This parameter has the configuration ID ```config_20_2``` and is of type ```INTEGER```.


### Parameter 23: O (O1) contact type - NO/NC

The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC).
The set value determines the relay contact type for output O (O1). The relay contact type can be normally open (NO) or normally closed (NC).

Values size: 1 Byte

Default value: 0

Values & descriptions:

0 - NO

1 - NC

Relay logic:

| par-NO/NC | command (switch, zwave,..) | Device output state |

| NO (0) | OFF | OFF (0 V) |

| NO (0) | ON | ON (230 V) |

| NC (1) | OFF | ON (230 V) |

| NC (1) | ON | OFF (0 V) |
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | NO |
| 1 | NC |

The manufacturer defined default value is ```0``` (NO).

This parameter has the configuration ID ```config_23_1``` and is of type ```INTEGER```.


### Parameter 25: Set timer units to s or ms for O (O1)

Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20.
Set the timer units to seconds or milliseconds. Choose if you want to set the timer in seconds or milliseconds in Parameters No. 19, 20.

Values size: 1 Byte

Default value: 0

Values & descriptions:

0 – timer set in seconds

1 – timer set in milliseconds
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | timer set in seconds |
| 1 | timer set in milliseconds |

The manufacturer defined default value is ```0``` (timer set in seconds).

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 91: Water Alarm

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.
This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

Values size: 4 Byte

Default value: 0

Values & descriptions:

0 no action

1 open relay

2 close relay
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_91_4``` and is of type ```INTEGER```.


### Parameter 92: Smoke Alarm

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.
This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

Values size: 4 Byte

Default value: 0

Values & descriptions:

0 no action

1 open relay

2 close relay
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_92_4``` and is of type ```INTEGER```.


### Parameter 93: CO Alarm

This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.
This parameter determines to which alarm frames and how the device should react. The parameters consist of 4 bytes, three most significant bytes are set according to the official Z-Wave protocol specification.

Values size: 4 Byte

Default value: 0

Values & descriptions:

0 no action

1 open relay

2 close relay
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_93_4``` and is of type ```INTEGER```.


### Parameter 94: Heat Alarm

This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.
This parameter determines which alarm frames the Device should respond to and how. The parameters consist of 4 bytes, the three most significant bytes are set according to the official Z-Wave protocol specification.

Values size: 4 Byte

Default value: 0

Values & descriptions:

0 no action

1 open relay

2 close relay
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | no action |
| 1 | open relay |
| 2 | close relay |

The manufacturer defined default value is ```0``` (no action).

This parameter has the configuration ID ```config_94_4``` and is of type ```INTEGER```.


### Parameter 120: Factory Reset

Reset to factory default settings and removed from the Z-Wave network.
Reset to factory default settings and removed from the Z-Wave network.

The parameter is Advanced and may be hidden under the Advanced tag.

Values size: 1 Byte

Default value: 0

Values & descriptions:

0 - Don’t do Factory reset

1 - Do the Factory resetThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
The following option values may be configured, in addition to values in the range 0 to 1 -:

| Value  | Description |
|--------|-------------|
| 0 | Don’t do Factory reset |
| 1 | Do the Factory reset |

The manufacturer defined default value is ```0``` (Don’t do Factory reset).

This parameter has the configuration ID ```config_120_1``` and is of type ```INTEGER```.


### Parameter 201: Serial Number 1

This parameter contains a part of device’s serial number.
This parameter contains a part of device’s serial number.

The parameter is Read-Only and cannot be changed.

The parameter is Advanced and may be hidden under the Advanced tag.

Values size: 4 Byte

Default value: Device specific

Values & descriptions:

0x00000000 - 0x7FFFFFFFThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_201_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 202: Serial Number 2

This parameter contains a part of device’s serial number.
This parameter contains a part of device’s serial number.

The parameter is Read-Only and cannot be changed.

The parameter is Advanced and may be hidden under the Advanced tag.

Values size: 4 Byte

Default value: Device specific

Values & descriptions:

0x00000000 - 0x7FFFFFFFThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_202_4``` and is of type ```INTEGER```.
This is a read only parameter.


### Parameter 203: Serial Number 3

This parameter contains a part of device’s serial number.
This parameter contains a part of device’s serial number.

The parameter is Read-Only and cannot be changed.

The parameter is Advanced and may be hidden under the Advanced tag.

Values size: 4 Byte

Default value: Device specific

Values & descriptions:

0x00000000 - 0x7FFFFFFFThis is an advanced parameter and will therefore not show in the user interface without entering advanced mode.
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_203_4``` and is of type ```INTEGER```.
This is a read only parameter.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The Wave 1 Mini supports 3 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
"Lifeline group" sends to the controlling device it's command class notifications and or command class reports when said command classes are triggered. Max. 9 nodes are allowed:
Association group 1 – "Lifeline group" sends to the controlling device it's command class notifications and or command class reports when said command classes are triggered. Max. 9 nodes are allowed:

Root device

Root Device - Association group 1 – Lifeline

INDICATOR_REPORT : LED status

DEVICE\_RESET\_LOCALLY_NOTIFICATION : triggered upon request

SWITCH\_BINARY\_REPORT : status change report for output O (O1)

NOTIFICATION_REPORT : triggered on Overheat

Association group 1 supports 9 nodes.

### Group 2: Association Group 2

It is assigned to switch connected to the SW (SW1) terminal (uses Basic command class).
Association Group 2

Allowed nodes: 9

It is assigned to switch connected to the SW (SW1) terminal (uses Basic command class).

Triggered by SW (SW1). The device sends according to the state of SW (SW1) (switch or push-button) the command BASIC\_SET ON or BASIC\_SET OFF to the associated device. This command is reflected to the output of associated device. Supports the following command classes:

BASIC_SET : set On / Off state at the associated device

Association group 2 supports 9 nodes.

### Group 3: Association Group 3

It is assigned to switch connected to the SW (SW1) terminal (uses Switch Multilevel command class). Triggered by SW (SW1).
Association Group 3

Allowed nodes: 9

It is assigned to switch connected to the SW (SW1) terminal (uses Switch Multilevel command class). Triggered by SW (SW1).

It is recommended to use push buttons for this association. Supports the following command classes:

SWITCH\_MULTILEVEL\_START\_LEVEL\_CHANGE : initiate a transition to a new level (increase or decrease light intensity in case of dimmer, or move shutter up or down, …)

SWITCH\_MULTILEVEL\_STOP\_LEVEL\_CHANGE : stop an ongoing transition (stop increase or decrease light intensity in case of dimmer, or stop moving shutter up or down, …)

Association group 3 supports 9 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| |
| COMMAND_CLASS_TRANSPORT_SERVICE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_SUPERVISION_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V8| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_INDICATOR_V3| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |
| COMMAND_CLASS_SECURITY_2_V1| |

### Documentation Links

* [Manual](https://opensmarthouse.org/zwavedatabase/1648/reference/Wave_1_multilang_2023_print_V11.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](https://opensmarthouse.org/zwavedatabase/1648).
