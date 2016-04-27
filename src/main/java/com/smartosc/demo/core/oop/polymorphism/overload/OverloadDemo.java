package com.smartosc.demo.core.oop.polymorphism.overload;

/**
 * Created by smartosc on 4/22/2016.
 */
public class OverloadDemo {
    // Method overloading is also known as static polymorphism and compile or early binding.
    // private,final, static is overload

    // Overload: Different number of parameters

    public void show(int a) {
        System.out.println("Int called");
    }

    public void show(int a, String b) {
    }

    // Overload: Different data type

    public void show(String c) {
    }


    // Overload: Different sequence of parameter
    public void show(String a, int b) {
    }

    // Overload: TypePromotion
    public void show(long a){
        System.out.println("Long called");
    }

    public static void main(String[] args) {
        OverloadDemo overloadDemo = new OverloadDemo();

        // call show(int) method
        overloadDemo.show(4);

        // call show(int,String) method
        overloadDemo.show(4, "Five");

        // call show(String) method
        overloadDemo.show("Say Oh Yeah!");

        // call show(String, int)
        overloadDemo.show("Four",5);
    }
}
