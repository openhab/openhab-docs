---
layout: documentation
title: System Integrations
---

{% include base.html %}

# System Integrations

openHAB supports services that enable integration with various technologies that don't fall into other add-on categories.

Most of the systems mentioned below are integrated via a *Misc* add-on, installed e.g. through Paper UI.
Detailed instructions and requirements may be found in the corresponding documentation pages.

<!-- selection not needed for now table id="ios-select" class="striped">
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
        Some openHAB 1 service modules have not yet completed validation for inclusion in the distribution; however, they may indeed work properly under openHAB 2.  
        All openHAB 1 addons can be downloaded in a <a href="https://bintray.com/openhab/mvn/download_file?file_path=org%2Fopenhab%2Fdistro%2Fopenhab%2F1.9.0%2Fopenhab-1.9.0-addons.zip">zip file</a>.
        We need your help testing them so that they may be easily installed in a future distribution.
        Please see the <a href="{{base}}/developers/development/compatibilitylayer.html#how-to-use-openhab-1x-add-ons-that-are-not-part-of-the-distribution">compatibility layer documentation</a> and
        also search the <a href="https://community.openhab.org">openHAB community forum</a> for the latest information and steps for manual installation.
        </p>
      </td>
    </tr>
  </tbody>
</table -->

<table id="ios-overview" class="bordered addon-table">
  <thead>
    <tr>
      <th data-field="label" width="20%">Name</th>
      <th data-field="description">Description</th>
    </tr>
  </thead>
  <tbody>
    {% for io in site.addons_ios %}
    <!-- <tr class="install-{{io.install}} since-{{io.since}}"> -->
    <tr>
      <td>
        <h4><a href="{{base}}{{io.url}}">{% if io.logo %}<img class="logo" src="{{base}}/{{io.logo}}" title="{{ io.label }}" alt="{{ io.label }}" />{% else %}{{ io.label }}{% endif %}</a></h4>
        <img src="{{base}}/images/tag-install-{{io.install}}.svg">
      </td>
      <td>{{ io.description | markdownify }}</td>
    </tr>
    {% endfor %}
    <tr>
      <td>
        <h4><a href="{{base}}/configuration/restdocs.html">REST API</a></h4>
      </td>
      <td>
        <p>
        The REST API can be used to integrate openHAB with other systems, as it allows read access to items and item states, as well as status updates or the sending of commands for items.
        It gives access to sitemaps, so that it is the interface to be used by remote user interfaces (e.g. fat clients or JavaScript-based web clients).
        The REST API also supports server-push, so you can subscribe on change notification for certain resources.
        </p>
      </td>
    </tr>
    <tr>
      <td>
        <h4><a href="{{base}}/configuration/eclipseiotmarket.html"><img class="logo" src="{{base}}/images/addons/eclipseiotmarketplace.png" title="Eclipse IoT Marketplace" alt="Eclipse IoT Marketplace" /></a></h4>
      </td>
      <td>
        <p>
        The <a href="https://marketplace.eclipse.org/taxonomy/term/4988%2C4396/title">Eclipse IoT Marketplace</a> hosts third-party add-ons that can be browsed and installed to openHAB through this integration.
        </p>
      </td>
    </tr>
    <tr>
      <td>
        <h4><a href="http://www.myopenhab.org/" target="_blank"><img class="logo" src="{{base}}/images/addons/ifttt.png" title="IFTTT" alt="IFTTT" /></a></h4>
      </td>
      <td>
        <p>
        Activating <a href="https://ifttt.com" target="_blank">IFTTT</a> integration is easy.
        Just log in to your IFTTT account and activate the openHAB channel.
        You will be forwarded to the <a href="http://www.myopenhab.org/" target="_blank">myopenHAB website</a> to authorize the IFTTT channel connection.
        Before you start creating IFTTT recipes you need to make sure that you have your runtime configured to expose certain items to myopenHAB.
        Only those items will be visible to IFTTT.
        You will also be able to send commands to those items from IFTTT Applets.
        Items will appear in myopenHAB and thus in IFTTT only after at least one state update has been received by myopenHAB from your runtime.
        </p>
      </td>
    </tr>
 </tbody>
</table>
