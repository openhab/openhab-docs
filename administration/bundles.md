---
layout: documentation
title: Bundle Management
---

{% include base.html %}

# Bundle Management

The [console](console.html) offers various commands to manage bundles, among other things.
Most of these commands are not needed in the normal (non-developer) use of openHAB.
However some basic console commands may be needed when dealing with certain advanced user situations, such as when testing a newly developed or patched binding.

## List Bundles

The _bundle:list_ command returns a list of all currently installed bundles and their states, names, and versions.
The core openHAB system is composed of many bundles.
There will also be a bundle for each add-on, such a binding, that you have installed.
A state of "Active" means the bundle is running.

```text
openhab> bundle:list
START LEVEL 100 , List Threshold: 50
 ID | State    | Lvl | Version               | Name
-----------------------------------------------------------------------------------------------------
 22 │ Active │  80 │ 2.10.3                  │ Jackson-annotations
 23 │ Active │  80 │ 2.10.3                  │ Jackson-core
 24 │ Active │  80 │ 2.10.3                  │ jackson-databind
 25 │ Active │  80 │ 2.10.3                  │ Jackson-dataformat-YAML
 26 │ Active │  80 │ 2.10.3                  │ Jackson datatype: JSR310
 27 │ Active │  80 │ 2.8.2.v20180104-1110    │ Gson: Google Json Library for Java
...
209 | Active |  80 | 3.0.0                   | openHAB Add-ons :: Bundles :: Network Binding
```

## Start/Stop Bundles

Stopping a bundle is done using the command _stop_ and the ID of the bundle:

```text
openhab> bundle:stop 209
openhab> bundle:list
...
209 | Resolved |  80 | 3.0.0                 | openHAB Add-ons :: Bundles :: Network Binding
```

Starting a bundle is done using the _start_ command and the ID of the bundle:

```text
openhab> bundle:start 209
openhab> bundle:list
...
209 | Active   |  80 | 3.0.0                 | openHAB Add-ons :: Bundles :: Network Binding
```

## Naming Convention For Bundles

Bundles are named according to the following convention:

```text
<prefix>.<type>.<id>
```

where

- **prefix** is the first element to categorize the bundle.
  For addons this is `org.openhab`.
- **type** is the add-on type, e.g. "binding", "persistence", or "ui"
- **id** is the identifier for this bundle

These bundle names are used in many places in openHAB, such as in various configuration files.
Logging also makes extensive use of this **package namespace**.
You can see these names listed as the *Symbolic names* of bundles by using the ```-s``` option of _bundle:list_:

```text
openhab> bundle:list -s
 ID | State    | Lvl | Version                | Symbolic name
----------------------------------------------------------------------------------------------
...
209 | Active   |  80 | 3.0.0                  | org.openhab.binding.network
```
