---
layout: documentation
---

{% include base.html %}

# About openHAB

openHAB is **software** for integrating different home automation systems, devices and technologies into one single solution.
It provides uniform user interfaces, and a common approach to automation rules across the entire system, regardless of the number of manufacturers and sub-systems involved.

openHAB is also a **community** of users, contributors and maintainers, working together on an open-source, interoperable approach to home automation.

## openHAB Structure

openHAB 2 is based on the [Eclipse SmartHome](https://eclipse.org/smarthome/) framework, and is written in Java.
It uses [Apache Karaf](http://karaf.apache.org/) together with [Eclipse Equinox](https://www.eclipse.org/equinox/) to create an Open Services Gateway initiative (OSGi) runtime environment.
[Jetty](https://www.eclipse.org/jetty/) is used as an HTTP server.

openHAB is highly modular software, and can be extended through "add-ons".
Add-ons give openHAB a wide array of capabilities, from User Interfaces, to the ability to interact with a large and growing number of physical Things.

The overall architecture of openHAB is shown in the figure below:

![distribution overview](images/distro.png)

## The openHAB Community

openHAB is not only a solution but also a community.

The center of this community is the [openHAB community forum](https://community.openhab.org).

If you have questions about the use of openHAB, before reporting an issue, please check the [openHAB community forum](https://community.openhab.org) for solutions and help.
More people will see your issue when it is posted in the forum, and community members may be able to help you find known solutions or workarounds for your issue.

Rules about posting an issue and [contributions guidelines](appendix/contributing.html) are in the *Appendix*.
