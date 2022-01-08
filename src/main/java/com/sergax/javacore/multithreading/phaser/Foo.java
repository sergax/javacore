package com.sergax.javacore.multithreading.phaser;

import java.util.concurrent.Phaser;

public class Foo implements Runnable {
    private Phaser phaser;
    private Main foo;

    public Foo(Phaser phaser) {
        foo = new Main();
        this.phaser = phaser;
        this.phaser.register();
    }

    public void run() {
        if (phaser.getPhase() == 0) {
            foo.first();
            phaser.arriveAndDeregister();
        } else if (phaser.getPhase() == 1) {
            foo.second();
            phaser.arriveAndDeregister();
        } else {
            foo.third();
            phaser.arriveAndDeregister();
        }
    }
}

