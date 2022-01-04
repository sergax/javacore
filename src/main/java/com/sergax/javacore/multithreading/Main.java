package com.sergax.javacore.multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        Thread threadA = new Thread(new A(foo));
        Thread threadB = new Thread(new B(foo));
        Thread threadC = new Thread(new C(foo));
        threadA.start();
        threadB.start();
        threadC.start();

        threadA.join();
        threadB.join();
        threadC.join();
    }
}
