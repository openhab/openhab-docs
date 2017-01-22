---
layout: documentation
title: Rules
---

{% include base.html %}

# Textual Rules

"Rules" are used for automating processes: Each rule can be triggered, which invokes a script that performs any kinds of tasks, e.g. turn on lights by modifying your items, do mathematical calculations, start timers etcetera.

openHAB has a highly integrated, lightweight but yet powerful rule engine included.
On this page you will learn how to leverage its functionality to do *real* home automation.

{::options toc_levels="2..4"/}

* TOC
{:toc}

## Defining Rules

### File Location

Rules are placed in the folder `${openhab.home}/conf/rules`. The [demo setup]({{base}}/tutorials/demo.html) already comes with a demo file called `demo.rules`, which has a couple of examples that can be a good starting point.

A rule file can contain multiple rules. All rules of a file share a common execution context, i.e. they can access and exchange variables with each other. It therefore makes sense to have different rule files for different use-cases or categories.

### IDE Support

The [Eclipse SmartHome Designer]({{base}}/installation/designer.html) offers support for rules, which includes syntax checks and coloring, validation with error markers, content assist (Ctrl+Space) incl. templates etc. This makes the creation of rules very easy!

> Bug: Please note that there are a couple of [open bugs](https://github.com/eclipse/smarthome/issues?q=is%3Aopen+is%3Aissue+label%3ADesigner+label%3Abug), which result in error markers in the Designer, while the rules are executed nicely by the runtime.

### The Syntax

Note: The rule syntax is based on [Xbase](http://www.eclipse.org/Xtext/#xbase) and as a result it is sharing many details with [Xtend](http://www.eclipse.org/xtend/), which is built on top of Xbase as well. As a result, we will often point to the Xtend documentation for details.

A rule file is a text file with the following structure:

    [Imports]

    [Variable Declarations]

    [Rules]

The ***Imports*** section contains import statement just like in Java. As in Java, they make the imported types available without having to use the fully qualified name for them. For further details, please see the [Xtend documentation for imports](http://www.eclipse.org/xtend/documentation/202_xtend_classes_members.html#imports).

Example:

```java
import java.net.URI
```

A few default imports are already done, so classes from these packages do not need to be explicitly imported:

```java
org.eclipse.smarthome.core.items
org.eclipse.smarthome.core.persistence
org.eclipse.smarthome.core.library.types
org.eclipse.smarthome.core.library.items
org.eclipse.smarthome.model.script.actions
```

The ***Variable Declarations*** section can be used to declare variables that should be accessible to all rules in this file. You can declare variables with or without initial values and modifiable or read-only. For further details, please see the [Xtend documentation for variable declarations](http://www.eclipse.org/xtend/documentation/203_xtend_expressions.html#variable-declaration).

Example:

```java
// a variable with an initial value. Note that the variable type is automatically inferred
var counter = 0

// a read-only value, again the type is automatically inferred
val msg = "This is a message"

// an uninitialized variable where we have to provide the type (as it cannot be inferred from an initial value)
var Number x
```

> Bug: There seem to be [some issues](https://github.com/eclipse/smarthome/issues/1393#issuecomment-223764080) with global variables that still need to be fixed.

The ***Rules*** section contains a list of rules. Each rule has the following syntax:

```java
rule "rule name"
when
    <TRIGGER CONDITION1> or
    <TRIGGER_CONDITION2> or
    <TRIGGER_CONDITION3>
    ...
then
    <SCRIPT_BLOCK>
end
```

A rule can have any number of trigger conditions, but must at least have one.
The _SCRIPT_BLOCK_ contains the code that should be executed, when a trigger condition is met, see the [script](#scripts) section for details on its syntax.

### Rule Triggers

Before a rule starts working, it has to be triggered.

There are different categories of rule triggers:

- **Item**(-Event)-based triggers: They react on events on the openHAB event bus, i.e. commands and status updates for items
- **Time**-based triggers: They react at special times, e.g. at midnight, every hour, etc.
- **System**-based triggers: They react on certain system statuses.

Here are the details for each category:

### Event-based Triggers

You can listen to commands for a specific item, on status updates or on status changes (an update might leave the status unchanged). You can decide whether you want to catch only a specific command/status or any. Here is the syntax for all these cases (parts in square brackets are optional):

```java
Item <item> received command [<command>]
Item <item> received update [<state>]
Item <item> changed [from <state>] [to <state>]
```

> A simplistic explanation of the differences between `command` and `update` (useful if you are new to openHAB) can be found on the [Actions page](https://github.com/openhab/openhab/wiki/Actions#sendcommand-vs-postupdate)

### Time-based Triggers

You can either use some pre-defined expressions for timers or use a [cron expression](http://www.quartz-scheduler.org/documentation/quartz-2.1.x/tutorials/tutorial-lesson-06) instead:

```java
Time is midnight
Time is noon
Time cron "<cron expression>"
```

A cron expression takes the form of six or optionally seven fields:

1. Seconds
1. Minutes
1. Hours
1. Day-of-Month
1. Month
1. Day-of-Week
1. Year (optional field)

for more information see the [Quartz documentation](http://www.quartz-scheduler.org/documentation/quartz-2.1.x/tutorials/tutorial-lesson-06).

You may also use [CronMaker](http://www.cronmaker.com/) to generate cron expressions.

### System-based Triggers

Currently, you schedule rules to be executed either at system startup or shutdown. Note that newly added or modified startup rules are executed once, even if openHAB is already up and running. They are simply executed once as soon as the system is aware of them. Here's the syntax for system triggers:

```java
System started
System shuts down
```

## Scripts

The expression language used within scripts is the same that is used in the Xtend language - see the [documentation of expressions](http://www.eclipse.org/xtend/documentation/203_xtend_expressions.html) on the Xtend homepage.

The syntax is very similar to Java, but has many nice features that allows writing concise code. It is especially powerful in handling collections. What makes it a good match for openHAB from a technical perspective is the fact that there is no need to compile the scripts as they can be interpreted at runtime.

To be able to do something useful with the scripts, openHAB provides access to

- all defined items, so that you can easily access them by their name
- all enumerated states/commands, e.g. `ON, OFF, DOWN, INCREASE` etc.
- all [standard actions](https://github.com/openhab/openhab/wiki/Actions) to make something happen

Combining these features, you can easily write code like

```
    if(Temperature.state < 20) {
    	sendCommand(Heating, ON)
    }
```

### Implicit Variables inside the Execution Block

Besides the implicitly available variables for items and commands/states, rules can have additional pre-defined variables, depending on their triggers:

- Every rule that has at least one command event trigger, will have the variable `receivedCommand` available, which can be used inside the execution block.
- Every rule that has at least one status change event trigger, will have the variable `previousState` available, which can be used inside the execution block.

### Concurrency Guard
If a rule triggers on UI events it may be necessary to guard against concurrency.

```java
import java.util.concurrent.locks.ReentrantLock

var java.util.concurrent.locks.ReentrantLock lock  = new java.util.concurrent.locks.ReentrantLock()

rule ConcurrentCode
when
	Item Dummy received update
then
	lock.lock()
	try {
		// do stuff (e.g. create and start a timer ...)
	} finally{
	   lock.unlock()
	}
end
```

### Logging

You can emit log messages from your rules to aid debugging. There are a number of logging methods available from your rules, the java signatures are:

```java
logDebug(String loggerName, String format, Object... args)
logInfo(String loggerName, String format, Object... args)
logWarn(String loggerName, String format, Object... args)
logError(String loggerName, String format, Object... args)
```

In each case, the `loggerName` parameter is combined with the string `org.eclipse.smarthome.model.script.` to create the log4j logger name. For example, if your rules file contained the following log message:

```java
logDebug("kitchen", "Kitchen light turned on")
```

then the logger you would have to configure to have your messages appearing in the console would be:

```
log:set DEBUG org.eclipse.smarthome.model.script.kitchen
```

## Example

Taking all the information together, an example rule file could look like this:

```java
var Number counter

// setting the counter to some initial value
// we could have done this in the variable declaration already
rule Startup
when
	System started
then
	counter = 0
end

// increase the counter at midnight
rule "Increase counter"
when
	Time cron "0 0 0 * * ?"
then
	counter = counter + 1
end

// tell the number of days either at noon or if a button is pressed
rule "Announce number of days up"
when
	Time is noon or
	Item AnnounceButton received command ON
then
	say("The system is up since " + counter + " days")
end

// sets the counter to the value of a received command
rule "Set the counter"
when
	Item SetCounterItem received command
then
	counter = receivedCommand as DecimalType
end
```

You can find further examples in the [openHAB 1 samples wiki](https://github.com/openhab/openhab/wiki/Samples-Rules).
