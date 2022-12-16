---
layout: documentation
title:  Rules - Other Technologies
---

# Rule Technology Overview

Sometimes the built in rule engine is not the perfect fit.
It's possible to use openHAB with a variety of different rule engines and automation techonologies.
Some are native and can be used out of the box with openHAB and some require installation of
additional services which interact with openHAB through its Rest API.

The list is sorted alphabetically by name.

| Name                | Native             | Language/Graphical  | Notes                         |
|---------------------|--------------------|---------------------|-------------------------------|
| Blockly             | :heavy_check_mark: | Graphical           | Only available through the UI |
| GraalVM JavaScript  | :heavy_check_mark: | JavaScript latest   | breaks Blockly/Nashorn rules  |
| Groovy              | :heavy_check_mark: | Groovy              |                               |
| HABApp              | :x:                | >= Python 3.8       |                               |
| Java                | :heavy_check_mark: | Java                |                               |
| jRuby               | :heavy_check_mark: | Ruby                |                               |
| Jython              | :heavy_check_mark: | Python 2.7          |                               |
| NodeRed             | :x:                | Graphical           | Own UI                        |
| Nashorn JavaScript  | :heavy_check_mark: | JavaScript 5.1      |                               |
| RulesDSL            | :heavy_check_mark: | RulesDSL            |                               |
