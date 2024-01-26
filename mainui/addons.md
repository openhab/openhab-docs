---
layout: documentation
title: Add-on Store
---

# Add-on Store

<!-- START MAINUI SIDEBAR DOC - DO NOT REMOVE -->
**Add-ons** extend openHAB's functionality.

The Add-on Store allows you to install and remove many different types of add-ons:

- **Bindings**<br>
  Connect and control hardware and online services.
- **Automation**
  - **Scripting Languages** like JavaScript and JRuby.
  - **Technologies** like PID Controller, PWM (pulse width modulation).
  - **Rule Templates** shared by the community to bootstrap your automation.
  - [**Blockly**]({{base}}/configuration/blockly/) libraries that contain custom blocks written by the community.
- **UI**<br>
  Pre-made UI widgets and other available UIs that work with openHAB.
- **Other**<br>
  Full IoT ecosystem integration, data persistence services, transformations services, and voice and speech.
<!-- END MAINUI SIDEBAR DOC - DO NOT REMOVE -->

Clicking on the individual add-on title reveals more information about the add-on:

- A general overview what it is about.
- By clicking "more" the whole documentation is provided for the add-on.
- An information section that provides:
  - Source (openHAB Distribution or Community Marketplace)
  - Provided by (the author of the add-on)
  - Type of add-on (binding, automation...)
  - Content type (Karaf, Template, UI Widget...)
  - Created and Update date
  - A link to the related community forum entry or GitHub issues

Note that there is a tab bar at the bottom that allows you to switch between the different pages:

![addons-toolbar](images/addons-toolbar.png)

[[toc]]

## Bindings

Bindings are used to connect and control hardware and online services.
This section provides both official bindings from the **openHAB Distribution**, which have been thoroughly reviewed by the maintainers of openHAB, as well as bindings independently released by the community on the **Community Marketplace**.
If you want to know more about the marketplace, please read the following [Marketplace announcement](https://community.openhab.org/t/announcing-the-community-marketplace/127188).

To learn more how to install add-ons read the [Add-ons tutorial]({{base}}/configuration/addons).

## Automation

Automation provides technologies that allow you to write rules and scripts.

- **Languages & Technologies**<br>
  openHAB comes with two languages by default: Rules DSL and Blockly (which requires a JavaScript Scripting automation add-on to be installed) while this section allows to install more languages and technologies.
  To know more about them click on the respective tile.

- **Rule templates** provide you with solutions already written for certain usecases.<br>
  Rule templates can be used when you have a common use case for a rule and for instance need to bootstrap several of them, or share with others how to solve that use case in a configurable manner.
  These will appear in Main UI when you create a new rule, and will present you with the configuration parameters - after the rule is created, the pre-configured rule modules (triggers, conditions, actions) will appear based on your choices.

- **Block Libraries**: Community extensions to the [Blockly]({{base}}/configuration/blockly/) toolbox.<br>
  These libraries extend the core blockly library with many useful blocks that might else be a bit too specific for the core block library or just fills the gap where a core block is still missing.
  When installed they appear in a separate section beneath the core blocks of the blockly editor.

## User Interfaces

Community widgets & alternative frontends

- **Widgets for Main UI**: Extend your pages with these community-designed widgets.<br>
  After adding a widget it can be used when creating UI page.
  You can the press the "+" on a cell and a popup appears with two section: _Standard Library_, which contains the standard openHAB widgets and Personal Widgets, which contain UI widgets installed from the marketplace.
  They can also be found for further adapting (or analyzing) the widget under "Developer Tools ->  Widgets".
- **Other UI Add-ons**: Alternative user interfaces and icon sets.

## Other Add-ons

- **System integrations**: Integrate openHAB with external systems:
  - openHAB Cloud Connector
  - Homekit Integration
  - openHAB Metric Service, an additional REST endpoint to retrieve openHAB core metrics from,
  - and others...

- **Persistence**: Backend connectors to store historical data like:
  - RRD
  - InfluxDB
  - MongoDB
  - MapDB
  - Several JDBC Connectors and
  - JPA Persistence

- **Transformation Add-ons**: Extensions for a particular transformation like:
  - JSONPath
  - RegEx
  - Map
  - Binary To JSON
  - Exec (executes an external program and returns the output as a string)
  - Jinja
  - Scale (the Scale transformation service is an easy to handle tool that can help you with the discretization of number inputs)
  - Xpath
  - XSLT
  - Multi / long press transformation profile for rocker switch

- **Voice & Speech**: Convert between text and speech, interpret human language queries:
  - Google Cloud Text-to-Speech
  - Amazon Polly
  - VoiceRSS Text-to-Speech
  - and many more

## Search

Search for any of the above add-ons and then directly install it from here.
