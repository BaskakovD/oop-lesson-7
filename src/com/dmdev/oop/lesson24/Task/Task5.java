package com.dmdev.oop.lesson24.Task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *  Создать объект LocalDate, создать объект с датой 07.07.2018/.
 *  Посчитать разницу во времени между ними.
 */

public class Task5 {
    public static void main(String[] args) {
        // создание объекта с текущей датой
        LocalDateTime now = LocalDateTime.now();
        // создание объекта с конкретной датой
        LocalDate futureDate = LocalDate.of(2024, 11, 24);
        LocalDate prevDate = LocalDate.of(2018, 7, 7);
        Period between2 = Period.between(futureDate, prevDate);
        System.out.println(between2.getYears());
        System.out.println(between2.getMonths());
        long between = ChronoUnit.DAYS.between(prevDate, futureDate);
        System.out.println(between);


//
//        //считает разницу между датами
//        Period between = Period.between(prevDate, LocalDate.from(now));
//        // вывод дней,месяцев и лет
//        System.out.println(between.getDays());
//        System.out.println(between.getMonths());
//        System.out.println(between.getYears());
//        long between1 = ChronoUnit.DAYS.between(prevDate, now);
//        System.out.println(between1);



    }
}
