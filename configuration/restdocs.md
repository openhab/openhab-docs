---
layout: documentation
title: openHAB REST API
---

{% include base.html %}

# openHAB REST API

The REST API of openHAB serves different purposes.
It can be used to integrate openHAB with other systems as it allows read access to items and item states as well as status updates or the sending of commands for items.
Furthermore, it gives access to the sitemaps, so that it is the interface to be used by remote user interfaces (e.g. fat clients or javascript based web clients).
The REST API also supports server-push, so you can subscribe yourself on change notification for certain resources.

For further details, please check:

- The interactive REST API documentation available through the openHAB 2 dashboard (Add-on "misc-restdocs", installed by default)
- [The openHAB 1.x wiki REST API article](https://github.com/openhab/openhab/wiki/REST-API)

{% include contribution-wanted.html %}
