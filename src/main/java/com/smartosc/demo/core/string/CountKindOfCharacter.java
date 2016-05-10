package com.smartosc.demo.core.string;

/**
 * Created by smartosc on 5/10/2016.
 */
public class CountKindOfCharacter {
    public static void main(String[] args) {
        String input = "“Tiger Runs @ The Speed Of 100 km/hour.”";
        char[] chars = input.toCharArray();

        int lowerCase = 0, upperCase = 0, digit = 0, other = 0;

        for (char aChar : chars) {
            if (Character.isDigit(aChar))
                digit++;
            if (Character.isLowerCase(aChar))
                lowerCase++;
            if (Character.isUpperCase(aChar))
                upperCase++;
            other++;
        }

        System.out.println("Digit - " + digit);

        System.out.println("Lower - " + lowerCase);

        System.out.println("Upper - " + upperCase);

        System.out.println("Other - " + other);
    }
}
