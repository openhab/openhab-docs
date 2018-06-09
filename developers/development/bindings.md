---
layout: developersguide
title: Developing bindings
---

{% include base.html %}

# Developing a Binding for openHAB 2

This page describes the necessary steps in order to implement a new binding for openHAB 2.

_Note:_ Please note that in contrast to openHAB 1.x, openHAB 2 is based on the [Eclipse SmartHome](http://eclipse.org/smarthome/) project.
So the APIs and concepts have changed, so please read this documentation carefully, if you are coming from openHAB 1.x development.

For information about code style and naming conventions, please see the [coding guidelines](guidelines).

## Choosing a Namespace

As a first step, you need to decide in which namespace you want to develop your binding - assuming that you want to contribute it back to the community, you have two options:

* You can choose `org.eclipse.smarthome`, if you want to directly contribute it to the Eclipse SmartHome project.
The advantage of this option is that you make it available to a wider audience as your binding will also be available for other solutions than openHAB that are based on Eclipse SmartHome.
The disadvantage is that the contribution process is stricter as it involves intellectual property checks and in general makes it harder or even impossible to include third-party libraries with copy-left licenses such as LGPL or code that you have written by reverse engineering some protocol.
* You can choose `org.openhab`, if you want it to be used for openHAB only.
This is the better option, if your binding is not interesting for other solutions, requires special libraries or has technical dependencies on openHAB specific things (although this should be avoided as much as possible).

## Creating a Skeleton

For the openHAB namespace: Choose the option "openHAB 2 Add-ons" in [your IDE setup](ide.html), and create a skeleton for your binding.
To do this, go into your Git repository under `git/openhab2-addons/addons/binding` and call the script `create_openhab_binding_skeleton.sh` with two arguments.
It is important that your binding name is in camel case (e.g. 'ACMEProduct' or 'SomeSystem').
After the binding name, provide your name as the author (surrounded by quotes if you want to use whitespaces to separate your first and last name).
Example: `~/git/openhab2-addons/addons/binding/create_openhab_binding_skeleton.sh BindingName "Firstname Lastname"`

For the Eclipse SmartHome namespace: Choose the option "Eclipse SmartHome Extensions" in [your IDE setup](ide.html), and create a skeleton for your binding.
To do this, go to `git/smarthome/tools/archetype`and run `mvn install` in order to install the archetype definition in your local Maven repo.
Now go to `git/smarthome/extensions/binding` and call the script `create_binding_skeleton.sh` with two parameters.
The first one is your binding name in camel case (e.g. 'ACMEProduct' or 'SomeSystem').
The second one is your name as author (surrounded by quotes if you want to use whitespaces to separate your fist and last name).

Now switch back to Eclipse and choose `File->Import->General->Existing Projects into Workspace`, enter the folder of the newly created skeleton as the root directory, and press "Finish".

_Note:_ Here you can find a [screencast of the binding skeleton creation](http://youtu.be/30nhm0yIcvA).

## Implement the Binding

The skeleton should give you an easy starting point for your developments.
To learn about the internal structure and the concepts of a binding, please see the [Eclipse tutorial on binding development](https://www.eclipse.org/smarthome/documentation/development/bindings/how-to.html).

Please especially note our [coding guidelines](guidelines), which must be respected for having pull requests approved.
If you have any special dependencies in your code, please check the [library recommendations](https://www.eclipse.org/smarthome/documentation/development/bindings/dependencies.html) at Eclipse SmartHome.
This will ensure that everyone uses the same libraries for e.g. JSON and XML processing or for HTTP and websocket communication.

_Note:_ Currently Eclipse SmartHome and openHAB use different license versions (EPL-2.0 for ESH and EPL-1.0 for OH2).
The skeleton templates use the newer EPL-2.0 version.
To compile a new openHAB binding without errors, you have to perform the following additional steps:

- replace `NOTICE` with `about.html` in the `build-properties` file
- run `mvn license:format` in the root folder of your local Git repository (see [coding guidelines A.2](guidelines.html#a-code-style))

## Setup and Run the Binding

To setup the binding you need to configure at least one *Thing* and link an *Item* to it.
In your workspace in `distro-resources/src/main/resources/things`, you can define and configure *Things* in files with a `*.things` extension.
The following file defines a thing for the Yahoo Weather binding:

```
yahooweather:weather:berlin     [ location="638242" ]
```

In this example a *Thing* of the *ThingType* `yahooweather:weather` is defined with a configuration for the location.

Next you need to create *Items* and link them to the *Channel* of your binding.
Here is the example of the Yahoo Weather binding:

```
Number Berlin_Temperature       "Temperature in Berlin [%.1f °C]"   { channel="yahooweather:weather:berlin:temperature" }
Number Berlin_Humidity          "Humidity in Berlin [%d %%]"        { channel="yahooweather:weather:berlin:humidity" }
```

The syntax for a channel link is `{ channel = "<binding-id>:<thing-type-id>:<thing-id>:<channel-id>" }`.

If you start the openHAB runtime including the binding now (make sure that your binding is checked in the launch configuration dialog!), the code inside your `ThingHandler` implementation is executed.

## Include the Binding in the Build and the Distro

Once you are happy with your implementation, you need to integrate it in the Maven build and add it to the official distro.
For the Maven build, please add a new line in the [binding pom.xml](https://github.com/openhab/openhab2-addons/blob/master/addons/binding/pom.xml) at the alphabetically correct position.
In order to have the binding being included by the distro, you furthermore need to add it to the [feature.xml](https://github.com/openhab/openhab2-addons/blob/master/features/openhab-addons/src/main/feature/feature.xml), again at the alphabetically correct position.
If you have a dependency on a transport bundle (e.g. upnp, mdns or serial), make sure to add a line for this dependency as well (see the other bindings as an example).

Before you create a pull request on GitHub, you should now run

```
mvn clean install
```

from the repository root to ensure that the build works smoothly.
If it does, it is time to [contribute your work](../contributing/contributing)!

### Static code analysis

The Build includes [Tooling for static code analysis](https://github.com/openhab/static-code-analysis) that will validate your code against the openHAB Coding Guidelines and some additional best practices.
Information about the checks can be found [here](https://github.com/openhab/static-code-analysis#esh-guidelines-covered).

The tool will generate an individual report for each binding, which you can find in `.../your_binding_directory/target/code-analysis/report.html` file and a report for the whole build that contains links to the individual reports in the `../openhab2-addons/target/summary_report.html`.
The tool categorizes the found issues by priority: 1(error), 2(warning) or 3(info).
If any error is found within your code the Maven build will end with failure.
You will receive detailed information (path to the file, line and message) listing all problems with priority 1 on the console:

```
...
[ERROR] Failed to execute goal org.openhab.tools:static-code-analysis:0.0.4:report (default) on project org.openhab.binding.example: Code Analysis Tool has found 1 error(s)!
[ERROR] Please fix the errors and rerun the build.
[ERROR] Errors list:
[ERROR] ERROR found by checkstyle: .binding.example.test/about.html:0 Missing about.html file.
[ERROR] Detailed report can be found at: file////path_to_openhab/openhab2-addons/addons/binding/org.openhab.binding.example/target/code-analysis/report.html
...
```

Please fix all the priority 1 issues and all issues with priority 2 and 3 that are relevant (if you have any doubt don't hesitate to ask).
Re-run the build to confirm that the checks are passing.
