package com.sergax.javacore.chapter18.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2A {
    public static void main(String[] args) {
        // use method thenComparing() for creating comparator,
        // which compares last name at first and then F.L. depositors
        // if last names are equal
        CompLastName compLN = new CompLastName();
        // instead new CompThenByFirstName(), we can use Comparator.reversOrder()
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

        // create tree map
        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);
        // put elements to tree map
        tm.put("Jon Dow", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jain Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        // get hash set
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // print elements from set
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // put total 1000 on John Dow's account
        double balance = tm.get("Jon Dow");
        tm.put("Jon Dow", balance + 1000);
        System.out.print("The new account balance Jon Dow : " +
                tm.get("Jon Dow"));
    }
}
