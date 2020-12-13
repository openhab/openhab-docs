---
layout: developersguide
title: Event Bus
---

{% include base.html %}

# Event Bus
{:.no_toc}

The openHAB framework provides an event bus for inter-component communication.
The communication is based on events which can be sent and received through the event bus in an asynchronous way.
Examples of openHAB event types are _ItemCommandEvent_, _ItemStateEvent_, _ItemAddedEvent_, _ThingStatusInfoEvent_, etc.

This section introduces the event API and illustrates how to receive such events.
Furthermore, the sending of events and the implementation of new event types will be described.

{::options toc_levels="2,3"/}
* TOC
{:toc}

## API Introduction

### The Interfaces

The `EventPublisher` posts `Event`s through the openHAB event bus in an asynchronous way.
The `EventSubscriber` defines the callback interface to receive  events of specific types to which the event subscriber is subscribed.
The EventPublisher and the EventSubscribers are registered as OSGi services.
An event subscriber can provide an `EventFilter` in order to filter events based on the topic or the content.
If there is no filter all subscribed event types are received.
The event itself will be subclassed for each event type, which exists in the System (e.g. `ItemCommandEvent`, `ItemUpdatedEvent`, `ThingStatusInfoEvent`).

### The Core Events

This section lists the core events provided by openHAB which can be divided into the categories _Item Events_, _Thing Events_ and _Inbox Events_.

An event consists of a `topic`, a `type`, a `payload` and a `source`.
The payload can be serialized with any String representation and is determined by its concrete event type implementation (e.g. `ItemCommandEvent`, `ItemUpdatedEvent`).
The payloads of the openHAB core events are serialized with JSON.
Each event implementation provides the payload as high level methods as well, usually presented by a data transfer object (DTO).

A topic clearly defines the target of the event and its structure is similar to a REST URI, except the last part, the action.
The topics of openHAB events are divided into the following four parts: `{namespace}/{entityType}/{entity}/{action}`, e.g. `openhab/items/{itemName}/command`.

The type of an event is represented by a string, usually the name of the concrete event implementation class, e.g. `ItemCommandEvent`, `ItemUpdatedEvent` .
This string type presentation is used by event subscribers for event subscription (see chapter "Receive Events") and by the framework for the creation of concrete event instances.

The event source is optional and represents the name of the source identifying the sender.

#### Item Events

| Event                      | Description                                             | Topic                                              |
|----------------------------|---------------------------------------------------------|----------------------------------------------------|
| ItemAddedEvent             | An item has been added to the item registry.            | openhab/items/{itemName}/added                     |
| ItemRemovedEvent           | An item has been removed from the item registry.        | openhab/items/{itemName}/removed                   |
| ItemUpdatedEvent           | An item has been updated in the item registry.          | openhab/items/{itemName}/updated                   |
| ItemCommandEvent           | A command is sent to an item via a channel.             | openhab/items/{itemName}/command                   |
| ItemStateEvent             | The state of an item is updated.                        | openhab/items/{itemName}/state                     |
| ItemStatePredictedEvent    | The state of an item predicted to be updated.           | openhab/items/{itemName}/statepredicted            |
| ItemStateChangedEvent      | The state of an item has changed.                       | openhab/items/{itemName}/statechanged              |
| GroupItemStateChangedEvent | The state of a group item has changed through a member. | openhab/items/{itemName}/{memberName}/statechanged |

::: tip Note
The `ItemStateEvent` is always sent if the state of an item is updated, even if the state did not change.
`ItemStateChangedEvent` is sent only if the state of an item was really changed.
It contains the old and the new state of the item.

The `GroupItemStateChangedEvent` is sent only if the state of a group item was changed by a member.
It contains the old and the new state of the group item as well as the member.
:::

#### Thing Events

