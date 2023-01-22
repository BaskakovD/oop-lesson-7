package com.dmdev.oop.mywork1;
import javax.swing.*;

public class SomeClass {
    interface  Callback {
        void callingBack();
    }
    Callback callback;
    public void registerCallBack (Callback callback) {
        this.callback = callback;
    }

    void doSomething() {
        System.out.println("Выполняется работа");
        JOptionPane.showMessageDialog(null, "Выполняется работа");
        callback.callingBack();
    }

}
