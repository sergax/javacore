package com.sergax.javacore.multithreading.semaphore;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class C implements Runnable {
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
