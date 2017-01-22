---
layout: documentation
title: Actions
---

{% include base.html %}

# Actions

Actions are predefined methods for openHAB rules and scripts.
They are automatically imported and can be used to execute openHAB specific operations or to send commands or data to hardware or services.

## Compatible 1.x Actions

{% assign addons = site.data.oh1addons %}
{% assign infos = site.data.oh1addons_infos %}

| Add-on | Description |
|--------|-------------|
{% for addon in addons %}{% if addon.category == "action" %}{% assign description = "" %}{% assign wiki_url = "" %}{% for info in infos %}{% if info.label == addon.label %}{% assign description = info.description %}{% assign wiki_url = info.wiki_url %}{% endif %}{% endfor %}|  {% if wiki_url != "" %}[{{ addon.label }}]({{ wiki_url }}){% else %}{{ addon.label }}{% endif %} | {{ description }} |
{% endif %}{% endfor %}

More 1.x actions **still need testing** but will probably be working with openHAB 2.
Experiences may also be found in the [openHAB community forum](https://community.openhab.org).
For a more complete list of existing openHAB 1.x actions, please refer to:

* [Actions in openHAB 1.x](https://github.com/openhab/openhab/wiki/Actions)

For information on how to test and add actions to the above list, please see the [compatibility layer documentation]({{base}}/developers/development/compatibilitylayer.html#how-to-use-openhab-1x-add-ons-that-are-not-part-of-the-distribution).
