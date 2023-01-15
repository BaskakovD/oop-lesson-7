package com.dmdev.oop.lesson20.exception;

/**
 * Бросить одно из существующих jdk исключений, отловить его и выбросить собственное, указа в качестве причины
 * отловленное
 */
public class Task4 {
    public static void main(String[] args) throws DmdevException {
        try {
            catchCustomException();
        } catch (DmdevException exception) {
            System.out.println("Catched in main");
        }
    }

    public static void catchCustomException () throws DmdevException {
        try {
            unsafe();
        } catch (RuntimeException exception) {
            System.out.println("Catch int catchCustomException");
            // пробрасываем далее
            throw new DmdevException(exception);
        }
    }


    public static void unsafe () {
        throw  new RuntimeException("Ooops");
    }
}
