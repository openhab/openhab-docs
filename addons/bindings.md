---
layout: documentation
---

{% include base.html %}

# List of Available Bindings

{% assign bindings = "" | split: "|" %}
{% for binding in site.data.bindings %}{% assign bindings = bindings | push: binding %}{% endfor %}
{% assign sorted_bindings = bindings | sort: "id" %}

| Binding | Description |
|-------|----------------------|
{% for binding in sorted_bindings %}| [{{ binding.label }}]({{docu}}/addons/bindings/{{ binding.id }}/readme.html) | {{ binding.description }} |
{% endfor %}					
