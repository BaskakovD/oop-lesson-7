package com.dmdev.oop.lesson21.task;

import java.awt.*;
import java.security.DomainLoadStoreParameter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список строк. Найти список уникальных строк длинной более 8 символов.
 */

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "string-1",
                "string-1",
                "string-1111",
                "string-222222",
                "string-3333333",
                "string-3333333",
                "string-3333333",
                "string-3333333",
                "string-444444");
        int result = strings.stream()
                .filter(value -> value.length()> 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(result);

        long result2 = strings.stream()
                .filter(value -> value.length() >8)
                //убираем дубликаты
                .distinct()
                .count();
        System.out.println(result2);
    }

}
