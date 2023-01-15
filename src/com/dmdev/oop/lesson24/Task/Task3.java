package com.dmdev.oop.lesson24.Task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Дана строка вида. Получить дату и вывести в консоль из этой строки.
 */
public class Task3 {
    public static void main(String[] args) {
        String formattedDate = "09-03-2019T12:44";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime parse1 = LocalDateTime.parse(formattedDate, dateTimeFormatter);
        System.out.println(parse1);


        // Задание форматтера
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        // передача формата времени в LocalDateTime
//        LocalDateTime parse = LocalDateTime.parse(formattedDate, formatter);
//        System.out.println(parse);


    }
}
