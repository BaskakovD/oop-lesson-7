package com.dmdev.oop.lesson10;

import java.util.Arrays;

/**
 * написать программу, которая разбивает строку на n частей и выводит это в массив
 */
public class Task5 {
    public static void main(String[] args) {
        String value  = "66655421215151552120vdscs";
        int n  = 4;
        String [] result = split (value, n);
        System.out.println(Arrays.toString(result));


    }
    public static String [] split(String value, int n) {
        int arraySize = (int) Math.ceil(value.length() / (double)n);
        String [] result = new String[arraySize];
        int counter = 0;
        for (int i = 0; i <value.length() ; i+=n) {
            int endIndex = Math.min(value.length(), i + n);
            String substring = value.substring(i, endIndex);
            result [counter] = substring;
            counter++;

        }
        return result;


    }
}
