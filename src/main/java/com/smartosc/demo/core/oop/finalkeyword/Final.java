package com.smartosc.demo.core.oop.finalkeyword;

/**
 * Created by smartosc on 4/27/2016.
 */
public class Final {
    // Final class can't extend.
    // Final variable must be initialized , can't change value its.
    public final static double PI = Math.PI;
    public final static int MAX;

    static {
        MAX = 4;
    }

    // final method can't override
    final void show() {
        System.out.println("This is final method");
    }

    public static void main(String[] args) {

        Final finalClass = new Final();

        finalClass.show();
    }

}
