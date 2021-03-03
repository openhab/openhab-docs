---
layout: developersguide
title: Extension service
---

# Extension service

openHAB comes with an API that allows implementing a service that manages the installed extensions within a solution.
All that needs to be done is to register an OSGi service that implements `org.openhab.core.extension.ExtensionService`.
Such a service has to provide a list of available extensions and then can be called in order to install and uninstall them.

What kind of implementation is chosen is completely up to the solution.
Suitable mechanisms might be Apache Felix FileInstall, Apache Karaf FeatureInstaller, etc.
For testing purposes, openHAB comes with a sample implementation in the bundle `org.openhab.core.extension.sample`.

Installation and uninstallation requests are executed by a thread pool named "extensionService".
If an implementation does not support concurrent execution of such operations, the thread pool size should be set to 1.

TODO
