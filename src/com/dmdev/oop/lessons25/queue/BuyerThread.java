package com.dmdev.oop.lessons25.queue;

import java.util.Queue;

public class BuyerThread  implements Runnable{
    private final Queue <Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
            try {
                synchronized (cashboxes) {
                while (true) {
                        if (!cashboxes.isEmpty()) {
                            Cashbox cashbox = cashboxes.remove();
                            System.out.println(Thread.currentThread().getName() + " Обслуживается в кассе " + cashbox);
                            cashbox.wait(5);

                            System.out.println(Thread.currentThread().getName() + " Освобождаю кассу " + cashbox);
                            cashboxes.add(cashbox);
                            cashbox.notify();
                            break;
                        } else {
                            System.out.println(Thread.currentThread().getName() + " Ожидаю свободную кассу ");
                            cashboxes.wait();
                        }
                    }
                }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                }
        }


