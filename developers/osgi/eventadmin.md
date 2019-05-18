---
layout: developersguide
title: Event Admin
---

{% include base.html %}

# Introduction

In a dynamic environment like OSGi, communication with events has a wide variety of use cases.
A lot of core services share information using events, so understanding how to use events in OSGi is fundamental.

OSGi events are based on the publish-subscribe messaging pattern.
Let's use the definition for the pattern that can be found in the [OSGi Compendium Specification][OSGi-cmpn]:

*This pattern decouples sources from their handlers by interposing an event channel between them.
The publisher posts events to the channel, which identifies which handlers need to be notified and then takes care of the notification process.*

Both publishers and subscribers can disappear at any time.
A central module to track the handlers availability is needed - the *Event Admin Service*. 

## Event Admin Service

The *Event Admin Service* (`org.osgi.service.event.EventAdmin`) takes a central place in the communication between *Event Publishers* and subscribers (*Event Listeners*).
It is responsible for keeping track of the listeners, and sending events to them.
It supports both synchronous and asynchronous sending that will be reviewed in more details in the [section about sending events](#send-events).
But let's illustrate that with the following picture:

![Bundle lifecycle][fig1]

Fig.1 Event Admin Service (Source: <http://enroute.osgi.org/img/services/org.osgi.service.event.overview.png>)

Before going into more details, let's take a look at the events.

## Event

The *Event* interface(`org.osgi.service.event.Event`) encapsulates a single message. It contains:

- topic - used from the *Event Admin Service* as a filter to dispatch the events only to the listeners that are interested;
- payload - the information that we would like to send. It is represented by a key-value pair.

## Receive Events

In order to receive an event through the *Event Admin Service* we have to register a service that implements the `org.osgi.service.event.EventHandler` interface.
A property *event.topics* must be defined that contains all topics that we are interested in.


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
        logger.info(" Recevied event with topic: {}", event.getTopic());
    }
}
```

* You can register a handler for multiple topics by separating them by comma: `event.topics=some/topic,other/topic`
* You can register for all events with `*`.

## Send Events

As we have already mentioned, you will need an *Event Admin Service* implementation to send events.
In Equinox the service is implemented in the `org.eclipse.equinox.event` bundle.
The service contains two methods for sending events:

- `void postEvent(Event event)` - sends an Event asynchronously;
- `void sendEvent(Event event)` - sends an Event synchronously;

## Further Reading

 - [*OSGi Service Platform Service Compendium, Release 5][OSGi-cmpn]
 - <http://enroute.osgi.org/services/org.osgi.service.event.html>
 - <http://blog.vogella.com/2017/05/16/osgi-event-admin-publish-subscribe/>

[fig1]:images/event-admin.png

[OSGi-cmpn]: https://osgi.org/download/r5/osgi.cmpn-5.0.0.pdf