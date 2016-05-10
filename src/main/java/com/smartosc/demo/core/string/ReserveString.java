package com.smartosc.demo.core.string;


/**
 * Created by smartosc on 5/10/2016.
 */
public class ReserveString {
    public static void main(String[] args) {

        // Reverse by character
        String input = "This string use for reserve String";

        System.out.println(reverse(input));

        // Use Stringbuilder
        String reverseUseBuilder = new StringBuilder(input).reverse().toString();
        System.out.println(reverseUseBuilder);

        // Use recurse
        System.out.println(recurseString(input));
    }


    // use reverse
    public static String reverse(String stringName) {
        char[] chars = stringName.toCharArray();
        int length = stringName.length();
        int lengthLoop = length / 2;
        for (int i = 0; i < lengthLoop; i++) {
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }
        return new String(chars);
    }

    //use recurse
    public static String recurseString(String stringName) {
        if (stringName.length() <= 1)
            return stringName;
        return recurseString(stringName.substring(1)) + stringName.charAt(0);
    }

}
