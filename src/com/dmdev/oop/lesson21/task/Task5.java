package com.dmdev.oop.lesson21.task;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

/**
 * Дан класс Person. Вывести полное имя человека, длина имени которого не превышает 15 символов.
 */
public class Task5 {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Sveta", "Svetikova", 30),
                new Person("Kate", "Ivanova", 25),
                new Person("Ivan", "Ivanov", 20),
                new Person("Arni", "Kutuzov1231456", 56));
        persons.stream()
                .filter(person -> person.getFullName().length() < 15  )
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);
        Map<Integer, List<String>> map = persons.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getFullName, toList())));
        System.out.println(map);
    };


}

