package com.dmdev.oop.lesson20.exception;

import javax.sound.midi.SoundbankResource;

/**
 * написать код, который создаст и потом отловит ArrayIndexOutBoundsException
 */

public class Task2 {
    public static void main(String[] args) {
        int [] values  = { 1, 2, 3 ,4 ,5};
        try {
            for (int i = 0; i <= values.length; i++) {
                System.out.println(values[i]);
            }
        } catch ( ArrayIndexOutOfBoundsException exception) {
            System.err.println("catch");
            exception.printStackTrace();
        }
        System.err.println("end");

    }
}
