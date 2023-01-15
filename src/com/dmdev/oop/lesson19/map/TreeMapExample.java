package com.dmdev.oop.lesson19.map;

import com.dmdev.oop.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Person pavel =  new Person(3, "Pavel", "Baskakov");
        Person sveta =  new Person(11, "Sveta", "Svetikova");
        Person rimma =  new Person(4, "Rimma", "Makarova");
        Person dima =  new Person(29, "Dimma", "Baskakov");
        Person daniil =  new Person(14, "Daniil", "Baskakov");

        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(pavel.getId(), pavel);
        map.put(sveta.getId(), sveta);
        map.put(rimma.getId(), rimma);
        map.put(dima.getId(), dima);
        map.put(daniil.getId(), daniil);
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
            
        }

    }
}
