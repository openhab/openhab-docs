---
layout: documentation
title: Initial Setup - Package Selection
---

{% include base.html %}

# Initial Setup Package Selection

When starting openHAB for the very first time, you are asked to select an initial package to start with.

There are four packages to choose from, which will be explained here in detail.

*Note*: If you are doing a headless installation, you can also choose the package by setting the `package` parameter in `conf/services/addons.cfg` (resp. `/etc/openhab2/services/addons.cfg` for apt installations).

If you skipped the package installation, the system stays in a minimal setup without any add-ons which also means without any UIs. In such a case, you must configure the add-ons to install in `addons.cfg`.

## Standard Package (Recommended Setup)

![standard](images/package_standard.jpg){:style="float: right;margin-left: 20px;margin-top: 7px;margin-bottom: 20px"}

This is the recommended package for the normal user. It contains the most common UIs and leaves the rest to the user to decide what else he needs.

This package thus installs:

- [Home Builder](homebuilder.html){:target="_blank"} as a getting-started generator for your home
- [Paper UI](../addons/uis/paper/readme.html){:target="_blank"} for system administration, including item access
- [Basic UI](../addons/uis/basic/readme.html){:target="_blank"} as the new modern web UI for mobile devices
- [HABPanel](../addons/uis/habpanel/readme.html){:target="_blank"} as a dashboard UI for (e.g. wall-mounted) tablets

Additional add-ons can be installed through Paper UI or directly by defining them in `addons.cfg`.

## Expert Package (Best for 1.x Users)

![expert](images/package_expert.jpg){:style="float: right;margin-left: 20px;margin-top: 7px;margin-bottom: 20px"}

All users coming from openHAB 1.x should choose this package. It contains everything that was part of the core 1.x runtime, plus the tools that are specifically meant for power users.

This package thus installs:

- [Paper UI](../addons/uis/paper/readme.html){:target="_blank"} for system administration, including item access
- [Classic UI](../addons/uis/classic/readme.html){:target="_blank"} as the well-known web UI from openHAB 1.x
- [Basic UI](../addons/uis/basic/readme.html){:target="_blank"} as the new modern web UI for mobile devices
- [HABPanel](../addons/uis/habpanel/readme.html){:target="_blank"} as a dashboard UI for (e.g. wall-mounted) tablets
- [HABmin](../addons/uis/habmin/readme.html){:target="_blank"} as a powerful administration console, specifically suited for Z-Wave setups
- Interactive REST API that easily allows exploring the REST features through a documented UI
- all available transformations as they used to be part of the core 1.x runtime

## Simple Package (Purely UI)

![simple](images/package_simple.jpg){:style="float: right;margin-left: 20px;margin-top: 7px;margin-bottom: 20px"}

This package contains only components that allow a fully UI-driven setup and configuration process.
These are:

- [Paper UI](../addons/uis/paper/readme.html){:target="_blank"} for system administration, configured with "simple linking", i.e. no items are exposed to the user
- the [new rule engine](rules-ng.html){:target="_blank"} to set up automation rules without scripting
- [HABPanel](../addons/uis/habpanel/readme.html){:target="_blank"} as a dashboard UI for daily use
- only "native" openHAB 2 bindings are available, 1.x add-ons are excluded

**WARNING**: Note that the UI-driven configuration features are new and still under development, so many features will be enhanced in upcoming versions.
Specifically the rule engine is in an early stage and has several functional limitations.
Most features of openHAB still require textual configuration (e.g. the sitemaps and complex rules).
This package therefore should only be used for very simple setups or as an demonstrator what there is to come.

## Demo Package (Sample Setup)

![demo](images/package_demo.jpg){:style="float: right;margin-left: 20px;margin-top: 7px;margin-bottom: 20px"}

This package is suitable for demo purposes and for quickly checking out openHAB. It not only installs a few common bindings, but also defines sample textual configuration files, which are also used on the public [openHAB Demo Server](https://demo.openhab.org/){:target="_blank"}.

This includes:

- [Paper UI](../addons/uis/paper/readme.html){:target="_blank"} for system administration, configured in "simple" mode, such that newly added Things directly become available on the control UIs
- [Basic UI](../addons/uis/basic/readme.html){:target="_blank"} as the new modern web UI for mobile devices
- [HABPanel](../addons/uis/habpanel/readme.html){:target="_blank"} as a dashboard UI for tablets
- Bindings for Yahoo Weather, Belkin WeMo, Philips Hue, Sonos, IPP, Astro, AVM!Fritz and NTP
- RRD4j persistence service for storing time-series locally
- MAP transformation service as this is heavily used by the sample files
- Sample configurations files `demo.items`, `demo.things`,  `demo.sitemap`, `demo.rules`, `demo.script`, `rrd4j.persist`, `de.map` and `en.map` for use with the MAP transformation
