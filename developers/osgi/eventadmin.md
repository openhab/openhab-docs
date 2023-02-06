---
layout: developersguide
title: Event Admin
---

# Introduction

In a dynamic environment like OSGi, communication with events has a wide variety of use cases.
A lot of core services share information using events, so understanding how to use events in OSGi is fundamental.

OSGi events are based on the publish-subscribe messaging pattern.
Let's use the definition for the pattern that can be found in the [OSGi Compendium Release 7][OSGi-cmpn]:

_This pattern decouples sources from their handlers by interposing an event channel between them.
The publisher posts events to the channel, which identifies which handlers need to be notified and then takes care of the notification process._

Both publishers and subscribers can disappear at any time.
A central module to track the handlers availability is needed - the _Event Admin Service_.

## Event Admin Service

The _Event Admin Service_ (`org.osgi.service.event.EventAdmin`) takes a central place in the communication between _Event Publishers_ and subscribers (_Event Listeners_).
It is responsible for keeping track of the listeners, and sending events to them.
It supports both synchronous and asynchronous sending that will be reviewed in more details in the [section about sending events](#send-events).
But let's illustrate that with the following picture:

![Bundle lifecycle][fig1]

Fig.1 Event Admin Service (Source: <https://enroute.osgi.org/img/services/org.osgi.service.event.overview.png>)

Before going into more details, let's take a look at the events.

## Event

The _Event_ interface(`org.osgi.service.event.Event`) encapsulates a single message. It contains:

- topic - used from the _Event Admin Service_ as a filter to dispatch the events only to the listeners that are interested;
- payload - the information that we would like to send. It is represented by a key-value pair.

## Receive Events

In order to receive an event through the _Event Admin Service_ we have to register a service that implements the `org.osgi.service.event.EventHandler` interface.
A property _event.topics_ must be defined that contains all topics that we are interested in.

```java
package com.example.handler;

import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.osgi.service.log.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = {LogEventHandler.class,EventHandler.class}, property = "event.topics=*")
public class LogEventHandler implements EventHandler {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void handleEvent(Event event) {
        logger.info(" Received event with topic: {}", event.getTopic());
    }
}
```

- You can register a handler for multiple topics by separating them by comma: `event.topics=some/topic,other/topic`
- You can register for all events with `*`.

## Send Events

As we have already mentioned, you will need an _Event Admin Service_ implementation to send events.
In Equinox the service is implemented in the `org.eclipse.equinox.event` bundle.
The service contains two methods for sending events:

- `void postEvent(Event event)` - sends an Event asynchronously;
- `void sendEvent(Event event)` - sends an Event synchronously;

## Further Reading

- [OSGi Compendium Release 7][OSGi-cmpn]
- <https://enroute.osgi.org/services/org.osgi.service.event.html>
- <http://blog.vogella.com/2017/05/16/osgi-event-admin-publish-subscribe/>

[fig1]:images/event-admin.png

[OSGi-cmpn]: https://osgi.org/download/r7/osgi.cmpn-7.0.0.pdf
