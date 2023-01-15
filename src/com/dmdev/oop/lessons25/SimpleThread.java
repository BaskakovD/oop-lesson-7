package com.dmdev.oop.lessons25;

public class SimpleThread extends Thread {
    // для того, что использовать как отдельный поток, мы должны переопределить функцию Run

    @Override
    public void run() {
        // так как унаследованы от Thread, то сразу можно использовать и get.Name()
        // создаем новый потом из класса SimpleThread
        System.out.println("Hello " + Thread.currentThread().getName());


    }
}
