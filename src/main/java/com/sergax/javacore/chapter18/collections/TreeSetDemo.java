package com.sergax.javacore.chapter18.collections;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        //create tree set
        TreeSet<String> ts = new TreeSet<>();

        //add element to tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
    }
}
