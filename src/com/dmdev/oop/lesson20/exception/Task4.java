package com.dmdev.oop.lesson20.exception;

/**
 * ������� ���� �� ������������ jdk ����������, �������� ��� � ��������� �����������, ����� � �������� �������
 * �����������
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
            // ������������ �����
            throw new DmdevException(exception);
        }
    }


    public static void unsafe () {
        throw  new RuntimeException("Ooops");
    }
}
