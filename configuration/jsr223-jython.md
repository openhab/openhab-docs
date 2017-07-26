---
layout: documentation
title: JSR223 Jython Scripting
---

{% include base.html %}

# JSR223 Jython Scripting

## Configuration

[Download](http://www.jython.org/downloads.html) the Jython 2.7.x installer package. 
Install Jython on the local filesystem and make note of the installation directory location.

The Jython implementation will need to be added to openHAB's Java classpath. 
How this is done depends on the specific installation technique and operating system.

### Linux Package Installers

Modify the `EXTRA_JAVA_OPTS` environment variable in `/etc/default/openhab2` to:

```bash
EXTRA_JAVA_OPTS=-Xbootclasspath/a:/home/pi/jython2.7.0/jython.jar \
  -Dpython.home=/home/pi/jython2.7.0 \
  -Dpython.path=/etc/openhab2/lib/python
```

This will add the Jython library to the Java classpath, 
set the Jython home directory and specify the initial Python path for the Jython runtime. 
Python modules and packages can be installed into the `python.path` locations and imported from scripts. 
Note that library modules and packages are not automatically reloaded when they change.

### Mac and Windows or Manual Installation

Set the `EXTRA_JAVA_OPTS` environment variable to the value described in the Linux configuration. 
Note that on Windows the environment variable value should be set as a single line 
(without backslashes to combine the line fragments).

## Configuration Testing

In the `automation/jsr223` directory create an empty file called `test.py`.

Watch the openHAB log file carefully ([Karaf logging]({{base}}/administration/logging.html) 
or viewing the `openhab.log` file directly). 
You should see a log line with information similar to:

```text
    ... [INFO ] [s.i.GenericScriptEngineFactory:28   ] - Activated scripting support for ECMAScript
    ... [INFO ] [s.i.GenericScriptEngineFactory:28   ] - Activated scripting support for python
        ...
    ... [INFO ] [.a.m.s.r.i.l.ScriptFileWatcher:150  ] - Loading script 'test.py'
```

> NOTE: ECMAScript is Javascript

Look for any potentially related error messages.

To enable debug logging, use the [Karaf logging]({{base}}/administration/logging.html) commands to 
enable debug logging for the automation functionality:

```text
log:set DEBUG org.eclipse.smarthome.automation
```

## Script Examples

Jython scripts provide access to almost all the functionality in an openHAB runtime environment. 
As a simple example, the following script logs "Hello, World!" into the openhab.log file. 
Note that `print` will usually not work since the output has no terminal to display the text. 
One exception is when the openHAB server is running from the Eclipse IDE. 
The openHAB server uses the [SLFJ](https://www.slf4j.org/) library for logging. 

```python
from org.slf4j import LoggerFactory

LoggerFactory.getLogger("org.eclipse.smarthome.automation.examples").info("Hello world!")
```

Jython can [import Java classes](http://www.jython.org/jythonbook/en/1.0/ModulesPackages.html). 
Depending on the openHAB logging configuration, 
you may need to prefix logger names with `org.eclipse.smarthome.automation` 
for them to show up in the log file (or you modify the logging configuration).

> NOTE: Be careful with using wildcards when importing Java packages (e.g., `import org.sl4j.*`). 
> This will work in some cases, but it might not work in some situations. 
> It's best to use explicit imports with Java packages. 
> For more details, see the Jython documentation on 
> [Java package scanning](http://www.jython.org/jythonbook/en/1.0/ModulesPackages.html#java-package-scanning).

The script then uses the [LoggerFactory](https://www.slf4j.org/apidocs/org/slf4j/Logger.html) 
to obtain a named logger and then logs a message like:

```text
    ... [INFO ] [.smarthome.automation.examples:-2   ] - Hello world!
```

Notice that no rules were required for this simple script. 
This can be a useful way to experiment with simple Jython code before defining rules or other more advanced functionality.

If you want to respond to openHAB events you can create rules in the scripts. 
The following script requires two string items, `TestString1` and `TestString2`. 
The rule created in the script is triggered by an update to `TestString1` and, 
when triggered, the rule updates `TestString2`. 

```python
scriptExtension.importPreset("RuleSimple")
scriptExtension.importPreset("RuleSupport")

class MyRule(SimpleRule):
    def __init__(self):
        self.triggers = [
             Trigger("MyTrigger", "core.ItemStateUpdateTrigger", 
                    Configuration({ "itemName": "TestString1"}))
        ]
        
    def execute(self, module, input):
        events.postUpdate("TestString2", "some data")

automationManager.addRule(MyRule())
```

When a script is loaded, some names are already defined in the script *scope* (the local Jython namespace). 
To define rules, you must include some additional [script *extensions*](jsr223.html#presets) 
(implemented as "presets") that add more names to the script scope for specific purposes. 
In this case, the `RuleSimple` extension is used to import the `SimpleRule` base class. 
The `RuleSupport` extensions provides the `automationManager` that allows you to register rule instances with openHAB.

The Jython rule class uses the `SimpleRule` subclass to simplify some aspects of the openHAB interface for use with JSR223. 
n the constructor, the triggers atribute is set to a list of [triggers](jsr223.html#trigger_types). 
In this example, the trigger is a state update trigger. 
The trigger name identifies the trigger and the configuration direction provides trigger-specific options. 
For the item update trigger, the configuration provides the item name of the monitored item.

The `execute` method is invoked when the rule is triggered. 
The `module` and `input` arguments can be used in advanced rules. 
The information provided varies by the trigger type.

### Resources

  - [Scripted Rule Support](https://github.com/eclipse/smarthome/wiki/Scripted-Rule-Support)
    
    Early documentation on JSR223 usage in openHAB 2. Includes IDE setup instructions.

  - [openhab2-jython](https://github.com/steve-bate/openhab2-jython)  (github)

    Provides information and examples related to advanced, exploratory openHAB JSR223 Jython usage.

    - Wrappers to simplify `Trigger` usage in rules.
    - Python decorators to define simple time-triggered and item-triggered functions
    - Python logging bridge to openHAB logger
    - Custom Trigger Implementations: `StartupTrigger`, `OsgiEventTrigger`, ...
    - OSGI console command implemented in Jython
    - OH2 Module Implementations in Jython (things, item providers, ...)
    - Jython-based ScriptExtension (preset) provider support.
    - Example of using Pykka Actor library.
    - Unit-testing support
