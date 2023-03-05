---
layout: documentation
title: Rules Blockly - Value Storage
---
<!-- markdownlint-disable MD036 -->

# Value Storage

[return to Blockly Reference](index.html#value-storage)

## Introduction

These blocks enable storing information _for a rule_ that is kept after the rule has run, so it can be reused when the rule is run again later in stateful way.
Basically a value storage can be perceived as a global variable for the rule instance.

- The values are persisted as a part of the _instance_ of the rule
  - Modifying the rule during development creates a new instance which means the value is reset.
  - Restarting openHAB creates a new rule instance which also means the value is reset
  - In most cases both situations are negligible for many rules.
- If you need full persistence of values that can be used across rules you need to persist the value in one of the persistence engines like MapDB
- By default the value is _undefined_.
To check if a value is undefined, use the special "is undefined"-block

[[toc]]

## Overview of the Value Storage blocks

![value-storage-blocks](../images/blockly/blockly-value-storage.png)

### Caching

Since openHAB 4.0 caching functionality was introduced (provided that the rule is using [GraalJS / JS Scripting](/docs/configuration/blockly/#openhab-3-openhab-4-migration)).
The blocks have the same behaviour like before when set to "private cache" which means that the value is stores in the rule cache.
When storing a value in the "**shared cache**" the value can be even used beyond the specific rule **in a different rule**.

![value-storage-blocks-cache](../images/blockly/blockly-value-storage-cache.png)

## Value Storage Blocks

See also the short video part about ![youtube](../images/blockly/youtube-logo-small.png) [Global Value Storage](https://youtu.be/KwhYKy1_qVk?t=2060)

### Store Value

openHAB 4.0
![store-value-cache](../images/blockly/blockly-value-store-cache.png)

![store-value](../images/blockly/blockly-value-store.png)

Function: Stores a value under the key name in the specified [cache](#caching).

### Get Stored Value

Since openHAB 4.0:

![blockly-value-get-cache](../images/blockly/blockly-value-get-cache.png)

![get-stored-value](../images/blockly/blockly-value-get.png)

Function: Retrieves a stored value by the key name from the specified [cache](#caching).

### Check if Value is undefined

Since openHAB 4.0:

![get-stored-value](../images/blockly/blockly-value-is-defined-cache.png)

![value-is-defined](../images/blockly/blockly-value-is-defined.png)

Function: Checks if a value is undefined in the specified [cache](#caching)

### Example 1: Initialize a key if not set

![example1](../images/blockly/blockly-value-example1.png)

### Example 2: Use the rule instance variable to remember a color that has been set

![example2](../images/blockly/blockly-value-example2.png)

## Return to Blockly Reference

[return to Blockly Reference](index.html#value-storage)
