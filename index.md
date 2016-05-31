---
layout: intro
---

{% include base.html %}

# Introduction to openHAB

openHAB is a software platform for integrating many different home automation systems and technologies into one seamless environment that enables over-arching automation rules and offers a uniform user interface.

openHAB 2, hearafter referred to as openHAB, is the successor to [openHAB 1](https://github.com/openhab/openhab/wiki). It is a Free and Open Source software package released under the Eclipse Public License. openHAB is fully written in Java and is based on the [Eclipse SmartHome](https://eclipse.org/smarthome/) framework. In addition, openHAB uses [Apache Karaf](http://karaf.apache.org/) together with [Eclipse Equinox](https://www.eclipse.org/equinox/) as an OSGi runtime to support modular plugins, and bundles this with [Jetty](https://www.eclipse.org/jetty/) as an HTTP server to support a RESTful API and web based user interfaces.

openHAB is highly modular software and can be extended through "add-ons". The openHAB distribution includes many add-ons from different sources.

![distribution overview](images/distro.png)

The source code and binaries for openHAB are located in a number of GitHub repositories including:

 - [openHAB Distro](https://github.com/openhab/openhab-distro): contains no source code but pulls and aggregates from the other listed repositories
 - [Eclipse SmartHome Framework](https://github.com/eclipse/smarthome): holds the major parts of the core functionality
 - [openHAB 2 Core](https://github.com/kaikreuzer/openhab-core): contains a few small bundles that are not part of Eclipse SmartHome, but are required for the openHAB runtime including a compatibility layer for supporting openHAB 1 add-ons
 - [openHAB 2 Add-ons](https://github.com/openhab/openhab2): add-ons of openHAB that use the Eclipse SmartHome APIs and are incompatible with openHAB 1.x
 - [openHAB 1 Add-ons](https://github.com/openhab/openhab): add-ons developed for openHAB 1.x that are tested and known to work smoothly with openHAB 2
 - [Eclipse SmartHome Extensions](https://github.com/eclipse/smarthome/tree/master/extensions): add-ons developed for the Eclipse SmartHome framework which are also compatible with openHAB by default, many of which are used in commercial products.
 
