---
layout: documentation
title: Oomi Multisensor - ZWave
---

{% include base.html %}

# Oomi Multisensor Oomi Multisensor
This describes the Z-Wave device *Oomi Multisensor*, manufactured by *[Fantem](http://www.oomi.com/)* with the thing type UID of ```oomi_oomimultisensor_00_000```.

The device is in the category of *Sensor*, defining Device used to measure something.

![Oomi Multisensor product image](https://www.cd-jackson.com/zwave_device_uploads/975/975_default.png)


The Oomi Multisensor supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The Oomi Multisensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

#### Oomi by Fantem’ MultiSensor looks like nothing that has come before. It’s a motion sensor and it’s also so much more. Installing this 1 piece of Z-Wave®technology is the same as installing 6 pieces of Z-Wave technology. Your home control network will immediately understand motion, temperature, humidity,light, Ultraviolet and Vibration readings wherever MultiSensor is installed. Those intelligent readings will equate to intelligent automation. And intelligent automation will give you the perfect smart home.  
MultiSensor can be powered by battery or by USB with an appropriate adaptor.

#### Technical Specifications

  * Power Input: 5V 1A
  * Battery Type: 2x CR123A (not included)
  * Temperature Sensor Range: 32ºf -104ºf (0ºc -40ºc)
  * Motion Sensor Field of View: 100º
  * Motion Sensor Range: 16 feet
  * Humidity Sensor Range: 20-80%
  * Light Sensor Range: 0-30000 Lux
  * UV Sensor Range: 1-11 Index level
  * Dimensions: 1.8 x 1.8 x 1.5 inches

Model number: FT100  
Power supply: USB DC 5V or battery power(2×CR123A batteries, 3V, 1500mAh).  
Operating temperature: 0°C to 40°C.  
Measured temperature range: -10°C to 50°C. Accuracy: ±1°C.  
Measured humidity range: 20%RH to 90%RH. Accuracy: ±3%RH (at 25°C).  
Lighting: 0 LUX to 30000 LUX.  
Max motion sensitivity: 5 metres.  
Water proofing: IP20.  
NFC operating distance: Maximum 30mm.  
Z-wave operating distance: Up to 492 feet/150 metres outdoors

### Inclusion Information

1. Set your Z-Wave gateway to accept new products.

2. Press the Action Button on your MultiSensor.

3.Test that your sensor has been successfully added your Z-Wave gateway by pressing its Action Button. If you press the button and its LED is solid green for a few seconds, then inclusion has been successful. If the LED blinks green when the button is pressed, the inclusion has been unsuccessful and you should repeat the above steps.

### Exclusion Information

Your MultiSensor can be removed from your Z-Wave network at any time.You’ll need to use your Z-Wave network’s main controller to do this and the following instructions tell you how to do this using Aeotec by Aeon Labs’ Z-Stick and Minimote controllers. If you are using other products as your main Z-Wave controller, please refer to the part of their respective manuals that tells you how remove devices from your network.  
  


**If you’re using a Z-Stick:**

1. If your Z-Stick is plugged into a gateway or a computer, unplug it.

2. Take your Z-Stick to your MultiSensor.

3. Press and hold the Action Button on your Z-Stick for 3 seconds and then release.

4. Press the Action Button on your MultiSensor.

5. If your MultiSensor has been successfully removed from your network, the RGB LED will be active with a colourful gradient for 3 seconds. When you press the Action Button on the MultiSensor, its green LED will blink. If the removal was unsuccessful, the green LED will stay solid for a few seconds when you press the Action Button. Press the Action Button on the Z-Stick to take it out of removal mode.  
  


**If you’re using a Minimote:**

1. Take your Minimote to your MultiSensor.

2. Press the Remove Button on your Minimote.

3. Press the Action Button on your MultiSensor.

4. If your MultiSensor has been successfully removed from your network, the RGB LED will be active with a colourful gradient for 3 seconds. When you press the Action Button on the MultiSensor, its green LED will blink. If the removal was unsuccessful, the green LED will stay solid for a few seconds when you press the Action Button.

5. Press any button on your Minimote to take it out of removal mode.

### Wakeup Information

The Oomi Multisensor does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


If your MultiSensor is battery powered, you will need to ensure that it is active when configuring it. To do this, press the Action Button once, which will trigger to send out a wake up notification command. If you want it to wake up for 10 minutes, to do this, press and hold its Action Button for 3 seconds and then release it. Your MultiSensor’s orange LED will fast blink for 10 minutes to indicate that it is active. When you are done configuring or communicating with your MultiSensor, you can put it back into sleep mode to conserve battery power. To do this, press and hold its Action button for 3 seconds and then release it. Your MultiSensor’s LED should now be off to indicate that it is asleep.

### General Usage Information

**Resetting your MultiSensor**

At some stage or your primary controller is missing or inoperable, you may also wish to reset all of your MultiSensor’s settings to their factory defaults. To do this, press and hold the Action Button for 20 seconds and then release it. Your MultiSensor will now be reset to its original settings, and the green LED will be solid for 2 seconds and then be colourful gradient to confirm a success.

## Channels

The following table summarises the channels available for the Oomi Multisensor -:

| Channel | Channel Id | Category | Item Type |
|---------|------------|----------|-----------|
| Sensor (temperature) | sensor_temperature | Temperature | Number:Temperature | 
| Alarm (burglar) | alarm_burglar | Door | Switch | 
| Battery Level | battery-level | Battery | Number |

### Sensor (temperature)

Indicates the current temperature.

The ```sensor_temperature``` channel supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Alarm (burglar)

Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Battery Level

Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading.

The ```battery-level``` channel supports the ```Number``` item and is in the ```Battery``` category.



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
| COMMAND_CLASS_SENSOR_MULTILEVEL_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V1| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V1| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/975/Oomi-MultiSensor-manual2.pdf)
* [User Guide](https://www.cd-jackson.com/zwave_device_uploads/975/UG-Multisensor-V4.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/975).
