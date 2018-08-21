package Lesson06.Ex02;

public class Main2 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Ex02Thread(), "Поток #2");
        Thread thread2 = new Thread(new Ex02Thread(), "Поток #3");
        Thread thread3 = new Thread(new Ex02Thread(), "Поток #4");

        System.out.println("Запускаем потоки :");

        thread1.start();
        thread2.start();
        thread3.start();

        /*
        while (!thread1.getState().equals(Thread.State.TERMINATED)) {

            System.out.println("Статус : " + thread2.getName() + " Состояние : " + thread2.getState());
        }
        */

        try {

            System.out.println(Thread.currentThread().getName() + " Состояние : " + Thread.currentThread().getState());

            thread1.join();
            System.out.println(thread1.getName() + " Cостояние : " + thread1.getState());

            thread2.join();
            System.out.println(thread2.getName() + " Состояние : " + thread2.getState());

            thread3.join();
            System.out.println(thread3.getName() + " Состояние : " + thread3.getState());

            System.out.println(Thread.currentThread().getName() + " Состояние : " + Thread.currentThread().getState());

        } catch (InterruptedException ie) {

            ie.printStackTrace();
        }

        System.out.println("Основной поток завершён!");

    }
}
