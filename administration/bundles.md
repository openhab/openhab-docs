---
layout: documentation
title: Bundle Management
---

{% include base.html %}

# Bundle Management

The [Karaf console](#console) offers various commands to manage bundles. Most of these commands are not needed in the normal (non-developer) use of openHAB. However some basic commands are needed when dealing with some expert user situations like testing a binding.

## List Bundles

The _bundle:list_ command returns a list of all currently installed bundles including their version.

```python
openhab> bundle:list
START LEVEL 100 , List Threshold: 50
 ID | State    | Lvl | Version               | Name
-----------------------------------------------------------------------------------------------------
 10 | Active   |  80 | 2.3.0.201506221200    | JAX-RS Gson Provider
 11 | Active   |  80 | 5.3.1.201602281253    | OSGi JAX-RS Connector
 12 | Active   |  80 | 2.3.1                 | Gson
 13 | Active   |  80 | 18.0.0                | Guava: Google Core Libraries for Java
 14 | Active   |  80 | 3.0.0.v201312141243   | Google Guice (No AOP)
...
209 | Active   |  80 | 2.0.0.b3              | Network Binding
```

## Start/Stop Bundles

Stoping a bundle is done with the command _stop_ and the ID of the bundle:

```python
openhab> bundle:stop 209
openhab> bundle:list
...
209 | Resolved |  80 | 2.0.0.b3              | Network Binding
```

The _start_ command works accordingly:

```python
openhab> bundle:start 209
openhab> bundle:list
...
209 | Active   |  80 | 2.0.0.b3              | Network Binding
```

## Naming Convention For Bundles

Bundles are named according to the following convention.

```java
<prefix>-<type>-<id>
```

where

- **prefix** is ALWAYS "openhab" 
- **type** is the add-on type, e.g. "binding" or "ui"
- **id** is the identifier for this bundle
  (It is also the id that you would have to use openHAB 1.x in addons.cfg, e.g. "hue", "map", etc.)

  This is used for example to assign them the correct features for the karaf console or to sort them in different tabs within the Paper UI.