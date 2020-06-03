# migrate-reactive-modules
Demonstration how to move from monolith application server jars, wars to reactive modules based on Spring Webflux.

This repository is used to explain the following talk:

## Evolve to Reactive; A performance history

In this session, attendees will learn about a real-world evolution to a reactive way; we will show how we migrate a huge EAR Core Banking Application covering tips and tricks of an experience of an evolution the Application and how we evolve to a modern reactive modules; tips, tricks, pros, cons and the reasons for being involved on move forward and present sample code and explain the security concerns on this evolution. We will be using snippets code based on JAVA, JWT, JWS, Auth0, Spring Boot, Reactor and Webflux deployed to Cloud.

# Requirements

- JDK 11 or 12; for run on JDK 13 or 14 there is an error for gradle you can refer to the [Issue](https://github.com/gradle/gradle/issues/10248)
- [BlockHound](https://github.com/reactor/BlockHound)

# Steps

## 1) Enterprise Java application that need a JBOSS Aplication Server

At the branch EAR-App; we have an Enterprise Java Application that it is our point to start.

### Requirements

- JDK 8
- JBOSS Enterprise Application Server Version 6 or 7

### Compile

To Compile de application we are going to run maven at the console:

``
mvn clean package
``

### Deploy

To deploy the EAR file from the target folder; copy and paste it to the $JBOSS_HOME/deploy folder.

## 2) Spring MVC Rest API and Spring Data to connect to the database

At the branch Spring-MVC we just migrate the application to a Spring project and we dont need anymore the JEE Application Server because we are using Springboot to launch our application as a fat or uber jar.

### Compile

To compile you need gradle instaleed; and then, run on the console:

``
gradle bootRun
``

### Run

To run the application just go to the build/lib folder and execute on the console:

``
java -jar monolith-migrate-to-reactive-modules-0.0.1-SNAPSHOT.jar
``

## 3) Reactive API and Blocked JDBC Connection

At the reactive-jbdc-blocked branch the application is running with Webflux over Netty but producing blocking threads to connect via JDBC to the Database. 

## 4) Reactive API and non blocking R2DBC Connection to the database

At the Master branch the application is running with Webflux over Netty with R2DBC conection to a H2SQL database.


