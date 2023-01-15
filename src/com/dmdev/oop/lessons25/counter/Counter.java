package com.dmdev.oop.lessons25.counter;

/**
 * Создать класс counter с одним полем. Добавить методы:
 * -getCount()-получение значения поля
 * -increment()- увеличение значения поля на единицу
 * -decrement(0-  уменьшение значения поля на единицу
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
