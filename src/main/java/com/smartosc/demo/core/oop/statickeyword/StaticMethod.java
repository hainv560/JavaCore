package com.smartosc.demo.core.oop.statickeyword;

/**
 * Created by smartosc on 4/27/2016.
 */
public class StaticMethod {
    private int age;
    private static String name;

    public static void show(String name) {
        // this and super cannot be used in static context.
        //System.out.println("Your age: " + age);// error: Static method can't use non-static variable.
        System.out.println("Name: " + name);
        // nonStatic(); // Static method can't call non-static method
    }

    public void nonStatic(){
        System.out.println("Static method can't call me");
    }

    public static void main(String[] args) {
        StaticMethod.show("Say Oh Yeah!");
    }
}
