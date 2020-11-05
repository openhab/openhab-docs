---
layout: developersguide
title: Thing Descriptions
---

{% include base.html %}

# Binding Definitions
{:.no_toc}

In order to work with *Things* and *Channels*, some meta information about them is needed.

These are provided through 'ThingType' and 'ChannelType' definitions,
which describe details about their functionality and configuration options.

{::options toc_levels="2,3"/}
* TOC
{:toc}

## ThingTypeProvider / ChannelTypeProvider

Technically, the thing types are provided by `ThingTypeProvider`s (`org.eclipse.smarthome.core.thing.binding.ThingTypeProvider`).

openHAB comes with an implementation of such a provider that reads XML files from the folder `ESH-INF/thing` of bundles.
Although we refer to this XML syntax in the following, you also have the option to provide directly object model instances through your own provider implementation.

The same applies for the channel types.
The `ChannelTypeProvider` interface can be registered as OSGi service to provide channel types programmatically.
When implementing a dynamic `ThingTypeProvider` you can also refer to the channel types that are defined inside XML files.

## Things

Things represent devices or services that can be individually added to, configured or removed from the system.
They either contain a set of channels or a set of channel groups.
A bridge is a specific type of thing as it can additionally provide access to other Things as well.
Which Things can be associated through which bridge type is defined within the description of a thing:

```xml
    <thing-type id="thingTypeID">
        <supported-bridge-type-refs>
            <bridge-type-ref id="bridgeTypeID" />
        </supported-bridge-type-refs>
        <label>Sample Thing</label>
        <description>Some sample description</description>
        <category>Lightbulb</category>
		...
    </thing-type>
```

Bindings may optionally set the listing of a thing type.
By doing do, they indicate to user interfaces whether it should be shown to the users or not, e.g. when pairing things manually:

```xml
    <thing-type id="thingTypeID" listed="false">
        ...
    </thing-type>
```

Thing types are listed by default, unless specified otherwise.
Hiding thing types potentially makes sense if they are deprecated and should not be used anymore.
Also, this can be useful if users should not be bothered with distinguishing similar devices which for technical reasons have to have separate thing types.
In that way, a generic thing type could be listed for users and a corresponding thing handler would change the thing type immediately to a more concrete one, handing over control to the correct specialized handler.

### Thing Categories

A description about thing categories as well as an overview about which categories exist can be found in our [categories overview](../../concepts/categories.html).

## Channels

A channel describes a specific functionality of a thing and can be linked to an item.
So the basic information is, which command types the channel can handle and which state it sends to the linked item.
This can be specified by the accepted item type.
Inside the thing type description XML file a list of channels can be referenced.
The channel type definition is specified on the same level as the thing type definition.
That way channels can be reused in different things.

The granularity of channel types should be on its semantic level, i.e. very fine-grained:
If a Thing measures two temperature values, one for indoor and one for outdoor, this should be modelled as two different channel types.
Overriding labels of a channel type must only be done if the very same functionality is offered multiple times, e.g. having an actuator with 5 relays, which each is a simple "switch", but you want to individually name the channels (1-5).

### State Channel Types

The following XML snippet shows a thing type definition with 2 channels and one referenced channel type:

```xml
<thing-type id="thingTypeID">
    <label>Sample Thing</label>
    <description>Some sample description</description>
    <channels>
        <channel id="switch" typeId="powerSwitch" />
        <channel id="temperature" typeId="setpointTemperature" />
    </channels>
</thing-type>
<channel-type id="setpointTemperature" advanced="true">
    <item-type>Number</item-type>
    <label>Setpoint Temperature</label>
    <category>Temperature</category>
    <state min="12" max="30" step="0.5" pattern="%.1f °C" readOnly="false" />
</channel-type>
```

In order to reuse identical channels in different bindings a channel type can be system-wide.
A channel type can be declared as system-wide by setting its `system` property to true and can then be referenced using a `system.` prefix in a `channel` `typeId` attribute in any binding - note that this should only be done in the core framework, but not by individual bindings!

The following XML snippet shows a system channel type definition and thing type definition that references it:

```xml
<thing-type id="thingTypeID">
    <label>Sample Thing</label>
    <description>Some sample description</description>
    <channels>
        <channel id="s" typeId="system.system-channel" />
    </channels>
</thing-type>
<channel-type id="system-channel" system="true">
    <item-type>Number</item-type>
    <label>System Channel</label>
    <category>QualityOfService</category>
</channel-type>
```

### System State Channel Types

There exist system-wide channel types that are available by default:

| Channel Type ID      | Reference typeId            | Item Type            | Category         | Description                                                                                                                                                                                                             |
|----------------------|-----------------------------|----------------------|------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| signal-strength      | system.signal-strength      | Number               | QualityOfService | Represents signal strength of a device as a Number with values 0, 1, 2, 3 or 4; 0 being worst strength and 4 being best strength.                                                                                       |
| low-battery          | system.low-battery          | Switch               | Battery          | Represents a low battery warning with possible values on (low battery) and off (battery ok).                                                                                                                                                           |
| battery-level        | system.battery-level        | Number               | Battery          | Represents the battery level as a percentage (0-100%). Bindings for things supporting battery level in a different format (e.g. 4 levels) should convert to a percentage to provide a consistent battery level reading. |
| power                | system.power                | Switch               | -                | Turn a device on/off.                                                                                                                                                                                                   |
| brightness           | system.brightness           | Dimmer               | Light            | Brightness of a bulb (0-100%).                                                                                                                                                                                          |
| color                | system.color                | Color                | ColorLight       | Color of a bulb.                                                                                                                                                                                                        |
| color-temperature    | system.color-temperature    | Dimmer               | ColorLight       | Color temperature of a bulb (0-100%). 0% should be the coldest setting (highest Kelvin value).                                                                                                                          |
| location             | system.location             | Location             | -                | Location in lat.,lon.,height coordinates.                                                                                                                                                                               |
| motion               | system.motion               | Switch               | Motion           | Motion detected by the device (ON if motion is detected).                                                                                                                                                               |
| mute                 | system.mute                 | Switch               | SoundVolume      | Turn on/off the volume of a device.                                                                                                                                                                                     |
| volume               | system.volume               | Dimmer               | SoundVolume      | Change the sound volume of a device (0-100%).                                                                                                                                                                           |
| media-control        | system.media-control        | Player               | MediaControl     | Control for a media player.                                                                                                                                                                                             |
| media-title          | system.media-title          | String               | -                | Title of a (played) media file.                                                                                                                                                                                         |
| media-artist         | system.media-artist         | String               | -                | Artist of a (played) media file.                                                                                                                                                                                        |
| outdoor-temperature  | system.outdoor-temperature  | Number:Temperature   | Temperature      | Current outdoor temperature.                                                                                                                                                                                            |
| wind-direction       | system.wind-direction       | Number:Angle         | Wind             | Wind direction in degrees (0-360°).                                                                                                                                                                                     |
| wind-speed           | system.wind-speed           | Number:Speed         | Wind             | Wind speed                                                                                                                                                                                                              |
| atmospheric-humidity | system.atmospheric-humidity | Number:Dimensionless | Humidity         | Atmospheric humidity in percent.                                                                                                                                                                                        |
| barometric-pressure  | system.barometric-pressure  | Number:Pressure      | Pressure         | Barometric pressure                                                                                                                                                                                                     |

For further information about categories see the [categories page](../../concepts/categories.html).

The `advanced` property indicates whether this channel is a basic or a more specific functionality of the thing.
If `advanced` is set to `true` a user interface may hide this channel by default.
The default value is `false` and thus will be taken if the `advanced` attribute is not specified.
Especially for complex devices with a lot of channels, only a small set of channels - the most important ones - should be shown to the user to reduce complexity.
Whether a channel should be declared as `advanced` depends on the device and can be decided by the binding developer.
If a functionality is rarely used it should be better marked as `advanced`.

### Trigger Channel Types

The following XML snippet shows a trigger channel:

```xml
<thing-type id="thingTypeID">
    <label>Sample Thing</label>
    <description>Some sample description</description>
    <channels>
        <channel id="s" typeId="trigger-channel" />
    </channels>
</thing-type>
<channel-type id="trigger-channel">
    <kind>trigger</kind>
    <label>Trigger Channel</label>
    <event>
        <options>
            <option value="PRESSED">pressed</option>
            <option value="RELEASED">released</option>
            <option value="DOUBLE_PRESSED">double pressed</option>
        </options>
    </event>
</channel-type>
```

This channel can emit the event payloads `PRESSED`, `RELEASED` and `DOUBLE_PRESSED`.

If no `<event>` tag is specified, the channel can be triggered, but has no event payload.
If an empty `<event>` tag is specified, the channel can trigger any event payload.

### System Trigger Channel Types

There exist system-wide trigger channel types that are available by default:

