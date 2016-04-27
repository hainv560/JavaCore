package com.smartosc.demo.core.oop.statickeyword;

/**
 * Created by smartosc on 4/27/2016.
 */
public class StaticVariable {
    public static int age = 23;

    public void show() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StaticVariable staticVariable = new StaticVariable();
        staticVariable.show();
    }
}

