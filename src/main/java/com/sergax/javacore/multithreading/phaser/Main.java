package com.sergax.javacore.multithreading.phaser;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class Main {

    private static final String FIRST = "first";
    private static final  String SECOND = "second";
    private static final  String THIRD = "third";

    public void first() {
        System.out.println(FIRST);
    }

    public void second() {
        System.out.println(SECOND);
    }

    public void third() {
        System.out.println(THIRD);
    }

    public static void main(String[] args) {

        Phaser phaser = new Phaser(1);
        ExecutorService service = Executors.newFixedThreadPool(3);

        service.execute(new Foo(phaser));
        phaser.arriveAndAwaitAdvance();
        service.execute(new Foo(phaser));
        phaser.arriveAndAwaitAdvance();
        service.execute(new Foo(phaser));
        phaser.arriveAndAwaitAdvance();

        service.shutdown();

    }
}
