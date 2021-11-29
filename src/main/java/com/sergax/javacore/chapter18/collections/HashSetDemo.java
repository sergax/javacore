package com.sergax.javacore.chapter18.collections;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        //create hash set
        HashSet<String> hs = new HashSet<>();

        //add elements to hash set
        hs.add("Beta");
        hs.add("Alfa");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Omega");

        System.out.println(hs);
    }
}
