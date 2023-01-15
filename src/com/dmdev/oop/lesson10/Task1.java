package com.dmdev.oop.lesson10;
/** заменить в строке все грустные смайлы на веселые
**/



 public class Task1 {
    public static void main(String[] args) {
        String value = "Павлик (((((((((((((((((())(((  Отличник))";
        String result  =  replace(value);
        System.out.println(result);

    }

    public static String replace ( String value) {
        return  value.replace("а", "!!!!!!");
    }
}
