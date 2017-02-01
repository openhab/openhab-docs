---
layout: documentation
---

{% include base.html %}

# ZWave Binding
The ZWave binding supports an interface to a wireless Z-Wave home automation network. 

ZWave is a wireless home automation protocol with reliable two way communications between nodes. It supports a mesh network where mains powered nodes can route messages between nodes that could otherwise not communicate with each other. The network supports hop distances of up to four hops.

A wide range of devices are supported from lights, switches and sensors to smoke alarms, window coverings and keyfobs. Z-Wave certification guarantees that certified devices will be compatible with each other and the network.

The binding uses a standard Z-Wave serial stick to communicate with the Z-Wave devices. There are many sticks available, and they all support the same interface so the binding does not distinguish between them.


## Supported Things

### ZWave Serial Adapter

Before the binding can be used, a serial adapter must be added. This needs to be done manually. Select `Serial ZStick`, and enter the serial port.


## Discovery

Once the binding is authorized, and an adapter is added, it automatically reads all devices that are included into the network. This is read directly from the Z-Wave controller and new things are added to the Inbox. When the discovery process is started, the binding will put the controller into inclusion mode for a defined period of time to allow new devices to be discovered and added to the network.


## Binding Configuration

There is no binding level configuration required for the Z-Wave binding. All configuration is performed on the devices, or the controller. This allows the system to support multiple controllers.


### Controller Configuration

The following section lists the controller configuration. If using manual configuration in text files, the parameter names are given in the square brackets.


#### Serial Port [port]

Sets the serial port name for the controller.


#### Controller Is Master [controller_master]

When *Controller Is Master* is true, the binding expects to be the main Z-Wave controller in the system. This is not related to the type of controller (*Primary* or *Secondary*), but is related to how devices will be configured.  This will instruct the binding to perform configuration of the device to send network related information such as device wakeup to the binding.

Many functions in Z-Wave only allow a single node to be set, and this is normally reserved for the main system controller. For example, battery device *Wakeup Node*, and *Lifeline* association groups usually only allow a single device to be set.

For most systems, this should be set to *true* - the only time when it should be *false* is if you normally control your Z-Wave network through a different system.


#### Controller Is SUC [controller_suc]

Sets the controller as a Static Update Controller within the network


#### Heal Time [heal_time]

Sets the nightly heal time (in hours).


#### Inclusion Mode [inclusion_mode]

The inclusion mode setting allows the user to set how the controller will initiate inclusion when discovery is initiated. There are three options available -:

* Low Power Inclusion: In this mode devices must be within 1 meter of the controller to be included.
* High Power Inclusion: In this mode devices must be able to communicate directly with the controller, so can be 10 to 15 meters from the controller under most conditions.
* Network Wide Inclusion: In this mode devices can be anywhere in the network. This mode 


#### Secure Inclusion Mode [security_inclusionmode]

The secure command classes allow you to secure communications between devices in your network. Secure communications is a good thing, and for devices such as locks that protect the security of your property, it's mandatory. However, most devices support the same communications and functions over the standard communication classes, without security. The secure classes come with some negative points - they communicate more slowly, and consume more power in battery devices. This is because there is roughly twice as much communication required for the security classes. You should therefore consider if you need all devices secured, or if it is acceptable for your system to only secure entry devices.

This option allows you to select which classes will be configured to use security - you can elect to use security on all devices that support it, or only on entry control devices.


#### Inclusion Mode Timeout [controller_inclusiontimeout]

This sets the maximum time that the controller will remain in inclusion or exclusion mode. Once inclusion is enabled, it will be disabled either when the first device is discovered, or when the timeout occurs. Generally this should be kept to a minimum as it increases the opportunity for unwanted nodes to be included into the network.

Note that updating this value will cause the controller to be reinitialised which will take all your Z-Wave devices offline for a short period.


#### Default Wakeup Period [controller_wakeupperiod]

This sets the system wide default wakeup period. If a battery device does not have the wakeup period set to a value, then the system will configure it to use this value during the device configuration. 

It is defined in seconds.


#### Network Security Key [security_networkkey]

This sets the network security key used in your network for securing communications using the secure command classes. It is a 16 byte value, specified in hexadecimal.


