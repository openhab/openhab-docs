---
layout: documentation
title: DMDP1 - ZWave
---

{% include base.html %}

# DMDP1 Dome Window and Door Sensor Pro
This describes the Z-Wave device *DMDP1*, manufactured by *Elexa Consumer Products Inc.* with the thing type UID of ```elexa_dmdp1_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![DMDP1 product image](https://www.cd-jackson.com/zwave_device_uploads/884/884_default.jpg)


The DMDP1 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The DMDP1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

From Dome Home Automation, monitor every door in your house with the window / door sensor PRO, including your mailbox door! The Door/Window PRO magnet is 1/4” wide, and the magnet can be placed up to one inch away from the sensor which means you can place it nearly anywhere to keep track of openings in places you may have never thought possible. Use the Dome Home Automation Z-Wave Door/Window Sensor PRO to secure cabinets, windows, doors and other fixtures you want to keep closed or monitor activity around. Did we mention the PRO’s battery life is 10 years and it has a range of 260 feet? And just when you thought it couldn't get any better, the new Door/Window Sensor Pro also monitors the ambient temperature! Use the temperature information to monitor for extreme temperature fluctuation and keep your house safe from frozen pipes or damaged flooring.

### Inclusion Information

**Inclusion - New Installation**

  1. For proper inclusion, bring the Door/Window Sensor to the final location where it will be used*.
  2. Follow the instructions for your Z-Wave controller to enter inclusion mode.
  3. Remove the Battery Tab protruding from the Battery Tab Slit.
  4. The device will automatically enter inclusion mode for two minutes and the LED Indicator will alternate between green and red.

Upon successful inclusion the LED Indicator will flash green three times then stop blinking.

**Inclusion - Re-Installation**

  1. For proper inclusion, bring the Door/Window Sensorto the final location where it will be used*.
  2. Follow the instructions for your Z-Wave controller to enter inclusion mode.
  3. Remove the Sensor Cover and the LED Indicator will start blinking yellow.
  4. Press the Button quickly 3 times in a row.
  5. The device will enter inclusion mode for two minutes and the LED Indicator will alternate between green and red.

After successful inclusion, the LED Indicator will flash green three times then blink red until the cover is replaced.

### Exclusion Information

**Exclusion**

Follow the instructions for your Z-Wave Certified Controller to enter exclusion mode. When prompted by the controller:

  1. Remove the SENSOR COVER and the LED Indicator will start blinking red.
  2. Press the Button quickly 3 times in a row.

The LED Indicator will flash green three times indicating exclusion/disconnection and will then continue flashing red (indicating tamper) until the cover is replaced.

### Wakeup Information

The DMDP1 does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


**Waking Up the Door/Window Sensor Pro**

Because the Mouser is a battery powered device, it wakes up on regular intervals to give battery and other status updates to the controller, as well as to accept configuration settings from the controller. This helps to extend the battery life. The device can be forced to wake up to submit these reports or accept new settings immediately by simply pressing and holding the BUTTON for half a second. The LED INDICATOR will flash once indicating successful wake up.

### General Usage Information

### Description & Features

The Dome Door/Window Sensor is a battery powered security-enabled\* Z-Wave Plus magnetic reed switch that can monitor the status of doors, windows, and anything else that opens and closes. It can also report ambient temperature levels. The Door/Window Sensor consists of two parts - the “sensor,” and the “magnet.” The sensor has a “reed switch” inside, which is sensitive to the magnet’s presence when aligned properly and within the defined distance. When the sensor and magnet are brought together or pulled apart, the sensor will report its open/close status to its Z-Wave controller, and the encrypted wireless communication\* ensures that user data remains secure. Because many manufacturers use Z-Wave to communicate, the Door/Window Sensor can interact with different products of different categories.

**Key Features**

  * Temperature Sensor
  * Up to 220’ range
  * Ten-Year Battery Life
  * Z-Wave Signal Strength Indication
  * 1” Max distance between sensor & magnet
  * Ultra-Narrow (1/4”) Magnet (for Placement Between Door and Casing)
  * Z-Wave Plus Certified
  * S0 Security-Enabled*
  * Monitor doors, windows, medicine cabinets, drawers, garage doors, and many other openings

*A security-enabled Z-Wave Plus controller is required to use all features of the Door/Window Sensor. 

### Specifications

**Technical Specifications**

<table>
  <tr>
    <td>
      Radio protocol
    </td>
    
    <td>
      Z-Wave(500 series)
    </td>
  </tr>
  
  <tr>
    <td>
      Power supply
    </td>
    
    <td>
      Single CR14505 3.6V battery
    </td>
  </tr>
  
  <tr>
    <td>
      Working current
    </td>
    
    <td>
      35mA
    </td>
  </tr>
  
  <tr>
    <td>
      Standby current
    </td>
    
    <td>
      7uA
    </td>
  </tr>
  
  <tr>
    <td>
      Radio frequency
    </td>
    
    <td>
      908.4 MHz US
    </td>
  </tr>
  
  <tr>
    <td>
      Range
    </td>
    
    <td>
      Up to 150’ depending on environment
    </td>
  </tr>
  
  <tr>
    <td>
      Dimensions (L x W x H)
    </td>
    
    <td>
      Sensor: 2.9” x 0.85” x 0.87” (75 x 21 x 22 mm) <br /> Magnet: 1.6” x 0.25” x 0.5” (40 x 6.35 x 12 mm)
    </td>
  </tr>
  
  <tr>
    <td>
      Package Contents
    </td>
    
    <td>
      User Manual, Sensor, Magnet, Battery, Double-Stick Tape, 2x Screws, 2x Wall Anchors
    </td>
  </tr>
</table>

### Factory Reset & Misc. Functions

**Resetting the Door/Window Sensor Pro**

If needed, the Door/Window Sensor Pro can be reset locally by following these steps. Only do this when your Z-Wave controller is disconnected or otherwise unreachable. Beware that resetting your device will disconnect it from the system

  1. Remove the Sensor Cover and confirm that your Door/Window Sensor is powered up.
  2. Wait for 5 seconds.
  3. Move the Magnet and Sensor Base in and out of the closed position 6 times.
  4. The LED Indicator will light up red for two seconds when reset successfully.

The Door/Window Sensor’s memory will be erased to factory settings.

### Physical Installation

The Door/Window Sensor can be install with double stick tape or the provided screws. The device should already be included in your Z-Wave system before continuing further.

**Pre-Installation Checklist**

  * The Magnet Assembly and Sensor Assembly should be less than 1-1/4” apart when closed (Figure 3.)
  * Hold the Magnet Assembly and Sensor Assembly in place by hand where you wish to install them, move them in and out of the closed position, and make sure the LED Indicator blinks in response. This will confirm that the door and frame are spaced correctly to accommodate the sensor.
  * When moving the Magnet and Sensor in and out of the closed position, a Green followed by another Green or Red LED Indicator corresponds to Excellent or Poor Z-Wave Signal strength respectively.
  * Make sure the Sensor Cover Release Button will be accessible in the final position.
  * The Magnet is small enough (only 1/4” wide) to fit in the groove between the door and the casing.
  * Finally, confirm that you are still within range of your Z-Wave controller.

Figure 3 - Placing the Door/Window Sensor on the Door

**Installation Using Double-Stick Tape**

  1. Wipe the door and door-frame clean of dust and anything else that will interfere with the tape’s stickiness.
  2. Peel the double-stick tape and adhere the Sensor Assembly to the door surface.
  3. Repeat the process for the Magnet Assembly, making sure the Magnet Assembly, and Sensor Assembly are no more than 1-1/4” apart when closed. The lines on the sides of the Magnet Assembly, and Sensor Assembly should be in line.
  4. Open and close the door to make sure the sensor works as expected (the LED Indicator blinks) and that the signal reaches your Z-Wave controller.

**Installation Using Screws**

Figure 4 - Installing the Door/Window Sensor With Screws

  1. Remove the Sensor Cover and Battery from the Sensor Base and the Magnet Cover from the Magnet Base.
  2. Hold the Sensor Base in place and drive the included screws through the screw holes into the door.
  3. Repeat the process for the Magnet Assembly, making sure the Magnet Assembly, and Sensor Assembly are no more than 1-1/4” apart when the door is closed. The lines on the sides of the MAGNET and SENSOR should be in line.
  4. Replace the Battery, Sensor Cover, and Magnet Cover.
  5. Open and close the door to make sure the sensor works as expected (the LED Indicator blinks) and that the signal reaches your Z-Wave controller.  

### LED Behavior

<table>
  <tr>
    <td>
      Green
    </td>
    
    <td>
      Blinks Twice Within 5 Seconds
    </td>
    
    <td>
      …the sensor Detects the Magnet (door) moving, and the Z-Wave signal reached the controller.
    </td>
  </tr>
  
  <tr>
    <td>
      Blinks 3 times quickly
    </td>
    
    <td>
      …the device is successfully included into the system.
    </td>
  </tr>
  
  <tr>
    <td>
      Red
    </td>
    
    <td>
      Stays on for 2 seconds
    </td>
    
    <td>
      …the device is reset to factory settings.
    </td>
  </tr>
  
  <tr>
    <td>
      Blinks 3 Times quickly
    </td>
    
    <td>
      … the Button is pressed 3 times quickly and the device is excluded from the network.
    </td>
  </tr>
  
  <tr>
    <td>
      Blinks indefinitely
    </td>
    
    <td>
      …the Sensor Cover is removed and the device is already included in a system.
    </td>
  </tr>
  
  <tr>
    <td>
      Yellow (Green + Red)
    </td>
    
    <td>
      Blinks Indefinitely
    </td>
    
    <td>
      …the Sensor Cover is removed and the device is not yet included in a system.
    </td>
  </tr>
  
  <tr>
    <td>
      Red & Green Alternating
    </td>
    
    <td>
      Two Flashes (Green-Red) Within 5 Seconds
    </td>
    
    <td>
      …the sensor Detects the Magnet moving away or getting close (as the Door is opened or closed) and the Z-Wave signal was not received.
    </td>
  </tr>
  
  <tr>
    <td>
      Flashing in alternating colors
    </td>
    
    <td>
      …the Door/Window Sensor is in inclusion mode. It will continue blinking and remain in inclusion mode for up to two minutes, until it is included in a system.
    </td>
  </tr>
</table>

Table 2 - LED Behavior   

### Button Behavior

<table>
  <tr>
    <td>
      Open the Cover
    </td>
    
    <td>
      Door/Window Sensor Not Yet Included in System
    </td>
    
    <td>
      LED Indicator blinks yellow (red + green) until the Sensor Cover is replaced
    </td>
  </tr>
  
  <tr>
    <td>
      Door/Window Sensor Already Included in System
    </td>
    
    <td>
      Device sends a tamper notification to its controller, and the LED Indicator blinks red until the Sensor Cover is replaced
    </td>
  </tr>
  
  <tr>
    <td>
      Push CONNECT BUTTON 3 Times
    </td>
    
    <td>
      Door/Window Sensor Already Included in System
    </td>
    
    <td>
      Device sends node info to Group 1
    </td>
  </tr>
  
  <tr>
    <td>
      Door/Window Sensor Already Included, and Controller is in Exclusion Mode
    </td>
    
    <td>
      Device is excluded from the system and removes the Home ID from its memory
    </td>
  </tr>
  
  <tr>
    <td>
      Door/Window Sensor Not Yet Included in System, and Controller is in Inclusion Mode
    </td>
    
    <td>
      Device enters inclusion mode and includes into whichever network is also in inclusion mode
    </td>
  </tr>
  
  <tr>
    <td>
      Move the Magnet and Sensor In and Out of the Closed Position 6 Times with Cover Removed
    </td>
    
    <td>
      Door/Window Sensor Already Included in System
    </td>
    
    <td>
      Device will be reset to factory settings, and a DEVICE_RESET_LOCALLY command will be sent to Group 1
    </td>
  </tr>
  
  <tr>
    <td>
      Any condition (as long as the device has power)
    </td>
    
    <td>
      The device’s memory will erase to factory default settings and any associations, configuration parameters, and other locally saved data will be lost
    </td>
  </tr>
  
  <tr>
    <td>
      Press the Button Once
    </td>
    
    <td>
      Door/Window Sensor Is Already Included in System
    </td>
    
    <td>
      Device sends a wake up notification to Node 1.
    </td>
  </tr>
</table>

Table 3 - Button Behavior

## Channels

The following table summarises the channels available for the DMDP1 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Alarm (access) | alarm_access | alarm_access | Door | Switch | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Alarm (access)
Indicates if the access control alarm is triggered.

The ```alarm_access``` channel is of type ```alarm_access``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (burglar)
Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Battery Level
Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```system.battery-level``` channel is of type ```system.battery-level``` and supports the ```Number``` item and is in the ```Battery``` category.
This channel provides the battery level as a percentage and also reflects the low battery warning state. If the battery state is in low battery warning state, this will read 0%.


