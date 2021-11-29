package com.sergax.javacore.chapter18.collections;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        // create tree map
        TreeMap<String, Double> tm = new TreeMap<>();

        //put elements to tree map
        tm.put("Jon Dow", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jain Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        //get a many entries
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // print a many entries
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // put total 1000 on John Dow's account
        double balance = tm.get("Jon Dow");
        tm.put("Jon Dow", balance + 1000);
        System.out.println("The new account balance Jon Dow : " +
                tm.get("Jon Dow"));
    }
}
