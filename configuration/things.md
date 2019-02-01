---
layout: documentation
title: Things
---

{% include base.html %}

# Things

[Things]({{base}}/concepts/things.html) represent the physical layer of an openHAB system.
From a configuration standpoint, Things tell openHAB which **physical entities** (devices, web services, information sources, etc.) are to be managed by the system.

Things are connected to openHAB through [bindings](/addons/#binding).
In order to add a Thing to the system, you must first identify the appropriate binding which will provide the type of Thing you wish to add.
For example, before adding a Thing for a Z-Wave device, the Z-Wave binding must first be installed.

Each Thing provides one or more **Channels** to access its functionality.
These Channels can be linked to [items]({{base}}/concepts/items.html).
Items are used to control Things and consume their information.
Ultimately, when Items are linked to Channels on a Thing, they become available to the various user interfaces and to the rules engine.

*Note:* Things are a new concept in openHAB 2, Things definitions are not needed for 1.x bindings.

## Defining Things

Things are the starting point for configuring physical entities in openHAB.
When you wish to add a new one to the system, you always start by defining a Thing.
Once a Thing has been defined and configured, you are done setting up the connection to the physical layer.
From then on, everything else is configured at the application layer for that entity.

From start to finish, the process for fully configuring a physical entity represented by a Thing looks like this:

1. Identify the binding required for the Thing
2. Install the binding if it has not already been installed
3. Define and configure the Thing
4. Identify the Channels provided by the Thing
5. [Add Items]({{base}}/configuration/items.html) and link them to the Thing's Channels
6. At this point Items can be used to control the Thing or consume its information in e.g. [Sitemaps]({{base}}/configuration/sitemaps.html) or [Rules]({{base}}/configuration/rules-dsl.html)

There are two methods for defining Things provided by the various bindings:
through [discovery]({{base}}/concepts/discovery.html) or by manual definition in configuration text files.

*Note:* Some bindings do not fully support auto-discovery, others are hard to manually cover by the file based approach.
Please consult the documentation for each binding to determine the best way to add that binding's Things and Items to openHAB.
For some bindings, manual Thing definitions are required.
Other bindings (such as the [ZWave](/addons/bindings/zwave/) binding) currently prefer or require the discovery method.

### Defining Things Using Discovery

Things can be added to the system using [discovery]({{base}}/concepts/discovery.html), which allows Things to be discovered automatically if the appropriate binding has been installed and configured.
When a Thing has been discovered, it appears in the discovery inbox.
Newly discovered Things can be added to the system from the inbox using the [Paper UI]({{base}}/configuration/paperui.html).

Things that are added to openHAB from the inbox are maintained in an internal database as opposed to a manually defined `.things` file (see below).
Unlike manually defined Things, if a Thing has configurable properties, these properties can be set through a user interface.

**Attention:** It has to be noted, that Things and Items added through Paper UI / discovery to the internal database will **not** be written to configuration files.
Things and Items definitions can be distributed and mixed among the internal database and manually defined text files.

See the [configuration tutorial]({{base}}/tutorials/beginner/configuration.html) for a step-by-step guide on how to configure Things using discovery.

### Defining Things Using Files

Things can also be defined manually by creating `.things` configuration text files.
These files are stored in `$OPENHAB_CONF/things`.

The syntax for `.things` files is defined as follows (parts in `<..>` are required):

```xtend
Thing <binding_id>:<type_id>:<thing_id> "Label" @ "Location" [ <parameters> ]
```

The first keyword defines whether the entry is a bridge or a thing. 
The next statement defines the UID of the thing which contains of the following three segments: `binding id`, `thing type id`, `thing id`. 
So the first two segments must match to a thing type supported by a binding (e.g. `network:device` or `astro:moon`), whereas the thing id can be freely defined. 
Optionally, you may provide a label in order to recognize it easily, otherwise the default label from the thing type will be displayed.

To help organizing your things, you also may define a location (here: `Location`).

Inside the squared brackets configuration parameters of the thing are defined. 
The type of the configuration parameter is determined by the binding and must be specified accordingly in the DSL.


**Examples:**

```xtend
Thing network:device:webcam "Webcam" @ "Living Room" [ hostname="192.168.0.2", timeout="5000", ... ]
Thing astro:moon:home [ geolocation="50.12345,10.98765", interval=300 ]
Thing ntp:ntp:local [ hostname="de.pool.ntp.org" ]
```

Looking at the first example:

- the binding ID is "network" (using the [Network Binding](/addons/bindings/network/))
- the type ID is "device", indicating the Thing is a device
- the Thing ID is "webcam", which is an ID to uniquely identify the Thing
- the label is "Webcam", this is how the Thing will be named in the various user interfaces
- the physical location of the Thing is "Living Room"
- the values inside the `[]` brackets are the Thing's configuration parameters, these are partly mandatory and optional

Please check each individual binding's [documentation](/addons/#binding) for details on what and how to define the Things configuration parameters (inside the `[]` brackets) using the `*.things` configuration text files.

### Defining Bridges Using Files

Bridges can be defined together with contained things. The following configuration shows the definition of a hue bridge with two hue lamps:

```xtend
Bridge hue:bridge:mybridge [ ipAddress="192.168.3.123" ] {
	Thing 0210 bulb1 [ lightId="1" ]
	Thing 0210 bulb2 [ lightId="2" ]
}
```

Within the curly brackets things can be defined, that should be members of the bridge. 
For the contained thing only the thing type ID and thing ID must be defined (e.g. 0210 bulb1). 
So the syntax is `Thing <thingTypeId> <thingId> []`. 
The resulting UID of the thing is `hue:0210:mybridge:bulb1`.

Bridges that are defined somewhere else can also be referenced in the DSL:

```xtend
Thing hue:0210:mybridge:bulb (hue:bridge:mybridge) [lightId="3"]
```

The referenced bridge is specified in the parentheses. 
Please notice that the UID of the thing also contains the bridge ID as third segment. 
For the contained notation of things the UID will be inherited and the bridge ID is automatically taken as part of the resulting thing UID.

**Example of a MQTT Bridge with Generic MQTT Things :**
```xtend
Bridge mqtt:broker:MyMQTTBroker [ host="192.168.178.50", secure=false, username="MyUserName", password="MyPassword"] {
  Thing topic sonoff_Dual_Thing "Light_Dual" @ "Sonoff" {  
    Channels:
      Type switch : PowerSwitch1  [ stateTopic="stat/sonoff_dual/POWER1" , commandTopic="cmnd/sonoff_dual/POWER1", on="ON", off="OFF"]
      Type switch : PowerSwitch2  [ stateTopic="stat/sonoff_dual/POWER2" , commandTopic="cmnd/sonoff_dual/POWER2", on="ON", off="OFF"]
      Type string : Version [stateTopic="stat/sonoff_dual/STATUS2", transformationPattern="JSONPATH:$.StatusFWR.Version"]
      }     
  Thing topic sonoff_TH_Thing "Light_TH" @ "Sonoff" {
    Channels:
      Type switch : PowerSwitch  [ stateTopic="stat/sonoff_TH/POWER", commandTopic="cmnd/sonoff_TH/POWER", on="ON", off="OFF" ]
      Type string : Version [stateTopic="stat/sonoff_TH/STATUS2", transformationPattern="JSONPATH:$.StatusFWR.Version"]
      Type number : Temperature [stateTopic="tele/sonoff_TH/SENSOR", transformationPattern="JSONPATH:$.AM2301.Temperature"]
      Type number : Humidity [stateTopic="tele/sonoff_TH/SENSOR", transformationPattern="JSONPATH:$.AM2301.Humidity"]
   }
}   
```

### Linking Items

Items can be linked to Channels of discovered or manually defined Things inside Paper UI or inside configuration files.
For more details about Item definition and usage, please refer to the [Items configuration article]({{base}}/configuration/items.html).

It is important to note, that Channels of discovered Things can also be linked to Items defined in `.items` files.
In order to link a Thing to an Item in an `.items` file, open the Thing in Paper UI under *Configuration → Things*.
In the list of Thing Channels, look for the Channel you wish to link to an Item and copy the Channel's ID.
For instance, a Z-Wave switch might have a Switch Channel that has an ID like this:

```xtend
zwave:device:1a2b3c4d:node2:switch_binary
```

To bind that Channel to an Item in an `.items` file, you can define an Item in the file like so:

```xtend
Switch Kitchen_Light_Switch "Kitchen Light" (Indoor_Lights) { channel="zwave:device:1a2b3c4d:node2:switch_binary" }
```