| Event                       | Description                                       | Topic                                   |
|-----------------------------|---------------------------------------------------|-----------------------------------------|
| ThingAddedEvent             | A thing has been added to the thing registry.     | openhab/things/{thingUID}/added         |
| ThingRemovedEvent           | A thing has been removed from the thing registry. | openhab/things/{thingUID}/removed       |
| ThingUpdatedEvent           | A thing has been updated in the thing registry.   | openhab/things/{thingUID}/updated       |
| ThingStatusInfoEvent        | The status of a thing is updated.                 | openhab/things/{thingUID}/status        |
| ThingStatusInfoChangedEvent | The status of a thing changed.                    | openhab/things/{thingUID}/statuschanged |

::: tip Note
The `ThingStatusInfoEvent` is always sent if the status info of a thing is updated, even if the status did not change.
`ThingStatusInfoChangedEvent` is sent only if the status of a thing was really changed.
It contains the old and the new status of the thing.
:::

#### Inbox Events

| Event                 | Description                                         | Topic                            |
|-----------------------|-----------------------------------------------------|----------------------------------|
| InboxAddedEvent       | A discovery result has been added to the inbox.     | openhab/inbox/{thingUID}/added   |
| InboxRemovedEvent     | A discovery result has been removed from the inbox. | openhab/inbox/{thingUID}/removed |
| InboxUpdateEvent      | A discovery result has been updated in the inbox.   | openhab/inbox/{thingUID}/updated |

#### Link Events

| Event                       | Description                                              | Topic                                         |
|-----------------------------|----------------------------------------------------------|-----------------------------------------------|
| ItemChannelLinkAddedEvent   | An item channel link has been added to the registry.     | openhab/links/{itemName}-{channelUID}/added   |
| ItemChannelLinkRemovedEvent | An item channel link has been removed from the registry. | openhab/links/{itemName}-{channelUID}/removed |

#### Channel Events

| Event                       | Description                                              | Topic                                         |
|-----------------------------|----------------------------------------------------------|-----------------------------------------------|
| ChannelTriggeredEvent       | A channel has been triggered.                            | openhab/channels/{channelUID}/triggered       |

## Receive Events

This section describes how to receive openHAB events in Java.

An event subscriber defines the callback interface for receiving events from the openHAB event bus.
The following Java snippet shows how to receive `ItemStateEvent`s and `ItemCommandEvent`s from the event bus.
Therefore, the `EventSubscriber` interface must be implemented.

```java
public class SomeItemEventSubscriber implements EventSubscriber {
    private final Set<String> subscribedEventTypes = ImmutableSet.of(ItemStateEvent.TYPE, ItemCommandEvent.TYPE);
    private final EventFilter eventFiter = new TopicEventFilter("openhab/items/ItemX/.*");

    @Override
    public Set<String> getSubscribedEventTypes() {
        return subscribedEventTypes;
    }

    @Override
    public EventFilter getEventFilter() {
        return eventFilter;
    }

    @Override
    public void receive(Event event) {
        String topic = event.getTopic();
        String type = event.getType();
        String payload = event.getPayload();
        if (event instanceof ItemCommandEvent) {
            ItemCommandEvent itemCommandEvent = (ItemCommandEvent) event;
            String itemName = itemCommandEvent.getItemName();
            Command command = itemCommandEvent.getItemCommand();
            // ...
        } else if (event instanceof ItemStateEvent) {
            ItemStateEvent itemStateEvent = (ItemStateEvent) event;
            // ...
        }
    }
}
```

The `SomeItemEventSubscriber` is subscribed to the event types `ItemStateEvent` and `ItemCommandEvent`, provided by the method `getSubscribedEventTypes()`.
A string representation of an event type can be found by a public member `TYPE` which usually presents the name of the class.
To subscribe to all available event types, use the public member `ALL_EVENT_TYPES` of the event subscriber interface.

The event subscriber provides a `TopicEventFilter` which is a default openHAB `EventFilter` implementation that ensures filtering of events based on a topic.
The argument of the filter is a [Java regular expression](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html).
The filter method `EventFilter.apply()` will be called for each event on the event bus to which the event subscriber is subscribed (in the example above `ItemStateEvent` and `ItemCommandEvent`).
If the filter applies (in the given example for all item events with the item name "ItemX"), the event will be received by the `EventSubscriber.receive()` method.
Received events can be cast to the event implementation class for further processing.

