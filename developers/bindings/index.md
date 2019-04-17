---
layout: developersguide
title: Bindings
---

{% include base.html %}

# Developing a Binding

A binding is an extension to openHAB that integrates an external system like a service, a protocol or a single device. Therefore the main purpose of a binding is to translate events from the Eclipse SmartHome event bus to the external system and vice versa. The external system is represented as a set of *Things*. For each *Thing* the binding must provide a proper `ThingHandler` implementation that is able to handle the communication.

In this tutorial you will learn how to implement a simple binding and you will get familiar with important concepts and APIs of Eclipse SmartHome. The [Yahoo Weather Binding](https://github.com/eclipse/smarthome/tree/master/extensions/binding/org.eclipse.smarthome.binding.yahooweather) is taken as example.

## Structure of a Binding

The structure of a binding follows the structure of a typical OSGi bundle project. Therefore there exists a `MANIFEST.MF` file inside the `META-INF` folder and other OSGi artefacts like the `build.properties` file. In the `ESH-INF` folder XML configuration files for Eclipse SmartHome are located. The Java source code is under `src/main/java`.

The structure of the Yahoo Weather Binding:

```
|- ESH-INF
|---- binding
|------- binding.xml
|---- thing
|------- thing-types.xml
|- META-INF
|---- MANIFEST.MF
|- OSGI-INF
|---- YahooWeatherHandlerFactory.xml
|- src
|---- main
|------- java
|---------- [...]
|- build.properties
|- pom.xml
```

## Binding Definition

Every binding needs to define a `binding.xml` file, which is located in the folder `/ESH-INF/binding/`. In this file meta information for a binding like the author and a description, that are accessible at runtime, can be defined. The binding ID is a unique identifier for the binding. The following `binding.xml` shows the binding definition of the Yahoo Weather Binding:

```xml
<binding:binding id="yahooweather"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:binding="http://eclipse.org/smarthome/schemas/binding/v1.0.0"
        xsi:schemaLocation="http://eclipse.org/smarthome/schemas/binding/v1.0.0 http://eclipse.org/smarthome/schemas/binding-1.0.0.xsd">

    <name>YahooWeather Binding</name>
    <description>The Yahoo Weather Binding requests the Yahoo Weather Service
		to show the current temperature, humidity and pressure.</description>
    <author>Kai Kreuzer</author>

</binding:binding>
```

## Describing Things

External systems are represented as *Things* in the Eclipse SmartHome runtime. When starting the implementation of an Eclipse SmartHome binding, you should think about the abstraction of your external system. Different services or devices should be represented as individual *Things* described by a *ThingType*. Each functionality of the *Thing* should be modelled as a `Channel`. A binding should define all *ThingTypes* that are supported by that binding.

Eclipse SmartHome allows you to define your *ThingTypes* in a declarative way through XML files. The XML files must be located at `/ESH-INF/thing/`. A *ThingType* definition must contain the UID and optionally a description and a manufacturer. Moreover, supported channels must be specified. For channels it is important to specify which type of *Item* can be linked to the *Channel*. Below an excerpt of the Yahoo Weather service *ThingType* definition is shown:

```xml
<thing-type id="weather">
    <label>Weather Information</label>
    <description>Provides various weather data from the Yahoo service</description>
    <channels>
        <channel id="temperature" typeId="temperature" />
    </channels>
    <config-description>
        <parameter name="location" type="integer" required="true">
            <label>Location</label>
            <description>Location for the weather information.
                Syntax is WOEID, see https://en.wikipedia.org/wiki/WOEID.
            </description>
        </parameter>
        <parameter name="refresh" type="integer" min="1">
            <label>Refresh interval</label>
            <description>Specifies the refresh interval in seconds.</description>
            <default>60</default>
        </parameter>
    </config-description>
</thing-type>

<channel-type id="temperature">
    <item-type>Number:Temperature</item-type>
    <label>Temperature</label>
    <description>Current temperature</description>
    <category>Temperature</category>
    <state readOnly="true" pattern="%.1f %unit%" />
</channel-type>
```

The channel type definition allows one to specify a category and additional meta information for the state of the linked item. 
Together with the definition of the `readOnly` attribute, user interfaces get an idea how to render an item for this channel.
For example, a channel with the category `Temperature` which is readable only, indicates that this is a sensor for temperature.
In that case the user interface can render an appropriate icon and label for the current value. 

The label is further described by the `state` tags `pattern` attribute: 
In this case the temperature should be rendered with one decimal place followed by the unit the binding specifies for the current measurement. 
The `Number:Temperature` item type describes this channels ability to send state updates using the type `QuantityType` with a value and a unit. 
For detailed information about _dimensions_ and _units_ see the [QuantityType definition](../../concepts/units-of-measurement.html#quantitytype). 

If the `readOnly` flag is set to `false` (which is the default value), the user interface could render a slider to change the temperature, since this means it is temperature actuator. 
Restrictions of the state such as the minimum or maximum value can also be specified.

In order to give user interfaces a chance to render good default UIs for things, the binding should specify as much meta data as possible. For a complete list of possible configuration options and categories please see the [Thing Definition](thing-definition.html#channels) section.

## The ThingHandlerFactory

The `ThingHandlerFactory` is responsible for creating `ThingHandler` instances. Every binding must implement a `ThingHandlerFactory` and register it as OSGi service so that the runtime knows which class needs to be called for creating and handling things. From the generated archetype there already exists a `ThingHandlerFactory`, which can be extended with further *ThingTypes*.

When a new *Thing* is added, the Eclipse SmartHome runtime queries every `ThingHandlerFactory` for support of the *ThingType* by calling the `supportsThingType` method. When the method returns `true`, the runtime calls `createHandler`, which should then return a proper `ThingHandler` implementation.

The `YahooWeatherHandlerFactory` supports only one *ThingType* and instantiates a new `YahooWeatherHandler` for a given thing:

```java
@NonNullByDefault
@Component(configurationPid = "binding.yahooweather", service = ThingHandlerFactory.class)
public class YahooWeatherHandlerFactory extends BaseThingHandlerFactory {
    
    private static final Collection<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Collections.singleton(YahooWeatherBindingConstants.THING_TYPE_WEATHER);
    
    @Override
    public boolean supportsThingType(ThingTypeUID thingTypeUID) {
        return SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID);
    }

    @Override
    protected @Nullable ThingHandler createHandler(Thing thing) {
        ThingTypeUID thingTypeUID = thing.getThingTypeUID();

        if (YahooWeatherBindingConstants.THING_TYPE_WEATHER.equals(thingTypeUID)) {
            return new YahooWeatherHandler(thing);
        }

        return null;
    }
}
```

Constants like the `THING_TYPE_WEATHER` UID and also *Channel* UIDs are typically defined inside a public `BindingConstants` class.

Depending on your implementation, each *ThingType* may use its own handler. It is also possible to use the same handler for different *Things*, or use different handlers for the same *ThingType*, depending on the configuration.

## The ThingHandler

The core part of a binding is the `ThingHandler` implementation. The handler is responsible for translating Eclipse SmartHome commands and states to the external system and vice versa. 

### Handling Commands and Updating the State

For handling commands the `ThingHandler` interface defines the `handleCommand` method. This method is called when a command is sent to an item linked to a channel on a *Thing*. Inside the `handleCommand` method binding specific logic can be executed. The following code snippet shows the handle command method of the Yahoo Weather Binding:

```java
@Override
public void handleCommand(ChannelUID channelUID, Command command) {
    if (command instanceof RefreshType) {
        
        updateWeatherData();
        
        switch (channelUID.getId()) {
            case CHANNEL_TEMPERATURE:
                updateState(channelUID, getTemperature());
                break;
            case CHANNEL_HUMIDITY:
                [...]
        }
    }
}
```

When a `RefreshType` command is sent to the `ThingHandler` it updates the weather data by executing an HTTP call in the `updateWeatherData` method and sends a state update via the `updateState` method. This will update the state of the Item, which is linked to the channel for the given channel UID.

### Lifecycle

The `ThingHandler` has two important lifecycle methods: `initialize` and `dispose`. The `initialize` method is called when the handler is started and `dispose` just before the handler is stopped. Therefore these methods can be used to allocate and deallocate resources. For an example, the Yahoo Weather binding starts and stops a scheduled job within these methods.

### Configuration

*Things* can be configured with parameters. To retrieve the configuration of a *Thing* one can call `getThing().getConfiguration()` inside the `ThingHandler`. The configuration class has the equivalent methods as the `Map` interface, thus the method `get(String key)` can be used to retrieve a value for a given key. 

Moreover the configuration class has a utility method `as(Class<T> configurationClass)` that transforms the configuration into a Java object of the given type. All configuration values will be mapped to properties of the class. The type of the property must match the type of the configuration. Only the following types are supported for configuration values: `Boolean`, `String` and `BigDecimal`.

For example, the Yahoo Weather binding allows configuration of the location and the refresh frequency.

### Properties

*Things* can have properties. If you would like to add meta data to your thing, e.g. the vendor of the thing, then you can define your own thing properties by simply adding them to the thing type definition. The properties section [here](thing-definition.html#Properties) explains how to specify such properties.

To retrieve the properties one can call the operation `getProperties` of the corresponding `org.eclipse.smarthome.core.thing.type.ThingType` instance. If a thing will be created for this thing type then its properties will be automatically copied into the new thing instance. Therefore the `org.eclipse.smarthome.core.thing.Thing` interface also provides the `getProperties` operation to retrieve the defined properties. In contrast to the `getProperties` operation of the thing type instance the result of the thing´s `getProperties` operation will also contain the properties updated during runtime (cp. the thing handler [documentation](thing-handler.html)).

## Bridges

In the domain of an IoT system there are often hierarchical structures of devices and services. For example, one device acts as a gateway that enables communication with other devices that use the same protocol. In Eclipse SmartHome this kind of device or service is called *Bridge*. Philips Hue is one example of a system that requires a bridge. The Hue gateway is an IP device with an HTTP API, which communicates over the ZigBee protocol with the Hue bulbs. In the Eclipse SmartHome model the Hue gateway is represented as a *Bridge* with connected *Things*, that represent the Hue bulbs. *Bridge* inherits from *Thing*, so that it also has *Channels* and all other features of a thing, with the addition that it also holds a list of things.

When implementing a binding with *Bridges*, the logic to communicate with the external system is often shared between the different `ThingHandler` implementations. In that case it makes sense to implement a handler for the *Bridge* and delegate the actual command execution from the *ThingHandler* to the *BridgeHandler*. To access the *BridgeHandler* from the *ThingHandler*, call `getBridge().getHandler()`

The following excerpt shows how the `HueLightHandler` delegates the command for changing the light state to the `HueBridgeHandler`:

```java
@Override
public void handleCommand(ChannelUID channelUID, Command command) {

    HueBridgeHandler hueBridgeHandler = (HueBridgeHandler) getBridge().getHandler();

    switch (channelUID.getId()) {
        case CHANNEL_ID_COLOR_TEMPERATURE:
            StateUpdate lightState = lightStateConverter.toColorLightState(command);    
            hueBridgeHandler.updateLightState(getLight(), lightState);
            break;    
        case CHANNEL_ID_COLOR: 
            // ...
    }
}
```

Inside the `BridgeHandler` the list of *Things* can be retrieved via the `getThings()` call.

### Bridge Handler Implementation

A `BridgeHandler` handles the communication between the Eclipse SmartHome framework and a *bridge*  (a device that acts as a gateway to enable the communication with other devices) represented by a `Bridge` instance.
 
A bridge handler has the same properties as thing handler. Therefore, the `BridgeHandler` interface extends the `ThingHandler` interface.
 
### The BaseBridgeHandler

Eclipse SmartHome provides an abstract implementation of the `BridgeHandler` interface named `BaseBridgeHandler`. It is recommended to use this class, because it covers a lot of common logic.


### Life cycle

A `BridgeHandler` has the same life cycle than a `ThingHandler` (created by a `ThingHandlerFactory`, well defined life cycle by handler methods `initialize()` and `dispose()`, see chapter [Life Cycle](thing-handler.html#life-cycle)). A bridge acts as a gateway in order to provide access to other devices, the *child things*. Hence, the life cycle of a child handler depends on the life cycle of a bridge handler. Bridge and child handlers are subject to the following restrictions: 

- A `BridgeHandler` of a bridge is initialized before `ThingHandler`s of its child things are initialized.
- A `BridgeHandler` is disposed after all `ThingHandler`s of its child things are disposed.     


### Handler initialization notification
A `BridgeHandler` is notified about the initialization and disposal of child things. Therefore, the `BridgeHandler` interface provides the two methods `childHandlerInitialized(ThingHandler, Thing)` and `childHandlerDisposed(ThingHandler, Thing)`.  

These methods can be used to allocate and deallocate resources for child things.

## Logging

You can use a logger the following way:

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
  static Logger logger = LoggerFactory.getLogger(this.getClass());
  public static void main(String[] args) {
    logger.info("Hello World");
  }
}
```

## Config Status Provider

Each entity that has a configuration can provide its current configuration status for UIs or specific services to point to issues or to provide further general information of the current configuration.
For this purpose the handler of the entity has to implement the interface `org.eclipse.smarthome.config.core.status.ConfigStatusProvider` that has to be registered as OSGi service.
The `org.eclipse.smarthome.config.core.status.ConfigStatusService` tracks each configuration status provider and delivers the corresponding `org.eclipse.smarthome.config.core.status.ConfigStatusInfo` by the operation `getConfigStatus(String, Locale)`.

## Implementing a Discovery Service

Bindings can implement the `DiscoveryService` interface and register it as an OSGi service to inform the framework about devices and services, that can be added as things to the system (see also [Inbox & Discovery Concept](../../concepts/discovery.html)).

A discovery service provides discovery results.
The following table gives an overview about the main parts of a `DiscoveryResult`: 

| Field | Description |
|-------|-------------|
| `thingUID` | The `thingUID` is the unique identifier of the specific discovered thing (e.g. a device's serial number). It  *must not* be constructed out of properties, that can change (e.g. IP addresses). A typical `thingUID` could look like this: `hue:bridge:001788141f1a` 
| `thingTypeUID` | Contrary to the `thingUID` is the `thingTypeUID` that specifies the type the discovered thing belongs to. It could be constructed from e.g. a product number. A typical `thingTypeUID` could be the following: `hue:bridge`. 
| `bridgeUID` | If the discovered thing belongs to a bridge, the `bridgeUID` contains the UID of that bridge. 
| `properties` | The `properties` of a `DiscoveryResult` contain the configuration for the newly created thing. 
| `label` | The human readable representation of the discovery result. Do not put IP/MAC addresses or similar into the label but use the special `representationProperty` instead. |
| `representationProperty` | The name of one of the properties which discriminates the discovery result best against other results of the same type. Typically this is a serial number, IP or MAC address. The representationProperty often matches a configuration parameter and is also explicitly given in the thing-type definition. |

To simplify the implementation of own discovery services, an abstract base class `AbstractDiscoveryService` implements the `DiscoveryService`, that must only be extended.
Subclasses of `AbstractDiscoveryService` do not need to handle the `DiscoveryListeners` themselves, they can use the methods `thingDiscovered` and `thingRemoved` to notify the registered listeners.
Most of the descriptions in this chapter refer to the `AbstractDiscoveryService`.

For UPnP and mDNS there already are generic discovery services available.
Bindings only need to implement a `UpnpDiscoveryParticipant` resp. `mDNSDiscoveryParticipant`.
For details refer to the chapters [UPnP Discovery](#upnp-discovery) and [mDNS Discovery](#mdns-discovery). 

The following example is taken from the `HueLightDiscoveryService`, it calls `thingDiscovered` for each found light.
It uses the `DiscoveryResultBuilder` to create the discovery result. 

```java
    private void onLightAddedInternal(FullLight light) {
        ThingUID thingUID = getThingUID(light);
        if (thingUID != null) {
            ThingUID bridgeUID = hueBridgeHandler.getThing().getUID();
            Map<String, Object> properties = new HashMap<>(1);
            properties.put(LIGHT_ID, light.getId());
            DiscoveryResult discoveryResult = DiscoveryResultBuilder.create(thingUID).withProperties(properties)
                    .withBridge(bridgeUID).withLabel(light.getName()).build();
            thingDiscovered(discoveryResult);
        } else {
            logger.debug("discovered unsupported light of type '{}' with id {}", light.getModelID(), light.getId());
        }
    }
```

The discovery service needs to provide the list of supported thing types, that can be found by the discovery service.
This list will be given to the constructor of `AbstractDiscoveryService` and can be requested by using `DiscoveryService#getSupportedThingTypes` method. 

### Registering as an OSGi service

The `Discovery` class of a binding which implements `AbstractDiscoveryService` should be annotated with

```java
@Component(service = DiscoveryService.class, immediate = true, configurationPid = "discovery.<bindingID>")
```

where `<bindingID>` is the id of the binding, i.e. `astro` for the Astro binding.
Such a registered service will be picked up automatically by the framework.

### Background Discovery 

If the implemented discovery service enables background discovery, the `AbstractDiscoveryService` class automatically starts it.
If background discovery is enabled, the framework calls `AbstractDiscoveryService#startBackgroundDiscovery` when the binding is activated and `AbstractDiscoveryService#stopBackgroundDiscovery` when the component is deactivated.
The default implementations of both methods are empty and could be overridden by the binding developer.
Depending on the concrete implementation the discovery service might start and stop a scheduler in these method or register a listener for an external protocol.
The `thingDiscovered` method can be used to notify about a newly discovered thing.

The following example shows the implementation of the above mentioned methods in the Wemo binding. 

```java
    @Override
    protected void startBackgroundDiscovery() {
        logger.debug("Start WeMo device background discovery");
        if (wemoDiscoveryJob == null || wemoDiscoveryJob.isCancelled()) {
            wemoDiscoveryJob = scheduler.scheduleWithFixedDelay(wemoDiscoveryRunnable, 0, refreshInterval, TimeUnit.SECONDS);
        }
    }

    @Override
    protected void stopBackgroundDiscovery() {
        logger.debug("Stop WeMo device background discovery");
        if (wemoDiscoveryJob != null && !wemoDiscoveryJob.isCancelled()) {
            wemoDiscoveryJob.cancel(true);
            wemoDiscoveryJob = null;
        }
    }
```

### Active Scan

If the user triggers an active scan for a binding or specific set of thing types, the method `startScan` of each discovery service which supports these thing type is called.
Within these methods the things can be discovered.
The abstract base class automatically starts a thread, so the implementation of this method can be long-running.

The following example implementation for `startScan` is taken from the `HueLightDiscoveryService`, that triggers a scan for known and also for new lights of the hue bridge.
Already discovered things are identified by the ThingUID the DiscoveryResult was created with, and won't appear in the inbox again.

```java
    @Override
    public void startScan() {
        List<FullLight> lights = hueBridgeHandler.getFullLights();
        if (lights != null) {
            for (FullLight l : lights) {
                onLightAddedInternal(l);
            }
        }
        // search for unpaired lights
        hueBridgeHandler.startSearch();
    }
```

### Re-Discovered Results and Things

The `getThingUID` method of the discovery service should create a consistent UID every time the same thing gets discovered.
This way existing discovery results and existing things with this UID will be updated with the properties from the current scan.
With this, dynamic discoveries (like UPnP or mDNS) can re-discover existing things and update communication properties like host names or TCP ports.

### Remove older results

Normally, older discovery results already in the inbox are left untouched by a newly triggered scan.
If this behavior is not appropriate for the implemented discovery service, one can override the method `stopScan` to call `removeOlderResults` as shown in the following example from the Hue binding: 

```java
    @Override
    protected synchronized void stopScan() {
        super.stopScan();
        removeOlderResults(getTimestampOfLastScan());
    }
```

### UPnP Discovery

UPnP discovery is implemented in the framework as `UpnpDiscoveryService`.
It is widely used in bindings. To facilitate the development, binding developers only need to implement a `UpnpDiscoveryParticipant`.
Here the developer only needs to implement three simple methods: 

- `getSupportedThingTypeUIDs` - Returns the list of thing type UIDs that this participant supports.
The discovery service uses this method of all registered discovery participants to return the list of currently supported thing type UIDs. 
- `getThingUID` - Creates a thing UID out of the UPnP result or returns `null` if this is not possible.
This method is called from the discovery service during result creation to provide a unique thing UID for the result. 
- `createResult` - Creates the `DiscoveryResult` out of the UPnP result.
This method is called from the discovery service to create the actual discovery result.
It uses the `getThingUID` method to create the thing UID of the result. 

The following example shows the implementation of the UPnP discovery participant for the Hue binding, the `HueBridgeDiscoveryParticipant`. 

```java
public class HueBridgeDiscoveryParticipant implements UpnpDiscoveryParticipant {

    @Override
    public Set<ThingTypeUID> getSupportedThingTypeUIDs() {
        return Collections.singleton(THING_TYPE_BRIDGE);
    }

    @Override
    public DiscoveryResult createResult(RemoteDevice device) {
        ThingUID uid = getThingUID(device);
        if (uid != null) {
            Map<String, Object> properties = new HashMap<>(2);
            properties.put(HOST, device.getDetails().getBaseURL().getHost());
            properties.put(SERIAL_NUMBER, device.getDetails().getSerialNumber());

            DiscoveryResult result = DiscoveryResultBuilder.create(uid).withProperties(properties)
                    .withLabel(device.getDetails().getFriendlyName()).withRepresentationProperty(SERIAL_NUMBER).build();
            return result;
        } else {
            return null;
        }
    }

    @Override
    public ThingUID getThingUID(RemoteDevice device) {
        DeviceDetails details = device.getDetails();
        if (details != null) {
            ModelDetails modelDetails = details.getModelDetails();
            if (modelDetails != null) {
                String modelName = modelDetails.getModelName();
                if (modelName != null) {
                    if (modelName.startsWith("Philips hue bridge")) {
                        return new ThingUID(THING_TYPE_BRIDGE, details.getSerialNumber());
                    }
                }
            }
        }
        return null;
    }
}
```

### mDNS Discovery

mDNS discovery is implemented in the framework as `MDNSDiscoveryService`.
To facilitate the development, binding developers only need to implement a `MDNSDiscoveryParticipant`.
Here the developer only needs to implement four simple methods: 

- `getServiceType` - Defines the [mDNS service type](http://www.dns-sd.org/ServiceTypes.html).
- `getSupportedThingTypeUIDs` - Returns the list of thing type UIDs that this participant supports.
The discovery service uses this method of all registered discovery participants to return the list of currently supported thing type UIDs. 
- `getThingUID` - Creates a thing UID out of the mDNS service info or returns `null` if this is not possible.
This method is called from the discovery service during result creation to provide a unique thing UID for the result. 
- `createResult` - Creates the `DiscoveryResult` out of the UPnP result.
This method is called from the discovery service to create the actual discovery result.
It uses the `getThingUID` method to create the thing UID of the result. 


## Include the Binding in the Build

Once you are happy with your implementation, you need to integrate it in the Maven build and add it to the official distro.

* Add a new line in the [binding pom.xml](https://github.com/openhab/openhab2-addons/blob/master/bundles/pom.xml) at the alphabetically correct position.
* Furthermore add it to the [feature.xml](https://github.com/openhab/openhab2-addons/blob/master/features/karaf/openhab-addons/src/main/feature/feature.xml), again at the alphabetically correct position.
* If you have a dependency on a transport bundle (e.g. upnp, mdns or serial) or an external library,
  make sure to add a line for this dependency as well (see the other bindings as an example)

Before you create a pull request on GitHub, you should now run

```
mvn clean install
```

from the repository root to ensure that the build works smoothly (that step takes about 30 minutes).

The build includes [Tooling for static code analysis](https://github.com/openhab/static-code-analysis) that will validate your code against the openHAB Coding Guidelines and some additional best practices.
Please fix all the priority 1 issues and all issues with priority 2 and 3 that are relevant (if you have any doubt don't hesitate to ask).

You can always run the above command from within your bindings directory to speed the build up and fix and check reported errors.

Re-run the build to confirm that the checks are passing.
If it does, it is time to [contribute your work](../contributing/contributing.html)!
