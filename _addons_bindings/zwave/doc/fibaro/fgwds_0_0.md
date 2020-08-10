---
layout: documentation
title: FGWDS - ZWave
---

{% include base.html %}

# FGWDS WALLI SWITCH FIBARO SINGLE SWITCH
This describes the Z-Wave device *FGWDS*, manufactured by *[Fibargroup](http://www.fibaro.com/)* with the thing type UID of ```fibaro_fgwds_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![FGWDS product image](https://www.cd-jackson.com/zwave_device_uploads/1094/1094_default.jpg)


The FGWDS supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

FIBARO Walli Single Switch is a smart wall switch designed to control one light sources via Z-Wave network. It measures active power and energy consumed by the controlled load. You can install it with provided cover plate or other compatible.   
Main features of FIBARO Walli Single Switch: 

  *  Can be used with:  
      * Conventional incandescent and halogen light sources, 
      *  LED lamps, 
      * Fluorescent lamps, 
      * Electronic transformers (for ELV halogen lamps and LED bulbs), 
      * Ferromagnetic transformers (for MLV halogen lamps). 
  * Can be used with provided cover plate or one of the following:  
      * GIRA – System 55 (Standard 55, E2, Event, Event Clear), 
      * Legrand – Céliane, 
      * Schneider – Odace. 
  * Active power and energy consumption metering. 
  * Supports Z-Wave network Security Modes: S0 with AES-128 encryption and S2 Authenticated with PRNG-based encryption. 
  * Works as Z-Wave signal repeater (all non-battery operated devices within the network will act as repeaters to increase reliability of the network). 
  * May be used with all devices certified with the Z-Wave Plus certificate and should be compatible with such devices produced by other manufacturers. 

### Inclusion Information

# To add the device to the Z-Wave network manually:

  1. Power the device.
  2. Set the main controller in (Security/non-Security Mode) add mode (see the controller’s manual).
  3. Quickly, three times click one of the buttons.
  4. If you are adding in Security S2 Authenticated, scan the DSK QR code or input the underlined part of the DSK (label on the bottom of the box).
  5. LED will start blinking yellow, wait for the adding process to end.

Adding result will be confirmed by the Z-Wave controller’s message and the LED frame:

  * Green - successful (non-secure, S0, S2 non-authenticated),
  * Magenta - successful (Security S2 Authenticated),
  * Red – not successful.

# To add the device to the Z-Wave network using SmartStart:

  1. Set the main controller in Security S2 Authenticated add mode (see the controller’s manual). 
  2. Scan the DSK QR code or input the underlined part of the DSK (label on the bottom of the box).
  3. Power the device.
  4. Wait for the adding process to start (up to few minutes), which is signaled with yellow LED blinking.

Adding result will be confirmed by the Z-Wave controller’s message and the LED frame:

  *  Green - successful (non-secure, S0, S2 non-authenticated),
  * Magenta - successful (Security S2 Authenticated),
  * Red – not successful.

### Exclusion Information

To remove the device from the Z-Wave network:

  1. Power the device.
  2. Set the main controller into remove mode (see the controller’s manual).
  3. Quickly, three times click one of the buttons.
  4. LED will start blinking yellow, wait for the removing process to end.
  5. Successful removing will be confirmed by the Z-Wave controller’s message and red LED colour.

### General Usage Information

# Factory reset:

Reset procedure allows to restore the device back to its factory settings, which means all information about the Z-Wave controller and user configuration will be deleted. Resetting to factory defaults does not reset energy consumption memory.

  1. Quickly, three times click, then press and hold one of the buttons to enter the menu.
  2. Release the button when the device glows yellow.
  3. Quickly click the button to confirm.
  4. After a few seconds the device will be restarted, which is signalled with the red LED colour.

## Channels

The following table summarises the channels available for the FGWDS -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Switch Binary | switch_binary | switch_binary | Switch | Switch | 
| Electric meter (kWh) | meter_kwh | meter_kwh | Energy | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 

### Switch Binary
Switch the power on and off.

The ```switch_binary``` channel is of type ```switch_binary``` and supports the ```Switch``` item and is in the ```Switch``` category.

### Electric meter (kWh)
Indicates the energy consumption (kWh).

The ```meter_kwh``` channel is of type ```meter_kwh``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.



## Device Configuration

The following table provides a summary of the 39 configuration parameters available in the FGWDS.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Remember device state | Remember device state |
| 2 | First channel – overload safety switch | First channel – overload safety switch |
| 3 | Second channel – overload safety switch | Second channel – overload safety switch |
| 10 | LED frame – power limit | LED frame – power limit |
| 11 | LED frame – colour when ON | LED frame – colour when ON |
| 12 | LED frame – colour when OFF | LED frame – colour when OFF |
| 13 | 	LED frame – brightness | LED frame – brightness |
| 20 | Buttons operation | Buttons operation |
| 24 | Buttons orientation | Buttons orientation |
| 25 | Outputs orientation | Outputs orientation |
| 30 | Alarm configuration - 1st slot | Alarm configuration - 1st slot |
| 31 | Alarm configuration - 2nd slot | Alarm configuration - 2nd slot |
| 32 | Alarm configuration - 3rd slot | Alarm configuration - 3rd slot |
| 33 | Alarm configuration - 4th slot | Alarm configuration - 4th slot |
| 34 | Alarm configuration - 5th slot | Alarm configuration - 5th slot |
| 35 | Alarm configuration – duration | Alarm configuration – duration |
| 40 | First button – scenes sent | First button – scenes sent |
| 41 | Second button – scenes sent | Second button – scenes sent |
| 60 | Power reports – include self-consumption | Power reports – include self-consumption |
| 61 | Power reports for first channel – on change | Power reports for first channel – on change |
| 62 | Power reports for first channel – periodic | Power reports for first channel – periodic |
| 63 | 	Power reports for second channel – on change | Power reports for second channel – on change |
| 64 | Power reports for second channel – periodic | Power reports for second channel – periodic |
| 65 | Energy reports for first channel – on change | Energy reports for first channel – on change |
| 66 | Energy reports for first channel – periodic | Energy reports for first channel – periodic |
| 67 | Energy reports for second channel – on change | Energy reports for second channel – on change |
| 68 | Energy reports for second channel – periodic | Energy reports for second channel – periodic |
| 150 | First channel – operating mode | First channel – operating mode |
| 151 | Second channel – operating mode | Second channel – operating mode |
| 152 | chan1reactdelayedoff | First channel - reaction to switch for delayed OFF / pulse modes |
| 153 | chan2reactdelayedoff | Second channel - reaction to switch for delayed OFF / pulse modes |
| 154 | chan1timedelayedoff | First channel - time parameter for delayed OFF / pulse modes |
| 155 | chan2timedelayedoff | Second channel - time parameter for delayed OFF / pulse modes |
| 156 | chan1onsent23assgp | First channel – Switch ON value sent to 2nd and 3rd association groups |
| 157 | chan1offsent23assgp | First channel – Switch OFF value sent to 2nd and 3rd association groups |
| 158 | chan1doclicsent23assgp | First channel – Double Click value sent to 2nd and 3rd association groups |
| 159 | chan2onsent45assgp | Second channel – Switch ON value sent to 4th and 5th association groups |
| 160 | chan2offsent45assgp | Second channel – Switch OFF value sent to 4th and 5th association groups |
| 161 | chan2doclicsent23assgp | Second channel – Double Click value sent to 4th and 5th association groups |

### Parameter 1: Remember device state

Remember device state

Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: First channel – overload safety switch

First channel – overload safety switch
<table>
  <tr>
    <td>
      0 (default)
    </td>
    
    <td>
      function disabled
    </td>
  </tr>
  
  <tr>
    <td>
      10 to 36200
    </td>
    
    <td>
      (1.0-3620.0W, step 0.1W) – power threshold
    </td>
  </tr>
</table>
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_2_4``` and is of type ```INTEGER```.


### Parameter 3: Second channel – overload safety switch

Second channel – overload safety switch
<table>
  <tr>
    <td>
      0 (default)
    </td>
    
    <td>
      function disabled
    </td>
  </tr>
  
  <tr>
    <td>
      10 to 36200
    </td>
    
    <td>
      (1.0-3620.0W, step 0.1W) – power threshold
    </td>
  </tr>
</table>
Values in the range 0 to 36200 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_3_4``` and is of type ```INTEGER```.


### Parameter 10: LED frame – power limit

LED frame – power limit
(50.0-3680.0W, step 0.1W) – power threshold
Values in the range 500 to 36800 may be set.

The manufacturer defined default value is ```36800```.

This parameter has the configuration ID ```config_10_4``` and is of type ```INTEGER```.


### Parameter 11: LED frame – colour when ON

LED frame – colour when ON
<table>
  <tr>
    <td>
    </td>
    
    <td>
      LED disabled
    </td>
  </tr>
  
  <tr>
    <td>
      1 (Default)
    </td>
    
    <td>
      White
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      Red
    </td>
  </tr>
  
  <tr>
    <td>
      3
    </td>
    
    <td>
      Green
    </td>
  </tr>
  
  <tr>
    <td>
      4
    </td>
    
    <td>
      Blue
    </td>
  </tr>
  
  <tr>
    <td>
      5
    </td>
    
    <td>
      Yellow
    </td>
  </tr>
  
  <tr>
    <td>
      6
    </td>
    
    <td>
      Cyan
    </td>
  </tr>
  
  <tr>
    <td>
      7
    </td>
    
    <td>
      Magenta
    </td>
  </tr>
  
  <tr>
    <td>
      8
    </td>
    
    <td>
      colour changes smoothly depending on measured power
    </td>
  </tr>
  
  <tr>
    <td>
      9
    </td>
    
    <td>
      colour changes in steps depending on measured power
    </td>
  </tr>
</table>
Values in the range 0 to 9 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_11_1``` and is of type ```INTEGER```.


### Parameter 12: LED frame – colour when OFF

LED frame – colour when OFF
<table>
  <tr>
    <td>
      0 (default)
    </td>
    
    <td>
      LED disabled
    </td>
  </tr>
  
  <tr>
    <td>
      1
    </td>
    
    <td>
      White
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      Red
    </td>
  </tr>
  
  <tr>
    <td>
      3
    </td>
    
    <td>
      Green
    </td>
  </tr>
  
  <tr>
    <td>
      4
    </td>
    
    <td>
      Blue
    </td>
  </tr>
  
  <tr>
    <td>
      5
    </td>
    
    <td>
      Yellow
    </td>
  </tr>
  
  <tr>
    <td>
      6
    </td>
    
    <td>
      Cyan
    </td>
  </tr>
  
  <tr>
    <td>
      7
    </td>
    
    <td>
      Magenta
    </td>
  </tr>
</table>
Values in the range 0 to 7 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_12_1``` and is of type ```INTEGER```.


### Parameter 13: 	LED frame – brightness

LED frame – brightness
<table>
  <tr>
    <td>
    </td>
    
    <td>
      LED disable
    </td>
  </tr>
  
  <tr>
    <td>
      1 to 100<br />(Default)
    </td>
    
    <td>
      (1-100% brightness)
    </td>
  </tr>
  
  <tr>
    <td>
      101
    </td>
    
    <td>
      brightness directly proportional to measured power
    </td>
  </tr>
  
  <tr>
    <td>
      102
    </td>
    
    <td>
      brightness inversely proportional to measured power
    </td>
  </tr>
</table>
Values in the range 0 to 102 may be set.

The manufacturer defined default value is ```100```.

This parameter has the configuration ID ```config_13_1``` and is of type ```INTEGER```.


### Parameter 20: Buttons operation

Buttons operation
<table>
  <tr>
    <td>
      1 (default)
    </td>
    
    <td>
      1 st and 2nd button toggle the load
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      1st button turns the load ON, 2nd button turns the load OFF
    </td>
  </tr>
  
  <tr>
    <td>
      3
    </td>
    
    <td>
      device works in 2-way/3-way switch configuration
    </td>
  </tr>
</table>
Values in the range 1 to 3 may be set.

The manufacturer defined default value is ```1```.

This parameter has the configuration ID ```config_20_1``` and is of type ```INTEGER```.


### Parameter 24: Buttons orientation

Buttons orientation
<table>
  <tr>
    <td>
      0 (default)
    </td>
    
    <td>
      default (1st button controls 1st channel, 2nd button controls 2nd channel)
    </td>
  </tr>
  
  <tr>
    <td>
      1
    </td>
    
    <td>
      reversed (1st button controls 2nd channel, 2nd button controls 1st channel)
    </td>
  </tr>
</table>
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_24_1``` and is of type ```INTEGER```.


### Parameter 25: Outputs orientation

Outputs orientation
<table>
  <tr>
    <td>
      0 (default)
    </td>
    
    <td>
      default (Q1 - 1st channel, Q2 - 2nd channel)
    </td>
  </tr>
  
  <tr>
    <td>
      1
    </td>
    
    <td>
      reversed (Q1 - 2nd channel, Q2 - 1st channel)
    </td>
  </tr>
</table>
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_25_1``` and is of type ```INTEGER```.


### Parameter 30: Alarm configuration - 1st slot

Alarm configuration - 1st slot
<table>
  <tr>
    <td>
       
    </td>
    
    <td>
      1 to 0
    </td>
    
    <td>
      [MSB] – Notification Type
    </td>
  </tr>
  
  <tr>
    <td>
       
    </td>
    
    <td>
      2
    </td>
    
    <td>
      Notification Value
    </td>
  </tr>
  
  <tr>
    <td>
       
    </td>
    
    <td>
      3
    </td>
    
    <td>
      Event/State Parameters
    </td>
  </tr>
  
  <tr>
    <td>
       
    </td>
    
    <td>
      4
    </td>
    
    <td>
      [LSB] – action
    </td>
  </tr>
</table>
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_30_4``` and is of type ```INTEGER```.


### Parameter 31: Alarm configuration - 2nd slot

Alarm configuration - 2nd slot
<table>
  <tr>
    <td>
      1
    </td>
    
    <td>
      [MSB] – Notification Type
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      Notification Value
    </td>
  </tr>
  
  <tr>
    <td>
      3
    </td>
    
    <td>
      Event/State Parameters
    </td>
  </tr>
  
  <tr>
    <td>
      4
    </td>
    
    <td>
      [LSB] – action
    </td>
  </tr>
</table>
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_31_4``` and is of type ```INTEGER```.


### Parameter 32: Alarm configuration - 3rd slot

Alarm configuration - 3rd slot
<table>
  <tr>
    <td>
      1
    </td>
    
    <td>
      [MSB] – Notification Type
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      Notification Value
    </td>
  </tr>
  
  <tr>
    <td>
      3
    </td>
    
    <td>
      Event/State Parameters
    </td>
  </tr>
  
  <tr>
    <td>
      4
    </td>
    
    <td>
      [LSB] – action
    </td>
  </tr>
</table>
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_32_4``` and is of type ```INTEGER```.


### Parameter 33: Alarm configuration - 4th slot

Alarm configuration - 4th slot
<table>
  <tr>
    <td>
      0 (default)
    </td>
    
    <td>
      Notification Type
    </td>
  </tr>
  
  <tr>
    <td>
      1
    </td>
    
    <td>
      [MSB] – Notification Type
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      Notification Status
    </td>
  </tr>
  
  <tr>
    <td>
      3
    </td>
    
    <td>
      Event/State Parameters
    </td>
  </tr>
  
  <tr>
    <td>
      4
    </td>
    
    <td>
      [LSB] – action
    </td>
  </tr>
</table>
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_33_4``` and is of type ```INTEGER```.


### Parameter 34: Alarm configuration - 5th slot

Alarm configuration - 5th slot
<table>
  <tr>
    <td>
      1
    </td>
    
    <td>
      [MSB] – Notification Type
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      Notification Status
    </td>
  </tr>
  
  <tr>
    <td>
      3
    </td>
    
    <td>
      Event/State Parameters
    </td>
  </tr>
  
  <tr>
    <td>
      4
    </td>
    
    <td>
      [LSB] - action
    </td>
  </tr>
</table>
Values in the range 0 to 4 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_34_4``` and is of type ```INTEGER```.


### Parameter 35: Alarm configuration – duration

Alarm configuration – duration
<table>
  <tr>
    <td>
    </td>
    
    <td>
      infinite
    </td>
  </tr>
  
  <tr>
    <td>
      1 to 32400<br />(Default)
    </td>
    
    <td>
      (1s-9h, 1s step) – duration
    </td>
  </tr>
</table>
Values in the range 0 to 32400 may be set.

The manufacturer defined default value is ```32400```.

This parameter has the configuration ID ```config_35_2``` and is of type ```INTEGER```.


### Parameter 40: First button – scenes sent

First button – scenes sent
<table>
  <tr>
    <td>
      1
    </td>
    
    <td>
      Key pressed 1 time
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      Key pressed 2 time
    </td>
  </tr>
  
  <tr>
    <td>
      4
    </td>
    
    <td>
      Key pressed 3 time
    </td>
  </tr>
  
  <tr>
    <td>
      8
    </td>
    
    <td>
      Key hold down and key released
    </td>
  </tr>
</table>
Values in the range 0 to 8 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_40_1``` and is of type ```INTEGER```.


### Parameter 41: Second button – scenes sent

Second button – scenes sent
<table>
  <tr>
    <td>
      1
    </td>
    
    <td>
      Key pressed 1 time
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      Key pressed 2 time
    </td>
  </tr>
  
  <tr>
    <td>
      4
    </td>
    
    <td>
      Key pressed 3 time
    </td>
  </tr>
  
  <tr>
    <td>
      8
    </td>
    
    <td>
      Key hold down and key released
    </td>
  </tr>
</table>
Values in the range 0 to 8 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_41_1``` and is of type ```INTEGER```.


### Parameter 60: Power reports – include self-consumption

Power reports – include self-consumption
<table>
  <tr>
    <td>
      0 (default)
    </td>
    
    <td>
      Self-consumption not included
    </td>
  </tr>
  
  <tr>
    <td>
      1
    </td>
    
    <td>
      Self-consumption included
    </td>
  </tr>
</table>
Values in the range 0 to 1 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_60_1``` and is of type ```INTEGER```.


### Parameter 61: Power reports for first channel – on change

Power reports for first channel – on change
<table>
  <tr>
    <td>
    </td>
    
    <td>
      reporting on change disabled
    </td>
  </tr>
  
  <tr>
    <td>
      1 to 500<br />(Default)
    </td>
    
    <td>
      (1-500%, 1% step) – minimal change
    </td>
  </tr>
</table>
Values in the range 0 to 500 may be set.

The manufacturer defined default value is ```500```.

This parameter has the configuration ID ```config_61_2``` and is of type ```INTEGER```.


### Parameter 62: Power reports for first channel – periodic

Power reports for first channel – periodic
<table>
  <tr>
    <td>
    </td>
    
    <td>
      periodic reports disabled
    </td>
  </tr>
  
  <tr>
    <td>
      30 to 32400<br />(Default)
    </td>
    
    <td>
      (30s-9h, 1s step) – time interval
    </td>
  </tr>
</table>
Values in the range 0 to 32400 may be set.

The manufacturer defined default value is ```32400```.

This parameter has the configuration ID ```config_62_2``` and is of type ```INTEGER```.


### Parameter 63: 	Power reports for second channel – on change

Power reports for second channel – on change
<table>
  <tr>
    <td>
    </td>
    
    <td>
      reporting on change disabled
    </td>
  </tr>
  
  <tr>
    <td>
      1 to 500<br />(Default)
    </td>
    
    <td>
      (1-500%, 1% step) – minimal change
    </td>
  </tr>
</table>
Values in the range 0 to 500 may be set.

The manufacturer defined default value is ```500```.

This parameter has the configuration ID ```config_63_2``` and is of type ```INTEGER```.


### Parameter 64: Power reports for second channel – periodic

Power reports for second channel – periodic
<table>
  <tr>
    <td>
    </td>
    
    <td>
      periodic reports disabled
    </td>
  </tr>
  
  <tr>
    <td>
      30 to 32400<br />(Default)
    </td>
    
    <td>
      (30s-9h, 1s step) – time interval
    </td>
  </tr>
</table>
Values in the range 0 to 32400 may be set.

The manufacturer defined default value is ```32400```.

This parameter has the configuration ID ```config_64_2``` and is of type ```INTEGER```.


### Parameter 65: Energy reports for first channel – on change

Energy reports for first channel – on change
<table>
  <tr>
    <td>
    </td>
    
    <td>
      reporting on change disabled
    </td>
  </tr>
  
  <tr>
    <td>
      1 to 500<br />(Default)
    </td>
    
    <td>
      (0.01-5kWh, 0.01kWh step) – minimal change
    </td>
  </tr>
</table>
Values in the range 0 to 500 may be set.

The manufacturer defined default value is ```500```.

This parameter has the configuration ID ```config_65_2``` and is of type ```INTEGER```.


### Parameter 66: Energy reports for first channel – periodic

Energy reports for first channel – periodic
<table>
  <tr>
    <td>
    </td>
    
    <td>
      periodic reports disabled
    </td>
  </tr>
  
  <tr>
    <td>
      30 to 32400<br />(Default)
    </td>
    
    <td>
      (30s-9h, 1s step) – time interval
    </td>
  </tr>
</table>
Values in the range 0 to 32400 may be set.

The manufacturer defined default value is ```32400```.

This parameter has the configuration ID ```config_66_2``` and is of type ```INTEGER```.


### Parameter 67: Energy reports for second channel – on change

Energy reports for second channel – on change
<table>
  <tr>
    <td>
    </td>
    
    <td>
      reporting on change disabled
    </td>
  </tr>
  
  <tr>
    <td>
      1 to 500<br />(Default)
    </td>
    
    <td>
      (0.01-5kWh, 0.01kWh step) – minimal change
    </td>
  </tr>
</table>
Values in the range 0 to 500 may be set.

The manufacturer defined default value is ```500```.

This parameter has the configuration ID ```config_67_2``` and is of type ```INTEGER```.


### Parameter 68: Energy reports for second channel – periodic

Energy reports for second channel – periodic
<table>
  <tr>
    <td>
    </td>
    
    <td>
      periodic reports disabled
    </td>
  </tr>
  
  <tr>
    <td>
      30 to 32400<br />(Default)
    </td>
    
    <td>
      (30s-9h, 1s step) – time interval
    </td>
  </tr>
</table>
Values in the range 0 to 32400 may be set.

The manufacturer defined default value is ```32400```.

This parameter has the configuration ID ```config_68_2``` and is of type ```INTEGER```.


### Parameter 150: First channel – operating mode

First channel – operating mode
<table>
  <tr>
    <td>
      0 (default)
    </td>
    
    <td>
      standard operation
    </td>
  </tr>
  
  <tr>
    <td>
      1
    </td>
    
    <td>
      delayed OFF
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      single pulse
    </td>
  </tr>
</table>
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_150_1``` and is of type ```INTEGER```.


### Parameter 151: Second channel – operating mode

Second channel – operating mode
<table>
  <tr>
    <td>
      0 (defaut)
    </td>
    
    <td>
      standard operation
    </td>
  </tr>
  
  <tr>
    <td>
      1
    </td>
    
    <td>
      delayed OFF
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      single pulse
    </td>
  </tr>
</table>
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_151_1``` and is of type ```INTEGER```.


### Parameter 152: chan1reactdelayedoff

First channel - reaction to switch for delayed OFF / pulse modes
<table>
  <tr>
    <td>
      0(default)
    </td>
    
    <td>
      cancel mode and set default state
    </td>
  </tr>
  
  <tr>
    <td>
      1
    </td>
    
    <td>
      no reaction - mode runs until it ends
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      reset timer - start counting from the beginning
    </td>
  </tr>
</table>
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_152_1``` and is of type ```INTEGER```.


### Parameter 153: chan2reactdelayedoff

Second channel - reaction to switch for delayed OFF / pulse modes
<table>
  <tr>
    <td>
      0(default)
    </td>
    
    <td>
      cancel mode and set default state
    </td>
  </tr>
  
  <tr>
    <td>
      1
    </td>
    
    <td>
      no reaction - mode runs until it ends
    </td>
  </tr>
  
  <tr>
    <td>
      2
    </td>
    
    <td>
      reset timer - start counting from the beginning
    </td>
  </tr>
</table>
Values in the range 0 to 2 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_153_1``` and is of type ```INTEGER```.


### Parameter 154: chan1timedelayedoff

First channel - time parameter for delayed OFF / pulse modes
<table>
  <tr>
    <td>
    </td>
    
    <td>
      0.1 second
    </td>
  </tr>
  
  <tr>
    <td>
      1 to 32000<br />(Default)
    </td>
    
    <td>
      (1-32000s, 1s step) – time parameter
    </td>
  </tr>
</table>
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```32000```.

This parameter has the configuration ID ```config_154_2``` and is of type ```INTEGER```.


### Parameter 155: chan2timedelayedoff

Second channel - time parameter for delayed OFF / pulse modes
<table>
  <tr>
    <td>
    </td>
    
    <td>
      0.1 second
    </td>
  </tr>
  
  <tr>
    <td>
      1 to 32000<br />(Default)
    </td>
    
    <td>
      (1-32000s, 1s step) – time parameter
    </td>
  </tr>
</table>
Values in the range 0 to 32000 may be set.

The manufacturer defined default value is ```32000```.

This parameter has the configuration ID ```config_155_2``` and is of type ```INTEGER```.


### Parameter 156: chan1onsent23assgp

First channel – Switch ON value sent to 2nd and 3rd association groups
<table>
  <tr>
    <td>
      0 to 99
    </td>
    
    <td>
      2nd association group
    </td>
  </tr>
  
  <tr>
    <td>
      255 (default)
    </td>
    
    <td>
      3rd association group
    </td>
  </tr>
</table>
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```255```.

This parameter has the configuration ID ```config_156_2``` and is of type ```INTEGER```.


### Parameter 157: chan1offsent23assgp

First channel – Switch OFF value sent to 2nd and 3rd association groups
<table>
  <tr>
    <td>
      0 to 99 (default)
    </td>
    
    <td>
      2nd association group
    </td>
  </tr>
  
  <tr>
    <td>
      255
    </td>
    
    <td>
      3rd association group
    </td>
  </tr>
</table>
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_157_2``` and is of type ```INTEGER```.


### Parameter 158: chan1doclicsent23assgp

First channel – Double Click value sent to 2nd and 3rd association groups
<table>
  <tr>
    <td>
      0 to 99 (default)
    </td>
    
    <td>
      2nd association group
    </td>
  </tr>
  
  <tr>
    <td>
      255
    </td>
    
    <td>
      3rd association group
    </td>
  </tr>
</table>
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_158_2``` and is of type ```INTEGER```.


### Parameter 159: chan2onsent45assgp

Second channel – Switch ON value sent to 4th and 5th association groups
<table>
  <tr>
    <td>
      0 to 99
    </td>
    
    <td>
      4th association group
    </td>
  </tr>
  
  <tr>
    <td>
      255<br />(Default)
    </td>
    
    <td>
      5th association group
    </td>
  </tr>
</table>
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_159_2``` and is of type ```INTEGER```.


### Parameter 160: chan2offsent45assgp

Second channel – Switch OFF value sent to 4th and 5th association groups
<table>
  <tr>
    <td>
      0 to 99 (default)
    </td>
    
    <td>
      4th association group
    </td>
  </tr>
  
  <tr>
    <td>
      255
    </td>
    
    <td>
      5th association group
    </td>
  </tr>
</table>
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_160_2``` and is of type ```INTEGER```.


### Parameter 161: chan2doclicsent23assgp

Second channel – Double Click value sent to 4th and 5th association groups
<table>
  <tr>
    <td>
      0 to 99 (default)
    </td>
    
    <td>
      4th association group
    </td>
  </tr>
  
  <tr>
    <td>
      255
    </td>
    
    <td>
      5th association group
    </td>
  </tr>
</table>
Values in the range 0 to 255 may be set.

The manufacturer defined default value is ```99```.

This parameter has the configuration ID ```config_161_2``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The FGWDS supports 5 association groups.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
“Lifeline” reports the device status
1st association group – “Lifeline” reports the device status and allows for assigning single device only (main controller by default).

Association group 1 supports 1 node.

### Group 2: 1st channel On/Off 

(uses Basic command class).
2nd association group – “On/Off (1)” is used to turn the associated devices on/off reflecting button operation for 1st channel (uses Basic command class).

Association group 2 supports 5 nodes.

### Group 3: 1st channel dimmer

(uses Switch Multilevel command class).
3rd association group – “Dimmer (1)” is used to change level of associated devices reflecting button operation for 1st channel (uses Switch Multilevel command class).

Association group 3 supports 5 nodes.

### Group 4: 2nd channel On/Off

(uses Basic command class).
4th association group* – “On/Off (2)” is used to turn the associated devices on/off reflecting button operation for 2nd channel (uses Basic command class).

Association group 4 supports 5 nodes.

### Group 5: 2nd channel dimmer

(uses Switch Multilevel command class).
5th association group* – “Dimmer (2)” is used to change level of associated devices reflecting button operation for 2nd channel (uses Switch Multilevel command class).

Association group 5 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_BINARY_V1| Linked to BASIC|
| COMMAND_CLASS_METER_V3| |
| COMMAND_CLASS_CRC_16_ENCAP_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_CENTRAL_SCENE_V3| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V2| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V2| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_PROTECTION_V2| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V4| |
| COMMAND_CLASS_ASSOCIATION_V1| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V2| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1094/FGWDSEU-221-T-EN-v1-0.pdf)
* [Fibaro Walli Switch Manual](https://www.cd-jackson.com/zwave_device_uploads/1094/FGWDSEU-221-T-EN-v1-1.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1094).
