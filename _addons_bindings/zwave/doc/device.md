---
layout: documentation
title:  - ZWave
---

{% include base.html %}

# Unknown Device

This describes the Z-Wave device **, manufactured by ** with the thing type UID of ```device```. 

This device has not been fully discovered by the binding. There are a few possible reasons for this -:

 *  **The device is not in the database.** If the device attributes show that this device has a valid manufacturer ID, device ID and type, then this is likely the case (eg. you see a label like "*Z-Wave node 1 (0082:6015:020D::2.0)*"). Even if the device appears to be in the database, some manufacturers use multiple sets of references for different regions or versions, and your device references may not be in the database. In either case, the database must be updated and you should raise an issue to get this addressed.
 *  **The device initialisation is not complete.** Once the device is included into the network, the binding must interrogate it to find out what type of device it is. One part of this process is to get the manufacturer information required to identify the device, and until this is done, the device will remain unknown. For mains powered devices, this will occur quickly, however for battery devices the device must be woken up a number of times to allow the discovery phase to complete. This must be performed with the device close to the controller.


## Channels
The following table summarises the channels available for the Unknown Device.

| Channel | Channel Id | Channel Type UID | Category | Item Type |
|---------|------------|------------------|----------|-----------|


### Device Configuration
The following table provides a summary of the configuration parameters available in the Unknown Device.
Detailed information on each parameter can be found below.

| Parameter   | Description |
|-------------|-------------|


---

Did you spot an error in the above definition or want to improve the content?
You can edit the database [here](http://www.cd-jackson.com/index.php/zwave/zwave-device-database/zwave-device-list/devicesummary/).
