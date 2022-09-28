# Rules Concepts

openHAB is about home automation, but to create home automation we need to define rules.

{::options toc_levels="2..4"/}

- TOC
{:toc}

## What Are Rules

You can think of rules as routines or behaviours for your smart home.

Many people have a routine when they wake up in the morning: make the bed, make coffee, make and eat breakfast, brush their teeth, etc.
Similarly your smart home can have a routine: when the sun rises raise the blinds and adjust the temperature.
Another routine could be to turn off all the lights and turn down the temperature when you leave home:
openHAB can do that for you.
There is no need to open your app and switch of the lights manually.
Do you want to hear your favorite music when you arrive back at home?
No problem, openHAB can do that for you too.
Rules can also remind you of things, for example, that you opened the window hours ago and forgot that it is open?
openHAB can send a notification to your phone.

Most users coming from commercial smart home systems will know the concept of "Scenes".
These *Scenes*, which are for example supported in Apple's HomeKit or Philips Hue, allow us users to set the state of multiple devices with a single action.
In openHAB, there is nothing called "Scenes", but you can easily use rules to build the scenes functionality.

## Parts of a Rule

These rules take the high level form of *When __t__ happens, if __c__ then do __a__*,
where __t__ are the _triggers_ that cause the rule run,
__c__ are the _conditions_ that must be true for the rule to run, and __a__ are _actions_ to perform when the rule is triggered and allowed to run.
Note that both __t__ and __c__ can be optional.

To work with the *When __t__ happens, if __c__ then do __a__* principle, openHAB rules consist of three parts:

| Name        | Rule Part            | Purpose                                                  |
|-------------|----------------------|----------------------------------------------------------|
| `Trigger`   | *When __t__ happens* | Causes the rule run when the defined event happens.      |
| `Condition` | *if __c__*           | Which condition has to be met that the rule really runs? |
| `Action`    | *then do __a__*      | What should be done when the rule runs?                  |

Any single rule is not required to have all of these (although a rule without an action is not very sensible).
An individual rule can also have more than one of each.

A rule that should always run when triggered will have zero conditions.
An individual rule can respond to several different triggers by having multiple different triggers set up.

Even though it might not seem sensible first, as the rule would never run on it's own, one can also have a rule with no triggers.
But why would somebody want such a rule?
In some cases, it is useful to have a rule that is only manually triggered.
Sometimes there is advantage in a rule that calls another rule.
In both cases, the rule has no triggers and no conditions.

## Triggers

Now that we know the concept of rule triggers, let's look at them in more depth.
Triggers define those events that, when they occur, causes the rule to run.

These are the categories of rules that can be used to trigger a rule:

| Event       | Description                                                                                                                  |
|-------------|------------------------------------------------------------------------------------------------------------------------------|
| **Items**   | Commands, updates, and changes on an individual Item's state.                                                                |
| **Groups**  | Groups are special Items that have other Items as members. Rules can be triggered on any Item event from any of its members. |
| **Time**    | Rules can trigger based on specific times.                                                                                   |
| **Channel** | Some Things have Channels that can trigger rules directly instead of being linked to Items.                                  |
| **Thing**   | When Things change or update status they generate events (e.g. ONLINE, OFFLINE, etc.).                                       |
| **System**  | Events that occur during important activities internal to openHAB itself, such as startup complete.                          |

::: tip Triggers and Events - What's the difference?
An event is something that happens and is detectable by openHAB.
Some events for rules are time events, system events, Item state and command events, etc.

A few examples of events that could be used to trigger a rule:
- The time is midnight.
- openHAB reached a runlevel 80 indicating Things are initialized.
- The `Bedroom_Light` Item changed from OFF to ON.
- A member of the `Lights` Group received a command.
- Sunrise occurred based on an event Channel on an Astro Thing.
- The Zwave controller Thing changed to OFFLINE.

A Trigger is like a filter that, when it matches one or more events, causes the rule to run.
Triggers can therefore be very specific to match very specific events (e.g. a change in a Switch Item from `ON` to `OFF`, a Dimmer Item receives `57` as a command, etc.)
or relatively generic and match many events (e.g. every minute, a Color Item receives any type of command, a member of a Group Item changes in any way, etc.).
:::
  
Here are the details for each trigger type:

### **Items** Triggers

You can listen to commands for a specific Item, on state updates or on state changes (an update might leave the state unchanged).
You can decide whether you want to catch only a specific command/state or any.

