---
layout: developersguide
title: Thing Descriptions
---

# Binding Definitions

In order to work with _Things_ and _Channels_, some meta information about them is needed.

These are provided through 'ThingType' and 'ChannelType' definitions,
which describe details about their functionality and configuration options.

[[toc]]

## ThingTypeProvider / ChannelTypeProvider

Technically, the thing types are provided by `ThingTypeProvider`s (`org.openhab.core.thing.binding.ThingTypeProvider`).

openHAB comes with an implementation of such a provider that reads XML files from the folder `OH-INF/thing` of bundles.
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
    <thing-type id="thing-type-id">
        <supported-bridge-type-refs>
            <bridge-type-ref id="bridge-type-id" />
        </supported-bridge-type-refs>
        <label>Sample Thing</label>
        <description>Some sample description</description>
        <category>Lightbulb</category>
        <semantic-equipment-tag>LightSource</semantic-equipment-tag>
    ...
    </thing-type>
```

Bindings may optionally set the listing of a thing type.
By doing do, they indicate to user interfaces whether it should be shown to the users or not, e.g. when pairing things manually:

```xml
    <thing-type id="thing-type-id" listed="false">
        ...
    </thing-type>
```

Thing types are listed by default, unless specified otherwise.
Hiding thing types potentially makes sense if they are deprecated and should not be used anymore.
Also, this can be useful if users should not be bothered with distinguishing similar devices which for technical reasons have to have separate thing types.
In that way, a generic thing type could be listed for users and a corresponding thing handler would change the thing type immediately to a more concrete one, handing over control to the correct specialized handler.

### Thing Categories

Categories are used to provide meta information about Things. Thing categories describe how the physical device **looks like**. UIs can use this information e.g. to render icons.
The available categories correspond with the [available icons of the classic iconset]({{base}}/configuration/iconsets/classic/), however categories are written in Java class-naming style, e.g. `FrontDoor` instead of lowercase `frontdoor`.

### Thing Semantic Equipment Tags

The XML definition of a Thing-type allows to assign a semantic equipment tag.
See [reference below](#general-information-about-tags).
This describes the Equipment family to which the Thing belongs.
All Things created based on the Thing-type will automatically inherit this tag.
The user may override this tag if they desire.
The semantic equipment tag is used by the Main User Interface to classify the Thing according to a semantic classification scheme.
The following snippet shows an `Equipment.Blinds` tag definition:

```xml
<semantic-equipment-tag>Blinds</semantic-equipment-tag>
```

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

The following XML snippet shows a thing type definition with three channels and two referenced channel types:

```xml
<thing-type id="thing-type-id">
    <label>Sample Thing</label>
    <description>Some sample description</description>
    <semantic-equipment-tag>LightSource</semantic-equipment-tag>
    <channels>
        <channel id="switch" typeId="power-switch" />
        <channel id="temperature" typeId="setpoint-temperature" />
        <channel id="room-humidity" typeId="humidity" />
    </channels>
</thing-type>
<channel-type id="setpoint-temperature" advanced="true">
    <item-type>Number</item-type>
    <label>Setpoint Temperature</label>
    <category>Temperature</category>
    <state min="12" max="30" step="0.5" pattern="%.1f °C" readOnly="false" />
</channel-type>
<channel-type id="humidity">
    <item-type unitHint="%">Number:Dimensionless</item-type>
    <label>Humidity</label>
    <state readOnly="true" pattern="%.1f %%"/>
</channel-type>
```

The `item-type` element defines the [item type](../../configuration/items.md#type) to be used when a linked item is created.
If the `item-type` is a `Number:<dimension>`, then a `unitHint` attribute may be provided to suggest the measurement unit to be used when a linked item is created.

In order to reuse identical channels in different bindings a channel type can be system-wide.
A channel type can be declared as system-wide by setting its `system` property to true and can then be referenced using a `system.` prefix in a `channel` `typeId` attribute in any binding - note that this should only be done in the core framework, but not by individual bindings!

The following XML snippet shows a system channel type definition and thing type definition that references it:

```xml
<thing-type id="thing-type-id">
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

There exist system-wide channel types that are available by default and which should be used whenever possible:

