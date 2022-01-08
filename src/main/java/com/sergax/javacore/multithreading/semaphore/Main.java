package com.sergax.javacore.multithreading.semaphore;

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
        ExecutorService executorService = ForkJoinPool.commonPool();

        executorService.execute(foo::first);
        executorService.execute(foo::second);
        executorService.execute(foo::third);

        executorService.shutdown();
    }
}
