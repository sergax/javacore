package com.sergax.javacore.multithreading;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class A implements Runnable {
    private Foo foo;

    public void run() {
        try {
            foo.first();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