### Thing Configuration

There are a huge number of things supported by the Z-Wave binding, so configuration can not be covered here and you should refer to the device manual.

Things configured manually require the following minimum configuration to be set. -:

| Configuration      | Description                                                                                                   |
|--------------------|---------------------------------------------------------------------------------------------------------------|
| zwave_nodeid       | Sets the node id of the node within the network.                                                              |
| zwave_manufacturer | Sets the manufacturer ID for this device (as decimal). This is used to get the thing type from the database.  |
| zwave_deviceid     | Specifies the device ID for this device (as decimal). This is used to get the thing type from the database.   |
| zwave_devicetype   | Specifies the device type for this device (as decimal). This is used to get the thing type from the database. |
| zwave_version      | Specifies the application version for this device. This is used to get the thing type from the database.      |



## Channels

### Controller Channels

The table below summarises the channels available in the controller. These provide health information about the communications between the binding and the controller.

| Channel    | Description                                            |
|------------|--------------------------------------------------------|
| serial_sof | Counts number of frames started                        |
| serial_ack | Counts number of frames acknowledged by the controller |
| serial_nak | Counts number of frame rejected by the controller      |
| serial_can | Counts number of frames cancelled by the controller    |
| serial_oof | Counts number of bytes received out of frame flow      |
| serial_cse | Counts number of frames received with checksum error   |


### Device Channels


## Initialisation

To initialise the binding and get your Z-Wave network running, you need to follow the following steps -:

* Manually install the serial controller. It doesn't matter what type of Z-Wave dongle you have, there is only a single *thing type* since all sticks use the same communication protocol, and the binding can detect what functions the device supports by communicating with the stick.
* Set the serial port in the controller configuration.
* In the UI enable *discovery* mode - this will add all existing things into the *discovery inbox*. From the *inbox* you can add the device directly into the system.
* the binding should automatically detect the device type and should provide a list of *channels* to which you can attach *items*. Note that it may take some time to discover the device type - especially in battery devices.


## Z-Wave Network

This section provides information on the Z-Wave network, and how functions are implemented in the binding.


### Network Overview

The Z-Wave network includes devices known as *Controllers* and *Slaves*. As the name suggests, *Controllers* control how the network runs and provide network administration functions, while *Slaves* are users of the network.


#### Home ID
The network is identified with a *Home ID*. This is programmed into the controller, and can't be changed. It is used to identify the network in all frames that are transmitted over the air. When a device is included into a network, the controller sets the *Home ID* of the network in the slave so that the slave will only communicate over this network until it is removed from the network.


#### Node ID
Each node in the network is identified with a *Node ID*. The controller allocated the *Node ID* when the device is included into the network. A single Z-Wave network supports 232 devices (*Node ID* 1 to 232). The controller will allocate node IDs sequentially. Normally therefore the controller has Node ID 1 since it is normally the first device in the network. IDs will then be allocated sequentially up to number 232 after which the controller will allocate unused addresses.


#### Message Routing

A Z-Wave network is a *Mesh Network*. This allows each device in the network to route frames within the network so that devices don't need to communicate directly with the controller.  The Z-Wave network allows up to 4 hops.  For a network to work efficiently, each device must be able to communicate with a number of other devices - this creates what is known as a "Strong Mesh". It provides the controller with multiple options when selecting routes, and makes the network tolerant of device failures or radio interference issues.

If a route doesn't work, the controller will try a different route - up to three routes will be tried and if the message is not delivered the controller will report the failure.

Frames can also be transmitted as *Broadcast Frames* within the Z-Wave network, however to avoid overloading the network, *Broadcast Frames* are not routed so can only be used within direct communication of the sending device.


#### Command Classes

Z-Wave uses what are known as *Command Classes* to communicate. These *Command Classes* are a set of standardised commands to allow devices to perform specific functions. Each *Command Class* has a specific function, and each device will likely support multiple classes to allow the users to interact with the device.

Every device supports the *BASIC* command class. This is normally mapped to a specific *Command Class* - the *BASIC* class is used to provide a high degree of interoperability between devices, and is especially useful when devices are communicating peer-to-peer as slaves do not need to know the detail of many different classes.


### Controllers

