---
layout: documentation
title: Next-Gen Rules
---

{% include base.html %}

# Next-Generation Rule Engine

[![experimental](https://badges.github.io/stability-badges/dist/experimental.svg)](https://github.com/badges/stability-badges)

Since openHAB 2.4 another Rule Engine has been added. It works fundamentally different than what you find with our current [Rules](https://www.openhab.org/docs/configuration/rules-dsl.html). It allows Rules to be edited in a graphical fashion and to interact with [JSR223 Scripts (Javascript, Jypthon, etc)](https://www.openhab.org/docs/configuration/jsr223.html).

> Note: If you use it, this is at your own risk. Especially, you should not expect any documentation or community experience besides what you find on this page.

## Installation

Install the rule engine from Add-ons → Misc → Rule Engine (Experimental).

![rule engine addon](images/rules_ng_addons.png)

When you now refresh your browser, you will see a `Rules` menu appearing in the main menu of Paper UI.

![new rule](images/rules_ng_new_rule.png)

## Concept

In general this rule engine aims to support rules defined with syntax similar to:

```text
ON item_id state changed IF item_id.state == desired_value THEN item_id2.state = desired_value2 
```

A rule consists of basic information like name, tags and a description. The main building blocks of rules are modules however, and each rule consists of one or more instances of each of the following modules:

- **'trigger'** modules specify the events that trigger a rule execution.
- **'condition'** modules act as a filter for rule execution.
  Actions of the rule will be executed only if event data satisfies all conditions.
  In case there are multiple conditions in the 'if' section then all of them must be satisfied.
- **'action'** modules perform actual operations in openHAB.
  If more than one action is specified in a rule they will be executed sequentially.
  The output of the previous action can be used as an input for the next action.
  An imaginary action can therefore also just be a conversion to make one action output compatible to another actions input.

Each module is created from a template called **Module type**.
A module type specifies parameters for the template, like e.g. "eventTopic" for the "GenericEventTrigger" or "operator" for the "GenericCompareCondition".

The automation engine provides some generic module types.
Those can be extended by so called **composite module types**.
Those use predefined configurations and/or modified module input/output objects.

> An example is the module type "ItemStateChangeTrigger" which is based on the GenericEventTrigger but specifies in its configuration that it is triggered only by item's state change events.

### Module Types

A given **Module type** has the following elements:

    uid - unique id
    label - localizable text
    description - localizable text
    configDescriptions - list of meta data for the configuration properties
    input variables - list of meta data for the supported input objects
    output variables - list of meta data for the supported output objects

**configDescriptions** has the following metadata defined for each property:

    name
    type - one of the following "text", "integer", "decimal", "boolean"
    label - localizable text
    description - localizable text
    required - boolean flag indicating if this configuration property can be optional and thus it can be ommited in the rule, by default required is false
    defaultValue - default value for the configuration property when not specified in the rule

**Input property** has the following metadata:

    name
    type - fully qualified name of Java class ("java.lang.Integer")
    label - localizable text
    description - localizable text
    defaultValue - default value for the configuration property when not specified in the rule
    tags - shows how to be considered a given value. For example, as a Temperature


**Output property** has the following metadata:

    name
    type - fully qualified name of Java class ("java.lang.Integer")
    label - localizable text
    description - localizable text
    defaultValue - default value for the configuration property when not specified in the rule
    reference - which means the property value can be specified as a reference to configuration parameter or input parameter
    tags - shows how a given value should be considered (e.g. as a Temperature)

**Supported Types**

The types supported in the **input/output** objects can be any string and the following validation is performed:

- if the input type and the output type are equal as string the connection is valid
- if the input type is "*" and the output type is any the connection is valid
- if the input type and the output type are strings representing full qualified names which can be loaded and the input type is assignable from output type the connection is valid

The types in the **Configuration** object are restricted to the following:

- TEXT - The data type for a UTF8 text value
- INTEGER - The data type for a signed integer value in the range of Integer#MIN_VALUE, Integer#MAX_VALUE
- DECIMAL - The data type for a signed floating point value (IEEE 754) in the range of Float#MIN_VALUE, Float#MAX_VALUE
- BOOLEAN - The data type for a boolean: true or false

## Defining Rules via JSON

**JSON schemas for:**

 * [module types](../development/rules/ModuleTypes_schema.json)
 * [rule templates](../development/rules/Templates_schema.json)
 * [rule instances](../development/rules/Rules_schema.json)

### Sample Rules

 * **Sample rule instance referencing module types:**

```
{
        "uid":"sample.rule1",
        "name":"SampleRule",
        "tags":[
            "sample",
            "rule"
        ],
        "description":"Sample Rule definition.",
        "triggers":[
            {
                "id":"SampleTriggerID",
                "type":"SampleTrigger"
            }
        ],
        "conditions":[
            {
                "id":"SampleConditionID",
                "type":"SampleCondition",
                "configuration":{
                    "operator":"=",
                    "constraint":"dtag"
                },
                "inputs":{
                    "conditionInput":"SampleTriggerID.triggerOutput"
                }
            }
        ],
        "actions":[
            {
                "id":"SampleActionID",
                "type":"SampleAction",
                "configuration":{
                    "message":">>> Hello World!!!"
                }
            }
        ]
}
```

 * **Sample module types:**

```
"triggers":[  
      {  
         "uid":"SampleTrigger",
         "label":"SampleTrigger label",
         "description":"Sample Trigger description.",
         "outputs":[  
            {  
               "name":"triggerOutput",
               "type":"java.lang.String",
               "label":"TriggerOutput label",
               "description":"Text from user input or default message.",
               "reference":"consoleInput",
               "defaultValue":"dtag"
            }
         ]
      },
      {  
         "uid":"CompositeSampleTrigger",
         "label":"CompositeTrigger label",
         "description":"Composite Trigger description.",
         "outputs":[  
            {  
               "name":"compositeTriggerOutput",
               "type":"java.lang.String",
               "label":"compositeTriggerOutput label",
               "description":"Text from user input or default message.",
               "reference":"compositeChildTrigger1.triggerOutput"
            }
         ],
         "children":[  
            {  
               "id":"compositeChildTrigger1",
               "type":"SampleTrigger"
            }
         ]
      }
]
```

```
   "conditions":[  
      {  
         "uid":"SampleCondition",
         "label":"SampleCondition label",
         "description":"Sample Condition description",
         "configDescriptions":[  
            {  
               "name":"operator",
               "type":"TEXT",
               "description":"Valid operators are =,>,<,!=",
               "required":true
            },
            {  
               "name":"constraint",
               "type":"TEXT",
               "description":"Right operand which is compared with the input.",
               "required":true
            }
         ],
         "inputs":[  
            {  
               "name":"conditionInput",
               "type":"java.lang.String",
               "label":"ConditionInput label",
               "description":"Left operand which will be evaluated.",
               "required":true
            }
         ]
      }
   ]
```

```
"actions":[  
      {  
         "uid":"SampleAction",
         "label":"SampleAction label",
         "description":"Sample Action description.",
         "configDescriptions":[  
            {  
               "name":"message",
               "type":"TEXT",
               "label":"message label",
               "description":"Defines the message description.",
               "defaultValue":"Default message",
               "required":false
            }
         ]
      },
      {  
         "uid":"CompositeSampleAction",
         "label":"CompositeAction label",
         "description":"Composite Action description.",
         "configDescriptions":[  
            {  
               "name":"compositeMessage",
               "type":"TEXT",
               "label":"custom message label",
               "description":"Defines the custom message description.",
               "defaultValue":">>> Default Custom Message",
               "required":false
            }
         ],
         "inputs":[  
            {  
               "name":"compositeActionInput",
               "type":"java.lang.String",
               "label":"ActionInput label",
               "description":"Text that will be printed.",
               "required":true
            }
         ],
         "children":[  
            {  
               "id":"SampleAction1",
               "type":"SampleAction",
               "configuration":{  
                  "message":"$compositeMessage"
               }
            },
            {  
               "id":"SampleAction2",
               "type":"SampleAction",
               "configuration":{  
                  "message":"$compositeActionInput"
               }
            }
         ]
      }
]
```

## Working with Rules

There are several ways to add new rules:

  * using **JAVA API** from package: **org.openhab.automation.api**;
  * using **text console commands: smarthome automation**;
  * using **resource bundles** that provide moduletypes, rules and rule templates stored in **.json** files;
  * using **REST API** - see the next chapter bellow.

## REST API

* http://<host:port>/rest/module-types - lists module types.
* http://<host:port>/rest/templates" - lists rule templates. 
* http://<host:port>/rest/rules - lists rule instances.

#### /rest/templates

 - GET /rest/templates - returns all registered rule templates.
 - GET /rest/templates/{templateUID} - returned response includes only the content of the specified template.

#### /rest/module-types

 - GET /rest/module-types - returns all registered module types.
 - optional parameter 'type' with possible values: 'trigger', 'condition' or 'action' - filters the response to include only module definitions of specified type.
 - optional parameter 'tags' - filters the response to include only module types which have specified tags.
 - GET /rest/module-types/{moduleTypeUID} - returned response includes only the content of the specified module type.
  
#### /rest/rules

 - GET /rest/rules - returns all registered rule instances.
 - POST /rest/rules - adds new rule instance to the rule registry.
 - DELETE /rest/rules/{ruleUID} - deletes the specified rule instance.
 - PUT /rest/rules/{ruleUID} - updates the specified rule instance.
 - PUT /rest/rules/{ruleUID}/enable - enable/disable specified rule instance.
 - PUT /rest/rules/{ruleUID}/runnow - executes actions of specified rule instance.
 - GET /rest/rules/{ruleUID}/config - returns the configuration of the specified rule instance.
 - PUT /rest/rules/{ruleUID}/config - updates the configuration of the specified rule instance.
 - GET /rest/rules/{ruleUID}/triggers - returns the triggers defined for the specified rule instance.
 - GET /rest/rules/{ruleUID}/conditions - returns the conditions defined for the specified rule instance.
 - GET /rest/rules/{ruleUID}/actions - returns the actions defined for the specified rule instance.
 - GET /rest/rules/{ruleUID}/{moduleCategory}/{id} - returns module instance with specified id and category {triggers/conditions/actions} of the specified rule. 
 - GET /rest/rules/{ruleUID}/{moduleCategory}/{id}/config - returns the configuration of the specified module instance.
 - GET /rest/rules/{ruleUID}/{moduleCategory}/{id}/config/{param} - returns the value of specified module configuration parameter (media type is text/plain).
 - PUT /rest/rules/{ruleUID}/{moduleCategory}/{id}/config/{param} - updates the value of specified module configuration parameter (media type is text/plain).

## JAVA API

`org.openhab.automation.RuleRegistry` - provides main functionality to manage rules in the Rule Engine.
   It can add rules, get existing ones and remove them from the Rule Engine.

`org.openhab.automation.type.ModuleTypeRegistry` - provides functionality to get module types from the Rule Engine.

`org.openhab.automation.template.TemplateRegistry` - provides functionality to get templates from the Rule Engine.


## Text console commands

`automation listModuleTypes [-st] <filter> ` - lists all Module Types. If filter is present, lists only matching Module Types.

`automation listTemplates [-st] <filter> ` - lists all Templates. If filter is present, lists only matching Templates.

`automation listRules [-st] <filter> `- lists all Rules. If filter is present, lists only matching Rules.

`automation removeModuleTypes [-st] <url> ` - Removes the Module Types, loaded from the given url.

`automation removeTemplates [-st] <url ` - Removes the Templates, loaded from the given url.

`automation removeRule [-st] <uid> ` - Removes the rule, specified by given UID.

`automation removeRules [-st] <filter> `- Removes the rules. If filter is present, removes only matching Rules.

`automation importModuleTypes [-p] <parserType> [-st] <url> ` - Imports Module Types from given url. If parser type missing, "json" parser will be set as default.

`automation importTemplates [-p] <parserType> [-st] <url> ` - Imports Templates from given url. If parser type missing, "json" parser will be set as default.

`automation importRules [-p] <parserType> [-st] <url> ` - Imports Rules from given url. If parser type missing, "json" parser will be set as default.

`automation exportModuleTypes [-p] <parserType> [-st] <file> ` - Exports Module Types in a file. If parser type missing, "json" parser will be set as default.

`automation exportTemplates [-p] <parserType> [-st] <file> ` - Exports Templates in a file. If parser type missing, "json" parser will be set as default.

`automation exportRules [-p] <parserType> [-st] <file> ` - Exports Rules in a file. If parser type missing, "json" parser will be set as default.

`automation enableRule [-st] <uid> <enable> ` - Enables the Rule, specified by given UID.
  The use of the 'enable' argument is optional, and will accept a boolean value.
  If used, the command will enable (true) or disable (false) the Rule.
  If it is not used, the command will return the current status of the Rule.

## Resource bundles

Bundles that provide rules in json format should have the following folder structure:

`ESH-INF\automation\moduletypes` - folder for .json files with module types;

`ESH-INF\automation\rules` - folder for .json files with rule instances;

`ESH-INF\automation\templates` - folder for .json files with rule templates.

## Rule Templates

Rule templates can simplify the definition of rules with similar behavior by providing additional configuration properties. Then rule instance definition only refers the rule template and provides the values of the configuration properties.
The rule template is used only once when the rule is imported in the Rule Engine.
After that the reference from the rule instance to the rule template is removed and a given rule may exist even if the rule template is removed or modified.
This will not have any impact on the already imported rules.

 * **Sample rule instance referencing rule template:**

```
  {  
    "uid": "sample.rulebytemplate",
    "name": "RuleByTemplate",
    "templateUID": "SampleRuleTemplate",
    "tags": [  
      "rule",
      "template"
    ],
    "configuration": {  
      "condition_operator": "!=",
      "condition_constraint": "template"
    }
  }
```

 * **Sample rule template:**

```
  {  
    "uid":"SampleRuleTemplate",
    "description":"Sample Rule Template",
    "tags":[  
      "sample",
      "rule",
      "template"
    ],
    "configDescriptions":[  
         {
          "name":"condition_operator",              
          "type": "TEXT",
          "description": "Valid operators are =,>,<,!=",
          "required": true
        },
         {
          "name":"condition_constraint",              
          "type": "TEXT",
          "description": "Right operand which is compared with the input.",
          "required": true
        }
    ],
    "triggers": [  
      {  
        "id": "CompositeSampleTriggerTemplateID",
        "type": "CompositeSampleTrigger",
        "label": "Sample Trigger",
        "description": "This is a sample composite trigger"
      }
    ],
    "conditions": [
      {
        "id": "SampleConditionTemplateID",
        "type": "SampleCondition",
        "label": "Sample Condition",
        "description": "This is a sample condition",
        "configuration": {
          "operator": "$condition_operator",
          "constraint": "$condition_constraint"
        },
        "inputs": {
          "conditionInput": "CompositeSampleTriggerTemplateID.compositeTriggerOutput"
        }
      }
    ],
    "actions": [
      {  
        "id": "CompositeActionTemplateID",
        "type": "CompositeSampleAction",
        "label": "Sample Action",
        "description": "This is a sample action",
        "configuration": {
          "compositeMessage": "Hello World!!!"
        },
        "inputs": {  
          "compositeActionInput": "CompositeSampleTriggerTemplateID.compositeTriggerOutput"
        }
      }
    ]
  }
```

The above example uses two rule configuration properties:
"condition_operator" and "condition_constraint" that update the configuration of the "SampleCondition".

## System Module Types

### GenericEventTrigger

GenericEventTrigger has 3 configuration paramters: `eventTopic`,` eventSource` and `eventTypes` and one output: 'event'.

      {  
         "uid":"GenericEventTrigger",
         "label":"Basic Event Trigger",
         "description":"Triggers Rules on Events",
         "configDescriptions":[  
            {  
               "name":"eventTopic",
               "type":"TEXT",
               "label":"Topic",
               "description":"This is the topic, the trigger will listen to: >>smarthome/*<<",
               "required":true,
               "defaultValue":"smarthome/*"
            },
            {  
               "name":"eventSource",
               "type":"TEXT",
               "label":"Source",
               "description":"This is the source of the event (eg. item name)",
               "required":true,
               "defaultValue":""
            },
            {  
               "name":"eventTypes",
               "type":"TEXT",
               "label":"Event Type",
               "description":"the event type, the trigger should listen to. Multiple types can be specified comma-separated",
               "required":true,
               "defaultValue":""
            }
         ],
         "outputs":[  
            {  
               "name":"event",
               "type":"org.openhab.core.events.Event",
               "label":"Event",
               "description":"The events which was sent.",
               "reference":"event"
            }
         ]
      }


### GenericCompareCondition

This module type is used to compare a value against a configuration property using an operator like `<, >, =`.
The value to be compared can be specified either as an input or as a configuration property.

    {
      "uid":"GenericCompareCondition",
      "label":"CompareCondition",
      "description":"configurable compare condition",
      "configDescriptions":[
        {
          "name":"inputproperty",
          "label":"Input property",
          "type":"TEXT",
          "description":"property of the input to be compared",
          "required":false
        },
        {
          "name":"right",
          "type":"TEXT",
          "label":"compare with",
          "description":"the value to be compared with the input",
          "required":true
        },
        {
          "name":"operator",
          "type":"TEXT",
          "description":"the compare operator, allowed are <, >, =",
          "required":true,
          "defaultValue":"="
        }
      ],
        "inputs": [
            {
              "name":"input",
              "type": "java.lang.Object",
              "label": "input",
              "description": "The input which will be compared.",
              "required":true
            }
    ]
    }

## Providing new Module Types

The rule engine is pluggable - any OSGi bundle can provide implementation for triggers, actions and condition module types and their corresponding metatype definition in JSON format. 

The extension bundle should register the service ModuleHandlerFactory (`org.openhab.automation.handler.ModuleHandlerFactory`) 
and implement the necessary methods for creation of instances of the supported module handlers:

- `org.openhab.automation.handler.TriggerHandler`
- `org.openhab.automation.handler.ConditionHandler`
- `org.openhab.automation.handler.ActionHandler`

## Composite module types

Another way to extend the supported module types is by defining composite module types as an extension of the system module types.
The composite module type wraps one or more instances of a system module type and defines new configuration parameters, inputs and outputs.


      {  
         "uid":"ItemStateChangeTrigger",
         "label":"Item State Trigger",
         "description":"This triggers a rule if an items state changed",
         "configDescriptions":[  
            {  
               "name":"itemName",
               "type":"TEXT",
               "context":"item",
               "label":"item name",
               "description":"the name of the item which's state change should be observed",
               "required":true
            }
         ],
         "children":[  
            {  
               "id":"itemStateChangeTriggerID",
               "type":"GenericEventTrigger",
               "configuration":{  
                  "eventSource":"$itemName",
                  "eventTopic":"smarthome/items/*",
                  "eventTypes":"ItemStateEvent"
               }
            }
         ],
         "outputs":[  
            {  
               "name":"event",
               "type":"org.openhab.core.events.Event",
               "description":"the event of the item state change",
               "label":"event",
               "reference":"itemStateChangeTriggerID.event"
            }
         ]
      }

This example demonstrates a new module type *ItemStateChangeTrigger* which wraps the system module type *GenericEventTrigger*.
It defines the new configuration property `itemName` which is used as the `eventSource` property of the *GenericEventTrigger*.
The other config parameters `eventTopic` and `eventTypes` are staticly defined.
The composite module type can also have inputs and outputs and can use a reference to map them to inputs and outputs of the nested system module type(s). 
