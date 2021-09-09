package com.octodemo.lib;

/**
 * Hello world!
 * 
 */
public class Calculator
{

    private String greetings = "Welcome to the Calculator API";


    public int add(int a, int b) {
        System.out.println( greetings.toUpperCase() );
        return a + b;
    }


    public int sub(int a, int b) {
        return a - b;
    }


}
