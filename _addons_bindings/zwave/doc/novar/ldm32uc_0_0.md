---
layout: documentation
title: LDM32 - ZWave
---

{% include base.html %}

# LDM32 MK Honeywell Astral 2 Load Wall Dimmer - LDM32UC
This describes the Z-Wave device *LDM32*, manufactured by *Novar Electrical Devices and Systems (EDS)* with the thing type UID of ```novar_ldm32uc_00_000```.

The device is in the category of *Wall Switch*, defining Any device attached to the wall that controls a binary status of something, for ex. a light switch.

![LDM32 product image](https://www.cd-jackson.com/zwave_device_uploads/998/998_default.png)


The LDM32 supports routing. This allows the device to communicate using other routing enabled devices as intermediate routers.  This device is also able to participate in the routing of data between other devices in the mesh network.

## Overview

# LDM32UC

**2 GANG 300W DIMMER MODULE**

RF Range up to 75m (open field)  
Can control up to 5 devices  
Can control either a group or a scene  
Pre programmed with HOLIDAY MODE function  
Mains powered  
  
STANDARD CARTON QUANTITY: 1

Suitable for use with the following load types and maximum load ratings only.

<table>
  <tr>
    <td>
      Load Type     
    </td>
    
    <td>
      2G 300W Dimmer
    </td>
  </tr>
  
  <tr>
    <td>
      GLS       
    </td>
    
    <td>
      25-300W per channel
    </td>
  </tr>
  
  <tr>
    <td>
      Tungsten filament    
    </td>
    
    <td>
      25-300W per channel
    </td>
  </tr>
  
  <tr>
    <td>
      Tungsten halogen     
    </td>
    
    <td>
      25-300W per channel
    </td>
  </tr>
  
  <tr>
    <td>
      12V ELV Tungsten halogen with wirewound or electronic transformers
    </td>
    
    <td>
      35-300W per channel
    </td>
  </tr>
</table>

   
Not suitable with any other load type.  Do not use different types of lamps on the same load current.  
  
BS EN 60669-2-1  
BS EN 61000-6-1 / 3  
ETSI EN 301489-1 / 2  
ETSI EN 300220-1/ 2

Mounting Boxes:  Flush 35mm  
  
Operating Frequency  868.4 MHz  
  
Select the appropriate 2 Gang  Dimmer Fascia for your Dimmer Module

Full Data Sheet is available from here: View Full Data Sheet

### Inclusion Information

To include device into another system press any operation button 

### Exclusion Information

To exclude device from a system quickly press Dis/Exc button twice in 1s 

## Channels

The following table summarises the channels available for the LDM32 -:

| Channel Name | Channel ID | Channel Type | Category | Item Type |
|--------------|------------|--------------|----------|-----------|
| Dimmer | switch_dimmer | switch_dimmer | DimmableLight | Dimmer | 
| Dimmer 1 | switch_dimmer1 | switch_dimmer | DimmableLight | Dimmer | 
| Dimmer 2 | switch_dimmer2 | switch_dimmer | DimmableLight | Dimmer | 

### Dimmer
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 1
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer1``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.

### Dimmer 2
The brightness channel allows to control the brightness of a light.
            It is also possible to switch the light on and off.

The ```switch_dimmer2``` channel is of type ```switch_dimmer``` and supports the ```Dimmer``` item and is in the ```DimmableLight``` category.



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
| COMMAND_CLASS_NO_OPERATION_V1| Linked to BASIC|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_APPLICATION_STATUS_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| |
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_MANUFACTURER_SPECIFIC_V1| |
| COMMAND_CLASS_NODE_NAMING_V1| |
| COMMAND_CLASS_ASSOCIATION_V2| |
| COMMAND_CLASS_VERSION_V1| |
| COMMAND_CLASS_INDICATOR_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_ASSOCIATION_V2| |
| COMMAND_CLASS_MULTI_CMD_V1| |
#### Endpoint 1

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_NODE_NAMING_V1| |
#### Endpoint 2

| Command Class | Comment |
|---------------|---------|
| COMMAND_CLASS_BASIC_V1| |
| COMMAND_CLASS_SWITCH_MULTILEVEL_V2| Linked to BASIC|
| COMMAND_CLASS_SWITCH_ALL_V1| |
| COMMAND_CLASS_MULTI_CHANNEL_V2| |
| COMMAND_CLASS_NODE_NAMING_V1| |

### Documentation Links

* [Full Data Sheet](https://www.cd-jackson.com/zwave_device_uploads/998/Data-Sheet---Dimmer--50042518-D-.pdf)

---

Did you spot an error in the above definition or want to improve the content?
You can [contribute to the database here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/998).
