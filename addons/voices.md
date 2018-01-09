---
layout: documentation
title: Voice Services
---

{% include base.html %}

# Available Voice Services

| Voice Service | Description |
|---------------|-------------|
{% for voice in site.addons_voices %}| [{% if voice.logo %}<img class="logo" src="{{base}}/{{voice.logo}}" title="{{ voice.label }}" alt="{{ voice.label }}" />{% else %}{{ voice.label }}{% endif %}]({{base}}{{ voice.url }}) | {{ voice.description }} |
{% endfor %}