## Device Configuration

The following table provides a summary of the 9 configuration parameters available in the DMDP1.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Enable/Disable LED Indicator | Enable/Disable LED Indicator |
| 2 | Configure Open/Close Reports Sent | Configure Open/Close Reports Sent |
| 3 | Switch Between Notification and Binary Sensor | Switch Between Notification and Binary Sensor Command Classes |
| 4 | Enable/Disable Temperature Sensor | Enable/Disable Temperature Sensor |
| 5 | Temperature offset | Temperature offset |
| 6 | Temperature Units | Temperature Units |
| 7 | Basic Set Value (Group 2) | Basic Set Value (Group 2) |
| 8 | Basic Set Value (Group 3) | Basic Set Value (Group 3) |
| 9 | Basic Set Value (Group 4) | Basic Set Value (Group 4) |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Enable/Disable LED Indicator

Enable/Disable LED Indicator
This parameter enables or disables the LED Indicator flashing to indicate opening and closing events. The Door/Window Sensor will always flash the LED Indicator for inclusion, exclusion, tamper, and other system events.

<table>
  <tr>
    <td>
      Size
    </td>
    
    <td>
      Name
    </td>
    
    <td>
      Available Values
    </td>
    
    <td>
      Default Value
    </td>
  </tr>
  
  <tr>
    <td>
      01
    </td>
    
    <td>
      Enable/Disable LED Indicator
    </td>
    
    <td>
      00 (Open/Close LED Indicator Disabled)<br />01 (Open/Close LED Indicator Enabled)
    </td>
    
    <td>
      01 <br /> (Open/Close LED Indicator Enabled)
    </td>
  </tr>
