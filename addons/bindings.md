---
layout: documentation
---

{% include base.html %}

# List of Available Bindings

{% assign bindings = site.data.bindings | sort: 'label.toLowerCase()' %}

| Binding | Description |
|-------|----------------------|
{% for binding in bindings %}| [{{ binding.label }}]({{docu}}/addons/bindings/{{ binding.id }}/readme.html) | {{ binding.description }} |
{% endfor %}					
