package com.smartosc.demo.core.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by HaiNv on 19/05/2016.
 */
public class InitializeArrayList {
    public static void main(String[] args) {
        /*
        * Initialization using Arrays.asList
        * Normal initialization
        *
        * */
        // Use Arrays.asList
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(new String[]{"a", "b", "c"}));

        // Normal way
        // Use initialCapacity
        ArrayList first = new ArrayList(3);

        ArrayList<Integer> second = new ArrayList<Integer>();
    }
}
