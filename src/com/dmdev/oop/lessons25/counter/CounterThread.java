package com.dmdev.oop.lessons25.counter;

/**
 * —оздать класс CounterThread с одним полем и конструктором дл€ инициализации:
 * private Counter counter. ¬ методе run этого класса сто раз вызвать метол couner. increment()
 */

public class CounterThread extends Thread  {
    //ссылки по умолчанию равны null и поэтому их надо инициализировать
    private final Counter counter;
    public CounterThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i <300 ; i++) {
            counter.increment();
        }
    }
}
