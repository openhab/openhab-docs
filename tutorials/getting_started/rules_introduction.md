---
layout: documentation
title:  Rules - Introduction
---

# Introduction to Rules

Thus far we've connected OH to devices through Things, modeled the devices with Items, discussed persistence and how to build the display to control your home.
But all of that amounts to home control, not automation.
To create home automation we need to define behaviors.
In openHAB behaviors are defined using rules.
Almost anything you can think of can be done as long as you have a relevant event to kick it off and access to the data needed to decide what to do.

[[toc]]

## Event Driven

openHAB is an event driven system.
What that means is an event happens and parts of openHAB that watch for that event can react.
Persistence will see an Item change event and save that new state to the database.
The UIs will watch for that same Item change event and update the UI widgets as necessary.
And some rules will _trigger_ when that Item change event occurs to create some behavior.

For example, the behavior we want is to turn on a light (represented by the Item `Light`) when motion is detected (represented by the Item `Motion`).
To create this behavior we could create a rule that triggers on the event of the `Motion` Item receiving the command `ON` that sends the command `ON` to the `Light` Item.

This is a very simple example though.
What if you want to keep the light on until 5 minutes after the last motion was detected, but only between the hours of 16:00 and 23:00 on weekdays or when no one is home?
Rules can do that too.

## Parts of a Rule

A rule consists of three parts.

| Name        | MainUI Section | Purpose                                                                             |
|-------------|----------------|-------------------------------------------------------------------------------------|
| `Trigger`   | When           | List of the events that cause the rule to run.                                      |
| `Condition` | But Only If    | Conditions which must be true before the rule is allowed to run even when triggered |
| `Action`    | Then           | Actions to take when the rule runs.                                                 |

Any single rule is not required to have all of these (although a rule without an action is not very sensible) and in many cases multiple instances may be required.
A rule that should always run when triggered will have 0 conditions.
A rule that should respond to several different types of events can have multiple different triggers.
A rule that is only ever called by another rule or run manually can have 0 triggers.

### Triggers

Rule triggers are always evaluated with an `OR`.
If there are two triggers listed, read that as "if x occurs or if y occurs".
The following table is a list of the most common events that can be used to trigger a rule.
Triggers of different types can be used on the same rule.
The following table is not an exhaustive list of potential triggers.

| Event                           | Category | Purpose                                                                                                                     |
|---------------------------------|----------|-----------------------------------------------------------------------------------------------------------------------------|
| was updated                     | Item     | triggers the rule when an Item received an update, does not necessarily mean it changed state                               |
| was changed                     | Item     | triggers the rule when an Item changed state after an update                                                                |
| received command                | Item     | triggers the rule when an Item is commanded; a command does not by itself imply that the Item received an update or changed |
| a member was updated            | Group    | triggers the rule when any member of the Group is updated                                                                   |
| a member changed                | Group    | triggers the rule when any member of the Group changes state                                                                |
| a member received command       | Group    | triggers the rule when any member of the Group receives a command                                                           |
| a trigger channel fired         | Thing    | triggers the rule when a trigger type Channel on a Thing generates an event                                                 |
| status was updated              | Thing    | when a Thing's status is updated, does not necessarily mean it changed                                                      |
| status changed                  | Thing    | when a Thing's status changed (e.g. went OFFLINE)                                                                           |
| on a schedule                   | Time     | uses a cron expression to generate a periodic trigger for the rule (e.g. every five minutes)                                |
| at a fixed time of day          | Time     | selects a specific time of day to trigger the rule                                                                          |
| the system is being initialized | System   | when openHAB is first starting up and reaches a given runlevel                                                              |

In addition to these events which are configured on the rule, a rule can be called from another rule and a rule can be run manually.

Almost all of the time, an Item or a Time based trigger will be used by most users.
System triggers are useful to do some sort of initialization step when openHAB is starting.

### Conditions

