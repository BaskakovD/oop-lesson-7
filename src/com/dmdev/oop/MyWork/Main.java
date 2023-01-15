package com.dmdev.oop.MyWork;

import javax.sound.midi.SoundbankResource;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        MyClass myclass = new MyClass();
        someClass.registerCallBack(myclass);
        someClass.doSomething();
    }
}
