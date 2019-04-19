---
layout: developersguide
title: Addon Development
---

# Overview

In this chapter of the documentation you will learn how to develop an addon for openHAB.
A variety of different parts of openHAB can be extended, we go through all of them.

openHAB uses [git](https://git-scm.com/) as its version control system and [github](https://github.com/openhab) for hosting the different repositories and source code.
You will get in contact with git in many places and it makes sense to get familiar with its basic commands and concepts.
There are many pages to learn about Git.
Try [git - the simple guide](http://rogerdudler.github.io/git-guide/) as a start.

Addons and the core itself are written in Java.
Java is not hard to learn, but it helps if you have a general technical understanding of programming languages.

The different guides of this chapter assume that you are familiar with Java 8 and a rough idea of Git's workflow(eg "checkout", "branches", "push").

## Chose the right concept for a problem

openHAB allows you to build up on the following concepts:

* **Bindings**: A binding connects to external services or devices,
* **Automation engine module**: A trigger, condition or action that can be used in automation rules (or scripts),
* **Transformation / Profiles**: Can be used to transform a *Thing Channel* value before it is assigned to an *Item*,
* **an IO service**: Exposes openHAB internals via a defined interface (for example the REST interface, HomeKit or Hue Emulation Service)
* **Natural language processing skill**:
  Executes something depending on the understood Intents and returns something back to the user,
* **Extension-Service**: Provides openHAB addons via some means.
  The official openHAB2 addons or openHAB1 addons are made available via an Extension-Service.
* and many more (not covered yet).

Sometimes though its just not worth writing a binding and you are better off
just using an http action in a rule or script to retrieve some values.

Therefore: First think what you want to archive! Check our [community forum](https://community.openhab.org)
and discuss your concept.

Find the right abstraction and the corresponding link on the left navigation panel.
General [coding guidelines](development/guidelines.html) apply to all addon development.

## Setup your development environment

You can use any IDE that is suitable for OSGi/Java development.
We recomment the freely available [Eclipse IDE](https://wiki.eclipse.org/Eclipse_Installer).
Development can happen on any of the supported operating systems (Windows, Mac OS, Linux).

Please ensure that you have the following prerequisites installed as well:

1. [Git](https://git-scm.com/downloads) For retrieving our source code and push changes back
1. [Maven 3.x](https://maven.apache.org/download.cgi) Our buildsystem tool
1. Java JDK 8, for example from Oracle [Oracle JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

**TODO**: We are currently reworking how to setup a perfect development enviroment.
A new step by step guide will appear here after the migration is done.
Watch [Issue 5005](https://github.com/openhab/openhab2-addons/issues/5005) for further information and progress.

For now follow these steps:

1. Install Bndtools in your Eclipse IDE (Help -> Install new software. Use "-- All available sites--" for "Work with".)
2. Checkout the openHAB demo application: `git clone --depth=1 https://github.com/maggu2810/openhab-demo`.
3. Open the directory in Eclipse (File -> Import -> Existing maven projects).
   Wait for the download and build to finish (about 3-5 minutes).
4. Checkout the openhab2-addons repository: `git clone --depth=1 https://github.com/openhab/openhab2-addons`
5. Add the binding that you want to develop on to the workspace (File -> Import -> Existing maven projects).
   Do not add all projects.
6. In Eclipse Package Explorer: Search for `pom.xml` in the demo-app project.
    ![pom xml](https://user-images.githubusercontent.com/66436/54607049-a9031700-4a4d-11e9-9b9d-64a620270d28.png)
    Add your addon as maven dependency like so (replace `astro`!):
   ```xml
   <project ...>
     ...
     <dependencies>
        <dependency>
            <groupId>org.openhab.addons.bundles</groupId>
            <artifactId>org.openhab.binding.astro</artifactId>
            <version>${project.version}</version>
            <scope>runtime</scope>
        </dependency>
     </dependencies>
   </project>
   ```
7. In Eclipse Package Explorer: Search for `app.bndrun` in the "demo-app" project.
   Double click (takes a few seconds).
8. Add your project to "Run requirements" via drag&drop from the Package Explorer.
    ![Bndtools](https://user-images.githubusercontent.com/66436/54527103-2c066d80-4979-11e9-8852-c06a41f4d50b.png)
9. Execute with "Run OSGi" or "Debug OSGi"