Conditions are primarily a concept in UI rules though some rules languages support them in files too.
These are a list of comparisons that each must evaluate to true for the actions to be run.
For example, if a given rule should only run when no one is home, a condition can check the Item that represents the home/away state so it only runs when everyone is away.
There are four categories of conditions.

| Condition           | Type        | Purpose                                                                                                                                                                    |
|---------------------|-------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Item Condition      | Item states | tests to see if an Item's state meets a comparison (e.g. == ON, <= 65 °F, etc.)                                                                                            |
| Time Condition      | Time        | a selection of the days of the week and a time period when the rule can run                                                                                                |
| Ephemeris Condition | Ephemeris   | openHAB has a subsystem that tracks types of day (e.g. weekends, weekdays) and local holidays; this condition allows one to specify what types of days it's allowed to run |
| Script Condition    | Script      | code whose last line evaluates to true of false.                                                                                                                           |

When a rule is triggered from another rule, there is an option to allow or ignore the called rule's conditions.
When run manually, the conditions are ignored.

### Actions

If triggers define when the rule runs and conditions define what must be true for the rule to run, the actions define the rule's behaviors.
There are four categories of Actions.

| Action          | Purpose                                                 |
|-----------------|---------------------------------------------------------|
| Item Action     | to command or update an Item                            |
| Other Rules     | to cause another rule to run                            |
| Audio and Voice | to cause TTS or an audio file to play on an audio sink  |
| Script Action   | to execute some code written in a supported rule action |

### A Note on Rule Languages

There is a growing list of options of ways for users to create rules and many of them will have two flavors: UI and file based.
This tutorial will not discuss file based rules.
See the docs for the chosen language for details on how to write rules in files for that language.

openHAB comes with three languages by default (Rules DSL, ECMAScript 5.1, and Blockly) and has a number of add-ons to add more.
For this tutorial we will be using [Blockly](/docs/configuration/blockly/) and the [JavaScript Scripting](/addons/automation/jsscripting/) add-on.
But most of the concepts presented can be applied to the other languages too.

## What's the Difference Between a Rule, Script, a Scene and Schedule?

This is a tricky question because there is nothing very significantly different between the four, except the Scenes.
All are rules.

| Type                                       | What's Unique                                                                                                                                      | Purpose                                                                                                                                                                                                                                                                                                                                   |
|--------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ![Rule](images/wand_stars.png) Rule        |                                                                                                                                                    | This is any unit of automation which can contain zero or more of triggers, actions and, conditions                                                                                                                                                                                                                                        |
| ![Script](images/doc_plaintext.png) Script | Rule consisting of a single Script Action and has the tag "Script", there are no triggers so they must be run manually or called from another rule | A great place to store examples when you figure something out and want to remember how you did it later. Can include reusable code called from other rules (though there are often better choices). Very useful for adhoc and pseudo-unit testing of your rules. Despite being a rule, Scripts do not appear in the Rules page of MainUI. |
| ![Scenes](images/scenes.png) Scene         | A special type of rule that allows to send multiple item actions at the same time                                                                  | This page is a good place to see when your rules are scheduled to run. However, note that it only shows statically timed rules.                                                                                                                                                                                                           |
| ![Schedule](images/calendar.png) Schedule  | any rule with a time based trigger and the tag "Schedule"                                                                                          | This page is a good place to see when your rules are scheduled to run. However, note that it only shows statically timed rules.                                                                                                                                                                                                           |

Important note on the term "Script".
Unfortunately this term is overloaded in openHAB and has multiple meanings based on the context.

- a UI rule consisting of a single Script Action with the tag "Script"

- a special piece of Rules DSL code placed in the `$OH_CONF/scripts` folder that can be called from other rules using the `callScript` action (note that `callScript` cannot call UI Scripts)

- a file consisting of code that is read and interpreted by a script engine, such as Bash or Python; usually called from a command line in OH using the `executeCommandLine` action or the `Exec` binding; these are not related to Rules DSL scripts and should not be placed in the `$OH_CONF/scripts` folder

- in text based rules, a script is a file that creates one or more rules; as opposed to a module which is a library that might be used by a script or other modules.
