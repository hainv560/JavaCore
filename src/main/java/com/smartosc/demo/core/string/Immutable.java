package com.smartosc.demo.core.string;

/**
 * Created by smartosc on 5/9/2016.
 */
public class Immutable {
    public static void main(String[] args) {
        // String are immutable. This is, its content cannot be modified once it is created. if you try change it. New string object will create.
        String s = "Hello";
        s.concat("sako");
        System.out.println(s);
    }
}
