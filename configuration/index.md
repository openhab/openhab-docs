---
layout: documentation
title: Configuration
---

{% include base.html %}

# Configuration of your Smart Home

openHAB is the center of your home automation. <!-- Draft -->
Properties and capabilities of all your devices are available through openHAB to the user frontend, the rule engine and other parts and connected systems. <!-- Draft -->

openHAB is a system installed and executed by you, **running independently** from any online services or proprietary technologies. <!-- Draft -->
You as the end-user have the **full control** over every aspect of your smart home. <!-- Draft -->

Every device connected to openHAB is functionally and logically different. <!-- Draft -->
In order to represent all of these, openHAB defines the following few base components with the given meaning:

* [Bindings]({{base}}/addons/bindings.html) - The numerous Add-ons to communicate with your devices <!-- Draft -->
* [Things](things.html) - Your devices represented in openHAB <!-- Draft -->
* [Items](items.html) - properties and capabilities of your Things <!-- Draft -->
* [Groups](items.html#groups) - collections or categories containing Items <!-- Draft -->
* [Sitemaps](sitemaps.html) - User-defined frontend interfaces to arrange Groups, Items and more <!-- Draft -->
* [Transformations](transform.html) - Helper functions to transform your data <!-- Draft -->
* [Persistence](persistence.html) - Services to store data over time <!-- Draft -->
* [Rules](rules-dsl.html) - Automation logic, the heart of your SmartHome! <!-- Draft -->

The individual articles hold all details needed to understand the concepts behind these building bricks for your Smart Home. <!-- Draft -->
For more details on the base concept behind openHAB, please visit the [Concepts Overview page]({{base}}/concepts/index.html). <!-- Draft -->

## Versatility

openHAB provides different user interfaces to modify settings, manage your things and items, build rules and access the sitemap results. <!-- Draft -->
Every interface has it's own strong points. <!-- Draft -->

## Comparison

<table class="centered highlight"> <!-- Draft -->
  <thead>
    <tr> <!-- Draft -->
      <th data-field="task">Task</th>
      <th data-field="files">Textual Configuration</th>
      <th data-field="paperui">Paper UI</th>
      <th data-field="habmin">HABmin</th>
      <th data-field="uis">other UIs</th>
      <th data-field="karaf">Karaf Console</th>
    </tr>
  </thead> <!-- Draft -->

  <tbody>
    <tr> <!-- Draft -->
      <td>Auto-Discover Things and Items</td>
      <td>❌</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>❌</td>
      <td>✔️</td>
    </tr>
    <tr> <!-- Draft -->
      <td>Define Things</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>❌</td>
      <td>✔️</td>
    </tr>
    <tr> <!-- Draft -->
      <td>Define Items</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>❌</td>
      <td>✔️</td>
    </tr>
    <tr> <!-- Draft -->
      <td>Define Groups</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>❌</td>
      <td>✔️</td>
    </tr>
    <tr> <!-- Draft -->
      <td>Define Sitemaps</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>(HABPanel)</td>
      <td>❌</td>
    </tr>
    <tr> <!-- Draft -->
      <td>Access Sitemaps</td>
      <td>❌</td>
      <td>✔️ (limited)</td>
      <td>❌</td>
      <td>✔️</td>
      <td>❌</td>
    </tr>
    <tr> <!-- Draft -->
      <td>Define Transformations</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>❌</td>
      <td>❌</td>
    </tr>
    <tr> <!-- Draft -->
      <td>Define Persistence</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>❌</td>
      <td>❌</td>
    </tr>
    <tr> <!-- Draft -->
      <td>Define Rules</td>
      <td>✔️</td>
      <td>✔️ (Experimental)</td>
      <td>✔️ (Graphical)</td>
      <td>❌</td>
      <td>❌</td>
    </tr>
    <tr> <!-- Draft -->
      <td>Manage Z-Wave Devices</td>
      <td>✔️ (not&nbsp;recommended)</td>
      <td>✔️ (limited)</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
    </tr>
    <tr> <!-- Draft -->
      <td>Modify openHAB Settings</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>✔️</td>
    </tr>
    <tr> <!-- Draft -->
      <td>Install Add-ons</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>✔️</td>
    </tr>
  </tbody> <!-- Draft -->
</table>

{: #text-vs-ui}
## Textual vs. Graphical Configuration

With openHAB 1.x the smart home configuration was done via configuration files only. <!-- Draft -->
One of the most visible additions to openHAB 2 was the adminstrative web interface Paper UI. <!-- Draft -->

Things and Items can either be defined and managed in configuration files or handled by Paper UI in a system-side database. <!-- Draft -->
Both methodes can be used side-by-side or even mixed, e.g. a Thing is discovered by Paper UI and connected Items are defined in a Items configuration file. <!-- Draft -->
