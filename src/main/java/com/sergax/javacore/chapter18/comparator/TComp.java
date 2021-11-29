package com.sergax.javacore.chapter18.comparator;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    // use comparator for ordering factures by the name of the depositors

    public int compare(String aStr, String bStr) {
        int i, j, k;

        // find the index of the character that the name starts with
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        // if names are equal chek full names
        if(k == 0) {
            return aStr.compareTo(bStr);
        } else {
            return k;
        }
    }
}


