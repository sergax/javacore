package com.sergax.javacore.chapter18.collections.list;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        //create linked list
        LinkedList<String> ll = new LinkedList<>();

        //add elements to linked list
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("The original content of linked list : " + ll);

        //remove elements from linked list
        ll.remove("F");
        ll.remove(2);
        System.out.println("Content of linked list " +
                "after removed elements : " + ll);
        //remove 1st anf last elements from linked list
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Content of linked list after removing " +
                "1st and last element : " + ll);

        //get and set value
        String value = ll.get(2);
        ll.set(2,value + " changed");
        System.out.println("Content linked list after chenged : " + ll);
    }
}
