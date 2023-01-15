package com.dmdev.oop.lesson21.task;


import java.util.Map;

/**
 * ���� map <String, Integer>.����� ����� ���� ��������, ������ ������ ������� ������ 7 ��������
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "string1", 1,
                "strin2", 2,
                "string3", 3,
                "string4", 4,
                "strin5", 5,
                "strin6", 111
        );
        //�������� ������
        int result = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(result);


    }
}