</table>
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Open/Close LED Indicator Disabled |
| 1 | Open/Close LED Indicator Enabled |

The manufacturer defined default value is ```1``` (Open/Close LED Indicator Enabled).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.


### Parameter 2: Configure Open/Close Reports Sent

Configure Open/Close Reports Sent
This parameter switches the Notification or Binary Sensor report sent when the door opens or closes. If this parameter is set to 01, the Door/Window Sensor will report “closed” instead of “open”when the Magnet and Sensor are pulled apart.

<table>
  <tr>
    <td>
      Size
    </td>
    
    <td>
      Name
    </td>
    
    <td>
      Available Values
    </td>
    
    <td>
      Default Value
    </td>
  </tr>
  
  <tr>
    <td>
      01
    </td>
    
    <td>
      Configure Open/Close Reports Sent
    </td>
    
    <td>
      00 (Reports Closed when Magnet is close)<br />01 (Reports Open when Magnet is close)
    </td>
    
    <td>
      00 <br /> (Reports Closed when Magnet is close)
    </td>
  </tr>
</table>
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Reports Closed when Magnet is close |
| 1 | Reports Open when Magnet is close |

The manufacturer defined default value is ```0``` (Reports Closed when Magnet is close).

This parameter has the configuration ID ```config_2_1``` and is of type ```INTEGER```.


