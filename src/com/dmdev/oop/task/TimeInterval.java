package com.dmdev.oop.task;

public class TimeInterval {
    private static final int SECONDS_IT_MINUTE = 60;
    private static final int MINUTES_IN_HOUR = 60;

    private int seconds;
    private int minutes;
    public int hours;

    public TimeInterval (int totalSeconds) {
        //3750
        this.hours = totalSeconds/3600;
        this.minutes = totalSeconds%3600/60;
        this.seconds = totalSeconds%3600%60;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeInterval sum (TimeInterval second) {
        return new TimeInterval(this.totalSeconds() +second.totalSeconds());
    }

    public int totalSeconds () {
        return seconds + SECONDS_IT_MINUTE*minutes + SECONDS_IT_MINUTE*MINUTES_IN_HOUR;

    }
    public void print () {
        System.out.println("hours: " + hours + "  minutes: " + minutes + "  seconds: " + seconds  );
    }
}
