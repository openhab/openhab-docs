---
layout: documentation
---

{% include base.html %}

# About openHAB

openHAB is **software** for integrating different home automation systems and technologies into one single solution that allows over-arching automation rules, and that offers uniform user interfaces.

But openHAB is also a **community** of users, contributors and maintainers.

## openHAB Structure

openHAB 2 is an open-source solution based on the [Eclipse SmartHome](https://eclipse.org/smarthome/) framework. It is fully written in Java and uses [Apache Karaf](http://karaf.apache.org/) together with [Eclipse Equinox](https://www.eclipse.org/equinox/) as an OSGi runtime and bundles this with [Jetty](https://www.eclipse.org/jetty/) as an HTTP server.

openHAB is highly modular software, which means that the base installation (the "runtime") can be extended through different kinds of "add-ons", either to communicate with new home automation solution, or to offer a new kind of user interface.

The structure of openHAB can be summarized this way:

![distribution overview](images/distro.png)

Add-ons can come from three different origins:

* Add-ons coming from the Eclipse SmartHome project, as Eclipse SmartHome is the base of openHAB 2,
* Add-ons coming from the openHAB version 1 package, as openHAB 2 includes a compatibility layer,
* Add-ons made for openHAB 2.


## The openHAB Community

openHAB is not only a solution but also a community.

The center of this community is the [openHAB community forum](https://community.openhab.org).

If you have questions about the use of openHAB, before reporting an issue, or for comments and contributions to the documentation, please check the [openHAB community forum](https://community.openhab.org) for solutions and help. More people will see your issue when it is posted in the forum and community members may be able to help you find known solutions/workarounds for your issue.

Rules about posting an issue and [contributions guidelines](appendix/contributing.html) are in the *Appendix*.
