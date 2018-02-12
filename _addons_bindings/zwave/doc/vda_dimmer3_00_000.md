---
layout: documentation
title: Vitrum III EU Dimmer - ZWave
---

{% include base.html %}

# Vitrum III EU Dimmer

This describes the Z-Wave device *Vitrum III EU Dimmer*, manufactured by *VDA* with the thing type UID of ```vda_dimmer3_00_000```. 

  


## Overview 

When the device is in the stand-alone mode and is not included in a Z-Wave network the illuminated ring around the touch keys will light red for a moment when passing from one mode to another.

  


### Inclusion Information 

With the controller in the inclusion mode, press any of the touch keys on the device.

  


### Exclusion Information 

Press and hold the leftmost touch key for at least 8 seconds. The device will flash red three times and sound an acoustic signal to indicate that the original factory setting has been restored.


## Channels
The following table summarises the channels available for the Vitrum III EU Dimmer.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer |
| Dimmer 2 | switch_dimmer2 | switch_dimmer | DimmableLight | Dimmer |
| Dimmer 3 | switch_dimmer3 | switch_dimmer | DimmableLight | Dimmer |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Dimmer 1

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Dimmer 2

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Dimmer 3

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Vitrum III EU Dimmer.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Switch channel 1 |  |
| 2: Dimmer Channel 2 |  |
| 3: Dimmer Channel 3 |  |


#### 1: Switch channel 1


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Dimmer Channel 2


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Dimmer Channel 3


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/475).
