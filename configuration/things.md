---
layout: documentation
title: Things
---

{% include base.html %}

# Things

[Things]({{base}}/concepts/things.html) represent the physical layer of an openHAB system.
From a configuration standpoint, things tell openHAB what **physical entities** (devices, web services, information sources, etc.) are to be managed by the system.

Things are provided to openHAB through [bindings]({{base}}/addons/bindings.html). 
In order to add a thing to the system, you must first identify the appropriate binding which will provide the type of thing you wish to add.
For example, before adding a thing for a ZWave device, the ZWave binding must first be installed through the Paper UI.

Each thing provides one or more **channels** to access its functionality.
These channels can be linked to [items]({{base}}/concepts/items.html). Items are used to control things and consume their information.
Ultimately, when items are linked to channels on a thing, they become available to the various user interfaces.

# Defining Things

Things are the starting point for configuring physical entities in openHAB. 
When you wish to add a new one to the system, you always start by defining a thing.
Once a thing has been defined and configured, you are done setting up the thing at the physical layer.
From then on, everything else is configured at the application layer for that entity.

From start to finish, the process for fully configuring a physical entity represented by a thing looks like this:

1. Identify the binding required for the thing
2. Install the binding if it has not already been installed
3. Define and configure the thing
5. Identify the channels provided by the thing
6. [Add items]({{base}}/configuration/items.html) to the system which will control the thing or consume its information
7. Link the items to the thing's channels, at which point they will become available to each user interface
8. **Optional**: [Add the items to a sitemap]({{base}}/configuration/sitemaps.html)

There are two methods for defining things provided by the various bindings: the [discovery]({{base}}/concepts/discovery.html) based method and the file based method.

> NOTE: some bindings do not work properly with discovery, and other bindings do not work properly with file based definitions.
> Consult the documentation for each binding to determine the best way to add that binding's things to openHAB.

## Defining Things Using Discovery

Things can be added to the system using [discovery]({{base}}/concepts/discovery.html), which allows things to be discovered automatically if the appropriate binding has been installed and configured.
When a thing has been discovered, it appears in the discovery inbox. 
Newly discovered things can be added to the system from the inbox using the Paper UI.

Things that are added to openHAB from the inbox are maintained in an internal database as opposed to a manually defined .things file.
Unlike manually defined things, if a thing has configurable properties, these properties can be set through a user interface.  

See the [configuration tutorial]({{base}}/tutorials/beginner/configuration.html) for a step-by-step guide on how to configure things using discovery.

It is important to note that although things added via discovery can be linked to items defined in Paper UI, they can also be linked to items defined in .item files.
In order to link a thing to an item in a .item file, navigate to the thing in Paper UI under **Configuration** -> **Things** and click on the thing you want to link to an item.
In the list of thing channels, look for the channel you wish to link to an item and copy the channel's ID.
For instance, a ZWave switch might have a Switch channel that has an ID like this:

```xtend
zwave:device:1a2b3c4d:node2:switch_binary
```

To bind that channel to an item in an .items file, you can define an item in the file like so:

```xtend
Switch Kitchen_Light_Switch "Kitchen Light" (Indoor_Lights) { channel="zwave:device:1a2b3c4d:node2:switch_binary" }
```

## Defining Things Using Files

Things can also be defined manually by creating .things files in /conf/things.
This allows things to be statically defined in files similar to how items were defined in openHAB 1.x. 
The major difference is that now things must be defined in their own text files before they are available to the .items files.

For some bindings (such as the [YahooWeater]({{base}}/addons/bindings/yahooweather/readme.html) binding), manual thing definitions are required.
However, other bindings (such as the [ZWave]({{base}}/addons/bindings/zwave/readme.html) binding) currently prefer or require discovery. 

### Thing Syntax

```xtend
Thing <binding_id>:<type_id>:<thing_id> "Label" @ "Location" [ <parameters> ]
```

>NOTE: Parts in <> are required

**Example**

```xtend
Thing network:device:webcam "Webcam" @ "Living Room" [ hostname="webcam.homenetwork.local", port="0", retry="1", timeout="5000", refresh_interval="60000", use_system_ping="false", dhcplisten="true" ]
```

Where:
* the binding ID is 'network' (using the [Network Binding]({{base}}/addons/bindings/network/readme.html))
* the type ID is 'device', indicating the thing is a device
* the thing ID is 'webcam', which is an ID to uniquely identify the thing
* the label is "Webcam" and is how the thing will be named in the various user interfaces
* the location is "Living Room"
* the values inside the [] brackets are the thing's configuration parameters

Please check each invidiual binding's [documentation]({{base}}/addons/bindings.html) for details on how to define things using the `things/*.things` definition files.
Things definitions are not needed for Legacy 1.x bindings.