package com.dmdev.oop.lesson10;
/** �������� � ������ ��� �������� ������ �� �������
**/



 public class Task1 {
    public static void main(String[] args) {
        String value = "������ (((((((((((((((((())(((  ��������))";
        String result  =  replace(value);
        System.out.println(result);

    }

    public static String replace ( String value) {
        return  value.replace("�", "!!!!!!");
    }
}
