---
layout: documentation
title:  Rules - Other Technologies
---

# Rule Technology Overview

Sometimes the built in rule engine is not the perfect fit.
It's possible to use openHAB with a variety of different rule engines and automation technologies.

Some are native and can be used out of the box with openHAB and some require installation of
additional services which interact with openHAB through its REST API.

The list is sorted alphabetically by name and it is meant as a starting point for further research.

| Name                                                  | Native             | Language/Graphical | Notes                                    |
| ----------------------------------------------------- | ------------------ | ------------------ | ---------------------------------------- |
| [Blockly](rules_blockly.html)                         | :heavy_check_mark: | Graphical          | Only available through the UI            |
| [GraalVM JavaScript](/addons/automation/jsscripting/) | :heavy_check_mark: | ECMAScript 11      | Enabled by installing an official add-on |
| [Groovy](/addons/automation/groovyscripting/)         | :heavy_check_mark: | Groovy 3.0         | Enabled by installing an official add-on |
| [HABApp](https://habapp.readthedocs.io/)              | :x:                | >= Python 3.8      | A third-party solution                   |
| [JRuby](/addons/automation/jrubyscripting/)           | :heavy_check_mark: | Ruby 3.1           | Enabled by installing an official add-on |
| [Jython](/addons/automation/jythonscripting)          | :heavy_check_mark: | Python 2.7         | Enabled by installing an official add-on |
| NodeRed                                               | :x:                | Graphical          | Own UI. A third-party solution           |
| Nashorn JavaScript                                    | :heavy_check_mark: | ECMAScript 5.1     | Deprecated                               |
| [RulesDSL](/docs/configuration/rules-dsl.html)        | :heavy_check_mark: | RulesDSL           | Built-in                                 |