| Channel Type ID       | Reference typeId             | Item Type                | Category         | Tags                        | Description                                                                    |
|-----------------------|------------------------------|--------------------------|------------------|-----------------------------|--------------------------------------------------------------------------------|
| location              | system.location              | Location                 | -                | Measurement, GeoLocation    | Location in lat./lon./height coordinates                                       |
| uv-index              | system.uv-index              | Number                   | -                | Measurement, Ultraviolet    | Current UV index                                                               |
| media-artist          | system.media-artist          | String                   | -                | Status, Info                | Artist of a (played) media file                                                |
| media-title           | system.media-title           | String                   | -                | Status, Info                | Title of a (played) media file                                                 |
| battery-level         | system.battery-level         | Number                   | Battery          | Measurement, Energy         | Battery level as a percentage (0-100%)                                         |
| color                 | system.color                 | Color                    | ColorLight       | Control, Color              | Controls the color of the light                                                |
| color-temperature     | system.color-temperature     | Dimmer                   | ColorLight       | Control, ColorTemperature   | Controls the color temperature of the light from 0 (cold) to 100 (warm)        |
| color-temperature-abs | system.color-temperature-abs | Number:Temperature       | ColorLight       | Control, ColorTemperature   | Controls the color temperature of the light in Kelvin                          |
| electric-current      | system.electric-current      | Number:ElectricCurrent   | Energy           | Measurement, Current        | Current electric current                                                       |
| electric-voltage      | system.electric-voltage      | Number:ElectricPotential | Energy           | Measurement, Voltage        | Current electric voltage                                                       |
| electric-energy       | system.electric-energy       | Number:Energy            | Energy           | Measurement, Energy         | Current electric energy                                                        |
| electric-power        | system.electric-power        | Number:Power             | Energy           | Measurement, Power          | Current electric power                                                         |
| atmospheric-humidity  | system.atmospheric-humidity  | Number:Dimensionless     | Humidity         | Measurement, Humidity       | Current atmospheric relative humidity                                          |
| brightness            | system.brightness            | Dimmer                   | Light            | Control, Brightness         | Controls the brightness and switches the light on and off                      |
| low-battery           | system.low-battery           | Switch                   | LowBattery       | Alarm, LowBattery           | Low battery warning with possible values on (low battery) and off (battery ok) |
| media-control         | system.media-control         | Player                   | MediaControl     | Control, MediaControl       |                                                                                |
| motion                | system.motion                | Switch                   | Motion           | Status, Presence            | Motion detected by the device                                                  |
| barometric-pressure   | system.barometric-pressure   | Number:Pressure          | Pressure         | Measurement, Pressure       | Current barometric pressure                                                    |
| signal-strength       | system.signal-strength       | Number                   | QualityOfService | Measurement, SignalStrength | Signal strength as with values 0 (worst), 1, 2, 3 or 4 (best)                  |
| volume                | system.volume                | Dimmer                   | SoundVolume      | Control, SoundVolume        | Change the sound volume of a device                                            |
| mute                  | system.mute                  | Switch                   | SoundVolume_Mute | Switch, SoundVolume         | Mute audio of the device                                                       |
| power                 | system.power                 | Switch                   | Switch           | Switch, Power               | Device is operable when channel has state ON                                   |
| indoor-temperature    | system.indoor-temperature    | Number:Temperature       | Temperature      | Measurement, Temperature    | Current indoor temperature                                                     |
| outdoor-temperature   | system.outdoor-temperature   | Number:Temperature       | Temperature      | Measurement, Temperature    | Current outdoor temperature                                                    |
| wind-direction        | system.wind-direction        | Number:Angle             | Wind             | Measurement, Wind           | Current wind direction expressed as an angle                                   |
| wind-speed            | system.wind-speed            | Number:Speed             | Wind             | Measurement, Wind           | Current wind speed                                                             |

The `advanced` property indicates whether this channel is a basic or a more specific functionality of the thing.
If `advanced` is set to `true` a user interface may hide this channel by default.
The default value is `false` and thus will be taken if the `advanced` attribute is not specified.
Especially for complex devices with a lot of channels, only a small set of channels - the most important ones - should be shown to the user to reduce complexity.
Whether a channel should be declared as `advanced` depends on the device and can be decided by the binding developer.
If a functionality is rarely used it should be better marked as `advanced`.

### Trigger Channel Types

The following XML snippet shows a trigger channel:

