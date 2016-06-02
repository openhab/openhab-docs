---
layout: documentation
---

{% include base.html %}

# About openHAB

## Background
Since the emergence of broadband internet connections, smartphones and tablets the smart home market shows a remarkable upsurge. Unfortunately, this Internet of Things is still immature and fragmented into multiple competing silos with limited compatiblity between them. This fragmented market forces customers to try to "bet on the right horse" among a range of competing technologies, none of which now or ever could fulfill all potential home automation requirements on its own. There is a need for a platform that allows the integration of these different systems, protocols and standards, that provides a uniform way for user interaction, implements higher level services, and does all of this in an open and extensible framework.

## openHAB

The openHAB project is a framework that enables the building of smart home solutions that operate in highly heterogeneous environments, i.e. solutions that deal with the integration of different protocols or standards. Its purpose is to provide uniform access to devices and information and to facilitate different kinds of interactions with them.

The goals of the openHAB project can be summarized as:

* provide a __flexible framework__ for smart home and ambient assisted living (AAL) solutions with a focus on the use cases of this domain, e.g. easy automation and visualization
* specify __extension points__ for integration and higher-level services using concise and dedicated interfaces so extending and customizing the solution is as simple as possible
* provide implementations of __extensions for relevant systems, protocols or standards__ that can be included or excluded as desired in the form of a general Java library or an OSGi bundle allowing these extensions to be be used independently
* provide a __development environment and tools__ to aid the implementation of extensions
* provide __packaging and demo examples__ to demonstrate a working example which can be used as a starting point

The openHAB framework consists of a set of OSGi bundles which define services and extension points that can be deployed on an OSGi runtime. The framework is meant to be usable on any kind of system that can run an OSGi stack - from a multi-core business class server, to a virtual machine, from a residential gateway to a NAS, from an old laptop to single board computer like a Raspberry Pi.

The openHAB framework focuses focuses on services and APIs in the following areas:

* _Data Handling_: includes an extensible type system for smart home data, commands which provide abstracted data and device access, and event mechanisms to distribute data updates
* _Rule Engines_: an event processing environment supporting the creation of "when this occurs do that" logic which drives the home automation's behavior
* _Declarative User Interfaces_: a framework with extensions for describing user interface content in a declarative way and includes widgets, icons, charts, etc.
* _Persistence Management_: pluggable extensions for peramently storing and retreaving historic home automation data for use within the home automation environment.

Besides the runtime framework and implementation, the openHAB project also provides different kinds of tools and samples:

* editors for creating and modifying configuration models and rules which provide full IDE support, such as content assist and syntax validation
* Maven archetypes to easily create skeletons for extensions for add-on developers
* demo packaging with other Eclipse IoT projects.
