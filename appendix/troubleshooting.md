---
layout: documentation
---

{% include base.html %}

# Troubleshooting Guide

## Add-Ons cannot be installed

Add-Ons to openHAB may be installed from remote repositories. If you miss add-ons or the installation of an add-on is not working most probably you have problems accessing the associated remote repository. In such cases your maven `settings.xml` contains settings that prevent openHAB to access the repository. Try to rename or delete your maven `settings.xml` (located in `~/.m2`) and try again to install your add-on. 

