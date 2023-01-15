package com.dmdev.oop.lesson20.exception;

/**
 * ������� ����������� �����-���������� ��� ��������� Exception. ������� �����, ������� �������� ������ ����������.
 */

public class Task3 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (DmdevException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
                   }
    }
    public static void unsafe () throws DmdevException {
        throw new DmdevException(new RuntimeException( "runtime exception"));
    }
}
