package com.sergax.javacore.multithreading.countDownLatch;

import java.util.concurrent.CountDownLatch;

class Foo {
     CountDownLatch firstFinish = new CountDownLatch(1);
     CountDownLatch secondFinish = new CountDownLatch(1);
     CountDownLatch thirdFinish = new CountDownLatch(1);

    private static final String FIRST = "first";
    private static final String SECOND = "second";
    private static final String THIRD = "third";

    void first(Runnable r1) throws InterruptedException {
        System.out.println(FIRST);
        firstFinish.countDown();
    }

    void second(Runnable r2) throws InterruptedException {
        firstFinish.await();
        System.out.println(SECOND);
        secondFinish.countDown();
    }

    void third(Runnable r3) throws InterruptedException {
        secondFinish.await();
        System.out.println(THIRD);
        thirdFinish.countDown();
    }
}
