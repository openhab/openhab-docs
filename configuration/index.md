---
layout: documentation
title: Configuration
---

# Configuration of your Smart Home

openHAB is the center of your home automation.
Properties and capabilities of all your devices are available through openHAB to the user interface.

openHAB is a system installed and driven by you, **running independently** of any online services or proprietary technologies.
You as the end-user have the **full control** over every aspect of your smart home, and it'll keep working even when your Internet link goes down.

Every device connected to openHAB is functionally and logically different.
In order to represent all of these, openHAB defines the following base components:

- [Add-ons](addons.html) - The numerous Add-ons to communicate with your devices
- [Things](things.html) - Your devices represented in openHAB
- [Items](items.html) - properties and capabilities of your Things
- [Groups](items.html#groups) - collections or categories containing Items
- [Sitemaps](sitemaps.html) - User-defined frontend interfaces to arrange Groups, Items and more
- [Transformations](transform.html) - Helper functions to transform your data
- [Persistence](persistence.html) - Services to store data over time
- [Rules](rules-dsl.html) - Automation logic, the "smart" in your Smart Home!
- [JSR223 Scripting](jsr223.html) - Define rules and other runtime objects using [Javascript](http://openjdk.java.net/projects/nashorn/), [Jython](http://www.jython.org) or [Groovy](http://www.groovy-lang.org/)

The individual articles have all the details needed to understand the concepts behind these building bricks for your Smart Home.
For more details on the base concept behind openHAB, please visit the [Concepts Overview page](/docs/concepts/index.html).

## Versatility

openHAB 3 now provides a _single_ graphical user interface to modify settings, manage your components and to manage rules and graphical user interfaces for users.

While there's no full scale starter and migration tutorials available yet, see the [recording of the recent 2020 openHAB virtual meetup](https://www.youtube.com/watch?v=pwZ8AOwRDEk) for a tour of the new Main UI (starting at 26:26).

::: tip Important changes for OH2 users<br>
PaperUI and HABmin are no longer supported, they are replaced by the new Main UI.
It also provides flexible charting now so you won't require Grafana or a similar external tool any more.<br>
v1 bindings are no longer available. The expire binding's functionality is now part of the core (item configuration stays the same).<br>
File based configuration is still available, then again we recommend anyone to start over with a fresh setup using the new Main UI only.<br>
_Note there is an option in Main UI to bulk create Things and Items by copy'n'pasting the contents of your .things/.items files._
:::

<table class="centered highlight">
  <thead>
    <tr>
      <th data-field="task">Task</th>
      <th data-field="files">Configuration via text files</th>
      <th data-field="mainui">Main UI</th>
      <th data-field="karaf">Console</th>
      <th data-field="recommendation">Recommendation</th>
    </tr>
  </thead>

  <tbody>
    <tr>
      <td>Auto-Discover Things and Items</td>
      <td>❌</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>Main UI<br/>Do not autocreate Items</td>
    </tr>
    <tr>
      <td>Define and manage Things</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>Main UI</td>
    </tr>
    <tr>
      <td>Define and manage Groups and Items</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>(✔️)</td>
      <td>items/*.items files</td>
    </tr>
    <tr>
      <td>Define GUI</td>
      <td>sitemaps/*.sitemap files</td>
      <td>✔️<br>includes YAML view</td>
      <td>✔️</td>
      <td>Main UI</td>
    </tr>
    <tr>
      <td>Define Transformations</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>transform/*.map *.js files</td>
    </tr>
    <tr>
      <td>Define Persistence</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>persistence/*.persist files</td>
    </tr>
    <tr>
      <td>Define Rules</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>❌</td>
      <td>Main UI<br>use Blockly to create JS code<br>for advanced users:<br>rules/*.rules files for rules DSL and JSR223</td>
    </tr>
    <tr>
      <td>Manage Z-Wave Devices</td>
      <td>❌</td>
      <td>✔️</td>
      <td>❌</td>
      <td>Main UI</td>
    </tr>
    <tr>
      <td>Modify openHAB Settings/Services</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>Paper UI</td>
    </tr>
    <tr>
      <td>Install Add-ons</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>✔️</td>
      <td>Main UI</td>
    </tr>
  </tbody>
</table>

### Textual vs. Graphical Configuration

In openHAB 1.x, smart home configuration was done via configuration files only.
openHAB 2 added the general administrative web interface "Paper UI" and specialized admin UIs such as "habmin" that allow for configuration of the base system and setup of openHAB 2 add-ons.
openHAB 3 now simplifies and streamlines input capabilities.
Things and Items can still be either defined in configuration files but we highly recommend to add them to the [system-side database](/docs/administration/jsondb.html) via Main UI.
_Note there is an option in Main UI to bulk create Things and Items by copy'n'pasting the contents of existing .things/.items files. Bulk delete is there, too.
_Watch out for the Semantic Model in Main UI_.

Both methods can still be used in parallel, e.g. a Thing can be discovered and created in Main UI and the Items that link to that very same Thing (or that Thing's Channels, actually) can be manually defined in a `.items` configuration file. Technically it's even possible to use text and UI config in parallel to maintain components of one type but

::: warning
Do not mix files and UI for Items (or for Things) to avoid confusion and a loss of overview of your openHAB setup.
It would work to mix but you will easily forget about what is your "source of truth" when you add or reconfigure Things or Items at a later stage.
:::

Things/Items configured in files will become visible in Main UI if no Thing/Item of the same name is already present in the system database, but a lock will symbolize that you can NOT change them. You cannot change them other than by editing the source files.
**Note:** Things/Items you create via Main UI will be stored in the system database, but those additions or changes will not be written back into any `.things / .items` file.
Textual configuration is a one-way road. 
Likewise, openHAB settings defined in `services/addons.cfg` and `services/runtime.cfg` will take precedence over any settings made via Main UI.

::: warning Important
All text files must be created with UTF-8 encoding. When using Visual Studio Code, this encoding is already set by default.
:::

## Recommendations for New Users

Here's some hints to avoid major pitfalls.

* Start by modelling your house along the Semantic Model in Main UI.
  Use it to create groups for rooms and apply proper semantic tags right away.
  This will ultimately ease a lot of setup work in the long run as it'll allow for group functions such as "switch off lights in _kitchen" or _ground floor_ or _house_" and
  e.g. enables voice assistants to properly execute your instructions.
  Watch out to apply a consistent naming scheme right in the beginning.
* use Main UI to manage Things and Items
  Remember once initially configured, their configuration is not changing much over time.
* run autodiscovery for _Things_ so you don't have to enter all of them manually
* also use Main UI to manage Items
  You can use the import function to import `.items` files or snippets taken from other sources like e.g. the forum
* Use VS code extensions to [edit rules, items and sitemap files](editors.html).
  You can also use any text editor or cloud based tool, but VS code extensions will work locally and help you by highlighting and cross-checking the file syntax.
  
