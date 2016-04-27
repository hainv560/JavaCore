package com.smartosc.demo.core.oop.thisandsuperkeyword;

/**
 * Created by smartosc on 4/27/2016.
 */
public class Car extends Vehicle {
    private String speed;
    private static int color;

    public Car() {
        super.show();
    }

    public void showCar() {
        System.out.println("Show method of Car");
        this.sayHello();
    }

    public Car(String speed) {
        super(speed);
        System.out.println("Car speed: " + speed);
    }

    public void sayHello() {
        System.out.println("Say Oh Yeah!");
    }

    public static void staticMethod(){
        System.out.println("Static car method");
    }

}
