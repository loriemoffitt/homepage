---
layout: post
title:  "How to use VMWare to run Windows and use Microsoft Access on a Mac"
date:   2026-10-22 11:32
categories: homepage
permalink: /2024/06/12/vmware_on_mac.html
author: Lorie Moffitt
tags: VMWare, virtual machine, run windows on mac, use access on a mac
---
<!--<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/mongodb_logo.jpg">
</p>-->
---
Follow this tutorial to set up a virtual environment on your Mac so you can run Microsoft Access.   Microsoft Access has NO Mac compatible version.  I've never really used Access much, 
and I have MS Word, PowerPoint, Excel, Teams and probably a few more Microsoft products :) So I just assumed I could get Access somehow on my Mac. But thats a big NOPETY NOPE.  So..  I had to 
improvise and decided to install a virtual machine to run Windows so I could get to Access.  It's a learning experience on Virtual Environments if anything.  But, regardless, not as trivial 
as I thought it should have been.  So here was my experience using VMWare Fusion to install a virtual machine running Windows on my Mac mini so I could run Microsoft Access in order to teach the kids Access.  

Struggles
#downloading
#what to do now?? do I create a new virtual machine? I did that and it had no operating system!! OOps :p So nope not that option.  I deleted that VM and went back to step 1, this time 
selecting to download windows, seemed right but I figured I would have to pay or lie or find an old windows key somewhere... ugh.  BUt I clicked download windows and it started downloading
so we're good.   But then it kept failing and failing and failing.... this is when I figured out the reason it was failing was because I was almost out of storage... geez.  

#disk space


## Requirements

---

### Node.js 

Ensure [Node.js](https://nodejs.org/en/download) is installed on your system and current version is v18.13 or higher. 
You can install/update it using [NVM](https://github.com/nvm-sh/nvm).  Install NVM and verify with

    nvm -v

Install the latest Node.js version using

    nvm install node

Switch to the desired version

    nvm use 20

<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/nodejs_install.jpg">
</p>
---

### TypeScript

Also insure TypeScript version 5.2 or greater is installed.  After installing Node you can now run the following commands to install/update TypeScript

    npm install -g typescript

verify the version

    tsc -v
    
<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/typescript_install.jpg">
</p>
---

## Install Angular 17

    npm install -g @angular/cli 

## Generate project structure

    ng new first-app
    cd first-app

## Serve it up

    ng serve

<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/angular_install.jpg">
</p>
---

open [http://localhost:4200](http://localhost:4200) to test

<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/localhost.jpg">
</p>
---

##  Change default component

 Use Vi or Nano to edit `src\app\app.component.ts`

<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/edit_component.jpg">
</p>
---

    @Component({
     selector: 'app-root',
     template: `<h1>Hello Angular 17!</h1>`,
     styleUrls: ['./app.component.css']
    })
    export class AppComponent {
     title = 'first-app';
    }

Save changes and see them live, no need to restart server.

<p align="center" width="100%">
    <img width="75%" src="/homepage/assets/images/refresh.jpg">
</p>
---

[Angular Website](https://angular.dev/tutorials/first-app)