There are different types of controllers in a Z-Wave network. This section provides an overview of the different types of controller.


#### Primary Controller
There is a single *Primary* controller in the network. This controller provides the network routing table


#### Static Update Controller (SUC)


#### Static ID Server (SIS)


### Slaves

Most devices in your network are *slaves* - they come in in two types, *routing* and *non-routing*.


## Z-Wave in practice

This section endeavors to provide some practical information about Z-Wave networks and how the system works that may be of use to users.


### Inclusion and Exclusion

Inclusion and exclusion are always started by the primary controller, unless an *SIS* is available in the network, in which case any controller can start these functions.  To include or exclude a device in the network, set the controller into include mode, and press the appropriate button on the device to place the device into include mode.  All Z-Wave devices will have such a button, and you should refer to the device manual.

Secure inclusion must be started from the binding. This is because once the device is included into the network, a key exchange takes place between the binding and the device. This key exchange must take place within a very short time of the inclusion, and if it doesn't succeed, the device must be excluded and included again.  Secure inclusion will generate a lot of activity on the network, so you should avoid other activities at the same time, and the device being included should be close to the controller to reduce any retries that could cause the security handshake to fail.


### Device Initialisation

As soon as the device is discovered (eg included) it is added to the inbox. At this point we still don't know the manufacturer etc.

During the initialisation of a device, the binding performs a discovery and configuration phase. It requests information from the device first to find out information like the manufacturer and what device classes are supported. Once it knows this, the device is shown in the inbox with a 'proper label' based on information from the database.

We then initialise some information in the device such as associations. Association configuration is read from the database. Configuration parameters are not configured automatically and must be manually configured through a user interface.

This discovery is only performed once, and the information is then persisted when the binding is restarted. On each restart the binding will perform an update of the information to read any dynamic data from the device.


### Thing States

Internally the binding holds a device state and these states are mapped to the system states ONLINE and OFFLINE. This section provides an explanation of the meaning of the states.

* ONLINE - A device is considered to be operating normally.
* DEAD - A device is considered DEAD if it does not respond to a message three times. This is a binding state only and while the binding will continue to attempt to contact a DEAD device retries to the node will be stopped until it responds. DEAD devices can slow down communications within the network so you are advised to remove DEAD devices from the network if possible. DEAD devices will be marked as OFFLINE within the system status.
* FAILED - A device is considered FAILED if the controller can not communicate with the device. The binding does not control this. FAILED devices are treated in a similar way to DEAD devices however the controller will reduce communications to the device and will timeout quicker. It should be noted that the controller will generally not consider battery devices as failed. FAILED devices will be marked as OFFLINE within the system status.


### Associations

Associations are used by Z-Wave devices to send commands from one device to another, independent of the controller. This could be used to turn on a light when a movement sensor is triggered without requiring the message from the movement sensor to be used to trigger a rule, and for the rule to send a message to turn on the light. Associations are also used to send state updates to the controller when the state of a device changes. For example, if you turn a light on, the device will let the controller know so that the state of the light is shown correctly within the user interface.

Often there is a *Lifeline* association group, and normally this is the only association that is required in order to notify the binding of changes to the device. If you set the controller node into other association groups, you will likely receive multiple notifications - while this shouldn't cause problems most of the time, it can reduce battery life in battery powered devices, and may cause issues with rules.

It should be noted that associations are only triggered from a local action within the device. Thus if a command is sent from one device to a second device, and the second device has an association to notify the controller when it changes state, this will not be sent to the controller in these circumstances.


### Battery Devices

Z-Wave battery devices require additional configuration in order for them to operate properly. In Z-Wave, most battery devices spend the majority of the time sleeping, and they only wake up very occasionally to allow commands to be sent to them. The binding therefore queues any messages to battery devices until they wake up - this can be every 10 minutes or so, or it could be once per day! All battery devices will have a a button, or some other way to wake the device up, and this can be useful while configuring the devices.

In order to configure the device properly following its initial inclusion in the network, the device must be woken up a number of times while close to the controller. During this time, the binding will read the device information, but will also configure some settings. The most important is to configure the wakeup period, and wakeup node - until this is done, the device will not wake up periodically, and if it is out of direct range of the controller, it will not be able to communicate with the controller.

