package com.sergax.javacore.multithreading;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class C implements Runnable {
    private Foo foo;

    @Override
    public void run() {
        try {
            foo.third();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
