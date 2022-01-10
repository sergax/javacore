package com.sergax.javacore.multithreading.countDownLatch;

import java.util.concurrent.*;

/*
Дан класс:
public class Foo {
  public void first(Runnable r) { print("first"); }
  public void second(Runnable r) { print("second"); }
  public void third(Runnable r) { print("third"); }
}

Один и тот же экземпляр данного класса будет вызван 3мя разными потоками.
Поток А - будет вызывать метод first().
Поток B - second().
Поток С - third().
Необходимо реализовать механизм и изменить программу таким образом, что методы класса Foo будут вызваны в правильном порядке.
Пример:
Вывод: "firstsecondthird"
Мы не знаем, в каком порядке будут вызваны методы, но должны гарантировать порядок.
 */
class Main {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CompletableFuture<Void> cf2 = CompletableFuture.runAsync(() ->
        {
            try {
                foo.second(new B());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, executorService);

        CompletableFuture<Void> cf1 = CompletableFuture.runAsync(() ->
        {
            try {
                foo.first(new A());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, executorService);

        CompletableFuture<Void> cf3 = CompletableFuture.runAsync(() ->
        {
            try {
                foo.third(new C());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, executorService);

        executorService.shutdown();
    }
}
