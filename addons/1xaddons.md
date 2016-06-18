---
layout: documentation
---

{% assign addons = site.data.oh1addons %}
{% assign infos = site.data.oh1addons_infos %}

{% include base.html %}

## Compatible 1.x Add-ons

| Addon | Description | Wiki | Type |
|-------|-------------|------|------|
{% for addon in addons %}{% assign description = "" %}{% assign wiki_url = "" %}{% for info in infos %}{% if info.label == addon.label %}{% assign description = info.description %}{% assign wiki_url = info.wiki_url %}{% endif %}{% endfor %}| {{ addon.label }} | {{ description }} | {% if wiki_url != "" %}[More...]({{ wiki_url }}){% endif %} | {{ addon.category }} |
{% endfor %}

For 1.x Add-ons documentation and configuration look at right sidebar on the [OpenHAB 1.x wiki](https://github.com/openhab/openhab/wiki/Configuring-the-openHAB-runtime)

> **Loads of 1.x Add-ons and Actions STILL NEED TO BE TESTED and will probably work on OpenHAB 2**.  
> Please refere to:
> 
> * the right sidebar on the [OpenHAB 1.x wiki](https://github.com/openhab/openhab/wiki/Configuring-the-openHAB-runtime) for Add-ons
> * [this page](https://github.com/openhab/openhab/wiki/Actions) for Actions
> * the paragraph below about testing

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

## How to configure 1.x Add-ons

You will not be able to configure 1.x add-ons from the Paper UI interface.  
1.x addons still need to be configured in the OpenHAB 1.x way, to do that just put your old **openhab.cfg** in the **/etc/openhab2/services** folder (for more informations look at the [OpenHAB 1.x wiki page relative to openhab.cfg](https://github.com/openhab/openhab/wiki/Configuring-the-openHAB-runtime#general-configuration---openhabcfg))

## How to test 1.x Add-ons not included in OpenHAB 2

You will need to copy the relative **.jar** file in the **/usr/share/openhab2/addons** folder and configure the add-on as any other already included 1.x add-on.

If your test is successfull please **think about contributing** and read this further informations:

* [We need your help on testing](https://community.openhab.org/t/we-need-your-help-on-testing/298)
* [How to contribute](https://github.com/openhab/openhab/wiki/How-To-Contribute#a-note-on-openhab-2-compatibility)