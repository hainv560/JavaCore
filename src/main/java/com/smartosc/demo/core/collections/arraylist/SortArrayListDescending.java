package com.smartosc.demo.core.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by HaiNv on 19/05/2016.
 */
public class SortArrayListDescending {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<Integer>(Arrays.<Integer>asList(new Integer[]{1, 13, 11, 5, 6, 8, 99}));

        // Use comparator method
        Collections.sort(listInteger, Collections.reverseOrder());
        System.out.println(listInteger);
    }
}
