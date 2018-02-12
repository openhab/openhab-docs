---
layout: documentation
title: 32563 - ZWave
---

{% include base.html %}

# 32563 Smart Door Sensor

This describes the Z-Wave device *32563*, manufactured by *Jasco Products* with the thing type UID of ```ge_smartdoorsensor_00_000```. 

Smart Door Sensor  


### Inclusion Information 

1.  Follow the instructions for your Z-Wave certified controller to include the device to the Z-Wave network.
2.  Once the controller is ready to include your Hinge Pin Smart Door Sensor press and release the manual/program button on the smart switch to include it in the network.

  


### Exclusion Information 

1.  Follow the instructions for your Z-Wave certified controller to exclude a device from the Z-Wave network. 
2.  Once the controller is ready to exclude your device, press and release the manual/program button on the Hinge Pin Smart Door Sensor to exclude it from the network.

You may wish to reset all of your Hinge Pin Smart Door Sensor's settings to their factory defaults. To do this, press the program button 10 times within 6 seconds. If your Door Sensor has been successfully reset, its LED light will blink for 3 seconds. This should only be used in the event your network’s primary controller is missing or otherwise inoperable.

  


### Wakeup Information 

1.  Press and hold the Z-wave Button for 6 seconds. It will be wake up and send “Wake Up Notification CC “ to HUB. 
2.  It will sleep after timeout for 10 seconds, or sleep right away when received the “Wake Up No More Information CC”. 


## Channels
The following table summarises the channels available for the 32563 Smart Door Sensor.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Binary Sensor | sensor_binary | sensor_binary | Door | Switch |
| Alarm (access) | alarm_access | alarm_access | Door | Switch |
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the 32563 Smart Door Sensor.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 20: Report Method | Change Open/Close Report Method |
| 1: 1 | Z-Wave Plus Lifeline |
| 2: 2 | For Control |
| 3: 3 | For Control |


#### 20: Report Method

Change Open/Close Report Method  


##### Overview 

1.  Notification (Default)
2.  Basic Set
3.  Basic Report


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_20_1 |
| Data Type        | INTEGER |
| Range | 1 to 3 |
| Default Value | 1 |


#### 1: 1

Z-Wave Plus Lifeline


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: 2

For Control


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: 3

For Control


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/504).
