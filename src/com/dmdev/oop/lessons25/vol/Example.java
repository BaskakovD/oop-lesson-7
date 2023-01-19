package com.dmdev.oop.lessons25.vol;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public List <Integer> list;
    public Example(List<Integer> list) {
        this.list = list;
    }
    // ����� �������� ����� synchronized
    public synchronized List<Integer> getList() {
        // ���������� ������ ����� ����
        return new ArrayList<>(list);
    }
}
