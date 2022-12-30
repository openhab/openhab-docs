---
layout: documentation
title: Bundle Management
---

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

## Installing or Updating Bundles

The process depends on the reason why the bundle or from where the bundle is retrieved.
Scenarios could be that a new version is not yet available via the currently running openHAB release but via a URI or via a file that would provide some already special required feature or a bug fix or just because that new version needs to be tested.

### Using bundle:install and bundle:update

A general introduction on how to install or uninstall a bundle via the UI can be found under [Installation of Add-ons](/docs/configuration/addons.html#installation-of-add-ons)

Generally the approach with bundle:install / bundle:update is the recommended way to install/update bundles (this also works for core-bundles).
The drawback is that updated bundles MAY revert to the originally installed version if another add-on is installed.

In case the bundle is available via a URI:

```text
openhab> bundle:install https://github.com/myrepy/my-binding/raw/main/org.openhab.binding.my-3.4.0-SNAPSHOT.jar

openhab> bundle:list | grep My

303 | Active   |  80 | 3.4.0                 | openHAB Add-ons :: Bundles :: My Binding

openhab> bundle:update 303 https://github.com/myrepy/my-binding/raw/main/org.openhab.binding.my-3.4.1-SNAPSHOT.jar

```

In case the bundle is available on a file location, e.g. on the openHAB server (a reason could be that it was self-compiled by a developer and copied to the server), the "file:///" can be used within the URI.
Make sure that file location is not within the addons-folder.

```text
openhab>bundle:update 303 file:///localhost/srv/openhab-sys/org.openhab.binding.my-3.4.0-SNAPSHOT.jar
```

Note: using uninstall for a bundle will most probably NOT work, because all add-ons bundles are part of a feature and as long as the feature is installed, the bundle will likely be reinstalled.

### Installation via the addons-folder

If it’s just about add-ons, it’s also fine to uninstall it and then put the .jar in the addons-folder. A restart of openHAB is not required.

The procedure should be as follows:

- It is highly recommended **to uninstall** the bundle first (e.g. via the UI or bundle:uninstall) as it would otherwise lead to two bundles of the same type to be active at the same time where no one can clearly say what happens if two versions of the same bundle coexist.
- Wait until uninstall has completed,
- then drop the new file in the addons-folder

It is possible to run into problems in this case if the add-on depends on some non-standard feature (e.g. knx depends on the feature openhab-transport-serial).
These features are automatically installed if you install an add-on (via UI or addons.cfg) and are also uninstalled if there is not add-on using it.
If that is the case, it is necessary to install the feature manually with feature:install, e.g. openhab-transport-serial (preferred way) OR drop the required bundles in the addons-folder, too.

## Naming Convention For Bundles

Bundles are named according to the following convention:

```text
<prefix>.<type>.<id>
```

where

- **prefix** is the first element to categorize the bundle.
  For add-ons this is `org.openhab`.
- **type** is the add-on type, e.g. "binding", "persistence", or "ui"
- **id** is the identifier for this bundle

These bundle names are used in many places in openHAB, such as in various configuration files.
Logging also makes extensive use of this **package namespace**.
You can see these names listed as the _Symbolic names_ of bundles by using the ```-s``` option of _bundle:list_:

```text
openhab> bundle:list -s
 ID | State    | Lvl | Version                | Symbolic name
----------------------------------------------------------------------------------------------
...
209 | Active   |  80 | 3.0.0                  | org.openhab.binding.network
```
