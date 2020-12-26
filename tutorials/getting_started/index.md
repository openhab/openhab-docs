---
layout: documentation
title: Getting Started - Introduction
---

{% include base.html %}

# Welcome!

Welcome to openHAB.
We hope that your journey with openHAB is a rewarding one.
If you encounter problems or simply cannot figure something out on your own, please do not hesitate to post a question on [the forum](https://community.openhab.org).
There are many fellow openHAB users ready and willing to help out as much as possible.
Most requests for help usually receive a response within a couple of hours, but please use the search on the forum to check if the topic has already been discussed.

This new user tutorial assumes that you have at least a basic understanding of the [concepts of openHAB](https://www.openhab.org/docs/concepts/), and already have a working installation of openHAB.

## File-based vs. UI-driven Configuration

Early on you must choose between using a textual (file) based configuration, or the easier to use User Interface (UI) method for your setting up and configuration needs.
Switching an entire openHAB from one approach to the other can be very time consuming, so choosing one and sticking with it is highly recomended.
This tutorial is for new users so will only cover the easier UI method, so feel free to skip ahead to the next page if editing files and learning a syntax is something that does not interest you further.

When using the UI method you will notice that most configuration screens will have a "Code" tab.
If you run into problems or want to share something you've created through the UI, click on the "Code" tab and post that YAML to the forum ( [using code fences](https://community.openhab.org/t/how-to-use-code-fences/38383) ) instead of, or in addition to using screen shots.

You can review the reference documentation for details on the text based approach here <https://www.openhab.org/docs/configuration/>.
Whilst it is possible to mix the two, for example use the UI for things and files for items, doing this is not recommended as it increases complexity.

To help you choose between the two approaches, the following is a summary of the pros & cons for each:

### File-based
Pros:
- File based has been the only really practical way to define most objects (things excluded) in previous versions, so a lot of examples in the docs and the forum will assume that approach. However, as time passes there will be more and more UI driven examples.
- With file based configs it is easier to make bulk changes and bulk updates, to duplicate similar objects, and to separate domains into distinct files.
- The config files can be treated as source files, easing backups and version control. Though that does not mean that source control, backups, and version control cannot be done with UI driven configs.
- Files can be synced through any file sync services (e.g. Dropbox, Nextcloud) to the openHAB machine.
- Easier to share configurations between multiple openHAB instances.

Cons:
- Config files are more prone to errors. The slightest typo leads to a syntax error that could cause the file to become invalid, which will result in everything defined in that file being removed from the system until you fix it.
- The syntax for the config files can be a little overwhelming for novice users, as you have to learn and understand the syntax in addition to openHAB concepts and home automation technologies.
- You will see most objects defined in files in the UI but you won't be able to edit them (those objects will have a lock besides their name/label :lock:).
- You need to sit in front of a computer with access to the files to make changes.

### UI-driven
Pros:
- Easier to understand for novices. The UI assists you with built in documents and help. There's fewer opportunities to make mistakes since the syntax is almost impossible to get wrong.
- All objects can be altered from anywhere the UI can be reached (including on mobile).
- Things can be auto-discovered.
- Items can be auto-created from Things (with a chance to edit).
- The internal database is somewhat faster, especially on resource-limited devices (e.g. Raspberry Pis) than the file parsing.
- A backup of the internal database is created on every change.

Cons:
- Can be slower to reach one's goals if you already know what you're doing and if there's a lot of bulk changes or duplicating required.
- Harder to remove obsolete stuff.
- Some things cannot be configured with the UI yet (e.g. persistence).
- You need to sit in front of a device with access to the UI to make changes.

## Table of Contents

This tutorial presents a series of steps that build upon one another so please review the tutorial in order.
There may be concepts or steps that are presented earlier that are required to understand the parts of the tutorial presented later.

[First Steps]({{base}}/tutorial/first_steps.html): Initial configuration

[Adding Things: Simple]({{base}}/tutorial/things_simple.html): Discovering Things

[Adding Things: Intermediate]({{base}}/tutorial/things_intermediate.html): Creating Bridges

[Adding Things: Advanced]({{base}}/tutorial/things_advanced.html): Manual creation of Things

[Items and the Semantic Model]({{base}}/tutorial/model.html): Creating Items and putting them into a semantic model

[Persistence]({{base}}/tutorial/persistence.html): Saving and retrieving historic data

<!--
[Pages: Introduction]({{base}}//tutorial/pages_intro.html): What are Pages?

[Pages: Widgets]({{base}}/tutorial/pages_widgets.html): Introduction to populating Pages

[Pages: Page Types]({{base}}/tutorial/pages_types.html): Layout, Charts, and Tabbed type Pages

[Rules: Simple]({{base}}/tutorial/rules_simple.html): Introduction to rules and a simple example

[Rules: Intermediate]({{base}}/tutorial/rules_intermediate.html): Rules that involve some scripting

[openHAB Cloud]({{base}}/tutorial/cloud.html): Connecting to the free openHAB Cloud Service

[Putting it all Together]({{base}}/tutorial/example.html) Comprehensive Example
-->
