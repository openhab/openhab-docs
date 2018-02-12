---
layout: documentation
title: CSZ1 - ZWave
---

{% include base.html %}

# CSZ1 Cellular Shade Radio Z-Wave

This describes the Z-Wave device *CSZ1*, manufactured by *Graber* with the thing type UID of ```graber_csz1_00_000```. 

Cellular Shade Radio Z-Wave  


## Overview 

See http://products.z-wavealliance.org/products/1749

  


### Inclusion Information 

1.  Put Primary Controller into Inclusion Mode
2.  Press and Hold Shade Programming Button for >2 seconds

  


### Exclusion Information 

1.  Put Primary Controller into Exclusion Mode
2.  Press and Hold Shade Programming Button for >2 seconds

  


### Wakeup Information 

The Wakeup command class should be configured by a hub when the remote is joined to a Z-Wave network. A WAKE\_UP\_INTERVAL\_SET command should configure the NodeID at a minimum. The Wakeup interval can be configured to any value from 6 minutes to 25 hours. Recommendation is to leave the interval at the default of 12 hours to maximize battery life. The remote will wake up every WakeUpInterval and send a WakeUp Notification command as well as a battery report to the NodeID assigned with the Interval Set command. The WakeUp Notification will be sent within a few minutes of power being applied to the remote and then once every Wake Up Interval. A Wakeup Interval Capabilities command will inform the hub of the default, minimum, maximum and step size of the Wake Up interval.


## Channels
The following table summarises the channels available for the CSZ1 Cellular Shade Radio Z-Wave.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Switch | switch_binary | switch_binary | Switch | Switch |
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |
|  | battery-level | system.battery-level |  |  |


### Dimmer

#### Restore Last Value

Restore Last Dimming level on ON.


| Property         | Value    |
|------------------|----------|
| Configuration ID | config_restoreLastValue |
| Data Type        | BOOLEAN || Default Value | true |
| Options | Restore Last Value (true) |
|  | Restore Full Brightness (false) |


### Device Configuration
The following table provides a summary of the configuration parameters available in the CSZ1 Cellular Shade Radio Z-Wave.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/587).
