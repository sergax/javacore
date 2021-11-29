package com.sergax.javacore.chapter18.collections;

import java.util.*;

public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;

        String str;
        double bal;

        balance.put("Jon Dow", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jain Baker", 1378.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", -19.08);

        // get all keys in set
        Set<String> set = balance.keySet();

        // get iterator
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + " : " + balance.get(str));
        }
        System.out.println();
        // put total 1000 on John Dow's account
        bal = balance.get("Jon Dow");
        balance.put("Jon Dow", bal + 1000);
        System.out.println("The new account balance Jon Dow : " +
                balance.get("Jon Dow"));
    }
}
