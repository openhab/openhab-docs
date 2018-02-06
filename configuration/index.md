---
layout: documentation
title: Configuration
---

{% include base.html %}

# Configuration of your Smart Home

openHAB is the center of your home automation.
Properties and capabilities of all your devices are available through openHAB to the user frontend, the rule engine and other parts and connected systems.

openHAB is a system installed and executed by you, **running independently** from any online services or proprietary technologies.
You as the end-user have the **full control** over every aspect of your smart home.

Every device connected to openHAB is functionally and logically different.
In order to represent all of these, openHAB defines the following few base components:

- [Bindings]({{base}}/addons/bindings.html) - The numerous Add-ons to communicate with your devices
- [Things](things.html) - Your devices represented in openHAB
- [Items](items.html) - properties and capabilities of your Things
- [Groups](items.html#groups) - collections or categories containing Items
- [Sitemaps](sitemaps.html) - User-defined frontend interfaces to arrange Groups, Items and more
- [Transformations](transform.html) - Helper functions to transform your data
- [Persistence](persistence.html) - Services to store data over time
- [Rules](rules-dsl.html) - Automation logic, the "smart" in your Smart Home!
- [JSR223 Scripting](jsr223.html) - Define rules and other runtime objects using [Javascript](http://openjdk.java.net/projects/nashorn/), [Jython](http://www.jython.org) or [Groovy](http://www.groovy-lang.org/).

The individual articles hold all details needed to understand the concepts behind these building bricks for your Smart Home.
For more details on the base concept behind openHAB, please visit the [Concepts Overview page]({{base}}/concepts/index.html).

## Versatility

openHAB provides different user interfaces to modify settings, manage your things and items, build rules and access the sitemap results.
Every interface has it's own strong points.

### Comparison

<table class="centered highlight">
  <thead>
    <tr>
      <th data-field="task">Task</th>
      <th data-field="files">Textual Configuration</th>
      <th data-field="paperui">Paper UI</th>
      <th data-field="habmin">HABmin</th>
      <th data-field="karaf">Console</th>
    </tr>
  </thead>

  <tbody>
    <tr>
      <td>Auto-Discover Things and Items</td>
      <td>❌</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
    </tr>
    <tr>
      <td>Define Things</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
    </tr>
    <tr>
      <td>Define Items</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
    </tr>
    <tr>
      <td>Define Groups</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
    </tr>
    <tr>
      <td>Define Sitemaps</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>❌</td>
    </tr>
    <tr>
      <td>Define Transformations</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>❌</td>
    </tr>
    <tr>
      <td>Define Persistence</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>❌</td>
    </tr>
    <tr>
      <td>Define Rules</td>
      <td>✔️</td>
      <td>✔️<br />(Experimental)</td>
      <td>✔️<br />(Graphical)</td>
      <td>❌</td>
    </tr>
    <tr>
      <td>Manage Z-Wave Devices</td>
      <td>✔️<br />(Not&nbsp;Recommended)</td>
      <td>✔️<br />(Limited)</td>
      <td>✔️</td>
      <td>❌</td>
    </tr>
    <tr>
      <td>Modify openHAB Settings</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
    </tr>
    <tr>
      <td>Install Add-ons</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>❌</td>
      <td>✔️</td>
    </tr>
  </tbody>
</table>

{: #text-vs-ui}
### Textual vs. Graphical Configuration

With openHAB 1.x the smart home configuration was done via configuration files only.
One of the most visible additions to openHAB 2 is the administrative web interface Paper UI.

Things and Items can either be defined and managed in configuration files or handled by Paper UI in a [system-side database]({{base}}/administration/jsondb.html).

Both methods can be used **side-by-side or even mixed**, e.g. a Thing is discovered by Paper UI and linked Items are defined in a `.items` configuration file.

Configuration done in files will be synced to the database but configuration done in the database will not be written to files.
