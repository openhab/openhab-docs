---
layout: documentation
title: Persistence
---

{% include base.html %}

# Persistence

## Compatible 1.x Persistence Services

{% assign addons = site.data.oh1addons %}
{% assign infos = site.data.oh1addons_infos %}

| Add-on | Description |
|--------|-------------|
{% for addon in addons %}{% if addon.category == "persistence" %}{% assign description = "" %}{% assign wiki_url = "" %}{% for info in infos %}{% if info.label == addon.label %}{% assign description = info.description %}{% assign wiki_url = info.wiki_url %}{% endif %}{% endfor %}|  {% if wiki_url != "" %}[{{ addon.label }}]({{ wiki_url }}){% else %}{{ addon.label }}{% endif %} | {{ description }} |
{% endif %}{% endfor %}
