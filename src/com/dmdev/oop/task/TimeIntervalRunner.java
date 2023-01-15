package com.dmdev.oop.task;
/**
1. ������� �����, ����������� ���������� �������.
   ��� ���������� ������� ������ ���������� ����� ����������:
   ���������, �������� � ������.
   ������� ����� ��� ��������� ������� ���������� ������ � �������
   ������� ��� ������������: ������ ��������� ����� ����������
   ������, ������ - ����, ������ � ������� �� �����������.
   ������� ����� ��� ������ ������.
 */


public class TimeIntervalRunner {
    public static void main(String[] args) {
      TimeInterval timeInterval = new TimeInterval(30,2,0);
        System.out.println(timeInterval.totalSeconds());


        TimeInterval timeInterval2 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.print();

        TimeInterval sumIntervals = timeInterval.sum (timeInterval2 );
        sumIntervals.print();




    }
}
