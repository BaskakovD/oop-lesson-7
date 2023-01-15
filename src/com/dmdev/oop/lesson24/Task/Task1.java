package com.dmdev.oop.lesson24.Task;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Создать объект localDateTime. Далее создать другой объект через 3
 * месяца. Вывести на консоль LocalDate и LocalTime.
 *
 */
public class Task1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime localDateTime = now.plusMonths(3);
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = now.plusMinutes(54545);
        System.out.println(localDateTime1);



        // установка фиксированного времени
//        LocalDateTime localDateTime = LocalDateTime.of(2020, 1, 6, 17, 20, 55);
//        //Добавление 3 месяцев
//        LocalDateTime plus = localDateTime.plusDays(90);
//        // получение LocalDate
//        System.out.println(localDateTime.toLocalDate());
//        // получение LocalTime
//        System.out.println(localDateTime.toLocalTime());


    }
}