```xml
<thing-type id="thing-type-id">
    <label>Sample Thing</label>
    <description>Some sample description</description>
    <semantic-equipment-tag>LightSource</semantic-equipment-tag>
    <channels>
        <channel id="sample-channel" typeId="trigger-channel" />
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

| Channel Type ID | Reference typeId | Description                                                                     |
|-----------------|------------------|---------------------------------------------------------------------------------|
| trigger         | system.trigger   | Can only trigger, no event payload                                              |
| rawbutton       | system.rawbutton | Can trigger `PRESSED` and `RELEASED`                                            |
| button          | system.button    | Can trigger `SHORT_PRESSED`, `DOUBLE_PRESSED` and `LONG_PRESSED`                |
| rawrocker       | system.rawrocker | Can trigger `DIR1_PRESSED`, `DIR1_RELEASED`, `DIR2_PRESSED` and `DIR2_RELEASED` |

In the following sections the declaration and semantics of tags, state descriptions and channel categories will be explained in more detail.
For a complete sample of the thing types XML file and a full list of possible configuration options please see the [XML Configuration Guide](../addons/config-xml.html).

### Default Point and Property Tags

The XML definition of a Channel-type allows to assign default tags to respective Channels.
See [reference below](#general-information-about-tags).
All Items bound to the respective Channel will automatically inherit these default tags.
The user may override these tags if they desire.
The XML definition may contain up to two tags.
The first tag should be a `Point` tag, and the second may be a `Property` tag.
The following snippet shows a `Point.Control` and `Property.Brightness` tags definition:

```xml
<tags>
    <tag>Control</tag>
    <tag>Brightness</tag>
</tags>
```

### State Description

The state description allows to specify restrictions and additional information for the state of an item, that is linked to the channel.
Some configuration options are only valid for specific item types.
The following XML snippet shows the definition for a temperature actuator channel:

```xml
<state min="12" max="30" step="0.5" pattern="%.1f %unit%" readOnly="false"></state>
```

- The attributes `min` and `max` can only be declared for channel with the item type `Number`.
  It defines the range of the numeric value.
  The Java data type is a BigDecimal.
  For example user interfaces can create sliders with an appropriate scale based on this information.
- The `step` attribute can be declared for `Number` and `Dimmer` items and defines what is the minimal step size that can be used.
- The `readonly` attribute can be used for all item types and defines if the state of an item can be changed.
  For all sensors the `readonly` attribute should be set to `true`.
- The `pattern` attribute can be used for `Number` and  `String` items.
  It gives user interface a hint how to render the item.
  The format of the pattern must be compliant to the [Java Number Format](https://docs.oracle.com/javase/tutorial/java/data/numberformat.html).
  The pattern can be localized (see also [Internationalization](../utils/i18n.html)).
  The special pattern placeholder `%unit%` is used for channels which bind to items of type `Number:<dimension>` which define a dimension for unit support.
  These channels will send state updates of type [QuantityType](../../concepts/units-of-measurement.html#quantitytype) and the unit is then rendered for the placeholder.

Some channels might have only a limited and countable set of states.
These states can be specified as options.
A `String` or `Number` item must be used as item type.
In general `String` should be preferred with a meaningful option value.
This prevents the user from having to guess what a value represents if a number is used as option value.
`Number` is useful when the value represents a quantity (e.g. like in the system-wide channel type `signal-strength`).

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

- a drop down and also represent the current state or
- as push buttons to simply send a command to the ThingHandler.

The option labels can also be localized.

#### Dynamic State / Command Description

In situations where the static definition of a state description is not sufficient a binding would implement a `DynamicStateDescriptionProvider` or a `DynamicCommandDescriptionProvider`.

These providers allow to provide a `StateDescription` (or `CommandDescription` respectively) based on the specific `Channel`.

Also implement this interface if you want to provide dynamic state / command options.
The original `StateDescription`/`CommandDescription` is available for modification and enhancement.
The framework provides two abstract implementations for bindings to support translation, publishing `ChannelDescriptionChangedEvent`s and other basic features: `BaseDynamicStateDescriptionProvider` and `BaseDynamicCommandDescriptionProvider`.

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

    @Activate
    public ExampleDynamicStateDescriptionProvider(final @Reference EventPublisher eventPublisher, //
            final @Reference ItemChannelLinkRegistry itemChannelLinkRegistry, //
            final @Reference ChannelTypeI18nLocalizationService channelTypeI18nLocalizationService) {
        this.eventPublisher = eventPublisher;
        this.itemChannelLinkRegistry = itemChannelLinkRegistry;
        this.channelTypeI18nLocalizationService = channelTypeI18nLocalizationService;
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

    private final ExampleDynamicStateDescriptionProvider stateDescriptionProvider;

    @Activate
    public ExampleHandlerFactory(final @Reference ExampleDynamicStateDescriptionProvider stateDescriptionProvider) {
        this.stateDescriptionProvider = stateDescriptionProvider;
    }

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

Channel categories are used to provide meta information about channels. Channel categories describe the **functional purpose** of the channel and are used by the UI to render icons.
The available categories correspond with the [available icons of the classic iconset]({{base}}/configuration/iconsets/classic/), however categories are written in Java class-naming style, e.g. `BatteryLevel` instead of lowercase `batterylevel`.

### Channel Groups

Some devices might have a lot of channels.
There are also complex devices like a multi-channel actuator, which is installed inside the switchboard, but controls switches in other rooms.
Therefore channel groups can be used to group a set of channels together into one logical block.
A thing can only have direct channels or channel groups, but not both.

Inside the thing types XML file channel groups can be defined like this:

```xml
<thing-type id="multi-channel-switch-actor">
    <!-- ... -->
    <channel-groups>
        <channel-group id="switch-actor-1" typeId="switch-actor" />
        <channel-group id="switch-actor-2" typeId="switch-actor" />
    </channel-groups>
    <!-- ... -->
