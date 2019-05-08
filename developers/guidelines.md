---
layout: developersguide
title: Coding Guidelines
---

{% include base.html %}

# Coding Guidelines
{:.no_toc}

The following guidelines apply to all (Java) code of the openHAB project.
They must be followed to ensure a consistent code base for easy readability and maintainability.
Exceptions can certainly be made, but they should be discussed and approved by a project maintainer upfront.

Note that this list also serves as a checklist for code reviews on pull requests.
To speed up the contribution process, we therefore advice to go through this checklist yourself before creating a pull request.

If you are just keen on binding development, you may skip this document first and come back later.

{::options toc_levels="2,3"/}
* TOC
{:toc}

## A. Directory and File Layout

The following directory and file layout must be respected:

```
.
+-- pom.xml  The buildsystem (maven) file that contains the version and name of your extension
|
+-- NOTICE   License information
|            3rd party content has to be given in the NOTICE file.
|
+-- lib      3rd party jar files - Avoid those, use maven dependencies instead
|
+-- src      Your source code
|   +-- main/jave/...            The java sources
|   +-- main/resources/ESH_INF/  Binding and config xml description files like binding.xml
|   +-- main/resources/...       Other resource files
|   +-- test/jave/...            Your test code
```

1. The [Java naming conventions](http://java.about.com/od/javasyntax/a/nameconventions.htm) should be used for source files.
1. Every Java file must have a license header. You can run ```mvn license:format``` on the root of the repo to automatically add missing headers.
1. Code must be formatted using the "ESH" code formatter (in Eclipse).
   - This is set up automatically by the official [IDE setup](ide.html)
   - You can manually import <a href="ESH.xml" download>ESH.xml</a> via Eclipse Preferences -> Java -> Code Style -> Formatter.

## B. Code Style

* Generics must be used where applicable. See example below:

```java
public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2){
		return g1.get().equals(g2.get());
}
```

* Code MUST not show any warnings.
  Warnings that cannot be circumvented should be suppressed by using the `@SuppressWarnings` annotation.
* Your classes are generally organised within an internal package

```
org.openhab.binding.coolbinding.internal
org.openhab.binding.coolbinding.internal.handler
org.openhab.binding.coolbinding.internal.discovery
```

Remember that classes that are meant to be used by scripts or other bindings must be non internal.

* Every class, except data-transfer-objects (DTO), must be annotated with `@NonNullByDefault`.
  For details see [Null annotation](#null-annotations).
* OSGi Declarative Services annotations are to be used

```java
@Component(service=MyCoolService.class)
public class MyCoolService {
   @Reference
   private @NonNullByDefault({}) ItemRegistry itemRegistry;
}
```

## C. Documentation

JavaDoc is required to describe the purpose and usage of every:

* class,
* interface,
* enumeration (except inner classes and enums),
* constant, field and method with visibility of default, protected or public.

An @author tag is required within the JavaDoc for every author who made a substantial contribution to the file.
New @author tags should be placed below the older ones.
Data-transfer-objects (DTOs map from Json/XML to Java classes) do not require JavaDoc.

## D. Language Levels and Libraries

1. openHAB generally targets the long time supported Java 8 and Java 11 releases with the following restrictions:
 * To allow optimized runtimes, the set of Java packages to be used is further restricted to [Compact Profile 2](http://www.oracle.com/technetwork/java/embedded/resources/tech/compact-profiles-overview-2157132.html)
2. The [OSGi R5](http://www.osgi.org/Download/Release5) release is targeted, and newer features should not be used.
3. slf4j is used for logging.

You might also have the need to use other libraries for specific use cases like XML processing, networking etc.
See [Default libraries](#default-libraries) for more details.

## E. Runtime Behavior

1. Overridden methods from abstract classes or interfaces are expected to return fast unless otherwise stated in their JavaDoc. Expensive operations should therefore rather be scheduled as a job.
1. Creation of threads must be avoided. Instead, resort into using existing schedulers which use pre-configured thread pools. If there is no suitable scheduler available, start a discussion in the forum about it rather than creating a thread by yourself. For periodically executed jobs that do not require a fixed rate [scheduleWithFixedDelay](http://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ScheduledExecutorService.html#scheduleWithFixedDelay(java.lang.Runnable,%20long,%20long,%20java.util.concurrent.TimeUnit)) should be preferred over [scheduleAtFixedRate](http://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ScheduledExecutorService.html#scheduleAtFixedRate(java.lang.Runnable,%20long,%20long,%20java.util.concurrent.TimeUnit)).
1. Bundles need to cleanly start and stop without throwing exceptions or malfunctioning. This can be tested by manually starting and stopping the bundle from the console (```stop <bundle-id>``` resp. ```start <bundle-id>```).
1. Bundles must not require any substantial CPU time. Test this e.g. using "top" or VisualVM and compare CPU utilization with your bundle stopped vs. started.

## F. Logging

This section explains some logging usage patterns.
The logger that is used allows logging at multiple severity levels (trace, info, debug, warn, error).
Most of the time, a level of `warn` or `debug` will be used.
Please remember that every logging statement adds to code size and runtime cost.

* Loggers should be [non-static](http://slf4j.org/faq.html#declared_static), when ever possible and have the name ```logger```.

```java
class MyCoolClass {
   private final Logger logger = LoggerFactory.getLogger(MyCoolClass.class);
}
```

* Parametrized logging must be used (instead of string concatenation).

```java
void myFun() {
  String someValue = "abc";
  int someInt = 12;
  
  logger.log("Current value is {} and int is {}", someValue, someInt);
}
```

* Exceptions with stacktraces in the log are considered to be bugs in your binding that should be reported and fixed.
If you add an exception as a last parameter to the logging, the stack trace will be printed.
Configuration errors by users should only print log messages about what's wrong. In that case you would use `e.getMessage()`.

```java
void myFun() {
  try {
    doSomething();
  } catch (IOException e) {
    logger.warn("Explain what went wrong and how to avoid it. You can have arguments {}.", someVariable, e);  
  }
}
```

* Logging is not a replacement for using the debugger.

```java
void myFun() {
  logger.trace("Enter myfun"); // DONT, DONT, really DONT do that
  doSomething();
  logger.trace("Leave myfun"); // DONT, DONT, really DONT do that
}
```

* Logging is not a replacement to use respective `update*` methods of the framework

```java
void myFun() {
  logger.debug("And now the thing goes online"); // DONT, DONT, really DONT do that
  updateState(ThingState.ONLINE);
}
```

Please keep the user informed through those `update*` methods, when a connection drops, device is not accessible, etc.
Do not over use the logger.

* `warn` logging should only be used
  - to inform the user that something seems to be wrong in his overall setup, but the system can nonetheless function as normal,
  - in recoverable situations when a section of code that is not accessed under normal operating conditions is reached.

* `error` logging is not allowed in extensions and is purely reserved to the framework.
   The only exception would be if something is going really, really wrong in your extension,
   and there is a possibility that the stability of the framework could be affected.

## Guideline details

This sections provides some background and more detailed information about parts of the guideline.

### Static Code Analysis

The openHAB Maven build includes [tooling for static code analysis](https://github.com/openhab/static-code-analysis) that will validate your code against the Coding Guidelines and some additional best practices.
Information about the checks can be found [here](https://github.com/openhab/static-code-analysis/blob/master/docs/included-checks.md).

The tool will generate an individual report for each bundle that you can find in `path/to/bundle/target/code-analysis/report.html` file and a report for the whole build that contains links to the individual reports in the `target/summary_report.html`.
The tool categorizes the found issues by priority: 1(error),2(warning) or 3(info).
If any error is found within your code the Maven build will end with failure.

You will receive detailed information (path to the file, line and message) listing all problems with Priority 1 and 2 on the console.

### Null Annotations

[Null annotations](https://wiki.eclipse.org/JDT_Core/Null_Analysis) are used from the Eclipse JDT project.

Those annotations help the compiler and our static code analyser to figure out if a potential null pointer access would happen in your code.

Classes (except data transfer objects (DTO)) must be annotated with `@NonNullByDefault`:

```java
@NonNullByDefault
public class MyClass(){}
```

This forces you to think about every field in your class if it can be null at any point, or should rather be default initialized.
If you have fields that are neither marked as nullable, nor are initialized, the code will not compile.

Fields that can be null are to be annotated like this:

```java
private @Nullable MyType myField;
```

The compiler will force you to check if `myField` is null, before using it:

```java
private void myFunction() {
  final MyType myField = this.myField; // You need a local copy of the field for thread safety.
  if (myField != null) {
    myField.soSomething();
  }
}
```

Methods should be annotated as follows:

```java
private @Nullable MyReturnType myMethod(){};
```

If you reference an OSGi service, OSGi will already make sure that the field is non-null.
The compiler doesn't know about that fact though.
You must therefore disable null-checks for such references:

```java
@Reference
private @NonNullByDefault({}) MyService injectedService;
```

### Default Libraries

In order to not have every binding use a different library, the following packages are available by default:

For XML Processing

* com.thoughtworks.xstream
* com.thoughtworks.xstream.annotations
* com.thoughtworks.xstream.converters
* com.thoughtworks.xstream.io
* com.thoughtworks.xstream.io.xml

For JSON Processing

* com.google.gson.*

For HTTP Operations

* org.eclipse.jetty.client.*
* org.eclipse.jetty.client.api.*
* org.eclipse.jetty.http.*
* org.eclipse.jetty.util.*

Note: HttpClient instances should be obtained by the handler factory through the HttpClientFactory service and unless there are specific configuration requirements, the shared instance should be used.

For Web Socket Operations

* org.eclipse.jetty.websocket.client
* org.eclipse.jetty.websocket.api

Note: WebSocketClient instances should be obtained by the handler factory through the WebSocketClientFactory service and unless there are specific configuration requirements, the shared instance should be used.

Additionally these libraries are allowed

* Apache Commons IO
* Apache Commons Lang
