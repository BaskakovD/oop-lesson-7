package com.dmdev.oop.lesson11;

public final class Laptop extends  Computer {
    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        // super(ssd, ram);// ������ ��������
        super (ssd, ram);
        this.weight = weight;
    }

    // ����� ���� �����������, ��� ��� ��� �� �����������, �� ���� �� ����� ��������������
    @Override
    public void load() {
        System.out.println("Laptop ����������");
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Weight �����:" +weight);;
    }
}


