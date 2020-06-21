---
layout: documentation
title: FF-ZWAVE5-ECO - ZWave
---

{% include base.html %}

# FF-ZWAVE5-ECO Firefighter Audio Detector
This describes the Z-Wave device *FF-ZWAVE5-ECO*, manufactured by *Ecolink* with the thing type UID of ```eco_firefighter5_00_000```.

The device is in the category of *Smoke Detector*, defining Smoke detectors.

![FF-ZWAVE5-ECO product image](https://www.cd-jackson.com/zwave_device_uploads/1221/1221_default.jpg)


The FF-ZWAVE5-ECO supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is unable to participate in the routing of data from other devices.

The FF-ZWAVE5-ECO does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. Refer to the *Wakeup Information* section below for further information.

## Overview

**Overview:**

The Ecolink Audio detector sensor listens to existing smoke or CO detectors in the home and sends signal to your Z-Wave network. In most homes, with hardwired interconnected smoke detectors, only one sensor is needed for whole home coverage.

  * provides fire and CO (carbon monoxide) status
  * Transmits Fire and CO alarm status
  * Reports tamper condition when cover is open

This device implements Z-Wave Plus functionality, Network Wide Inclusion, and Explorer frames.  This device is asleep most of the time but can respond to queries on a Wake Up Notification; however for test purposes, the device will stay awake while tampered for testing Z-Wave Plus command class functionality.

**LED Status:**

The FireFighter sensor is equipped with a multi-color LED.  The state of the LED will change based on the state of the device.

<table>
  <tr>
    <td>
      Insert Battery
    </td>
    
    <td>
      One (or two, if in CO mode) RED blink, then one GREEN blink
    </td>
  </tr>
  
  <tr>
    <td>
      Device not included 
    </td>
    
    <td>
      Green light breathing (slow blink)
    </td>
  </tr>
  
  <tr>
    <td>
      Learn button pressed
    </td>
    
    <td>
      Solid Yellow (red+green) while in learn mode
    </td>
  </tr>
  
  <tr>
    <td>
      Sound detected
    </td>
    
    <td>
      Flash YELLOW for the duration of the sound
    </td>
  </tr>
  
  <tr>
    <td>
      Fire Alarm Detected
    </td>
    
    <td>
      Solid RED for 3 seconds, then blink red while tone detected
    </td>
  </tr>
  
  <tr>
    <td>
      Case Opened
    </td>
    
    <td>
      Red/Green breathing until case closed (while added to a network)
    </td>
  </tr>
</table>

  
**CO Alarm Detection:**

In addition to smoke alarm detection, the FireFighter sensor can detect the presence of a carbon monoxide alarm. By default, the sensor is not guaranteed to detect a CO alarm.  The device can be configured to more reliably detect a CO alarm in exchange for a reduced battery life. This mode can be changed by holding down the tamper switch and the learn button for 10 seconds. The device should then be reset (remove battery and replace) in order to determine the current device setting.

RED + GREEN           = Device will not reliably detect CO, but standard battery life

RED + RED + GREEN = Device will more reliably detect CO, but with reduced battery life

**Factory Default:**

The FireFighter sensor can be restored back to factory default settings which will remove its Z-Wave Plus node ID from the sensor (but not the controller) with the following steps.  Please use this procedure only when the network primary controller is missing or otherwise inoperable.

  1. Put the battery into the sensor
  2. Do no press the tamper switch
  3. Hold the learn button down for 10 seconds until the LED turns RED
  4. Release the learn button and wait for the sensor's green LED to "breath" on and off continuously. The sensor is now ready to be added to a Z-Wave Plus network, and all settings have been restored.

**Testing:**

To test the RF transmission from the mounted position you can generate a tamper by removing the cover. This will send a signal to the controller. To test the audio detection, press and hold the smoke detector's test button. Ensure the FireFighter cover is on and that you wear hearing protection.

### Inclusion Information

Open the FireFighter case and press the learn button on the device for one second.  If the LED starts blinking continually, the sensor has not been added and you need to repeat the process after putting the controller into inclusion mode again.

### Exclusion Information

Open the FireFighter case and press the learn button on the device for one second.  If successfully removed from the Z-Wave Plus network, the device's Green LED should blink slowly and continuously.

### Wakeup Information

The FF-ZWAVE5-ECO does not permanently listen for messages sent from the controller - it will periodically wake up automatically to check if the controller has messages to send, but will sleep most of the time to conserve battery life. The wakeup period can be configured in the user interface - it is advisable not to make this too short as it will impact battery life - a reasonable compromise is 1 hour.

The wakeup period does not impact the devices ability to report events or sensor data. The device can be manually woken with a button press on the device as described below - note that triggering a device to send an event is not the same as a wakeup notification, and this will not allow the controller to communicate with the device.


The sensor will wake up every so often to send a Wake-Up Notification to allow the life line master node controller that the sensor is now available for any queued messages that the controller may have for the sensor.  The time between Wake-Up Notifications can be configured with the Wake-Up Notification command class to be between 1 hour and 1 week with interval steps of 200 seconds.  The sensor will also send a wakeup notification whenever the case is closed.

## Channels

The following table summarises the channels available for the FF-ZWAVE5-ECO -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary |  | Switch | 
| Temperature | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (temperature) | sensor_temperature | sensor_temperature | Temperature | Number:Temperature | 
| Sensor (general) | sensor_general | sensor_general |  | Number | 
| Electric meter (watts) | meter_watts | meter_watts | Energy | Number | 
| Alarm (burglar) | alarm_burglar | alarm_burglar | Door | Switch | 
| Alarm (smoke) | alarm_smoke | alarm_smoke | Smoke | Switch | 
| Alarm (CO) | alarm_co | alarm_co |  | Switch | 
| Alarm (power) | alarm_power | alarm_power | Energy | Switch | 
| Tamper Alarm | alarm_tamper | alarm_tamper |  | Switch | 
| Battery Level | battery-level | system.battery_level | Battery | Number |

### Binary Sensor
Indicates if a sensor has triggered.

The ```sensor_binary``` channel is of type ```sensor_binary``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| ON | Triggered |
| OFF | Untriggered |

### Temperature
The FireFighter sensor has a temperature sensor built into the device and can be queried on a Wake Up Notification with a Multi-Level Sensor Get command. The sensor supports reporting both in Celsius and Fahrenheit.

Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (temperature)
Indicates the current temperature.

The ```sensor_temperature``` channel is of type ```sensor_temperature``` and supports the ```Number:Temperature``` item and is in the ```Temperature``` category.

### Sensor (general)


The ```sensor_general``` channel is of type ```sensor_general``` and supports the ```Number``` item. This is a read only channel so will only be updated following state changes from the device.

### Electric meter (watts)
Indicates the instantaneous power consumption.

The ```meter_watts``` channel is of type ```meter_watts``` and supports the ```Number``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

### Alarm (burglar)
Indicates if the burglar alarm is triggered.

The ```alarm_burglar``` channel is of type ```alarm_burglar``` and supports the ```Switch``` item and is in the ```Door``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (smoke)
Indicates if a smoke is triggered.

The ```alarm_smoke``` channel is of type ```alarm_smoke``` and supports the ```Switch``` item and is in the ```Smoke``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (CO)
Indicates if the carbon monoxide alarm is triggered.

The ```alarm_co``` channel is of type ```alarm_co``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Alarm (power)
Indicates if a power alarm is triggered.

The ```alarm_power``` channel is of type ```alarm_power``` and supports the ```Switch``` item and is in the ```Energy``` category. This is a read only channel so will only be updated following state changes from the device.

The following state translation is provided for this channel to the ```Switch``` item type -:

| Value | Label     |
|-------|-----------|
| OFF | OK |
| ON | Alarm |

### Tamper Alarm
Indicates if the tamper alarm is triggered.

The ```alarm_tamper``` channel is of type ```alarm_tamper``` and supports the ```Switch``` item. This is a read only channel so will only be updated following state changes from the device.

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

The following table provides a summary of the 1 configuration parameters available in the FF-ZWAVE5-ECO.
Detailed information on each parameter can be found in the sections below.

| Param | Name  | Description |
|-------|-------|-------------|
| 1 | Mode: Smoke Alarm/Combo Smoke CO alarm | Sensor Mode |
|  | Wakeup Interval | Sets the interval at which the device will accept commands from the controller |
|  | Wakeup Node | Sets the node ID of the device to receive the wakeup notifications |

### Parameter 1: Mode: Smoke Alarm/Combo Smoke CO alarm

Sensor Mode
Enables the sensor to detect smoke alarm signals from a smoke detector or alarm signals from a smoke alarm and carbon monoxide alarm combo device. Allowed parameter values:

0xA5  = Smoke alarm detection only

0xFF   = Smoke and carbon monoxide alarm detection
The following option values may be configured, in addition to values in the range 165 to 255 -:

| Value  | Description |
|--------|-------------|
| 165 | Smoke alarm detection only |
| 255 | Smoke and carbon monoxide alarm detection |

The manufacturer defined default value is ```165``` (Smoke alarm detection only).

This parameter has the configuration ID ```config_1_1``` and is of type ```INTEGER```.

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

The FF-ZWAVE5-ECO supports 1 association group.

### Group 1: Lifeline

The Lifeline association group reports device status to a hub and is not designed to control other devices directly. When using the Lineline group with a hub, in most cases, only the lifeline group will need to be configured and normally the hub will perform this automatically during the device initialisation.
Will receive unsolicited messages relating to Fire notifications, CO notifications, case tampering notifications, low-battery notifications, and temperature notifications.

Association group 1 supports 5 nodes.

## Technical Information

### Endpoints

#### Endpoint 0

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_NO_OPERATION_V1| |
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SENSOR_BINARY_V1| |
| COMMAND_CLASS_SENSOR_MULTILEVEL_V7| |
| COMMAND_CLASS_METER_V1| |
| COMMAND_CLASS_METER_PULSE_V1| |
| COMMAND_CLASS_ASSOCIATION_GRP_INFO_V1| |
| COMMAND_CLASS_DEVICE_RESET_LOCALLY_V1| |
| COMMAND_CLASS_ZWAVEPLUS_INFO_V1| |
| COMMAND_CLASS_CONFIGURATION_V1| |
| COMMAND_CLASS_ALARM_V5| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_POWERLEVEL_V1| |
| COMMAND_CLASS_FIRMWARE_UPDATE_MD_V1| |
| COMMAND_CLASS_BATTERY_V1| |
| COMMAND_CLASS_WAKE_UP_V2| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V2| |

### Documentation Links

* [Manual](https://www.cd-jackson.com/zwave_device_uploads/1221/ecolink-z-wave-plus-fire-fighter-smoke-fire-carbon-monoxide-audio-alarm-detector.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/1221).
