---
layout: documentation
title: Rules Blockly - Value Storage
---

# Value Storage
[return to Blockly Reference](index.html#value-storage)

## Introduction

These blocks enable storing information *for a rule* that is kept after the rule has run, so it can be reused when the rule is run again later in stateful way. Basically a value storage can be perceived as a global variable for the rule instance.

* The values are persisted as a part of the *instance* of the rule
  * Modifying the rule during development creates a new instance which means the value is reset.
  * Restarting openHAB creates a new rule instance which also means the value is reset
  * In most cases both situations are negligible for many rules.
* If you need full persistence of values that can be used across rules you need to persist the value in one of the persistence engines like MapDB
* By default the value is *undefined*. To check if a value is undefined, use the special "is undefined"-block

{::options toc_levels="2..4"/}

- TOC
{:toc}

{: #blockly-value-storage-overview}

## Overview of the Value Storage blocks

![value-storage-blocks](../images/blockly/blockly-value-storage.png)

## Value Storage Blocks

### Store Value

![store-value](../images/blockly/blockly-value-store.png)

Function: Stores a value under the key name

### Get Stored Value

#![get-stored-value](../images/blockly/blockly-value-get.png)

Function: Retrieves a stored value by the key name

### Check if Value is undefined

![value-is-defined](../images/blockly/blockly-value-is-defined.png)

Function: Checks if a value is undefined

### Example 1: Initialize a key if not set

![example1](../images/blockly/blockly-value-example1.png)

### Example 2: Use the rule instance variable to remember a color that has been set

![example2](../images/blockly/blockly-value-example2.png)

## Return to Blockly Reference

[return to Blockly Reference](index.html#value-storage)
