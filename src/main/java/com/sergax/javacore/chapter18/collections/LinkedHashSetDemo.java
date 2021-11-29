package com.sergax.javacore.chapter18.collections;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //create linked hash set
        HashSet<String> lhs = new LinkedHashSet<>();

        //add elements to hash set
        lhs.add("Beta");
        lhs.add("Alfa");
        lhs.add("Eta");
        lhs.add("Gamma");
        lhs.add("Omega");

        System.out.println(lhs);
    }
}
