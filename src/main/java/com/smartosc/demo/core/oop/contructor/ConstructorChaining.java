package com.smartosc.demo.core.oop.contructor;

/**
 * Created by smartosc on 4/27/2016.
 */
public class ConstructorChaining {
    public static void main(String[] args) {
        Children child = new Children();
        /*  Output:
        Parent's constructor
        Child's constructor
        */
        /*
        Whenever child class constructor gets invoked it implicitly invokes the constructor of parent class.
        In simple terms you can say that compiler puts a super(); statement in the child class constructor.
        */
    }
}
