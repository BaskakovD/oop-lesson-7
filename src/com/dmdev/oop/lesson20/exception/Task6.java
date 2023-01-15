package com.dmdev.oop.lesson20.exception;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * создать метод, случайным образом выбрасывающий одно из 3-х исключений.
 * ¬ызвать этот метод в блоке try-catch, отлавливающий любое из трех.
 */

public class Task6 {
    private static final Map <Integer, Throwable> EXCEPTIONS  = Map.of(
            0, new RuntimeException("runtime"),
            1, new FileNotFoundException("file not found"),
            2, new IndexOutOfBoundsException("index exception"));

    public static void main(String[] args) {
        Random random = new Random();
        try {
            unsafe(random.nextInt(3));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


    }
    public static void unsafe (int randomValue ) throws Throwable {
        Throwable exception  = EXCEPTIONS.getOrDefault(randomValue, new DmdevException("not found"));
        throw exception;

    }
}
