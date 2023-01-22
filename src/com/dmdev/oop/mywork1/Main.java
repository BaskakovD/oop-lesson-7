package com.dmdev.oop.mywork1;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        MyClass myclass = new MyClass();
        someClass.registerCallBack(myclass);
        someClass.doSomething();
    }
}