Each event subscriber must be registered via OSGi Declarative Services (DS) under the `org.openhab.core.event.EventSubscriber` interface.

```xml
<scr:component xmlns:scr="http://www.osgi.org/xmlns/scr/v1.1.0" immediate="true" name="SomeItemEventSubscriber">
   <implementation class="org.openhab.core.items.events.SomeItemEventSubscriber"/>
   <service>
      <provide interface="org.openhab.core.events.EventSubscriber"/>
   </service>
</scr:component>
```

The listing below summarizes some best practices in order to implement event subscribers:

- To subscribe to only one event type openHAB provides the `org.openhab.core.events.AbstractTypedEventSubscriber` implementation.
To receive an already cast event the `receiveTypedEvent(T)` method must be implemented.
To provide an event filter the method `getEventFilter()` can be overridden.
- openHAB provides an `AbstractItemEventSubscriber` class in order to receive `ItemStateEvents` and `ItemCommandEvents` (more information can be obtained in the next chapter).
- To filter events based on a topic the  `org.openhab.core.events.TopicEventFilter` implementation from the openHAB core bundle can be used.
The filtering is based on [Java regular expression](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html).
- The subscribed event types and the filter should be stored as class members (see example above) due to performance reasons.
- If the subscribed event types are sufficient in order to receive all interested events, do not return any filter (in that case the method getFilter() returns null) due to performance reasons.
- Avoid the creation of too many event subscribers.
Similar event types can be received in one event subscriber.
- Handle exceptions in event subscriber implementation and throw only serious exceptions.
Thrown exceptions will be handled in the framework by logging an error message with the cause.
- The receive method should terminate quickly, since it blocks other event subscribers.
Create a thread for long running operations.

### Receive ItemStateEvents and ItemCommandEvents

Due to the fact that receiving `ItemStateEvents` and `ItemCommandEvents` is a common use case, openHAB provides an abstract event subscriber implementation via the core bundle.
The class `org.openhab.core.items.events.AbstractItemEventSubscriber` provides two methods `receiveUpdate(ItemStateEvent)` and `receiveCommand(ItemCommandEvent)` which can be implemented in order to receive and handle such events.

```java
public class SomeItemEventSubscriber extends AbstractItemEventSubscriber {
    private final EventFilter eventFiter = new TopicEventFilter("openhab/items/ItemX/.*");

    @Override
    public EventFilter getEventFilter() {
        return eventFilter;
    }

    @Override
    protected void receiveCommand(ItemCommandEvent commandEvent) {
        // do something
    }

    @Override
    protected void receiveUpdate(ItemStateEvent stateEvent) {
        // do something
    }
}
```

## Send Events

Usually the core events are only sent by the openHAB framework.
However, it is possible to sent events explicitly, e.g. `ItemCommandEvent`s and `ItemStateEvent`s.
The Java snippet below illustrates how to send events via the `EventPublisher`.
The openHAB core events can only be created via the corresponding event factory.

```java
public class SomeComponentWantsToPost {
    private EventPublisher eventPublisher;

    public void postSomething() {
        ItemCommandEvent itemCommandEvent = ItemEventFactory.createCommandEvent("ItemX", OnOffType.ON);
        eventPublisher.post(itemCommandEvent);
    }

    @Reference
    public void setEventPublisher(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void unsetEventPublisher(EventPublisher eventPublisher) {
        this.eventPublisher = null;
    }
}
```

