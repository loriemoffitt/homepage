---
layout: post
title:  "How to create a new MongoDB database"
date:   2024-06-11 00:54:09 -0400
categories: homepage
permalink: /2024/06/12/create_mongodb_database.html
author: Lorie Moffitt
tags: MongoDB
---
<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/mongodb_logo.jpg">
</p>
---
Today we are working on creating a new MongoDB database to use with our Java Application that we will set up in a later blog post. For this lesson we will assume you are brand new to MongoDB. 

## Create your MongoDB account and login

First you will need to [Create new MongoDB account or sign in with existing account here.](https://account.mongodb.com/account/register)

After creating your account and verifying your email address, log into [MongoDB Atlas](https://cloud.mongodb.com).

## Create and Deploy your free MongoDB cluster

After logging in you will see the screen below, lets create a free cluster by clicking the green "Create" button in the middle of the screen. 

<p align="center" width="100%">
    <img width="70%" src="/homepage/assets/images/create_cluster.jpg">
</p>

Select the Advanced Configuration button at the bottom of the screen.

<p align="center" width="100%">
    <img width="70%" src="/homepage/assets/images/advanced_config2.jpg">
</p>

Next select the free Shared button at the top.

<p align="center" width="100%">
    <img width="70%" src="/homepage/assets/images/free_shared.jpg">
</p>

Scroll down and make sure M0 Sandbox is selected.  Click "Create Cluster" at the bottom of the screen. 
<p align="center" width="100%">
    <img width="70%" src="/homepage/assets/images/m0_sandbox.jpg">
</p>

Enter an admin user and password and click "Create User".  
<p align="center" width="100%">
    <img width="70%" src="/homepage/assets/images/create_admin.jpg">
</p>

Your ip address should already be in the list so you can click "Finish and Close" button at the bottom. 

## Load Sample Dataset

Now, click the ellipses (...) in the middle of the screen to see the drop down menu and select "Load Sample Dataset". 
<p align="center" width="100%">
    <img width="70%" src="/homepage/assets/images/load_sample_data.jpg">
</p>

Click the "Load Sample Dataset" button in the popup to load the sample data. 

Verify that the sample dataset is loaded by clicking on the "Collections" tab in the center of the screen and browsing the collections. 
<p align="center" width="100%">
    <img width="70%" src="/homepage/assets/images/verify_data.jpg">
</p>


You are now ready to connect to your new MongoDB database with a Java application!
[Click here for the next tutorial](Connect-to-MongoDB-with-Java)
