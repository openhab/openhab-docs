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

Now that we know what rules are, we need to have something to make them run when something happens.
This is when we need triggers.

There are different categories of rule triggers:

| Trigger type      | Description                                                            |
|-------------------|------------------------------------------------------------------------|
| **Item**-based    | Those react on commands or state updates for the Item                  |
| **Group**-based   | Those react on commands or state updates for member Items of the Group |
| **Time**-based    | Those react at special times, e.g. at midnight, every hour, etc.       |
| **Channel**-based | Those react on trigger channels provided by some add-ons               |
| **Thing**-based   | Those react on thing status, e.g. change from `ONLINE` to `OFFLINE`    |
| **System**-based  | Those react on certain system statuses, e.g. startup completed         |

::: tip Triggers and Events - What's the difference?
You might have heard or will hear about events and triggers, and wonder about the difference.

An event is something that happens and is detectable by openHAB.
The most important events for rules are time events (e.g. midnight), system events (e.g. startup completed), Item state events and Item command events.
There are some more events, but it's not necessary to mention them here.

In contrast to this, a trigger identifies one of those events and makes the rule run.
:::

Here are the details for each trigger type:

### **Item**-based Triggers

You can listen to commands for a specific item, on status updates or on status changes (an update might leave the status unchanged).
You can decide whether you want to catch only a specific command/status or any.

A simplistic explanation of the differences between `command` and `update` can be found in the article about [openHAB core actions](/docs/configuration/actions.html#event-bus-actions).

**Item**-based triggers provide some information, e.g. the received command or the received state update, see [Available Values](#available-values).

When using a `received command` trigger, the rule might trigger **before** the Item's state is updated.
Therefore, if the rule needs to know what the command was, there is an [Available Value](#available-values).

### **Group**-based Triggers

As with Item based event-based triggers discussed above, you can listen for commands, status updates, or status changes on the direct (but not the indirect members of a nested subgroup) members of a given Group.
You can also decide whether you want to catch only a specific command/status or any.

The [Available Values](#available-values) are populated using the Item that caused the Group trigger to fire and that Item's name is stored in an additional value.

Also, as with **Item**-based triggers, when using a `received command` trigger, the rule might trigger **before** the Item's state is updated.
Therefore, if the rule needs to know what the command was, there is an [Available Value](#available-values).

### **Time**-based Triggers

Dependening on the rule language/engine, there are some predefined expressions you can use, but universally supported are only [cron expressions](https://www.quartz-scheduler.org/documentation/quartz-2.2.2/tutorials/tutorial-lesson-06.html).

Please be aware that openHAB is using the [Quartz Scheduler](https://www.quartz-scheduler.org/documentation/quartz-2.2.2/), which is using a slighly different form than the Unix cron scheduler.

**Time**-based triggers do not provide any information in the [Available Values](#available-values).

A Quartz cron expression takes the form of six or optionally seven fields:

1. Seconds
2. Minutes
3. Hours
4. Day of Month
5. Month
6. Day of Week
7. Year (optional field)

You may use the generator at [FreeFormatter.com](https://www.freeformatter.com/cron-expression-generator-quartz.html) or the openHAB WebUI rule setup to generate your cron expressions.

### **Channel**-based Triggers

Some add-ons provide trigger channels.
Compared with other types of channels, a trigger channel provides information about discrete events, but does not provide continuous state information.

Your rules can take actions based upon trigger events generated by these trigger channels.
You can decide whether you want to catch only a specific or any trigger the channel provides.

When a binding provides such channels, you can find the needed information in the corresponding binding documentation.
There is no generic list of possible trigger events.
The `triggerEvent`(s) available depend upon the specific implementation details of the binding.

If the rule needs to know what the received event or the triggering channel was, use the [Available Values](#available-values).

### **Thing**-based Triggers

Your rules can take actions based upon status updates or status changes generated by Things.
You can decide whether you want to catch only a specific or any status the Thing can get updated too.

You can find all the possible values for status from [Thing Status](/docs/concepts/things.html).

The `thingUID` is the identifier assigned to the Thing, manually in your configuration or automatically during auto discovery.
You can find it from UI or from `.things` files.
For example, one z-wave device can be "zwave:device:c5155aa4:node14".

If the rule needs to know what the triggering Thing was, or access the previous or new status, use the [Available Values](#available-values).

<!-- TODO: Update reference when actions are included in the reworked rule docs. -->
Refer to [Thing Status Action](/docs/configuration/actions.html#thing-status-action) to find how to get the new thing status details or description in the script.

### **System**-based Triggers

System-based triggers are provided as described in the table below:

| Trigger                            | Description                                                                                                                                                                                                                                          |
|------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| System started                     | `System started` is triggered upon openHAB startup. In openHAB version 2, `System started` is also triggered after the rule file containing the System started trigger is modified, or after item(s) are modified in a .items file.                  |
| System reached start level <level> | `System reached start level <level>` is triggered when openHAB reaches a specific start level. A list of possible start levels is available below. Please note that only levels 40 and higher are useful as the rule engine needs to be ready first. |

You may wish to use the 'System started' trigger to initialize values at startup if they are not already set.
You can then execute a rule on the next startup level which depends on the value set by the initialization rule.

In openHAB version 3 the System-based Trigger for startlevel had been added, values depends on the startlevel:

```text
00 - OSGi framework has been started.
10 - OSGi application start level has been reached, i.e. bundles are activated.
20 - Model entities (items, things, links, persist config) have been loaded, both from db as well as files.
30 - Item states have been restored from persistence service, where applicable.
40 - Rules are loaded and parsed, both from db as well as dsl and script files.
50 - Rule engine has executed all "system started" rules and is active.
70 - User interface is up and running.
80 - All things have been initialized.
100 - Startup is fully complete.
```

Startlevels less than 40 are not available as triggers because the rule engine needs to start up first before it can execute any rules.
Please keep in mind that the rule engines of automation add-ons like JS Scripting can start up after startlevel 100 has been reached.
