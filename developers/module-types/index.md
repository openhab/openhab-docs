---
layout: developersguide
title: Automation Modules
---

{% include base.html %}

# Developing Automation Modules

In this section you will be guided through developing *Module Types* and corresponding *Module Handlers* for the automation engine of openHAB.

Module Types describe Conditions, Triggers and Actions for the automation engine in terms of user visible strings like a label, a description, tags.
But also what configuration values are available and what inputs and outputs a Module Type provides.

For each *Module Type* a corresponding *Module Handler* is in place to actually execute code.

To better get into the topic, let's develop a rule for the automation engine that is compromised completely out of custom module types.

In our hands-on application we will switch on a virtual air conditioner (`Action`) as soon as the outdoor temperature is
over a certain value (`Trigger`), but only if a person is at home (`Condition`).
For the sake of complexity we want the air conditioner to operate at different levels depending on the temperature.

## Module Type Provider

To inform the rule engine of your module types, you implement an OSGi service that extends `ModuleTypeProvider`.
As soon as this provider is active, you have access to all the exposed triggers, conditions and actions from
within old xtend rules, scripts and automation engine rules.

Just keep in mind, that this only describes your triggers, conditions and actions,
but the automation engine will not yet know what to do when encountering such a module.

```java
@NonNullByDefault
@Component(immediately=true, service={ModuleTypeProvider.class})
public class MyModuleTypeProvider implements ModuleTypeProvider {

    private Map<String, ModuleType> providedModuleTypes;

    public MyModuleTypeProvider() {
        providedModuleTypes = new HashMap<String, ModuleType>();
        providedModuleTypes.put(TemperatureTriggerType.UID, TemperatureTriggerType.initialize());
        providedModuleTypes.put(PresenceConditionType.UID, PresenceConditionType.initialize());
        providedModuleTypes.put(AirConditionerActionType.UID, AirConditionerActionType.initialize());
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends ModuleType> T getModuleType(String UID, Locale locale) {
        return (T) providedModuleTypes.get(UID);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends ModuleType> Collection<T> getModuleTypes(Locale locale) {
        return (Collection<T>) providedModuleTypes.values();
    }

    @Override
    public void addProviderChangeListener(ProviderChangeListener<ModuleType> listener) {
        // does nothing because this provider does not change
    }

    @Override
    public Collection<ModuleType> getAll() {
        return Collections.unmodifiableCollection(providedModuleTypes.values());
    }

    @Override
    public void removeProviderChangeListener(ProviderChangeListener<ModuleType> listener) {
        // does nothing because this provider does not change
    }
}
```

This is the programmatic way of exposing *Module Types*.
It is actually way easier to just descripe your module types in a declarative way via json and bundle them with your addon.

### Module types via json

To describe your modules (triggers, conditions, actions), add json files to `ESH-INF/automation/moduletypes/` within your bundle.
A module type file can contain one or multiple type descriptions.

For our scenario we go with one file:

```json
{  
   "triggers":[  
      {  
         "uid":"ConsoleTrigger",
         "label":"Demo Trigger",
         "description":"Triggers the Rule on event from EventAdmin service",
         "configDescriptions":[  
            {  
               "name":"eventTopic",
               "type":"TEXT",
               "label":"Topic",
               "description":"This is the event topic that the trigger will listen for",
               "required":true
            },
            {  
               "name":"keyName",
               "type":"TEXT",
               "label":"Key name",
               "description":"The key for entry that contains a value for the output of this trigger.",
               "required":true
            }
         ],
         "outputs":[  
            {  
               "name":"outputValue",
               "type":"java.lang.Integer",
               "label":"Output value",
               "description":"Output value"
            }
         ]
      }
   ]
}
```

## Module Handlers

Module Handlers are helpers of the Automation Engine.
The automation engine forwards modules, created by module types, to module handlers.
They do the real work.

### Trigger Handler

Trigger Handler serves to notify the Automation Engine about firing the Triggers.
Simple implementation of it can be seen into `WelcomeHomeTriggerHandler` class.

### Condition Handler

Condition Handler serves to help the Automation Engine to decide if it continues with the execution of the rule or to terminate it.
Simple implementation of it can be seen into `StateConditionHandler` or `TemperatureConditionHandler` class.

### Action Handler

Action Handler is used to help the Automation Engine to execute the specific Actions.
A simple implementation of it can be seen into `WelcomeHomeActionHandler` class.

## Tie everything together: Define rules

Until now we have taught the automation engine a way to trigger on specific temperatures,
to tell us if someone is at home,
and to switch on an air conditioner at different levels.

We now need to write an actual rule to use our custom modules.

### Via json files

The automation engine reads rule json files from the `{openhab-dir}/automation/*.js` directory.

The rule that implements our application is declaratively described in the json format like this:

