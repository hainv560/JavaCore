package com.smartosc.demo.core.collections.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by HaiNv on 19/05/2016.
 */
public class VectorFirst {
    public static void main(String[] args) {
        /*
        *
        * same ArrayList but vector is synchronized
        * Low performance
         * ArrayList grow by half of its size when resized while vector doubles the size of itself by default when grows.
        * */

        Vector<String> vector = new Vector<String>();

        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
