package com.sergax.javacore.chapter18.comparator;

import java.util.Comparator;

public class CompLastName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        // use method thenComparing() for sorting factures by last name, then 1st name
        int i,j;

        // find the index of the character that the name starts with
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
