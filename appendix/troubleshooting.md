---
layout: documentation
---

{% include base.html %}

# Troubleshooting Guide

## Feature Repositories

If adding a feature repository is not working or the repository cannot be resolved, your maven `settings.xml` probably contains settings that prevent openHAB to access the feature repository. Try the command `feature:repo-list` to see a list of configured feature repositories. If your configured repository is not there, rename or delete your maven `settings.xml` (located in `~/.m2`) and try again to add the repository.

```` 
openhab> feature:repo-list
Repository                                 | URL
---------------------------------------------------------------------------------------------------------------------
org.ops4j.pax.web-4.2.4                    | mvn:org.ops4j.pax.web/pax-web-features/4.2.4/xml/features
standard-4.0.4                             | mvn:org.apache.karaf.features/standard/4.0.4/xml/features
framework-4.0.4                            | mvn:org.apache.karaf.features/framework/4.0.4/xml/features
openhab-aggregate-xml                      | mvn:org.openhab.distro/openhab-aggregate-xml/2.0.0-SNAPSHOT/xml/features
openhab-addons-experimental-2.0.0-SNAPSHOT | mvn:org.openhab.addons/openhab-addons-experimental/LATEST/xml/features
```` 


