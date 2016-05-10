package com.smartosc.demo.core.string;

/**
 * Created by smartosc on 5/9/2016.
 */
public class StringLiteral {
    public static void main(String[] args) {
        // String literal: compiler implicit create object and save string's value in pool.
        String first = "Hello";
        String second = "Hello";

        // So, every time you create a String using a literal, the system will search that pool and check if the value of the literal exists in a String object of the pool

        // return true because first and second refer to same string object
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}
