package com.dmdev.oop.lessons25;

public class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        // ��� �������� ����� getname ������, ��� ��� ������ ������
        System.out.println("Hello from runnable: " + Thread.currentThread().getName() );

    }
}
