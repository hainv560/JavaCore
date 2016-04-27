package com.smartosc.demo.core.oop.contructor;

/**
 * Created by smartosc on 4/27/2016.
 */
public class Children extends Parent {
    private String name;

    public Children(String name) {
        this.name = name;
    }

    public Children() {
        System.out.println("Child's constructor");
    }
}
