package com.smartosc.demo.core.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HaiNv on 19/05/2016.
 */
public class ArraylistFirst {
    public static void main(String[] args) {
        /*
        * Arraylist extend AbstractList , List interface extends Collection
        * Arraylist is a resize-array implement List interface.
        * Insert order.
        * Get element by index
        * Just store object type
        * Can contain duplicate elements.
        * ArrayList is non-synchronized
        * */
        ArrayList<String> arrayList = new ArrayList<String>();

        // Some common methods of Arraylist

        //return arraylist's size
        int size = arrayList.size();

        // add new element into arraylist
        arrayList.add("a");

        // Get element by index
        String element = arrayList.get(0);

        // Convert Arraylist to Array
        arrayList.toArray();

        // Return true if Arraylist contain this object and vice versa return false
        arrayList.contains("a");

        // You can remove element by index or specific object
        arrayList.remove(0);

        // return index of this object
        int position = arrayList.indexOf("a");

        // Remove all the element of Arraylist, this list will be empty after call this method.
        arrayList.clear();
    }
}
