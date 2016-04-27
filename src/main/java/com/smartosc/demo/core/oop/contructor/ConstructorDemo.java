package com.smartosc.demo.core.oop.contructor;

/**
 * Created by smartosc on 4/27/2016.
 */
public class ConstructorDemo {
    // Constructor: same name with class's name. no return type.
    // default constructor: Compiler creates one for you. But when you created any constructor and call default constructor, compiler will throw Exception
    private int age;
    private String name;


    public ConstructorDemo() {
    }

    public ConstructorDemo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ConstructorDemo(int age) {
        this.age = age;
    }

    public ConstructorDemo(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorDemo constructorFirst = new ConstructorDemo();
        ConstructorDemo constructorSecond = new ConstructorDemo(2, "Demo");
    }
}
