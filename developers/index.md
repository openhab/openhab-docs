---
layout: developersguide
title: Developer Guide
---

# Overview

A variety of different parts of openHAB can be extended.
We will cover the most important ones here.

openHAB uses [git](https://git-scm.com/) as its version control system and [GitHub](https://github.com/openhab) for hosting the different repositories and source code.
You will come in contact with git in many places, and it makes sense to familiarize yourself with its basic commands and concepts.
There are many places to learn about Git.
Try [git - the simple guide](https://rogerdudler.github.io/git-guide/) as a start.

Add-ons and the openHAB core itself are written in Java.
Java is not hard to learn, but it helps if you have a general technical understanding of programming languages.

The different guides of this chapter assume that you are somewhat familiar with Java 21 and that you have a rough understanding of Git's workflow (e.g. "checkout", "branches", "push").

## Choose the Right Concept

openHAB allows you to build upon the following concepts:

- **Bindings**: A binding connects to external services or devices.
- **Automation engine module**: A trigger, condition, or action that can be used in automation rules (or scripts).
- **Transformation / Profiles**: Can be used to transform a _Thing Channel_- value before it is assigned to an _Item_.
- **An IO service**: Exposes openHAB internals via a defined interface (for example the REST interface, HomeKit or Hue Emulation Service).
- **A Persistence service**: Persist item state updates and/or changes and allows them to be retrieved for specific points in time.
- **Natural language processing skill**:
  Executes something depending on the understood Intents and returns something back to the user.
- **Audio sinks/sources**:
  Control where audio can be played or implement audio sources.
- and many more (not covered yet).

First think about what you want to achieve! Check our [community forum](https://community.openhab.org)
and discuss your concept.
Sometimes it may not even be worth writing a binding or other addon if you can achieve your goal in an easier way.
For example, you may be better off using an http action in a rule or script to retrieve some values.

Find the right abstraction and the corresponding link on the left navigation panel.
General [coding guidelines](guidelines.html) apply to all types of addon development.

## Setup the Development Environment

Development can happen on any of the supported operating systems (Windows, macOS, Linux).

Please ensure that you have the following prerequisites installed as well:

1. [Git](https://git-scm.com/downloads) For retrieving our source code and push changes back. On Windows: Must be available in %PATH%
1. [Maven 3.x](https://maven.apache.org/download.cgi) Our build system tool. On Windows: Must be available in %PATH%
1. Java JDK 21, for example from Oracle [Oracle JDK 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html). On Windows: %JAVA% must be set.

::: tip Note
Whereas openHAB 4.x series was based on Java 17, starting with openHAB 5.0.0-SNAPSHOT, **Java 21 is required**.
:::

You can use any IDE that is suitable for OSGi/Java development.
We have prepared some step-by-step guides for the following IDEs:

<table style="width:100%">
<tr>
<td style="width:50%">

[![Visual Studio Code](./ide/images/vscode.jpg)](ide/vscode.html)

</td>
<td style="width:50%">

[![Eclipse IDE](./ide/images/eclipse.jpg)](ide/eclipse.html)

</td>
</tr>
<tr>
<td style="width:50%">

[![IntelliJ IDE](./ide/images/intellij.jpg)](ide/intellij.html)

</td>
<td style="width:50%">

[![Generic IDE](./ide/images/generic_ide.png)](ide/generic.html)

</table>

Not sure what to choose?: openHAB maintainers use [Eclipse IDE](https://wiki.eclipse.org/Eclipse_Installer).

## Make your own copy of the code base

openHAB has [several repositories](https://github.com/openhab) on GitHub.
The most important ones are listed in the [Contribution section of the Developer Appendix](contributing.html#the-repositories).

For developing a new binding, you'll need to fork the [openhab-addons](https://github.com/openhab/openhab-addons) repository (see [GitHub Docs: Fork a repository](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/working-with-forks/fork-a-repo)) and then clone your fork to your development machine.
Next, create a new branch for your work on the new binding.

## Read the guidelines

Before starting your work, please have a look at the [Coding Guidelines](guidelines.html) and the overall [Contribution docs](contributing.html).
It is always better to know the guidelines before starting coding than having to change your code afterwards.

## Develop a NEW binding

To help start developing a new binding, a script is available to generate the basic skeleton for you.
This script is specific for binding add-ons.
Follow these steps to generate your binding:

1. From the command line in `openhab-addons/bundles` directory to create a skeleton of a new binding `mynewbinding` run:

   On Linux:

    ```bash
    ./create_openhab_binding_skeleton.sh  MyNewBinding "<Author>" <GitHubUsername>
    ```

   On Windows:

    ```bash
    create_openhab_binding_skeleton.cmd MyNewBinding "<Author>" <GitHubUsername>
    ```

    Add your binding to the `bundles/pom.xml` file

    _Use your full name for `<Author>`_.

1. Accept with `Y` when the skeleton configuration asks for it.

1. From `openhab-addons` root you can build only your binding with Maven using the `-pl` option:

    ```bash
    mvn clean install -pl :org.openhab.binding.mynewbinding
    ```

   Where `mynewbinding` is the name of your new binding.
   Some additional Maven options that may help:
   - `-U`: Forces all dependencies to be downloaded again.
   - `-am`: Builds all projects in openhab-addons your project dependends on.
   - `-o`: Won't update any dependencies.
   - `-DskipChecks`: Skips the static analysis checks
   - `-DskipTests`: Skips the unit tests
   - `-Dspotless.check.skip=true` : Skips the spotless file formatting checks
   - `-Dohc.version=3.0.2` : The version of openhab you are building for

1. To start your new binding it's a good practice to commit your code on a new git branch:

   ```bash
   git checkout -b <mynewbranch>
   ```

1. Open Eclipse or your favorite editor and import your new binding project

Now you can start developing your NEW binding. We're looking forward to your pull request!

In case the new binding has dependencies to other bundles/libraries see [Adding Dependencies](buildsystem.html#adding-dependencies) for more information.

If developing on Windows, git will convert line endings from LF to CRLF automatically. The repo uses LF,
and spotless will object, and throw errors. If you use `mvn spotless:apply` to fix formatting, it will add CRLF
to all files dirtying the entire branch. Adding a `.gitattributes` file to the openhab-addons folder with the
following will tell git and spotless to use LF endings:

```text
* text eol=lf
```

Further documentation about binding development can be found in the [Bindings Developer Guide](bindings/index.html).

## Contribute your changes back to openHAB

When you are finished with your new binding (or in the process of development and need help), you need to create a pull request (PR) to the so-called upstream repository, in this case openhab-addons.
Have a look at [GitHub Docs: Creating a pull request](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request) if you need help.

Once you have created your PR, the maintainers will review your code and provide feedback.
Please be patient and be prepared to make changes to your code based on the feedback you receive.
