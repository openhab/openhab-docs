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

openHAB is about home automation, but to create home automation we need to define rules.

{::options toc_levels="2..4"/}

- TOC
{:toc}

## What Are Rules

You can think of rules as routines or behaviours for your smart home.

Just like you stand up in the morning and have your breakfast, your smart home can have a routine to open the blinds when the sun rises.
Another routine would be to turn all lights off when you leave home:
openHAB can do that for you, no need to open your app and switch of the lights manually.
You want to hear your favorite music when you arrive back at home?
No problem, openHAB can do that for you.
But rules can also remind you of things: you opened the window hours ago and forgot that is is open?
openHAB can sent a notification to your phone.

These rules take the high level form of *When __t__ happens, if __c__ then do __a__*,
where __t__ are the triggers that cause the rule run,
__c__ are the conditions that must be true for the rule to run and __a__ are actions to perform when the rule is triggered and allowed to run.
Note that both __t__ and __c__ can be optional.

## Parts of a Rule

To work with the *When __t__ happens, if __c__ then do __a__* principle, openHAB rules consist of three parts:

| Letter | Name        | MainUI Section | Purpose                                                                                |
|--------|-------------|----------------|----------------------------------------------------------------------------------------|
| __t__  | `Trigger`   | When           | The *When __t__ happens* part: It causes the rule run when the defined event happens.  |
| __c__  | `Condition` | But Only If    | The *if __c__* part: Which condition has to be met that the rule really runs?          |
| __a__  | `Action`    | Then           | The *then do __a__* part: What should be done when the rule runs?                      |

Any single rule is not required to have all of these (although a rule without an action is not very sensible).
Any single run can also have any number of each.

A rule that should always run when triggered will have 0 conditions.
A rule that should respond to several different triggers can have multiple different triggers set up.

Even though it might not seem sensible first as the rule would never run on it's own, it is also possible to have a rule with no triggers.
But why would somebody want such a rule?
In some cases, it is useful to have a rule that is manually triggered.
In other cases, it is useful to have a rule that is called by another rule.
In both cases, the rule has no triggers and no conditions.
This reusable rule is called a *Script Action* in openHAB.