### Parameter 3: Switch Between Notification and Binary Sensor

Switch Between Notification and Binary Sensor Command Classes
By default, the Door/Window Sensor uses the Notification command class to communicate open/close and tamper events. If this Parameter is set to 1, the device will instead use the Binary Sensor command class.

<table>
  <tr>
    <td>
      Size
    </td>
    
    <td>
      Name
    </td>
    
    <td>
      Available Values
    </td>
    
    <td>
      Default Value
    </td>
  </tr>
  
  <tr>
    <td>
      01
    </td>
    
    <td>
      Switch Between Notification and Binary Sensor Command Classes
    </td>
    
    <td>
      00 (Notification Command Class is Used)<br />01 (Binary Sensor Command Class is Used)
    </td>
    
    <td>
      00 <br /> (Notification Command Class is Used)
    </td>
  </tr>
</table>
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Notification Command Class is Used |
| 1 | Binary Sensor Command Class is Used |

The manufacturer defined default value is ```0``` (Notification Command Class is Used).

This parameter has the configuration ID ```config_3_1``` and is of type ```INTEGER```.


### Parameter 4: Enable/Disable Temperature Sensor

Enable/Disable Temperature Sensor
The Door/Window Sensor can also monitor and report ambient temperature conditions. However, temperature sensing functionality is disabled by default to save battery life, and this configuration parameter is used to enable or disable this feature.

