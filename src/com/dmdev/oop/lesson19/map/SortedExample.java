package com.dmdev.oop.lesson19.map;

import com.dmdev.oop.lesson19.person.Person;

import java.util.*;

public class SortedExample {

    public static void main(String[] args) {

/*        List<String> strings = Arrays.asList("123", "345", "14", "678");
        Collections.sort (strings);
        System.out.println(strings);
        for (String item : strings) {
            System.out.println(item);

        }*/

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(29, "Petr", "Petrov"),
                new Person(4, "Maria", "Marieva"));
        Collections.sort(personList);
        System.out.println(personList);

        Collections.sort(personList, new FirstNameComparator());
        System.out.println(personList);
        personList.sort (new FirstNameComparator());
        System.out.println(personList);
        personList.sort (Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
        System.out.println(personList);
    }

    public static class FirstNameComparator implements Comparator <Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
