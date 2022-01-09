package com.sergax.javacore.multithreading.semaphore;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class A implements Runnable {
    private Foo foo;

    public void run() {
        try {
            foo.first();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
