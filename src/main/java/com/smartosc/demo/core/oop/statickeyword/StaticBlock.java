package com.smartosc.demo.core.oop.statickeyword;

/**
 * Created by smartosc on 4/27/2016.
 */
public class StaticBlock {
    /*
    Is used to initialize the static data member.
    It is executed before main method at the time of class loading.
    */
    private final static double MAX;

    static {
        MAX = Math.PI;
        System.out.println("Max value: " + MAX);
    }

    public static void main(String[] args) {
        System.out.println("Main called");
    }
}
