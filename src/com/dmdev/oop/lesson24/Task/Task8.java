package com.dmdev.oop.lesson24.Task;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * �������� ���������� ���������� TemporalAdjuster, ������� �� ����������
 * � ���� 42 ���.
 */
public class Task8 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTimeNew = now.plusDays(42);
        System.out.println(localDateTimeNew);
        LocalDateTime localDateTimePlus = now.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));
        System.out.println(localDateTimePlus);


    }
}
