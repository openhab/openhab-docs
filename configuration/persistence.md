---
layout: documentation
title: Persistence
---

{% include base.html %}

# Persistence

openHAB can store data over time; this is known as persistence.
The data may be retrieved at a later time, for example to restore your system after startup, or to prepare graphs for display on a UI.

openHAB persists Item states in a database, and most popular databases are supported.
You may have more than one persistence add-on loaded, and each of these may be configured independently.

A complete list of supported persistence add-ons may be found in the [persistence]({{base}}/addons/persistence.html) section of the on-line openHAB documentation.

## Add-on Configuration

Please refer to the specific [on-line documentation]({{base}}/addons/persistence.html) for your selected persistence add-on for configuration instructions.

## Default Persistence Service

It is important to select a default persistence service.
You should do this even if you have only one persistence add-on installed.

To select a default persistence service, in paper UI, select Configuration and then System from the side menu.
Scroll down to "Persistence", and select your default service from the drop-down list.
Note that you must first install a persistence add-on before you make this selection.
Be sure to save your choice once you have selected your default service.

## Persistence Configuration

Persistence Strategies are configured in a file named `<persistenceservice>.persist`, stored in `$OPENHAB_CONF/persistence` (Replace "persistenceservice" with the name of your persistence add-on (e.g. `rrd4j.persist`)).

### Persistence Triggers

The persistence of an Item's state may be triggered when that Item changes state or when the Item is updated (even if its state did not change).
Persistence may also be triggered by a time-related event (see Cron Persistence Triggers below).

### Strategies

This section allows you to define one or more `Strategies` that will be applied to `Items` (you specifiy the `Items` in the `Items` section).
This section also defines a default strategy.
The syntax is as follows:

```java
Strategies {
  <strategyName1> : "cronexpression1>"
  <strategyName2> : "cronexpression2"
  ...
  default = everyChange
  ...
}
```

The `default` parameter assigns a strategy to be used if one is not specified in the `Items` section below.
The `default` parameter may be omitted from the `Strategies` section, but only if a strategy is provided in each line of the `Items` section.

#### Predefined Strategies

The following strategies are defined internally and may be used in place of `strategyName` above:

- everyChange: persist the Item state whenever its state has changed
- everyUpdate: persist the Item state whenever its state has been updated, even if it did not change
- restoreOnStartup: load and initialize the last persisted state of the Item on openHAB startup (if the Item state is undefined (`UNDEF`)).  See below.

