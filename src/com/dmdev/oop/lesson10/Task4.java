package com.dmdev.oop.lesson10;

/**
 * написать программу, которая считает количество точек, запятых и восклицательных знаков в строке
 */
public class Task4 {
    public static void main(String[] args) {
        String value =  "asdf , ...,,,,,. mmmm,, !!!!????";
        System.out.println(countSymbols(value));




    }
    public static int countSymbols ( String value) {
        String result = value.replace(".", "")
                .replace ("!","")
                .replace(",", "")
                .replace("?","");
        return value.length()-result.length();
    }
}