package com.sergax.javacore.chapter18.comparator;

import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        // create tree set
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        // add elements in tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // print elements from tree set
        for (String elements : ts) {
            System.out.print(elements + " ");
        }
    }
}
