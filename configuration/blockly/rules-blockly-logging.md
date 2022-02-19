---
layout: documentation
title: Rules Blockly - Logging
---

# Logging

[return to Blockly Reference](index.html#logging)

## Introduction

This section explains only the blocks that have been added to the standard blocks by openHAB

{::options toc_levels="2..4"/}

- TOC
{:toc}

{: #blockly-logging-overview}

## Logging and Output

These blocks enable arbitrary content to be published to the [openHAB log](https://www.openhab.org/docs/administration/logging.html).

![logging-overview](../images/blockly/blockly-logging-overview.png)

### Log Statement

![log-statement](../images/blockly/blockly-logging-log.png)

*Function:* Sends an entry to the openHAB log file with a defined severity level.

- A [severity level](https://www.openhab.org/docs/administration/logging.html#defining-what-to-log) can be provided via the dropdown list for the log statement

  - error
  - warn
  - info
  - debug
  - trace

### Print Statement

![print-to-stdout](../images/blockly/blockly-logging-print.png)

*Function:* creates a print statement with the given text in the rule that logs to *stdout*

## Return to Blockly Reference

[return to Blockly Reference](index.html#logging)
