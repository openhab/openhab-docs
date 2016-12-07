---
layout: documentation
---

{% include base.html %}

# Available 2.0 Bindings

The following bindings are available to address a wide variety of systems and hardware.

{% assign bindings = "" | split: "|" %}
{% for binding in site.data.bindings %}{% assign bindings = bindings | push: binding %}{% endfor %}
{% assign sorted_bindings = bindings | sort: "id" %}

| Binding | Description |
|---------|-------------|
{% for binding in sorted_bindings %}| [{{ binding.label }}]({{docu}}/addons/bindings/{{ binding.id }}/readme.html) | {{ binding.description }} |
{% endfor %}

# Legacy 1.x Bindings

Bindings developed for the first version of openHAB can also be used with openHAB 2.0.
Please be aware, that these bindings function and behave differently.
For beginners it is recommended to resort to native 2.0 bindings if possible.

* [List of 1.x Bindings](1xaddons.html)
