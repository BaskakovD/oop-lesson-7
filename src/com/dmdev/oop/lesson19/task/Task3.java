package com.dmdev.oop.lesson19.task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Написать программу, где каждому ключу должно соотвестствовать свое уникальное значение
 */
public class Task3 {
    public static void main(String[] args) {
//        HashMap<String, Object>  map = new HashMap<>();
//        map.put("Marty", "Stepp");
//        map.put("Stuart", "Reges");
//        map.put("Jessica", "Miller");
//        map.put("Amanda", "Camp");
//        map.put("Hell", "Parkins");

        Map<String, String> map = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hell", "Camp"
                                );
        System.out.println(isUnique(map));
   }
    public static boolean isUnique (Map <String, String> map) {
        return map.size () == new HashSet  <>(map.values()).size();


    }
}
