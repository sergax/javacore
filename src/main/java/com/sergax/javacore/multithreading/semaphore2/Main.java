package com.sergax.javacore.multithreading.semaphore2;

import lombok.SneakyThrows;

import java.util.concurrent.*;

class Main {
    Semaphore semaphore = new Semaphore(3);
    Foo foo;

    CompletableFuture<Void> cf1 = CompletableFuture.runAsync(() -> {

    });

    public static void main(String[] args) {

    }
}