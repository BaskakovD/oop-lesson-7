package com.dmdev.oop.lesson24.Task;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * ���� 2 ������� LocalDate �� ����������� �������. ��������� ���������� ������ �����
 * ��������� ������ ���� � ��������� ������ ����.
 */
public class Task6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);
        LocalDateTime localDateNow = now.atStartOfDay();
        LocalDateTime localDateTimePrevDate = prevDate.atStartOfDay();
        Duration between = Duration.between(localDateTimePrevDate, localDateNow);
        System.out.println(between.getSeconds());
        
        // 2 ������
        LocalDateTime localDateTimeNow = LocalDateTime.of(now, LocalTime.MIDNIGHT);
        LocalDateTime localTimePrevDate = LocalDateTime.of(prevDate, LocalTime.MIDNIGHT);
        Duration between1 = Duration.between(localDateTimeNow, localTimePrevDate);
        System.out.println(between1.getSeconds());



    }
}