#### Cron Persistence Triggers
openHAB uses [Quartz](http://www.quartz-scheduler.org/documentation/quartz-2.1.x/quick-start.html) for time-related cron events.
In the `Strategies` syntax example above, "cronexpression" is a Quartz cron-like expression.
See the  [Quartz cron tutorial](http://www.quartz-scheduler.org/documentation/quartz-2.1.x/tutorials/crontrigger) for examples of valid time-related trigger expressions.

### Items

This section defines which items should be persisted with which strategy.
The syntax is as follows:

```java
Items {
    <itemlist1> [-> "<alias1>"] : [strategy = <strategy1>, <strategy2>, ...]
    <itemlist2> [-> "<alias2>"] : [strategy = <strategyX>, <strategyY>, ...]
    ...

}
```

where `<itemlist>` is a comma-separated list consisting of one or more of the following options:

- `*` - this line should apply to all items in the system
- `<itemName>` a single Item identified by its name. This Item can be a group Item.  But note that only the group value will be persisted.  The value of the individual group members will not be persisted using this option.
- `<groupName>*` - all members of this group will be persisted, but not the group itself. If no strategies are provided, the default strategies that are declared in the first section are applied.  Optionally, an alias may be provided if the persistence service requires special names (e.g. a table to be used in a database, a feed id for an IoT service, etc.)

Note: if the `strategy` portion of the `itemlist` is omitted, the `default` strategy specified in the `Strategies` section will be applied.

A valid persistence configuration file might look like this:

```java
// persistence strategies have a name and a definition and are referred to in the "Items" section
Strategies {
        everyHour : "0 0 * * * ?"
        everyDay  : "0 0 0 * * ?"

        // if no strategy is specified for an Item entry below, the default list will be used
       default = everyChange
}

/*
 * Each line in this section defines for which Item(s) which strategy(ies) should be applied.
 * You can list single items, use "*" for all items or "groupitem*" for all members of a group
 * Item (excl. the group Item itself).
 */
Items {
        // persist all items once a day and on every change and restore them from the db at startup
        * : strategy = everyChange, everyDay, restoreOnStartup

        // additionally, persist all temperature and weather values every hour
        Temperature*, Weather* : strategy = everyHour
}
```

## Restoring Item States on restart

When restarting your openHAB installation you may find there are times when your logs indicate some Items have the state, `UNDEF`.
This is because, by default, Item states are not persisted when openHAB restarts - even if you have installed a persistence add-on.
In order for items to be persisted across openHAB restarts, you must define a `restoreOnStartup` strategy for all your items.
Then, whatever state they were in before the restart will be restored automatically.
The following example persists all items on every change and restores them at startup:

```java
Strategies {
  default = everyUpdate
}

Items {
  * : strategy = everyChange, restoreOnStartup
}
```

## Persistence Extensions in Scripts and rules

To make use of persisted states inside scripts and rules, a few useful extensions have been defined on items.
In contrast to an action (which is a function that can be called anywhere in a script or rule), an extension is a function that is only available like a method on a certain type.
This means that the persistence extensions are available like methods on all items.

<!-- TODO: Reword the above section to replace the word "like" with something that is more clear-->

Example:

The statement

`Temperature.historicState(now.minusDays(1))`

will return the state of the Item "Temperature" from 24 hours ago.
You can easily imagine that you can implement very powerful rules using this feature.

Here is the full list of available persistence extensions:

- <item>.persist - Persists the current state


- <item>.lastUpdate - Query for the last update timestamp of a given Item.


- <item>.historicState(AbstractInstant) - Retrieves the historic Item at a certain point in time


- <item>.changedSince(AbstractInstant) - Checks if the state of the Item has (ever) changed since a certain point in time


- <item>.updatedSince(AbstractInstant) - Checks if the state of the Item has been updated since a certain point in time


- <item>.maximumSince(AbstractInstant) - Gets the Item with the maximum value (state) since a certain point in time


- <item>.minimumSince(AbstractInstant) - Gets the Item with the minimum value (state) since a certain point in time


- <item>.averageSince(AbstractInstant) - Gets the average value of the state of a given Item since a certain point in time


- <item>.deltaSince(AbstractInstant) - Gets the difference value of the state of a given Item since a certain point in time


- <item>.previousState() - Retrieves the previous Item (returns HistoricItem)


- <item>.previousState(true) - Retrieves the previous Item, skips items with equal state values and searches the first Item with state not equal the current state (returns HistoricItem)


- <item>.sumSince(AbstractInstant) - Retrieves the sum of the previous states since a certain point in time. (OpenHab 1.8)

These extensions use the default persistence service that is configured as the default persistence service.  (Refer to Default Persistence Service above to configure this.)

Note that you can specify that a different persistence service be used with a particular extension.
Do this by appending a String as an optional additional parameter at the end of the extension (e.g. "rrd4j" or "sense").

<!-- TODO:Add an example of this.  I assume it is as simple as adding .rrd4j to the end of one of these, but this should be verified before being published. -->

### Date and Time extensions

A number of date and time calculations have been made available in openHAB through incorporation of [Jodatime](http://joda-time.sourceforge.net/).
This makes it very easy to perform actions based upon time.
Here are some examples:

```java
Lights.changedSince(now.minusMinutes(2).minusSeconds(30))
Temperature.maximumSince(now.toDateMidnight)
Temperature.minimumSince(parse("2012-01-01"))
PowerMeter.historicState(now.toDateMidnight.withDayOfMonth(1))
```

The "now" variable can be used for relative time expressions, while "parse()" can define absolute dates and times.
See the [Jodatime documentation](http://joda-time.sourceforge.net/api-release/org/joda/time/format/ISODateTimeFormat.html#dateTimeParser()) for information on accepted formats for string parsing.

## Startup Behavior

Persistence services and the rule engine are started in parallel.
Because of this, it is possible that, during an openHAB startup, rules will execute before Item states used by those rules have been restored.
(In this case, those unrestored items have an "undefined" state when the rule is executed.)
Therefore, rules that rely on persisted Item states may not work consistently.

### Workaround 1

A workaround which helps in some cases is to create an Item e.g. "delayed_start" that is set to "OFF" at startup and to "ON" some time later (when it can be assumed that persistence has restored all items.
You then write a rule that restores items from your persistence service after the delay has completed.
The time of the delay must be determined by experimentation.
How long you need to wait before changing your "delayed_start" Item from "OFF" to "ON" depends upon the size of your home automation project and the performance of your platform.

<!-- TODO: Need a code example for Workaround 1. -->

### Workaround 2

Create `$OPENHAB_CONF/rules/refresh.rules` with the following content (This rule runs only once when openHAB starts):

```sh
var boolean reloadOnce = Temperature
rule "Refresh rules after persistence service has started"
  when System started
then
  if(reloadOnce)
    executeCommandLine("$OPENHAB_CONF/rules/rules_refresh.sh")
  else
    println("reloadOnce is false")
  reloadOnce = false
end
```

Create a refresh script `$OPENHAB_CONF/rules_refresh.sh` and make it execuitable (`chmod +x rules_refresh.sh`):

```sh
#This script is called by openHAB after the persistence service has started
sleep 5
cd [full_path_to_openhab_config_directory]/rules
RULES=`find *.rules |grep -v refresh.rules
for f in $RULES
do
  touch $f
done
```

The script waits for five seconds and then touches all `*.rules` files (except `refresh.rules`).
This causes openHAB to reload all rules (openHAB automatically reloads rules when their creation date/time changes).
Other rules files may be added on new lines.
Note - you will have to experiment to find the appropriate sleep value for your specific system.
