package com.sergax.javacore.multithreading;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class B implements Runnable {

    private Foo foo;

    @Override
    public void run() {
        try {
            foo.second();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
