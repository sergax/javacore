package com.sergax.javacore.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class Foo {
    private final Semaphore s1 = new Semaphore(1);
    private final Semaphore s2 = new Semaphore(0);
    private final Semaphore s3 = new Semaphore(0);
    private static final String FIRST = "first";
    private static final String SECOND = "second";
    private static final String THIRD = "third";

    synchronized void first() {
        System.out.println(FIRST);
        s1.release();
    }

    synchronized void second() {
        try {
            s2.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(SECOND);
        s2.release();
    }

    synchronized void third() {
        try {
            s3.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(THIRD);
    }
}
