package com.dmdev.oop.lesson20.exception;

/**
 * создать переменную null и обработать потом исключение, вызвав метод
 */
public class Task1 {
    public static void main(String[] args) {
        String value = null;
        try {
            value.length();
        } catch ( NullPointerException exception) {
            System.err.println("catch");
            exception.printStackTrace();
        }
    }
}
