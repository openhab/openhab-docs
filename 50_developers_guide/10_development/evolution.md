---
layout: developersguide
---

{% include base.html %}

# Technical Difference to openHAB 1
 
There are a few technical changes in openHAB 2 that are not compatible with openHAB 1:

 - the REST API does NOT support XML nor JSON-P anymore. It is now fully realized using JSON.
 - the REST API does not support websocket access anymore - it actually completely drops "push" support and only has a simple long-polling implementation to provide a basic backward-compatibility for clients. 


# Compatibility layer

There is a special bundle in openHAB 2, which serves as a compatibility layer. It effectively exposes and consumes all relevant classes and services from the `org.openhab` namespace and internally delegates or proxies them to the according `org.eclipse.smarthome` classes and services.

It is described next page.