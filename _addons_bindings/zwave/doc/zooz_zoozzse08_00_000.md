---
layout: documentation
title: ZSE08 - ZWave
---

{% include base.html %}

# ZSE08 Zooz Z-Wave Plus Contact Sensor

This describes the Z-Wave device *ZSE08*, manufactured by *Zooz* with the thing type UID of ```zooz_zoozzse08_00_000```. 

Zooz Z-Wave Plus Contact Sensor  


## Overview 

**WELL DONE!** 

You have picked the finest solution for your smart home, congratulations! Now it's time to enjoy these great features of your new Contact Sensor:

 *  Reliable open/close detection for doors, windows, cabinets, and drawers
 *  Wireless notifications and event triggers (when included to a Z-Wave gateway controller)
 *  Scene inclusion for custom automation scenarios when included to a Z-Wave gateway controller
 *  Low battery alerts
 *  Z-Wave Plus with improved 500 chip for faster and safer wireless communication
 *  Discreet compact design

**SPECIFICATIONS**

 *  Model Number: ZSE08
 *  Z-Wave Signal Frequency: 908.42 MHz
 *  Power: 1 CR2 battery (included)
 *  Power Consumption: 0.13W
 *  Operating Temperature: 32 – 104 F
 *  Range: Up to 100 feet line of sight
 *  Installation and Use: Indoor only
 *  Dimensions: 2 ¾” x ¾”
 *  Weight: ½ oz

**Z-WAVE COMMAND CLASSES**

This device requires the following command classes to be supported and recognized by your Z-Wave controller:

 *  COMMAND\_CLASS\_ZWAVEPLUS\_INFO (V2)
 *  COMMAND\_CLASS\_VERSION (V2)
 *  COMMAND\_CLASS\_MANUFACTURER\_SPECIFIC (V2)
 *  COMMAND\_CLASS\_DEVICE\_RESET\_LOCALLY (V1)
 *  COMMAND\_CLASS\_POWERLEVEL (V1)
 *  COMMAND\_CLASS\_BATTERY (V1)
 *  COMMAND\_CLASS\_ASSOCIATION (V2)
 *  COMMAND\_CLASS\_ASSOCIATION\_GRP\_INFO (V1)
 *  COMMAND\_CLASS\_WAKE\_UP (V2)
 *  COMMAND\_CLASS\_NOTIFICATION (V4)
    
     *  NOTIFICATION\_REPORT
     *  NOTIFICATION\_TYPE\_ACCESS\_CONTROL
     *  NOTIFICATION\_EVENT\_ACCESS\_CONTROL\_WINDOW\_OR\_DOOR\_IS\_OPENED
     *  NOTIFICATION\_EVENT\_ACCESS\_CONTROL\_WINDOW\_OR\_DOOR\_IS\_CLOSED
 *  COMMAND\_CLASS\_SENSOR\_BINARY (V2)
 *  COMMAND\_CLASS\_CONFIGURATION (V1)

**FACTORY RESET** 

When your network’s primary controller is missing or otherwise inoperable, you may need to reset the device to factory settings manually. To complete the process, make sure the Contact Sensor is powered on, then PRESS AND HOLD the Z-Wave button for AT LEAST 10 SECONDS until the LED indicator flashes ONCE. Release the button. NOTE: All previously recorded activity and custom settings will be erased from the device’s memory.

  


### Inclusion Information 

1.  Bring the Contact Sensor within direct range of your controller
2.  Carefully remove the cover from your Contact Sensor
3.  Remove the plastic pull-tab from the battery slot. The LED indicator will blink slowly
4.  Put your Z-Wave controller into inclusion mode
5.  Press and release the Z-Wave button on the Contact Sensor 3 TIMES quickly. The LED indicator will flash quickly
6.  A new open/close (door/window) sensor will appear on your controller's device list Troubleshooting

