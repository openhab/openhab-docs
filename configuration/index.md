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

- [Add-ons](addons.html) - The numerous Add-ons to communicate with your devices
- [Things](things.html) - Your devices represented in openHAB
- [Items](items.html) - properties and capabilities of your Things
- [Groups](items.html#groups) - collections or categories containing Items
- [Sitemaps](sitemaps.html) - User-defined frontend interfaces to arrange Groups, Items and more
- [Transformations](transform.html) - Helper functions to transform your data
- [Persistence](persistence.html) - Services to store data over time
- [Rules](rules-dsl.html) - Automation logic, the "smart" in your Smart Home!
- [JSR223 Scripting](jsr223.html) - Define rules and other runtime objects using [Javascript](http://openjdk.java.net/projects/nashorn/), [Jython](http://www.jython.org) or [Groovy](http://www.groovy-lang.org/)

The individual articles hold all details needed to understand the concepts behind these building bricks for your Smart Home.
For more details on the base concept behind openHAB, please visit the [Concepts Overview page]({{base}}/concepts/index.html).

## Versatility

openHAB provides different user interfaces to modify settings, manage your things and items, build rules and access the sitemap results.
HABmin provides a set of features to now overlap with Paper UI (which came later).
Every interface still has its own strong points.
The following table shows what the user interfaces can be used for.
For a recommendation to new users which one(s) to use, see the section below. "*" means recommended.

### Comparison

<table class="centered highlight">
  <thead>
    <tr>
      <th data-field="task">Task</th>
      <th data-field="files">Textual Configuration</th>
      <th data-field="paperui">Paper UI</th>
      <th data-field="habmin">HABmin</th>
      <th data-field="karaf">Console</th>
      <th data-field="recommendation">Recommendation</th>
    </tr>
  </thead>

  <tbody>
    <tr>
      <td>Auto-Discover Things and Items</td>
      <td>❌</td>
      <td>✔️*</td>
      <td>✔️*</td>
      <td>✔️</td>
      <td>Paper UI or HABmin<br/>Do not autocreate Items</td>
    </tr>
    <tr>
      <td>Manage Things</td>
      <td>(✔️)<br/>(not for all bindings)</td>
      <td>✔️*</td>
      <td>✔️*</td>
      <td>✔️</td>
      <td>Paper UI or HABmin</td>
    </tr>
    <tr>
      <td>Define Items</td>
      <td>✔️*</td>
      <td>✔️</td>
      <td>❌</td>
      <td>✔️</td>
      <td>items/*.items files</td>
    </tr>
    <tr>
      <td>Define Groups</td>
      <td>✔️*</td>
      <td>✔️</td>
      <td>❌</td>
      <td>✔️</td>
      <td>items/*.items files</td>
    </tr>
    <tr>
      <td>Define Sitemaps</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>❌</td>
      <td>sitemaps/*.sitemap files</td>
    </tr>
    <tr>
      <td>Define Transformations</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>❌</td>
      <td>transform/*.map files</td>
    </tr>
    <tr>
      <td>Define Persistence</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>❌</td>
      <td>persistence/*.persist files</td>
    </tr>
    <tr>
      <td>Define Rules</td>
      <td>✔️*</td>
      <td>(❌)<br/>(only for the experimental rules engine)</td>
      <td>(❌)<br/>(not functional)</td>
      <td>❌</td>
      <td>rules/*.rules files</td>
    </tr>
    <tr>
      <td>Manage Z-Wave Devices<br/>(see&nbsp;recommendation)</td>
      <td>❌</td>
      <td>✔️</td>
      <td>✔️*</td>
      <td>❌</td>
      <td>HABmin</td>
    </tr>
    <tr>
      <td>Modify openHAB Settings/Services</td>
      <td>✔️</td>
      <td>✔️*</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>Paper UI</td>
    </tr>
    <tr>
      <td>Install Add-ons</td>
      <td>✔️</td>
      <td>✔️*</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>Paper UI</td>
    </tr>
  </tbody>
</table>

### Textual vs. Graphical Configuration

In openHAB 1.x, smart home configuration was done via configuration files only.
openHAB 2 added the administrative web interface "Paper UI".
It allows for configuration of the base system and setup of openHAB 2 add-ons.
Please be aware that not every addon/binding of openHAB version 1.x has been updated to version 2 and thus to work with Paper UI.
You can still run these but you need to use file configuration for them.

Things and Items can either be defined and managed in configuration files or handled by Paper UI in a [system-side database](administration/jsondb.html).
For Things and Items, both methods can be used **side-by-side**, e.g. a Thing can be discovered and created by Paper UI and the Items that link to that very same Thing (that Thing's Channels, actually) can be manually defined in a `.items` configuration file. 
Configuration done in files will be used (and they become visible and even changeable in Paper UI) if no Thing/Item of the same name already exists in, but you can NOT create a Thing or Item using files and then use Paper UI to redefine or change it. Those changes will not be accepted.
Configuration done in PaperUI will be used and permanently stored in the internal database if no Thing/Item of the same name already exists in files, but those additions or changes will not be copied into any `.things` file.
openHAB settings as defined in `services/addons.cfg` and `services/runtime.cfg` will override any settings made in PaperUI's Configuration/System pane.

## Recommendations for New Users

All interface options are supposed to work, still some of the more advanced settings might work better in one or the other setup.
You have the full freedom of choice. On the other hand, this can be very confusing at times, particularly for new users.
To help starters in narrowing down choices, here is some guidance that might also help to avoid some future pitfalls:

* Use Paper UI to setup and maintain the openHAB base system. Use it to define _which_ addons and bindings you want to install and to assign _basic, static_ configuration (such as the device name of a ZWave stick or the IP address of a KNX gateway).
* Use Paper UI to manage configuration of each and every openHAB 2 add-on and binding.
* Use file configuration to manage configuration of openHAB 1 add-ons and bindings.
* Use Paper UI or habmin to manage ZWave things, but use configuration files to manage ZWave items.<br/>
  There is a rationale to this: to use a GUI is comfortable for one-time actions, but you get any repetitive task easier and faster done using a text editor (e.g. search-and-replace names and parameters).
  _Things_ can be autodiscovered so you don't have to enter all of them manually. Once initially configured, their configuration is not changing much over time.
  On the other hand, you will keep changing _items_ rather often.
  If you are new to openHAB, you will e.g. keep changing all of your item names as you keep learning what is a naming scheme you like best to work with in your rules. And once you are a pro, you will want to keep using files anyway.  
  You can configure items via Paper UI, too, and you can use HABmin as well for both but remember once you use files, this will override any UI-made changes on next openHAB startup.
* Use the editor of your choice to edit [sitemaps]({{base}}/configuration/sitemaps.html). Start with the demo sitemap as a template.
* Use VS code extensions to [edit rules, items and sitemap files.]({{base}}/configuration/editors.html).
  You can also use any text editor, but VS code extensions will help you by highlighting and cross-checking the file syntax.
  Either way, be aware that any 'save' results in openHAB reloading the rules file.
  This can take more than a minute on a slow box such as a Raspberry Pi, so better to not edit rules files in place.
