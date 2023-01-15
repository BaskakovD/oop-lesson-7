package com.dmdev.oop.lesson11;

import java.util.SortedMap;

// ������ �������������, ��� ������� �����
public abstract class Computer implements Printable {
    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        super ();
        this.ssd = ssd;
        this.ram = ram;
    }
    public abstract void load ();
    @Override

    public void print () {
        System.out.println("Ssd: " + ssd.getValue() + "Ram: " + ram.getValue());
    }
    public void open()
    {
        System.out.println("� ������ ������");
    }
    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