```json
[  
   {  
      "uid":"JsonDemoRule",
      "name":"DemoRule",
      "triggers":[
         {  
            "id":"RuleTrigger",
            "label":"Item State Change Trigger",
            "description":"This triggers a rule if an items state changed",
            "type":"ItemStateChangeTrigger",
            "configuration":{  
               "itemName":"DemoSwitch"
            }
         }
      ],
      "conditions":[
      ],
      "actions":[
         {  
            "id":"RuleAction",
            "label":"Post command to an item",
            "description":"Posts commands on items",
            "type":"ItemPostCommandAction",
            "configuration":{  
               "itemName":"DemoDimmer",
               "command":"ON"
            }
         }
      ]
   }
]
```

### Programatically define rules

You can also define rules programmatically and add them to the `RuleRegistry`.
Rules defined like this can be changed via user-interfaces.

```java
@NonNullByDefault
@Component(immediately=true)
public class MyRuleRegistrationComponent {
    @Reference
    protected @NonNullByDefault({}) RuleRegistry ruleRegistry;

    @Activated
    public void activated() {
        ruleRegistry.add(createACRule());
    }

    private Rule createACRule() {
        // initialize the trigger
        String triggerId = "LightsSwitchOnRuleTrigger";
        List<Trigger> triggers = new ArrayList<Trigger>();
        triggers.add(new Trigger(triggerId, LightsTriggerType.UID, null));

        // initialize the condition - here the tricky part is the referring into the condition input - trigger output.
        // The syntax is a similar to the JUEL syntax.
        Configuration config = new Configuration();
        config.put(StateConditionType.CONFIG_STATE, "on");
        List<Condition> conditions = new ArrayList<Condition>();
        Map<String, String> inputs = new HashMap<String, String>();
        inputs.put(StateConditionType.INPUT_CURRENT_STATE, triggerId + "." + StateConditionType.INPUT_CURRENT_STATE);
        conditions.add(new Condition("LightsStateCondition", StateConditionType.UID, config, inputs));

        // initialize the action - here the tricky part is the referring into the action configuration parameter - the
        // template configuration parameter. The syntax is a similar to the JUEL syntax.
        config = new Configuration();
        config.put(WelcomeHomeActionType.CONFIG_DEVICE, "Lights");
        config.put(WelcomeHomeActionType.CONFIG_RESULT, "Lights are switched on");
        List<Action> actions = new ArrayList<Action>();
        actions.add(new Action("LightsSwitchOnAction", WelcomeHomeActionType.UID, config, null));

        // initialize the configDescriptions
        List<ConfigDescriptionParameter> configDescriptions = new ArrayList<ConfigDescriptionParameter>();
        final ConfigDescriptionParameter device = ConfigDescriptionParameterBuilder
                .create(WelcomeHomeRulesProvider.CONFIG_UNIT, Type.TEXT).withRequired(true).withReadOnly(true)
                .withMultiple(false).withLabel("Device").withDescription("Device description").build();
        final ConfigDescriptionParameter result = ConfigDescriptionParameterBuilder
                .create(WelcomeHomeRulesProvider.CONFIG_EXPECTED_RESULT, Type.TEXT).withRequired(true)
                .withReadOnly(true).withMultiple(false).withLabel("Result").withDescription("Result description")
                .build();
        configDescriptions.add(device);
        configDescriptions.add(result);

        // initialize the configuration
        config = new Configuration();
        config.put(CONFIG_UNIT, "Lights");
        config.put(CONFIG_EXPECTED_RESULT, "The lights are switched on.");

        // create the rule
        Rule lightsSwitchOn = new Rule(L_UID);
        lightsSwitchOn.setTriggers(triggers);
        lightsSwitchOn.setConfigurationDescriptions(configDescriptions);
        lightsSwitchOn.setConditions(conditions);
        lightsSwitchOn.setActions(actions);

        // initialize the tags
        Set<String> tags = new HashSet<String>();
        tags.add("lights");

        // set the tags
        lightsSwitchOn.setTags(tags);

        return lightsSwitchOn;
    }
}
```

### Define constant / non-changable rules

We have seen how to define rules via json files as well as programatically.
A third way is to inject rules via an own `RuleProvider`.

Those rules are compiled into the bundle and cannot be changed later on, which might be desired.
We will use the `createACRule` method from above.

```java
@NonNullByDefault
@Component(immediately=true, service={RuleProvider.class})
public class MyStaticRulesProvider implements RuleProvider {
    private Collection<ProviderChangeListener<Rule>> listeners = new ArrayList<>();
    private Map<String, Rule> rules = Collections.singletonMap("AirConditionerSwitchOnRule", createACRule());

    @Override
    public void addProviderChangeListener(ProviderChangeListener<Rule> listener) { listeners.add(listener); }

    @Override
    public Collection<Rule> getAll() { return rules.values(); }

    @Override
    public void removeProviderChangeListener(ProviderChangeListener<Rule> listener) { listeners.remove(listener); }
}
```

## Further reading

This document does not yet cover all features of the automation engine.

We skipped rule templates and did not cover existing module types for common tasks,
like triggering on an item state change or post a command as an action.

Please discover existing module types on your own from within the user interfaces.
For rule templates you may just ask in our friendly community.
