---
layout: documentation
title: iPlugDim - ZWave
---

{% include base.html %}

# iPlugDim Wall Plug with dimming function

This describes the Z-Wave device *iPlugDim*, manufactured by *Wintop* with the thing type UID of ```wintop_iplugdim_00_000```. 

Wall Plug with dimming function  


## Overview 

 *  The iPlugDim can be remotely controlled.
 *  The iPlugDim can be controlled by the push button on the front of the device.
 *  The iPlugDim ’s indicator light will indicate the status of the switch (ON or OFF).
 *  The iPlugDim can make a dimming function of the load.

Press and release the push button of the iPlugDim to switch on/off the load of socket, press and hold the push button to dim the load of the socket.

**Indication modes**

The indicator gives various statuses of the device as follows:

1.  Ready for learn mode: Indicator light blinks every second.
2.  Learn in progress (add): Indicator light blinks 2 times every second.
3.  Learn in progress (remove): Indicator light blinks 3 times every second.
4.  Learn mode success: Indicator light is on for second.
5.  Learn mode failed: Indicator light blinks 8 times fast.

  


### Inclusion Information 

1.  Make sure your Z‐Wave controller is in the right operation mode (include or exclude).
2.  Press and hold the push button for 4 seconds and release to start the inclusion or exclusion process
    
    (indication mode: Ready for learn mode).
3.  (The product will start NWI automatically after unsuccessful normal inclusion) 


## Channels
The following table summarises the channels available for the iPlugDim Wall Plug with dimming function.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer |


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
The following table provides a summary of the configuration parameters available in the iPlugDim Wall Plug with dimming function.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/698).
