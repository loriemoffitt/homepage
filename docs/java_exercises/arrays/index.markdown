<h2>Java Arrays</h2>
Array are used to store multiple values in one variable, similar to a list, instead of creating multiple variables for each object.  We can create arrays of Java Strings, ints, doubles or any other type. We use the square brackets to define an array. 

```
String[ ] cars;
int[ ] ages;
```

We can assign values to the array either implicityly or explicitly. To implicitly assign values to the array we use the curly braces. 
```
String[ ] cars = { "Toyota", "Dodge", "Ford", "BMW" };
```
And we can access each value of the array using the index number.
```
System.out.println(cars[0]);
```
To explicitly assign values to an array we use the index number to assign the value. We must also define the size of the array.
```
String[ ] favoriteFoods = new String[10];

favoriteFoods[0] = "Pizza";

favoriteFoods[1] = "Meatloaf";
```
If you try to access an index outside of the size of the array you will get an <a href="https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/lang/IndexOutOfBoundsException.htmlf">IndexOutOfBoundsException</a>. 

Looping thru an array is a common task and can be done with a for loop or a for-each loop. 

Looping thru an array with For loop: 
```
String[ ] cars = { "Toyota", "Dodge", "Ford", "BMW" };

for (int i=0; i < cars.length; i++) {
   System.out.println(cars[i]);
}
```
Looping thru an array with For-each loop:
```
for (String i: cars) {
   System.out.println(i);
}
```
Create a String array containing 10 names.  Loop thru the array to print out each name.  
Create an integer array containing 10 ages, loop thru the array to calculate the total of all the ages and then find the average age.  

<h2>Array Exercises</h2>
  <ul>
    <li> <a href="https://github.com/loriemoffitt/homepage/blob/main/docs/java_exercises/arrays/Exercise01.java">Exercise01.java</a></li>
<li> <a href="https://github.com/loriemoffitt/homepage/blob/main/docs/java_exercises/arrays/Exercise02.java">Exercise02.java</a></li>   
    <li> <a href="https://github.com/loriemoffitt/homepage/blob/main/docs/java_exercises/arrays/Exercise03.java">Exercise03.java</a></li>
    <li> <a href="https://github.com/loriemoffitt/homepage/blob/main/docs/java_exercises/arrays/Exercise04.java">Exercise04.java</a></li>
    <li> <a href="https://github.com/loriemoffitt/homepage/blob/main/docs/java_exercises/arrays/Exercise05.java">Exercise05.java</a></li>
    <li> <a href="https://github.com/loriemoffitt/homepage/blob/main/docs/java_exercises/arrays/Exercise06.java">Exercise06.java</a></li>
  </ul>
