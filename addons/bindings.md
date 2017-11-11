---
layout: documentation
title: Bindings
---

{% include base.html %}

# Bindings

Bindings connect your smart home's devices and technologies to openHAB.

<table id="bindings-select" class="striped">
  <tbody>
    <tr>
      <td width="20%">
        <p>
          <input type="checkbox" class="filled-in" id="oh2-checkbox" checked="checked" />
          <label for="oh2-checkbox"><img src="{{base}}/images/tag-since-2x.svg"></label>
        </p>
      </td>
      <td>
        <p>
        Bindings developed for openHAB 2 use the <a href="https://www.eclipse.org/smarthome/" target="_blank">Eclipse SmartHome</a> APIs.
        They support <a href="{{base}}/concepts/things.html">things and channels</a>, and many support automatic discovery of things.
        These newer bindings can be the easiest to use.
        </p>
      </td>
    </tr>
    <tr>
      <td>
        <p>
          <input type="checkbox" class="filled-in" id="oh1-checkbox" checked="checked" />
          <label for="oh1-checkbox"><img src="{{base}}/images/tag-since-1x.svg"></label>
        </p>
      </td>
      <td>
        <p>
        Most bindings developed for openHAB 1 can also be used in openHAB 2.
        These bindings are connected directly to <a href="{{base}}/concepts/items.html">items</a> by editing text files.  
        </p>
      </td>
    </tr>
    <tr>
      <td>
        <p>
          <input type="checkbox" class="filled-in" id="legacy-checkbox" />
          <label for="legacy-checkbox"><img src="{{base}}/images/tag-install-legacy.svg"></label>
        </p>
      </td>
      <td>
        <p>
        A binding is considered legacy when another binding obsoletes it.
        For many openHAB 1 bindings, there is a new openHAB 2 binding to replace it.
        In order to install legacy bindings, enable "Include Legacy 1.x Bindings" through either the Paper UI or in the file <code>services/addons.cfg</code>.
        </p>
      </td>
    </tr>
    <tr>
      <td>
        <p>
          <input type="checkbox" class="filled-in" id="manual-checkbox" />
          <label for="manual-checkbox"><img src="{{base}}/images/tag-install-manual.svg"></label>
        </p>
      </td>
      <td>
        <p>
        Many openHAB 1 bindings have not yet completed validation for inclusion in the distribution; however, they may indeed work properly under openHAB 2.
        All openHAB 1 addons can be downloaded in a zip file <a href="https://bintray.com/openhab/mvn/download_file?file_path=org%2Fopenhab%2Fdistro%2Fopenhab%2F1.9.0%2Fopenhab-1.9.0-addons.zip">(1.9.0)</a>.
        We need your help testing them so that they may be easily installed in a future distribution.
        Please see the <a href="{{root}}/developers/development/compatibilitylayer.html#how-to-use-openhab-1x-add-ons-that-are-not-part-of-the-distribution">compatibility layer documentation</a> and
        also search the <a href="https://community.openhab.org">openHAB community forum</a> for the latest information and steps for manual installation.
        </p>
      </td>
    </tr>
  </tbody>
</table>

<table id="bindings-overview" class="bordered addon-table">
  <thead>
    <tr>
      <th data-field="label" width="20%">Name</th>
      <th data-field="description">Description</th>
    </tr>
  </thead>
  <tbody>
    {% for binding in site.addons_bindings %}
        <tr class="install-{{binding.install}} since-{{binding.since}}">
          <td>
            <h4><a href="{{base}}{{binding.url}}">{% if binding.logo %}<img class="logo" src="{{base}}/{{binding.logo}}" title="{{ binding.label }}" alt="{{ binding.label }}" />{% else %}{{ binding.label }}{% endif %}</a></h4>
            <img src="{{base}}/images/tag-since-{{binding.since}}.svg"> <img src="{{base}}/images/tag-install-{{binding.install}}.svg">
          </td>
          <td>{{ binding.description | markdownify }}</td>
        </tr>
    {% endfor %}
 </tbody>
</table>
