package com.dmdev.oop.lesson24.Task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Создать объект LocalDate, потом преобразовать в строку и вывести строку в консоль
 */
public class Task2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String s = now.toString();
        System.out.println(s);


//        System.out.println(now);
//        String s = now.toString();
//        System.out.println(s);
//        // с использованием  DateFormatter
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm:ss");
//        System.out.println(dateTimeFormatter);
//        String format = now.format(dateTimeFormatter);
//        System.out.println(format);
    }
}
