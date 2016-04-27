package com.smartosc.demo.core.oop.contructor;

/**
 * Created by smartosc on 4/27/2016.
 */
public class PrivateConstructor {
    public final static PrivateConstructor instance = new PrivateConstructor();

    private PrivateConstructor() {
    }

    public static PrivateConstructor getInstance() {
        return instance;
    }

    public void show() {
        System.out.println("Done!");
    }

    public static void main(String[] args) {
        PrivateConstructor object = PrivateConstructor.getInstance();
        object.show();
    }
}
