package com.dmdev.oop.lesson24;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        //���������� �����
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        // ���������� ����������� � 1970 ����
        long l = now.toInstant().toEpochMilli();
        System.out.println(l);
        // ���������� ���������� ����, ����� ��� ������. ����� � ��������.
        ZonedDateTime zonedDateTime = now.plusDays(2);
        System.out.println(zonedDateTime);
        // ��������� �������
        ZonedDateTime zonedDateTime1 = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(zonedDateTime1);
        // ��������� ��� ������
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
        // ����� �� ������� ���������
        LocalDateTime localDateTime =LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(localDateTime);



    }
}
