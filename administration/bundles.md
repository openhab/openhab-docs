---
layout: documentation
title: Bundle Management
---

# Bundle Management

The [console](console.html) offers various commands to manage bundles, among other things.
Most of these commands are not needed in the normal (non-development) use of openHAB.
However, some basic console commands may be needed when dealing with certain advanced user situations, such as when testing a newly developed or patched binding.

Use the `bundle --help` command to get a list of all available bundle management commands.
`bundle:<command> --help` provides more information about a specific command.

The following commands are particularly useful.

## List Bundles

The `bundle:list` command lists all currently installed bundles and their states, names, and versions.
openHAB Core itself is composed of many bundles, and each add-on is a bundle as well.

```text
openhab> bundle:list
START LEVEL 100 , List Threshold: 50
 ID │ State  │ Lvl │ Version               │ Name
────┼────────┼─────┼───────────────────────┼────────────────────────────────────────────────────────────────────────────────────────────
 30 │ Active │  80 │ 2.20.0                │ Jackson-annotations
 31 │ Active │  80 │ 2.20.1                │ Jackson-core
 32 │ Active │  80 │ 2.20.1                │ jackson-databind
 ...
161 │ Active │  80 │ 5.2.0.202601040252    │ openHAB Core :: Bundles :: JAAS Authentication
162 │ Active │  80 │ 5.2.0.202601040254    │ openHAB Core :: Bundles :: OAuth2Client
163 │ Active │  80 │ 5.2.0.202601040258    │ openHAB Core :: Bundles :: Automation
164 │ Active │  80 │ 5.2.0.202601040300    │ openHAB Core :: Bundles :: Automation Media Modules
...
285 │ Active │  80 │ 5.2.0.202601040327    │ openHAB Add-ons :: Bundles :: Automation :: JavaScript Scripting
286 │ Active │  80 │ 5.2.0.202601040331    │ openHAB Add-ons :: Bundles :: Astro Binding
287 │ Active │  80 │ 5.2.0.202601040339    │ openHAB Add-ons :: Bundles :: Energi Data Service Binding
288 │ Active │  80 │ 5.2.0.202601040345    │ openHAB Add-ons :: Bundles :: MQTT Broker Binding
```

`grep` may be used to filter the output, e.g.:

```text
openhab> bundle:list | grep "Main UI"
START LEVEL 100 , List Threshold: 50
 ID │ State  │ Lvl │ Version │ Name
────┼────────┼─────┼─────────┼──────────────────────────────────
228 │ Active │  80 │ 5.1.0   │ openHAB UI :: Bundles :: Main UI
```

`bundle:list <bundleName>` may be used to list a specific bundle by name (see below on how to discover the name), e.g.:

```text
openhab> bundle:list org.openhab.ui
START LEVEL 100 , List Threshold: 50
 ID │ State  │ Lvl │ Version │ Name
────┼────────┼─────┼─────────┼──────────────────────────────────
228 │ Active │  80 │ 5.1.0   │ openHAB UI :: Bundles :: Main UI
```

The `-l` argument may be used to list the URL of a bundle, e.g.:

```text
openhab> bundle:list -l 340
START LEVEL 100 , List Threshold: 50
 ID │ State  │ Lvl │ Version │ Location
────┼────────┼─────┼─────────┼────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
340 │ Active │  80 │ 5.1.0   │ mvn:org.openhab.addons.bundles/org.openhab.binding.zigbee/5.1.0
```

## Start/Stop or Restart a Bundle

A bundle can be started using the `bundle:start <ID>` command:

```text
openhab> bundle:start 209
openhab> bundle:list
...
209 | Active   |  80 | 5.0.0                 | openHAB Add-ons :: Bundles :: Network Binding
```

Similarly, a bundle can be stopped with the `bundle:stop <ID>` command:

```text
openhab> bundle:stop 209
openhab> bundle:list
...
209 | Resolved |  80 | 5.0.0                 | openHAB Add-ons :: Bundles :: Network Binding
```

Bundles can also be restarted using the `bundle:restart <ID>` command:

```text
openhab> bundle:restart 209
```

## Installing or Updating Bundles

Depending on the scenario why a bundle needs to be installed or updated, one of the following approaches can be used to install or update a bundle.

Possible scenarios include that a bug has been and a fix has been implemented, but is not yet available in a release.
Or you want to try out a new (version of an) add-on.

### Using `bundle:install` and `bundle:update`

