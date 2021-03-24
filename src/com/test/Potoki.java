package com.test;

public class Potoki extends Thread {



    @Override
    public void run() {
    //переопределение метода класса Thread
        for (int i = 0; i < 10; i++) {
            System.out.println("Поток № 1");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Potoki(), "potok1"); //создаем поток
        t.start(); //запускаем созданный поток1

        for (int i = 0; i < 10; i++) {
            System.out.println(t.isAlive()); //проверяем, жив ли еще поток1 ?
            Thread.sleep(4000);
        }
    }
}