<table>
  <tr>
    <td>
      Size
    </td>
    
    <td>
      Name
    </td>
    
    <td>
      Available Values
    </td>
    
    <td>
      Default Value
    </td>
  </tr>
  
  <tr>
    <td>
      01
    </td>
    
    <td>
      Enable/Disable Temperature Sensor
    </td>
    
    <td>
      00 (Temperature Sensor Disabled)<br />01 (Temperature Sensor Enabled)
    </td>
    
    <td>
      00 <br /> (Temperature Sensor Disabled)
    </td>
  </tr>
</table>
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Temperature Sensor Disabled |
| 1 | Temperature Sensor Enabled |

The manufacturer defined default value is ```0``` (Temperature Sensor Disabled).

This parameter has the configuration ID ```config_4_1``` and is of type ```INTEGER```.


### Parameter 5: Temperature offset

Temperature offset
This Configuration Parameter can offset the temperature value reported by ± 125 degrees to compensate for temperature variances in a room - for example, the temperature near the ceiling in a room is significantly higher than the average temperature of the same room. This Parameter accepts a signed 8-bit value with an absolute value of up to 125, and its units are Dependant on Configuration Parameter 07

<table>
  <tr>
    <td>
      Size
    </td>
    
    <td>
      Name
    </td>
    
    <td>
      Available Values
    </td>
    
    <td>
      Default Value
    </td>
  </tr>
  
  <tr>
    <td>
      01
    </td>
    
    <td>
      Temperature offset
    </td>
    
    <td>
      00 ~ 7D (0°~125°)<br />83 ~ FF (-125° ~ -1°)
    </td>
    
    <td>
      00 <br /> (0° Offset)
    </td>
  </tr>
</table>
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_5_1``` and is of type ```INTEGER```.


### Parameter 6: Temperature Units

Temperature Units
The Door/Window Sensor can report temperature values in either Celsius or Fahrenheit, and this parameter allows the user to decide which unit is used.

<table>
  <tr>
    <td>
      Size
    </td>
    
    <td>
      Name
    </td>
    
    <td>
      Available Values
    </td>
    
    <td>
      Default Value
    </td>
  </tr>
  
  <tr>
    <td>
      01
    </td>
    
    <td>
      Temperature Units
    </td>
    
    <td>
      00 (Temperature Reported in Fahrenheit)<br />01 (Temperature Reported in Celsius)
    </td>
    
    <td>
      00 <br /> (Temperature Reported in Fahrenheit)
    </td>
  </tr>
</table>
The following option values may be configured -:

| Value  | Description |
|--------|-------------|
| 0 | Temperature Reported in Fahrenheit |
| 1 | Temperature Reported in Celsius |

The manufacturer defined default value is ```0``` (Temperature Reported in Fahrenheit).

This parameter has the configuration ID ```config_6_1``` and is of type ```INTEGER```.


### Parameter 7: Basic Set Value (Group 2)

Basic Set Value (Group 2)
This parameter sets the value sent by the Basic Set command to Association Group 2 (for more information, see “Association Group Info”.)

<table>
  <tr>
    <td>
      Size
    </td>
    
    <td>
      Name
    </td>
    
    <td>
      Available Values
    </td>
    
    <td>
      Default Value
    </td>
  </tr>
  
  <tr>
    <td>
      01
    </td>
    
    <td>
      Basic Set Value (Group 2)
    </td>
    
    <td>
      00 (0/Turn Off Device)<br />01 ~ 63 (0-99)<br />FF (255/Turn On Device)
    </td>
    
    <td>
      FF <br /> (255/Turn On Device)
    </td>
  </tr>
</table>
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_7_1``` and is of type ```INTEGER```.


### Parameter 8: Basic Set Value (Group 3)

Basic Set Value (Group 3)
This parameter sets the value sent by the Basic Set command to Association Group 3. The Door/Window Sensor sends a Basic Set command to Association Group 4 when the door or window opens (for more information, see “Association Group Info”.)

<table>
  <tr>
    <td>
      Size
    </td>
    
    <td>
      Name
    </td>
    
    <td>
      Available Values
    </td>
    
    <td>
      Default Value
    </td>
  </tr>
  
  <tr>
    <td>
      01
    </td>
    
    <td>
      Basic Set Value (Group 2)
    </td>
    
    <td>
      00 (0/Turn Off Device)<br />01 ~ 63 (0-99)<br />FF (255/Turn On Device)
    </td>
    
    <td>
      FF <br /> (255/Turn On Device)
    </td>
  </tr>
