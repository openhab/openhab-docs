---
layout: developersguide
title: Coding Guidelines
---

{% include base.html %}

# Coding Guidelines

The following guidelines apply to all (Java) code of the openHAB project.
They must be followed to ensure a consistent code base for easy readability and maintainability.
Exceptions can certainly be made, but they should be discussed and approved by a project maintainer upfront.

Note that this list also serves as a checklist for code reviews on pull requests.
To speed up the contribution process, we therefore advice to go through this checklist yourself before creating a pull request.

## A. Directory and file layout

The following directory and file layout must be respected:

```
.
+-- pom.xml  The buildsystem (maven) file that contains the version and name of your extension
|
+-- NOTICE   license information
|            3rd party content has to be given in the NOTICE file.
|
+-- lib      3rd party jar files - Avoid to use those, use maven dependencies instead
|
+-- src      Your source code
|   +-- main/jave/...      The java sources
|   +-- main/resources/... Other resource files like the binding.xml
|   +-- test/jave/...      Your test code
```

1. The [Java naming conventions](http://java.about.com/od/javasyntax/a/nameconventions.htm) should be used for source files.
1. Every Java file must have a license header. You can run ```mvn license:format``` on the root of the repo to automatically add missing headers.
1. Code must be formatted using the "ESH" code formatter (in Eclipse).
   - This is set up automatically by the official [IDE setup](ide.html)
   - You can manually import [ESH.xml](ESH.xml) via Eclipse Preferences -> Java -> Code Style -> Formatter.

## B. Code Style

1. Generics must be used where applicable.
1. Code MUST not show any warnings. Warnings that cannot be circumvented should be suppressed by using the `@SuppressWarnings` annotation.
1. Packages that contain classes that are not meant to be used by other bundles MUST have "internal" in their package name.
1. Every class, except data-transfer-objects (DTO), must be annotated with `@NonNullByDefault`.
and `@Nullable` should be used, for details see [Null annotation](#null-annotations).
1. OSGi Declarative Services should be declared using annotations. 

## C. Documentation

The following is valid for every class, interface and enumeration (except inner classes and enums):

1. JavaDoc is required, describing the elements purpose and usage.
   Data-transfer-objects (DTOs map from Json/XML to Java classes) do not need JavaDoc.
1. An `@author` tag within the JavaDoc for every author that wrote a substantial part of the file is required.

We also require JavaDoc for

* every constant,
* field and
* method with default, protected or public visibility.

## D. Language Levels and Libraries

1. openHAB generally targets the long time supported Java 8 and Java 11 releases with the following restrictions:
 * To allow optimized runtimes, the set of Java packages to be used is furthermore restricted to [Compact Profile 2](http://www.oracle.com/technetwork/java/embedded/resources/tech/compact-profiles-overview-2157132.html)
2. The [OSGi R5](http://www.osgi.org/Download/Release5) release is targeted, no newer features should be used.
3. slf4j is used for logging
4. Some utility libraries are available which can be used throughout the code:
 - Apache Commons IO
 - Apache Commons Lang

## E. Runtime Behavior

1. Overridden methods from abstract classes or interfaces are expected to return fast unless otherwise stated in their JavaDoc. Expensive operations should therefore rather be scheduled as a job.
1. Creation of threads must be avoided. Instead, resort into using existing schedulers which use pre-configured thread pools. If there is no suitable scheduler available, start a discussion in the forum about it rather than creating a thread by yourself. For periodically executed jobs that do not require a fixed rate [scheduleWithFixedDelay](http://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ScheduledExecutorService.html#scheduleWithFixedDelay(java.lang.Runnable,%20long,%20long,%20java.util.concurrent.TimeUnit)) should be preferred over [scheduleAtFixedRate](http://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ScheduledExecutorService.html#scheduleAtFixedRate(java.lang.Runnable,%20long,%20long,%20java.util.concurrent.TimeUnit)).
1. Bundles need to cleanly start and stop without throwing exceptions or malfunctioning. This can be tested by manually starting and stopping the bundle from the console (```stop <bundle-id>``` resp. ```start <bundle-id>```).
1. Bundles must not require any substantial CPU time. Test this e.g. using "top" or VisualVM and compare CPU utilization with your bundle stopped vs. started.

## F. Logging

This section explains some logging usage patterns.
The used logger allows to log to different severity levels (trace, info, debug, warn, error).
Most of the time you want to use `warn` or `debug`. 
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

* Where ever exceptions are caught and logged, the exception should be added as a last parameter to the logging. 

```java
void myFun() {
  try {
    doSomething();
  } catch (IOException e) {
    logger.warn("Explain where we are in the code", e);  
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

Please keep the user informated via those `update*` methods if a connection drops etc and not abuse the logger.

* `warn` logging should only be used to inform the user that something seems to be wrong in his overall setup, but the system can nonetheless function as normal, while possibly ignoring some faulty configuration/situation. It can also be used in situations, where a code section is reached, which is not expected by the implementation under normal circumstances (while being able to automatically recover from it).

* `error` logging is not allowed in extensions and is purely reserved to the framework. Except if something is going really, really wrong in your extension and you are going to affect the framework stability.

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

This forces you to think about every field in your class if it can be null at any point, or should rather be default initialized. If you have fields that are neither marked as nullable, nor are initialized, the code will not compile.

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
The compiler doesn't know about that fact though. You must therefore disable null-checks for such references:

```java
@Reference
private @NonNullByDefault({}) MyService injectedService;
```
