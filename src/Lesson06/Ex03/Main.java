package Lesson06.Ex03;

public class Main {

    public static void main(String[] args) {

        Ex03Thread thread1 = new Ex03Thread("Поток #1");
        Ex03Thread thread2 = new Ex03Thread("Поток #2");
        Ex03Thread thread3 = new Ex03Thread("Поток #3");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Основной поток завершён!");
    }
}
