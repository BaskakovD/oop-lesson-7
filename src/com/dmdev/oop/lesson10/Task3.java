package com.dmdev.oop.lesson10;

/** Написать функцию, которая принимает фио, а возвращает  инициалы
 */
public class Task3 {
    public static void main(String[] args) {
        String firstname = "Римма";
        String patronymicname = "дмитриевич";
        String lastname = "баскаков";
        String result = format(firstname, patronymicname, lastname);
        System.out.println(result);
        String result1 = format1(firstname, patronymicname, lastname);
        System.out.println(result1);

    }

    public static String format(String firstname, String patronymicname, String lastname) {
        char firstNameChar = firstname.toUpperCase().charAt(0);
        char patronymicNameChar = patronymicname.toUpperCase().charAt(0);
        char lastNameNameChar = lastname.toUpperCase().charAt(0);
        return firstNameChar + "." + patronymicNameChar + "." + lastNameNameChar;

    }

    // применение через Character

    public static String format1(String firstname, String patronymicname, String lastname) {
        char firstNameChar = Character.toUpperCase(firstname.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicname.charAt(0));
        char lastNameNameChar = Character.toUpperCase(lastname.charAt(0));
        return firstNameChar+ "." + patronymicNameChar + "." + lastNameNameChar;

    }

}