package com.dmdev.oop.lesson19.person;

import java.util.Objects;

public class Person implements Comparable <Person> {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int id;
    private String firstName;
    private String lastName;


    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(id, o.id);


/*        if (id == o.id) {
            return 0;
        } else if (id > 0) {
            return 1;
        } else {return -1;
        }*/

    }
}