| Channel Type ID | Reference typeId       | Description  |
|-----------------|------------------------|------------- |
| trigger         | system.trigger         | Can only trigger, no event payload |
| rawbutton       | system.rawbutton       | Can trigger `PRESSED` and `RELEASED` |
| button          | system.button          | Can trigger `SHORT_PRESSED`, `DOUBLE_PRESSED` and `LONG_PRESSED` |
| rawrocker       | system.rawrocker       | Can trigger `DIR1_PRESSED`, `DIR1_RELEASED`, `DIR2_PRESSED` and `DIR2_RELEASED` |

In the following sections the declaration and semantics of tags, state descriptions and channel categories will be explained in more detail. 
For a complete sample of the thing types XML file and a full list of possible configuration options please see the [XML Configuration Guide](config-xml.html).

### Default Tags

The XML definition of a ThingType allows to assign default tags to channels. 
All items bound to this channel will automatically be tagged with these default tags. 
The following snippet shows a 'Lighting' tag definition:

```xml
<tags>
    <tag>Lighting</tag>
</tags>
```

Please note that only tags from a pre-defined tag library should be used.
This library is still in development., and only a very small set of tags are defined so far:

| Tag                | Item Types                 | Description                                                                           |
|--------------------|----------------------------|---------------------------------------------------------------------------------------|
| Lighting           | Switch, Dimmer, Color      | A light source, either switchable, dimmable or color                                  |
| Switchable         | Switch, Dimmer, Color      | An accessory that can be turned off and on.                                           |
| CurrentTemperature | Number, Number:Temperature | An accessory that provides a single read-only temperature value.                      |
| TargetTemperature  | Number, Number:Temperature | A target temperature that should engage a thermostats heating and cooling actions.   |
| CurrentHumidity    | Number                     | An accessory that provides a single read-only value indicating the relative humidity. |


### State Description

The state description allows to specify restrictions and additional information for the state of an item, that is linked to the channel.
Some configuration options are only valid for specific item types.
The following XML snippet shows the definition for a temperature actuator channel:

```xml
<state min="12" max="30" step="0.5" pattern="%.1f %unit%" readOnly="false"></state>
```

* The attributes `min` and `max` can only be declared for channel with the item type `Number`.
  It defines the range of the numeric value.
  The Java data type is a BigDecimal.
  For example user interfaces can create sliders with an appropriate scale based on this information.
* The `step` attribute can be declared for `Number` and `Dimmer` items and defines what is the minimal step size that can be used.
* The `readonly` attribute can be used for all item types and defines if the state of an item can be changed.
  For all sensors the `readonly` attribute should be set to `true`.
