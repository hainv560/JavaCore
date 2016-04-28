package com.smartosc.demo.core.wrapper;

/**
 * Created by smartosc on 4/28/2016.
 */
public class BoxingAndUnboxing {
    Integer boxing = 3;
    int convert = boxing.intValue(); // convert use method
    int unboxing = boxing; // unboxing

    int number = 4;
    Integer autoBoxing = number; // autoboxing
    Integer converttoInteger = Integer.valueOf(number); // convert use method

}
