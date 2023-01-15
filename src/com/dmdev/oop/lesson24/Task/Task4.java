package com.dmdev.oop.lesson24.Task;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * ������������ LocalDateTime �� Task 3. ������������� ��� � ������ ���� instant, ������ ���� ���� America/Chicago.
 * ������� ���������� ���������  �����������.
 */
public class Task4 {
    public static void main(String[] args) {
        String formattedDate = "26-03-1968T09:24";
        // ������� ����������
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        // �������� ������� ������� � LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(formattedDate, formatter);
        System.out.println(localDateTime);

        Instant instant = localDateTime.toInstant((ZoneId.of("America/Chicago").getRules().getOffset(localDateTime)));

        System.out.println(instant);
        // ����� � �������������
        System.out.println(instant.toEpochMilli());

    }
}
