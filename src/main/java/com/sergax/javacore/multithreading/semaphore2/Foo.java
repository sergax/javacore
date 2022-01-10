package com.sergax.javacore.multithreading.semaphore2;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.concurrent.Semaphore;

@AllArgsConstructor
class Foo {
    private static final String FIRST = "first";
    private static final String SECOND = "second";
    private static final String THIRD = "third";

    public void first(Runnable r1) {
        System.out.println(FIRST);
    }

    public void second(Runnable r2) {
        System.out.println(SECOND);
    }

    public void third(Runnable r3) {
        System.out.println(THIRD);
    }
}

