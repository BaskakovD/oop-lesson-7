package com.dmdev.oop.lesson10;

import java.security.ProtectionDomain;

/**
 * �������� �������, ����������� ������ � ����� � ���������� true � ������, ���� ������
 * ���������� � ������������� ����  ������
 **/


public class Task2 {
    public static void main(String[] args) {
        String value = "������ ������ � ����� ������";
        String word = "������";
        System.out.println(isStartAndEnd(value, word));

    }

    public static boolean isStartAndEnd ( String target, String word) {
        return  target.startsWith(word) && target.endsWith(word);

    }
}
