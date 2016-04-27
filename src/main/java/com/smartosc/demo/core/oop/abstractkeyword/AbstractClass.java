package com.smartosc.demo.core.oop.abstractkeyword;

/**
 * Created by smartosc on 4/27/2016.
 */
public abstract class AbstractClass {
    public void show() {
        System.out.println("Non-abtract method");
    }

    public abstract void say();

    /*
    Abstract class: Can't create object , contain non-abstract method(concrete methods (methods with body) )
    An abstract class has no use until unless it is extended by some other class.
    */

    /*
    Since abstract class allows concrete methods as well, it does not provide 100% abstraction.
    You can say that it provides partial abstraction. Interfaces are used for 100% abstraction (full abstraction)
    */

    /*
    Remember two rules:
    1) If the class is having few abstract methods and few concrete methods: declare it as abstract class.
    2) If the class is having only abstract methods: declare it as interfacekeyword
    */

    /*
     abstract class can extend only one class or one abstract class at a time
     */
}

class Test extends AbstractClass {

    @Override
    public void say() {
        System.out.println("Say Oh Yeah!");
    }
}

abstract class ExtendClass extends AbstractClass {
}