package com.smartosc.demo.core.oop.thisandsuperkeyword;

/**
 * Created by smartosc on 4/27/2016.
 */
public class Vehicle {
    private String name;
    protected  int color;

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Vehicle show method");

    }

    public static void staticMethod(){
        System.out.println("Static vehicle method");
    }
}
