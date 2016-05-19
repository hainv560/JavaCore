package com.smartosc.demo.core.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by HaiNv on 19/05/2016.
 */
public class SynchronizeArrayList {
    public static void main(String[] args) {

        // Use synchronizedList() method
        List<String> syncal =
                Collections.synchronizedList(new ArrayList<String>());

        //Adding elements to synchronized ArrayList
        syncal.add("Pen");
        syncal.add("NoteBook");
        syncal.add("Ink");
    }
}
