---
title: Introduction
layout: documentation
---

<style>
@media (min-width: 720px) {
  .intro-logo {
    float: left;
    padding: 30px;
  }
}
h1.welcome {
  font-family: 'Open Sans', sans-serif;
  font-weight: 300;
  font-size: 36pt;
  margin-top: 0 !important;
}
</style>

<img src="/openhab-logo-square.png" width="150" height="150" class="intro-logo" />

<h1 class="welcome">Welcome!</h1>

The  **open H**ome  **A**utomation  **B**us (openHAB,  *pronounced ˈəʊpənˈhæb*) is an open source, technology agnostic home automation platform which runs as the center of your smart home! 

<div style="clear:both"></div>

Some of openHAB's strengths are:

- Its ability to integrate a multitude of other devices and systems. openHAB includes other home automation systems, (smart) devices and other technologies into a single solution
- To provide a uniform user interface and a common approach to automation rules across the entire system, regardless of the number of manufacturers and sub-systems involved
- Giving you the most flexible tool available to make almost any home automation wish come true; if you can think it, odds are that you can implement it with openHAB.

## What you need to know before you start

**When home automation just seems to work, it is always the result of hard work.** 
Home automation is fascinating and requires a considerable investment of your time. 
Here are some key considerations especially for new users. To be successful, you will need to:

* Start slowly and one step at a time
* Be prepared to learn
* Remain flexible in how you want to achieve your goal
* Celebrate all the small successes

Remember, openHAB is just a computer program. 
The computer will only do what *you* tell it to do.
openHAB can provide many default solutions that are easy to setup. 
On the flip side, the more you insist that everything should look and work exactly as you want it, the more work you will have to do. 
openHAB is fully customizable, but doing so will require substantial effort on your part.

After you have read the documentation for openHAB, you will have:

* Identified on which computer you will run openHAB
* Learned how to install openHAB, as well as all other software that is needed to run openHAB (e.g., JAVA)
* Learned how your smart devices communicate with openHAB; how to make openHAB give commands to your smart devices; and how you can interact with openHAB

Keep your focus. 
For almost everything, there is more than one way in openHAB to achieve a goal or perform a task. 
Initially, this can be frustrating and confusing, but it also gives great flexibility and does not mandate the use of certain devices or tools.

You may need to learn more about computers than you currently do.
But this may not be a problem as you are reading the documentation of software that will enable you to do home automation yourself.

Lastly, be prepared to start a new hobby: home automation. 

Basic functions can be achieved in openHAB rather quickly, e.g., switch lights on at a certain time. 
Others will require much more efforts and thoughts, e.g., how do I determine that someone is home, including guests, but not counting pets? 
The openHAB forum is a great place to learn and discuss. 

## A quick overview

openHAB communicates electronically with smart and not-so-smart devices, performs user-defined actions and provides web-pages with user-defined information as well as user-defined tools to interact with all devices. 
To achieve this, openHAB segments and compartmentalizes certain functions and operations. 
The following table gives a top-level description of the most important concepts as well as a link to more information:

| Concepts | Meaning | More Information |
| --- | --- | --- |
| Bindings | are the openHAB component that provides the interface to interact electronically with devices | _see below_ |
| Things | are the first openHAB (software) generated representation of your devices | [click for more info on Things]({{base}}/concepts/things.html) |
| Channels | are the openHAB (software) connection between “Things” and “Items” (see below) | _see below_ |
| Items | are the openHAB (software) generated representation of information about the devices | [click for more info on Items]({{base}}/concepts/items.html) |
| Rules | that perform automatic actions (in its simplest form: if "this" happens, openHAB will do "that") | [click for more info on Rules]({{base}}/configuration/rules-dsl.html) |
| Sitemap | is the openHAB (software) generated user interface (web site) that presents information and allows for interactions | [click for more info on Sitemaps]({{base}}/configuration/sitemaps.html) |

While the table above gives an overview, please remember that it is incomplete and a simplification of openHAB for the sake of this overview.
More elements will be introduced in later chapters of the documentation. 
All the above [Concepts]({{base}}/concepts/index.html) are explained in more depth on other pages that can be accessed either through the sidebar or the links in the table above.

### Channels

Channels are for the logical link of a [Thing]({{base}}/concepts/things.html) to an [Item]({{base}}/concepts/items.html). 
Channels originate from [Things]({{base}}/concepts/things.html) definition and define how your [Thing]({{base}}/concepts/things.html) can communicate with [Item]({{base}}/concepts/items.html) (and vice versa). 
You will create channels when defining your [Thing]({{base}}/concepts/things.html).

During the definition of your [Thing]({{base}}/concepts/things) you will identify the channel to which your [Item]({{base}}/concepts/items.html) will be linked. 
These two steps ensure that openHAB can transmit the information from the [Thing]({{base}}/concepts/things.html) to the [Item]({{base}}/concepts/items.html) (and vice versa).

### Bindings

Bindings are software packages that are installed by the user in openHAB. 
The main purpose of Bindings is to establish the connection between your device and your [Thing]({{base}}/concepts/things.html). 
Bindings communicate with your device and translate all commands to and from openHAB between your device and your [Thing]({{base}}/concepts/things.html).

