package com.dmdev.oop.lesson24.Task;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * создать объект Instant. Вывести его на консоль. Затем создать объект ZoneDateTime на основании предыдущего объекта
 * и вывести его на консоль с тайм-зоной "Africa/Cairo".
 */

public class Task7 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime);



    }

}
