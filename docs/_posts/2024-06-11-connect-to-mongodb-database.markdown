---
layout: post
title: "Connect to MongoDB with Java"
date: 2024-06-12 00:54:09 -0400
categories: homepage
author: Lorie Moffitt
tags: MongoDb, Java
---
---
<h1>Create Maven Java Project in IntelliJ</h1>
Create a new Java Project in IntelliJ and use Maven Archetype. You can also change your GroupId to set your package structure. 

<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/new_project.jpg">
</p>

Locate the pom.xml file and add the MongoDB dependency to your list of dependencies. Add the following dependency to your dependencies section. 

```
<dependency>
        <groupId>org.mongodb</groupId>
        <artifactId>mongodb-driver-sync</artifactId>
        <version>4.7.1</version>
</dependency>
```

<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/pom.jpg">
</p>

After editing your pom.xml you need to reload your maven project.  If the Maven window is not visible, click the Maven tab on the far right of the screen (highlighted below). Next refresh the Maven project by clicking the refresh button (highlighted below). 

<p align="center" width="100%">
    <img width="50%" src="/homepage/assets/images/maven_tab.jpg"><img style="vertical-align:top" 
 width="50%" src="/homepage/assets/images/reload_maven.jpg">
</p>

<h1>Create the Connection class</h1>
Create a new java class named Connection like the class below

```
package com.mongodb.quickstart;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Connection {

    public static void main(String[] args) {
        String connectionString = System.getProperty("mongodb.uri");
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }
    }
}
```
<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/connection_class.jpg">
</p>
<h1>Obtain Connection string from MongoDB Atlas</h1>
Login to MongoDB Atlas to obtain your connection string.
Log into your Atlas Cluster and click "Database" on the left, then click the Connect button in the middle of the screen (shown below). 

<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/connect_button.jpg">
</p>

Next, click the "Drivers" button and then copy the connection screen near the bottom. 
<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/connection_string.jpg">
</p>

<h1>Switch back to IntelliJ</h1>

Edit the Run configuration to add the mogodb.uri property to the VM options.  From the top menu select Run->Edit Configurations.  Add a new Application configuration.  Select your main class to be the Connection class we created.  Add a section for VM Options. Enter the following into the VM options field: 

```
-Dmongodb.uri="mongodb+srv://<user>:<password>@cluster0.xvwd3di.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
```

Be sure to change the **<user>:<password>** section to contain the user and password to your MongoDB database. 

<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/edit_run_config.jpg">
</p>

Run your application.  You should see the list of databases upon success. 

<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/success.jpg">
</p>