</thing-type>
```

The channel group type is defined on the same level as the thing types and channel types.
The group type must have a label, an optional description, and an optional category (e.g. used to render an icon)..
Moreover the list of contained channels must be specified:

```xml
<channel-group-type id="switch-actor">
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
    <thing-type id="thing-type-id">
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
    <thing-type id="thing-type-id">
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
If a configuration parameter will be used, then its respective `parameter` shall be declared in the XML `config-description` section or the `config-description` [XML file](../addons/config-xml.md):

```xml
    <thing-type id="thing-type-id">
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
Guideline is 2-3 words with up to 25 chars.
Labels should be capitalized using the following rules:

- Always capitalize the first and the last word.
- Lowercase articles, coordinating conjunctions, and prepositions (`a, an, the, and, as, but, by, for, from, in, into, like, near, nor, of, onto, or, out, over, past, so, till, to, up, upon, with, yet`).
- Capitalize all other words.
- Brand- or product names that starts with a lowercase character can be written using their official spelling.

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
<channel-type id="channel-type-id">
    <label>Channel with an auto update policy</label>
    <autoUpdatePolicy>recommend</autoUpdatePolicy>
</channel-type>

<thing-type id="thing-type-id">
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

- **veto**: No automatic state update should be sent by the framework.
  The thing handler will make sure it sends a state update and it can do it better than just converting the command to a state.
- **default**: The binding does not care and the framework may do what it deems to be right.
  The state update which the framework will send out normally will correspond the command state anyway.
  This is the default if no other policy is set explicitly.
- **recommend**: An automatic state update should be sent by the framework because no updates are sent by the binding.
  This usually is the case when devices don't expose their current state to the handler.

## Bridges and Thing Descriptions

Every binding has to provide meta information about which bridges and/or _Thing_s it provides and how their relations to each other are structured.
In that way a binding could describe that it requires specific bridges to be operational or define which channels (e.g. temperature, color, etc.) it provides.

Every bridge or _Thing_ has to provide meta information such as label or description.
The meta information of all bridges and _Thing_s is accessible through the `org.openhab.core.thing.binding.ThingTypeProvider` service.

Bridge and _Thing_ descriptions must be placed as XML file(s) (with the ending `.xml`) in the bundle's folder `/OH-INF/thing/`.
The full Java API for bridge and _Thing_ descriptions can be found in the Java package `org.openhab.core.thing.type`.

### XML Structure for Thing Descriptions

```xml
<?xml version="1.0" encoding="UTF-8"?>
<thing:thing-descriptions bindingId="bindingID"
    xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
    xmlns:thing="https://openhab.org/schemas/thing-description/v1.0.0"
    xsi:schemaLocation="https://openhab.org/schemas/thing-description/v1.0.0
        https://openhab.org/schemas/thing-description-1.0.0.xsd">

  <bridge-type id="bridge-type-id" listed="{true|false}" extensible="channel-type-id-1,channel-type-id-2,...">
    <supported-bridge-type-refs>
      <bridge-type-ref id="bridge-type-ref-id" />
      ...
    </supported-bridge-type-refs>

    <label>String</label>
    <description>String</description>
    <category>String</category>
    <semantic-equipment-tag>LightSource</semantic-equipment-tag>

    <channels>
      <channel id="channel-id" typeId="channel-type-id" />
      OR
      <channel id="channel-id" typeId="channel-type-id">
        <label>String</label>
        <description>String</description>
      </channel>
      ...
    </channels>
    OR
    <channel-groups>
      <channel-group id="channel-group-id" typeId="channel-group-type-id" />
      OR
      <channel-group id="channel-group-id" typeId="channel-group-type-id">
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

  <thing-type id="thing-type-id" listed="{true|false}" extensible="channel-type-id-1,channel-type-id-2,...">
    <supported-bridge-type-refs>
      <bridge-type-ref id="bridge-type-id" />
      ...
    </supported-bridge-type-refs>

    <label>String</label>
    <description>String</description>
    <category>String</category>
    <semantic-equipment-tag>LightSource</semantic-equipment-tag>

    <channels>
      <channel id="channel-id" typeId="channel-type-id" />
      OR
      <channel id="channel-id" typeId="channel-type-id">
        <label>String</label>
        <description>String</description>
      </channel>
      ...
    </channels>
    OR
    <channel-groups>
      <channel-group id="channel-group-id" typeId="channel-group-type-id" />
      OR
      <channel-group id="channel-group-id" typeId="channel-group-type-id">
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

  <channel-type id="channel-type-id" advanced="{true|false}">
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

  <channel-group-type id="channel-group-type-id">
    <label>String</label>
    <description>String</description>
    <category>String</category>

    <channels>
      <channel id="channel-id" typeId="channel-type-id" />
      ...
    </channels>
  </channel-group-type>

  ...

