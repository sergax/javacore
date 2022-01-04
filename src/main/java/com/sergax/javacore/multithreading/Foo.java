package com.sergax.javacore.multithreading;

import java.util.Objects;

public class Foo {
    private final Object object = new Object();
    private String lastState = null;
    private static final String FIRST = "first";
    private static final String SECOND = "second";
    private static final String THIRD = "third";

    void first() throws InterruptedException {
        synchronized (object) {
            while (true) {
                if (THIRD.equals(lastState) || Objects.isNull(lastState)) {
                    break;
                } else {
                    object.wait();
                    break;
                }
            }
            System.out.println(FIRST);
            lastState = FIRST;
            object.notifyAll();
        }
    }

    void second() throws InterruptedException {
        synchronized (object) {
            while (!FIRST.equals(lastState)) {
                object.wait();
            }
            System.out.println(SECOND);
            lastState = SECOND;
            object.notifyAll();
        }
    }

    void third() throws InterruptedException {
        synchronized (object) {
            while (!SECOND.equals(lastState)) {
                object.wait();
            }
            System.out.println(THIRD);
            lastState = THIRD;
            object.notifyAll();
        }
    }
}
