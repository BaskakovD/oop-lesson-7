package com.dmdev.oop.lesson9;

import com.dmdev.oop.lesson7.Computer;

public class StaticRunner {
    public static void main(String[] args) {
        Computer computer4 = new Computer(null, null);
        Computer computer2 = new Computer(null, null);
        Computer computer3 = new Computer(null, null);
        Computer computer1 = new Computer(null, null);
        Computer computer = new Computer(null, null);
        System.out.println(computer.getCounter());
        Class <? extends Computer> clazz = computer.getClass();
        Class<? extends Computer> clazz2 = computer2.getClass();
        System.out.println(clazz == clazz);
        System.out.println(computer1 == computer3);



    }


}
