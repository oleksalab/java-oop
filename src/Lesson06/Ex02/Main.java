package Lesson06.Ex02;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Ex02Thread(), "Поток #2");
        Thread thread2 = new Thread(new Ex02Thread(), "Поток #3");
        Thread thread3 = new Thread(new Ex02Thread(), "Поток #4");

        System.out.println("Запускаем потоки :");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Основной поток завершён!");
    }
}
