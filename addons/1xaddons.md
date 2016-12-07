---
layout: documentation
---

{% assign addons = site.data.oh1addons %}
{% assign infos = site.data.oh1addons_infos %}

{% include base.html %}

# 1.x Add-ons

Addons developed for the first version of openHAB can also be used with openHAB 2.0.
Please be aware, that these bindings function and behave differently.
For beginners it is recommended to resort to native 2.0 bindings if possible.

## Compatible 1.x Actions

| Add-on | Description | Type |
|--------|-------------|------|
{% for addon in addons %}{% if addon.category == "action" %}{% assign description = "" %}{% assign wiki_url = "" %}{% for info in infos %}{% if info.label == addon.label %}{% assign description = info.description %}{% assign wiki_url = info.wiki_url %}{% endif %}{% endfor %}|  {% if wiki_url != "" %}[{{ addon.label }}]({{ wiki_url }}){% else %}{{ addon.label }}{% endif %} | {{ description }} | {{ addon.category }} |
{% endif %}{% endfor %}

## Compatible 1.x Persistence Services

| Add-on | Description | Type |
|--------|-------------|------|
{% for addon in addons %}{% if addon.category == "persistence" %}{% assign description = "" %}{% assign wiki_url = "" %}{% for info in infos %}{% if info.label == addon.label %}{% assign description = info.description %}{% assign wiki_url = info.wiki_url %}{% endif %}{% endfor %}|  {% if wiki_url != "" %}[{{ addon.label }}]({{ wiki_url }}){% else %}{{ addon.label }}{% endif %} | {{ description }} | {{ addon.category }} |
{% endif %}{% endfor %}

## Compatible 1.x Bindings

| Add-on | Description | Type |
|--------|-------------|------|
{% for addon in addons %}{% if addon.category == "binding" %}{% assign description = "" %}{% assign wiki_url = "" %}{% for info in infos %}{% if info.label == addon.label %}{% assign description = info.description %}{% assign wiki_url = info.wiki_url %}{% endif %}{% endfor %}|  {% if wiki_url != "" %}[{{ addon.label }}]({{ wiki_url }}){% else %}{{ addon.label }}{% endif %} | {{ description }} | {{ addon.category }} |
{% endif %}{% endfor %}

## Further 1.x Add-ons

Many more 1.x add-ons STILL NEED TO BE TESTED and will probably work on openHAB 2.
For the full list that exists for openHAB 1, please refer to:

* The right sidebar on the [openHAB 1.x wiki](https://github.com/openhab/openhab/wiki/Configuring-the-openHAB-runtime) for additional add-ons.
* [This page](https://github.com/openhab/openhab/wiki/Actions) in the openHAB 1.x wiki for additional actions.

For information on how to test and add add-ons that are not yet included, please see the [compatibility layer documentation](/developers/development/compatibilitylayer.html#how-to-use-openhab-1x-add-ons-that-are-not-part-of-the-distribution).
Experiences with add-ons may also be found in the [openHAB community forum](https://community.openhab.org).

## Incompatible 1.x Add-ons

| Add-on | Type | Reason
|--------|------|------|
| CalDAV | Binding | see [issue 4074](https://github.com/openhab/openhab/issues/4074) |
| GCal | I/O | see [issue 4770](https://github.com/openhab/openhab/issues/4770) |
| InsteonPLM | Binding | see [issue 3922](https://github.com/openhab/openhab/issues/3922) |
| SagerCaster | Binding | Not following the architecture guidelines, see [issue 3754](https://github.com/openhab/openhab/issues/3754) |
| Logging | Persistence | openHAB 2 does not use logback anymore |

## Compatible Applications

| Application | Description |
|-------|----------------------|
| [iot_bridge](https://github.com/openhab/openhab/wiki/ROS-Robot-Operating-System) | Bridge between ROS Robot Operating System and openHAB |
