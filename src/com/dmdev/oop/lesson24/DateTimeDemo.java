package com.dmdev.oop.lesson24;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        //абсолютное время
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        // количество миллисекунд с 1970 года
        long l = now.toInstant().toEpochMilli();
        System.out.println(l);
        // добавление количества дней, минут или секунд. Можем и отнимать.
        ZonedDateTime zonedDateTime = now.plusDays(2);
        System.out.println(zonedDateTime);
        // обнуление времени
        ZonedDateTime zonedDateTime1 = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(zonedDateTime1);
        // получение дня месяца
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
        // время на нулевом меридиане
        LocalDateTime localDateTime =LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(localDateTime);



    }
}