</thing:thing-descriptions>
```

| Property                     | Description                                        |           |
|------------------------------|----------------------------------------------------|-----------|
| thing-descriptions.bindingId | The identifier of the binding this types belong to | mandatory |

**Bridges and Things:**

| Property                                       | Description                                                                                                                                                                                                  |                            |
|------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------|
| bridge-type.id / thing-type.id                 | An identifier for the bridge/Thing type                                                                                                                                                                      | mandatory                  |
| bridge-type.listed / thing-type.listed         | Denotes if user interfaces should list the bridge/Thing, e.g. for pairing                                                                                                                                    | optional, defaults to true |
| bridge-type.extensible / thing-type.extensible | If the bridge/Thing supports a generic number of channels the allowed channelTypeIds can be listed here. This provides a hint for UIs to support adding/removing channels. Channel groups are not supported. | optional                   |
| supported-bridge-type-refs                     | The identifiers of the bridges this bridge/Thing can connect to                                                                                                                                              | optional                   |
| bridge-type-ref.id                             | The identifier of a bridge this bridge/Thing can connect to                                                                                                                                                  | mandatory                  |
| label                                          | A human-readable label for the bridge/Thing                                                                                                                                                                  | mandatory                  |
| description                                    | A human-readable description for the bridge/Thing                                                                                                                                                            | optional                   |
| category                                       | Category this bridge/Thing belongs to, see categories)                                                                                                                                                       | optional                   |
| channels                                       | The channels the bridge/Thing provides                                                                                                                                                                       | optional                   |
| channel.id                                     | An identifier of the channel the bridge/Thing provides                                                                                                                                                       | mandatory                  |
| channel.typeId                                 | An identifier of the channel type definition the bridge/Thing provides                                                                                                                                       | mandatory                  |
| label                                          | A human-readable label for the channel                                                                                                                                                                       | optional                   |
| description                                    | A human-readable description for the channel                                                                                                                                                                 | optional                   |
| channel-groups                                 | The channel groups defining the channels the bridge/Thing provides                                                                                                                                           | optional                   |
| channel-group.id                               | An identifier of the channel group the bridge/Thing provides                                                                                                                                                 | mandatory                  |
| channel-group.typeId                           | An identifier of the channel group type definition the bridge/Thing provides                                                                                                                                 | mandatory                  |
| properties                                     | Name/value pairs for properties to be set to the thing                                                                                                                                                       | optional                   |
| representation-property                        | The name of the property that contains a unique identifier of the thing                                                                                                                                      | optional                   |
| config-description                             | The configuration description for the bridge/Thing within the ConfigDescriptionRegistry                                                                                                                      | optional                   |
| config-description-ref                         | The reference to a configuration description for the bridge/Thing within the ConfigDescriptionRegistry                                                                                                       | optional                   |
| config-description-ref.uri                     | The URI of the configuration description for the bridge/Thing within the ConfigDescriptionRegistry                                                                                                           | mandatory                  |

**Channels:**

| Property                   | Description                                                                                                                                                                                                                         |                                               |
|----------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------|
| channel-type.id            | An identifier for the channel type                                                                                                                                                                                                  | mandatory                                     |
| channel-type.advanced      | The flag indicating if this channel contains advanced functionalities which should be typically not shown in the basic view of user interfaces                                                                                      | optional, default: false                      |
| kind                       | The kind of channel. state for channels which have a state, trigger for trigger channels. state is the default.                                                                                                                     |                                               |
| item-type                  | An item type of the channel. All item types are specified in ItemFactory instances. The following items belong to the core: Switch, Rollershutter, Contact, String, Number, Dimmer, DateTime, Color, Image, Location, Player, Call. | mandatory if kind state, which is the default |
| label                      | A human-readable label for the channel                                                                                                                                                                                              | mandatory                                     |
| description                | A human-readable description for the channel                                                                                                                                                                                        | optional                                      |
| category                   | The category for the channel, e.g. TEMPERATURE                                                                                                                                                                                      | optional                                      |
| tags                       | A list of default tags to be assigned to bound items                                                                                                                                                                                | optional                                      |
| tag                        | A tag semantically describes the feature (typical usage) of the channel e.g. AlarmSystem. See [Default Tags](#default-point-and-property-tags) above.                                                                                                  | mandatory                                     |
| state                      | The restrictions of an item state which gives information how to interpret it                                                                                                                                                       | optional                                      |
| state.min                  | The minimum decimal value of the range for the state                                                                                                                                                                                | optional                                      |
| state.max                  | The maximum decimal value of the range for the state                                                                                                                                                                                | optional                                      |
| state.step                 | The increasing/decreasing decimal step size within the defined range, specified by the minimum/maximum values                                                                                                                       | optional                                      |
| state.pattern              | The pattern following the printf syntax to render the state                                                                                                                                                                         | optional                                      |
| state.readOnly             | The flag indicating if the state is read-only or can be modified                                                                                                                                                                    | optional, default: false                      |
| options                    | A list restricting all possible values                                                                                                                                                                                              | optional                                      |
| option                     | The description for the option                                                                                                                                                                                                      | optional                                      |
| option.value               | The value for the option. Note that the value may be outside of the range specified in the min/max if this is specified.                                                                                                            | mandatory                                     |
| command                    | Commands this channel will send to the binding. This is used to model "write-only" channels and gives UIs a hint to display push-buttons without state                                                                              | optional                                      |
| options                    | A list defining the possible commands                                                                                                                                                                                               | optional                                      |
| option                     | The description for the option                                                                                                                                                                                                      | optional                                      |
| option.value               | The value for the option. This is the actual command send to the channel.                                                                                                                                                           | mandatory                                     |
| event                      | The restrictions of a trigger event which gives information how to interpret it                                                                                                                                                     | optional                                      |
| autoUpdatePolicy           | The auto update policy to use                                                                                                                                                                                                       | optional                                      |
| config-description         | The configuration description for the channel within the ConfigDescriptionRegistry                                                                                                                                                  | optional                                      |
| config-description-ref     | The reference to a configuration description for the channel within the ConfigDescriptionRegistry                                                                                                                                   | optional                                      |
| config-description-ref.uri | The URI of the configuration description for the channel within the ConfigDescriptionRegistry                                                                                                                                       | mandatory                                     |

**Channel Groups:**

| Property              | Description                                                            |           |
|-----------------------|------------------------------------------------------------------------|-----------|
| channel-group-type.id | An identifier for the channel group type                               | mandatory |
| label                 | A human-readable label for the channel group                           | mandatory |
| description           | A human-readable description for the channel group                     | optional  |
| category              | The category for the channel group, e.g. TEMPERATURE                   | optional  |
| channels              | The channels the bridge/Thing provides                                 | mandatory |
| channel.id            | An identifier of the channel the bridge/Thing provides                 | mandatory |
| channel.typeId        | An identifier of the channel type definition the bridge/Thing provides | mandatory |

The full XML schema for Thing type descriptions is specified in the [https://openhab.org/schemas/thing-description-1.0.0.xsd](https://openhab.org/schemas/thing-description-1.0.0.xsd) openHAB thing description XSD</a> file.

**Hints:**

- Any identifiers of the types are automatically mapped to unique identifiers: `bindingID:id`.
- The attribute `uri` in the section `config-description` is optional, it _should not_ be specified in bridge/_Thing_/channel type definition files because it's an embedded configuration.
  If the `uri` is _not_ specified, the configuration description is registered as `thing-type:bindingID:id` or `channel-type:bindingID:id` otherwise the given `uri` is used.s
- If a configuration description is already specified somewhere else and the bridge/_Thing_/channel type wants to (re-)use it, a `config-description-ref` should be used instead.

### Updating Thing Types

Sometimes, when bindings evolve, thing-types need to be modified.
Since managed things store their structure in a database at the time they are created, only updating the XML is not sufficient.
Developers can add instructions for the framework to update these things during initialization.

The instructions are provided as XML in the `OH-INF/update` folder.
The file name can be freely chosen and the file itself can contain instructions for one or more thing-types.
Instructions for the same thing-type MUST NOT be added in different files.

Update instructions are available for adding, removing or updating channels or channel-groups.
Changes to configuration parameters don't need update instructions and are performed automatically.

The following update instruction changes the channel-type for the `battery-level` channel to `system:battery-level`.

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes" ?>
<update:update-descriptions xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                            xmlns:update="https://openhab.org/schemas/update-description/v1.0.0"
                            xsi:schemaLocation="https://openhab.org/schemas/update-description/v1.0.0 https://openhab.org/schemas/update-description-1.0.0.xsd">

  <thing-type uid="deconz:batterysensor">
    <instruction-set targetVersion="1">
      <update-channel id="battery-level">
        <type>system:battery-level</type>
      </update-channel>
    </instruction-set>
  </thing-type>

</update:update-descriptions>
```