The `EventPublisher` will be injected via [OSGi Declarative Services](../osgi/osgids.html#declarative-services).

## Define new Event Types

openHAB provides the possibility to easily implement new event types and event factories.

Events can be added by implementing the `Event` interface or extending the `AbstractEvent` class which offers a default implementation.
Both classes are located in the openHAB core bundle.

The following Java snippet shows a new event type extending the class `AbstractEvent`.

```java
public class SunriseEvent extends AbstractEvent {

    public static final String TYPE = SunriseEvent.class.getSimpleName();

    private final SunriseDTO sunriseDTO;

    SunriseEvent(String topic, String payload, SunriseDTO sunriseDTO) {
        super(topic, payload, null);
        this.sunriseDTO = sunriseDTO;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    public SunriseDTO getSunriseDTO() {
        return sunriseDTO;
    }

    @Override
    public String toString() {
        return "Sunrise at '" + getSunriseDTO.getTime() + "'.";
    }
}
```

The listing below summarizes some coding guidelines as illustrated in the example above:

- Events should only be created by event factories.
Constructors do not have any access specifier in order to make the class package private.
- The serialization of the payload into a data transfer object (e.g. `SunriseDTO`) should be part of the event factory and will be assigned to a class member via the constructor.
- A public member `TYPE` represents the event type as string representation and is usually the name of the class.
- The `toString()` method should deliver a meaningful string since it is used for event logging.
- The source of an event can be `null` if not required.

For more information about implementing an event, please refer to the Java documentation.

## Define new Event Factory

Event factories can be added by implementing the `EventFactory` interface or extending the `AbstractEventFactory` class.
The `AbstractEventFactory` provides some useful utility for parameter validation and payload serialization & deserialization with JSON.
The classes are located in the openHAB core bundle.

```java
public class SunEventFactory extends AbstractEventFactory {

    private static final String SUNRISE_EVENT_TOPIC = "openhab/sun/{time}/sunrise";

    public SunEventFactory() {
        super(Sets.newHashSet(SunriseEvent.TYPE);
    }

    @Override
    protected Event createEventByType(String eventType, String topic, String payload, String source) throws Exception {
        if (SunriseEvent.TYPE.equals(eventType)) {
            return createSunriseEvent(topic, payload);
        }
        return null;
    }

    private Event createSunriseEvent(String topic, String payload) {
        SunriseDTO sunriseDTO = deserializePayload(payload, SunriseDTO.class);
        return new SunriseEvent(topic, payload, sunriseDTO);
    }

    public static SunriseEvent createSunriseEvent(Sunrise sunrise) {
        String topic = buildTopic(SUNRISE_EVENT_TOPIC, sunrise.getTime());
        SunriseDTO sunriseDTO = map(sunrise);
        String payload = serializePayload(sunriseDTO);
        return new SunriseEvent(topic, payload, sunriseDTO);
    }
}
```

The listing below summarizes some guidelines as illustrated in the example above:

- Provide the supported event types (`SunriseEvent.TYPE`) via an `AbstractEventFactory` constructor call.
The supported event types will be returned by the `AbstractEventFactory.getSupportedEventTypes()` method.
- The event factory defines the topic (`SUNRISE_EVENT_TOPIC`) of the supported event types.
Please ensure that the topic format follows the topic structure of the openHAB core events, similar to a REST URI (`{namespace}/{entityType}/{entity}/{sub-entity-1}/.../{sub-entity-n}/{action}`).
The namespace must be `openhab`.
- Implement the method `createEventByType(String eventType, String topic, String payload, String source)` to create a new event based on the topic and the payload, determined by the event type.
This method will be called by the framework in order to dispatch received events to the corresponding event subscribers.
If the payload is serialized with JSON, the method `deserializePayload(String payload, Class<T> classOfPayload)` can be used to deserialize the payload into a data transfer object.
- Provide a static method to create event instances based on a domain object (Item, Thing, or in the example above `Sunrise`).
This method can be used by components in order to create events based on domain objects which should be sent by the EventPublisher.
If the data transfer object should be serialized into a JSON payload, the method `serializePayload(Object payloadObject)` can be used.
Custom event factories must be registered as an OSGi Service (eg. by using the @Component annotation) in order to receive the custom events.
