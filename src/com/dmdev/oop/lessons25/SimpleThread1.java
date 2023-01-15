package com.dmdev.oop.lessons25;

public class SimpleThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello " + getName());
    }
}
