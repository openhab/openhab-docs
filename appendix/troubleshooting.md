---
layout: documentation
---

{% include base.html %}

# Troubleshooting Guide

## Extensions cannot be installed

Extensions to openHAB (also called features) may be installed from feature repositories. If you miss extensions or the installation of an extension is not working most probably you have problems accessing the associated feature repository. In such cases your maven `settings.xml` contains settings that prevent openHAB to access the feature repositories. Try to rename or delete your maven `settings.xml` (located in `~/.m2`) and try again to find the extension. 

