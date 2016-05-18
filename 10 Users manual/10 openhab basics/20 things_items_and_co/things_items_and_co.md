# Things, items and Co

OpenHab 2 introduces two levels to describe the devices : things and items.

The following illustrates the difference between them.

## One device to manage two lights

This corresponds to one double-switch device.

![](images/thing-devices-1.png)


## One device to manage one light and a switch

This corresponds to a device with one switch, with an entry for a mechanical switch.

![](images/thing-devices-2.png)

## Naming convention

Naming things and items in a consistent way is important in order to help maintaining the system from time to time.

Here is the one I propose, based on the way I think to the devices when I need to find them:

* first of all, I am working in a room - for example, the living-room that we will call *living*
* in this room, I have a thing that allows to switch two lights - lets call this *light*
* the two items are a main light and an ambient light - let's call them *main* and * ambient

So:
* the thing will be named *living-light*
* the main light will be the item named *living-light-main*
* the ambient light will be the item named *living-light-ambient*

![](images/thing-device-naming.png)

## Real Life example

Real life *Things* comes sometimes with different kinds of items and can offers much more that 2 *Items*.

Let's do a real life example with a device, inspired by the FIBARO double switch model. It can be described this way :

* A switch #1 that has :
  * the switch #1, that we will use for main light,
  * an instant power consumption value linked to the switch #1
  * an total electricity consumption value linked to the switch #1
* A switch #2 that has :
  * the switch #2, that we will use for ambient light,
  * an instant power consumption value linked to the switch #2
  * An total electricity consumption value linked to the switch #2

So, this one *Thing* will create two sets of three *Items*, according the following :

![](images/name-device-example.png)