* The `pattern` attribute can be used for `Number` and  `String` items.
  It gives user interface a hint how to render the item.
  The format of the pattern must be compliant to the [Java Number Format](http://docs.oracle.com/javase/tutorial/java/data/numberformat.html).
  The pattern can be localized (see also [Internationalization](../../features/internationalization.html)).
  The special pattern placeholder `%unit%` is used for channels which bind to items of type `Number:<dimension>` which define a dimension for unit support.
  These channels will send state updates of type [QuantityType](../../concepts/units-of-measurement.html#quantitytype) and the unit is then rendered for the placeholder.

Some channels might have only a limited and countable set of states.
These states can be specified as options.
A `String` or `Number` item must be used as item type.

The following XML snippet defines a list of predefined state options:

```xml
<state readOnly="true">
    <options>
        <option value="HIGH">High Pressure</option>
        <option value="MEDIUM">Medium Pressure</option>
        <option value="LOW">Low Pressure</option>
    </options>
</state>
```

The user interface can use these values to render labels for values or to provide a selection of states, when the channel is writable.
The option labels can also be localized.

### Command Description

If the primary purpose of a channel is to send commands towards a device (i.e. the opposite direction of trigger channels),
it can use command options.

A `String` item must be used as item type.

The following XML snippet defines a list of commands:

```xml
<command>
    <options>
        <option value="ALARM">Alarm</option>
        <option value="LSELECT">Long Alarm</option>
    </options>
</command>
```

The user interface can use these values to render
* a drop down and also represent the current state or
* as push buttons to simply send a command to the ThingHandler.

The option labels can also be localized.

#### Dynamic State / Command Description

In situations where the static definition of a state description is not sufficient a binding would implement a `DynamicStateDescriptionProvider` or a `DynamicCommandDescriptionProvider`.

These providers allow to provide a `StateDescription` (or `CommandDescription` respectively) based on the specific `Channel`.

Also implement this interface if you want to provide dynamic state / command options.
The original `StateDescription`/`CommandDescription` is available for modification and enhancement.
The framework provides two abstract implementations for bindings to support translation and other basic features: `BaseDynamicStateDescriptionProvider` and `BaseDynamicCommandDescriptionProvider`.

The `StateDescriptionFragmentBuilder` (and `CommandDescriptionBuilder`) can be used to only provide the information which is available at the time of construction.

##### Example code for a `DynamicStateDescriptionProvider` implementation

```java
@Component(service = { DynamicStateDescriptionProvider.class, ExampleDynamicStateDescriptionProvider.class })
public class ExampleDynamicStateDescriptionProvider implements DynamicStateDescriptionProvider {

    private final Map<ChannelUID, @Nullable List<StateOption>> channelOptionsMap = new ConcurrentHashMap<>();

    /**
     * For a given channel UID, set a {@link List} of {@link StateOption}s that should be used for the channel, instead
     * of the one defined statically in the {@link ChannelType}.
     *
     * @param channelUID the channel UID of the channel
     * @param options a {@link List} of {@link StateOption}s
     */
    public void setStateOptions(ChannelUID channelUID, List<StateOption> options) {
        channelOptionsMap.put(channelUID, options);
    }

    @Override
    public @Nullable StateDescription getStateDescription(Channel channel, @Nullable StateDescription original,
            @Nullable Locale locale) {
        List<StateOption> options = channelOptionsMap.get(channel.getUID());
        if (options == null) {
            return null;
        }

        StateDescriptionFragmentBuilder builder = (original == null) ? StateDescriptionFragmentBuilder.create()
                : StateDescriptionFragmentBuilder.create(original);
        return builder.withOptions(options).build().toStateDescription();
    }

    @Deactivate
    public void deactivate() {
        channelOptionsMap.clear();
    }
}
```

##### Example code for a `DynamicStateDescriptionProvider` implementation which extends the `BaseDynamicStateDescriptionProvider`

```java
@Component(service = { DynamicStateDescriptionProvider.class, ExampleDynamicStateDescriptionProvider.class })
public class ExampleDynamicStateDescriptionProvider extends BaseDynamicStateDescriptionProvider {

    @Reference
    protected void setChannelTypeI18nLocalizationService(
            final ChannelTypeI18nLocalizationService channelTypeI18nLocalizationService) {
        this.channelTypeI18nLocalizationService = channelTypeI18nLocalizationService;
    }

    protected void unsetChannelTypeI18nLocalizationService(
            final ChannelTypeI18nLocalizationService channelTypeI18nLocalizationService) {
        this.channelTypeI18nLocalizationService = null;
    }
}
```

##### Example code for a `DynamicCommandDescriptionProvider` implementation

```java
@Component(service = { DynamicCommandDescriptionProvider.class, ExampleDynamicCommandDescriptionProvider.class })
public class ExampleDynamicCommandDescriptionProvider implements DynamicCommandDescriptionProvider {

    private final Map<ChannelUID, @Nullable List<CommandOption>> channelOptionsMap = new ConcurrentHashMap<>();

    /**
     * For a given channel UID, set a {@link List} of {@link CommandOption}s that should be used for the channel,
     * instead of the one defined statically in the {@link ChannelType}.
     *
     * @param channelUID the channel UID of the channel
     * @param options a {@link List} of {@link CommandOption}s
     */
    public void setCommandOptions(ChannelUID channelUID, List<CommandOption> options) {
        channelOptionsMap.put(channelUID, options);
    }

    @Override
    public @Nullable CommandDescription getCommandDescription(Channel channel,
            @Nullable CommandDescription originalCommandDescription, @Nullable Locale locale) {
        List<CommandOption> options = channelOptionsMap.get(channel.getUID());
        if (options == null) {
            return null;
        }

        return CommandDescriptionBuilder.create().withCommandOptions(options).build();
    }
}
```

Most of the times handlers need to modify those dynamic information.
Therefore the `ThingHandlerFactory` has to reference the bundle instance and pass it to the handler.

```java
public class ExampleHandlerFactory extends BaseThingHandlerFactory {

    @Reference
    private ExampleDynamicStateDescriptionProvider stateDescriptionProvider;

    @Override
    protected ThingHandler createHandler(Thing thing) {
        if (EXAMPLE_THING_TYPE.equals(thing.getThingTypeUID())) {
            return new ExampleHandler(thing, stateDescriptionProvider);
        }
        return null;
    }
}
```

### Channel Categories

A description about channel categories as well as an overview about which categories exist can be found in out [categories overview](../../concepts/categories.html).

### Channel Groups

Some devices might have a lot of channels.
There are also complex devices like a multi-channel actuator, which is installed inside the switchboard, but controls switches in other rooms.
Therefore channel groups can be used to group a set of channels together into one logical block.
A thing can only have direct channels or channel groups, but not both.

Inside the thing types XML file channel groups can be defined like this:

```xml
<thing-type id="multiChannelSwitchActor">
    <!-- ... -->
    <channel-groups>
        <channel-group id="switchActor1" typeId="switchActor" />
        <channel-group id="switchActor2" typeId="switchActor" />
    </channel-groups>
    <!-- ... -->
</thing-type>    
```

The channel group type is defined on the same level as the thing types and channel types.
The group type must have a label, an optional description, and an optional [category](../../concepts/categories.html).
Moreover the list of contained channels must be specified:

```xml
<channel-group-type id="switchActor">
    <label>Switch Actor</label>
    <description>This is a single switch actor with a switch channel</description>
    <category>Light</category>
    <channels>
        <channel id="switch" typeId="switch" />
    </channels>
</channel-group-type>
```

When a thing will be created for a thing type with channel groups, the channel UID will contain the group ID in the last segment divided by a hash (#).
If an Item should be linked to a channel within a group, the channel UID would be `binding:multiChannelSwitchActor:myDevice:switchActor1#switch` for the XML example before.
Details about the category can be found in our [categories overview](../../concepts/categories.html).

## Properties

Solutions based on openHAB might require meta data from a device.
These meta data could include:

- general device information, e.g. the device vendor, the device series or the model ID, ...
- device characteristics, e.g. if it is battery based, which home automation protocol is used, what is the current firmware version or the serial number, ...
- physical descriptions, e.g. what is the size, the weight or the color of the device, ...
- any other meta data that should be made available for the solution by the binding

Depending on the solution the provided meta data can be used for different purposes.
Among others the one solution could use the data during a device pairing process whereas another solution might use the data to group the devices/things by the vendors or by the home automation protocols on a user interface.
To define such thing meta data the thing type definition provides the possibility to specify so-called `properties`:

```xml
    <thing-type id="thingTypeId">
        ...
        <properties>
             <property name="vendor">MyThingVendor</property>
             <property name="modelId">thingTypeId</property>
             <property name="protocol">ZigBee</property>
             ...
        </properties>
		...
    </thing-type>
```

In general each `property` must have a name attribute which should be written in camel case syntax.
The actual property value is defined as plain text and is placed as child node of the property element.
It is recommended that at least the vendor and the model id properties are specified here since they should be definable for the most of the devices.
In contrast to the properties defined in the 'ThingType' definitions the thing handler [documentation](thing-handler.html) explains how properties can be set during runtime.

### Representation Property

A thing type can contain a so-called `representation property`.
This optional property contains the **name** of a property whose value can be used to uniquely identify a device.
The `thingUID` cannot be used for this purpose because there can be more than one thing for the same device.

Each physical device normally has some kind of a technical identifier which is unique.
This could be a MAC address (e.g. Hue bridge, camera, all IP-based devices), a unique device id (e.g. a Hue lamp) or some other property that is unique per device type.
This property is normally part of a discovery result for that specific thing type.
Having this property identified per binding it could be used as the `representation property` for this thing.

The `representation property` shall be defined in the thing type XML: 

```xml
    <thing-type id="thingTypeId">
        ...
        <properties>
            <property name="vendor">Philips</property>
        </properties>
        <representation-property>uniqueId</representation-property>
        ...
    </thing-type>
```

Note that the `representation property` is normally not listed in the `properties` part of the Thing type XML, as this part contains static properties, that are the same for all instances of this Thing type.
The name of the `representation property` identifies a property or configuration parameter that is added to the Thing in the Thing handler upon successful initialization.

### Representation Property and Discovery

The representation property is used to auto-ignore discovery results of Things that already exist in the system.
This can happen if, a) a Thing has been created manually, or b) the Thing has been discovered separately by two mechanisms e.g. by mDNS, and by NetBios, or UPnP.
If this is the case, the Thing in the inbox is automatically ignored.
Note that this Thing is automatically removed when the manually added Thing is removed.
A new discovery would then automatically find this Thing again and add it to the inbox properly.

See also [Implementing a Discovery Service](index.md#representation-property)

When comparing representation properties, the auto-ignore service checks for matches between the representation property of the newly discovered Thing, and both the properties and the configuration parameters of existing Things.
If a configuration parameter will be used, then its respective `parameter` shall be declared in the XML `config-description` section or the `config-description` [XML file](config-xml.md):

```xml
    <thing-type id="thingTypeId">
        ...
        <representation-property>uniqueId</representation-property>
        ...
    		<config-description>
  			  <parameter name="uniqueId" type="text">
		  		  <label>Unique Id</label>
			  	  <description>The Unique Id for Representation Property</description>
  			  </parameter>
    		</config-description>
        ...
    </thing-type>
```

## Formatting Labels and Descriptions

The label and descriptions for things, channels and config descriptions should follow the following format.
The label should be short so that for most UIs it does not spread across multiple lines.
Labels should be capitalized using the following rules:
* Always capitalize the first and the last word.
* Lowercase articles, coordinating conjunctions, and prepositions (`a, an, the, and, as, but, by, for, from, in, into, like, near, nor, of, onto, or, out, over, past, so, till, to, up, upon, with, yet`).
* Capitalize all other words.
* Brand- or product names that starts with a lowercase character can be written using their official spelling.

The description can contain longer text to describe the thing in more detail.
Limited use of HTML tags is permitted to enhance the description - if a long description is provided, the first line should be kept short, and a line break (```<br />```) placed at the end of the line to allow UIs to display a short description in limited space.

Configuration options should be kept short so that they are displayable in a single line in most UIs.
If you want to provide a longer description of the options provided by a particular parameter, then this should be placed into the ```<description>``` of the parameter to keep the option label short.
The description can include limited HTML to enhance the display of this information.

The following HTML tags are allowed : ```<b>, <br />, <em>, <h1>, <h2>, <h3>, <h4>, <h5>, <h6>, <i>, <p>, <small>, <strong>, <sub>, <sup>, <ul>, <ol>, <li>```.
These must be inside the XML escape sequence - e.g. ```<description><![CDATA[ HTML marked up text here ]]></description>```.

## Auto Update Policies

Channel types can optionally define a policy with respect to the auto update handling.
This influences the decision within the framework if an auto-update of the item's state should be sent in case a command is received for it.
The auto update policy typically is inherited by the channel from its channel type.
Nevertheless, this value can be overridden in the channel definition.

In this example, an auto update policy is defined for the channel type, but is overridden in the channel definition:

```xml
<channel-type id="channel">
    <label>Channel with an auto update policy</label>
    <autoUpdatePolicy>recommend</autoUpdatePolicy>
</channel-type>

<thing-type id="thingtype">
    <label>Sample Thing</label>
    <description>Thing type which overrides the auto update policy of a channel</description>
    <channels>
      <channel id="instance" typeId="channel">
        <autoUpdatePolicy>default</autoUpdatePolicy>
      </channel>
    </channels>
</thing-type>
```

The following policies are supported:

* **veto**: No automatic state update should be sent by the framework.
  The thing handler will make sure it sends a state update and it can do it better than just converting the command to a state.
* **default**: The binding does not care and the framework may do what it deems to be right.
  The state update which the framework will send out normally will correspond the command state anyway.
  This is the default if no other policy is set explicitly.
* **recommend**: An automatic state update should be sent by the framework because no updates are sent by the binding.
  This usually is the case when devices don't expose their current state to the handler.


## Bridges and Thing Descriptions

Every binding has to provide meta information about which bridges and/or *Thing*s it provides and how their relations to each other are structured.
In that way a binding could describe that it requires specific bridges to be operational or define which channels (e.g. temperature, color, etc.) it provides.

Every bridge or *Thing* has to provide meta information such as label or description.
The meta information of all bridges and *Thing*s is accessible through the `org.eclipse.smarthome.core.thing.binding.ThingTypeProvider` service.

Bridge and *Thing* descriptions must be placed as XML file(s) (with the ending `.xml`) in the bundle's folder `/ESH-INF/thing/`.
The full Java API for bridge and *Thing* descriptions can be found in the Java package `org.eclipse.smarthome.core.thing.type`.


### XML Structure for Thing Descriptions

```xml
<?xml version="1.0" encoding="UTF-8"?>
<thing:thing-descriptions bindingId="bindingID"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:thing="https://openhab.org/schemas/thing-description/v1.0.0"
    xsi:schemaLocation="https://openhab.org/schemas/thing-description/v1.0.0
        https://openhab.org/schemas/thing-description-1.0.0.xsd">

  <bridge-type id="bridgeTypeID" listed="{true|false}" extensible="channelTypeId1,channelTypeId2,...">
    <supported-bridge-type-refs>
      <bridge-type-ref id="bridgeTypeID" />
      ...
    </supported-bridge-type-refs>

    <label>String</label>
    <description>String</description>
    <category>String</category>

    <channels>
      <channel id="channelID" typeId="channelTypeID" />
      OR
      <channel id="channelID" typeId="channelTypeID">
        <label>String</label>
        <description>String</description>
      </channel>
      ...
    </channels>
    OR
    <channel-groups>
      <channel-group id="channelGroupID" typeId="channelGroupTypeID" />
      OR
      <channel-group id="channelGroupID" typeId="channelGroupTypeID">
        <label>String</label>
        <description>String</description>
      </channel-group>
      ...
    </channel-groups>

    <properties>
        <property name="propertyName">propertyValue</property>
        ...
    </properties>
    <representation-property>propertyName</representation-property>

    <config-description>
      ...
    </config-description>
    OR
    <config-description-ref uri="{binding|thing-type|channel-type|any_other}:bindingID:..." />
  </bridge-type>

  <thing-type id="thingTypeID" listed="{true|false}" extensible="channelTypeId1,channelTypeId2,...">
    <supported-bridge-type-refs>
      <bridge-type-ref id="bridgeTypeID" />
      ...
    </supported-bridge-type-refs>

    <label>String</label>
    <description>String</description>
    <category>String</category>

    <channels>
      <channel id="channelID" typeId="channelTypeID" />
      OR
      <channel id="channelID" typeId="channelTypeID">
        <label>String</label>
        <description>String</description>
      </channel>
      ...
    </channels>
    OR
    <channel-groups>
      <channel-group id="channelGroupID" typeId="channelGroupTypeID" />
      OR
      <channel-group id="channelGroupID" typeId="channelGroupTypeID">
        <label>String</label>
        <description>String</description>
      </channel-group>
      ...
    </channel-groups>

    <properties>
        <property name="propertyName">propertyValue</property>
        ...
    </properties>
    <representation-property>propertyName</representation-property>

    <config-description>
      ...
    </config-description>
    OR
    <config-description-ref uri="{binding|thing-type|channel-type|any_other}:bindingID:..." />
  </thing-type>

  <channel-type id="channelTypeID" advanced="{true|false}">
    <item-type>Dimmer</item-type>
    OR
    <kind>trigger</kind>
    <label>String</label>
    <description>String</description>
    <category>String</category>

    <tags>
      <tag>String</tag>
      ...
    </tags>

    <state min="decimal" max="decimal" step="decimal" pattern="String" readOnly="{true|false}">
      <options>
        <option value="String" />
        OR
        <option value="String">String</option>
        ...
      </options>
    </state>
    OR
    <event>
      <options>
        <option value="String" />
        OR
        <option value="String">String</option>
        ...
      </options>
    </event>
    
    <command>
      <options>
        <option value="String" />
        OR
        <option value="String">String</option>
        ...
      </options>
    </command>

    <config-description>
      ...
    </config-description>
    OR
    <config-description-ref uri="{binding|thing-type|channel-type|any_other}:bindingID:..." />
  </channel-type>   

  <channel-group-type id="channelGroupTypeID" advanced="{true|false}">
    <label>String</label>
    <description>String</description>
    <category>String</category>

    <channels>
      <channel id="channelID" typeId="channelTypeID" />
      ...
    </channels>
  </channel-group-type>   

  ...

</thing:thing-descriptions>
```

| Property                     | Description                                  | |
|------------------------------|----------------------------------------------|--------|
| thing-descriptions.bindingId | The identifier of the binding this types belong to | mandatory |

**Bridges and Things:**

| Property                       | Description                                  | |
|--------------------------------|----------------------------------------------|--------|
| bridge-type.id / thing-type.id | An identifier for the bridge/Thing type | mandatory |
| bridge-type.listed / thing-type.listed | Denotes if user interfaces should list the bridge/Thing, e.g. for pairing | optional, defaults to true |
| bridge-type.extensible / thing-type.extensible | If the bridge/Thing supports a generic number of channels the allowed channelTypeIds can be listed here. This provides a hint for UIs to support adding/removing channels. Channel groups are not supported. | optional |
| supported-bridge-type-refs     | The identifiers of the bridges this bridge/Thing can connect to | optional |
| bridge-type-ref.id             | The identifier of a bridge this bridge/Thing can connect to | mandatory |
| label                          | A human-readable label for the bridge/Thing | mandatory |
| description                    | A human-readable description for the bridge/Thing | optional |
| category                       | Category this bridge/Thing belongs to, see categories) | optional |
| channels                       | The channels the bridge/Thing provides | optional |
| channel.id                     | An identifier of the channel the bridge/Thing provides | mandatory |
| channel.typeId                 | An identifier of the channel type definition the bridge/Thing provides | mandatory |
| label                          | A human-readable label for the channel | optional |
| description                    | A human-readable description for the channel | optional |
| channel-groups                 | The channel groups defining the channels the bridge/Thing provides | optional |
| channel-group.id               | An identifier of the channel group the bridge/Thing provides | mandatory ||
| channel-group.typeId           | An identifier of the channel group type definition the bridge/Thing provides | mandatory |
| properties                     | Name/value pairs for properties to be set to the thing | optional |
| representation-property        | The name of the property that contains a unique identifier of the thing | optional |
| config-description             | The configuration description for the bridge/Thing within the ConfigDescriptionRegistry | optional |
| config-description-ref         | The reference to a configuration description for the bridge/Thing within the ConfigDescriptionRegistry | optional |
| config-description-ref.uri     | The URI of the configuration description for the bridge/Thing within the ConfigDescriptionRegistry | mandatory |

**Channels:**

| Property                      | Description                                  | |
|-------------------------------|----------------------------------------------|--------|
| channel-type.id               | An identifier for the channel type | mandatory |
| channel-type.advanced         | The flag indicating if this channel contains advanced functionalities which should be typically not shown in the basic view of user interfaces | optional, default: false |
| kind                          | The kind of channel. state for channels which have a state, trigger for trigger channels. state is the default. | |
| item-type                     | An item type of the channel. All item types are specified in ItemFactory instances. The following items belong to the core: Switch, Rollershutter, Contact, String, Number, Dimmer, DateTime, Color, Image. | mandatory if kind state, which is the default |
| label                         | A human-readable label for the channel | mandatory |
| description                   | A human-readable description for the channel | optional |
| category                      | The category for the channel, e.g. TEMPERATURE | optional |
| tags                          | A list of default tags to be assigned to bound items | optional |
| tag                           | A tag semantically describes the feature (typical usage) of the channel e.g. AlarmSystem. There are no pre-default tags, they are custom-specific | mandatory |
| state                         | The restrictions of an item state which gives information how to interpret it | optional |
| state.min                     | The minimum decimal value of the range for the state | optional |
| state.max                     | The maximum decimal value of the range for the state | optional |
| state.step                    | The increasing/decreasing decimal step size within the defined range, specified by the minimum/maximum values | optional |
| state.pattern                 | The pattern following the printf syntax to render the state | optional |
| state.readOnly                | The flag indicating if the state is read-only or can be modified | optional, default: false |
| options                       | A list restricting all possible values | optional |
| option                        | The description for the option | optional |
| option.value                  | The value for the option. Note that the value may be outside of the range specified in the min/max if this is specified. | mandatory |
| command                       | Commands this channel will send to the binding. This is used to model "write-only" channels and gives UIs a hint to display push-buttons without state | optional |
| options                       | A list defining the possible commands | optional |
| option                        | The description for the option | optional |
| option.value                  | The value for the option. This is the actual command send to the channel. | mandatory |
| event                         | The restrictions of an trigger event which gives information how to interpret it | optional |
| autoUpdatePolicy              | The auto update policy to use | optional |
| config-description            | The configuration description for the channel within the ConfigDescriptionRegistry | optional |
| config-description-ref        | The reference to a configuration description for the channel within the ConfigDescriptionRegistry | optional |
| config-description-ref.uri    | The URI of the configuration description for the channel within the ConfigDescriptionRegistry | mandatory |

**Channel Groups:**

| Property                    | Description                                  | |
|-----------------------------|----------------------------------------------|--------|
| channel-group-type.id       | An identifier for the channel group type | mandatory |
| channel-group-type.advanced | The flag indicating if this channel group contains advanced functionalities which should be typically not shown in the basic view of user interfaces | optional, default: false |
| label                       | A human-readable label for the channel group | mandatory |
| description                 | A human-readable description for the channel group | optional |
| category                    | The category for the channel group, e.g. TEMPERATURE | optional |
| channels                    | The channels the bridge/Thing provides | mandatory |
| channel.id                  | An identifier of the channel the bridge/Thing provides | mandatory |
| channel.typeId              | An identifier of the channel type definition the bridge/Thing provides | mandatory |


The full XML schema for Thing type descriptions is specified in the <a href="https://openhab.org/schemas/thing-description-1.0.0.xsd">openHAB thing description XSD</a> file.

**Hints:**

- Any identifiers of the types are automatically mapped to unique identifiers: `bindingID:id`.
- The attribute `uri` in the section `config-description` is optional, it *should not* be specified in bridge/*Thing*/channel type definition files because it's an embedded configuration.
If the `uri` is *not* specified, the configuration description is registered as `thing-type:bindingID:id` or `channel-type:bindingID:id` otherwise the given `uri` is used.s
- If a configuration description is already specified somewhere else and the bridge/*Thing*/channel type wants to (re-)use it, a `config-description-ref` should be used instead.
