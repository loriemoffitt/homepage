---
# Feel free to add content and custom Front Matter to this file.
# To modify the layout, see https://jekyllrb.com/docs/themes/#overriding-theme-defaults

layout: default
---
<h2>Tutorials</h2>
<ul>
  {% for post in site.posts %}
    <li>
      <a href="{{ site.baseurl }}{{ post.url }}">{{ post.title }}</a>
    </li>
  {% endfor %}
</ul>
<h2>Java Examples and Exercises</h2>
<ul> 
  <li><a href="./java_exercises/variables_and_types/">Java Variables and Types Exercises</a></li>

    
  <li><a href="./java_exercises/decisions/">Java Decision Exercises</a></li>

<li><a href="./java_exercises/repetition/">Java Repetition Exercises</a></li>
<li><a href="./java_exercises/arrays/">Java Array Exercises</a></li>
</ul>
<h2>Presentations</h2>
<ul>
  <li>
    <a href="https://dl.acm.org/doi/10.5555/771322.771371">Teaching e-business with Enterprise JavaBeans</a>
  </li>
</ul>
<h2>Publications</h2>
<ul>
  <li>
    <a href="https://switchthefuture.com/2018/08/01/3-moves-that-will-help-you-hire-women-in-stem/">3 Moves That Will Help You Hire Women in STEM</a>
  </li>
  <li>
    <a href="https://dl.acm.org/doi/10.5555/771322.771352">Degree or certification: what do faculty think?</a>
  </li>
  <li>
    <a href="https://dl.acm.org/doi/10.5555/1267524.1267537">Collaborative client-server architectures in Tcl/Tk: a class project experiment and experience</a>
  </li>
  <li>
    <a href="https://ui.adsabs.harvard.edu/abs/2002SPIE.4725..372R/abstract">Fault-tolerant extensible approach to improving spectral analysis throughput via parallel/distributed processing</a>
  </li>
</ul>

<h2>Notes from Live Training Sessions</h2>
<ul>
  <li>
    <a href="https://github.com/loriemoffitt/lessons/wiki/Java-OOP-Concepts">Java OOP Concepts</a>
  </li>
  <li>
    <a href="https://github.com/loriemoffitt/lessons/wiki/Java-Debugging-with-IntelliJ">Java Debugging with IntelliJ</a>
  </li>
  <li>
    <a href="https://github.com/loriemoffitt/lessons/wiki/Working-with-Relational-Data-in-SQL">Working with Relational Data in SQL</a>
  </li>
<li>
  <a href="https://github.com/loriemoffitt/lessons/wiki/Efficient-Programming">Efficient Programming Tips</a>
</li>
  <li>
    <a href="https://github.com/loriemoffitt/lessons/wiki/Essential-Diagrams-for-Software-Programmers">Essential Diagram for Software Programmers</a>
  </li>
</ul>
<h2>Examples </h2>
<ul>
  <li>
    <a href="https://github.com/loriemoffitt/MongoDBJavaExample">MongoDB Java Example</a>
  </li>
</ul>
