package com.sergax.javacore.chapter18.collections;

import java.util.*;

public class ToArrayByArrayList {
    public static void main(String[] args) {
        // converting ArrayList to array
        //create list array
        List<Integer> al = new ArrayList<>();

        //add element ot list array
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Array contents al : " + al);

        //get a basic array
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;

        //sum the contents of the array
        for (int i : ia) {
            sum += i;
        }
        System.out.println("Sum : " + sum);
    }
}
