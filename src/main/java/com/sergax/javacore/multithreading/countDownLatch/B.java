package com.sergax.javacore.multithreading.countDownLatch;

class B implements Runnable {
    private Foo foo;

    @Override
    public void run() {
        try {
            foo.second(new B());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