A battery device will be considered *DEAD* if the controller does not receive a wakeup notification, or some other message, within approximately twice the wakeup period. In this event, the thing will be set offline and the device considered *DEAD*.


### Polling

The binding supports periodic polling. This has two purposes - firstly to ensure that a device is still responding, and secondly to update the bindings representation of the state of the device.  Where possible *associations* should be used to update the device state - this will keep network traffic to a minimum, which will improve the network latency, and it will be faster since *associations* send updates to the controller immediately where polling will always be noticeably slower.

If a device fails to respond to a poll, then it will be marked as DEAD and shown as offline. For battery devices, if they do no provide a wakeup within a period of twice the wakeup period, then they will also be considered dead and taken offline.

Keep the polling at a slow rate unless your device doesn't support *associations*. This will reduce network traffic, reduce the chance of timeouts and retries, and therefore improve the overall performance of the network.


### Binding Maintenance Functions

The binding provides a number of facilities for maintaining the network.


#### Mesh Heal

Sometimes the Z-Wave mesh can get messed up and nodes can become 'lost'. In theory, the Z-Wave controller should automatically resolve these issues, and any device that finds itself orphaned from the network should send a *Explorer Frames* to request a routing update.

In order to manually repair the mesh, the binding implements a *mesh heal* function. This will systematically work through the network nodes, starting with the controller and working outwards. For each node, the controller will request an update to the nodes neighbors - this can take up to a minute to complete foe each node, although it is normally much less. The neighbor update will only be performed on nodes that are *listening* - this means battery devices will not be updated through this process but they should be updated by the controller.

While the neighbor update is running, all nodes in the system will be taken offline to avoid network traffic that may adversely impact the update.

Once the neighbor update is complete, the system will perform a routing update on all nodes. Z-Wave is a "source routed mesh network" which means that the controller needs to tell the end nodes information about its routes. Specifically, the controller will provide each node a list of routes required to talk to the controller, the SUC (if it exists in the network), and other nodes to which the controller needs to talk to (eg for associated devices). The binding simply instructs the stick to configure a route between two nodes - the route itself if derived by the stick and the binding has no visibility of the actual routes being used.


#### Joining as a secondary controller

The binding can be added to the network as a secondary controller. This can be useful if you already have another home automation system and you want to use the binding as a secondary controller.


#### Network updates

A secondary controller can receive an updated list of network nodes from the primary controller...


### Z-Wave Device Database

A database of device information is required for Z-Wave since there is no way to know the devices configuration directly from the device. Some Z-Wave command classes have preset configuration, and these we can implicitly configure, however the configuration command class has no device specific declarations. This data is normally provided by the device manufacturer in the manual, or on their website.

The binding makes use of the database to derive device names, and provide a list of channels that are available on the device. If there is no database entry, then (currently) the device will show up as *Unknown* in the things list.

Devices are identified in the database by 4 pieces of information that are provided by the device during the initial discovery process. These are -:

* Manufacturer ID
* Device Type
* Device ID
* Firmware version

The primary identification is performed using the Manufacturer ID, Device Type and Device ID. Many devices use multiple deviceType and deviceId sets to identify different regions, or other minor differences, and some manufacturers will produce multiple firmware versions for the same device, so this information is also used in some instances.


#### Unknown Devices 

If the device is listed as *Unknown*, then the device has not been fully discovered by the binding and will not work correctly. There are a few possible reasons for this -:

* **The device is not in the database.** If the device attributes show that this device has a valid manufacturer ID, device ID and type, then this is likely the case (eg. you see a label like "*Z-Wave node 1 (0082:6015:020D::2.0)*"). Even if the device appears to be in the database, some manufacturers use multiple sets of references for different regions or versions, and your device references may not be in the database. In either case, the database must be updated and you should raise an issue to get this addressed.
* **The device initialisation is not complete.** Once the device is included into the network, the binding must interrogate it to find out what type of device it is. One part of this process is to get the manufacturer information required to identify the device, and until this is done, the device will remain unknown. For mains powered devices, this will occur quickly, however for battery devices the device must be woken up a number of  times to allow the discovery phase to complete. This must be performed with the device close to the controller.  
