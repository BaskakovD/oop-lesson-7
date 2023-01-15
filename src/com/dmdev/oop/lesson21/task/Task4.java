package com.dmdev.oop.lesson21.task;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ��� ������ ����� ����, ������� ������, ������� ������������ ������������ ��������� ������������� ������ �����.
 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 1111);
        String result = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
        System.out.println(result);
    }
}
