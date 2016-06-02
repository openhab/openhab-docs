---
layout: documentation
---

{% include base.html %}

# What is openHAB

openHAB is a __software platform__ for integrating many different home automation systems and technologies into one seamless environment that enables over-arching automation rules and offers a uniform user interface.

openHAB is also a __community__ of users, contributors and maintainers.

## openHAB Structure

openHAB 2, hearafter referred to as openHAB, is the successor to [openHAB 1](https://github.com/openhab/openhab/wiki). It is a free and open-source software platform released under the Eclipse Public License. openHAB is fully written in Java and is based on the [Eclipse SmartHome](https://eclipse.org/smarthome/) framework. In addition, openHAB uses [Apache Karaf](http://karaf.apache.org/) together with [Eclipse Equinox](https://www.eclipse.org/equinox/) as an OSGi runtime to support modular plugins, and bundles this with [Jetty](https://www.eclipse.org/jetty/) as an HTTP server to support a RESTful API and web based user interfaces.

openHAB is highly modular software and can be extended through "add-ons" which extend openHAB to communicate with a new home automation technology or solution, offer a new kind of user interface, or extend openHAB's caabilities.

The structure of openHAB can be summarized using the following drawing.

![distribution overview](images/distro.png)

The openHAB distribution is written in Java and therefore runs where ever the [Java Runtime Environment](http://java.com/) runs. At the base of the openHAB architecture is the [Apache Karaf](http://karaf.apache.org/) and [Eclipse Equinox](http://www.eclipse.org/equinox/) OSGi platforms. These enable modularity for the rest of the openHAB framework and some core services. On top of this base there is [Jetty](http://www.eclipse.org/jetty/), an HTTP Server which serves openHAB's web based user interfaces and enables openHAB's RESTful API. Also on top of the OSGi platform is the [Eclipse SmartHome Framework](https://eclipse.org/smarthome/), a set of libraries and core functionality which openHAB builds upon. Next, the __openHAB 2 Core__ also resides on top of the OSGi framwork providing oepnHAB unique capabilities such as a compatibility layer to adapt openHAB 1.x add-ons to openHAB. Finally, add-ons which are built to the Eclipse SmartHome Framework and openHAB API enable openHAB to communicate with a myriad of home automation products, technologies, and standards as well as adding additional capabilities.

Add-ons can come from one of three different origins:

* the Eclipse SmartHome project which are fully compatible with openHAB,

* openHAB version 1.x which are compatible with openHAB through a compatibility layer,

* add-ons made for openHAB 2.


## The openHAB Community

openHAB is not just a software solution, it is also a community.

The center of this community is the [openHAB forum](https://community.openhab.org).

Please post questions or comments to the [openHAB forum](https://community.openhab.org) first when encountering problems. The forum is populated with many helpful openHAB users and developers who can assist with almost any topic related to openHAB including installation, troubleshooting runtime problems, identifying bugs, explaining parts of the system, working with specific add-ons, working with rules and configurations, and potential solutions and workarounds for problems. There are also many excellent examples rules, configurations, and tutorials posted to the forum.

Rules about posting an issue and [contributions guidelines](appendix/contributing.html) are in the _Appendix_.

<<<<<<< HEAD
# Developer Documentation

The [_Developer Guide_](/developers) contains practical and technical information for people desiring to contribute to the development of openHAB or of one of its add-ons.
=======
>>>>>>> refs/remotes/openhab/gh-pages
