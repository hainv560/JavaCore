package com.smartosc.demo.core.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HaiNv on 19/05/2016.
 */
public class GetSubList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(new String[]{"a", "b", "c", "d", "e", "f"}));

        // Return a sub list, throw IndexOutOfBoundsException, IllegalArgumentException
        List<String> subList =  arr.subList(2, 6);
        System.out.println(subList);
    }
}
