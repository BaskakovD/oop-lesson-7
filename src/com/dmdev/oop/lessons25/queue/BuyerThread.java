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
                while (true) {
                    if (!cashboxes.isEmpty()) {
                        Cashbox cashbox = cashboxes.remove();
                        System.out.println(Thread.currentThread().getName() + "������������� � �����" + cashbox);
                        Thread.sleep(5);

                        System.out.println(Thread.currentThread().getName() + "���������� �����" + cashbox);
                        cashboxes.add(cashbox);
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + "������� ��������� �����");
                        Thread.sleep(5);
                    }
                }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                }
        }


