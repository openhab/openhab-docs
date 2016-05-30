---
layout: documentation
---

{% assign addons = site.data.oh1addons %}

{% include base.html %}

## Compatible 1.x Add-ons

| Add-on | Type |
|--------|------|
{% for addon in addons %}| {{ addon.label }} | {{ addon.category }} |
{% endfor %}					

## Currently incompatible 1.x Add-ons:

| Add-on | Type | Reason
|--------|------|------|
| CalDAV | Binding | see [issue 4074](https://github.com/openhab/openhab/issues/4074) |
| InsteonPLM | Binding | see [issue 3922](https://github.com/openhab/openhab/issues/3922) |
| SagerCaster | Binding | Not following the architecture guidelines, see [issue 3754](https://github.com/openhab/openhab/issues/3754) |
| Logging | Persistence | openHAB 2 does not use logback anymore |

## Compatible Applications

| Application | Description |
|-------|----------------------|
| [iot_bridge](https://github.com/openhab/openhab/wiki/ROS-Robot-Operating-System) | Bridge between ROS Robot Operating System and openHAB |
