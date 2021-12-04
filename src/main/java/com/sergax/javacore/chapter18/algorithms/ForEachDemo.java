package com.sergax.javacore.chapter18.algorithms;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        // create array list
        ArrayList<Integer> vals = new ArrayList<>();

        // add figures to array list
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        // organize cycle for printing figures
        System.out.print("Original content array list : ");
        for (int v: vals) {
            System.out.print(v + " ");
        }
        System.out.println();

        // sum figures in cycle for
        int sum = 0;
        for(int v : vals) {
            sum += v;
        }
        System.out.print("Sum of figures : " + sum);
    }
}
