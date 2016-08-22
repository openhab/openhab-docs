---
layout: developersguide
title: Coding tasks for OSGi
---

{% include base.html %}

Coding tasks for OSGi
=====================

## Introduction

OSGi coding tasks can help Java developers with no experience in OSGi and Eclipse Plug-in development to get familiar with writing bundles. This page contains tasks, related to several fundamental topics, and references to tutorials, where similar tasks are implemented.

## Prerequisites

Before you start, you should first install the [Eclipse IDE](../development/ide.html).

In order to run your samples in an OSGi Runtime you might want to start Equinox in a command line.

## Tasks

The tasks are divided in several sections:

{::options toc_levels="3"/}
* TOC
{:toc}

### I. Writing basic OSGi bundle

1. Create an `org.openhab.training.helloosgi` bundle, that prints a message on the console, when it is started and stopped. Test it in the OSGi Container.

     Hint! You can install a bundle in the OSGi Container with the `install {url} ` command.  
     Hint! If you still have difficulties look at the 
[reference section](#writing-basic-osgi-bundle).

2. Create an `org.openhab.training.utils` bundle, which contains class `TimeUtilities`, that has a single method `String getCurrentTimeStamp()` that returns the current time stamp in format "hh:mm". Mind the `TimeUtilities` class might be used in some other bundles.

    Hint! Find out how can you export packages in OSGi.

3. Modify the `org.openhab.training.helloosgi` bundle to use the `TimeUtilities` class to display the current time stamp on the console when it is started.

### II. Services

1. Create an `org.openhab.training.electricity.provider` bundle, which defines a service interface `ElectricityProvider` with one method:
	- `boolean provide (int value)` - discharges the provider with the 'value' parameter. It should return true, if the requested charge is available in the provider and false, if it is not; 
2. Create an `org.openhab.training.electricity.homenetwork` bundle:
	-  with `HomeElectricityNetwork` implementation of the `ElectricityProvider` interface with infinite charge (the `provide()` method should always return true);
	-  which registers the `HomeElectricityNetwork` as `ElectricityProvider` in the OSGi *Service Registry* with [*BundleContext*][BundleContext].

    Hint! You can find similar tasks in the 
[examples below](#services).

3. Create an `org.openhab.training.electricity.consumer` bundle, which contains an 
interface `ElectricityConsumer` with methods:
	- `void start()` - starts the device and displays a message on the console. If the device requires a provider (it is not energy independent), this method can set the current provider. After the device is started it should try to consume electricity equal to the device consumption from the current provider at fixed interval from 5 seconds and display a message on the console, which provider is in use at the moment; 
	- `void stop()` - stops the device and displays message on the console. The device should not consume electricity anymore. The device should stop, if the current provider is discharged;
	- `void setCurrentProvider(ElectricityProvider)` - sets a current provider from a list with available providers;
	- `List<ElectricityProvider> getAllAvailableProviders()` - returns a list with available providers (a provider is available, when it is registered in the *Service Registry* and has more charge, than the device consumption).
4. Create an `org.openhab.training.electricity.radio` bundle, which:
	- implements the `ElectricityConsumer` interface in a  `BasicRadio` consumer, which has specific consumption (e.g `int consumption = 5`) and can be connected to only one provider;
	- the device should be able to stop automatically, when there is no provider available and display a message on the console. After that it must be started manually;
	- use the `ElectricityProvider` service by getting it directly from the *BundleContext*.
		
### III. Service Tracker

1. Create an `org.openhab.training.electricity.battery` bundle, which implements and registers `Battery` implementation of the `ElectricityProvider` service with finite charge (e.g `int capacity = 20`).


    Hint! An ElectricityProvider can be used by different consumers simultaneously. Consider whether it is necessary to make an implementation of this class thread-safe.

2. Create an interface `DynamicConsumer` that should manage the availability of the different `ElectricityProvider`. It defines three methods:
	- `void providerAdded(ElectricityProvider)` - called when a new provider is registered in the *ServiceRegistry*. It should add the provider in a list with available electricity sources for the current device;
	- `void providerRemoved(ElectricityProvider)` - called when a provider is unregistered from the *ServiceRegistry*. It should remove the provider from a list with available electricity sources for the current device;
	- `void providerChanged(ElectricityProvider)` - called when a provider configuration is changed. Depending on the change it may add or remove the provider from the list with available providers.
3. Create a `TV` consumer with `int consumption = 10`, that implements the `ElectricityConsumer` interface and the `DynamicConsumer`interface in an `org.openhab.training.electricity.tv` bundle by using [*ServiceTracker*][ServiceTracker]. The `TV` should be able to dynamically switch between different `ElectricityProvider`:
	- when both providers are available, it should work with the `HomeElectricityNetwork`;
	- otherwise it should use the provider that is available at the moment;
	- when no provider is available or it can not provide enough charge, the `TV` should stop;
	- it should be able to start automatically, if a new provider is available and is able to provide enough electricity.
		
    Hint! Install `org.eclipse.osgi.util` bundle in order to use *ServiceTracker*.
    Tutorials with examples can be found 
[below](#service-trackers).

### IV. Declarative Services and Components

1. Provider and consumer:
	- rewrite all tasks in section [II.](#ii-services) and [III.](#iii-service-tracker) to use the `ElectricityProvider` service by injecting it by the means of [*Declarative Services*][ds] (do not use Service Tracker and BundleContext);

    Hint! Install `org.eclipse.equinox.ds` bundle in order to use *Declarative Services*. 

2. Create a `SolarRadio` consumer that extends `BasicRadio` from III.2 in an `org.openhab.training.electricity.solarradio` bundle. This radio does not need any `ElectricityProvider` to run, but will use one, if it is available (the device should not stop when there are no providers available).  

      Hint! Read about cardinality in OSGi Declarative Services!

3. Create a `CombinedSolarRadio` that extends `BaisicRadio` and implements `DynamicConsumer` in `org.openhab.training.electricity.combinedradio` it the following way:
     - the consumer does not need any provider to run;
     - if one is available, it must set it as current and use it;
     - if more than one are available, add all to the list with available providers.
4. What happens when you stop the provider that is not in use? Why does the `CombinedSolarRadio` stops and starts? Modify the consumer to handle the removal of the service dynamically - without calling the stop and start methods every time!

     Hint! Read about service policy in OSGi!

5. Test all the bundles in the OSGi container by starting and stopping the different `ElectricityProvider` implementations and track, if the consumers are used as expected.

### V. Events

1. In the `org.openhab.training.util` bundle create and register as a service ` TimeEventSender`, that sends events with topic "org/openhab/training/time" every minute with the current time stamp (hh:mm) (you can use the `TimeUtilities` class form chapter [I.](#i-writing-basic-osgi-bundle)).

     Hint! Install `org.eclipse.equinox.event` bundle in order to use *EventAdmin* service for sending events.  
     Hint! [ScheduledExecutorService](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ScheduledExecutorService.html) can be used in this task.

2. Modify the `org.openhab.training.electricity.tv.TV` to listen for events with this topic and print an error on the console, when one event is not received.

### VI. Managed Services

1. Implement the [*ManagedService*][ManagedService] interface in the `org.openhab.training.electricity.tv.TV` class.
2. Add a configuration to the `TV` class with property "autoSleep" and value a timestamp (hh:mm).
3. Modify the method that listens for the events with topic "time" from section V.:
	- when the "autoSleep" property is equal to the "time" topic, display message on the console, that `TV` goes to sleep mode and stop listening for events.
4. Modify the `Battery` provider by implementing the *ManagedService* interface. After this modification, it should be possible to change the charge of a battery.

### VII. Console Commands

1. Implement a service in  the `org.openhab.training.util` bundle that adds console command, that:
	- displays all  `ElectricityProvider` implementations that are registered with their charge;
	- displays all consumers, to which providers are they connected (which providers are available) and what is the current provider at the moment;

    Hint! You might have to register all consumers as services in the OSGi ServiceRegistry.

	- recharges the `Battery` with a provided value;
	- changes the configuration of the `TV`.

    Hint! You can add console commands with the help of
[CommandProvider][CommandProvider]

2. Test the console commands in the OSGi runtime by starting the different Radio consumers and the TV consumer. Start only the `Battery` provider and wait until it is discharged. Check if the consumers have stopped as expected. Recharge the battery and check, if the consumers have started. You can try out different scenarios as well!

## References 

Some of the tutorials listed below are not up-to-date with the latest versions of the Equinox framework or are written to be run in another implementation of the OSGi Runtime (e.g. Apache Felix). They can help you with solving the tasks above. This resources are divided in several groups.

### Multiple topics
{:.no_toc}
- This tutorials simply cover more than one from the topics below:
	- [OSGi enRoute project](http://enroute.osgi.org/book/150-tutorials.html)
	- [Lars Vogel: OSGi Modularity](http://www.vogella.com/tutorials/OSGi/article.html);
	- [Lars Vogel: OSGi Services](http://www.vogella.com/tutorials/OSGiServices/article.html);
	- [Hello, OSGi, Part 1: Bundles for beginners](http://www.javaworld.com/article/2077837/java-se/java-se-hello-osgi-part-1-bundles-for-beginners.html);
	- [OSGi Getting Started](https://mnlipp.github.io/osgi-getting-started/);
	- [Java OSGi Tutorial for Beginners](http://o7planning.org/en/10135/java-osgi-tutorial-for-beginners);
	- [Understand OSGi Concepts. Try to Follow the Puzzle Approach](http://crunchify.com/understand-osgi-concepts-try-to-follow-the-puzzle-approach/).

### Writing basic OSGi bundle 
{:.no_toc}
- This tutorials are focused on writing basic bundle, managing the dependencies between the bundles and running them in an OSGi container:
	- [Getting started with OSGi: Your first bundle](http://www.eclipsezone.com/eclipse/forums/m92130843.html);
	- [Getting started with OSGi: Interacting with the Framework](http://www.eclipsezone.com/eclipse/forums/m92131032.html);
	- [Getting started with OSGi: Dependencies between Bundles](http://www.eclipsezone.com/eclipse/forums/t90544.html).
	
### Services 
{:.no_toc}
- Registering and using Services with the low-level OSGi API:
	- [Getting started with OSGi: Registering a Service](http://eclipsezone.com/eclipse/forums/t90688.html);
	- [Getting started with OSGi: Consuming a Service](http://www.eclipsezone.com/eclipse/forums/t90796.html);
	- [Apache Felix Tutorial: A bundle that listens for OSGi service events](http://felix.apache.org/documentation/tutorials-examples-and-presentations/apache-felix-osgi-tutorial/apache-felix-tutorial-example-1.html);
	- [Apache Felix Tutorial: A bundle that implements a dictionary service](http://felix.apache.org/documentation/tutorials-examples-and-presentations/apache-felix-osgi-tutorial/apache-felix-tutorial-example-2.html);
	- [Apache Felix Tutorial: A bundle that implements another dictionary service](http://felix.apache.org/documentation/tutorials-examples-and-presentations/apache-felix-osgi-tutorial/apache-felix-tutorial-example-2b.html);
	- [Apache Felix Tutorial: A bundle that implements a simple dictionary service client](http://felix.apache.org/documentation/tutorials-examples-and-presentations/apache-felix-osgi-tutorial/apache-felix-tutorial-example-3.html);
	- [Apache Felix Tutorial: A bundle that implements a more robust dictionary service client](http://felix.apache.org/documentation/tutorials-examples-and-presentations/apache-felix-osgi-tutorial/apache-felix-tutorial-example-4.html).

### Service Trackers
{:.no_toc}
 - OSGi Service Tracker simplifies using services from the Framework's registry. You can find example usage in the links below:
	- [Getting started with OSGi: Dynamic Service Tracking](http://www.eclipsezone.com/eclipse/forums/t91059.rhtml);	
	- [Apache Felix Tutorial: A bundle that implements a dictionary service client using the Service Tracker](http://felix.apache.org/documentation/tutorials-examples-and-presentations/apache-felix-osgi-tutorial/apache-felix-tutorial-example-5.html);
	- [Apache Felix Tutorial: A bundle that implements a spell checker service using dictionary services.](http://felix.apache.org/documentation/tutorials-examples-and-presentations/apache-felix-osgi-tutorial/apache-felix-tutorial-example-6.html);
	- [Apache Felix Tutorial: A bundle that implements a spell checker service client](http://felix.apache.org/documentation/tutorials-examples-and-presentations/apache-felix-osgi-tutorial/apache-felix-tutorial-example-7.html);  
	- [OSGi - ServiceTracker - ServiceTrackerCustomizer](http://stackoverflow.com/questions/28748052/osgi-servicetracker-servicetrackercustomizer).  

### Declarative Services and Components
{:.no_toc}
 - OSGi Declarative Services is a high level API for managing services in OSGi. Its functionality is widely used in the openHAB project. Tutorials about the topic:
	- [Getting Started with OSGi Declarative Services](http://blog.vogella.com/2016/06/21/getting-started-with-osgi-declarative-services/)
	- [Getting started with OSGi: Introducing Declarative Services](http://www.eclipsezone.com/eclipse/forums/t96740.html);
	- [Getting started with OSGi: Declarative Services and Dependencies](http://www.eclipsezone.com/eclipse/forums/t97690.rhtml);
	- [Apache Felix Tutorial: A bundle that implements a spell checker service using Declarative Services](http://felix.apache.org/documentation/tutorials-examples-and-presentations/apache-felix-osgi-tutorial/apache-felix-tutorial-example-9.html).

### Managed Services
{:.no_toc}
 - [OSGi declarative managed services and configuration](http://nakvic-dev.blogspot.bg/2010/11/osgi-declarative-managed-services-and.html)

[BundleContext]: https://osgi.org/javadoc/r4v43/core/org/osgi/framework/BundleContext.html
[ManagedService]: https://osgi.org/javadoc/r4v42/org/osgi/service/cm/ManagedService.html
[ServiceTracker]: https://osgi.org/javadoc/r4v42/org/osgi/util/tracker/ServiceTracker.html
[SERVICE_RANKING]: https://osgi.org/javadoc/r4v42/org/osgi/framework/Constants.html#SERVICE%5FRANKING
[ds]: osgids.html
[CommandProvider]: http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fapi%2Forg%2Feclipse%2Fosgi%2Fframework%2Fconsole%2FCommandProvider.html