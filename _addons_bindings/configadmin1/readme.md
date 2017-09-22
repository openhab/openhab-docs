---
id: configadmin
label: ConfigAdmin
title: ConfigAdmin - Bindings
type: binding
description: "With this binding it is possible to dynamically change settings that are defined in the Configuration Admin Manager of OSGi, where all configuration data are kept for openHAB. The various `.cfg` files are as such used to define the initial configuration, while you can use this binding to change values during runtime, simply by sending a command to an item."
source: https://github.com/openhab/openhab1-addons/blob/master/bundles/binding/org.openhab.binding.configadmin/README.md
since: 1x
install: manual
---

<!-- Attention authors: Do not edit directly. Please add your changes to the appropriate source repository -->

{% include base.html %}

# ConfigAdmin Binding

With this binding it is possible to dynamically change settings that are defined in the Configuration Admin Manager of OSGi, where all configuration data are kept for openHAB. The various `.cfg` files are as such used to define the initial configuration, while you can use this binding to change values during runtime, simply by sending a command to an item.

## Binding Configuration

This binding does not itself have a configuration.

## Item Configuration

The syntax for the ConfigAdmin binding configuration string is:

```
configadmin="<pid>:<command>"
```

where `<pid>` can be configured either fully qualified with preceding `org.openhab` or without it as a shortcut. In case no '.' is found within the pid it is prefixed with `org.openhab`.

Here are some examples of valid binding configuration strings:

```
configadmin="dropbox:syncmode"
configadmin="org.openhab.gcal:refresh"
```

## Examples

```
Switch    Dropbox_OnOff      "Activate Sync"   (State)   { configadmin="dropbox:activate" }
String    Dropbox_SyncMode   "Syncmode"        (State)   { configadmin="dropbox:syncmode" }
```
