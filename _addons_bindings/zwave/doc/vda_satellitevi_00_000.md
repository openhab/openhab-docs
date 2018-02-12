---
layout: documentation
title: Vitrum Satellite VI - ZWave
---

{% include base.html %}

# Vitrum Satellite VI Vitrum touch switch satellite 6 buttons

This describes the Z-Wave device *Vitrum Satellite VI*, manufactured by *VDA* with the thing type UID of ```vda_satellitevi_00_000```. 

Vitrum touch switch satellite 6 buttons  


## Overview 

When the device is in the stand-alone mode and is not included in a Z-Wave network the illuminated ring around the touch keys will light red for a moment when passing from one mode to another.

Each button can be configured in 4 different modes. Press the 2 service buttons (left and right each) for at least 8 seconds. Buttons will start to flash and the color of the flashing ring will indicate the channel setting:

\- Yellow: for association with On-Off Modules, toggle-button function (BASIC)

\- Red: for association with On-Off Modules, push-button function (BASIC)

\- Magenta: for association with Roller Blinds, 2 buttons will start flashing together for up and down movement (SWITCH\_MULTILEVEL)

\- Green: for association with Dimmer Modules (SWITCH\_MULTILEVEL)

After mode selection, please proceed with inclusion process.

  


### Inclusion Information 

With the controller in the inclusion mode, press any of the touch keys on the device. Vitrum indicates that it has been included to the network by flashing the yellow LEDs three times and switching on all the lights connected to the unit.

  


### Exclusion Information 

Press and hold the leftmost touch key for at least 8 seconds. The device will flash red three times and sound an acoustic signal to indicate that the original factory setting has been restored.


## Channels
The following table summarises the channels available for the Vitrum Satellite VI Vitrum touch switch satellite 6 buttons.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer |
| Dimmer 2 | switch_dimmer2 | switch_dimmer | DimmableLight | Dimmer |
| Dimmer 3 | switch_dimmer3 | switch_dimmer | DimmableLight | Dimmer |
| Dimmer 4 | switch_dimmer4 | switch_dimmer | DimmableLight | Dimmer |
| Dimmer 5 | switch_dimmer5 | switch_dimmer | DimmableLight | Dimmer |
| Dimmer 6 | switch_dimmer6 | switch_dimmer | DimmableLight | Dimmer |


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


### Dimmer 4

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Dimmer 5

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Dimmer 6

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the Vitrum Satellite VI Vitrum touch switch satellite 6 buttons.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|
| 1: Button channel 1 |  |
| 2: Button channel 2 |  |
| 3: Button channel 3 |  |
| 4: Button channel 4 |  |
| 5: Button channel 5 |  |
| 6: Button channel 6 |  |


#### 1: Button channel 1

  


##### Overview 

Control up to 5 devices with this button. The kind of device controlled depends on the Button configuration.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_1 |
| Data Type        | TEXT |
| Range |  to  |


#### 2: Button channel 2

  


##### Overview 

Control up to 5 devices with this button. The kind of device controlled depends on the Button configuration.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_2 |
| Data Type        | TEXT |
| Range |  to  |


#### 3: Button channel 3

  


##### Overview 

Control up to 5 devices with this button. The kind of device controlled depends on the Button configuration.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_3 |
| Data Type        | TEXT |
| Range |  to  |


#### 4: Button channel 4

  


##### Overview 

Control up to 5 devices with this button. The kind of device controlled depends on the Button configuration.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_4 |
| Data Type        | TEXT |
| Range |  to  |


#### 5: Button channel 5

  


##### Overview 

Control up to 5 devices with this button. The kind of device controlled depends on the Button configuration.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_5 |
| Data Type        | TEXT |
| Range |  to  |


#### 6: Button channel 6

  


##### Overview 

Control up to 5 devices with this button. The kind of device controlled depends on the Button configuration.


| Property         | Value    |
|------------------|----------|
| Configuration ID | group_6 |
| Data Type        | TEXT |
| Range |  to  |


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/626).