A general introduction on how to install or uninstall a bundle via Main UI can be found under [Installation of Add-ons](/docs/configuration/addons.html#installation-of-add-ons)

Generally the approach with `bundle:install` / `bundle:update` is the recommended way to install/update bundles as it works for all bundles.
The drawback is that updated bundles MAY revert to the originally installed version if another add-on is installed.

In case the bundle is available via a URI:

```text
openhab> bundle:install https://github.com/myrepy/my-binding/raw/main/org.openhab.binding.my-5.0.0-SNAPSHOT.jar
openhab> bundle:list | grep My
303 | Active   |  80 | 5.0.0.202505050505    | openHAB Add-ons :: Bundles :: My Binding
openhab> bundle:update 303 https://github.com/myrepy/my-binding/raw/main/org.openhab.binding.my-5.0.0-SNAPSHOT.jar
```

In case the bundle is available on a file location, e.g. on the openHAB server (for example if it was compiled locally and copied to the server), `file://` can be used within the URI.
Make sure that file location is not within the `$OPENHAB_ADDONS` folder.

```text
openhab>bundle:update 303 file:///localhost/srv/openhab-sys/org.openhab.binding.my-5.0.0-SNAPSHOT.jar
```

Note: Using `bundle:uninstall` to uninstall an add-on will **not** work, because all add-ons bundles are part of a feature and as long as the feature is installed, the bundle will be reinstalled.

#### Updating from CI

When a bug has been discovered in an add-on or Main UI and a fix is available and has been backported for your version of openHAB,
you can update the individual bundle to get the fix immediately without waiting for the next patch release.
Bundles can either be built locally (through Maven) or downloaded directly from the [CI build server](https://ci.openhab.org) or from our [JFrog Artifactory](https://openhab.jfrog.io):

1. Depending on the openHAB version, the following sources are available:
   1. Current openHAB stable release:
      - Add-ons: [Add-ons Artifactory](https://openhab.jfrog.io/ui/native/sandbox-release/org/openhab/addons/bundles/)
      - UIs (Main UI, Basic UI): [WebUI Artifactory](https://openhab.jfrog.io/ui/native/sandbox-release/org/openhab/ui/bundles/)
   1. Previous openHAB stable release:
      - Add-ons: [Add-ons Artifactory](https://openhab.jfrog.io/ui/native/sandbox-snapshot/org/openhab/addons/bundles/)
      - UIs (Main UI, Basic UI): [WebUI Artifactory](https://openhab.jfrog.io/ui/native/sandbox-snapshot/org/openhab/ui/bundles/)
   1. Current openHAB milestone or snapshot:
      - Add-ons: [Add-ons Integration Build](https://ci.openhab.org/job/openHAB-Addons/lastSuccessfulBuild/artifact/bundles/)
      - UIs (Main UI, Basic UI): [WebUI Integration Build](https://ci.openhab.org/job/openHAB-WebUI/lastSuccessfulBuild/artifact/bundles/)
1. In your browser, navigate to the appropriate URL for your version of openHAB from the list above.
   Search for the general add-on name or scroll down the list to find the bundle name (see below).
   Select the appropriate bundle, e.g. `org.openhab.ui` for Main UI or `org.openhab.binding.matter` for the Matter binding.
1. **Only for Artifactory:** Select the appropriate version from the list of available versions.
   For example, the latest `5.1.x-SNAPSHOT` version should be used for openHAB 5.1.x, e.g. [5.1.2-SNAPSHOT](https://openhab.jfrog.io/ui/native/sandbox-snapshot/org/openhab/ui/bundles/org.openhab.ui/5.1.2-SNAPSHOT/).
1. Get the bundle download link:
   1. Artifactory: Right-click the latest `.jar` file (not `-sources.jar`!) and copy the download link.
   1. Integration Build: Right-click the `.jar` file (not `-sources.jar`!) and copy the download link.

The download link can then be used with the `bundle:update` command, e.g.:

```text
openhab> bundle:update 228 https://openhab.jfrog.io/artifactory/sandbox-snapshot/org/openhab/ui/bundles/org.openhab.ui/5.1.2-SNAPSHOT/org.openhab.ui-5.1.2-20251228.141753-2.jar
```

### Installation via the `$OPENHAB_ADDONS` folder

If it's just about add-ons, it’s also fine to uninstall it and then put the `.jar` in the add-on folder.
A restart of openHAB is not required.

The procedure should be as follows:

- It is recommended **to uninstall** the bundle first (e.g. via the UI or bundle:uninstall) as it would otherwise lead to two versions of the same bundle to be active at the same time, which can cause unpredicted and unexpected behavior.
- Wait until uninstall has completed,
- then drop the new file in the `$OPENHAB_ADDONS` folder.

It is possible that add-on installation does not work if the add-on depends on features other than `openhab-runtime-base` (e.g. KNX depends on the feature `openhab-transport-serial`).
These features are automatically loaded if you install an add-on (via Main UI or `addons.cfg`) and are also unloaded if there is no add-on using it.
If that is the case, it is necessary to load the feature manually with the `feature:install` command, e.g. `feature:install openhab-transport-serial` (preferred way).

## Naming Convention For Bundles

Bundles are named similarly to Java packages, i.e. according to the reverse domain name convention (`<tld>.<domain>...`, e.g. `org.openhab...`).
Thereby, all openHAB bundles follow the following convention:

```text
org.openhab.<type>.<id>
```

where

- **type** is the bundle type, e.g. `core` for openHAB core, or `binding`, `persistence`, `ui` for add-ons
- **id** is the identifier for this bundle, e.g `matter` for the Matter binding

These bundle names are used in many places in openHAB, such as in various configuration files.
Logging also makes extensive use of this **package namespace**.
You can see these names listed as the _Symbolic names_ of bundles by using the ```-s``` option of the `bundle:list` command:

```text
openhab> bundle:list -s
 ID | State    | Lvl | Version                | Symbolic name
----------------------------------------------------------------------------------------------
...
209 | Active   |  80 | 5.0.0                  | org.openhab.binding.network
```
