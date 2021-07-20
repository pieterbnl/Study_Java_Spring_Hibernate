package com.pbe;

/** Study on Spring & Hibernate
 * Following Udemy course Spring & Hibernate for Beginners by Chad Darby
 @author Pieter Beernink
 @version 1.0
 @since 1.0
 */

// *********************
// SPRING
// *********************

// Spring in a nutshell
// - Popular lightweight, easy to use, framework to simply building enterprise Java applications
// - Offering simple lightweight solution helper classes to make enterprise application development easier
// - Originally in J2EE: Enterprise Java Beans (EJB) which where very complex to implement and had poor performance
// - This made it fell out of favor and gave rise to Spring (~2004).
// Note: ECB later got improved (~2009, Java EE 7), but by then Spring was big already
// - Spring goals:
//   - Lightweight development with Java Plain Old Java Objects
//   - Dependency injection to promote loose coupling
//   - Declarative programming with Aspect-Oriented-Programming (AOP
//   - Minimize boilerplate Java code

// Spring overview
// https://docs.spring.io/spring-framework/docs/4.0.2.RELEASE/spring-framework-reference/html/overview.html
// Spring Framework is a Java platform that provides comprehensive infrastructure support for developing Java applications.
// Spring handles the infrastructure so you can focus on your application.
// Spring enables to build applications from "plain old Java objects" (POJOs) and to apply enterprise services non-invasively to POJOs
// The Spring Framework Inversion of Control (IoC) component provides a formalized means of composing
// disparate components into a fully working application ready for use.
// The Spring Framework 'codifies' design patterns as first-class objects that can be integrated into applications.
//
// Modules
// The Spring Framework consists of features organized into about 20 modules.
// Grouped into Core Container, Data Access/Integration, Web, AOP (Aspect Oriented Programming), Instrumentation, and Test.
// Using these building blocks makes that Spring can be applied to many scenario's.
//
// Core container (factory for creating beans, making them available and manage bean dependencies):
// - Core & Beans: provides the fundamental parts of the framework, including the IoC and Dependency Injection features.
// - SpEL: a powerful expression language for querying and manipulating an object graph at runtime
// - Context: builds on Beans & Core, provides a means to access objects in a framework-style manner that is similar to a JNDI registry
//
// Data Access/Integration (for communicating with the database)
// - JDBC: helper class, providing a JDBC-abstraction layer to make access to database easier
// - ORM: provides integration layers for popular Object Relational Mapping APIs, including JPA, JDO, and Hibernate
// - OXM: Object XML Mappers, to ease the mapping between java objects and XML documents
// - JMS: Java Message Service, contains features for producing and consuming messages
// - Transactions: add transaction support, makes heavy use of AOP behind the scenes
//
// Web (home of the Spring MVC framework)
// - Web: basic web-oriented integration features such as multipart file-upload functionality and the initialization of IoC container
// - Web-Socket
// - Web-Servlet: contains Spring’s model-view-controller (MVC) implementation for web applications
// - Web-Portlet: provides the MVC implementation to be used in a portlet environment and mirrors the functionality of Web-Servlet module
//
// Infrastructure
// - AOP: Aspect Oriented Programming (add functionality to objects declaratively - logging, security, transactions, etc.
// - Aspects: provides integration with AspectJ (an aspect-oriented programming (AOP) extension for Java)
// - Instrumentation: provides class instrumentation support and classloader implementations to be used in certain application servers
// - Messaging
//
// Test (Supports Test-Driven-Development, supporting the testing of Spring components with JUnit or TestNG)
// - Includes: Unit, Integration, Mock objects and out of container testing

// Spring projects
// https://spring.io/projects
// Additional Spring modules build on top of the core Spring Framework. For example:
// Spring Cloud: tools for common patterns in distributed systems (microservices)
// Spring Data: consistent approach to data access, -among others- relational and non relational
// Spring Batch: to simply and optimize batch operations
// Spring Security: providing authentication and authorization support
// Spring Web Flow: supports building web apps that feature controlled navigation
// Spring Web Services: for SOAP web services
// Spring HATEOS: creating REST representations that follow the HATEOAS principle

// Tomcat
// Tomcat 10 was released to support Jakarta EE 9, renaming packages from javax.* to jakarta.*
// Spring 5 does not yet support this package renaming and currently doesn't work on Tomcat 10
// Therefore when using Tomcat with Spring, latest version 9 is to be used

// Spring download
// https://repo.spring.io/ui/repos/tree/General/libs-release%2Forg%2Fspringframework
// Select Artifacts -> libs-release -> org -> springframework -> spring -> [choose version] and select spring-x.x.x-dist.zip
// Unzip that file and copy all .jar files that are present in the libs folder
// Paste all files in own to be created libs folder in your project
// Add JAR files to Java build path. IntelliJ:
// - Click File from the toolbar
// - Project Structure (CTRL + SHIFT + ALT + S on Windows/Linux, ⌘ + ; on Mac OS X)
// - Select Modules at the left panel
// - Dependencies tab
// - '+' → JARs or directories
// Alternatively: use Maven

// Inversion of Control (IoC) = outsource to an 'object factory'
// IoC is the approach of outsourcing the construction and management of objects
// Spring can be requested to provide an 'object factory', based on a configuration file or annotation
// It will then provide the appropriate implementation, essentially making the application configurable
//
// The primary functions of a Spring container:
// 1. Create and manage objects (Inversion of Control)
// 2. Inject object's dependencies (Dependency Injection)
//
// Three ways to configure a Spring container:
// 1. XML configuration file (legacy - still used by most legacy apps)
//    Specifies an bean id (is like an alias) + fully qualified class name of implementation class
//    For example: <beans...><bean id="myCoach" class="com.pbe.cyclingCoach"></bean></beans>//
// 2. Java annotations (modern)
// 3. Java source code (modern)
//
// Spring development process:
// 1. Configure Spring Beans (== a Java object; Spring beans are created as normal Java classes)
//    As per 1 of the 3 methods as mentioned.
//    In case of XML, this means configuring beans in an 'applicationContext.xml' file, placed in the Java src folder.
// 2. Create a Spring Container (generically known as ApplicationContext)
//    Specialized implementations are available. For example:
//    ClassPathXmlApplicationContext, AnnotationConfigApplicationContext, GenericWebApplicationContext, etc.
//    Example of creating a container, by passing the name of an xml configuration file (applicationContext.xml):
//    ClassPathXmlApplicationContext context = new ClassPAthXmlApplicationContext("applicationContext.xml");
// 3. Retrieve Beans from Spring Container
//    The application will request a certain object from the Spring Container.
//    Based on the configuration file, it will give an implementation of the given interface.
//    Example of retrieving a bean from spring container:
//    Coach coach = context.getBean("myCoach", Coach.class);
//    Note that the given name (myCoach) must match with the configuration file bean id.
//    Coach.class is the interface, with cyclingCoach being the implementation.

// Spring logging
// As per Spring 5.1, internal logging messages are by default set not to be shown.
// To make logging visible:
// 1. Create a bean to configure the parent logger and console handler
// 2. Configure the bean in the Spring XML config file



public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
