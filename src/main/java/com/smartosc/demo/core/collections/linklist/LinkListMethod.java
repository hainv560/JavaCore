package com.smartosc.demo.core.collections.linklist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by HaiNv on 19/05/2016.
 */
public class LinkListMethod {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        //Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(linkedList.peek());

        // same peek() method but return null if list empty
        System.out.println("Peek first: " + linkedList.peekFirst() + " Peek last: " + linkedList.peekLast());

        // Retrieves and removes the head (first element) of this list.
        System.out.println(linkedList.poll());


        // pollFirst(), pollLast()......

        // Remove element by index
        System.out.println(linkedList.remove(3));

        //  insert element at the front of this list
        linkedList.push(9);

        //  removes and returns the first element of this list.
        System.out.println( linkedList.pop());

    }
}
