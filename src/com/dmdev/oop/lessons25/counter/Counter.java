package com.dmdev.oop.lessons25.counter;

/**
 * ������� ����� counter � ����� �����. �������� ������:
 * -getCount()-��������� �������� ����
 * -increment()- ���������� �������� ���� �� �������
 * -decrement(0-  ���������� �������� ���� �� �������
 */
public class Counter {
    private static String description;
    private int count;
//    public static void init() {
//        synchronized (Counter.class)
//        if (description == null) {
//            description = "Test description";
//        }
//    }
        public void increment() {
            synchronized (this) {
                count++;
            }
        }
        public void decrement() {
            count--;
        }
    public int getCount() {
        return count;
    }
}
