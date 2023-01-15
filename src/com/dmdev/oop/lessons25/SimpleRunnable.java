package com.dmdev.oop.lessons25;

public class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        // имя получить через getname нельзя, ибо нет такого метода
        System.out.println("Hello from runnable: " + Thread.currentThread().getName() );

    }
}
