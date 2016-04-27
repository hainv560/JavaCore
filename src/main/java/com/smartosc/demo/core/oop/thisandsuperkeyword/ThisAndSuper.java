package com.smartosc.demo.core.oop.thisandsuperkeyword;

/**
 * Created by smartosc on 4/27/2016.
 */
public class ThisAndSuper {
    public static void main(String[] args) {
        // Super() and this() must be first statement,super and this not applicable in the static methods..
        // This key word is a reference variable that refers to the current object.
        // super keyword only to point the immediate super class object of the current object
        Car car = new Car();
        car.showCar();

        Car carOne = new Car("100");

    }
}
