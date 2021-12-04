package com.sergax.javacore.chapter18.collections.list;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        // initial size of vector - 3 and increment - 2
        Vector<Integer> v = new Vector<>(3,2);
        System.out.println("Initial size of vector : " + v.size());
        System.out.println("Initial capacity of vector : " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Capacity of vector after added 4th elements : " +
                v.capacity());

        v.addElement(5);
        System.out.println("Current capacity of vector : " + v.capacity());

        v.addElement(6);
        v.addElement(7);
        System.out.println("Current capacity of vector : " + v.capacity());

        v.addElement(9);
        v.addElement(10);
        System.out.println("Current capacity of vector : " + v.capacity());

        System.out.println("1st element : " + v.firstElement());
        System.out.println("Last element : " + v.lastElement());
        if(v.contains(3)) {
            System.out.println("Vector contains 3.");

            // list elements of vector
            Enumeration<Integer> vEnum = v.elements();

            System.out.print("\nElements of vector : ");
            while (vEnum.hasMoreElements()) {
                System.out.print(vEnum.nextElement() + " ");
            }
            System.out.println();
        }
    }
}