The `command` event means a `command`, which controls an Item (e.g. turns the light on) was sent.
The `update` event means the Item's state got updated (e.g. the light turned to `ON`).

**Items** triggers provide some information, e.g. the received command or the received state update, see [Available Values](#available-values).

When using a `received command` trigger, the rule might trigger **before** the Item's state is updated.
Therefore, if the rule needs to know what the command was, there is an [Available Value](#available-values).

### **Groups** Triggers

As with Item based event-based triggers discussed above, you can listen for commands, state updates, or state changes on the direct members (but not the indirect members of a nested subgroup) of a given Group.
You can also decide whether you want to catch only a specific command/state or any.

The [Available Values](#available-values) are populated using the event on the Item that caused the trigger and that triggering Item's name is provided as an additional value.

Also, as with **Items** triggers, when using a `received command` trigger, the rule might trigger **before** the Item's state is updated.
Therefore, if the rule needs to know what the command was, there is an [Available Value](#available-values).

### **Time** Triggers

Time Triggers are provided as described in the table below, support may vary on the used rule language:

| Trigger          | Description                                                                                                                   |
|------------------|-------------------------------------------------------------------------------------------------------------------------------|
| cron expressions | cron allows you to create nearly any schedule you can think of, e.g. every second sunday in November and December at 04:05 h. |
| Time is Item     | It is a date and a time specified in an DateTime Item.                                                                        |
| Time of Day      | It is a fixed time of the day, e.g. 09:00 h.                                                                                  |

Time triggers do not provide any information in the [Available Values](#available-values).

Please be aware that openHAB is using the [Quartz Scheduler](https://www.quartz-scheduler.org/documentation/quartz-2.2.2/), which is using a slighly different form than the Unix cron scheduler, for [cron expressions](https://www.quartz-scheduler.org/documentation/quartz-2.2.2/tutorials/tutorial-lesson-06.html).
A Quartz cron expression takes the form of six or optionally seven fields:

1. Seconds
2. Minutes
3. Hours
4. Day of Month
5. Month
6. Day of Week
7. Year (optional field)

You may use the generator at [FreeFormatter.com](https://www.freeformatter.com/cron-expression-generator-quartz.html) or the openHAB WebUI rule setup to generate your cron expressions.

### **Channel** Triggers

Some add-ons provide trigger channels.

Your rules can take actions based upon trigger events generated by these trigger channels.
You can decide whether you want to catch only a specific or any trigger the channel provides.

When a binding provides such channels, you can find the needed information in the corresponding binding documentation.
There is no generic list of possible trigger events.
The `triggerEvent`(s) available depend upon the specific implementation details of the binding.

If the rule needs to know what the received event or the triggering channel was, use the [Available Values](#available-values).

### **Thing** Triggers

Your rules can take actions based upon status updates or status changes generated by Things.
You can decide whether you want to catch only a specific or any status the Thing can get updated too.

You can find all the possible values for status from [Thing Status](/docs/concepts/things.html).

The `thingUID` is the identifier assigned to the Thing, manually in your configuration or automatically during auto discovery.
You can find it from UI or from `.things` files.
For example, one z-wave device can be "zwave:device:c5155aa4:node14".

If the rule needs to know what the triggering Thing was, or access the previous or new status, use the [Available Values](#available-values).

<!-- TODO: Update reference when actions are included in the reworked rule docs. -->
Refer to [Thing Status Action](/docs/configuration/actions.html#thing-status-action) to find how to get the new thing status details or description in the script.

### **System** Triggers

The **System** triggers include the system start level trigger.

You may wish to use some start level to initialize values at startup if they are not already set.
You can then execute a rule on the next startup level which depends on the value set by the initialization rule.

| Start level | Meaning                                                                                                        |
|-------------|----------------------------------------------------------------------------------------------------------------|
| 00          | OSGi framework has been started.                                                                               |
| 10          | OSGi application start level has been reached, i.e. bundles are activated.                                     |
| 20          | Model entities (Items, Things, channel links, persist config) have been loaded, both from DB as well as files. |
| 30          | Item states have been restored from persistence service, where applicable.                                     |
| 40          | Rules are loaded and parsed, both from DB as well as DSL and script files.                                     |
| 50          | Rule engine is active.                                                                                         |
| 70          | User interface is up and running.                                                                              |
| 80          | All Things have been initialized.                                                                              |
| 100         | Startup is fully complete.                                                                                     |

Start levels less than 40 are not available as triggers because the rule engine needs to start up first before it can execute any rules.
Please keep in mind that rule engines provided by separately installed automation add-ons might not start executing rules until after start level 100 is reached.

## Conditions

With triggers, we have the *When __t__ happens* part completed, so next up is the *if __c__* part.
This part can limit when a rule can run by adding one or more condition(s).

Conditions as a separately definable part of a rule are supported by some rule engines.
In situations where the rule engine does not support conditions, you can implement your conditions using an `if`-statement in the rule action.

Available types of conditions include:
- An Item has a given state
- It’s a certain time of day
- It’s a certain day of week
- It’s a special day, e.g. holiday, weekday, weekend, etc. as defined by Ephemeris <!-- TODO: Add reference to Ephemeris docs which currently reside in the Actions page --> 
- Script condition: A script evaluates to `true`

The script condition is the most universal one, as you can choose one of the many available script/rule languages to build any condition you can think of.
The only restriction is a script condition's last executed line of code must result in a boolean (i.e. `true` or `false`).

## Scripts

Unfortunately the term "Script" is overloaded in openHAB, and has multiple meanings based on the context:

- A UI rule consisting only of a single Script Action with the tag "Script".
  This can be used to reuse code and logic across multiple rules.
- In text based rules, a script is a file that is processed by a script engine, e.g. [JS Scripting](/addons/automation/jsscripting/).
  Those scripts can be used to create (multiple) rules, or those are loaded by other script files a libraries.
- A script file that is executed on the command line with a script engine, e.g. `bash`, by using `executeCommandLine`.
- A special piece of Rules DSL code in the `$OH_CONF/scripts` folder that is called from other rules using `callScript`.

The rule docs mainly refer to the first two meanings when talking about scripts.

## Script Actions

Script Actions are a special type of action only available in UI rules.

These allow you to run scripts written in one of the available automation/rule languages, e.g. JavaScript, Rules DSL, and Python.

## Available Values

When a rule is triggered, several information about the event that triggered the rule is provided to the rule.
There are many cases in which it is useful to know what triggered your rule, e.g. you have an Item group as trigger and you need to know which Group member triggered the rule.

The availablity of those values depends on the rule engine, but you can generally expect at least the following information (depending on the trigger):

- The name of triggering Item.
- The command that the triggering Item received.
- The state the Item got updated by.

For further information which values are available and how to access them, refer to the documentation of the according rule engine.

## Rule Templates

At some point, when basic UI rules are not be sophisticated enough to reach your goal, rule templates can help.
Someone may have already written the rule and provides it as a template at the community marketplace.

To access the rule templates, visit the web UI and navigate: *Settings* -> *Add-Ons* -> *Automation* -> Scroll down to the *Rule Templates* section.
Click on a rule template to review it's documentation, open the community thread and install the template to your system.
Check the template's documentation for dependencies and install them!
Otherwise the rule won't work.

To instantiate a rule template, navigate to Rules and click the blue `+` icon.
Fill out the rule's metadata as usual and select a installed rule template from the *Create from Template* section.
Choose the rule template, and fill out the template configuration.

Once a rule is created, it is seperated from it's templated and can be modified individually.
To update rule from the template, you have to recreate the rule.

If you want to create your own rule templates, visit the [Marketplace](https://community.openhab.org/c/marketplace/rule-templates/74) at the community forum.

## Helper Libraries

Helper Libraries simplify the interaction with the openHAB runtime by providing convenient access to common functionality, and provide type conversion from Java types to native types of the chosen rule/script language.
By providing this functionality, they help avoiding type errors and heavily reduce the amount of boilerplate code required to import openHAB classes.

There are official helper libraries developed and maintained by the openHAB developers as well as community developed helper libraries.
Some rule engines have no helper libraries at all.

If there is an official helper library, it will be mentioned and used in the documentation of the rule engine, e.g. [JS Scripting](/addons/automation/jsscripting) with the [openhab-js](https://github.com/openhab/openhab-js) library.
For unofficial helper libraries, you may search in the [community forum](https://community.openhab.org/search) for helper libraries for your rule language.
An example for an unofficial helper library are [Ivan's helper libraries for Jython (community forum)](https://community.openhab.org/t/ivan-s-helper-libraries-oh3-python-javascript/116458).

## Comprehensive Examples

<!--
Use tabs and show most of the popular languages
Use tabs and show most of the popular languages

How to create a scene using a rule?
-->
