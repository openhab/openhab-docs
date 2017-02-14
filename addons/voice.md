---
layout: documentation
---

{% include base.html %}

# Available Voice Services

{% assign voices = "" | split: "|" %}
{% for voice in site.data.voice %}{% assign voices = voices | push: voice %}{% endfor %}
{% assign sorted_voices = voices | sort: "id" %}

| Voice Service | Description |
|-------|----------------------|
{% for voice in sorted_voices %}| [{% if voice.icon == 'true' %}<img class="logo" src="{{base}}/images/addons/{{voice.id}}.png" title="{{ voice.label }}" alt="{{ voice.label }}" />{% else %}{{ voice.label }}{% endif %}]({{docu}}/addons/voice/{{ voice.id }}/readme.html) | {{ voice.description }} |
{% endfor %}
