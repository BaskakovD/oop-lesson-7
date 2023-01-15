package com.dmdev.oop.lesson19.map;

import com.dmdev.oop.lesson19.person.Person;

import javax.sound.midi.SoundbankResource;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Person pavel =  new Person(3, "Pavel", "Baskakov");
        Person sveta =  new Person(4, "Sveta", "Svetikova");
        Person rimma =  new Person(4, "Rimma", "Makarova");

        Map <Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(pavel.getId(), pavel);
        map.put(sveta.getId(), sveta);
        map.put(rimma.getId(), rimma);
/*
//        System.out.println(map.get(2));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for (Person person:map.values()) {
            System.out.println(person.getFirstName());

        }
        for (Person person:map.values()) {
            System.out.println(person.getLastName());

        }*/

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ "=" + entry.getValue());

        }

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue(pavel));
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        System.out.println();
    }
}
