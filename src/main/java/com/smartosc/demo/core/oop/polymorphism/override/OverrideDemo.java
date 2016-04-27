package com.smartosc.demo.core.oop.polymorphism.override;

/**
 * Created by smartosc on 4/27/2016.
 */
public class OverrideDemo {
    // Override method also known as dynamic polymorphism and runtime binding or late binding.
    // Private , final , static not use in override.

    // Override: Child class extend from Parent class and override method show() with same name,same parameter.
    // Use super keyword to call parent class. super() call constructor , super.method() call method of parent class..
    public static void main(String[] args) {
        Parent parent = new Children();
        parent.show();
    }
}
