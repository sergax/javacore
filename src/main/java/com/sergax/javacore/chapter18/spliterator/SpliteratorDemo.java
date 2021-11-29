package com.sergax.javacore.chapter18.spliterator;

import java.util.*;

public class SpliteratorDemo {
    public static void main(String[] args) {
        // create array list of figures double type
        ArrayList<Double> vals = new ArrayList<>();

        //add values in array list
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // call method tryAdvance() for printing array list content
        System.out.print("Content array list : \n");
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        // create new array list contents square figures from array list vals
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        // call method forEachRemaining() for print content array list sqrs
        System.out.print("Content array list sqrs : \n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
