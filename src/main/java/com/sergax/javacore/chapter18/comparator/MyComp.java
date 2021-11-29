package com.sergax.javacore.chapter18.comparator;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        // do compare in reverse order
        return bStr.compareTo(aStr);
    }
}
