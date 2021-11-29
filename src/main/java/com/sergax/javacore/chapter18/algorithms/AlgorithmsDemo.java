package com.sergax.javacore.chapter18.algorithms;

import java.util.*;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        // create uninitialized linked list
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // create comparator with reverse order
        Comparator<Integer> r = Collections.reverseOrder();

        // sort list with comparator
        ll.sort(r);

        System.out.print("List sorted in reverse order : ");

        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        // shuffle list
        Collections.shuffle(ll);

        // print shuffled list
        System.out.print("List shuffled : ");

        for(int i : ll) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Min : " + Collections.min(ll));
        System.out.println("Max : " + Collections.max(ll));
    }
}
