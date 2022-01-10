package com.sergax.javacore.multithreading.countDownLatch;

class A implements Runnable {
    private Foo foo;

    @Override
    public void run() {
        try {
            foo.first(new A());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
