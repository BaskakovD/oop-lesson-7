package com.dmdev.oop.lessons25;

public class   ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        var simpleThread = new SimpleThread();
        System.out.println(simpleThread.getName() + ":" + simpleThread.getState());
        var runnableThread = new Thread(new SimpleRunnable(), "My name");
        var lambdaThread = new Thread(() -> System.out.println("Hello from lambda: " + Thread.currentThread().getName()));

        simpleThread.start();
        System.out.println(simpleThread.getName() + ":" + simpleThread.getState());
        runnableThread.start();
        lambdaThread.start();
        try {
            simpleThread.join(100);
            System.out.println(simpleThread.getName() + ":" + simpleThread.getState());
            runnableThread.join();
            lambdaThread.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
         simpleThread.interrupt();
        SimpleThread1 simpleThread1 = new SimpleThread1();
        simpleThread1.start();
        simpleThread1.join();
        System.out.println(Thread.currentThread().getName());
    }
}
