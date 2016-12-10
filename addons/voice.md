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
{% for voice in sorted_voices %}| [{{ voice.label }}]({{docu}}/addons/voice/{{ voice.id }}/readme.html) | {{ voice.description }} |
{% endfor %}
