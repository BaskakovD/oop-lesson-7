package com.dmdev.oop.lesson19.task;

import java.util.ArrayList;
import java.util.List;

/**
 * Написать метод, который принимает целочисленный список и возвращает целочисленный список
 * только с нечентными значениями
 */

public class Task1 {
    public static void main(String[] args) {
        List <Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 11, 22);
        List<Integer> result = removeEven(list);
        System.out.println(result);
    }
    private static List <Integer> removeEven (List <Integer> list) {
        List <Integer> result = new ArrayList<>();
        for (Integer value : list) {
            if (value % 2 == 0 ) {
                result.add(value);
            }
        }
        return result;

    }
}
