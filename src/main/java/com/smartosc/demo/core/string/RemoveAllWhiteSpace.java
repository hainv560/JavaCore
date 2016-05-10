package com.smartosc.demo.core.string;

/**
 * Created by smartosc on 5/10/2016.
 */
public class RemoveAllWhiteSpace {
    public static void main(String[] args) {
        String input = "  Core Java jsp servlets             jdbc struts hibernate spring  ";

        // Use split method
        StringBuilder builder = new StringBuilder();
        String[] chars = input.split(" ");
        for (String aChar : chars) {
            builder.append(aChar);
        }

        // Use replaceAll method

        String output = input.replaceAll("\\s", "");

        System.out.println(output);

        System.out.println(builder);
    }
}
