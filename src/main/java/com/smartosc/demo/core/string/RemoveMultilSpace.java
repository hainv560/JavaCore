package com.smartosc.demo.core.string;

/**
 * Created by smartosc on 5/10/2016.
 */
public class RemoveMultilSpace {
    public static void main(String[] args) {
        String before = "    Hello            hello     hell sound          ";
        String after = before.trim().replaceAll("\\s+", " ");
        System.out.println(after);
    }
}
