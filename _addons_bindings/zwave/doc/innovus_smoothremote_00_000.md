---
layout: documentation
title: SmoothRemote - ZWave
---

{% include base.html %}

# SmoothRemote SmoothRemote

This describes the Z-Wave device *SmoothRemote*, manufactured by *INNOVUS* with the thing type UID of ```innovus_smoothremote_00_000```. 

SmoothRemote


## Channels
The following table summarises the channels available for the SmoothRemote SmoothRemote.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
|  | battery-level | system.battery-level |  |  |


### Device Configuration
The following table provides a summary of the configuration parameters available in the SmoothRemote SmoothRemote.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 0: Button Press Time | Button Press Time, time for presses on a single button to register as seperate and not par... |
| 1: Button Multiple Press Time | Button Multiple Press Time, time for presses on multiple buttons to register as seperate a... |
| 2: Button Hold Time | Button Hold Time, time for presses to register as being held down in 0.01s. 0 is interpret... |
| 3: Network Update Interval | Network Update Interval, time between network updates in 256 seconds. Disabled if 0. |


#### 0: Button Press Time

Button Press Time, time for presses on a single button to register as seperate and not part of a sequence, measured in 0.01s. 0 is interpreted as a 1.  


##### Overview 

Warning: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_0_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 50 |


#### 1: Button Multiple Press Time

Button Multiple Press Time, time for presses on multiple buttons to register as seperate and not part of a sequence, measured in 0.01 s. 0 is interpreted as a 1.  


##### Overview 

Warning: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_1_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 100 |


#### 2: Button Hold Time

Button Hold Time, time for presses to register as being held down in 0.01s. 0 is interpreted as a 1.  


##### Overview 

Warning: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_2_1 |
| Data Type        | INTEGER |
| Range | 0 to 255 |
| Default Value | 40 |


#### 3: Network Update Interval

Network Update Interval, time between network updates in 256 seconds. Disabled if 0.  


##### Overview 

Warning: All Configuration values have serious effects on the functioning of the device and as such shouldn't be changed unless one is certain of the consequences. 


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_3_2 |
| Data Type        | INTEGER |
| Range | 0 to 65535 |
| Default Value | 168 |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/440).
