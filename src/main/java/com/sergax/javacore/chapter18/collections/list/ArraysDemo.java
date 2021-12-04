package com.sergax.javacore.chapter18.collections.list;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // some methods from class Arrays
        // create and initialized array
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        // print,sort and again print
        System.out.print("Original array : ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted array : ");
        display(array);

        // fill array and print
        Arrays.fill(array,2,6,-1);
        System.out.print("Array after method fill() : " );
        display(array);

        // sort and print array
        Arrays.sort(array);
        System.out.print("Array after repeated sorting : ");
        display(array);

        // do doubly search of value -9
        System.out.print("Value -9 is in position ");
        int index = Arrays.binarySearch(array,-9);
        System.out.print(index);
    }
    static void display (int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
