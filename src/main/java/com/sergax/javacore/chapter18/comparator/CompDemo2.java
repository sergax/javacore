package com.sergax.javacore.chapter18.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo2 {
    public static void main(String[] args) {
        // using lambda expressions for creating comparator with reverse order
        TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());

        //add elements to tree set
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // print elements from tree set
        for (String element : ts) {
            System.out.print(element + " ");
        }
    }
}
