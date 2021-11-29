package com.sergax.javacore.chapter18.collections;

import java.util.LinkedList;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + "\n" + street + "\n"
                + city + " " + state + " " + code;
    }
}

class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        // add elements to linked list
        ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple lane", "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "867 Alm St", "Champaing", "IL", "61820"));

        // print list of address
        for (Address element : ml) {
            System.out.println(element + "\n");
        }
    }
}
