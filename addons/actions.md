---
layout: documentation
title: Actions
---

{% include base.html %}

# Actions

Actions are predefined methods for openHAB rules and scripts.
They are automatically imported and can be used to execute openHAB-specific operations or to send commands or data to hardware or services.

<table id="actions-select" class="striped">
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
        Some openHAB 1 actions have not yet completed validation for inclusion in the distribution; however, they may indeed work properly under openHAB 2.  
        All openHAB 1 addons can be downloaded in a <a href="https://bintray.com/openhab/mvn/download_file?file_path=org%2Fopenhab%2Fdistro%2Fopenhab%2F1.9.0%2Fopenhab-1.9.0-addons.zip">zip file</a>.
        We need your help testing them so that they may be easily installed in a future distribution.
        Please see the <a href="{{base}}/developers/development/compatibilitylayer.html#how-to-use-openhab-1x-add-ons-that-are-not-part-of-the-distribution">compatibility layer documentation</a> and
        also search the <a href="https://community.openhab.org">openHAB community forum</a> for the latest information and steps for manual installation.
        </p>
      </td>
    </tr>
  </tbody>
</table>

{% assign actions = "" | split: "|" %}
{% for addon in site.data.addons %}{% if addon.type == "action" %}{% assign actions = actions | push: addon %}{% endif %}{% endfor %}
{% assign sorted_actions = actions | sort: "id" %}
{% assign oh1addons = site.data.oh1addons %}
{% assign legacyaddons = site.data.legacyaddons %}

<table id="actions-overview" class="bordered addon-table">
  <thead>
    <tr>
      <th data-field="label" width="20%">Name</th>
      <th data-field="description">Description</th>
    </tr>
  </thead>
  <tbody>
    {% for action in sorted_actions %}
        {% assign install = "auto" %}
        {% if action.source == "oh1" %}
          {% assign install = "manual" %}
          {% for oh1addon in oh1addons %}
            {% if oh1addon.category == "action" and oh1addon.id contains action.id %}
        	  {% assign install = "auto" %}
        	  {% break %}
        	{% endif %}
          {% endfor %}
          {% for legacyaddon in legacyaddons %}
            {% if legacyaddon.category == "action" and legacyaddon.id contains action.id %}
        	  {% assign install = "legacy" %}
        	  {% break %}
        	{% endif %}
          {% endfor %}
        {% endif %}
        <tr class="install-{{install}} source-{{action.source}}">
          <td>
            <h4><a href="{{base}}/addons/actions/{{action.id}}/readme.html">{% if action.icon == 'true' %}<img class="logo" src="{{base}}/images/addons/{{action.id}}.png" title="{{ action.label }}" alt="{{ action.label }}" />{% else %}{{ action.label }}{% endif %}</a></h4>
            <img src="{{base}}/images/tag-{{action.source}}.svg"> <img src="{{base}}/images/tag-install-{{install}}.svg">
          </td>
          <td>{{ action.description | markdownify }}</td>
        </tr>
    {% endfor %}
 </tbody>
</table>
