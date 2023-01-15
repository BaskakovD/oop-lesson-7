package com.dmdev.oop.lessons25.counter;

/**
 * ������� ����� CounterThread � ����� ����� � ������������� ��� �������������:
 * private Counter counter. � ������ run ����� ������ ��� ��� ������� ����� couner. increment()
 */

public class CounterThread extends Thread  {
    //������ �� ��������� ����� null � ������� �� ���� ����������������
    private final Counter counter;
    public CounterThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i <300 ; i++) {
            counter.increment();
        }
    }
}
