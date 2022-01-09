package com.sergax.javacore.multithreading.semaphore;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class B implements Runnable {
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
