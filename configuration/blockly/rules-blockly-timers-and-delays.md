---
layout: documentation
title: Rules Blockly - Timers & Delays
---
<!-- markdownlint-disable MD036 -->

# Timers & Delays

[return to Blockly Reference](index.html#timers-and-delays)

Timers and Delays are a little more complex but add important functionality to rules.
Whilst the "Wait-For"-block is straightforward, the timer blocks should be well understood before being used - they may behave differently than expected.
This chapter explains what these blocks do, sometimes displaying generated code to explain what is happening behind the scenes.

More about that topic can be viewed at ![youtube](../images/blockly/youtube-logo-small.png) [Timers](https://youtu.be/hSRfooBKn9A?t=630).

[[toc]]

## Overview of the Timers and Delays category

![timers-and-delays](../images/blockly/blockly-timers-overview.png)

## Timer Naming and Scope

Timers are created and referred to by name, enabling manipulation within a rule.

A timer is by default created within the scope of that particular rule which is called  a "private" timer.
When the timer is created as a shared timer it can also be accessed under this name from a different rule.

![timer-scope](../images/blockly/blockly-timer-shared.png)

This example starts a timer in Rule 1

![timer-shared](../images/blockly/blockly-timer-example-shared-1.png)

and cancels the same timer in Rule 2

![timer-shared-cancel](../images/blockly/blockly-timer-shared-cancel.png)

## Timer context

Timers provide a statement block where the blocks reside that are run when the timer triggers.
The context allows data to be provided which is later used when the blocks are triggered by the timer (note that in many cases you can just leave the context empty or provide an [undefined block](rules-blockly-standard-ext.md#logic)).

To provide a context put any block to the context input, which can be a block of any type like String, Number, a variable or even a Dictionary which could hold several values via a key/value mapping.

The context can be used within the timer statement block by utilizing the "timer context" block:

![blockly-timer-context.png](../images/blockly/blockly-timer-context.png)

Here are some examples how this feature can be used:

![timer-context-examples](../images/blockly/blockly-timer-context-examples.png)

The loop is in particular interesting to look at:

- The loop counts from 1 to 10 (actually to 9).
- It therefore creates 5 timers where the first is triggered after 1 seconds, the second after 3 seconds and so on.
- Each timer's name is based on that counter index, i.e. the first timer's name is LoopCreatedTimer1 and the last timer is named LoopCreatedTimer9.
- The timer name is then provided to the timer block itself via the context which could then be used in various ways (here it just prints it out).

In case you don't like the context input part be empty you can add the undefined- or null-block that can be found in the [logic section](rules-blockly-standard-ext.md#logic) to the timer:

![timer-context-undefined](../images/blockly/blockly-timer-context-undefined.png)

## Timer Blocks

### Wait for

![waitfor](../images/blockly/blockly-waitfor.png)

_Function:_ Suspends execution of the rule for a given period of time

- unit of time (ms) is milliseconds (1000 ms = 1 second)

_Example_

The following simple example uses a loop to implement a blinking light with a 1 second delay, looping three times:

![waitfor-example](../images/blockly/blockly-waitfor-example.png)

More about that topic can be viewed at ![youtube](../images/blockly/youtube-logo-small.png) [Waiting in Rules](https://youtu.be/EdllUlJ7p6k?t=1600)

### After _period of time_ Do With Timer

![blockly-afterperiodtimer](../images/blockly/blockly-afterperiod-timer.png)

_Function:_ Schedule a task to be performed once after a specific amount of time has elapsed.

- A number and unit (seconds, minutes up to months) can be chosen after which the commands within the block will be executed
- Provide the name of the timer, allowing further access to that timer within the same rule. The name also ensures the timer is unique within the rule.

_Example_

10 seconds after the rule has been called, the timer triggers all lights to go off:

![afterperiodtimer-example](../images/blockly/blockly-afterperiod-timer-example.png)

### Reschedule Timer

_Function:_  Sometimes one may want to use the same timer and reschedule the same block of code again. This can be achieved with the reschedule-block

![reschedule-timer](../images/blockly/blockly-reschedule-timer.png)

An example is as follows:

- The code within the timer-block will run after 5 seconds.
- The last part in the block reschedules the same timer-block for 5 seconds later.
- And so on, in an endless loop.

![reschedule-timer-example1](../images/blockly/blockly-reschedule-timer-example1.png)

Setting up an endless timer in the above way is not recommended. The example shown below will stop rescheduling after 3 doorbell rings.

![reschedule-timer-example2](../images/blockly/blockly-reschedule-timer-example2.png)

### After _period of time_ Do With Timer with options on retriggering rule

![afterperiod-timer-options](../images/blockly/blockly-afterperiod-timer-options.png)

_Function:_ Schedule a task to be performed at a specified period in the future with the ability to reschedule, cancel or ignore the timer **when the rule is retriggered**.

Before using that block, it is important to understand what the idea behind the option of retriggering:
Though it may not seem to be obvious, the same rule can be retriggered at any time. To allow more control about what is happening in this case the rule is executed again, the following options are available:

**Options on Retrigger**

- _reschedule_: If the same rule that contains this Blockly script is re-triggered, and this specific timer is currently active, this specific timer will be rescheduled (i.e. restart the countdown timer).
- _cancel_: If the same rule that contains this Blockly script is re-triggered, and this specific timer is currently active, this specific timer will be cancelled. The code within the timer will not be executed.
- _do nothing_: If the same rule that contains this Blockly script is re-triggered, nothing happens - this will make the block identical to the simple timer-block in function, but the generated code is slightly modified - see below.

![afterperiod-timer-options-block](../images/blockly/blockly-afterperiod-timer-options-block.png)

**Generated code**

The following code example and the following are provided to understand what exactly happens behind the scenes:

```javascript
if (cache.private.exists('MyTimer') === false || cache.private.get('MyTimer').hasTerminated()) {
  cache.private.put('MyTimer', actions.ScriptExecution.createTimer('MyTimer', time.ZonedDateTime.now().plusSeconds(10), function () {
    cache.private.remove('MyTimer');
  }));
} else {
  cache.private.get('MyTimer').reschedule(time.ZonedDateTime.now().plusSeconds(10));
};

```

**Simple timer-block**

The simple timer-block generates the code shown underneath the image below.

![simple-timer](../images/blockly/blockly-simple-timer.png)

```javascript
if (cache.private.exists('MyTimer') === false || cache.private.get('MyTimer').hasTerminated()) {
  cache.private.put('MyTimer', actions.ScriptExecution.createTimer('MyTimer', time.ZonedDateTime.now().plusSeconds(10), function () {
    cache.private.remove('MyTimer');
  }));
};

```

**Retrigger timer-block**

The retrigger timer-block inserts an additional `else{}` branch into the generated code which will run if:

- The rule is retriggered and
- the timer already exists and
- the timer has not yet finished (it's still ticking)

In the case of _do nothing_ the `else{}` branch is empty (which turns to be almost equals to the simple-timer).

```javascript
if (cache.private.exists('MyTimer') === false || cache.private.get('MyTimer').hasTerminated()) {
  cache.private.put('MyTimer', actions.ScriptExecution.createTimer('MyTimer', time.ZonedDateTime.now().plusSeconds(10), function () {
    cache.private.remove('MyTimer');
  }));
} else {
  // do nothing
};

```

In the case of _cancel_ the `else{}` branch contains code to cancel the timer.

```javascript
if (cache.private.exists('MyTimer') === false || cache.private.get('MyTimer').hasTerminated()) {
  cache.private.put('MyTimer', actions.ScriptExecution.createTimer('MyTimer', time.ZonedDateTime.now().plusSeconds(10), function () {
    cache.private.remove('MyTimer');
  }));
} else {
  cache.private.remove('MyTimer').cancel();
};

```

In the case of _reschedule_ the `else{}` statement contains code to reschedule the timer - restart the countdown. In the example generated code below:

- Imagine the rule is triggered at 0 elapsed seconds.
- The timer is started with a 10 second countdown.
- Lets say the rule is triggered again at 5 elapsed seconds.
- Then timer will be rescheduled for another 10 second countdown, so will execute the code within its block at 15 elapsed seconds.

```javascript
if (cache.private.exists('MyTimer') === false || cache.private.get('MyTimer').hasTerminated()) {
  cache.private.put('MyTimer', actions.ScriptExecution.createTimer('MyTimer', time.ZonedDateTime.now().plusSeconds(10), function () {
    cache.private.remove('MyTimer');
  }));
} else {
  cache.private.get('MyTimer').reschedule(time.ZonedDateTime.now().plusSeconds(10));
};
```

### Cancel Timer

![cancel-timer.png](../images/blockly/blockly-cancel-timer.png)

_Function_: Cancels the existing named timer, preventing code within the timer block from executing.

### Timer is Active

![timer-is-active](../images/blockly/blockly-timer-is-active.png)

_Function:_ returns `true` if the timer itself is currently counting down, and the code within the timer will be eventually executed as scheduled. This block will return `false` if the timer doesn't exist, has been cancelled, or has already finished.

### Timer is Running

![timer-is-running](../images/blockly/blockly-timer-is-running.png)

_Function_: returns `true` if the code _within the timer block_ is currently running - i.e. the countdown has finished, and the code within the timer block is currently executing. This event will usually only last a few milliseconds, and you’d be (un)lucky to catch it when your rule retriggers.

### Timer has terminated

![timer-terminated](../images/blockly/blockly-timer-terminated.png)
_Function_: returns `true` if the timer has finished its countdown, and the code within the timer block has finished running.

### Comprehensive Timer Example

The intent here is to trigger an alarm to the police but allow the timer to be reset in case a reset button has been pressed during the trigger time.
The rule is triggered when the burglar-alarm-item or the reset-button-item is changed.

![timer-comprehensive](../images/blockly/blockly-timer-comprehensive.png)

## Return to Blockly Reference

[return to Blockly Reference](index.html#timers-and-delays)
