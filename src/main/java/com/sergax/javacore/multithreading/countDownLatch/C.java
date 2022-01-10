package com.sergax.javacore.multithreading.countDownLatch;

class C implements Runnable {
    private Foo foo;

    @Override
    public void run() {
        try {
            foo.third(new C());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}