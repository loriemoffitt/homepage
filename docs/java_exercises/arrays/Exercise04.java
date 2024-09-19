package com.java.examples.arrays;

public class Exercise04 {
    public static void main(String[] args) {
        // 1. Declare an array to hold the names of the world's oceans.
        // Set its value using array literal notation.
        // 2. Loop over each element and print it.
        String[] oceans = { "pacific", "indian", "atlantic", "southern", "artic" };

        for (String i: oceans) {
            System.out.println(i);
        }
    }
}
