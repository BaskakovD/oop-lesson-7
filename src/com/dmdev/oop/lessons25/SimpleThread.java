package com.dmdev.oop.lessons25;

public class SimpleThread extends Thread {
    // ��� ����, ��� ������������ ��� ��������� �����, �� ������ �������������� ������� Run

    @Override
    public void run() {
        // ��� ��� ������������ �� Thread, �� ����� ����� ������������ � get.Name()
        // ������� ����� ����� �� ������ SimpleThread
        System.out.println("Hello " + Thread.currentThread().getName());


    }
}
