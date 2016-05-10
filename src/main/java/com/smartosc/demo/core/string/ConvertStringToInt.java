package com.smartosc.demo.core.string;

/**
 * Created by smartosc on 5/9/2016.
 */
public class ConvertStringToInt {
    public static void main(String[] args) {
        // parseInt,partDouble... or use Integer.valueOf(), Double.valueOf()...
        String numberFirst = "3";
        String numberSecond = "4";
        int numberInt = 0;
        try {
            //numberInt = Integer.parseInt(numberFirst);
            numberInt = Integer.valueOf(numberSecond);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println(numberInt);
    }
}
