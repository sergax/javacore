package com.sergax.javacore.chapter18.comparator;

import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String> {
    // sorting depositors factures  by F.L. if last names are equal
    public  int compare(String aStr, String bStr) {
        int i, j;

        return aStr.compareToIgnoreCase(bStr);
    }
}
