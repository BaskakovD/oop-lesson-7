package com.dmdev.oop.lesson11;

public class OtherMobile extends Computer {
    private int weight;
    public OtherMobile(Ssd ssd, Ram ram, int weight) {
        super (ssd, ram);
        this.weight = weight;
    }
    @Override
    public void load() {
        System.out.println("NewMobile тоже стал работать");

    }

    @Override
    public void print() {
        super.print();
    }
}
