package com.smartosc.demo.core.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by HaiNv on 19/05/2016.
 */
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> listofcountries = new ArrayList<String>();
        listofcountries.add("India");
        listofcountries.add("US");
        listofcountries.add("China");
        listofcountries.add("Denmark");


        // Use Collections.sort() method
        Collections.sort(listofcountries);
        System.out.println(listofcountries);


        List<Integer> listInteger = new ArrayList<Integer>(Arrays.<Integer>asList(new Integer[]{1, 13, 11, 5, 6, 8, 99}));
        Collections.sort(listInteger);
        System.out.println(listInteger);
    }
}
