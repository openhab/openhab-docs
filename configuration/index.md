---
layout: documentation
title: Configuration
---

# Configuration of your Smart Home

openHAB is the center of your home automation.
Properties and capabilities of all your devices are available through openHAB to the user interface.

openHAB is a system installed and driven by you, **running independently** of any online services or proprietary technologies.
You as the end-user have **full control** over every aspect of your smart home, and it will keep working even when your Internet link goes down.

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
- [JSR223 Scripting](jsr223.html) - Define rules and other runtime objects using [Javascript](https://openjdk.java.net/projects/nashorn/), [Jython](https://www.jython.org) or [Groovy](https://www.groovy-lang.org/)

The individual articles have all the details needed to understand the concepts behind these building blocks for your Smart Home.
For more details on the basic concepts behind openHAB, please visit the [Concepts Overview page](/docs/concepts/index.html).

## Versatility

openHAB 3 provides a _single_ graphical user interface to modify settings, to manage your components and rules, and to provide a UI for users.

While there are no full-scale starter and migration tutorials available yet, see the [recording of the recent 2020 openHAB virtual meetup](https://www.youtube.com/watch?v=pwZ8AOwRDEk) for a tour of the new Main UI (starting at 26:26).

::: tip Important changes for openHAB 2 users<br>
PaperUI and HABmin are no longer supported, they are replaced by the new Main UI.
It also provides flexible charting now so you won't require Grafana or a similar external tool any more.<br>
v1 bindings are no longer available. The expire binding's functionality is now part of the core (item configuration stays the same).<br>
File-based configuration is still available, but we recommend that everyone start over with a fresh setup built using the new Main UI.<br>
_Note there is an option in Main UI to bulk create Items where you can copy'n'paste the contents of your .items files._
:::

<table class="centered highlight">
  <thead>
    <tr>
      <th data-field="task">Configuration Task</th>
      <th data-field="files">via text files</th>
      <th data-field="mainui">in Main UI</th>
      <th data-field="karaf">openHAB console</th>
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
      <td>sitemaps only</td>
      <td>✔️<br>includes YAML view</td>
      <td>✔️</td>
      <td>Main UI<br>sitemaps/*.sitemap files</td>
    </tr>
    <tr>
      <td>Define Transformations</td>
      <td>✔️</td>
      <td>❌</td>
      <td>❌</td>
      <td>transform/*.map*.js files</td>
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
      <td>Main UI<br>for starters: Blockly<br>(graphically create JS code)<br>for advanced users:<br>rules/*.rules files<br>for rules DSL and JSR223</td>
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
      <td>Main UI</td>
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
openHAB 2 added the general administrative web interface "Paper UI", and openHAB 3 now further streamlines input capabilities with "Main UI".
Things and Items can still be defined either in configuration files or via the GUI.
We highly recommend adding them to the [system database](/docs/administration/jsondb.html) via Main UI, though.
Note there is an option in Main UI to bulk create Items by copy and pasting the contents of existing .items files.
Bulk delete is there, too.
_Be sure to try out Semantic Modeling in Main UI_.

Both methods can still be used in parallel, e.g. a Thing can be discovered and created in Main UI and the Items that link to that very same Thing (or that Thing's Channels, actually) can be manually defined in a `.items` configuration file.
Technically speaking it's even possible to use text and UI config in parallel to maintain components of one type, however this is not recommended.

::: warning
Do not mix file and UI definitions for Items (or for Things) to avoid confusion.
It would work to mix these, but you can easily forget which is your "source of truth" when you add or reconfigure Things or Items at a later stage.
:::

Things/Items configured in files will become visible in Main UI if no Thing/Item of the same name is already present in the system database, but a lock will symbolize that you can NOT change them in the GUI. You can only change them by editing the source files.
**Note:** Things/Items you create via Main UI will be stored in the system database, but those additions or changes will not be written back into any `.things / .items` file.
Textual configuration is a one-way street.
Likewise, openHAB settings defined in `services/addons.cfg` and `services/runtime.cfg` will take precedence over any settings made via Main UI.

::: warning Important
All text files must be created with UTF-8 encoding. When using Visual Studio Code, this encoding is already set by default.
:::

## Recommendations for New Users

Here are some hints to avoid some common pitfalls when starting out.

- Start by modelling your house using a Semantic Model in Main UI.
  Use it to create groups for rooms and apply proper semantic tags right away.
  This will ultimately save a lot of setup work, as it will allow for group functions such as "switch off lights in _kitchen_" or _ground floor_ or _house_" and
  also enable voice assistants to properly execute your instructions.
  Be careful to apply a consistent naming scheme right in the beginning.
- Use Main UI to manage Things. Remember that once initially configured, their configuration will not change much over time.
- Run autodiscovery for _Things_ wherever offered so that you don't have to enter all of them manually
- Also use Main UI to manage Items.
  You can use the import function to import `.items` files or snippets taken from other sources like the openHAB community forum.
- Use VS code extensions to [edit rules, items and sitemap files](editors.html).
  You can also use any text editor or cloud based tool, but VS code extensions will work locally and help you by highlighting and cross-checking the file syntax.
