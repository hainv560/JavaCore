package com.smartosc.demo.core.string;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by smartosc on 5/10/2016.
 */
public class CountCharacterOccurs {
    public static void main(String[] args) {
        String input = "Using count character in string";

        // use apache common langs
        System.out.println(StringUtils.countMatches(input, "i"));

        //Use method
        System.out.println(countCharacter('e', input));


    }

    public static int countCharacter(char character, String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character)
                count++;
        }
        return count;
    }


}
