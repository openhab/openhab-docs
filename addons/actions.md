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

<table id="actions-overview" class="bordered addon-table">
  <thead>
    <tr>
      <th data-field="label" width="20%">Name</th>
      <th data-field="description">Description</th>
    </tr>
  </thead>
  <tbody>
    {% for action in site.actions %}
        <tr class="install-{{action.install}} since-{{action.since}}">
          <td>
            <h4><a href="{{action.url}}">{% if action.logo %}<img class="logo" src="{{base}}/{{action.logo}}" title="{{ action.label }}" alt="{{ action.label }}" />{% else %}{{ action.label }}{% endif %}</a></h4>
            <img src="{{base}}/images/tag-since-{{action.since}}.svg"> <img src="{{base}}/images/tag-install-{{action.install}}.svg">
          </td>
          <td>{{ action.description | markdownify }}</td>
        </tr>
    {% endfor %}
 </tbody>
</table>
