---
layout: documentation
title:  - Persistence
---

{% include base.html %}

# Persistence

There are many times in home automation where one wants to keep, chart, and otherwise use the historic states of their Items.
openHAB has the concept of Persistence to achieve this.
With Persistence one can:

- chart a temperature sensor's reading over time (more on this later)
- restore an Item to the state it had prior to openHAB closing down or restarting
- use the state of an Item in the past, or some aggregate of the state of an Item in the past (e.g. average since one hour ago) in automation rules (more on this later).

There are many different databases, some embedded and others running as an external service that are supported for Persistence.
Those that are not embedded require the installation and configuration of a separate database server.

Note that Persistence only saves Item states. 

{::options toc_levels="2..4"/}

- TOC
{:toc}

## Persistence Concepts
As previously mentioned, Persistence saves Item states.
But the question is, when does it save those Item states?
- Every time the Item changes?
- Every time the Item is updates (an update does not necessarily result in the Item changing state)?
- Only when the Item receives a command?
- Every minute whether it's received an event or not?
These are all different *persistence strategies* and they can be combined (e.g. every Item changed and every five minutes.)

One special persistence strategy is `restoreOnStartup` which will update the Item with the most recently saved Item state when openHAB starts up or otherwise refreshes the Item.

The good news here is that if you don't know what you may want to use persistence for, you can just keep the defaults and move to the next step.

## Persistence Configuration
Each persistence add-on comes with it's own default persistence strategy.
See the doc for the specific persistence add-on for what the default strategy is.
This default can be overwritten.
Unfortunately, configuration of the persistence strategies is still text based.
See the [Persistence docs]({{base}}/configuration/persistence.html) for the full documentation and see the installation page for the method you used to install openHAB for a table listing file locations.
At a high level, you will create a file in `$OH_CONF/persistence` with the name of the add-on and a .persist extension (e.g. `influxdb.persist`).
Edit the file per the docs to define the strategies.

Often, one will not want to use the same persistence strategy for all Items. 
One may not even want to save all their Items or may want to save different Items to different databases using different strategies.
For example, a common approach would be to use [`MapDB`]({{base}}/addons/persistence/mapdb/) only for those Items that should be restored on startup, [`rrd4j`]({{base}}/addons/persistence/rrd4j) with an `everyChange` and every minute strategy for number and binary (Switch, Contact) type Items that are to be charted, and [`Influxdb`]({{base}}/addons/persistence/influxdb) with an `everyUpdate` strategy for analysis with external tools.

## Default Persistence
openHAB ships with [`rrdj4`]({{base}}/addons/persistence/rrd4j) as the default persistence database and comes with a default persistence strategy of `everyChange`, `everyMinute`, and `restoreOnStartup` for every supported Item.
The good thing about `rrd4j` is that the database never grows beyond a given size so you never have to clean it up.
However, the way it achieves this (replacing ten readings with the average of the ten readings as the data gets older) makes the database not work for all Item types.
If you need to `restoreOnStartup` unsupported Item types, `MapDB` might be a better choice for you.

## Why Bother with Persitence?
As with the model, the reason why one would set up the Model discussed in the previous tutorial and Persistence is that it will make creating your user interfaces much easier and much more rich.
For example, a set of UI pages will be created automatically in MainUI based on the model.
And just about any place you can interact with an Item in MainUI there will be an "Analyze" button that will generate a chart based on the data saved in persistence.

<!--Next: [Pages - Introduction]({{base}}/tutorials/getting_started/pages_intro.html)-->
Previous: [Semantic Model]({{base}}/tutorials/getting_started/model.html)