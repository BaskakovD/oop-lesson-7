package com.dmdev.oop.lesson24.Task;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * ������� ������ localDateTime. ����� ������� ������ ������ ����� 3
 * ������. ������� �� ������� LocalDate � LocalTime.
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



        // ��������� �������������� �������
//        LocalDateTime localDateTime = LocalDateTime.of(2020, 1, 6, 17, 20, 55);
//        //���������� 3 �������
//        LocalDateTime plus = localDateTime.plusDays(90);
//        // ��������� LocalDate
//        System.out.println(localDateTime.toLocalDate());
//        // ��������� LocalTime
//        System.out.println(localDateTime.toLocalTime());


    }
}
