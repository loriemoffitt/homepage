---
layout: post
title:  "Angular 17 Initial Setup"
date:   2026-05-18 00:54:09 -0400
categories: homepage
permalink: /2024/06/12/angular_setup.html
author: Lorie Moffitt
tags: Angular 17
---
<!--<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/mongodb_logo.jpg">
</p>-->
---
Follow this tutorial and setup Angular 17 and test environment. 

## Requirements
### Node.js 

Ensure Node.js is installed on your system and current version is v18.13 or higher. 
Verify by running 

`node -v`

in the terminal. If not installed, download it from the [Node.js website](https://nodejs.org/en/download).

Also insure TypeScript version 5.2 or greater is installed.  After installing Node you can now run the following commands to install/update TypeScript

`npm install -g typescript`

verify the version
`tsc -v`

## Now ready to install Angular 17

`npm install -g @angular/cli`

## Generate project structure

`ng new first-app`
`cd first-app`

## Serve it up

`ng serve`

open 
[http://localhost:4200](http://localhost:4200)

##  Make a change in default component

``@Component({
 selector: 'app-root',
 template: `<h1>Hello Angular 17!</h1>`,
 styleUrls: ['./app.component.css']
})
export class AppComponent {
 title = 'first-app';
}``

Save changes and see them live, no need to restart server.

[Angular Website](https://angular.dev/tutorials/first-app)

