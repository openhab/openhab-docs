---
layout: tutorial-beginner
---

{% include base.html %}

# Working with rules and scripts

Now that we have the two items - "Presence_Mobile_John" aka "Johns mobile" and "Wallplug_FF_LR_TV" aka "TV wallplug LR" - we can create a simple rule.
Let's assume we want to turn on the wallplug (and give some juice to the connected TV) as soon as John's mobile comes online, turn it off again when the mobile goes offline (this would be a very basic "presence" rule).

Rules are defined in the conf/rules directory.
So we create the file default.rules there.

```bash
conf/rules/default.rules
```

You can create as many .rules files as you want - this eases the overview of different rules/situations. For example:

- presence.rules for the presence detection
- alarm.rules for your alarm actions
- tv.rules for rules specific for your SmartTV
- and so on

For now, we edit the default.rules

```bash
rule "Wallplug_FF_LR_TV ON"
when
  Item Presence_Mobile_John changed from OFF to ON
then
  Wallplug_FF_LR_TV.sendCommand(ON)
end

rule "Wallplug_FF_LR_TV OFF"
when
  Item Presence_Mobile_John changed from ON to OFF
then
  Wallplug_FF_LR_TV.sendCommand(OFF)
end
```

The rule syntax in this example is very easy:

```bash
rule "rule name (should be unique for logging purposes)"
when
  <TRIGGER CONDITION1> or
  <TRIGGER_CONDITION2> or
  <TRIGGER_CONDITION3>
  ...
then
  <EXECUTION_BLOCK>
end
```

The trigger conditions can be one of the following:

- Item triggers - just like in the example above. If the state of an item changes, do something
- Time triggers - do something at a specified time
- System triggers - do something after a system event happened, i.e. openHAB was started or is shut down

**More information on rules can be found [in the rules section of the user manual!]({{base}}/configuration/rules-dsl.html)**

The execution block in the example only consists of the "sendCommand" command, which sets the state of the named item.

```bash
ItemName.sendCommand(STATE)
```

Once the mobile comes online, the wallplug will turn on, As soon as it goes offline, it will turn off.
Just as simple as that :)

---

**This part has to be completed!**

---

*Guidelines*

*I think this will become the longest section*

*Don't forget to address JSR233 or other alternatives to the DSL that will be built into openHAB*

* *Event driven development*

* *Format and structure of rules*

* *Difference between actions and posting sending things to items*

* *Functions*

* *Group.members manipulation and how it can help simplify your rules*

* *How to figure out what to import*

* *Working with Time*

* *Working with Timers*

* *Casting to appropriate types and when that is necessary*

* *Working with Numbers*

* *Working with States*

* *Lambdas -> in advanced openHAB*

* *...*


---
