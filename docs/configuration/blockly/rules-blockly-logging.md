---
title: Rules Blockly - Logging
source: https://github.com/openhab/openhab-docs/blob/main/src/configuration/blockly/rules-blockly-logging.md
meta:
  - property: og:title
    content: "Rules Blockly - Logging"
  - property: og:description
    content: a vendor and technology agnostic open source automation software for your home
---
<!-- markdownlint-disable MD036 -->

# Logging

[return to Blockly Reference](index.html#logging)

## Introduction

This section explains the blocks that have been added to allow logging.

[[toc]]

## Logging and Output

These blocks enable arbitrary content to be published to the [openHAB log](/docs/administration/logging.html).

![logging-overview](../images/blockly/blockly-logging-overview.png)

More about that topic can be viewed at ![youtube](../images/blockly/youtube-logo-small.png) [Logging](https://youtu.be/EdllUlJ7p6k?t=670)

### Log Statement

![log-statement](../images/blockly/blockly-logging-log.png)

_Function:_ Sends an entry to the openHAB log file with a defined severity level.

- A [severity level](/docs/administration/logging.html#defining-what-to-log) can be provided via the dropdown list for the log statement

  - error
  - warn
  - info
  - debug
  - trace

Since 3.3: The block attached to the log-block is not restricted to a string type block anymore

### Print Statement

![print-to-stdout](../images/blockly/blockly-logging-print.png)

_Function:_ creates a print statement with the given text in the rule that logs to _stdout_

## Return to Blockly Reference

[return to Blockly Reference](index.html#logging)

<EditPageLink/>
