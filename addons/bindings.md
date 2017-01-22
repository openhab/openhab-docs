---
layout: documentation
title: Bindings
---

{% include base.html %}

# Bindings

The following bindings are available to address a wide variety of systems and hardware.

{::options toc_levels="2..4"/}

* TOC
{:toc}

## Native Bindings

The following bindings can be installed and configured directly from within Paper UI or by any of the other installation methods.

{% assign bindings = "" | split: "|" %}
{% for binding in site.data.bindings %}{% assign bindings = bindings | push: binding %}{% endfor %}
{% assign sorted_bindings = bindings | sort: "id" %}

| Binding | Description |
|---------|-------------|
{% for binding in sorted_bindings %}| [{{ binding.label }}]({{base}}/addons/bindings/{{ binding.id }}/readme.html) | {{ binding.description }} |
{% endfor %}

## 1.x Bindings

Bindings developed for the first version of openHAB can also be used with openHAB 2. If there is already a 2.x binding version available, those are referred to as "Legacy 1.x Bindings", otherwise as regular add-ons.
Please be aware, that these bindings function and behave differently, for example there is no autodiscovery function for openHAB2 things and openHAB2 channels are not available.
For beginners it is recommended to resort to native bindings if possible.

To be able to see and install 1.x bindings one has to activate "Access Remote Repository" and "Include Legacy 1.x Bindings" in openHAB2 system settings.

When using config examples for the openhab.cfg file from the [openHAB 1 wiki](https://github.com/openhab/openhab1-addons/wiki), those need to be split into individual binding config files for openHAB2:

After installing a Legacy or regular 1.x binding an individual `<binding_name>.cfg` file is created in the `/services` folder. If this file is not created automatically it needs to be added manually.
The naming convention has to be: `<binding_name>.cfg` without the trailing "1" in the binding name grabbed from "PaperUI -> Add-Ons -> Bindings", for example the binding name from PaperUI for the MQTT binding is "binding-mqtt1-1.9.x", the config file you have to create is "mqtt.cfg".
Next step is to remove the binding prefix name from the config lines in openhab.cfg and add the remaining part to the `<binding_name>.cfg` file, for example

openhab.cfg:

`mqtt:<broker>.url=<url>`

becomes

mqtt.cfg:

`<broker>.url=<url>`

### Compatible 1.x Bindings

{% assign addons = site.data.oh1addons %}
{% assign infos = site.data.oh1addons_infos %}

| Binding | Description |
|---------|-------------|
{% for addon in addons %}{% if addon.category == "binding" %}{% assign description = "" %}{% assign wiki_url = "" %}{% for info in infos %}{% if info.label == addon.label %}{% assign description = info.description %}{% assign wiki_url = info.wiki_url %}{% endif %}{% endfor %}|  {% if wiki_url != "" %}[{{ addon.label }}]({{ wiki_url }}){% else %}{{ addon.label }}{% endif %} | {{ description }} |
{% endif %}{% endfor %}

### Further 1.x Bindings

Many more 1.x bindings **still need testing** but will probably be working with openHAB 2.
Experiences with 1.x bindings in openHAB 2 may also be found in the [openHAB community forum](https://community.openhab.org).
For a full list of existing openHAB 1.x bindings, please refer to:

* The right sidebar on the [openHAB 1.x wiki](https://github.com/openhab/openhab/wiki/Configuring-the-openHAB-runtime).

For information on how to test and add bindings to the above list, please see the [compatibility layer documentation]({{base}}/developers/development/compatibilitylayer.html#how-to-use-openhab-1x-add-ons-that-are-not-part-of-the-distribution).

### Incompatible 1.x Bindings

| Binding         | Reason |
|-----------------|--------|
| CalDAV          | See [issue 4074](https://github.com/openhab/openhab/issues/4074) |
| InsteonPLM      | See [issue 3922](https://github.com/openhab/openhab/issues/3922) |
| SagerCaster     | Not following the architecture guidelines, see [issue 3754](https://github.com/openhab/openhab/issues/3754) |
