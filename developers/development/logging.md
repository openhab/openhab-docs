---
layout: developersguide
title: Logging
---

{% include base.html %}

Logging
=======

## Introduction

During development you might want to change the logging configuration in order to debug your application and the underlying framework or services.

openHAB is using a combination of the Simple Logging Facade for Java ([slf4j](http://www.slf4j.org/)) and a [logback](http://logback.qos.ch/) implementation. In this page we will give a few tips on how you can use and configure the logger to suit your needs.

## Set up Logging

In order to enable logging in your run configuration, you have to add the following bundles to the runtime configuration:

- org.slf4j.api;
- ch.qos.logback.classic;
- ch.qos.logback.core;
- ch.qos.logback.slf4j.

In your bundle, you will depend only on the `org.slf4j` package, so add it as a dependency in the `Import-Package` header of the `MANIFEST.MF` file.

You can use a logger the following way:

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
  static Logger logger = LoggerFactory.getLogger(this.getClass());
  public static void main(String[] args) {
    logger.info("Hello World");
  }
}
```

## Logback Configuration File

If we have setup the logging by just adding the bundles above we will end up in a logging with default configuration. In order to define custom logging configuration we can prepare a logging configuration file.

The configuration file for openHAB is placed in the [openhab-distro/lauch/home/logback_debug.xml](https://github.com/openhab/openhab-distro/blob/fa20ddb3555873ea98fe9fc5a5c0c28bf33003d5/launch/home/logback_debug.xml) file. We have added a few comments on this file in order to attract your attention on some significant points:

```xml
<configuration scan="true">

	<!-- This is the appender that displays the logging on the console -->
	<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
		<encoder>
			<!-- This pattern will display the time, the log level, the name of the logger and the log message -->
			<pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%-5level] [%-30.30logger{36}:%-5line] - %msg%ex{10}%n</pattern>
		</encoder>
	</appender>

	<!-- Another appender that logs into a file -->
	<appender name="FILE" class="ch.qos.logback.core.FileAppender">
		<file>${openhab.logdir:-userdata/logs}/openhab.log</file>
		<encoder>
			<pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%-5level] [%-30.30logger{36}:%-5line] - %msg%ex{10}%n</pattern>
		</encoder>
	</appender>

	<!-- We have removed part of the original file in this example -->
	...

	
	<logger name="smarthome.event" level="INFO" additivity="false">
		<!-- The element <logger> may contain zero or more <appender-ref> elements -->
		<appender-ref ref="EVENTFILE" />
		<appender-ref ref="STDOUT" />
	</logger>

	<!-- Logback uses inheritance to determine the log level.
 		If a given logger is NOT assigned a level it inherits one from the its closest ancestor -->
	<logger name="org.openhab" level="DEBUG" />
	<logger name="org.eclipse.smarthome" level="DEBUG" />

	<logger name="org.eclipse.jetty" level="INFO" />
	<logger name="org.jupnp" level="ERROR"/>
	<logger name="javax.jmdns" level="OFF"/>
	<logger name="javax.jmdns.impl" level="OFF"/>
	<logger name="javax.jmdns.impl.constants" level="OFF"/>
	<logger name="tuwien.auto.calimero" level="WARN" />

	<!-- The root logger is at the top of the logger hierarchy. 
			All loggers inherit its level, if there are no ancestors 
			between the root and the logger --> 
	<root level="INFO">
		<appender-ref ref="FILE" />
		<appender-ref ref="STDOUT" />
	</root>

	<logger name="OSGi" level="OFF" />
	
</configuration>

```

If you are not aware of the different [log levels](http://logback.qos.ch/manual/architecture.html#effectiveLevel), [appenders](http://logback.qos.ch/manual/appenders.html) and [logger elements](http://logback.qos.ch/manual/configuration.html#loggerElement), you might want to take a look at the links to the the logback documentation.

If you want to change the logger's configuration, you might change the content of this file, but a better approach will be to make a copy of this file and apply the changes in the new file.

The path to the logging file is passed as an argument to the JVM, so if you want to use different configuration file, you have to change the property `-Dlogback.configurationFile` with the path to the new file in the run configuration that you are using.

## Configuration

There are several things, that you might want to change in the configuration:

- the log level for a logger;
- the pattern of an appender;
- redirect the log to a text file.

### Setting up the Log Level

As you can see from the example configuration file above, the level for jUPnP is set to ERROR. If you develop a binding that is using jUPnP, you might want to see more logs on your console. You can simply change the log level to TRACE or DEBUG:

```xml
<logger name="org.jupnp" level="TRACE"/>
```

### Changing the Pattern of an Appender

Another useful option is to change the pattern of an appender. This pattern defines what information will be logged. The logback logger provides many [predefined conversation words](http://logback.qos.ch/manual/layouts.html#conversionWord) for the most common use cases. Use the most appropriate ones for your specific case. For the purpose of exploring and debugging multi threaded applications you might need to see which thread has generated certain log event. In order to see this in the logs, you have to add the conversion word `t` to the pattern above:

```xml
<pattern>%t %d{yyyy-MM-dd HH:mm:ss.SSS} [%-5level] [%-30.30logger{36}:%-5line] - %msg%ex{10}%n</pattern>
```

### Redirect the Log to a Text File

You might want to redirect your log to a text file. This gives you the flexibility to search easier for a specific log or to save your logs. If you have looked at the [default configuration file](#logback-configuration-file) you might have noticed that several appenders are listed there. The process of redirecting the log to a text file is as simple as :

- adding a new `FileAppender` and specifying the path of the output file:

```xml 
<appender name="YOUR_APPENDER_NAME" class="ch.qos.logback.core.FileAppender">
<file>relative/path/to/file.log</file>
	<encoder>
		<!--Pick up a pattern that will log the information taht you will need -->
		<pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%-5level] [%-30.30logger{36}:%-5line] - %msg%ex{10}%n</pattern>
	</encoder>
</appender>
```
- adding your logger, setting up the log level and adding `appender-ref` element to the logger element. For this example we will assume that you want to add the following logger with the name `com.logger.example`:

```xml
<logger name="com.logger.example" level="INFO">
	<appender-ref ref="YOUR_APPENDER_NAME" />
</logger>
```

## Further Reading

- <http://www.slf4j.org/>
- <http://logback.qos.ch/>
- <http://www.slf4j.org/manual.html>
- <http://stackoverflow.com/questions/6699537/how-to-use-multiple-configurations-with-logback-in-a-single-project>
