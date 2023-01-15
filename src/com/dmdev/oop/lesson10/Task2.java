package com.dmdev.oop.lesson10;

import java.security.ProtectionDomain;

/**
 * написать функцию, принимающую строку и слову и возвращать true в случае, если строка
 * начинается и заканчивается этим  словом
 **/


public class Task2 {
    public static void main(String[] args) {
        String value = "Павлик пришел в школу Павлик";
        String word = "Павлик";
        System.out.println(isStartAndEnd(value, word));

    }

    public static boolean isStartAndEnd ( String target, String word) {
        return  target.startsWith(word) && target.endsWith(word);

    }
}
