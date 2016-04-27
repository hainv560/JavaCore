package com.smartosc.demo.core.oop.contructor;

/**
 * Created by smartosc on 4/27/2016.
 */
public class Parent {
    private String name;

    public Parent() {
        System.out.println("Parent's constructor");
    }

    public Parent(String name) {
        this.name = name;
    }
}
