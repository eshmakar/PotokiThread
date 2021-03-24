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
//isDaemon() - проверка того, запущен ли поток в режиме демона
//isInterrupted() - проверка, был ли поток прерван
//join() - ожидание завершения работы потока. Это ожидание можно прервать с помощью interrupt()
//notify() - при вызове, поток который находится в состоянии ожидания переходит в режим выполнения
//setDaemon() - установливает потоку статус демона
//setName(), setPriority - установка имени и приоритета
//wait() - переводит поток в режим ожидания для получения доступа к ресурсу
//yield() - сообщает диспетчеру потоков, что текущий поток готов уступить нагрузку процессора в пользу других процессов
