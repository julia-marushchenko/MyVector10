/**
 *  Java program to create, read, update, and delete Vector.
 */

package com.mycollections;

import java.util.Vector;

/**
 *  Main class..
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create an instance of a Vector.
        Vector myVector = new Vector<>();

        // Adding different elements.
        myVector.add(2.0);
        myVector.add(1);
        myVector.add(3L);
        myVector.add((byte)127);
        myVector.add('c');
        myVector.add("String");
        myVector.add(32767);
        myVector.add(true);

        // Print.
        System.out.println(myVector);

        // Clear.
        myVector.clear();
        
    }
}