package com.dmdev.oop.lesson24.Task;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * ������� ������ Instant. ������� ��� �� �������. ����� ������� ������ ZoneDateTime �� ��������� ����������� �������
 * � ������� ��� �� ������� � ����-����� "Africa/Cairo".
 */

public class Task7 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime);



    }

}
