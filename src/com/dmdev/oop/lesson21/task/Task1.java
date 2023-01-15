package com.dmdev.oop.lesson21.task;

import java.util.List;
import java.util.OptionalDouble;

/**
 * Дан список  целых чисел. Найти среднее всех нечетных, делящихся на 5.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 4, 5, 15, 10, 20, 21, 25, 10, 35);
        OptionalDouble average = integers.stream()
                .filter(value -> value % 2 != 0)
                .filter(value -> value % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(average);
        average.ifPresent(System.out::println);
    }

}
