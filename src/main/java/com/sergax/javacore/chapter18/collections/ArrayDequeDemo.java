package com.sergax.javacore.chapter18.collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // create deque
        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.print("Popping from array : ");

        while (adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }
    }
}
