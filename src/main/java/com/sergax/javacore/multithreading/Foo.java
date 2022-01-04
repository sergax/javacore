package com.sergax.javacore.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Foo {
    private final static String FIRST = "first";
    private final static String SECOND = "second";
    private final static String THIRD = "third";

    public void first(Runnable r) {
        System.out.print(FIRST);
    }

    public void second(Runnable r) {
        System.out.print(SECOND);
    }

    public void third(Runnable r) {
        System.out.print(THIRD);
    }


    public Foo execute() {
        try {
            ExecutorService executor = Executors.newFixedThreadPool(1);
            executor.submit(r);
            executor.submit(r1);
            executor.submit(r2);

            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    Runnable r = new Runnable() {
        @Override
        public void run() {
            first(r);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Runnable r1 = new Runnable() {
        @Override
        public void run() {
            second(r1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Runnable r2 = new Runnable() {

        @Override
        public void run() {
            third(r2);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
}