Different instructions can be combined in one instruction-set.
The following removes the `water_level` channel from `foo:pool` things and adds a new `chlorine` level

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes" ?>
<update:update-descriptions xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                            xmlns:update="https://openhab.org/schemas/update-description/v1.0.0"
                            xsi:schemaLocation="https://openhab.org/schemas/update-description/v1.0.0 https://openhab.org/schemas/update-description-1.0.0.xsd">

  <thing-type uid="foo:pool">
    <instruction-set targetVersion="1">
      <remove-channel id="water-level">
      </remove-channel>
      <add-channel id="chlorine">
        <type>foo:concentration</type>
        <label>Chlorine Concentration</label>
      </add-channel>
    </instruction-set>
  </thing-type>

</update:update-descriptions>
```

In addition to the update instructions, the thing-type definition needs to add a property `thingTypeVersion` to prevent newly created things from being modified:

```xml
<thing-type id="batterysensor">
  <supported-bridge-type-refs>
    <bridge-type-ref id="deconz"/>
  </supported-bridge-type-refs>
  <label>Battery Sensor</label>
  <channels>
    <channel typeId="system.battery-level" id="battery-level"/>
    <channel typeId="last-updated" id="last-updated"/>
  </channels>
  <properties>
    <property name="thingTypeVersion">1</property>
  </properties>
  <representation-property>uid</representation-property>
  <config-description-ref uri="thing-type:deconz:sensor"/>
