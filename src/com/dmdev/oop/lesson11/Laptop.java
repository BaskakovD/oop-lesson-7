package com.dmdev.oop.lesson11;

public final class Laptop extends  Computer {
    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        // super(ssd, ram);// сможем опустить
        super (ssd, ram);
        this.weight = weight;
    }

    // метод надо реализовать, так как там он абстрактный, то есть мы метод переопределили
    @Override
    public void load() {
        System.out.println("Laptop загрузился");
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Weight равен:" +weight);;
    }
}


