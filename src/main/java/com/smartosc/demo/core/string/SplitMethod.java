package com.smartosc.demo.core.string;

/**
 * Created by smartosc on 5/10/2016.
 */
public class SplitMethod {
    public static void main(String[] args) {
        String input = "23-33-44-55-aa-bb.cc";
        String[] output = input.split("\\.");
        for (String s : output) {
            System.out.println(s);
        }
    }
}
