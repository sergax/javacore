package com.sergax.javacore.chapter18.collections.map;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        // create hash map
        HashMap<String, Double> hm = new HashMap<>();

        //put elements to hash ap
        hm.put("Jon Dow", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jain Baker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralph Smith", -19.08);

        // get hash set
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // get set list
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // put total 1000 on John Dow's account
        double balance = hm.get("Jon Dow");
        hm.put("Jon Dow", balance + 1000);
        System.out.print("The new account balance Jon Dow : " +
                hm.get("Jon Dow"));
    }
}
