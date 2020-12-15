---
layout: documentation
title: Getting Started - Introduction
---

{% include base.html %}

# Welcome!

Welcome to openHAB 3! 
We hope that your journey with openHAB is a rewarding one. 
If you encounter problems or simply cannot figure something out on your own, please do not hesitate to post a question on [the forum](https://community.openhab.org). 
There are many fellow openHAB users ready and willing to help as much as possible. 
Most requests for help have a response within a couple of hours.

First, a word on the order of the sections in the docs. 
This tutorial assumes users have read the concepts and installation guide already. 
Thus it assumes at least a basic knowledge of the concepts of openHAB. 
The tutorial also assumes that the user has already installed openHAB and confirmed it is working.

## File-based vs. UI-driven Configuration

Early on the user must choose between a text file based configuration or a User Interface driven configuration.
Switching from one approach to the other is not trivial to change later on.

To help you choose between the two approaches the following is a summary of the pros & cons for each:

### File-based
Pros:
- File based has been the only really practical way to define most objects (things excluded) in previous versions so a lot of examples in the docs and the forum will assume that approach. However, as time passes there will be more and more UI driven examples.
- File based configs are easier to make bulk changes, bulk updates, duplicate similar objects or separate domains into distinct files.
- The config files can be treated as source files easing backups, version control. Though that does not mean that source control, backups, and version control cannot be done with UI driven configs.
- Files can be synced through any file sync services (e.g. Dropbox, Nextcloud) to the openHAB machine.
- Easier to share configurations between multiple openHAB instances.

Cons:
- Config files are more prone to errors. The slightest typo leads to a syntax error that could cause the file to become invalid which will result in everything defined in that file removed from the system until you fix it.
- The syntax for the config files can be a little overwhelming for novice users, as you have to learn and understand the syntax in addition to openHAB concepts and home automation technologies.
- You will see most objects defined in files in the UI but you won't be able to edit them (those objects will have a lock besides their name/label :lock:).
- You need to sit in front of a computer with access to the files to make changes.

### UI-driven
Pros:
- Easier to understand for novices. The UI assists you with built in documents and help. There's fewer opportunities to make mistakes since the syntax is almost impossible to get wrong.
- All objects can be altered from anywhere the UI can be reached (including on mobile).
- Things can be auto-discovered.
- Items can be auto-created from Things (with a chance to edit).
- The internal database is somewhat faster especially on resource-limited devices (e.g. Raspberry Pis) than the file parsing.
- A backup of the internal database is created on every change.

Cons:
- Can be slower to reach one's goals if you already know what you're doing, if there's a lot of changing or duplicating involved etc.
- Harder to remove obsolete stuff.
- Some things cannot be configured with the UI yet (e.g. persistence).
- You need to sit in front of a computer with access to the UI to make changes.

It's possible to mix the two, for example use the UI for things and files for items, but avoid using both techniques at the same time in other cases. 
This tutorial targets new users.
Therefore the tutorial will present a purely UI-driven approach.
Review the reference documentation for details on the text based approach.

When building a configuration through the UI, one still has access to a text based YAML formatted representation of their configs.
On most of the configuration screens there will be two tabs, a "Design" tab anda  "Code" tab.
If you run into problems or want to share something you've created through the UI, click on the "Code" tab and post that YAML to the forum using code fences instead of or in addition to screen shots. 

## Table of Contents

This tutorial presents a series of steps that build upon one another so please review the tutorial in order. 
There may be concepts or steps that are presented earlier that are required to understand the parts of the tutorial presented later.

[First Steps]({{base}}/tutorials/getting_started/first_steps.html): Initial configuration

[Adding Things: Simple]({{base}}/tutorials/getting_started/things_simple.html): Discovering Things

[Adding Things: Intermediate]({{base}}/tutorials/getting_started/things_intermediate.html): Creating Bridges

[Adding Things: Advanced]({{base}}/tutorials/getting_started/things_advanced.html): Manual creation of Things

[Items and the Semantic Model]({{base}}/tutorials/getting_started/model.html): Creating Items and putting them into a semantic model

[Persistence]({{base}}/tutorials/getting_started/persistence.html): Saving and retrieving historic data

<!--
[Pages: Introduction]({{base}}//tutorials/getting_started/pages_intro.html): What are Pages?

[Pages: Widgets]({{base}}/tutorials/getting_started/pages_widgets.html): Introduction to populating Pages

[Pages: Page Types]({{base}}/tutorials/getting_started/pages_types.html): Layout, Charts, and Tabbed type Pages

[Rules: Simple]({{base}}/tutorials/getting_started/rules_simple.html): Introduction to rules and a simple example

[Rules: Intermediate]({{base}}/tutorials/getting_started/rules_intermediate.html): Rules that involve some scripting

[openHAB Cloud]({{base}}/tutorials/getting_started/cloud.html): Connecting to the free openHAB Cloud Service

[Putting it all Together]({{base}}/tutorials/getting_started/example.html) Comprehensive Example
-->

Next: [Let's get started with First Steps]({{base}}/tutorials/getting_started/first_steps.html)