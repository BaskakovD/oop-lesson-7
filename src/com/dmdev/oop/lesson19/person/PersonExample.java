package com.dmdev.oop.lesson19.person;

public class PersonExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Ivan", "Ivanov");
        Person pavel =  new Person(3, "Pavel", "Baskakov");
        Person sveta =  new Person(4, "Sveta", "Svetikova");

        System.out.println(ivan.hashCode());
        System.out.println(petr.hashCode());
        System.out.println(ivan.equals(petr));

    }
}