</table>
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_8_1``` and is of type ```INTEGER```.


### Parameter 9: Basic Set Value (Group 4)

Basic Set Value (Group 4)
This parameter sets the value sent by the Basic Set command to Association Group 4.The Door/Window Sensor sends a Basic Set command to Association Group 4 when the door or window opens (for more information, see “Association Group Info”.)

<table>
  <tr>
    <td>
      Size
    </td>
    
    <td>
      Name
    </td>
    
    <td>
      Available Values
    </td>
    
    <td>
      Default Values
    </td>
  </tr>
  
  <tr>
    <td>
      01
    </td>
    
    <td>
      Basic Set Value (Group 4)
    </td>
    
    <td>
      00 (0/Turn Off Device)<br />01 ~ 63 (0-99)<br />FF (-1/Turn On Device)
    </td>
    
    <td>
      FF <br /> (-1/Turn On Device)
    </td>
  </tr>
</table>
Values in the range 0 to 0 may be set.

The manufacturer defined default value is ```0```.

This parameter has the configuration ID ```config_9_1``` and is of type ```INTEGER```.

### Wakeup Interval

The wakeup interval sets the period at which the device will listen for messages from the controller. This is required for battery devices that sleep most of the time in order to conserve battery life. The device will wake up at this interval and send a message to the controller to tell it that it can accept messages - after a few seconds, it will go back to sleep if there is no further communications. 

This setting is defined in *seconds*. It is advisable not to set this interval too short or it could impact battery life. A period of 1 hour (3600 seconds) is suitable in most instances.

Note that this setting does not affect the devices ability to send sensor data, or notification events.

This parameter has the configuration ID ```wakeup_interval``` and is of type ```INTEGER```.

### Wakeup Node

When sleeping devices wake up, they send a notification to a listening device. Normally, this device is the network controller, and normally the controller will set this automatically to its own address.
In the event that the network contains multiple controllers, it may be necessary to configure this to a node that is not the main controller. This is an advanced setting and should not be changed without a full understanding of the impact.

This parameter has the configuration ID ```wakeup_node``` and is of type ```INTEGER```.


## Association Groups

Association groups allow the device to send unsolicited reports to the controller, or other devices in the network. Using association groups can allow you to eliminate polling, providing instant feedback of a device state change without unnecessary network traffic.

The DMDP1 supports 5 association groups.

### Group 1: Group 1

Group 1 (Lifeline Group)
Group 1 is the “Lifeline” group, which can hold five members, typically including the main Z-Wave controller. The Door/Window Sensor sends this group a Notification Report or a Binary Sensor Report when it is opened or closed (see Configuration Parameter 3.) It also sends this group a multilevel sensor report to report the temperature and a Battery Report in response to Battery Get commands.

Association group 1 supports 5 nodes.

### Group 2: Group 2

Group 2
Group 2 supports up to 5 members and the Door/Window Sensor sends a Basic Set command to this group (or the Control Group) to directly trigger devices (like a light, chime, etc.) when the tamper switch either opens or closes. The value of the Basic Set command (e.g. brightness of the lamp) is configured using configuration parameter 07.

Association group 2 supports 5 nodes.

### Group 3: Group 3

Group 3
Group 3 supports up to 5 members and the Door/Window Sensor sends it a NOTIFICATION\_REPORT or SENSOR\_BINARY_REPORT when the tamper switch either opens or closes.

Association group 3 supports 5 nodes.

### Group 4: Group 4

Group 4
Group 4 supports up to 5 members and the Door/Window Sensor sends a Basic Set command to this group to directly trigger devices (like a light, chime, etc.) when the sensor detects the door/window opening. The value of the Basic Set command (e.g. brightness of the lamp) is configured using configuration parameter 08 and 09.

Association group 4 supports 5 nodes.

### Group 5: Group 5

Group 5
Group 5 supports up to 5 members and the Door/Window Sensor sends it a NOTIFICATION\_REPORT or SENSOR\_BINARY_REPORT when the sensor detects the door/window opening.

Association group 5 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V2| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V4| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V3| |
| COMMAND_CLASS_SECURITY_V1| |

### Documentation Links

* [Dome Door Sensor Manual](https://www.cd-jackson.com/zwave_device_uploads/884/Dome-Door-Sensor-Manual.pdf)
* [Dome API Documentation](https://www.cd-jackson.com/zwave_device_uploads/884/Dome-API-Documentation.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/884).
