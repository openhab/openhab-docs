---
layout: documentation
title: Persistence Services
---

{% include base.html %}

# Persistence Services

Persistence services enable the storage of item states over time.

<table id="persistence-select" class="striped">
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
        Some openHAB 1 persistence services have not yet completed validation for inclusion in the distribution; however, they may indeed work properly under openHAB 2.
        All openHAB 1 add-ons can be downloaded in a <a href="https://bintray.com/openhab/mvn/download_file?file_path=org%2Fopenhab%2Fdistro%2Fopenhab%2F1.9.0%2Fopenhab-1.9.0-addons.zip">zip file</a>.  
        We need your help testing them so that they may be easily installed in a future distribution.
        Please see the <a href="{{base}}/developers/development/compatibilitylayer.html#how-to-use-openhab-1x-add-ons-that-are-not-part-of-the-distribution">compatibility layer documentation</a> and
        also search the <a href="https://community.openhab.org">openHAB community forum</a> for the latest information and steps for manual installation.
        </p>
      </td>
    </tr>
  </tbody>
</table>

<table id="persistence-overview" class="bordered addon-table">
  <thead>
    <tr>
      <th data-field="label" width="20%">Name</th>
      <th data-field="description">Description</th>
    </tr>
  </thead>
  <tbody>
    {% for persistence in site.addons_persistences %}
        <tr class="install-{{persistence.install}} since-{{persistence.since}}">
          <td>
            <h4><a href="{{base}}{{persistence.url}}">{% if persistence.logo %}<img class="logo" src="{{base}}/{{persistence.logo}}" title="{{ persistence.label }}" alt="{{ persistence.label }}" />{% else %}{{ persistence.label }}{% endif %}</a></h4>
            <img src="{{base}}/images/tag-since-{{persistence.since}}.svg"> <img src="{{base}}/images/tag-install-{{persistence.install}}.svg">
          </td>
          <td>{{ persistence.description | markdownify }}</td>
        </tr>
    {% endfor %}
 </tbody>
</table>
