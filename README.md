# migrate-reactive-modules
Demonstration how to move from monolith application server jars, wars to reactive modules based on Spring Webflux.

This repository is used to explain the following talk:

## Evolve to Reactive; A performance history

In this session, attendees will learn about a real-world evolution to a reactive way; we will show how we migrate a huge EAR Core Banking Application covering tips and tricks of an experience of an evolution the Application and how we evolve to a modern reactive modules; tips, tricks, pros, cons and the reasons for being involved on move forward and present sample code and explain the security concerns on this evolution. We will be using snippets code based on JAVA, JWT, JWS, Auth0, Spring Boot, Reactor and Webflux deployed to Cloud.

# Requirements

- JDK 11 or 12; for run on JDK 13 or 14 there is an error for gradle you can refer to the [Issue](https://github.com/gradle/gradle/issues/10248)
- Docker to deploy as Containerize Applications
- [BlockHound](https://github.com/reactor/BlockHound)

# Steps

## 1) Enterprise Java application that need a JBOSS Aplication Server

At the branch EAR-App

## 2) Spring MVC Rest API and Spring Data to connect to the database

At the branch Spring-MVC

## 3) Reactive API and Blocked JDBC Connection

At the reactive-jbdc-bloked branch the application is running with Webflux over Netty but producing blocking threads to connect via JDBC to the Database. 

## 4) Reactive API and non blocking R2DBC Connection to the database

At the Master branch the application is running with Webflux over Netty with R2DBC conection to a postgreSQL database.


