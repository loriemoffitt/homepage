---
layout: post
title: "Node JS with Fetch API and URI.js"
date: 2024-06-24 00:54:09 -0400
categories: homepage
author: Lorie Moffitt
tags: NodeJS, Fetch API, URI.js
---
---
<h1>Using FetchAPI with Node js and URI.js</h1>

To use [URI.js](https://www.npmjs.com/package/uri-js) and NodeAPi import the respective files. 



```
import URI from "urijs";
import fetch from "node-fetch";
```


Now you can construct the URI with the URIjs build and buildQuery functions. Notice that the color parameter is an array. 

```
var uri = URI.build({
     path: "http://localhost:3000/records",
     query: URI.buildQuery({
           limit: 10,
           "color[]": ["red", "blue"]
     })
 });
```

Now you can call the fetch function from the FetchAPi and pass in the URI created from the URI.js functions. 

```
const response = await fetch(uri);
if (response.ok)
  responseJson = await response.json();

if (!response.ok) 
 console.log("Error in response");


```

If there are no errors you can process the json response and then return a new Json object based on the results. 

```
var returnJson = [];

responseJson.forEach(function(item) {
    returnJson.ids.push(item.id);
    returnJson.primarys.push(item);
};
return returnJson;
```


