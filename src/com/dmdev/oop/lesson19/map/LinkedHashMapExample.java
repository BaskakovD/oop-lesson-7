package com.dmdev.oop.lesson19.map;

import com.dmdev.oop.lesson19.person.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
    Person ivan = new Person(1, "Ivan", "Ivanov");
    Person petr = new Person(21, "Petr", "Petrov");
    Person pavel = new Person(3, "Pavel", "Baskakov");
    Person sveta = new Person(4, "Sveta", "Svetikova");
    Person rimma = new Person(5, "Rimma", "Makarova");

        Map<Integer, Person> map = new LinkedHashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(pavel.getId(), pavel);
        map.put(sveta.getId(), sveta);
        map.put(rimma.getId(), rimma);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());

        }
}


}
