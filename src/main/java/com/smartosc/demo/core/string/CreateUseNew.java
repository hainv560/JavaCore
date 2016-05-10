package com.smartosc.demo.core.string;

/**
 * Created by smartosc on 5/9/2016.
 */
public class CreateUseNew {
    public static void main(String[] args) {
        String first = new String("Hello");
        String second = new String("Hello");

        // return false because first and second refer to different object
        System.out.println(first == second); // == compare address

        // return true because first and second refer to same string value
        System.out.println(first.equals(second)); // equals() compare value/logic

    }
}
