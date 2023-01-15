package com.dmdev.oop.lesson10;

import javax.sound.midi.Soundbank;

public class Task6 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String value = "";
        for (int i = 0; i <1000000 ; i++) {
            value+=i;
        }
        long endTime =  System.currentTimeMillis();
        System.out.println("Time: " + (endTime- startTime));
        System.out.println(value);
    }
}
