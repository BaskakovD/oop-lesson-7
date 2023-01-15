package com.dmdev.oop.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> sourceList = List.of (1, 2, 3, 4, 5, 6);
        List<Integer> list = new ArrayList<>(sourceList);

        for (Integer integer : list){
            System.out.println(integer);
        }

        for (Integer integer : list){
            System.out.println(integer);
        }

    }


}
