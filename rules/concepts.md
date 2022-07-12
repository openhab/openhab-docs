<!---
# Cover generic rules concepts

Pull stuff from the Getting Started Tutorial.

## What Are Rules

## Parts of a Rule

### Triggers

### Conditions

### Script Actions

### Available Values

formerly implicit variables

### Helper Libraries

### Templates
How to find and install.
How to write will be on a later page.

### Comprehensive Examples
-->

# Rules Concepts

Thus far we've connected openHAB to devices through Things, modeled the devices with Items, discussed persistence and how to build the display to control your home.
But all of that amounts to home control, not automation.
To create home automation we need to define rules.

{::options toc_levels="2..4"/}

- TOC
{:toc}

## What Are Rules

You can think of rules as routines or behaviours for your smart home.

Just like you stand up in the morning and have your breakfast, your smart home can have a routine to open the blinds when the sun rises.
Another routine would be to turn all lights off when you leave home: openHAB can do that for you, no need to open your app and switch of the lights manually.
You want to hear your favorite music when you arrive back at home? No problem, openHAB can do that for you.
But rules can also remind you of things: you opened the window hours ago and forgot that is is open? openHAB can sent a notification to your phone.

To summarize in an universal principle: *When __a__ happens, than do __b__*.
For many cases, it can be practical to extend that to *When __a__ happens, than do __b__ but only if __c__*.

To take some examples from above, you can have openHAB to only turn on your favorite music when you arrive at home if it is not your kids bedtime.
You do not want openHAB to open your blinds on the weekend because you want to sleep a little bit longer? No problem, *but only if* helps.

## Parts of a Rule

To work with the *When __a__ happens, than do __b__ (but only if __c__)* principle, openHAB rules consist of three parts:

| Name        | MainUI Section | Purpose                                                                                |
|-------------|----------------|----------------------------------------------------------------------------------------|
| `Trigger`   | When           | The *When __a__ happens* part: It causes the rule run when the defined event happens.    |
| `Action`    | Then           | The *than do __b__* part: What should be done when the rule runs?                      |
| `Condition` | But Only If    | The *but only if __c__* part: Which condition has to be met that the rule really runs? |

The __a__, that causes the rule to run, is an so-called event in openHAB.

::: tip A few words about events
openHAB is an event-driven system.
That means, that everything that happens with Items and Things is an event and some parts of openHAB listen to these events.
When your kitchen light (Item) turns off, this is an event. And when openHAB lost connection to your kitchen's lightbulb (Thing) that is an event too.
The UIs will see the Item event that your kitchen light turned off and update their state accordingly.
And a rule can trigger on the Thing event "lost connection to the lightbulb" and perform an action, e.g. sent a notification to your phone.
:::

Any single rule is not required to have all of these (although a rule without an action is not very sensible).

A rule that should always run when triggered will have 0 conditions.
A rule that should respond to several different events can have multiple different triggers.
Even though it might not seem sensible first, a rule with no trigger (that means it would never run, except manually) can still be useful: you can use it as an reusable action to call from other rules.
These rules are called *Script Actions* in openHAB, more about them later.

