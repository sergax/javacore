package com.sergax.javacore.multithreading.semaphore;

import java.util.Objects;
import java.util.concurrent.Semaphore;

class Foo {
    Semaphore semaphore = new Semaphore(3);
    private static final String FIRST = "first";
    private static final String SECOND = "second";
    private static final String THIRD = "third";

    void first() throws InterruptedException {
        try {
            semaphore.acquire();
            System.out.println(FIRST);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void second() throws InterruptedException {
        try {
            semaphore.acquire();
            System.out.println(SECOND);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void third() throws InterruptedException {
        try {
            semaphore.acquire();
            System.out.println(THIRD);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
