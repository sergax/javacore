package com.sergax.javacore.chapter18.dbnumbers;

import java.io.*;
import java.util.Properties;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        // try to open file phonebook.dat
        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            // ignore missing file
        }
        // if phone book already exist - download existing numbers
        try {
            if(fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.err.println( "Error reading file.");
        }
        // access user input new numbers
        do {
            System.out.println("Put name" + " ('exit' for finishing) : " );
            name = br.readLine();
            if(name.equals("exit")) continue;
            System.out.println("Put the number : ");
            number = br.readLine();
            ht.put(name,number);
            changed = true;
        } while (!name.equals("exit"));
        // save phone book if changed
        if(changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Phone Book");
            fout.close();
        }
        // search number by name
        do {
            System.out.println("Put name for searching : " +
                    " ('exit' for finishing) : ");
            name = br.readLine();
            if(name.equals("exit")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("exit"));
    }
}
