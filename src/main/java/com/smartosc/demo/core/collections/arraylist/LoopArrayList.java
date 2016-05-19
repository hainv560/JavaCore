package com.smartosc.demo.core.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by HaiNv on 19/05/2016.
 */
public class LoopArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(14);
        arrlist.add(7);
        arrlist.add(39);
        arrlist.add(40);

        // Normal loop
        for (int i = 0; i < arrlist.size(); i++) {
            System.out.println(arrlist.get(i));
        }

        // foreach loop
        for (Integer integer : arrlist) {
            System.out.println(integer);
        }

        // Iterator interface
        Iterator<Integer> iterator = arrlist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Use Enumeration
        Enumeration<Integer> enumeration = Collections.enumeration(arrlist);
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }


}
