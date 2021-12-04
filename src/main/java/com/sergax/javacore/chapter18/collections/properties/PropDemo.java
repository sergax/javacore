package com.sergax.javacore.chapter18.collections.properties;

import java.util.*;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Ilinoys", "Springfeald");
        capitals.put("Misury", "Jefersson - Sity");
        capitals.put("Vushengton", "Olimpia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        //get set keys
        Set<?> states = capitals.keySet();

        // show all capitals
        for (Object name : states) {
            System.out.println("Capital of  state " + name + " - " +
                    capitals.getProperty((String) name) + ".");
        }
        System.out.println();

        // find state, not in the list, specify the default
        String str = capitals.getProperty("Florida", "not found");
        System.out.println("Capital of state Florida " + str + ".");
    }
}
