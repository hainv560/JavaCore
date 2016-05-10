package com.smartosc.demo.core.string;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * Created by smartosc on 5/10/2016.
 */
public class ReverseWordInSentence {
    public static void main(String[] args) {
        String input = "Reverse by word in sentence";

        //use apache common
        System.out.println(StringUtils.reverseDelimited(input, ' '));

        // use method
        System.out.println(reverseByWord(input));
    }

    public static String reverseByWord(String input) {
        StringBuilder builder = new StringBuilder(input.length() + 1);
        String[] array = input.split(" ");

        for (int i = array.length - 1; i >= 0; i--) {
            builder.append(array[i]).append(" ");
        }
        builder.setLength(builder.length() - 1);
        return builder.toString();
    }
}
