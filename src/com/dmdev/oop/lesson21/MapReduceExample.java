package com.dmdev.oop.lesson21;

import java.util.Optional;
import java.util.stream.Stream;

import static java.lang.Integer.sum;

public class MapReduceExample {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        Optional<Student> maybeStudent  = Stream.of(
                        new Student(25, "Ivan"),
                        new Student(29, "Petr"),
                        new Student(45, "Sveta"),
                        new Student(85, "Daniil"),
                        new Student(23, "Mike"),
                        new Student(21, "Dima")
                )
//                .parallel()
                .flatMap(student -> Stream.of(student))
//                .map(Student::getAge)
//                .filter(student -> student.getAge() < 100)
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);
        maybeStudent. ifPresent(System.out::println);
        maybeStudent.map(Student::getAge)
                .flatMap(age-> Optional.of(age*2))
                .ifPresent(System.out::println);


    }

}
