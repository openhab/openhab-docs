---
layout: developersguide
title: Configuration Admin
---

{% include base.html %}

# Configuration Admin Service

## Introduction

In the previous article about [OSGi Declarative Services](osgids.html) we have learned how to register and track services. Here we will configure them in runtime.

## Basics

As defined in the [OSGi Compendium specification](https://osgi.org/download/r4v42/r4.cmpn.pdf) *configuration is the process of defining the configuration data of bundles and assuring that those bundles receive that data when they are active in the OSGi Service Platform.*

### Configuration Admin Service

In OSGi, configurations are stored in a central database that is being managed by a special service - the *Configuration Admin Service*(`org.osgi.service.cm.ConfigurationAdmin`). This service monitors the service registry and **provides a configuration to the services** that are registered with a *service.pid* property. Configuration changes are first made persistent, and then are passed to the target service. It is important to understand that **the target bundle receives updates from the Configuration Admin service**. Implementations should be aware that the update reception could be delayed if the Configuration Admin service is missing.

### Configuration properties

Each configuration is uniquely identified by a PID (Persistent IDentifier) and stores properties. The properties can be edited, or new properties could be added during runtime by other bundle that uses the Configuration Admin service.

In OSGi, configurations properties are key-value pairs that are accessible via `Map<String, Object>`. Please note that the following types of objects are supported:

- String;
- Boolean;
- Byte;
- Short;
- Integer;
- Long;
- Float;
- Double;
- Character.

If the Configuration Admin service detects an unsupported property type, it will throw `IllegalArgumentException`.

## Configuring Declarative Services

[Declarative Services](osgids.html) (DS) is highly integrated with the Configuration Admin service. Each DS component has a configuration object that is related with it, when the *service.pid* property is missing, the name of the component is used as a PID. The configuration is injected in the bundle `activate`, `deactivate` and `modified` methods. The code below is an example, how to register a service with a *service.pid* property and how to use the injected configuration.

```xml
?xml version="1.0" encoding="UTF-8"?>
<scr:component name="com.example.handler" xmlns:scr="http://www.osgi.org/xmlns/scr/v1.1.0">
    <implementation class="com.example.TimeEventHandler"/>
    <property name="event.topics">some/topic</property>
    <service>
        <provide interface="org.osgi.service.event.EventHandler"/>
    </service>
    <property name="service.pid" type="String" value="com.example.handler"/>
</scr:component>
```

```java
package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

public class TimeEventHandler implements EventHandler {

    // Use the default formatter
    privateSimpleDateFormat dateFormatter = new SimpleDateFormat();

    protected void activate(ComponentContext context, Map<String, Object> properties) {
        modified(properties);
    }

    /**
     * This method could be called by multiple threads
     */
    public synchronized void modified(Map<String, Object> properties) {
        // note, that Config Admin may send an empty configuration
        if (properties != null) {
            String pattern = (String) properties.get("formatting");
            dateFormatter = new SimpleDateFormat(pattern);
        }
    }

    protected void deactivate(ComponentContext context, Map<String, Object> properties) {
        modified(properties);
    }

    @Override
    public void handleEvent(Event event) {
        Long timeInMillis = (Long) event.getProperty("time");
        Date date = new Date(timeInMillis);
        System.out.println("The current time is: " + dateFormatter.format(date));
    }
}
```

## Managed Services

`org.osgi.service.cm.ManagedService` interface is another way to register a service that needs configuration. You have to register your service as a MangedService with a *service.pid* property. Configuration Admin tracks the Service Registry and will update the MangedService, when the configuration is changed. The examples below illustrate how to register a service as ManagedService:

```xml
?xml version="1.0" encoding="UTF-8"?>
<scr:component name="com.example.handler" xmlns:scr="http://www.osgi.org/xmlns/scr/v1.1.0">
    <implementation class="com.example.TimeEventHandler"/>
    <property name="event.topics">some/topic</property>
    <service>
        <provide interface="org.osgi.service.cm.MangedService"/>
        <provide interface="org.osgi.service.event.EventHandler"/>
    </service>
    <property name="service.pid" type="String" value="com.example.handler"/>
</scr:component>
```

The MangedService interface contains a single method `updated()` that will be called from the Configuration Admin service when the configuration is changed.

```java
package com.example.provider;

import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

public class TimeEventHandler implements EventHandler, ManagedService {

    @Override
    public void updated(Dictionary<String, ?> properties) {
        // process configuration properties here
    }

    @Override
    public void handleEvent(Event event) {
        // handle the event
    }
}
```

## Using the Configuration Admin to update the configuration

As we have seen in the previous examples Configuration Admin service tracks the Service Registry and the internal configuration database for changes. It can be used to update the configuration(or create if it is missing) as well. The flow is the following:

```java
// gets the configuration or creates new if it is missing
Configuration config = configurationAdmin.getConfiguration(
    "com.example.handler", null);
Dictionary<String, Object> props = config.getProperties();

// if null, the configuration is new
if (props == null) {
    props = new Hashtable();
}

// set some properties
props.put("formatting", "EEE, d MMM yyyy HH:mm:ss Z");

// update the configuration, the target bundle will be notified for the change
config.update(props);
```

    Hint! 
    The implementaiton of the Configuration Admin Service in Equinox is provided by the
    `org.eclipse.equinox.cm` bundle.

After the call to `update` the Configuration Admin service persists the new configuration data and sends an update to the ManagedService registered with the service PID asynchronously.

    Hint!
    Configuration objects have a security feature called `Location` that prevents other
    bundles from modifying their configuration. In the example above we have created a
    configuration using the `Configuration config = configurationAdmin.getConfiguration
    ("com.example.handler", null);`. The second paramter ('null') guarantees that the
    location for the configuration will be set when the service with this PID is
    registered for the first time. If the location is not set correctly the Config
    Admin may not send the update to the bundle.

## Further Reading

- <http://enroute.osgi.org/services/org.osgi.service.cm.html>
- <http://blog.vogella.com/2016/09/26/configuring-osgi-declarative-services/>
- <https://osgilook.wordpress.com/2009/03/22/configuration-admin-service-explained-the-managedservice-interface/>
- [OSGi Service Platform Service Compendium, Release 4, Version 4.2,August 2009](https://osgi.org/download/r4v42/r4.cmpn.pdf)
