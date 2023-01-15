package com.dmdev.oop.lesson11;

import java.util.SortedMap;

public class Mobile extends Computer {

    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println("Mobile включился");

    }
    @Override
    public void print () {
        super.print();
        System.out.println("Mobile тоже открылся");


    }


}
