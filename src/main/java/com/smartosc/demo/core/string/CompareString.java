package com.smartosc.demo.core.string;

/**
 * Created by smartosc on 5/10/2016.
 */
public class CompareString {
    public static void main(String[] args) {
        // Use == , equals() method, compareTo() method, compareToIgnoreCas() method
        String first = new String("Hello");
        String second = new String("Hello");

        // == operator
        System.out.println(first == second);
        // equals method
        System.out.println(first.equals(second));
        // compareTo method
        System.out.println(first.compareTo(second));


        // compareToIgnoreCase method
        String string1 = "Sinh Vien CNTT";
        String string2 = "sinH vien cntt";

        System.out.println(string1.compareToIgnoreCase(string2));
    }
}
