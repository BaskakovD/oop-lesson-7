package com.dmdev.oop.lesson24.Task;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * Использовать LocalDateTime из Task 3. Преобразовать его в объект типа instant, указав зону типа America/Chicago.
 * Вывести количество прошедших  миллисекунд.
 */
public class Task4 {
    public static void main(String[] args) {
        String formattedDate = "26-03-1968T09:24";
        // Задание форматтера
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        // передача формата времени в LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(formattedDate, formatter);
        System.out.println(localDateTime);

        Instant instant = localDateTime.toInstant((ZoneId.of("America/Chicago").getRules().getOffset(localDateTime)));

        System.out.println(instant);
        // вывод в миллисекундах
        System.out.println(instant.toEpochMilli());

    }
}