Bindings are provided at the [Add-on section](https://www.openhab.org/addons/) of this website. 
Here you will find a searchable list of several hundred bindings to support as many devices as possible. 
New bindings are regularly added as developers integrate more devices into openHAB.

For each binding, detailed instructions and examples are provided that include guidance on configuration (if any) of the binding itself, the definition of [Things]({{base}}/concepts/things.html) supported by this binding and the Channels these [Things]({{base}}/concepts/things) provide. 
In most cases, the description also contains a fully worked out example that includes a definition of [Things]({{base}}/concepts/things) and its Channels, [Items]({{base}}/concepts/items.html) linked to those Channels and the use of these [Items]({{base}}/concepts/items.html) in a sitemap.

## While you are getting started

To all newcomers: please read the section [New User Tutorial]({{base}}/tutorial). 
That section provides you with step-by-step instructions for your first easy setup. 

OpenHAB runs on most popular platforms such as Linux, Windows and MacOS and on almost any hardware ranging from Raspberry Pis to desktop computers and server PCs. 
You can find specific installation instructions for these and other platforms in the [Installation Overview]({{base}}/installation/index.html) article. 
If you have a strong preference towards a particular platform, then that platform is probably your best choice.

You can install openHAB on your desktop computer for evaluation purposes if you already have any of these systems available for use, but we recommend using a dedicated system in the long run. 
If you feel serious about home automation it may be better to start with a dedicated system right away.

For anyone undecided: many people find that the simplest way to experiment with openHAB is to get a [Raspberry Pi (Version 3 for the best experience)](https://raspberrypi.org) and install [openHABian]({{base}}/installation/openhabian.html); a "hassle-free openHAB setup". 
While openHABian offers a streamlined and simplified way to get up and running quickly, it is a complete openHAB home automation system easily capable of automating your entire home.
However, it is worth noting two potential limitations of Raspberry Pis. 
They are limited in RAM (memory) and may not perform well when additional database and data visualization programs are installed.
Running Raspberries from SD-cards only may result in system instabilities as these memory cards can degrade quickly under openHAB's use conditions. 

Once you have openHAB up and running, the [Configuration]({{base}}/configuration/index.html) article contains everything you need to know to get your openHAB installation talking to different devices around your home. 

You will quickly discover that you may want to learn more about Things, Channels, Items, and more. 
To do so, we highly recommend that you read the next chapter titled [Concepts]({{base}}/concepts/index.html). 
It provides a more in-depth descriptions of Things, Items, Bindings, etc. that will help you as you dive deeper into openHAB.

The amount of information provided here can be overwhelming, so please come back to these sections often as you develop your home automation system.

Along the way, you may have some questions; the openHAB community is here to help.

## The openHAB Community

openHAB is not just software - it is also a **community** of users, contributors and maintainers, working together on an open-source, interoperable approach to home automation. 
The center of this community is the [openHAB community forum](https://community.openhab.org). 
It is an active and responsive community of developers and maintainers who generally respond quite quickly to forum questions. 

Remember that openHAB is an open-source development, driven exclusively by volunteers. 
Please be kind and courteous, it will be most appreciated by those that will try to help you.

In many occasions, you will notice that your problem has already been raised by others; and discussed and resolved by the community before. 
You can search previous conversations and issues to see if your question has already been answered. 
It is best practice and generally considered to be good etiquette to check fairly thoroughly before posting your own question.

If it is your first time posting a question, please read [How to help us helping you](https://community.openhab.org/t/how-to-ask-a-good-question-help-us-help-you/58396) for information on what information you will need to provide.

## Putting it into Practice

Once you are getting a first overview, it is time to practice. 
Here a short list of the steps that you will need to consider to get openHAB up and running as your home automation system:

1. Install openHAB
2. If you already own a smart device, search the addons for the brand or technology used by that device (or simply browse the list of [add-ons](/addons/) for any technologies or services you may recognize) 
3. Install a binding (in openHAB)
4. Define a “thing”
5. Add a “channel” to the “thing” if not created by the binding
6. Define an “item”
7. Link the “channel” to your “item”
8. Establish a sitemap

Most of the above can be done in openHAB through point-and-click processes in a graphical user interface. 
But remember, there is always more than one way to achieve your goal in openHAB. 

A final word for the DIY enthusiasts. openHAB is very flexible and can support many DIY devices. 
However, you will quickly realize that DIY often literally means that you _"do it yourself"_. 
Working with DIY solutions often requires a deeper level of understanding, as well as more patience and perseverance than the integration of ready-to-use devices from commercial providers. 
The choice is yours of course, but you will need to be prepared spending either money or time (and sometimes both) to make your home automation goals a reality. 
And quite often, the investment will be significant.

Don’t give up, openHAB is very powerful and flexible and most likely can help you achieve your home automation goals, whichever they are. 
But it comes with a rather steep learning curve.

## A deeper dive: openHAB Structure for advanced users

openHAB 2 is developed in [Java](https:/www.java.com/) and uses [OSGi](https://www.osgi.org/) for modularity. 
[Apache Karaf](http://karaf.apache.org/) serves as a container with [Eclipse Equinox](https://www.eclipse.org/equinox/) as the OSGi runtime environment. 
[Jetty](https://www.eclipse.org/jetty/) is included as an HTTP server.

openHAB is highly modular software that can be extended through "Add-ons". 
Add-ons give openHAB a wide array of capabilities, from User Interfaces, to the ability to interact with a large and growing number of physical Things. 
Add-ons may come from the openHAB 2 distribution, the legacy openHAB 1 distribution or from any other external source.

If you are new to openHAB, we suggest you continue to the [Concepts]({{base}}/concepts/index.html) chapter where we introduce many fundamental ideas that are used throughout openHAB.
