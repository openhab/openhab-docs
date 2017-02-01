---
layout: documentation
title: Persistence
---

{% include base.html %}

# Persistence

Persistence services enable the storage of item states over time.

<table>
  <tbody>
    <tr>
      <td width="20%">
        <p>
          <input type="checkbox" class="filled-in" id="manual-checkbox" />
          <label for="manual-checkbox"><img src="{{base}}/images/tag-install-manual.svg"></label>
        </p>
      </td>
      <td>
        <p>
        Some openHAB 1.x persistence services have not yet completed validation for inclusion in the distribution; however, they may indeed work properly under openHAB 2.  All openHAB 1.x add-ons can be downloaded in a <a href="https://bintray.com/openhab/mvn/download_file?file_path=org%2Fopenhab%2Fdistro%2Fopenhab%2F1.9.0%2Fopenhab-1.9.0-addons.zip">zip file</a>.  We need you help testing them so that they may be easily installed in a future distribution.  Please see the <a href="{{base}}/developers/development/compatibilitylayer.html#how-to-use-openhab-1x-add-ons-that-are-not-part-of-the-distribution">compatibility layer documentation</a> and also search the <a href="https://community.openhab.org">openHAB community forum</a> for the latest information and steps for manual installation.
        </p>
      </td>
    </tr>
  </tbody>
</table>

{% assign persists = "" | split: "|" %}
{% for persist in site.data.persistence %}{% assign persists = persists | push: persist %}{% endfor %}
{% assign sorted_persists = persists | sort: "id" %}
{% assign oh1addons = site.data.oh1addons %}
{% assign legacyaddons = site.data.legacyaddons %}

<table class="bordered responsive-table">
  <thead>
    <tr>
      <th data-field="label">Name</th>
      <th data-field="description">Description</th>
    </tr>
  </thead>
  <tbody>
{% for persist in sorted_persists %}
    {% assign install = "auto" %}
    {% if persist.source == "oh1" %}
      {% assign install = "manual" %}
      {% for oh1addon in oh1addons %}
        {% if oh1addon.category == "persistence" and oh1addon.id contains persist.id %}
    	  {% assign install = "auto" %}
    	  {% break %}
    	{% endif %}
      {% endfor %}
      {% for legacyaddon in legacyaddons %}
        {% if legacyaddon.category == "persistence" and legacyaddon.id contains persist.id %}
    	  {% assign install = "legacy" %}
    	  {% break %}
    	{% endif %}
      {% endfor %}
    {% endif %}
    <tr class="install-{{install}} source-{{persist.source}}">
      <td><h4><a href="{{base}}/addons/persistence/{{ persist.source }}/{{ persist.id }}/readme.html">{{ persist.label }}</a></h4><img src="{{base}}/images/tag-{{persist.source}}.svg"><br/>
      <img src="{{base}}/images/tag-install-{{install}}.svg"></td>
      <td>{{ persist.description | markdownify }}</td>
    </tr>
{% endfor %}
 </tbody>
</table>
