package com.smartosc.demo.core.string;

/**
 * Created by smartosc on 5/9/2016.
 */
public class StringBufferTest {
    public static void main(String[] args) {

        // StringBuffer are mutable class, buffer are thread-safe
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello buffer");
        buffer.append(" My name is ");
        buffer.reverse();
        System.out.println(buffer);
    }
}
