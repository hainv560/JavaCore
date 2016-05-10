package com.smartosc.demo.core.string;

/**
 * Created by smartosc on 5/9/2016.
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");

        builder.append("Builder");
        System.out.println(builder);
    }
}
