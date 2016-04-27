package com.smartosc.demo.core.oop.interfacekeyword;

/**
 * Created by smartosc on 4/27/2016.
 */
interface InterfaceDemo {
    /*
    * User interface keyword to define interface
    * Only contain abstract method, static final variable with public access modifier(default)
    * Class implementation interface by use implements keyword
    * Interface can extend multi interface(only interface)
    * Class can implement multi interface
    * It is used to achieve fully abstraction.
    * It can be used to achieve loose coupling.
    * */

    int AGE = 35;

    void show();

    void run();

    void bark();
}

interface A {
}

interface B extends A, InterfaceDemo {
}

class C implements B {

    public void show() {

    }

    public void run() {

    }

    public void bark() {

    }
}