Tips: If you are unable to include the Z-Wave Contact Sensor to your controller, please try one of the following:

 *  Z-Wave button battery orientation marks LED indicator press to open cover
 *  Bring the Contact Sensor closer to your Z-Wave controller or use a hand-held secondary controller to perform inclusion
 *  Once in inclusion mode, press and release the Z-Wave button quickly 6-7 TIMES to ensure the command has gone through
 *  Put your controller into EXCLUSION mode. Press and release the Z-Wave button quickly 3 TIMES, and then try adding it to your network again

  


### Exclusion Information 

1.  Make sure the Contact Sensor is powered on and located within direct range of your ZWave gateway controller
2.  Put your Z-Wave controller into exclusion mode
3.  Press and release the Z-Wave button 3 TIMES quickly. The LED indicator will flash quickly
4.  The Contact Sensor should disappear from your controller's device list

If the first attempt is unsuccessful, please repeat the process following all steps carefully.

  


### Wakeup Information 

If you change settings and parameters for the sensor, you may need to wake it up manually for the changes to be recorded. Press and release the Z-Wave button ONCE to wake the device up. The LED indicator will flash ONCE. The sensor’s wake-up interval is set to 12 hours by default to save battery life. Though not recommended, you can change the wake-up interval using your controller’s advanced settings if available. Minimum value: 300s (5 minutes), maximum value: 16,777,200s (around 194 days). Accepted values need to match minute intervals, so 300, 360, 420, etc.


## Channels
The following table summarises the channels available for the ZSE08 Zooz Z-Wave Plus Contact Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Door / Window Status | sensor_door | sensor_door | Door | Contact |
| Alarm (access) | alarm_access | alarm_access | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the ZSE08 Zooz Z-Wave Plus Contact Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Close Delay | Delay (in seconds) before close signal will be sent |
| 2: Trigger Value | The value that will be set when the sensor is triggered |
| 1: Status | Open/Close Status of sensor |
| 2: Control | Control a device based on the sensor's value |
| 3: Notification | Notification Report for the status of the sensor |
| 4: Binary Report | Sensor Binary Report for the status of the sensor |


#### 1: Close Delay

Delay (in seconds) before close signal will be sent  


##### Overview 

Set the delay time for turning associated devices OFF based on status change of your Contact Sensor. The number entered as the value corresponds to the number of seconds. So if 0 is entered by default, the Contact Sensor will report status change and trigger an associated device to turn off instantly, without any delay. If you change this setting to 10, the sensor will only trigger the associated device after 10 seconds the status change is reported - if your door or window is closed, the light will not go off for another 10 seconds.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 0 |


#### 2: Trigger Value

The value that will be set when the sensor is triggered  


##### Overview 

You can choose if your Contact Sensor turns an associated device on or off when sending the basic set command. Use value 0 to turn the associated device OFF and value 255 to turn it ON. Adjust brightness level for a Z-Wave dimmer (Multilevel switch) by putting in any value between 1 and 99.

Values: 0 – OFF; 1 – 99 (% of light); 255 – ON (default).


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 255 |


#### 1: Status

Open/Close Status of sensor  


##### Overview 

Group 1 for lifeline communication of open / closed status to Z-Wave controller. Supported command classes:

 *  NOTIFICATION\_REPORT
 *  BATTERY\_REPORT
 *  SENSOR\_BINARY\_REPORT
 *  DEVICE\_RESET\_LOCALLY\_NOTIFICATION


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Control

Control a device based on the sensor's value  


##### Overview 

Group 2 for control command communication to associated Z-Wave devices in the network. Use parameter 1 and parameter 2 to configure this group’s settings. Supported command classes:

 *  BASIC\_SET


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Notification

Notification Report for the status of the sensor  


##### Overview 

Group 3 for notifications to Z-Wave devices associated in this group. Supported command classes:

 *  NOTIFICATION\_REPORT


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Binary Report

Sensor Binary Report for the status of the sensor  


##### Overview 

Group 4 for notifications to Z-Wave devices associated in this group. Supported command classes:

 *  SENSOR\_BINARY\_REPORT


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/514).
