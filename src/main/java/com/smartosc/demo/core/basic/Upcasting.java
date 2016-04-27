package com.smartosc.demo.core.basic;

/**
 * Created by smartosc on 4/25/2016.
 */
public class Upcasting {
    // Upcasting: convert lower type value to upper type value
    // byte->short->int->long->float->double.
    // Down casting: vice versa.
    static double a = 100.45;
    static int b = 100;
    static float c;

    public static void main(String[] args) {
        // up casting
        c = b;
        a = c;

        // down casting
        c = (float) a;
        b = (int) c;

    }
}