</thing-type>
```

Modifying or removing update instructions after they have been merged is not permitted, only additions are allowed.
Each new contribution of update instructions MUST increase the `thingTypeVersion`, even if there was no release.
The `thingTypeVersion` is bound to a thing-type, different thing types may have different versions.

The full XML schema for update instructions can be found here: [https://www.openhab.org/schemas/update-description-1.0.0.xsd](https://www.openhab.org/schemas/update-description-1.0.0.xsd).

# General Information about Tags

There are two possible types of tag -- namely "Semantic" and "Non Semantic" tags.
The former are used by the openHAB User Interface to create automatic groupings of items according to the [Semantic Model]({{base}}/tutorial/model.html).
The latter are (optionally) be used for any other tagging purpose at the discretion of the user.
Semantic tags are classed into four sub-types `Point`, `Property`, `Equipment` and `Location`.

Addon developers are strongly requested to provide tags in the channel-type and thing-type type XML.
It is also possible to provide tags in instantiated Channels and Things via the binding's Java code at run-time.

The following are some general tips and guidelines for applying tags:

1. The purpose of tags is to logically group Things and Channels in the UI.
The target is that your Thing or Channel shall appear in the UI close to Things or Channels from other bindings that have **SIMILAR** attributes or behavior.
There is no point in having the granularity of the groups so fine so that groups would contain only one member.
So please try to select tags in your bindings that align with the tags used by developers of other bindings for similar equipment and functions.

1. Tags belong to a parent/child hierarchy e.g. `Equipment.Sensor` is a parent with `Equipment.TemperatureSensor` and `Equipment.HumiditySensor` as children.
If there is no child tag that covers exactly what you need, then the general rule is to use the next higher parent tag instead.
e.g. If you have a multi-sensor that measures both temperature and humidity, then neither `Equipment.TemperatureSensor` nor `Equipment.HumiditySensor` will fit exactly, so use the parent `Equipment.Sensor` instead.

1. Alternatively to the above, if a Thing has multiple functions e.g. "WiZ Ceiling Fans With a Dimmable Bulb" then apply the tag that matches the **PRIMARY** function.
e.g. `Equipment.CeilingFan` in this case.

1. Sometimes an openHAB Thing is a device that commands another piece of equipment that is itself not directly visible in openHAB.
e.g. an electronic dimmer may be hardwired on-site to a conventional light.
Whilst there is no 100% guarantee that the Thing is actually hardwired to such target device, in such cases it is acceptable to tag the Thing (and its Channels) according to the **EXPECTED** target device.
e.g. in the aforementioned example, instead of tagging the dimmer as `Equipment.ControlDevice` it is acceptable to tag it as `Equipment.LightSource`.

1. Here is the actual list of [Semantic Tags](https://github.com/openhab/openhab-core/blob/main/bundles/org.openhab.core.semantics/model/SemanticTags.csv).
The contents of this list are dynamic, and it may be extended from time to time.
If you are an addon developer and you think there is something missing from the list please open an [Issue](https://github.com/openhab/openhab-core/issues) or [Pull Request](https://github.com/openhab/openhab-core/pulls) on GitHub.

1. For further reading please see the [Description of the Semantic Model]({{base}}/tutorial/model.html), the [Developer Guidelines on Semantic Tags](semantic-tags.md) and the [Thing-Type and Channel-Type validation schema](https://www.openhab.org/schemas/thing-description-1.0.0.xsd).

## Tagging Conventions for Commonly Confused Use Cases

The following are some use cases that commonly lead to confusion.
The purpose of this list is to provide the convention for tagging such cases:

1. In the case of `Point` and `Property` tags it may help to consider the `Point` as the VERB and the `Property` as the OBJECT in a sentence.
So a channel may make a 'Measurement' of a 'Temperature', or show the 'Status' of an operating 'Mode' etc.

1. Do not confuse `Property` tags with Units of Measure.
A `Property` tag is a WORD (see above) that describes the nature an the action being taken by its respective `Point`.
So for example `Speed` need not be taken precisely to mean `m/sec` .. but can in general cover operations that "do much stuff in little time".

1. For turning a piece of equipment on or off:
`Switch.Light` should be used if the equipment is a light, otherwise `Switch.Power` should be used.

1. For switching the operating mode of a piece of equipment (e.g. Auto/Manual, Day/Night, Disable/Enable, etc.):
`Switch.Mode` should be used.

1. For equipment having a set-point, even if the set-point is read-only for openHAB, it is OK to use `Setpoint.whatever`.

1. For weather channels:
`Forecast.whatever` is advised.

1. For astronomical channels: `Calculation.whatever` should be used instead of `Forecast.whatever`.

1. For equipment (e.g. fans, pumps) that can run at several speed/power/volume/flow-rates (e.g. Off/Low/Medium/High):
`Control.Speed` should be used.
